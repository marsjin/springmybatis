package com.marsjin.jinzr.code.spring.service;

import com.marsjin.jinzr.code.spring.domain.User;

/**
 * Created by jinzongrui on 2017/11/26
 */
public interface UserService {
    User selectUserById(Integer userId);
}