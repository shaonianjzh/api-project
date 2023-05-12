package com.shaonian.apiclientsdk;

import com.shaonian.apiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Data
@Configuration
@ConfigurationProperties("api.client")
public class ApiClientSdkApplication {

    private String accessKye;

    private String secretKey;

    private String url;

    @Bean
    public ApiClient apiClient(){
        return new ApiClient(url,accessKye,secretKey);
    }

}
