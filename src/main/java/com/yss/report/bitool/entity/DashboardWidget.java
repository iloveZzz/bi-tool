package com.yss.report.bitool.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DASHBOARD_WIDGET")
public class DashboardWidget {
    @Id
    @Column(name = "WIDGET_ID")
    private Short widgetId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "WIDGET_NAME")
    private String widgetName;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "DATA_JSON")
    private String dataJson;

    /**
     * @return WIDGET_ID
     */
    public Short getWidgetId() {
        return widgetId;
    }

    /**
     * @param widgetId
     */
    public void setWidgetId(Short widgetId) {
        this.widgetId = widgetId;
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
     * @return WIDGET_NAME
     */
    public String getWidgetName() {
        return widgetName;
    }

    /**
     * @param widgetName
     */
    public void setWidgetName(String widgetName) {
        this.widgetName = widgetName == null ? null : widgetName.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return DATA_JSON
     */
    public String getDataJson() {
        return dataJson;
    }

    /**
     * @param dataJson
     */
    public void setDataJson(String dataJson) {
        this.dataJson = dataJson == null ? null : dataJson.trim();
    }
}