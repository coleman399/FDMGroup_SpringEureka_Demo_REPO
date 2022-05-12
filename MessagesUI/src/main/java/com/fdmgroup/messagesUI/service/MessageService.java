package com.fdmgroup.messagesUI.service;

import org.springframework.stereotype.Service;

import com.fdmgroup.messagesUI.client.MessageClient;

@Service
public class MessageService {

	private MessageClient messageClient;

	public MessageService(MessageClient messageClient) {
		super();
		this.messageClient = messageClient;
	}

	public String getMessage() {
		return messageClient.getMessage();
	}

}
