package com.yss.report.bitool.entity;

import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_CATEGORY")
public class DashboardCategory {
    @Id
    @Column(name = "CATEGORY_ID")
    private Short categoryId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "USER_ID")
    private String userId;

    /**
     * @return CATEGORY_ID
     */
    public Short getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return CATEGORY_NAME
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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
}