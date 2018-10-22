package com.cn.sinosoft.workflow.template.service.impl;

import com.cn.sinosoft.workflow.template.service.RequestService;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;


@Service
public class RequestServiceImpl  implements RequestService {

    //xml转JSONObject
    @Override
    public JSONObject xml_json(Object req) {
        JSONObject res = XML.toJSONObject(req.toString());
        return res;
    }

    //MAP转JSONObject
    @Override
    public JSONObject map_json(Object req) {
        JSONObject res = new JSONObject(req);
        return res;
    }

    //JSONObject串转JSONObject对象
    @Override
    public JSONObject json_json(Object req) {
        JSONObject res = new JSONObject(req.toString());
        return res;
    }
}
