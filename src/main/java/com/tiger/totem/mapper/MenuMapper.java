package com.tiger.totem.mapper;

import com.tiger.totem.model.MenuVO;

import java.util.List;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
public interface MenuMapper {
    /**
     * 获取菜单树
     * @return List<Menu>
     */
    List<MenuVO> qryMenuTree();

    /**
     * 获取所有子路由
     * @return
     */
    List<MenuVO> qryAllRoutes();
}
