package com.xiaomi.dao;

import com.xiaomi.bean.ChampionteamBean;

import java.util.List;

public interface ChampionteamBeanMapper {
    List<ChampionteamBean> selectAll();

    int insertOne(String teamName);

    int updateById(ChampionteamBean championteamBean);

    int deleteById(int championteamId);
}