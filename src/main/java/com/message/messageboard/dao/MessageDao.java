package com.message.messageboard.dao;

import com.message.messageboard.bean.Message;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

@Transactional
@Repository
public interface MessageDao extends CrudRepository<Message, Integer> {

    Message findByEmail(String email); // 根据email查询

    List<Message> findByUser(String user); // 根据用户查询

    List<Message> findByUserAndEmail(String user, String email); // 根据用户名 邮箱查询

    List<Message> findByUserAndEmailOrderByIdDesc(String user, String email); // 根据用户名 邮箱查询并且倒序

    List<Message> findTop2ByUserAndAndEmailOrderByIdDesc(String user, String email); //根据用户名邮箱查两条 倒序

    List<Message> findByEmail(String email, Pageable pageable); // 根据用户名he 邮箱查询
}
