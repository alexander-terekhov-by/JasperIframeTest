package com.test.jasperiframetest.dao;

import com.test.jasperiframetest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
    Map<String, User> users;
    {
        users = new HashMap<String, User>();
        users.put("test", new User("test", "qwerty"));
        users.put("user", new User("user", "123456"));
        users.put("teran", new User("teran", "teran"));
    }

    public User getByLogin(String login){
       return users.get(login);
    }
}
