package com.jd.ccjh1.worker;

import org.quartz.*;
import org.springframework.scheduling.quartz.QuartzJobBean;
import java.text.SimpleDateFormat;

/**
 * @author ccjh1
 * @creat 2020/8/3
 */

public class doWorker extends QuartzJobBean{

    private Integer timeout;

    //调度工厂实例化后，经过timeout时间开始执行调度
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("21432 54321432143223415 4354");
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(df.format(System.currentTimeMillis()) + "JOBDetail has successed worker");
        }catch (Exception e){
            System.out.println("21432 54321432143215 4354");
        }

    }
}
