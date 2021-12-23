package com.me7eorite.service;

import com.me7eorite.entity.User;

/**
 * @Author Me7eorite
 * @Date 2021/12/21 20:44
 * @Description 用户服务接口
 */

public interface UserService {

    User queryUserById(String stuid);
}
