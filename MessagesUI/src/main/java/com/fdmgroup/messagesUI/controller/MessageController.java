package com.fdmgroup.messagesUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fdmgroup.messagesUI.service.MessageService;

@Controller
public class MessageController {

	private MessageService messageService;

	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	@GetMapping("/")
	public String toIndex(Model model) {
		model.addAttribute("message", messageService.getMessage());
		return "index";
	}
}
