package com.cn.sinosoft.workflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/10/24.
 */
@Controller
public class WebDemoController {

    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String WebDemo(ModelMap map){
        return "welcome";
    }
}
