package com.me7eorite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 15:39
 * @Description
 */

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public ResponseEntity<Object> hello(){
        return new ResponseEntity<>("访问成功!", HttpStatus.OK);
    }
}
