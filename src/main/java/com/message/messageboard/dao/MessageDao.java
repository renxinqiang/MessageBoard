package com.message.messageboard.dao;


import com.message.messageboard.service.Message;
import org.springframework.stereotype.Repository;

public interface MessageDao {
    Long insertArticle(Message message);

    Long interfaceMessage(Message message);
}