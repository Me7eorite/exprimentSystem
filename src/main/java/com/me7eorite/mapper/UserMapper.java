package com.me7eorite.mapper;

import com.me7eorite.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryUserById(String stuid);
}
