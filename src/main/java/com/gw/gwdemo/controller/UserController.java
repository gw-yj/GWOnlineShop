package com.gw.gwdemo.controller;


import com.gw.gwdemo.dao.User;
import com.gw.gwdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userS;

    @RequestMapping("/test")
    public void test(){
//        return Msg.success("查询成功!");
    }
    @RequestMapping("/findall")
    @ResponseBody
    public List<User>findAll(){
        System.out.println(userS.findall());
        return userS.findall();
    }
}
