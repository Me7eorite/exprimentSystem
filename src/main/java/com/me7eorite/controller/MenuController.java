package com.me7eorite.controller;

import com.me7eorite.entity.Menu;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Me7eorite
 * @Date 2021/12/23 8:41
 * @Description 菜单类
 */
@Controller
@RequestMapping("menu")
public class MenuController {
    @RequestMapping("toMenuLeft")
    public String toMenuLeft(){
        return "page/button.html";
    }
    @RequestMapping("toMenuRight")
    public String toMenuRight(){
        return "menu/menuRight.html";
    }
    @RequestMapping("tomain")
    public String toMain(){
        return "main/main.html";
    }
}
