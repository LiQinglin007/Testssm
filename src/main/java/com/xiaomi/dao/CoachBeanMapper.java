package com.xiaomi.dao;

import com.xiaomi.bean.CoachBean;

public interface CoachBeanMapper {
    int deleteByPrimaryKey(Integer coachid);

    int insert(CoachBean record);

    int insertSelective(CoachBean record);

    CoachBean selectByPrimaryKey(Integer coachid);

    int updateByPrimaryKeySelective(CoachBean record);

    int updateByPrimaryKey(CoachBean record);
}