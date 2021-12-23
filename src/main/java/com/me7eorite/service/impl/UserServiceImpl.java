package com.me7eorite.service.impl;

import com.me7eorite.entity.User;
import com.me7eorite.mapper.UserMapper;
import com.me7eorite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 20:45
 * @Description 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper UserMapper;

    @Override
    public User queryUserById(String stuid) {
        return this.UserMapper.queryUserById(stuid);
    }

}
