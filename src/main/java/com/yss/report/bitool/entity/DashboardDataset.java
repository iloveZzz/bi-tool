package com.yss.report.bitool.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_DATASET")
public class DashboardDataset {
    @Id
    @Column(name = "DATASET_ID")
    private Long datasetId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "DATASET_NAME")
    private String datasetName;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "DATA_JSON")
    private String dataJson;

    /**
     * @return DATASET_ID
     */
    public Long getDatasetId() {
        return datasetId;
    }

    /**
     * @param datasetId
     */
    public void setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
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
     * @return DATASET_NAME
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * @param datasetName
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName == null ? null : datasetName.trim();
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