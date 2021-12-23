package com.me7eorite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 15:54
 * @Description 控制登录类
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("tologin")
    public void tologin(String username,String password,String captcha){

        System.out.println(username);
        System.out.println(password);
        System.out.println(captcha);
    }
    @RequestMapping("logout")
    public ResponseEntity<Object> tologout(){
        return new ResponseEntity<>("退出成功",HttpStatus.OK);
    }


}
