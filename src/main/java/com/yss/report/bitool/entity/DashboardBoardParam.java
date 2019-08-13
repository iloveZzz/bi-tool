package com.yss.report.bitool.entity;

import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_BOARD_PARAM")
public class DashboardBoardParam {
    @Id
    @Column(name = "BOARD_PARAM_ID")
    private Short boardParamId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "BOARD_ID")
    private Short boardId;

    @Column(name = "CONFIG")
    private String config;

    /**
     * @return BOARD_PARAM_ID
     */
    public Short getBoardParamId() {
        return boardParamId;
    }

    /**
     * @param boardParamId
     */
    public void setBoardParamId(Short boardParamId) {
        this.boardParamId = boardParamId;
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