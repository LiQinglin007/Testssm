package com.xiaomi.dao;

import com.xiaomi.bean.PlayerBean;

public interface PlayerBeanMapper {
    int deleteByPrimaryKey(Integer playerid);

    int insert(PlayerBean record);

    int insertSelective(PlayerBean record);

    PlayerBean selectByPrimaryKey(Integer playerid);

    int updateByPrimaryKeySelective(PlayerBean record);

    int updateByPrimaryKey(PlayerBean record);
}