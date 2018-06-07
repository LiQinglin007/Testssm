package com.xiaomi.service;

import com.xiaomi.dao.RoleBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * User: dell - XiaomiLi
 * Date: 2018-06-07
 * Time: 16:04
 * UpdateDescription：
 */
@Service
public class RoleBeanService implements IRoleBeanService {

    @Resource
    RoleBeanMapper roleBeanMapper;

    @Override
    public List selectMenuIdByUserId(String userId) {
        return roleBeanMapper.selectMenuIdByUserId(userId);
    }
}
