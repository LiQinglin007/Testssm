package com.xiaomi.dao;

import com.xiaomi.bean.UserBean;

public interface UserBeanMapper {

    UserBean selectUserByName(String userName);
}