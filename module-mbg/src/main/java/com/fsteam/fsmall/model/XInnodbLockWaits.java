package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class XInnodbLockWaits implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_started")
    private Date waitStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_age")
    private Date waitAge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_age_secs")
    private Long waitAgeSecs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_schema")
    private String lockedTableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_name")
    private String lockedTableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_partition")
    private String lockedTablePartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_subpartition")
    private String lockedTableSubpartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_index")
    private String lockedIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_type")
    private String lockedType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_id")
    private Long waitingTrxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_started")
    private Date waitingTrxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_age")
    private Date waitingTrxAge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_rows_locked")
    private Long waitingTrxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_rows_modified")
    private Long waitingTrxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_pid")
    private Long waitingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_query")
    private String waitingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_lock_id")
    private String waitingLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_lock_mode")
    private String waitingLockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_id")
    private Long blockingTrxId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_pid")
    private Long blockingPid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_query")
    private String blockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_lock_id")
    private String blockingLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_lock_mode")
    private String blockingLockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_started")
    private Date blockingTrxStarted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_age")
    private Date blockingTrxAge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_rows_locked")
    private Long blockingTrxRowsLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_rows_modified")
    private Long blockingTrxRowsModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.sql_kill_blocking_query")
    private String sqlKillBlockingQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table")
    private String lockedTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: x$innodb_lock_waits")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_started")
    public Date getWaitStarted() {
        return waitStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_started")
    public void setWaitStarted(Date waitStarted) {
        this.waitStarted = waitStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_age")
    public Date getWaitAge() {
        return waitAge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_age")
    public void setWaitAge(Date waitAge) {
        this.waitAge = waitAge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_age_secs")
    public Long getWaitAgeSecs() {
        return waitAgeSecs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.wait_age_secs")
    public void setWaitAgeSecs(Long waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_schema")
    public String getLockedTableSchema() {
        return lockedTableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_schema")
    public void setLockedTableSchema(String lockedTableSchema) {
        this.lockedTableSchema = lockedTableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_name")
    public String getLockedTableName() {
        return lockedTableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_name")
    public void setLockedTableName(String lockedTableName) {
        this.lockedTableName = lockedTableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_partition")
    public String getLockedTablePartition() {
        return lockedTablePartition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_partition")
    public void setLockedTablePartition(String lockedTablePartition) {
        this.lockedTablePartition = lockedTablePartition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_subpartition")
    public String getLockedTableSubpartition() {
        return lockedTableSubpartition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table_subpartition")
    public void setLockedTableSubpartition(String lockedTableSubpartition) {
        this.lockedTableSubpartition = lockedTableSubpartition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_index")
    public String getLockedIndex() {
        return lockedIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_index")
    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_type")
    public String getLockedType() {
        return lockedType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_type")
    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_id")
    public Long getWaitingTrxId() {
        return waitingTrxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_id")
    public void setWaitingTrxId(Long waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_started")
    public Date getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_started")
    public void setWaitingTrxStarted(Date waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_age")
    public Date getWaitingTrxAge() {
        return waitingTrxAge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_age")
    public void setWaitingTrxAge(Date waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_rows_locked")
    public Long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_rows_locked")
    public void setWaitingTrxRowsLocked(Long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_rows_modified")
    public Long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_trx_rows_modified")
    public void setWaitingTrxRowsModified(Long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_pid")
    public Long getWaitingPid() {
        return waitingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_pid")
    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_query")
    public String getWaitingQuery() {
        return waitingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_query")
    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_lock_id")
    public String getWaitingLockId() {
        return waitingLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_lock_id")
    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_lock_mode")
    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.waiting_lock_mode")
    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_id")
    public Long getBlockingTrxId() {
        return blockingTrxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_id")
    public void setBlockingTrxId(Long blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_pid")
    public Long getBlockingPid() {
        return blockingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_pid")
    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_query")
    public String getBlockingQuery() {
        return blockingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_query")
    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_lock_id")
    public String getBlockingLockId() {
        return blockingLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_lock_id")
    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_lock_mode")
    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_lock_mode")
    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_started")
    public Date getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_started")
    public void setBlockingTrxStarted(Date blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_age")
    public Date getBlockingTrxAge() {
        return blockingTrxAge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_age")
    public void setBlockingTrxAge(Date blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_rows_locked")
    public Long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_rows_locked")
    public void setBlockingTrxRowsLocked(Long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_rows_modified")
    public Long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.blocking_trx_rows_modified")
    public void setBlockingTrxRowsModified(Long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.sql_kill_blocking_query")
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.sql_kill_blocking_query")
    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.sql_kill_blocking_connection")
    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.sql_kill_blocking_connection")
    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table")
    public String getLockedTable() {
        return lockedTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source field: x$innodb_lock_waits.locked_table")
    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: x$innodb_lock_waits")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", waitStarted=").append(waitStarted);
        sb.append(", waitAge=").append(waitAge);
        sb.append(", waitAgeSecs=").append(waitAgeSecs);
        sb.append(", lockedTableSchema=").append(lockedTableSchema);
        sb.append(", lockedTableName=").append(lockedTableName);
        sb.append(", lockedTablePartition=").append(lockedTablePartition);
        sb.append(", lockedTableSubpartition=").append(lockedTableSubpartition);
        sb.append(", lockedIndex=").append(lockedIndex);
        sb.append(", lockedType=").append(lockedType);
        sb.append(", waitingTrxId=").append(waitingTrxId);
        sb.append(", waitingTrxStarted=").append(waitingTrxStarted);
        sb.append(", waitingTrxAge=").append(waitingTrxAge);
        sb.append(", waitingTrxRowsLocked=").append(waitingTrxRowsLocked);
        sb.append(", waitingTrxRowsModified=").append(waitingTrxRowsModified);
        sb.append(", waitingPid=").append(waitingPid);
        sb.append(", waitingQuery=").append(waitingQuery);
        sb.append(", waitingLockId=").append(waitingLockId);
        sb.append(", waitingLockMode=").append(waitingLockMode);
        sb.append(", blockingTrxId=").append(blockingTrxId);
        sb.append(", blockingPid=").append(blockingPid);
        sb.append(", blockingQuery=").append(blockingQuery);
        sb.append(", blockingLockId=").append(blockingLockId);
        sb.append(", blockingLockMode=").append(blockingLockMode);
        sb.append(", blockingTrxStarted=").append(blockingTrxStarted);
        sb.append(", blockingTrxAge=").append(blockingTrxAge);
        sb.append(", blockingTrxRowsLocked=").append(blockingTrxRowsLocked);
        sb.append(", blockingTrxRowsModified=").append(blockingTrxRowsModified);
        sb.append(", sqlKillBlockingQuery=").append(sqlKillBlockingQuery);
        sb.append(", sqlKillBlockingConnection=").append(sqlKillBlockingConnection);
        sb.append(", lockedTable=").append(lockedTable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: x$innodb_lock_waits")
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
        XInnodbLockWaits other = (XInnodbLockWaits) that;
        return (this.getWaitStarted() == null ? other.getWaitStarted() == null : this.getWaitStarted().equals(other.getWaitStarted()))
            && (this.getWaitAge() == null ? other.getWaitAge() == null : this.getWaitAge().equals(other.getWaitAge()))
            && (this.getWaitAgeSecs() == null ? other.getWaitAgeSecs() == null : this.getWaitAgeSecs().equals(other.getWaitAgeSecs()))
            && (this.getLockedTableSchema() == null ? other.getLockedTableSchema() == null : this.getLockedTableSchema().equals(other.getLockedTableSchema()))
            && (this.getLockedTableName() == null ? other.getLockedTableName() == null : this.getLockedTableName().equals(other.getLockedTableName()))
            && (this.getLockedTablePartition() == null ? other.getLockedTablePartition() == null : this.getLockedTablePartition().equals(other.getLockedTablePartition()))
            && (this.getLockedTableSubpartition() == null ? other.getLockedTableSubpartition() == null : this.getLockedTableSubpartition().equals(other.getLockedTableSubpartition()))
            && (this.getLockedIndex() == null ? other.getLockedIndex() == null : this.getLockedIndex().equals(other.getLockedIndex()))
            && (this.getLockedType() == null ? other.getLockedType() == null : this.getLockedType().equals(other.getLockedType()))
            && (this.getWaitingTrxId() == null ? other.getWaitingTrxId() == null : this.getWaitingTrxId().equals(other.getWaitingTrxId()))
            && (this.getWaitingTrxStarted() == null ? other.getWaitingTrxStarted() == null : this.getWaitingTrxStarted().equals(other.getWaitingTrxStarted()))
            && (this.getWaitingTrxAge() == null ? other.getWaitingTrxAge() == null : this.getWaitingTrxAge().equals(other.getWaitingTrxAge()))
            && (this.getWaitingTrxRowsLocked() == null ? other.getWaitingTrxRowsLocked() == null : this.getWaitingTrxRowsLocked().equals(other.getWaitingTrxRowsLocked()))
            && (this.getWaitingTrxRowsModified() == null ? other.getWaitingTrxRowsModified() == null : this.getWaitingTrxRowsModified().equals(other.getWaitingTrxRowsModified()))
            && (this.getWaitingPid() == null ? other.getWaitingPid() == null : this.getWaitingPid().equals(other.getWaitingPid()))
            && (this.getWaitingQuery() == null ? other.getWaitingQuery() == null : this.getWaitingQuery().equals(other.getWaitingQuery()))
            && (this.getWaitingLockId() == null ? other.getWaitingLockId() == null : this.getWaitingLockId().equals(other.getWaitingLockId()))
            && (this.getWaitingLockMode() == null ? other.getWaitingLockMode() == null : this.getWaitingLockMode().equals(other.getWaitingLockMode()))
            && (this.getBlockingTrxId() == null ? other.getBlockingTrxId() == null : this.getBlockingTrxId().equals(other.getBlockingTrxId()))
            && (this.getBlockingPid() == null ? other.getBlockingPid() == null : this.getBlockingPid().equals(other.getBlockingPid()))
            && (this.getBlockingQuery() == null ? other.getBlockingQuery() == null : this.getBlockingQuery().equals(other.getBlockingQuery()))
            && (this.getBlockingLockId() == null ? other.getBlockingLockId() == null : this.getBlockingLockId().equals(other.getBlockingLockId()))
            && (this.getBlockingLockMode() == null ? other.getBlockingLockMode() == null : this.getBlockingLockMode().equals(other.getBlockingLockMode()))
            && (this.getBlockingTrxStarted() == null ? other.getBlockingTrxStarted() == null : this.getBlockingTrxStarted().equals(other.getBlockingTrxStarted()))
            && (this.getBlockingTrxAge() == null ? other.getBlockingTrxAge() == null : this.getBlockingTrxAge().equals(other.getBlockingTrxAge()))
            && (this.getBlockingTrxRowsLocked() == null ? other.getBlockingTrxRowsLocked() == null : this.getBlockingTrxRowsLocked().equals(other.getBlockingTrxRowsLocked()))
            && (this.getBlockingTrxRowsModified() == null ? other.getBlockingTrxRowsModified() == null : this.getBlockingTrxRowsModified().equals(other.getBlockingTrxRowsModified()))
            && (this.getSqlKillBlockingQuery() == null ? other.getSqlKillBlockingQuery() == null : this.getSqlKillBlockingQuery().equals(other.getSqlKillBlockingQuery()))
            && (this.getSqlKillBlockingConnection() == null ? other.getSqlKillBlockingConnection() == null : this.getSqlKillBlockingConnection().equals(other.getSqlKillBlockingConnection()))
            && (this.getLockedTable() == null ? other.getLockedTable() == null : this.getLockedTable().equals(other.getLockedTable()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2399334+08:00", comments="Source Table: x$innodb_lock_waits")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWaitStarted() == null) ? 0 : getWaitStarted().hashCode());
        result = prime * result + ((getWaitAge() == null) ? 0 : getWaitAge().hashCode());
        result = prime * result + ((getWaitAgeSecs() == null) ? 0 : getWaitAgeSecs().hashCode());
        result = prime * result + ((getLockedTableSchema() == null) ? 0 : getLockedTableSchema().hashCode());
        result = prime * result + ((getLockedTableName() == null) ? 0 : getLockedTableName().hashCode());
        result = prime * result + ((getLockedTablePartition() == null) ? 0 : getLockedTablePartition().hashCode());
        result = prime * result + ((getLockedTableSubpartition() == null) ? 0 : getLockedTableSubpartition().hashCode());
        result = prime * result + ((getLockedIndex() == null) ? 0 : getLockedIndex().hashCode());
        result = prime * result + ((getLockedType() == null) ? 0 : getLockedType().hashCode());
        result = prime * result + ((getWaitingTrxId() == null) ? 0 : getWaitingTrxId().hashCode());
        result = prime * result + ((getWaitingTrxStarted() == null) ? 0 : getWaitingTrxStarted().hashCode());
        result = prime * result + ((getWaitingTrxAge() == null) ? 0 : getWaitingTrxAge().hashCode());
        result = prime * result + ((getWaitingTrxRowsLocked() == null) ? 0 : getWaitingTrxRowsLocked().hashCode());
        result = prime * result + ((getWaitingTrxRowsModified() == null) ? 0 : getWaitingTrxRowsModified().hashCode());
        result = prime * result + ((getWaitingPid() == null) ? 0 : getWaitingPid().hashCode());
        result = prime * result + ((getWaitingQuery() == null) ? 0 : getWaitingQuery().hashCode());
        result = prime * result + ((getWaitingLockId() == null) ? 0 : getWaitingLockId().hashCode());
        result = prime * result + ((getWaitingLockMode() == null) ? 0 : getWaitingLockMode().hashCode());
        result = prime * result + ((getBlockingTrxId() == null) ? 0 : getBlockingTrxId().hashCode());
        result = prime * result + ((getBlockingPid() == null) ? 0 : getBlockingPid().hashCode());
        result = prime * result + ((getBlockingQuery() == null) ? 0 : getBlockingQuery().hashCode());
        result = prime * result + ((getBlockingLockId() == null) ? 0 : getBlockingLockId().hashCode());
        result = prime * result + ((getBlockingLockMode() == null) ? 0 : getBlockingLockMode().hashCode());
        result = prime * result + ((getBlockingTrxStarted() == null) ? 0 : getBlockingTrxStarted().hashCode());
        result = prime * result + ((getBlockingTrxAge() == null) ? 0 : getBlockingTrxAge().hashCode());
        result = prime * result + ((getBlockingTrxRowsLocked() == null) ? 0 : getBlockingTrxRowsLocked().hashCode());
        result = prime * result + ((getBlockingTrxRowsModified() == null) ? 0 : getBlockingTrxRowsModified().hashCode());
        result = prime * result + ((getSqlKillBlockingQuery() == null) ? 0 : getSqlKillBlockingQuery().hashCode());
        result = prime * result + ((getSqlKillBlockingConnection() == null) ? 0 : getSqlKillBlockingConnection().hashCode());
        result = prime * result + ((getLockedTable() == null) ? 0 : getLockedTable().hashCode());
        return result;
    }
}