package com.me7eorite.service.impl;

import com.me7eorite.entity.User;
import com.me7eorite.mapper.UserMapper;
import com.me7eorite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
/**
 * @Author Me7eorite
 * @Date 2021/12/24 23:40
 * @Description 实现类
=======
import javax.annotation.Resource;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 20:45
 * @Description 用户服务实现类
>>>>>>> fe028260860793a0e70c3450fcfc3fe1d77dd2f8
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
<<<<<<< HEAD
    private UserMapper userMapper;

    @Override
    public User queryUserById(String stuid) {
        return this.userMapper.queryUserById(stuid);
    }
    public  User queryUserByName(String username){
        return this.userMapper.queryUserByName(username);
    }
=======
    private UserMapper UserMapper;

    @Override
    public User queryUserById(String stuid) {
        return this.UserMapper.queryUserById(stuid);
    }

>>>>>>> fe028260860793a0e70c3450fcfc3fe1d77dd2f8
}
