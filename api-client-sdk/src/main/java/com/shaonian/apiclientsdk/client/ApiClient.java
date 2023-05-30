package com.shaonian.apiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.shaonian.apiclientsdk.util.SignUtils;
import com.shaonian.apiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;



/**
 * 调用第三方的接口的客户端
 * @author 少年
 */
@Data
@NoArgsConstructor
public class ApiClient {

    private String accessKey;

    private String secretKey;

    private String url;

    public ApiClient(String accessKey, String secretKey, String url) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.url = url;
    }

    public String getNameByGet(String name) {
        String result = HttpRequest
                .get(url+"?name="+name)
                .addHeaders(getHashMap(name))
                .execute().body();
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name) {
        String result = HttpRequest
                .post(url+"?name="+name)
                .addHeaders(getHashMap(name))
                .execute().body();
        System.out.println(result);
        return result;
    }

    private Map<String,String> getHashMap(String body){
        HashMap<String,String> map = new HashMap<>();
        String timestamp = String.valueOf(System.currentTimeMillis()/ 1000);
        String nonce = RandomUtil.randomNumbers(5);
        map.put("accessKey",accessKey);
        //secretKey一定不能发送给后端
//        map.put("secretKey",secretkey);
        map.put("nonce",nonce);
        map.put("body",body);
        map.put("timestamp",timestamp);
        map.put("sign", SignUtils.getSign(body+nonce+timestamp,secretKey));
        return map;
    }

    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse res = HttpRequest.post(url)
                .addHeaders(getHashMap(json))
                .body(json)
                .execute();
        System.out.println(res.body());
        System.out.println(res);
        return res.body();
    }

    public String getGirl(){
        return HttpRequest.get(url)
                .addHeaders(getHashMap(""))
                .execute().body();
    }

    public String getChickenSoup(){
        return HttpRequest.get(url)
                .addHeaders(getHashMap(""))
                .execute().body();
    }

    public String getLoveWords(){
        return HttpRequest.get(url)
                .addHeaders(getHashMap(""))
                .execute().body();
    }

    public String getRandomPassword(Integer length){
        return HttpRequest.get(url)
                .form("length",length)
                .addHeaders(getHashMap(String.valueOf(length)))
                .execute().body();
    }

    public String getZodiacSign(String age){
        return HttpRequest.get(url)
                .form("age",age)
                .addHeaders(getHashMap(age))
                .execute().body();
    }
}

