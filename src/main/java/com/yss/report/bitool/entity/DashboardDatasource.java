package com.yss.report.bitool.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_DATASOURCE")
public class DashboardDatasource {
    @Id
    @Column(name = "DATASOURCE_ID")
    private Long datasourceId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "SOURCE_NAME")
    private String sourceName;

    @Column(name = "SOURCE_TYPE")
    private String sourceType;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CONFIG")
    private String config;

    /**
     * @return DATASOURCE_ID
     */
    public Long getDatasourceId() {
        return datasourceId;
    }

    /**
     * @param datasourceId
     */
    public void setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
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
     * @return SOURCE_NAME
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * @param sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    /**
     * @return SOURCE_TYPE
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * @param sourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
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
     * @return CONFIG
     */
    public String getConfig() {
        return config;
    }

    /**
     * @param config
     */
    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}