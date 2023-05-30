package com.shaonian.apibackend.controller;

import com.shaonian.apibackend.common.ErrorCode;
import com.shaonian.apibackend.exception.BusinessException;
import com.shaonian.apibackend.service.UserService;
import com.shaonian.apicommon.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @Autowired
    private UserService userService;

//    private static final String SDK_HELP_ADDRESS = "/root/api-project/api-client-sdk.zip";
    private static final String SDK_HELP_ADDRESS = "D:\\BaiduNetdiskWorkspace\\code\\ideacode\\springcloudcode\\api-project\\api-client-sdk\\target\\api-client-sdk.zip";


    @GetMapping("/getSDK")
    public  ResponseEntity<Resource> getSDK(HttpServletRequest request) throws IOException {
        if (request == null) {
            throw new BusinessException(ErrorCode.FORBIDDEN_ERROR);
        }
        User loginUser = userService.getLoginUser(request);
        if (loginUser == null || loginUser.getId() == null) {
            throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR);
        }

        //获取要下载的文件
        File file = new File(SDK_HELP_ADDRESS);
        InputStream is = Files.newInputStream(file.toPath());
        //获取文件输入流
        //创建资源对象,将输入流加载其中
        InputStreamResource resource = new InputStreamResource(is);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment; filename=%s", file.getName()));
//        headers.add("Content-Type","application/octet-stream");
        //返回文件下载响应
        return ResponseEntity.ok().headers(headers).contentLength(file.length()).body(resource);
    }
}
