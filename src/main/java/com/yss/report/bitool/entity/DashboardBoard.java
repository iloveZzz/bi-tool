package com.yss.report.bitool.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DASHBOARD_BOARD")
public class DashboardBoard {
    @Id
    @Column(name = "BOARD_ID")
    private Short boardId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "CATEGORY_ID")
    private Short categoryId;

    @Column(name = "BOARD_NAME")
    private String boardName;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "LAYOUT_JSON")
    private String layoutJson;

    /**
     * @return BOARD_ID
     */
    public Short getBoardId() {
        return boardId;
    }

    /**
     * @param boardId
     */
    public void setBoardId(Short boardId) {
        this.boardId = boardId;
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
     * @return BOARD_NAME
     */
    public String getBoardName() {
        return boardName;
    }

    /**
     * @param boardName
     */
    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
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
     * @return LAYOUT_JSON
     */
    public String getLayoutJson() {
        return layoutJson;
    }

    /**
     * @param layoutJson
     */
    public void setLayoutJson(String layoutJson) {
        this.layoutJson = layoutJson == null ? null : layoutJson.trim();
    }
}