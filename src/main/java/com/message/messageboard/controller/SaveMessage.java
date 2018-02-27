package com.message.messageboard.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveMessage {
    @RequestMapping(value = "/save")
    public Boolean save(@Param("user") String user, @Param("email") String email, @Param("phone") String phone, @Param("message") String message){
        
        return true;
    }
}
