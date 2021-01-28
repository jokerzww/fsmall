package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class SlowLog implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.start_time")
    private Date startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.query_time")
    private Date queryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.lock_time")
    private Date lockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.rows_sent")
    private Integer rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.rows_examined")
    private Integer rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.last_insert_id")
    private Integer lastInsertId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.insert_id")
    private Integer insertId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.server_id")
    private Integer serverId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.thread_id")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.user_host")
    private String userHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.sql_text")
    private byte[] sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source Table: slow_log")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.start_time")
    public Date getStartTime() {
        return startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.start_time")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.query_time")
    public Date getQueryTime() {
        return queryTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.query_time")
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.lock_time")
    public Date getLockTime() {
        return lockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.lock_time")
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.rows_sent")
    public Integer getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.rows_sent")
    public void setRowsSent(Integer rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.rows_examined")
    public Integer getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.rows_examined")
    public void setRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0227352+08:00", comments="Source field: slow_log.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.last_insert_id")
    public Integer getLastInsertId() {
        return lastInsertId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.last_insert_id")
    public void setLastInsertId(Integer lastInsertId) {
        this.lastInsertId = lastInsertId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.insert_id")
    public Integer getInsertId() {
        return insertId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.insert_id")
    public void setInsertId(Integer insertId) {
        this.insertId = insertId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.server_id")
    public Integer getServerId() {
        return serverId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.server_id")
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.thread_id")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.thread_id")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.user_host")
    public String getUserHost() {
        return userHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.user_host")
    public void setUserHost(String userHost) {
        this.userHost = userHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.sql_text")
    public byte[] getSqlText() {
        return sqlText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source field: slow_log.sql_text")
    public void setSqlText(byte[] sqlText) {
        this.sqlText = sqlText;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source Table: slow_log")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", startTime=").append(startTime);
        sb.append(", queryTime=").append(queryTime);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", db=").append(db);
        sb.append(", lastInsertId=").append(lastInsertId);
        sb.append(", insertId=").append(insertId);
        sb.append(", serverId=").append(serverId);
        sb.append(", threadId=").append(threadId);
        sb.append(", userHost=").append(userHost);
        sb.append(", sqlText=").append(sqlText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source Table: slow_log")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SlowLog other = (SlowLog) that;
        return (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getQueryTime() == null ? other.getQueryTime() == null : this.getQueryTime().equals(other.getQueryTime()))
            && (this.getLockTime() == null ? other.getLockTime() == null : this.getLockTime().equals(other.getLockTime()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getLastInsertId() == null ? other.getLastInsertId() == null : this.getLastInsertId().equals(other.getLastInsertId()))
            && (this.getInsertId() == null ? other.getInsertId() == null : this.getInsertId().equals(other.getInsertId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source Table: slow_log")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getQueryTime() == null) ? 0 : getQueryTime().hashCode());
        result = prime * result + ((getLockTime() == null) ? 0 : getLockTime().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getLastInsertId() == null) ? 0 : getLastInsertId().hashCode());
        result = prime * result + ((getInsertId() == null) ? 0 : getInsertId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        return result;
    }
}