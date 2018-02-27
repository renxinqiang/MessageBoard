/**
 * 欢迎页面
 */
package com.message.messageboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping(value = "/say" , method = RequestMethod.GET)
    private String sayHello()  {
        String json = "{'Hello':'World'}";
        return json;
    }
}
