package com.xiaomi.task;

import com.xiaomi.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Description:定时任务
 * User: dell - XiaomiLi
 * Date: 2018-06-13
 * Time: 9:23
 * UpdateDescription：
 */
@Component("TestTask")
public class TestTask {
    /**
     * 打印一下就算了这里
     */
    public void sysTime() {
        System.out.println("定时任务：" + DateUtils.getDateTime(new Date()));
    }

}
