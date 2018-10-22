package com.cn.sinosoft.workflow.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient //引入eureka客户端
@EnableDiscoveryClient//引入ribbon负载均衡
@SpringBootApplication
public class TemplateApplication {

    //ribbon需要该配置项启动
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //启动方法
    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }
}
