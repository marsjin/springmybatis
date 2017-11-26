package com.marsjin.jinzr.code.spring.service.impl;

import com.marsjin.jinzr.code.spring.service.UserService;
import com.marsjin.jinzr.code.spring.dao.UserDao;
import com.marsjin.jinzr.code.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jinzongrui on 2017/11/26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);

    }
}

