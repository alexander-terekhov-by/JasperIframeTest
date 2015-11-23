package com.test.jasperiframetest.service;


import com.test.jasperiframetest.dao.UserDao;
import com.test.jasperiframetest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User getByLogin(String login) {
        return userDao.getByLogin(login);
    }
}
