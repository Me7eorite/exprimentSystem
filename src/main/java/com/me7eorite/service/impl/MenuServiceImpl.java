package com.me7eorite.service.impl;

import com.me7eorite.entity.Menu;
import com.me7eorite.mapper.MenuMapper;
import com.me7eorite.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Me7eorite
 * @Date 2021/12/23 8:55
 * @Description 菜单实现类
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> queryMenuAllList(Menu menu) {
       return  this.menuMapper.queryMenuAllList(menu);
    }
    @Override
    public List<Menu> queryMenuBySid(String sid) {
        return this.menuMapper.queryMenuBySid(sid);
    }

    @Override
    public int addMenu(Menu menu) {
        return this.menuMapper.addMenu(menu);
    }

    @Override
    public int deleteMenu(Menu menu) {
        return this.menuMapper.deleteMenu(menu);
    }

    @Override
    public int updateMenu(Menu menu) {
        return this.menuMapper.updateMenu(menu);
    }

    @Override
    public List<Menu> checkMenuHasChildren(Integer pid) {
        return this.menuMapper.checkMenuHasChildren(pid);
    }
}
