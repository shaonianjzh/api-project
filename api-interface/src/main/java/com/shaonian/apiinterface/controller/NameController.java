package com.shaonian.apiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.shaonian.apiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class NameController {

    @GetMapping("/getNameByGet")
    public String getNameByGet(String name ){
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
}
