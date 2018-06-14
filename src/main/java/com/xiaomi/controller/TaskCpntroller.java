package com.xiaomi.controller;

import com.xiaomi.system.ResponseJSON;
import com.xiaomi.task.UpdateTask;
import com.xiaomi.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:定时任务
 * User: dell - XiaomiLi
 * Date: 2018-06-14
 * Time: 11:27
 * UpdateDescription：
 */
@Controller
@RequestMapping("task")
public class TaskCpntroller {

    @Autowired
    private  UpdateTask mUpdateTask;

    @ResponseBody
    @RequestMapping("/updateTask")
    public ResponseJSON setUpdateTask(@RequestParam(value = "cron") String cron) {
        ResponseJSON responseJSON = ResponseUtils.getFiledResponseBean("修改失败", null);
//        mUpdateTask.setCron("0/10 * 14 * * *");
        mUpdateTask.setCron(cron);
        responseJSON = ResponseUtils.getSuccessResponseBean("修改成功", null);
        return responseJSON;
    }
}
