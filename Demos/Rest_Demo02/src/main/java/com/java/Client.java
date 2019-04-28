package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.java.repository")
@EntityScan(basePackages="com.java.dto")
@EnableTransactionManagement(proxyTargetClass=false)
public class Client {
public static void main(String[] args) {
	SpringApplication.run(Client.class, args);
}
}
