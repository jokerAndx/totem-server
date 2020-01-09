package com.tiger.totem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tiger_xi on 2019/12/14
 * description: ...
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/msg")
    public String msg() {
        return "test";
    }
}
