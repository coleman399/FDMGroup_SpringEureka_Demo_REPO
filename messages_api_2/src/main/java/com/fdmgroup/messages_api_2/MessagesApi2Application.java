package com.fdmgroup.messages_api_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessagesApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(MessagesApi2Application.class, args);
	}

}
