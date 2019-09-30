package com.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class UserServiceApplication {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		System.out.println(name+" welcome . My is microservice provider user");
		return name+" welcome . My is microservice provider user";
	}
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}


}
