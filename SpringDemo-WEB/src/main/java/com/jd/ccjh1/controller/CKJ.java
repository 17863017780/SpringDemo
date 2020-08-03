package com.jd.ccjh1.controller;

import com.jd.ccjh1.service.IndexService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author ccjh1
 * @creat 2020/7/16
 */
@Controller
public class CKJ {


    @Resource
    private IndexService indexService;
    @RequestMapping("/alertSth")
    @ResponseBody
    public String a123(String type) {
        System.out.println("123");
        return "success";

    }
    
    public static void main(String[] args){
        System.out.println("123");

    }
}
