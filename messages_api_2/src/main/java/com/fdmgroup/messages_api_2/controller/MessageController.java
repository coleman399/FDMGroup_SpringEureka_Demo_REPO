package com.fdmgroup.messages_api_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {
    @GetMapping
    public String getMessage() {
        return "API-2 Message";
    }
}
