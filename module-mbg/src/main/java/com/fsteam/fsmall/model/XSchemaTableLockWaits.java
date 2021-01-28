package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class XSchemaTableLockWaits implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_schema")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_name")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_thread_id")
    private Long waitingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_pid")
    private Long waitingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_type")
    private String waitingLockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_duration")
    private String waitingLockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_secs")
    private Long waitingQuerySecs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_affected")
    private Long waitingQueryRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_examined")
    private Long waitingQueryRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_thread_id")
    private Long blockingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_pid")
    private Long blockingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_type")
    private String blockingLockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_duration")
    private String blockingLockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_query")
    private String sqlKillBlockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_account")
    private String waitingAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query")
    private String waitingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_account")
    private String blockingAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source Table: x$schema_table_lock_waits")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_schema")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_schema")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_name")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.object_name")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_thread_id")
    public Long getWaitingThreadId() {
        return waitingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_thread_id")
    public void setWaitingThreadId(Long waitingThreadId) {
        this.waitingThreadId = waitingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_pid")
    public Long getWaitingPid() {
        return waitingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_pid")
    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_type")
    public String getWaitingLockType() {
        return waitingLockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_type")
    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_duration")
    public String getWaitingLockDuration() {
        return waitingLockDuration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_lock_duration")
    public void setWaitingLockDuration(String waitingLockDuration) {
        this.waitingLockDuration = waitingLockDuration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_secs")
    public Long getWaitingQuerySecs() {
        return waitingQuerySecs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_secs")
    public void setWaitingQuerySecs(Long waitingQuerySecs) {
        this.waitingQuerySecs = waitingQuerySecs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_affected")
    public Long getWaitingQueryRowsAffected() {
        return waitingQueryRowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_affected")
    public void setWaitingQueryRowsAffected(Long waitingQueryRowsAffected) {
        this.waitingQueryRowsAffected = waitingQueryRowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_examined")
    public Long getWaitingQueryRowsExamined() {
        return waitingQueryRowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query_rows_examined")
    public void setWaitingQueryRowsExamined(Long waitingQueryRowsExamined) {
        this.waitingQueryRowsExamined = waitingQueryRowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_thread_id")
    public Long getBlockingThreadId() {
        return blockingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_thread_id")
    public void setBlockingThreadId(Long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_pid")
    public Long getBlockingPid() {
        return blockingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_pid")
    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_type")
    public String getBlockingLockType() {
        return blockingLockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_type")
    public void setBlockingLockType(String blockingLockType) {
        this.blockingLockType = blockingLockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_duration")
    public String getBlockingLockDuration() {
        return blockingLockDuration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_lock_duration")
    public void setBlockingLockDuration(String blockingLockDuration) {
        this.blockingLockDuration = blockingLockDuration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_query")
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_query")
    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_connection")
    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.sql_kill_blocking_connection")
    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_account")
    public String getWaitingAccount() {
        return waitingAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_account")
    public void setWaitingAccount(String waitingAccount) {
        this.waitingAccount = waitingAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query")
    public String getWaitingQuery() {
        return waitingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.waiting_query")
    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_account")
    public String getBlockingAccount() {
        return blockingAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source field: x$schema_table_lock_waits.blocking_account")
    public void setBlockingAccount(String blockingAccount) {
        this.blockingAccount = blockingAccount;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source Table: x$schema_table_lock_waits")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", waitingThreadId=").append(waitingThreadId);
        sb.append(", waitingPid=").append(waitingPid);
        sb.append(", waitingLockType=").append(waitingLockType);
        sb.append(", waitingLockDuration=").append(waitingLockDuration);
        sb.append(", waitingQuerySecs=").append(waitingQuerySecs);
        sb.append(", waitingQueryRowsAffected=").append(waitingQueryRowsAffected);
        sb.append(", waitingQueryRowsExamined=").append(waitingQueryRowsExamined);
        sb.append(", blockingThreadId=").append(blockingThreadId);
        sb.append(", blockingPid=").append(blockingPid);
        sb.append(", blockingLockType=").append(blockingLockType);
        sb.append(", blockingLockDuration=").append(blockingLockDuration);
        sb.append(", sqlKillBlockingQuery=").append(sqlKillBlockingQuery);
        sb.append(", sqlKillBlockingConnection=").append(sqlKillBlockingConnection);
        sb.append(", waitingAccount=").append(waitingAccount);
        sb.append(", waitingQuery=").append(waitingQuery);
        sb.append(", blockingAccount=").append(blockingAccount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source Table: x$schema_table_lock_waits")
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
        XSchemaTableLockWaits other = (XSchemaTableLockWaits) that;
        return (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getWaitingThreadId() == null ? other.getWaitingThreadId() == null : this.getWaitingThreadId().equals(other.getWaitingThreadId()))
            && (this.getWaitingPid() == null ? other.getWaitingPid() == null : this.getWaitingPid().equals(other.getWaitingPid()))
            && (this.getWaitingLockType() == null ? other.getWaitingLockType() == null : this.getWaitingLockType().equals(other.getWaitingLockType()))
            && (this.getWaitingLockDuration() == null ? other.getWaitingLockDuration() == null : this.getWaitingLockDuration().equals(other.getWaitingLockDuration()))
            && (this.getWaitingQuerySecs() == null ? other.getWaitingQuerySecs() == null : this.getWaitingQuerySecs().equals(other.getWaitingQuerySecs()))
            && (this.getWaitingQueryRowsAffected() == null ? other.getWaitingQueryRowsAffected() == null : this.getWaitingQueryRowsAffected().equals(other.getWaitingQueryRowsAffected()))
            && (this.getWaitingQueryRowsExamined() == null ? other.getWaitingQueryRowsExamined() == null : this.getWaitingQueryRowsExamined().equals(other.getWaitingQueryRowsExamined()))
            && (this.getBlockingThreadId() == null ? other.getBlockingThreadId() == null : this.getBlockingThreadId().equals(other.getBlockingThreadId()))
            && (this.getBlockingPid() == null ? other.getBlockingPid() == null : this.getBlockingPid().equals(other.getBlockingPid()))
            && (this.getBlockingLockType() == null ? other.getBlockingLockType() == null : this.getBlockingLockType().equals(other.getBlockingLockType()))
            && (this.getBlockingLockDuration() == null ? other.getBlockingLockDuration() == null : this.getBlockingLockDuration().equals(other.getBlockingLockDuration()))
            && (this.getSqlKillBlockingQuery() == null ? other.getSqlKillBlockingQuery() == null : this.getSqlKillBlockingQuery().equals(other.getSqlKillBlockingQuery()))
            && (this.getSqlKillBlockingConnection() == null ? other.getSqlKillBlockingConnection() == null : this.getSqlKillBlockingConnection().equals(other.getSqlKillBlockingConnection()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3210067+08:00", comments="Source Table: x$schema_table_lock_waits")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getWaitingThreadId() == null) ? 0 : getWaitingThreadId().hashCode());
        result = prime * result + ((getWaitingPid() == null) ? 0 : getWaitingPid().hashCode());
        result = prime * result + ((getWaitingLockType() == null) ? 0 : getWaitingLockType().hashCode());
        result = prime * result + ((getWaitingLockDuration() == null) ? 0 : getWaitingLockDuration().hashCode());
        result = prime * result + ((getWaitingQuerySecs() == null) ? 0 : getWaitingQuerySecs().hashCode());
        result = prime * result + ((getWaitingQueryRowsAffected() == null) ? 0 : getWaitingQueryRowsAffected().hashCode());
        result = prime * result + ((getWaitingQueryRowsExamined() == null) ? 0 : getWaitingQueryRowsExamined().hashCode());
        result = prime * result + ((getBlockingThreadId() == null) ? 0 : getBlockingThreadId().hashCode());
        result = prime * result + ((getBlockingPid() == null) ? 0 : getBlockingPid().hashCode());
        result = prime * result + ((getBlockingLockType() == null) ? 0 : getBlockingLockType().hashCode());
        result = prime * result + ((getBlockingLockDuration() == null) ? 0 : getBlockingLockDuration().hashCode());
        result = prime * result + ((getSqlKillBlockingQuery() == null) ? 0 : getSqlKillBlockingQuery().hashCode());
        result = prime * result + ((getSqlKillBlockingConnection() == null) ? 0 : getSqlKillBlockingConnection().hashCode());
        return result;
    }
}