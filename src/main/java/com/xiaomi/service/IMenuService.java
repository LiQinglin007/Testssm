package com.xiaomi.service;

import com.xiaomi.bean.MenuBean;

import java.util.List;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 16:13
 * UpdateDescription：
 */
public interface IMenuService {
    /**
     * 通过集合查询菜单
     * @param menuIdList
     * @return
     */
    List<MenuBean> selectMenuByListId(String menuIdList);
}
