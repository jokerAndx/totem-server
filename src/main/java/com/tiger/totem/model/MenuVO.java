package com.tiger.totem.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
public class MenuVO {
    /**主键**/
    private Integer id;
    /**父集主键**/
    private String parentId;
    /**父集路径**/
    private String parent;
    /**菜单路径**/
    private String url;
    /**组件**/
    private String component;
    /**菜单名称**/
    private String menuName;
    /**菜单状态**/
    private String status;
    /**创建时间**/
    private String createDate;
    /**修改时间**/
    private String modDate;
    private List<MenuVO> children = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public List<MenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<MenuVO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", parentId='" + parentId + '\'' +
                ", parent='" + parent + '\'' +
                ", url='" + url + '\'' +
                ", component='" + component + '\'' +
                ", menuName='" + menuName + '\'' +
                ", status='" + status + '\'' +
                ", createDate='" + createDate + '\'' +
                ", modDate='" + modDate + '\'' +
                ", children=" + children +
                '}';
    }
}
