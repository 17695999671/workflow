package com.cn.sinosoft.workflow.template.controller;

import com.cn.sinosoft.workflow.template.service.RequestService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 模板转换服务统一入口
 */
@Controller
public class RequestController {

    @Autowired
    private RequestService requestService;

    /**
     * 定义模板转换服务入口
     * @param req
     * @param type
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "toJSON")
    public JSONObject request(Object req, @RequestParam(name = "type") String type){

        //定义全局变量
        JSONObject res=null;//定义返回值属性

        if(type == null || "".equals(type)){
            //error 这里定义错误返回报文格式

        }else if("xml".equals(type)){
            res = requestService.xml_json(req);
        }else if("json".equals(type)){
            res = requestService.json_json(req);
        }else if("map".equals(type)){
            res = requestService.map_json(req);
        }

        return res;
    }

    /**
     * 定义模板转换服务入口
     * @param req
     * @param type
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "freeMarker")
    public JSONObject freemarker(JSONObject req){
        //定义全局变量
        JSONObject res=null;//定义返回值属性

        //1、获取报文中的模板编码


        //2、从内部标准的req对象中组装报文


        //3、获取完整的报文转换成JSONObject并返回


        return res;
    }
}
