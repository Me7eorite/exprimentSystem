package com.me7eorite.entity;

import com.me7eorite.base.baseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 20:39
 * @Description 用户模型
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends baseEntity {
    private String id;
    private String sid;//学生学号
    private String uname;//系统登录名
    private String identity;//身份
    private String name;//真实姓名
    private int gender;//性别
    private String pwd;//密码
    private String salt; //加盐
    private String status;//状态 冻结、可查看、可借阅、可修改


}
