package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.java.repository")
@EntityScan(basePackages="com.java.dto")
@EnableHystrix
public class Client {
public static void main(String[] args) {
	SpringApplication.run(Client.class, args);
}

@Bean
public RestTemplate template() {
	return new RestTemplate();
}
}
