package com.xiaomi.service;


import com.xiaomi.bean.ChampionteamBean;

import java.util.List;

public interface IChampionTeamService {

    List<ChampionteamBean> selectAll();

    int insertOne(String teamName);

    int updateById(ChampionteamBean championteamBean);

    int deleteById(int championteamId);

}
