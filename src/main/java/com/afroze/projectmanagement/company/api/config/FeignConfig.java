//package com.afroze.projectmanagement.company.api.config;
//
//import feign.Logger;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
//@Configuration
//@EnableFeignClients
//public class FeignConfig {
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }
//
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }
//}
