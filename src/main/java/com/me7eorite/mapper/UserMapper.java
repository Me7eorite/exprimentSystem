package com.me7eorite.mapper;

import com.me7eorite.entity.User;
import org.apache.ibatis.annotations.Mapper;

<<<<<<< HEAD
/**
 * @Author Me7eorite
 * @Date 2021/12/24 23:39
 * @Description 用户信息数据库操作接口
 */
@Mapper
public interface UserMapper {
    User queryUserById(String sid);
    User queryUserByName(String username);
=======
@Mapper
public interface UserMapper {
    User queryUserById(String stuid);
>>>>>>> fe028260860793a0e70c3450fcfc3fe1d77dd2f8
}
