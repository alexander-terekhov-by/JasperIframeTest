package com.test.jasperiframetest.service;


import com.test.jasperiframetest.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserService() {
    }

    public User getByLogin(String login) {
        return new User("test", "123456");
    }

}
