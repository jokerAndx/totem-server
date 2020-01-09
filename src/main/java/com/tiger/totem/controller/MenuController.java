package com.tiger.totem.controller;

import com.tiger.totem.common.ControllerUtil;
import com.tiger.totem.model.MenuVO;
import com.tiger.totem.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    /**
     * 获取菜单树
     * @return
     */
    @GetMapping("/tree")
    public String qryMenuTree() {
        List<MenuVO> menus = menuService.qryMenuTree();
        if(menus != null) {
            return ControllerUtil.resultMsg(true, menus);
        } else {
            return ControllerUtil.resultMsg(false, "获取数据失败!");
        }
    }

    /**
     * 获取所有子路由
     * @return
     */
    @GetMapping("/route")
    public String qryAllRoutes() {
        List<MenuVO> routes = menuService.qryAllRoutes();
        if(routes != null) {
            return ControllerUtil.resultMsg(true, routes);
        } else {
            return ControllerUtil.resultMsg(false, "获取数据失败");
        }
    }
}
