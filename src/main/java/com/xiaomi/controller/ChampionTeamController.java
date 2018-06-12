package com.xiaomi.controller;


import com.xiaomi.bean.ChampionteamBean;
import com.xiaomi.system.ResponseJSON;
import com.xiaomi.service.IChampionTeamService;
import com.xiaomi.utils.ResponseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


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


    @ResponseBody
    @RequestMapping(value = "/addChampionTeam")
    public ResponseJSON addChampionTeam(@RequestParam(value = "teamName") String teamName) {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("添加失败", null);
        int number = championTeamService.insertOne(teamName);
        if (number > 0) {
            jsonBean = ResponseUtils.getSuccessResponseBean("添加成功", null);
        }
        return jsonBean;
    }


    @ResponseBody
    @RequestMapping(value = "/updateChampionTeam")
    public ResponseJSON updateChampionTeam(@RequestParam(value = "teamId") int teamId, @RequestParam(value = "teamName") String teamName) {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("修改失败", null);
        int number = championTeamService.updateById(new ChampionteamBean(teamId, teamName));
        if (number > 0) {
            jsonBean = ResponseUtils.getSuccessResponseBean("修改成功", null);
        }
        return jsonBean;
    }


    @ResponseBody
    @RequestMapping(value = "/deleteChampionTeam")
    public ResponseJSON deleteChampionTeam(@RequestParam(value = "teamId") int teamId) {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("删除失败", null);
        int i = championTeamService.deleteById(teamId);
        if (i > 0) {
            jsonBean = ResponseUtils.getSuccessResponseBean("删除成功", null);
        }
        return jsonBean;
    }
}