package com.xiaomi.service;

import com.xiaomi.bean.MenuBean;
import com.xiaomi.dao.MenuBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 16:13
 * UpdateDescription：
 */
@Service
public class MenuService implements IMenuService {

    @Resource
    private MenuBeanMapper menuBeanMapper;

    @Override
    public List<MenuBean> selectMenuByListId(String menuIdList) {
        return menuBeanMapper.selectMenuByListId(menuIdList);
    }
}
