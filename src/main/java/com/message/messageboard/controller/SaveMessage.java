package com.message.messageboard.controller;

import com.message.messageboard.dto.WebResponse;
import com.message.messageboard.service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;


@RestController
public class SaveMessage {

//    @Autowired
//    private Message message;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Boolean save(@Param("user") String user, @Param("email") String email, @Param("phone") String phone, @Param("message") String message){
        
        return true;
    }

//    @RequestMapping(value = "/save/all", method = RequestMethod.GET)
//    public WebRequest<?> listMessage(@Param("pageSize") Integer pageSize, @Param("pageNum") Integer pageNum){
//        if (pageSize == null) {
//            pageSize = 10;
//        }
//        if (pageNum == null) {
//            pageNum = 1;
//        }
//        int offset = (pageNum - 1) * pageSize;
//        List<Article> articles =  message.getArticles(offset, pageSize);
//        return WebResponse.getSuccessResponse(articles);
//    }
}
