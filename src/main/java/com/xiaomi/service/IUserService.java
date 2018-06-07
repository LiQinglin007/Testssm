package com.xiaomi.service;

import com.xiaomi.bean.UserBean;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 13:23
 * UpdateDescription：
 */
public interface IUserService {
    /**
     * 登录逻辑
     * @param userName
     * @return
     */
    UserBean login(String userName);
}
