package com.shaonian.apiinterface;

import com.shaonian.apiclientsdk.client.ApiClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Autowired
    private ApiClient apiClient;

    @Test
    void contextLoads() {
        Random random = new Random();
        int id = random.nextInt(1000);
        System.out.println(id);
    }

}
