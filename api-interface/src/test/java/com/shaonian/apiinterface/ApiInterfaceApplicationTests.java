package com.shaonian.apiinterface;

import com.shaonian.apiclientsdk.client.ApiClient;
import com.shaonian.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Autowired
    private ApiClient apiClient;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("shaonian");
        apiClient.setUrl("http://localhost:8123/api/name/user");
        apiClient.getUsernameByPost(user);
    }

}
