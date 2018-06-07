package com.xiaomi.controller;


import com.alibaba.fastjson.JSONObject;
import com.xiaomi.bean.ChampionteamBean;
import com.xiaomi.system.ResponseJSON;
import com.xiaomi.service.IChampionTeamService;
import com.xiaomi.utils.HttpCode;
import com.xiaomi.utils.ResponseUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/ChampionTeamController")
public class ChampionTeamController {

    @Resource
    private IChampionTeamService championTeamService;

    @ResponseBody
    @RequestMapping(value = "/selectAll")
    public ResponseJSON selectAll() {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("查询失败", null);
        List<ChampionteamBean> championTeams = championTeamService.selectAll();

        jsonBean = ResponseUtils.getSuccessResponseBean("查询成功", championTeams);
        return jsonBean;
    }
}