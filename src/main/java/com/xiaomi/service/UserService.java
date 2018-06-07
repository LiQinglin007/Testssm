package com.xiaomi.service;

import com.xiaomi.bean.UserBean;
import com.xiaomi.dao.UserBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 13:23
 * UpdateDescription：
 */
@Service
public class UserService implements IUserService {
    @Resource
    UserBeanMapper mapper;

    @Override
    public UserBean login(String userName) {
        return mapper.selectUserByName(userName);
    }
}
