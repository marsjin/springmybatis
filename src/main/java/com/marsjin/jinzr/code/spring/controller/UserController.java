package com.marsjin.jinzr.code.spring.controller;

import com.marsjin.jinzr.code.spring.domain.User;
import com.marsjin.jinzr.code.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by jinzongrui on 2017/11/26
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        User user = userService.selectUserById(2);
        mav.addObject("user", user);
        return mav;
    }
}