package com.cn.sinosoft.workflow.dispatch.service;

import org.json.JSONObject;

/**
 * 调度服务service
 * 2018年8月28日15:50:59
 * hmk
 */
public interface WorkflowService {

    //调度服务入口
    JSONObject workflowGo(Object req);
}
