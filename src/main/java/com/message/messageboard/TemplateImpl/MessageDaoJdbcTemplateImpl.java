package com.message.messageboard.TemplateImpl;

import com.message.messageboard.dao.MessageDao;
import com.message.messageboard.service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class MessageDaoJdbcTemplateImpl implements MessageDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Long interfaceMessage(Message message) {
        String sql = "insert into tb_article(title,summary,user_id,create_time,public_time,update_time,status) " +
                "values(:title,:summary,:userId,:createTime,:publicTime,:updateTime,:status)";
        Map<String, Object> param = new HashMap<>();
        param.put("user", message.getTitle());
        param.put("phone", message.getSummary());
        param.put("email", message.getUserId());
        param.put("message", message.getPublicTime());
        param.put("createTime", message.getCreateTime());
        return (long) jdbcTemplate.update(sql, param);
    }
}
