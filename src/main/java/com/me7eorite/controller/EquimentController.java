package com.me7eorite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Me7eorite
 * @Date 2021/12/22 23:46
 * @Description 设备控制类
 */
@RestController
@RequestMapping("equiment")
public class EquimentController {
    @RequestMapping("buy")
    public ResponseEntity<Object> buyNewEqu(){
        return new ResponseEntity<>("申请成功", HttpStatus.OK);
    }

    @RequestMapping("fix")
    public ResponseEntity<Object> addFixEqu(){
        return new ResponseEntity<>("添加需要修理的设备成功！", HttpStatus.OK);
    }

    @RequestMapping("scrap")//报废
    public ResponseEntity<Object> addScrapEqu(){
        return new ResponseEntity<>("设备报废成功！",HttpStatus.OK);
    }

    @RequestMapping("add")
    public ResponseEntity<Object> addNewEqu(){
        return new ResponseEntity<>("设备添加成功！",HttpStatus.OK);
    }







}
