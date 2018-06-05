package com.xiaomi.controller;


import com.xiaomi.bean.ChampionteamBean;
import com.xiaomi.pojo.ResultJson;
import com.xiaomi.service.IChampionTeamService;
import com.xiaomi.utils.HttpCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ChampionTeamController")
public class ChampionTeamController {

    @Resource
    private IChampionTeamService championTeamService;

    @RequestMapping("/selectAll")
    public ResultJson selectAll() {
        ResultJson jsonBean = new ResultJson(HttpCode.FiledCode, "查询失败", null);
        List<ChampionteamBean> championTeams = championTeamService.selectAll();
        jsonBean.setCode(HttpCode.SuccessCode);
        jsonBean.setData(championTeams);
        jsonBean.setMsg("查询成功");
        return jsonBean;
    }
}