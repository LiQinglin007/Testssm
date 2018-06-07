package com.xiaomi.service;

import java.util.List;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 16:04
 * UpdateDescription：
 */
public interface IRoleBeanService {
    /**
     * 查询当前用户对应的权限
     *
     * @param userId 用户id
     * @return 角色对应的权限
     */
    List selectMenuIdByUserId(String userId);
}
