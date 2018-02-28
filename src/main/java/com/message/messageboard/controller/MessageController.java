package com.message.messageboard.controller;

import com.message.messageboard.bean.Message;
import com.message.messageboard.dao.MessageDao;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private MessageDao messageDao;

    @RequestMapping(value = "/emailMessage", method = RequestMethod.GET)
    public Object getMessageByEmail(String email){
        Message message = messageDao.findByEmail(email);
        return message;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Object getMessageAll(){
        List<Message> message = (List<Message>) messageDao.findAll();
        return message;
    }

    @RequestMapping(value = "/addMessage")
    public Object saveMessage(String user,String email, String phone, String message){

        Message tempMessage = new Message();
        int createTime = (int) (System.currentTimeMillis() / 1000);

        tempMessage.setUser(user);
        tempMessage.setEmail(email);
        tempMessage.setPhone(phone);
        tempMessage.setMessage(message);
        tempMessage.setCreateTime(createTime);
        Message result = messageDao.save(tempMessage);
        if(result == null){
            return "{'status':0,'msg':'添加失败'}";
        } else {
            return "{'status':1,'msg':''}";
        }
    }
}
