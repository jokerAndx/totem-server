package com.tiger.totem.common;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author tiger_xi
 * @Date 2019/12/31
 * @Description: 控制层工具类
 **/
public class ControllerUtil {
    /**
     * 返回结果封装
     * @param exit
     * @param content
     * @return
     */
    public static String resultMsg(boolean exit, Object content) {
        Map<String, Object> result = new HashMap<>(50);
        result.put("exit", exit);
        result.put("content", content);
        return JSON.toJSONString(result);
    }
}
