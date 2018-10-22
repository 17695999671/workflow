package com.cn.sinosoft.workflow.dictionaries.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 字典服务统一入口
 */
@Controller
public class RequestController {

    /**
     * 字典内部服务入口
     * @param req
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "request")
    public JSONObject request(JSONObject req){
        //定义全局变量
        JSONObject res=null;//定义返回值属性

        //输入：个性化格式的JSON对象

        //输出：标准的内部交互JSON对象，并转换字段名




        return res;
    }
}
