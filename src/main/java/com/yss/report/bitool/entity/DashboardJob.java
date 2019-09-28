package com.yss.report.bitool.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DASHBOARD_JOB")
public class DashboardJob {
    @Id
    @Column(name = "JOB_ID")
    private Short jobId;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "CRON_EXP")
    private String cronExp;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "JOB_TYPE")
    private String jobType;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "LAST_EXEC_TIME")
    private Date lastExecTime;

    @Column(name = "JOB_STATUS")
    private Short jobStatus;

    @Column(name = "JOB_CONFIG")
    private String jobConfig;

    @Column(name = "EXEC_LOG")
    private String execLog;

    /**
     * @return JOB_ID
     */
    public Short getJobId() {
        return jobId;
    }

    /**
     * @param jobId
     */
    public void setJobId(Short jobId) {
        this.jobId = jobId;
    }

    /**
     * @return JOB_NAME
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * @return CRON_EXP
     */
    public String getCronExp() {
        return cronExp;
    }

    /**
     * @param cronExp
     */
    public void setCronExp(String cronExp) {
        this.cronExp = cronExp == null ? null : cronExp.trim();
    }

    /**
     * @return START_DATE
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return END_DATE
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return JOB_TYPE
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * @param jobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType == null ? null : jobType.trim();
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
     * @return LAST_EXEC_TIME
     */
    public Date getLastExecTime() {
        return lastExecTime;
    }

    /**
     * @param lastExecTime
     */
    public void setLastExecTime(Date lastExecTime) {
        this.lastExecTime = lastExecTime;
    }

    /**
     * @return JOB_STATUS
     */
    public Short getJobStatus() {
        return jobStatus;
    }

    /**
     * @param jobStatus
     */
    public void setJobStatus(Short jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * @return JOB_CONFIG
     */
    public String getJobConfig() {
        return jobConfig;
    }

    /**
     * @param jobConfig
     */
    public void setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig == null ? null : jobConfig.trim();
    }

    /**
     * @return EXEC_LOG
     */
    public String getExecLog() {
        return execLog;
    }

    /**
     * @param execLog
     */
    public void setExecLog(String execLog) {
        this.execLog = execLog == null ? null : execLog.trim();
    }
}