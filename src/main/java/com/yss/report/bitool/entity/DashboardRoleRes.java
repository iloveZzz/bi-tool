package com.yss.report.bitool.entity;

import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_ROLE_RES")
public class DashboardRoleRes {
    @Id
    @Column(name = "ROLE_RES_ID")
    private Short roleResId;

    @Column(name = "ROLE_ID")
    private String roleId;

    @Column(name = "RES_TYPE")
    private String resType;

    @Column(name = "RES_ID")
    private Short resId;

    @Column(name = "PERMISSION")
    private String permission;

    /**
     * @return ROLE_RES_ID
     */
    public Short getRoleResId() {
        return roleResId;
    }

    /**
     * @param roleResId
     */
    public void setRoleResId(Short roleResId) {
        this.roleResId = roleResId;
    }

    /**
     * @return ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * @return RES_TYPE
     */
    public String getResType() {
        return resType;
    }

    /**
     * @param resType
     */
    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    /**
     * @return RES_ID
     */
    public Short getResId() {
        return resId;
    }

    /**
     * @param resId
     */
    public void setResId(Short resId) {
        this.resId = resId;
    }

    /**
     * @return PERMISSION
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}