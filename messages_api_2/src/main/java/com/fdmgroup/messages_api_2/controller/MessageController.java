package com.fdmgroup.messages_api_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping
    public String getMessage() {
        return "Message API -2";
    }
}
