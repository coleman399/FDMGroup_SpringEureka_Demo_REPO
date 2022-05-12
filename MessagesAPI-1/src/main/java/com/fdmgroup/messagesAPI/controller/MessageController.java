package com.fdmgroup.messagesAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {

	@GetMapping
	public String getMessage() {
		return "API-1 Message";
	}
	
}
