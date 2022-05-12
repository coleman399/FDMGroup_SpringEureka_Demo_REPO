package com.fdmgroup.spring_eureka_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaDemoApplication.class, args);
	}
	
}
