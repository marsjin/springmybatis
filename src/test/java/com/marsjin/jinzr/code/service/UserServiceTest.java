package com.marsjin.jinzr.code.service;

import com.marsjin.jinzr.code.spring.baseTest.SpringTestCase;
import com.marsjin.jinzr.code.spring.domain.User;
import com.marsjin.jinzr.code.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jinzongrui on 2017/11/26
 */
public class UserServiceTest extends SpringTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(1);
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }
}