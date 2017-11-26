package com.marsjin.jinzr.code.spring.dao;

import com.marsjin.jinzr.code.spring.domain.User;

/**
 * Created by jinzongrui on 2017/11/26
 */
public interface UserDao {

    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);

}