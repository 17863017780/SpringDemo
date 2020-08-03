package com.jd.ccjh1.worker;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * @author ccjh1
 * @creat 2020/8/3
 */

//@Component
public class doWorker extends QuartzJobBean {
    private Integer timeout;

    //调度工厂实例化后，经过timeout时间开始执行调度
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(System.currentTimeMillis()) + "JOBDetail has successed worker");
    }
}
