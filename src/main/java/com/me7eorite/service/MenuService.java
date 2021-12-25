package com.me7eorite.service;

import com.me7eorite.entity.Menu;

import java.util.List;

/**
 * @Author Me7eorite
 * @Date 2021/12/23 8:55
 * @Description 菜单接口
 */
public interface MenuService {
    List<Menu> queryMenuAllList(Menu menu);
    List<Menu> queryMenuBySid(String id);
    int addMenu(Menu menu);
    int deleteMenu(Menu menu);
    int updateMenu(Menu menu);
    List<Menu> checkMenuHasChildren(Integer pid);



}
