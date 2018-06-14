package com.xiaomi.task;

import com.xiaomi.utils.DateUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Description:动态修改的Task
 * User: dell - XiaomiLi
 * Date: 2018-06-14
 * Time: 9:47
 * UpdateDescription：
 */
@Component
@EnableScheduling
public class UpdateTask implements SchedulingConfigurer {
    private String cron = "0/5 * 14 * * *";

    public void setCron(String cron) {
        this.cron = cron;
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(
                new Runnable() {
                    @Override
                    public void run() {
                        //任务逻辑
                        System.out.println("---------------start-------------------");
                        System.out.println("动态修改定时任务参数，时间表达式cron为：" + cron);
                        System.out.println(DateUtils.getDateTime(new Date()));
                        System.out.println("----------------end--------------------");
                    }
                },
                new Trigger() {
                    @Override
                    public Date nextExecutionTime(TriggerContext triggerContext) {
                        // 任务触发，可修改任务的执行周期
                        CronTrigger trigger = new CronTrigger(cron);
                        Date nextExec = trigger.nextExecutionTime(triggerContext);
                        return nextExec;
                    }
                });
    }
}
