package com.cn.sinosoft.workflow.dispatch.service.impl;

import com.cn.sinosoft.workflow.dispatch.service.WorkflowService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * 调度服务service
 * 2018年8月28日15:50:46
 * hmk
 */
@Service
public class WorkflowServiceImpl implements WorkflowService {

    private Logger log =  LogManager.getLogger(this.getClass());

    //调度服务逻辑
    @Override
    public JSONObject workflowGo(Object req) {
        log.debug("----------------------调度服务--start--Service----------------------");

        //1、模板转换服务

        //2、字段转码服务

        //3、数据补全服务

        //4、数据校验服务

        //5、配置服务（流程配置）

        //5.1、noSQL查询工作流

        //5.2、获取流程个数
        int wwNum=6;
        //5.3、进入流程循环体系
        for(int i=0; i<wwNum; i++){
            //子服务循环调用
        }
        //6、循环结果评估

        //7、组装返回报文

        log.debug("----------------------调度服务--end--Service----------------------");
        return null;
    }
}
