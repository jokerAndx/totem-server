package com.tiger.totem.controller;

import com.alibaba.fastjson.JSON;
import com.tiger.totem.common.ControllerUtil;
import com.tiger.totem.model.UserVO;
import com.tiger.totem.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author tiger_xi
 * @Date 2019/12/31
 * @Description: ...
 **/
@RestController
@RequestMapping("/authority")
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @PostMapping("/login")
    public String login(@RequestBody String formData) {
        Map<String, Object> param = JSON.parseObject(formData);
        String account = param.get("account").toString();
        String password = param.get("password").toString();
        UserVO user = authorityService.qryUserByAccount(account, password);
        String result = ControllerUtil.resultMsg(true, user);
        return result;
    }
}
