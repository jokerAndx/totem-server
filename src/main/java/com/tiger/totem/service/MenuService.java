package com.tiger.totem.service;

import com.tiger.totem.mapper.MenuMapper;
import com.tiger.totem.model.MenuVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
@Service
public class MenuService {
    private Logger logger = LoggerFactory.getLogger(MenuService.class);

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 获取菜单树
     * @return
     */
    public List<MenuVO> qryMenuTree() {
        try {
            List<MenuVO> menus = menuMapper.qryMenuTree();
            return menus;
        } catch (Exception ex) {
            logger.info("MenuService.qryAllMenu", ex);
            return null;
        }
    }

    /**
     * 获取所有子路由
     * @return
     */
    public List<MenuVO> qryAllRoutes() {
        try {
            List<MenuVO> routes = menuMapper.qryAllRoutes();
            return routes;
        } catch (Exception ex) {
            logger.info("MenuService.qryAllRoutes");
            return null;
        }
    }
}
