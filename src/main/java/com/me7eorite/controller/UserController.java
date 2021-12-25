package com.me7eorite.controller;

<<<<<<< HEAD
import com.me7eorite.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Me7eorite
 * @Date 2021/12/25 0:15
 * @Description 获取用户的基本信息
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("info")
    public String userInformation(Model model, HttpServletRequest request){

        User user = (User) request.getSession().getAttribute("user");

        model.addAttribute("user",user);
        return "page/userinfo.html";
    }
    @RequestMapping("welcome")
    public String welcomeIndex()
    {
        return "page/welcome.html";
    }
    // @RequestMapping("")
    @RequestMapping("fix")
    public String fix(){
        return "page/fix.html";
    }
    @RequestMapping("use")
    public String use(){
        return "page/use.html";
    }
    // @RequestMapping("")
=======
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

>>>>>>> fe028260860793a0e70c3450fcfc3fe1d77dd2f8

}
