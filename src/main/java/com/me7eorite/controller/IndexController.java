package com.me7eorite.controller;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Me7eorite
 * @Date 2021/12/24 22:03
 * @Description 首页控制器
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(){
    return "index.html";
}
}
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 15:39
 * @Description 首页显示控制器
 */

@Controller
@RequestMapping("/")
public class IndexController {
    public String index(){
        return "index.html";

    }
    @RequestMapping("login")
    public String login(){
        return "page/login.html";
    }

}
>>>>>>> fe028260860793a0e70c3450fcfc3fe1d77dd2f8
