package com.shaonian.apibackend.provider;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService{

    @Override
    public void sayHello() {
        System.out.println("<==================================Hello Dubbo========================================>");
    }

}
