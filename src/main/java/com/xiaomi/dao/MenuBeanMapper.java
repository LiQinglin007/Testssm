package com.xiaomi.dao;

import com.xiaomi.bean.MenuBean;

import java.util.List;

public interface MenuBeanMapper {
    /**
     * 通过菜单集合查询菜单
     *
     * @param menuIdList 菜单集合
     * @return
     */
    List<MenuBean> selectMenuByListId(String menuIdList);
}