package com.yss.report.bitool.entity;

import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_USER_ROLE")
public class DashboardUserRole {
    @Id
    @Column(name = "USER_ROLE_ID")
    private Short userRoleId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ROLE_ID")
    private String roleId;

    /**
     * @return USER_ROLE_ID
     */
    public Short getUserRoleId() {
        return userRoleId;
    }

    /**
     * @param userRoleId
     */
    public void setUserRoleId(Short userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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
}