package com.fdmgroup.messagesUI.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("message-service")
public interface MessageClient {
	
	String getMessage();
}
