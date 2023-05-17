package com.shaonian.apigateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * @author 少年
 */
@Configuration
public class RateLimitConfig {


    /**
     * 根据path限流
     * @return
     */
    @Bean
    @Primary
    public KeyResolver pathKeyResolver() {
        return exchange -> {
//            System.out.println(exchange.getRequest().getPath());
            return Mono.just(exchange.getRequest().getPath().toString());
        };
    }

    /**
     * 根据ip限流
     * @return
     */
    @Bean
    public KeyResolver ipKeyResolver(){
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).toString());
    }

    /**
     * 根据accessKey限流
     * @return
     */
    @Bean
    public KeyResolver userKeyResolver(){
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getHeaders().getFirst("accessKey")));
    }
}
