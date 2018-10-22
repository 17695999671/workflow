package com.cn.sinosoft.workflow.template.service;


import org.json.JSONObject;

/**
 * 格式转换
 */
public interface RequestService {

    //xml转JSON
    JSONObject xml_json(Object req);

    //MAP转JSON
    JSONObject map_json(Object req);

    //json串转JSON对象
    JSONObject json_json(Object req);
}
