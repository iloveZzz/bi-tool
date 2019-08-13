package com.yss.report.bitool.entity;

import javax.persistence.*;

@Table(name = "DMZ.DASHBOARD_HOMEPAGE")
public class DashboardHomepage {
    @Id
    @Column(name = "BOARD_ID")
    private Short boardId;

    @Id
    @Column(name = "USER_ID")
    private String userId;

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
}