package com.fdmgroup.messagesUI.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

// @Service
public class MessageClientWebClient implements MessageClient {

	private static final String MSG_URI_EXT = "/api/v1/message";
	private WebClient webClient;

	public MessageClientWebClient(WebClient webClient) {
		super();
		this.webClient = webClient;
	}

	@Override
	public String getMessage() {
		return webClient.get().uri(MSG_URI_EXT)
				.retrieve().bodyToMono(String.class).block();
	}

}
