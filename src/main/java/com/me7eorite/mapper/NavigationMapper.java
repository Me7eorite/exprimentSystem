package com.me7eorite.mapper;

import com.me7eorite.entity.Navigation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NavigationMapper {
    List<Navigation> getnavigationListByPId(@Param("pid") Integer pid);
    List<Navigation> getNavigationByPid();
}
