package com.xiaomi.service;



import com.xiaomi.bean.ChampionteamBean;
import com.xiaomi.dao.ChampionteamBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChampionTeamService implements IChampionTeamService {
    @Resource
    private ChampionteamBeanMapper championMapper;

    @Override
    public List<ChampionteamBean> selectAll() {
        List<ChampionteamBean> championTeams = this.championMapper.selectAll();
        return championTeams;
    }
}
