package com.cn.sinosoft.workflow.dispatch.controller;

import com.cn.sinosoft.workflow.dispatch.service.WorkflowService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 服务调度系统总入口
 * 2018年8月28日14:57:33
 * 韩盟凯
 */
@Controller
public class WorkflowController {

    @Autowired
    private WorkflowService workflowService;

    private Logger log =  LogManager.getLogger(this.getClass());

    /**
     * 调度服务 ali json
     * 查询流程并进行循环调用
     * 2018年8月28日14:57:29
     * hmk
     */
    @ResponseBody
    @RequestMapping(value = "dispatch")
    public JSONObject dispatch(Object req, @RequestParam(name = "type") String type){
        log.debug("----------------------调度服务--start--Controller----------------------");
        //进入调度服务service
        JSONObject res = workflowService.workflowGo(req);
        //评估返回结果


        //记录日志


        //记录流程状态


        log.debug("----------------------调度服务--end--Controller----------------------");
        return res;
    }
}
