package com.senlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceConsumerMovieRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieRibbonApplication.class, args);
    }

    /**
     * @LoadBalanced 请求服务负载均衡
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

