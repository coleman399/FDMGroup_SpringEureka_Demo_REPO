package com.fdmgroup.messagesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessagesApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(MessagesApi1Application.class, args);
	}

}
