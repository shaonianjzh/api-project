package com.shaonian.apiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.shaonian.apiclientsdk.annotation.CheckIdentity;
import com.shaonian.apiclientsdk.model.User;
import com.shaonian.apicommon.model.entity.LoveWords;
import com.shaonian.apiinterface.service.LoveWordsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 少年
 */
@RestController
@RequestMapping("/")
public class NameController {


    @Resource
    private LoveWordsService loveWordsService;

    @CheckIdentity
    @GetMapping("/getNameByGet")
    public String getNameByGet(String name, HttpServletRequest request, HttpServletResponse response){
        String key = request.getHeader("key");
        return "GET 你的名字是"+name;
    }

    @PostMapping("/getNameByPost")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是"+name;
    }

    @PostMapping("/getUsernameByPost")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
        return "POST 用户的名字是"+user.getUsername();
    }

    @GetMapping("/getGirl")
    public String getGirl(){
        HttpResponse execute = HttpRequest
                .get("https://v.api.aa1.cn/api/api-girl-11-02/index.php?type=json")
                .execute();
        System.out.println("getGril");
        return execute.body();
    }

    @GetMapping("/getChickenSoup")
    public String getChickenSoup(){
        HttpResponse execute = HttpRequest.get("https://v.api.aa1.cn/api/api-wenan-dujitang/index.php?aa1=json").execute();
        System.out.println("getChickenSoup");
        return execute.body();
    }

    @GetMapping("/getLoveWords")
    public LoveWords getLoveWords(){
        return loveWordsService.getLoveWordsRandom();
    }

    @GetMapping("/getRandomPassword")
    public String getRandomPassword(@RequestParam Integer length){
        String body = HttpRequest.get("https://v.api.aa1.cn/api/api-mima/mima.php")
                .form("msg",length)
                .execute().body();
        return body;
    }


    @GetMapping("/getZodiacSign")
    public String getZodiacSign(@RequestParam String age){
        String body = HttpRequest.get("https://zj.v.api.aa1.cn/api/Age-calculation/")
                .form("birthday",age)
                .execute().body();
        return body;
    }

}
