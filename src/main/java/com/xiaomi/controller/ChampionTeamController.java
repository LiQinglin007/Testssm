package com.xiaomi.controller;


import com.xiaomi.bean.ChampionteamBean;
import com.xiaomi.system.ResponseJSON;
import com.xiaomi.service.IChampionTeamService;
import com.xiaomi.utils.CheckStringEmptyUtils;
import com.xiaomi.utils.ResponseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/ChampionTeamController")
//@Api(description = "API接口")
public class ChampionTeamController {

    @Resource
    private IChampionTeamService championTeamService;

    @ResponseBody
    @RequestMapping(value = "/selectAll")
//    @ApiOperation(value = "获取冠军球队列表", httpMethod = "GET", response = ResponseJSON.class, notes = "获取冠军球队List")
    public ResponseJSON selectAll() {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("查询失败", null);
        List<ChampionteamBean> championTeams = championTeamService.selectAll();
        jsonBean = ResponseUtils.getSuccessResponseBean("查询成功", championTeams);
        return jsonBean;
    }


    @ResponseBody
    @RequestMapping(value = "/addChampionTeam")
//    @ApiOperation(value = "增加一个冠军球队", httpMethod = "GET", response = ResponseJSON.class, notes = "增加一个冠军球队11")
//    public ResponseJSON addChampionTeam(@ApiParam(required = true, name = "teamNameApiParam", value = "教程入参")  @RequestParam(value = "teamName") String teamName) {
    public ResponseJSON addChampionTeam(@RequestParam(value = "teamName") String teamName) {
        ResponseJSON jsonBean = ResponseUtils.getFiledResponseBean("添加失败", null);
        if (CheckStringEmptyUtils.IsEmpty(teamName)) {
            jsonBean.setMsg("球队名称不能为空");
            return jsonBean;
        }
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
        if (CheckStringEmptyUtils.IsEmpty(teamId + "")) {
            jsonBean.setMsg("球队ID不能为空");
            return jsonBean;
        }

        if (CheckStringEmptyUtils.IsEmpty(teamName)) {
            jsonBean.setMsg("球队名称不能为空");
            return jsonBean;
        }
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

        if (CheckStringEmptyUtils.IsEmpty(teamId + "")) {
            jsonBean.setMsg("球队ID不能为空");
            return jsonBean;
        }
        int i = championTeamService.deleteById(teamId);
        if (i > 0) {
            jsonBean = ResponseUtils.getSuccessResponseBean("删除成功", null);
        }
        return jsonBean;
    }
}