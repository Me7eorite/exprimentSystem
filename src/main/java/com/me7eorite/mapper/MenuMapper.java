package com.me7eorite.mapper;

import com.me7eorite.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Me7eorite
 * @Date 2021/12/23 9:00
 * @Description 菜单的sql操作接口
 */
@Mapper
public interface MenuMapper {
    List<Menu> queryMenuAllList(Menu menu);
    List<Menu> queryMenuBySid(String id);
    int addMenu(Menu menu);
    int deleteMenu(Menu menu);
    int updateMenu(Menu menu);
    List<Menu> checkMenuHasChildren(Integer pid);
}
