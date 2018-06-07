package com.xiaomi.dao;

import com.xiaomi.bean.TeamBean;

public interface TeamBeanMapper {
    int deleteByPrimaryKey(Integer teamid);

    int insert(TeamBean record);

    int insertSelective(TeamBean record);

    TeamBean selectByPrimaryKey(Integer teamid);

    int updateByPrimaryKeySelective(TeamBean record);

    int updateByPrimaryKey(TeamBean record);
}