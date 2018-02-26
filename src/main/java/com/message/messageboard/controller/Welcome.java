package com.message.messageboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping(value = "/say")
    private String say(){
        return "Hello World~";
    }
}
