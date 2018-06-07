package com.xiaomi.bean;

public class MenuBean {
    private Integer menuId;

    private String menuName;

    public MenuBean(Integer menuId, String menuName) {
        this.menuId = menuId;
        this.menuName = menuName;
    }

    public MenuBean() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }
}