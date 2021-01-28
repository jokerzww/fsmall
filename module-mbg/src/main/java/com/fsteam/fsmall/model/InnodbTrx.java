package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class InnodbTrx implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_id")
    private Long trxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_state")
    private String trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_started")
    private Date trxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    private String trxRequestedLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_wait_started")
    private Date trxWaitStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_weight")
    private Long trxWeight;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    private Long trxMysqlThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_query")
    private String trxQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_operation_state")
    private String trxOperationState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    private Long trxTablesInUse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    private Long trxTablesLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    private Long trxLockStructs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    private Long trxLockMemoryBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    private Long trxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    private Long trxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    private Long trxConcurrencyTickets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    private String trxIsolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    private Integer trxUniqueChecks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    private Integer trxForeignKeyChecks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    private String trxLastForeignKeyError;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    private Integer trxAdaptiveHashLatched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    private Long trxAdaptiveHashTimeout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    private Integer trxIsReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    private Integer trxAutocommitNonLocking;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_schedule_weight")
    private Long trxScheduleWeight;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source Table: INNODB_TRX")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_id")
    public Long getTrxId() {
        return trxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_id")
    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_state")
    public String getTrxState() {
        return trxState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_state")
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_started")
    public Date getTrxStarted() {
        return trxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_started")
    public void setTrxStarted(Date trxStarted) {
        this.trxStarted = trxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    public String getTrxRequestedLockId() {
        return trxRequestedLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_requested_lock_id")
    public void setTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_wait_started")
    public Date getTrxWaitStarted() {
        return trxWaitStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_wait_started")
    public void setTrxWaitStarted(Date trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_weight")
    public Long getTrxWeight() {
        return trxWeight;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_weight")
    public void setTrxWeight(Long trxWeight) {
        this.trxWeight = trxWeight;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    public Long getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_mysql_thread_id")
    public void setTrxMysqlThreadId(Long trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_query")
    public String getTrxQuery() {
        return trxQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source field: INNODB_TRX.trx_query")
    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_operation_state")
    public String getTrxOperationState() {
        return trxOperationState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_operation_state")
    public void setTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    public Long getTrxTablesInUse() {
        return trxTablesInUse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_tables_in_use")
    public void setTrxTablesInUse(Long trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    public Long getTrxTablesLocked() {
        return trxTablesLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_tables_locked")
    public void setTrxTablesLocked(Long trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    public Long getTrxLockStructs() {
        return trxLockStructs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_lock_structs")
    public void setTrxLockStructs(Long trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    public Long getTrxLockMemoryBytes() {
        return trxLockMemoryBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_lock_memory_bytes")
    public void setTrxLockMemoryBytes(Long trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    public Long getTrxRowsLocked() {
        return trxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_rows_locked")
    public void setTrxRowsLocked(Long trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    public Long getTrxRowsModified() {
        return trxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_rows_modified")
    public void setTrxRowsModified(Long trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    public Long getTrxConcurrencyTickets() {
        return trxConcurrencyTickets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_concurrency_tickets")
    public void setTrxConcurrencyTickets(Long trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_isolation_level")
    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    public Integer getTrxUniqueChecks() {
        return trxUniqueChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_unique_checks")
    public void setTrxUniqueChecks(Integer trxUniqueChecks) {
        this.trxUniqueChecks = trxUniqueChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    public Integer getTrxForeignKeyChecks() {
        return trxForeignKeyChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_foreign_key_checks")
    public void setTrxForeignKeyChecks(Integer trxForeignKeyChecks) {
        this.trxForeignKeyChecks = trxForeignKeyChecks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    public String getTrxLastForeignKeyError() {
        return trxLastForeignKeyError;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_last_foreign_key_error")
    public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
        this.trxLastForeignKeyError = trxLastForeignKeyError;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    public Integer getTrxAdaptiveHashLatched() {
        return trxAdaptiveHashLatched;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_latched")
    public void setTrxAdaptiveHashLatched(Integer trxAdaptiveHashLatched) {
        this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    public Long getTrxAdaptiveHashTimeout() {
        return trxAdaptiveHashTimeout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_adaptive_hash_timeout")
    public void setTrxAdaptiveHashTimeout(Long trxAdaptiveHashTimeout) {
        this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    public Integer getTrxIsReadOnly() {
        return trxIsReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_is_read_only")
    public void setTrxIsReadOnly(Integer trxIsReadOnly) {
        this.trxIsReadOnly = trxIsReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    public Integer getTrxAutocommitNonLocking() {
        return trxAutocommitNonLocking;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_autocommit_non_locking")
    public void setTrxAutocommitNonLocking(Integer trxAutocommitNonLocking) {
        this.trxAutocommitNonLocking = trxAutocommitNonLocking;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_schedule_weight")
    public Long getTrxScheduleWeight() {
        return trxScheduleWeight;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source field: INNODB_TRX.trx_schedule_weight")
    public void setTrxScheduleWeight(Long trxScheduleWeight) {
        this.trxScheduleWeight = trxScheduleWeight;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source Table: INNODB_TRX")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trxId=").append(trxId);
        sb.append(", trxState=").append(trxState);
        sb.append(", trxStarted=").append(trxStarted);
        sb.append(", trxRequestedLockId=").append(trxRequestedLockId);
        sb.append(", trxWaitStarted=").append(trxWaitStarted);
        sb.append(", trxWeight=").append(trxWeight);
        sb.append(", trxMysqlThreadId=").append(trxMysqlThreadId);
        sb.append(", trxQuery=").append(trxQuery);
        sb.append(", trxOperationState=").append(trxOperationState);
        sb.append(", trxTablesInUse=").append(trxTablesInUse);
        sb.append(", trxTablesLocked=").append(trxTablesLocked);
        sb.append(", trxLockStructs=").append(trxLockStructs);
        sb.append(", trxLockMemoryBytes=").append(trxLockMemoryBytes);
        sb.append(", trxRowsLocked=").append(trxRowsLocked);
        sb.append(", trxRowsModified=").append(trxRowsModified);
        sb.append(", trxConcurrencyTickets=").append(trxConcurrencyTickets);
        sb.append(", trxIsolationLevel=").append(trxIsolationLevel);
        sb.append(", trxUniqueChecks=").append(trxUniqueChecks);
        sb.append(", trxForeignKeyChecks=").append(trxForeignKeyChecks);
        sb.append(", trxLastForeignKeyError=").append(trxLastForeignKeyError);
        sb.append(", trxAdaptiveHashLatched=").append(trxAdaptiveHashLatched);
        sb.append(", trxAdaptiveHashTimeout=").append(trxAdaptiveHashTimeout);
        sb.append(", trxIsReadOnly=").append(trxIsReadOnly);
        sb.append(", trxAutocommitNonLocking=").append(trxAutocommitNonLocking);
        sb.append(", trxScheduleWeight=").append(trxScheduleWeight);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0587678+08:00", comments="Source Table: INNODB_TRX")
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
        InnodbTrx other = (InnodbTrx) that;
        return (this.getTrxId() == null ? other.getTrxId() == null : this.getTrxId().equals(other.getTrxId()))
            && (this.getTrxState() == null ? other.getTrxState() == null : this.getTrxState().equals(other.getTrxState()))
            && (this.getTrxStarted() == null ? other.getTrxStarted() == null : this.getTrxStarted().equals(other.getTrxStarted()))
            && (this.getTrxRequestedLockId() == null ? other.getTrxRequestedLockId() == null : this.getTrxRequestedLockId().equals(other.getTrxRequestedLockId()))
            && (this.getTrxWaitStarted() == null ? other.getTrxWaitStarted() == null : this.getTrxWaitStarted().equals(other.getTrxWaitStarted()))
            && (this.getTrxWeight() == null ? other.getTrxWeight() == null : this.getTrxWeight().equals(other.getTrxWeight()))
            && (this.getTrxMysqlThreadId() == null ? other.getTrxMysqlThreadId() == null : this.getTrxMysqlThreadId().equals(other.getTrxMysqlThreadId()))
            && (this.getTrxQuery() == null ? other.getTrxQuery() == null : this.getTrxQuery().equals(other.getTrxQuery()))
            && (this.getTrxOperationState() == null ? other.getTrxOperationState() == null : this.getTrxOperationState().equals(other.getTrxOperationState()))
            && (this.getTrxTablesInUse() == null ? other.getTrxTablesInUse() == null : this.getTrxTablesInUse().equals(other.getTrxTablesInUse()))
            && (this.getTrxTablesLocked() == null ? other.getTrxTablesLocked() == null : this.getTrxTablesLocked().equals(other.getTrxTablesLocked()))
            && (this.getTrxLockStructs() == null ? other.getTrxLockStructs() == null : this.getTrxLockStructs().equals(other.getTrxLockStructs()))
            && (this.getTrxLockMemoryBytes() == null ? other.getTrxLockMemoryBytes() == null : this.getTrxLockMemoryBytes().equals(other.getTrxLockMemoryBytes()))
            && (this.getTrxRowsLocked() == null ? other.getTrxRowsLocked() == null : this.getTrxRowsLocked().equals(other.getTrxRowsLocked()))
            && (this.getTrxRowsModified() == null ? other.getTrxRowsModified() == null : this.getTrxRowsModified().equals(other.getTrxRowsModified()))
            && (this.getTrxConcurrencyTickets() == null ? other.getTrxConcurrencyTickets() == null : this.getTrxConcurrencyTickets().equals(other.getTrxConcurrencyTickets()))
            && (this.getTrxIsolationLevel() == null ? other.getTrxIsolationLevel() == null : this.getTrxIsolationLevel().equals(other.getTrxIsolationLevel()))
            && (this.getTrxUniqueChecks() == null ? other.getTrxUniqueChecks() == null : this.getTrxUniqueChecks().equals(other.getTrxUniqueChecks()))
            && (this.getTrxForeignKeyChecks() == null ? other.getTrxForeignKeyChecks() == null : this.getTrxForeignKeyChecks().equals(other.getTrxForeignKeyChecks()))
            && (this.getTrxLastForeignKeyError() == null ? other.getTrxLastForeignKeyError() == null : this.getTrxLastForeignKeyError().equals(other.getTrxLastForeignKeyError()))
            && (this.getTrxAdaptiveHashLatched() == null ? other.getTrxAdaptiveHashLatched() == null : this.getTrxAdaptiveHashLatched().equals(other.getTrxAdaptiveHashLatched()))
            && (this.getTrxAdaptiveHashTimeout() == null ? other.getTrxAdaptiveHashTimeout() == null : this.getTrxAdaptiveHashTimeout().equals(other.getTrxAdaptiveHashTimeout()))
            && (this.getTrxIsReadOnly() == null ? other.getTrxIsReadOnly() == null : this.getTrxIsReadOnly().equals(other.getTrxIsReadOnly()))
            && (this.getTrxAutocommitNonLocking() == null ? other.getTrxAutocommitNonLocking() == null : this.getTrxAutocommitNonLocking().equals(other.getTrxAutocommitNonLocking()))
            && (this.getTrxScheduleWeight() == null ? other.getTrxScheduleWeight() == null : this.getTrxScheduleWeight().equals(other.getTrxScheduleWeight()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0597689+08:00", comments="Source Table: INNODB_TRX")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrxId() == null) ? 0 : getTrxId().hashCode());
        result = prime * result + ((getTrxState() == null) ? 0 : getTrxState().hashCode());
        result = prime * result + ((getTrxStarted() == null) ? 0 : getTrxStarted().hashCode());
        result = prime * result + ((getTrxRequestedLockId() == null) ? 0 : getTrxRequestedLockId().hashCode());
        result = prime * result + ((getTrxWaitStarted() == null) ? 0 : getTrxWaitStarted().hashCode());
        result = prime * result + ((getTrxWeight() == null) ? 0 : getTrxWeight().hashCode());
        result = prime * result + ((getTrxMysqlThreadId() == null) ? 0 : getTrxMysqlThreadId().hashCode());
        result = prime * result + ((getTrxQuery() == null) ? 0 : getTrxQuery().hashCode());
        result = prime * result + ((getTrxOperationState() == null) ? 0 : getTrxOperationState().hashCode());
        result = prime * result + ((getTrxTablesInUse() == null) ? 0 : getTrxTablesInUse().hashCode());
        result = prime * result + ((getTrxTablesLocked() == null) ? 0 : getTrxTablesLocked().hashCode());
        result = prime * result + ((getTrxLockStructs() == null) ? 0 : getTrxLockStructs().hashCode());
        result = prime * result + ((getTrxLockMemoryBytes() == null) ? 0 : getTrxLockMemoryBytes().hashCode());
        result = prime * result + ((getTrxRowsLocked() == null) ? 0 : getTrxRowsLocked().hashCode());
        result = prime * result + ((getTrxRowsModified() == null) ? 0 : getTrxRowsModified().hashCode());
        result = prime * result + ((getTrxConcurrencyTickets() == null) ? 0 : getTrxConcurrencyTickets().hashCode());
        result = prime * result + ((getTrxIsolationLevel() == null) ? 0 : getTrxIsolationLevel().hashCode());
        result = prime * result + ((getTrxUniqueChecks() == null) ? 0 : getTrxUniqueChecks().hashCode());
        result = prime * result + ((getTrxForeignKeyChecks() == null) ? 0 : getTrxForeignKeyChecks().hashCode());
        result = prime * result + ((getTrxLastForeignKeyError() == null) ? 0 : getTrxLastForeignKeyError().hashCode());
        result = prime * result + ((getTrxAdaptiveHashLatched() == null) ? 0 : getTrxAdaptiveHashLatched().hashCode());
        result = prime * result + ((getTrxAdaptiveHashTimeout() == null) ? 0 : getTrxAdaptiveHashTimeout().hashCode());
        result = prime * result + ((getTrxIsReadOnly() == null) ? 0 : getTrxIsReadOnly().hashCode());
        result = prime * result + ((getTrxAutocommitNonLocking() == null) ? 0 : getTrxAutocommitNonLocking().hashCode());
        result = prime * result + ((getTrxScheduleWeight() == null) ? 0 : getTrxScheduleWeight().hashCode());
        return result;
    }
}