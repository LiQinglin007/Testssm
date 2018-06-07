package com.xiaomi.dao;

import com.xiaomi.bean.RoleBean;

import java.util.List;

public interface RoleBeanMapper {
    /**
     * 查询当前用户对应的权限
     *
     * @param userId 用户id
     * @return 角色对应的权限
     */
    List selectMenuIdByUserId(String userId);
}