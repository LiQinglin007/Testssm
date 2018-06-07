package com.xiaomi.bean;

public class RoleBean {
    private Integer roleId;

    private String roleName;

    private String menuId;

    public RoleBean(Integer roleId, String roleName, String menuId) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.menuId = menuId;
    }

    public RoleBean() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }
}