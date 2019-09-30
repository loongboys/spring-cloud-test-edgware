package com.id.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动EnableEureka客户端
public class IDServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IDServiceApplication.class, args);
	}

}
