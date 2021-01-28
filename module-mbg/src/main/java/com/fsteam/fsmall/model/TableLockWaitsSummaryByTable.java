package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TableLockWaitsSummaryByTable implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_TYPE")
    private String objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_STAR")
    private Long countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ")
    private Long countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ")
    private Long sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ")
    private Long minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ")
    private Long avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ")
    private Long maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE")
    private Long countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE")
    private Long sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE")
    private Long minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE")
    private Long avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE")
    private Long maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NORMAL")
    private Long countReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL")
    private Long sumTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL")
    private Long minTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL")
    private Long avgTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL")
    private Long maxTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS")
    private Long countReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS")
    private Long sumTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS")
    private Long minTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS")
    private Long avgTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS")
    private Long maxTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY")
    private Long countReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY")
    private Long sumTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY")
    private Long minTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY")
    private Long avgTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY")
    private Long maxTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT")
    private Long countReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT")
    private Long sumTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT")
    private Long minTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT")
    private Long avgTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT")
    private Long maxTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL")
    private Long countReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL")
    private Long sumTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL")
    private Long minTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL")
    private Long avgTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL")
    private Long maxTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE")
    private Long countWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE")
    private Long sumTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE")
    private Long minTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE")
    private Long avgTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE")
    private Long maxTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT")
    private Long countWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT")
    private Long sumTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT")
    private Long minTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT")
    private Long avgTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT")
    private Long maxTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY")
    private Long countWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY")
    private Long sumTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY")
    private Long minTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY")
    private Long avgTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY")
    private Long maxTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL")
    private Long countWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL")
    private Long sumTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL")
    private Long minTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL")
    private Long avgTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL")
    private Long maxTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL")
    private Long countWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL")
    private Long sumTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL")
    private Long minTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL")
    private Long avgTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL")
    private Long maxTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_TYPE")
    public String getObjectType() {
        return objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_TYPE")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_STAR")
    public Long getCountStar() {
        return countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_STAR")
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WAIT")
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WAIT")
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WAIT")
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WAIT")
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WAIT")
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WAIT")
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WAIT")
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WAIT")
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ")
    public Long getCountRead() {
        return countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ")
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ")
    public Long getSumTimerRead() {
        return sumTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ")
    public void setSumTimerRead(Long sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ")
    public Long getMinTimerRead() {
        return minTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ")
    public void setMinTimerRead(Long minTimerRead) {
        this.minTimerRead = minTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ")
    public Long getAvgTimerRead() {
        return avgTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ")
    public void setAvgTimerRead(Long avgTimerRead) {
        this.avgTimerRead = avgTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ")
    public Long getMaxTimerRead() {
        return maxTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ")
    public void setMaxTimerRead(Long maxTimerRead) {
        this.maxTimerRead = maxTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE")
    public Long getCountWrite() {
        return countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE")
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE")
    public Long getSumTimerWrite() {
        return sumTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE")
    public void setSumTimerWrite(Long sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE")
    public Long getMinTimerWrite() {
        return minTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE")
    public void setMinTimerWrite(Long minTimerWrite) {
        this.minTimerWrite = minTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE")
    public Long getAvgTimerWrite() {
        return avgTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE")
    public void setAvgTimerWrite(Long avgTimerWrite) {
        this.avgTimerWrite = avgTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE")
    public Long getMaxTimerWrite() {
        return maxTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE")
    public void setMaxTimerWrite(Long maxTimerWrite) {
        this.maxTimerWrite = maxTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NORMAL")
    public Long getCountReadNormal() {
        return countReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NORMAL")
    public void setCountReadNormal(Long countReadNormal) {
        this.countReadNormal = countReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL")
    public Long getSumTimerReadNormal() {
        return sumTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL")
    public void setSumTimerReadNormal(Long sumTimerReadNormal) {
        this.sumTimerReadNormal = sumTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL")
    public Long getMinTimerReadNormal() {
        return minTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL")
    public void setMinTimerReadNormal(Long minTimerReadNormal) {
        this.minTimerReadNormal = minTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL")
    public Long getAvgTimerReadNormal() {
        return avgTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL")
    public void setAvgTimerReadNormal(Long avgTimerReadNormal) {
        this.avgTimerReadNormal = avgTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL")
    public Long getMaxTimerReadNormal() {
        return maxTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL")
    public void setMaxTimerReadNormal(Long maxTimerReadNormal) {
        this.maxTimerReadNormal = maxTimerReadNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS")
    public Long getCountReadWithSharedLocks() {
        return countReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS")
    public void setCountReadWithSharedLocks(Long countReadWithSharedLocks) {
        this.countReadWithSharedLocks = countReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS")
    public Long getSumTimerReadWithSharedLocks() {
        return sumTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS")
    public void setSumTimerReadWithSharedLocks(Long sumTimerReadWithSharedLocks) {
        this.sumTimerReadWithSharedLocks = sumTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS")
    public Long getMinTimerReadWithSharedLocks() {
        return minTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS")
    public void setMinTimerReadWithSharedLocks(Long minTimerReadWithSharedLocks) {
        this.minTimerReadWithSharedLocks = minTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS")
    public Long getAvgTimerReadWithSharedLocks() {
        return avgTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS")
    public void setAvgTimerReadWithSharedLocks(Long avgTimerReadWithSharedLocks) {
        this.avgTimerReadWithSharedLocks = avgTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS")
    public Long getMaxTimerReadWithSharedLocks() {
        return maxTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS")
    public void setMaxTimerReadWithSharedLocks(Long maxTimerReadWithSharedLocks) {
        this.maxTimerReadWithSharedLocks = maxTimerReadWithSharedLocks;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY")
    public Long getCountReadHighPriority() {
        return countReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY")
    public void setCountReadHighPriority(Long countReadHighPriority) {
        this.countReadHighPriority = countReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY")
    public Long getSumTimerReadHighPriority() {
        return sumTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY")
    public void setSumTimerReadHighPriority(Long sumTimerReadHighPriority) {
        this.sumTimerReadHighPriority = sumTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY")
    public Long getMinTimerReadHighPriority() {
        return minTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY")
    public void setMinTimerReadHighPriority(Long minTimerReadHighPriority) {
        this.minTimerReadHighPriority = minTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY")
    public Long getAvgTimerReadHighPriority() {
        return avgTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY")
    public void setAvgTimerReadHighPriority(Long avgTimerReadHighPriority) {
        this.avgTimerReadHighPriority = avgTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY")
    public Long getMaxTimerReadHighPriority() {
        return maxTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY")
    public void setMaxTimerReadHighPriority(Long maxTimerReadHighPriority) {
        this.maxTimerReadHighPriority = maxTimerReadHighPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT")
    public Long getCountReadNoInsert() {
        return countReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT")
    public void setCountReadNoInsert(Long countReadNoInsert) {
        this.countReadNoInsert = countReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT")
    public Long getSumTimerReadNoInsert() {
        return sumTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT")
    public void setSumTimerReadNoInsert(Long sumTimerReadNoInsert) {
        this.sumTimerReadNoInsert = sumTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT")
    public Long getMinTimerReadNoInsert() {
        return minTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT")
    public void setMinTimerReadNoInsert(Long minTimerReadNoInsert) {
        this.minTimerReadNoInsert = minTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT")
    public Long getAvgTimerReadNoInsert() {
        return avgTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT")
    public void setAvgTimerReadNoInsert(Long avgTimerReadNoInsert) {
        this.avgTimerReadNoInsert = avgTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT")
    public Long getMaxTimerReadNoInsert() {
        return maxTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT")
    public void setMaxTimerReadNoInsert(Long maxTimerReadNoInsert) {
        this.maxTimerReadNoInsert = maxTimerReadNoInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL")
    public Long getCountReadExternal() {
        return countReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL")
    public void setCountReadExternal(Long countReadExternal) {
        this.countReadExternal = countReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL")
    public Long getSumTimerReadExternal() {
        return sumTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL")
    public void setSumTimerReadExternal(Long sumTimerReadExternal) {
        this.sumTimerReadExternal = sumTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL")
    public Long getMinTimerReadExternal() {
        return minTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL")
    public void setMinTimerReadExternal(Long minTimerReadExternal) {
        this.minTimerReadExternal = minTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL")
    public Long getAvgTimerReadExternal() {
        return avgTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL")
    public void setAvgTimerReadExternal(Long avgTimerReadExternal) {
        this.avgTimerReadExternal = avgTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL")
    public Long getMaxTimerReadExternal() {
        return maxTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL")
    public void setMaxTimerReadExternal(Long maxTimerReadExternal) {
        this.maxTimerReadExternal = maxTimerReadExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE")
    public Long getCountWriteAllowWrite() {
        return countWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE")
    public void setCountWriteAllowWrite(Long countWriteAllowWrite) {
        this.countWriteAllowWrite = countWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE")
    public Long getSumTimerWriteAllowWrite() {
        return sumTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE")
    public void setSumTimerWriteAllowWrite(Long sumTimerWriteAllowWrite) {
        this.sumTimerWriteAllowWrite = sumTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE")
    public Long getMinTimerWriteAllowWrite() {
        return minTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE")
    public void setMinTimerWriteAllowWrite(Long minTimerWriteAllowWrite) {
        this.minTimerWriteAllowWrite = minTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5372048+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE")
    public Long getAvgTimerWriteAllowWrite() {
        return avgTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE")
    public void setAvgTimerWriteAllowWrite(Long avgTimerWriteAllowWrite) {
        this.avgTimerWriteAllowWrite = avgTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE")
    public Long getMaxTimerWriteAllowWrite() {
        return maxTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE")
    public void setMaxTimerWriteAllowWrite(Long maxTimerWriteAllowWrite) {
        this.maxTimerWriteAllowWrite = maxTimerWriteAllowWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT")
    public Long getCountWriteConcurrentInsert() {
        return countWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT")
    public void setCountWriteConcurrentInsert(Long countWriteConcurrentInsert) {
        this.countWriteConcurrentInsert = countWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT")
    public Long getSumTimerWriteConcurrentInsert() {
        return sumTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT")
    public void setSumTimerWriteConcurrentInsert(Long sumTimerWriteConcurrentInsert) {
        this.sumTimerWriteConcurrentInsert = sumTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT")
    public Long getMinTimerWriteConcurrentInsert() {
        return minTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT")
    public void setMinTimerWriteConcurrentInsert(Long minTimerWriteConcurrentInsert) {
        this.minTimerWriteConcurrentInsert = minTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT")
    public Long getAvgTimerWriteConcurrentInsert() {
        return avgTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT")
    public void setAvgTimerWriteConcurrentInsert(Long avgTimerWriteConcurrentInsert) {
        this.avgTimerWriteConcurrentInsert = avgTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT")
    public Long getMaxTimerWriteConcurrentInsert() {
        return maxTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT")
    public void setMaxTimerWriteConcurrentInsert(Long maxTimerWriteConcurrentInsert) {
        this.maxTimerWriteConcurrentInsert = maxTimerWriteConcurrentInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY")
    public Long getCountWriteLowPriority() {
        return countWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY")
    public void setCountWriteLowPriority(Long countWriteLowPriority) {
        this.countWriteLowPriority = countWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY")
    public Long getSumTimerWriteLowPriority() {
        return sumTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY")
    public void setSumTimerWriteLowPriority(Long sumTimerWriteLowPriority) {
        this.sumTimerWriteLowPriority = sumTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY")
    public Long getMinTimerWriteLowPriority() {
        return minTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY")
    public void setMinTimerWriteLowPriority(Long minTimerWriteLowPriority) {
        this.minTimerWriteLowPriority = minTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY")
    public Long getAvgTimerWriteLowPriority() {
        return avgTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY")
    public void setAvgTimerWriteLowPriority(Long avgTimerWriteLowPriority) {
        this.avgTimerWriteLowPriority = avgTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY")
    public Long getMaxTimerWriteLowPriority() {
        return maxTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY")
    public void setMaxTimerWriteLowPriority(Long maxTimerWriteLowPriority) {
        this.maxTimerWriteLowPriority = maxTimerWriteLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL")
    public Long getCountWriteNormal() {
        return countWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL")
    public void setCountWriteNormal(Long countWriteNormal) {
        this.countWriteNormal = countWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL")
    public Long getSumTimerWriteNormal() {
        return sumTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL")
    public void setSumTimerWriteNormal(Long sumTimerWriteNormal) {
        this.sumTimerWriteNormal = sumTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL")
    public Long getMinTimerWriteNormal() {
        return minTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL")
    public void setMinTimerWriteNormal(Long minTimerWriteNormal) {
        this.minTimerWriteNormal = minTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL")
    public Long getAvgTimerWriteNormal() {
        return avgTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL")
    public void setAvgTimerWriteNormal(Long avgTimerWriteNormal) {
        this.avgTimerWriteNormal = avgTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL")
    public Long getMaxTimerWriteNormal() {
        return maxTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL")
    public void setMaxTimerWriteNormal(Long maxTimerWriteNormal) {
        this.maxTimerWriteNormal = maxTimerWriteNormal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL")
    public Long getCountWriteExternal() {
        return countWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL")
    public void setCountWriteExternal(Long countWriteExternal) {
        this.countWriteExternal = countWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL")
    public Long getSumTimerWriteExternal() {
        return sumTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL")
    public void setSumTimerWriteExternal(Long sumTimerWriteExternal) {
        this.sumTimerWriteExternal = sumTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL")
    public Long getMinTimerWriteExternal() {
        return minTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL")
    public void setMinTimerWriteExternal(Long minTimerWriteExternal) {
        this.minTimerWriteExternal = minTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL")
    public Long getAvgTimerWriteExternal() {
        return avgTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL")
    public void setAvgTimerWriteExternal(Long avgTimerWriteExternal) {
        this.avgTimerWriteExternal = avgTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL")
    public Long getMaxTimerWriteExternal() {
        return maxTimerWriteExternal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL")
    public void setMaxTimerWriteExternal(Long maxTimerWriteExternal) {
        this.maxTimerWriteExternal = maxTimerWriteExternal;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", countStar=").append(countStar);
        sb.append(", sumTimerWait=").append(sumTimerWait);
        sb.append(", minTimerWait=").append(minTimerWait);
        sb.append(", avgTimerWait=").append(avgTimerWait);
        sb.append(", maxTimerWait=").append(maxTimerWait);
        sb.append(", countRead=").append(countRead);
        sb.append(", sumTimerRead=").append(sumTimerRead);
        sb.append(", minTimerRead=").append(minTimerRead);
        sb.append(", avgTimerRead=").append(avgTimerRead);
        sb.append(", maxTimerRead=").append(maxTimerRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", sumTimerWrite=").append(sumTimerWrite);
        sb.append(", minTimerWrite=").append(minTimerWrite);
        sb.append(", avgTimerWrite=").append(avgTimerWrite);
        sb.append(", maxTimerWrite=").append(maxTimerWrite);
        sb.append(", countReadNormal=").append(countReadNormal);
        sb.append(", sumTimerReadNormal=").append(sumTimerReadNormal);
        sb.append(", minTimerReadNormal=").append(minTimerReadNormal);
        sb.append(", avgTimerReadNormal=").append(avgTimerReadNormal);
        sb.append(", maxTimerReadNormal=").append(maxTimerReadNormal);
        sb.append(", countReadWithSharedLocks=").append(countReadWithSharedLocks);
        sb.append(", sumTimerReadWithSharedLocks=").append(sumTimerReadWithSharedLocks);
        sb.append(", minTimerReadWithSharedLocks=").append(minTimerReadWithSharedLocks);
        sb.append(", avgTimerReadWithSharedLocks=").append(avgTimerReadWithSharedLocks);
        sb.append(", maxTimerReadWithSharedLocks=").append(maxTimerReadWithSharedLocks);
        sb.append(", countReadHighPriority=").append(countReadHighPriority);
        sb.append(", sumTimerReadHighPriority=").append(sumTimerReadHighPriority);
        sb.append(", minTimerReadHighPriority=").append(minTimerReadHighPriority);
        sb.append(", avgTimerReadHighPriority=").append(avgTimerReadHighPriority);
        sb.append(", maxTimerReadHighPriority=").append(maxTimerReadHighPriority);
        sb.append(", countReadNoInsert=").append(countReadNoInsert);
        sb.append(", sumTimerReadNoInsert=").append(sumTimerReadNoInsert);
        sb.append(", minTimerReadNoInsert=").append(minTimerReadNoInsert);
        sb.append(", avgTimerReadNoInsert=").append(avgTimerReadNoInsert);
        sb.append(", maxTimerReadNoInsert=").append(maxTimerReadNoInsert);
        sb.append(", countReadExternal=").append(countReadExternal);
        sb.append(", sumTimerReadExternal=").append(sumTimerReadExternal);
        sb.append(", minTimerReadExternal=").append(minTimerReadExternal);
        sb.append(", avgTimerReadExternal=").append(avgTimerReadExternal);
        sb.append(", maxTimerReadExternal=").append(maxTimerReadExternal);
        sb.append(", countWriteAllowWrite=").append(countWriteAllowWrite);
        sb.append(", sumTimerWriteAllowWrite=").append(sumTimerWriteAllowWrite);
        sb.append(", minTimerWriteAllowWrite=").append(minTimerWriteAllowWrite);
        sb.append(", avgTimerWriteAllowWrite=").append(avgTimerWriteAllowWrite);
        sb.append(", maxTimerWriteAllowWrite=").append(maxTimerWriteAllowWrite);
        sb.append(", countWriteConcurrentInsert=").append(countWriteConcurrentInsert);
        sb.append(", sumTimerWriteConcurrentInsert=").append(sumTimerWriteConcurrentInsert);
        sb.append(", minTimerWriteConcurrentInsert=").append(minTimerWriteConcurrentInsert);
        sb.append(", avgTimerWriteConcurrentInsert=").append(avgTimerWriteConcurrentInsert);
        sb.append(", maxTimerWriteConcurrentInsert=").append(maxTimerWriteConcurrentInsert);
        sb.append(", countWriteLowPriority=").append(countWriteLowPriority);
        sb.append(", sumTimerWriteLowPriority=").append(sumTimerWriteLowPriority);
        sb.append(", minTimerWriteLowPriority=").append(minTimerWriteLowPriority);
        sb.append(", avgTimerWriteLowPriority=").append(avgTimerWriteLowPriority);
        sb.append(", maxTimerWriteLowPriority=").append(maxTimerWriteLowPriority);
        sb.append(", countWriteNormal=").append(countWriteNormal);
        sb.append(", sumTimerWriteNormal=").append(sumTimerWriteNormal);
        sb.append(", minTimerWriteNormal=").append(minTimerWriteNormal);
        sb.append(", avgTimerWriteNormal=").append(avgTimerWriteNormal);
        sb.append(", maxTimerWriteNormal=").append(maxTimerWriteNormal);
        sb.append(", countWriteExternal=").append(countWriteExternal);
        sb.append(", sumTimerWriteExternal=").append(sumTimerWriteExternal);
        sb.append(", minTimerWriteExternal=").append(minTimerWriteExternal);
        sb.append(", avgTimerWriteExternal=").append(avgTimerWriteExternal);
        sb.append(", maxTimerWriteExternal=").append(maxTimerWriteExternal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source Table: table_lock_waits_summary_by_table")
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
        TableLockWaitsSummaryByTable other = (TableLockWaitsSummaryByTable) that;
        return (this.getObjectType() == null ? other.getObjectType() == null : this.getObjectType().equals(other.getObjectType()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getCountStar() == null ? other.getCountStar() == null : this.getCountStar().equals(other.getCountStar()))
            && (this.getSumTimerWait() == null ? other.getSumTimerWait() == null : this.getSumTimerWait().equals(other.getSumTimerWait()))
            && (this.getMinTimerWait() == null ? other.getMinTimerWait() == null : this.getMinTimerWait().equals(other.getMinTimerWait()))
            && (this.getAvgTimerWait() == null ? other.getAvgTimerWait() == null : this.getAvgTimerWait().equals(other.getAvgTimerWait()))
            && (this.getMaxTimerWait() == null ? other.getMaxTimerWait() == null : this.getMaxTimerWait().equals(other.getMaxTimerWait()))
            && (this.getCountRead() == null ? other.getCountRead() == null : this.getCountRead().equals(other.getCountRead()))
            && (this.getSumTimerRead() == null ? other.getSumTimerRead() == null : this.getSumTimerRead().equals(other.getSumTimerRead()))
            && (this.getMinTimerRead() == null ? other.getMinTimerRead() == null : this.getMinTimerRead().equals(other.getMinTimerRead()))
            && (this.getAvgTimerRead() == null ? other.getAvgTimerRead() == null : this.getAvgTimerRead().equals(other.getAvgTimerRead()))
            && (this.getMaxTimerRead() == null ? other.getMaxTimerRead() == null : this.getMaxTimerRead().equals(other.getMaxTimerRead()))
            && (this.getCountWrite() == null ? other.getCountWrite() == null : this.getCountWrite().equals(other.getCountWrite()))
            && (this.getSumTimerWrite() == null ? other.getSumTimerWrite() == null : this.getSumTimerWrite().equals(other.getSumTimerWrite()))
            && (this.getMinTimerWrite() == null ? other.getMinTimerWrite() == null : this.getMinTimerWrite().equals(other.getMinTimerWrite()))
            && (this.getAvgTimerWrite() == null ? other.getAvgTimerWrite() == null : this.getAvgTimerWrite().equals(other.getAvgTimerWrite()))
            && (this.getMaxTimerWrite() == null ? other.getMaxTimerWrite() == null : this.getMaxTimerWrite().equals(other.getMaxTimerWrite()))
            && (this.getCountReadNormal() == null ? other.getCountReadNormal() == null : this.getCountReadNormal().equals(other.getCountReadNormal()))
            && (this.getSumTimerReadNormal() == null ? other.getSumTimerReadNormal() == null : this.getSumTimerReadNormal().equals(other.getSumTimerReadNormal()))
            && (this.getMinTimerReadNormal() == null ? other.getMinTimerReadNormal() == null : this.getMinTimerReadNormal().equals(other.getMinTimerReadNormal()))
            && (this.getAvgTimerReadNormal() == null ? other.getAvgTimerReadNormal() == null : this.getAvgTimerReadNormal().equals(other.getAvgTimerReadNormal()))
            && (this.getMaxTimerReadNormal() == null ? other.getMaxTimerReadNormal() == null : this.getMaxTimerReadNormal().equals(other.getMaxTimerReadNormal()))
            && (this.getCountReadWithSharedLocks() == null ? other.getCountReadWithSharedLocks() == null : this.getCountReadWithSharedLocks().equals(other.getCountReadWithSharedLocks()))
            && (this.getSumTimerReadWithSharedLocks() == null ? other.getSumTimerReadWithSharedLocks() == null : this.getSumTimerReadWithSharedLocks().equals(other.getSumTimerReadWithSharedLocks()))
            && (this.getMinTimerReadWithSharedLocks() == null ? other.getMinTimerReadWithSharedLocks() == null : this.getMinTimerReadWithSharedLocks().equals(other.getMinTimerReadWithSharedLocks()))
            && (this.getAvgTimerReadWithSharedLocks() == null ? other.getAvgTimerReadWithSharedLocks() == null : this.getAvgTimerReadWithSharedLocks().equals(other.getAvgTimerReadWithSharedLocks()))
            && (this.getMaxTimerReadWithSharedLocks() == null ? other.getMaxTimerReadWithSharedLocks() == null : this.getMaxTimerReadWithSharedLocks().equals(other.getMaxTimerReadWithSharedLocks()))
            && (this.getCountReadHighPriority() == null ? other.getCountReadHighPriority() == null : this.getCountReadHighPriority().equals(other.getCountReadHighPriority()))
            && (this.getSumTimerReadHighPriority() == null ? other.getSumTimerReadHighPriority() == null : this.getSumTimerReadHighPriority().equals(other.getSumTimerReadHighPriority()))
            && (this.getMinTimerReadHighPriority() == null ? other.getMinTimerReadHighPriority() == null : this.getMinTimerReadHighPriority().equals(other.getMinTimerReadHighPriority()))
            && (this.getAvgTimerReadHighPriority() == null ? other.getAvgTimerReadHighPriority() == null : this.getAvgTimerReadHighPriority().equals(other.getAvgTimerReadHighPriority()))
            && (this.getMaxTimerReadHighPriority() == null ? other.getMaxTimerReadHighPriority() == null : this.getMaxTimerReadHighPriority().equals(other.getMaxTimerReadHighPriority()))
            && (this.getCountReadNoInsert() == null ? other.getCountReadNoInsert() == null : this.getCountReadNoInsert().equals(other.getCountReadNoInsert()))
            && (this.getSumTimerReadNoInsert() == null ? other.getSumTimerReadNoInsert() == null : this.getSumTimerReadNoInsert().equals(other.getSumTimerReadNoInsert()))
            && (this.getMinTimerReadNoInsert() == null ? other.getMinTimerReadNoInsert() == null : this.getMinTimerReadNoInsert().equals(other.getMinTimerReadNoInsert()))
            && (this.getAvgTimerReadNoInsert() == null ? other.getAvgTimerReadNoInsert() == null : this.getAvgTimerReadNoInsert().equals(other.getAvgTimerReadNoInsert()))
            && (this.getMaxTimerReadNoInsert() == null ? other.getMaxTimerReadNoInsert() == null : this.getMaxTimerReadNoInsert().equals(other.getMaxTimerReadNoInsert()))
            && (this.getCountReadExternal() == null ? other.getCountReadExternal() == null : this.getCountReadExternal().equals(other.getCountReadExternal()))
            && (this.getSumTimerReadExternal() == null ? other.getSumTimerReadExternal() == null : this.getSumTimerReadExternal().equals(other.getSumTimerReadExternal()))
            && (this.getMinTimerReadExternal() == null ? other.getMinTimerReadExternal() == null : this.getMinTimerReadExternal().equals(other.getMinTimerReadExternal()))
            && (this.getAvgTimerReadExternal() == null ? other.getAvgTimerReadExternal() == null : this.getAvgTimerReadExternal().equals(other.getAvgTimerReadExternal()))
            && (this.getMaxTimerReadExternal() == null ? other.getMaxTimerReadExternal() == null : this.getMaxTimerReadExternal().equals(other.getMaxTimerReadExternal()))
            && (this.getCountWriteAllowWrite() == null ? other.getCountWriteAllowWrite() == null : this.getCountWriteAllowWrite().equals(other.getCountWriteAllowWrite()))
            && (this.getSumTimerWriteAllowWrite() == null ? other.getSumTimerWriteAllowWrite() == null : this.getSumTimerWriteAllowWrite().equals(other.getSumTimerWriteAllowWrite()))
            && (this.getMinTimerWriteAllowWrite() == null ? other.getMinTimerWriteAllowWrite() == null : this.getMinTimerWriteAllowWrite().equals(other.getMinTimerWriteAllowWrite()))
            && (this.getAvgTimerWriteAllowWrite() == null ? other.getAvgTimerWriteAllowWrite() == null : this.getAvgTimerWriteAllowWrite().equals(other.getAvgTimerWriteAllowWrite()))
            && (this.getMaxTimerWriteAllowWrite() == null ? other.getMaxTimerWriteAllowWrite() == null : this.getMaxTimerWriteAllowWrite().equals(other.getMaxTimerWriteAllowWrite()))
            && (this.getCountWriteConcurrentInsert() == null ? other.getCountWriteConcurrentInsert() == null : this.getCountWriteConcurrentInsert().equals(other.getCountWriteConcurrentInsert()))
            && (this.getSumTimerWriteConcurrentInsert() == null ? other.getSumTimerWriteConcurrentInsert() == null : this.getSumTimerWriteConcurrentInsert().equals(other.getSumTimerWriteConcurrentInsert()))
            && (this.getMinTimerWriteConcurrentInsert() == null ? other.getMinTimerWriteConcurrentInsert() == null : this.getMinTimerWriteConcurrentInsert().equals(other.getMinTimerWriteConcurrentInsert()))
            && (this.getAvgTimerWriteConcurrentInsert() == null ? other.getAvgTimerWriteConcurrentInsert() == null : this.getAvgTimerWriteConcurrentInsert().equals(other.getAvgTimerWriteConcurrentInsert()))
            && (this.getMaxTimerWriteConcurrentInsert() == null ? other.getMaxTimerWriteConcurrentInsert() == null : this.getMaxTimerWriteConcurrentInsert().equals(other.getMaxTimerWriteConcurrentInsert()))
            && (this.getCountWriteLowPriority() == null ? other.getCountWriteLowPriority() == null : this.getCountWriteLowPriority().equals(other.getCountWriteLowPriority()))
            && (this.getSumTimerWriteLowPriority() == null ? other.getSumTimerWriteLowPriority() == null : this.getSumTimerWriteLowPriority().equals(other.getSumTimerWriteLowPriority()))
            && (this.getMinTimerWriteLowPriority() == null ? other.getMinTimerWriteLowPriority() == null : this.getMinTimerWriteLowPriority().equals(other.getMinTimerWriteLowPriority()))
            && (this.getAvgTimerWriteLowPriority() == null ? other.getAvgTimerWriteLowPriority() == null : this.getAvgTimerWriteLowPriority().equals(other.getAvgTimerWriteLowPriority()))
            && (this.getMaxTimerWriteLowPriority() == null ? other.getMaxTimerWriteLowPriority() == null : this.getMaxTimerWriteLowPriority().equals(other.getMaxTimerWriteLowPriority()))
            && (this.getCountWriteNormal() == null ? other.getCountWriteNormal() == null : this.getCountWriteNormal().equals(other.getCountWriteNormal()))
            && (this.getSumTimerWriteNormal() == null ? other.getSumTimerWriteNormal() == null : this.getSumTimerWriteNormal().equals(other.getSumTimerWriteNormal()))
            && (this.getMinTimerWriteNormal() == null ? other.getMinTimerWriteNormal() == null : this.getMinTimerWriteNormal().equals(other.getMinTimerWriteNormal()))
            && (this.getAvgTimerWriteNormal() == null ? other.getAvgTimerWriteNormal() == null : this.getAvgTimerWriteNormal().equals(other.getAvgTimerWriteNormal()))
            && (this.getMaxTimerWriteNormal() == null ? other.getMaxTimerWriteNormal() == null : this.getMaxTimerWriteNormal().equals(other.getMaxTimerWriteNormal()))
            && (this.getCountWriteExternal() == null ? other.getCountWriteExternal() == null : this.getCountWriteExternal().equals(other.getCountWriteExternal()))
            && (this.getSumTimerWriteExternal() == null ? other.getSumTimerWriteExternal() == null : this.getSumTimerWriteExternal().equals(other.getSumTimerWriteExternal()))
            && (this.getMinTimerWriteExternal() == null ? other.getMinTimerWriteExternal() == null : this.getMinTimerWriteExternal().equals(other.getMinTimerWriteExternal()))
            && (this.getAvgTimerWriteExternal() == null ? other.getAvgTimerWriteExternal() == null : this.getAvgTimerWriteExternal().equals(other.getAvgTimerWriteExternal()))
            && (this.getMaxTimerWriteExternal() == null ? other.getMaxTimerWriteExternal() == null : this.getMaxTimerWriteExternal().equals(other.getMaxTimerWriteExternal()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectType() == null) ? 0 : getObjectType().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getCountStar() == null) ? 0 : getCountStar().hashCode());
        result = prime * result + ((getSumTimerWait() == null) ? 0 : getSumTimerWait().hashCode());
        result = prime * result + ((getMinTimerWait() == null) ? 0 : getMinTimerWait().hashCode());
        result = prime * result + ((getAvgTimerWait() == null) ? 0 : getAvgTimerWait().hashCode());
        result = prime * result + ((getMaxTimerWait() == null) ? 0 : getMaxTimerWait().hashCode());
        result = prime * result + ((getCountRead() == null) ? 0 : getCountRead().hashCode());
        result = prime * result + ((getSumTimerRead() == null) ? 0 : getSumTimerRead().hashCode());
        result = prime * result + ((getMinTimerRead() == null) ? 0 : getMinTimerRead().hashCode());
        result = prime * result + ((getAvgTimerRead() == null) ? 0 : getAvgTimerRead().hashCode());
        result = prime * result + ((getMaxTimerRead() == null) ? 0 : getMaxTimerRead().hashCode());
        result = prime * result + ((getCountWrite() == null) ? 0 : getCountWrite().hashCode());
        result = prime * result + ((getSumTimerWrite() == null) ? 0 : getSumTimerWrite().hashCode());
        result = prime * result + ((getMinTimerWrite() == null) ? 0 : getMinTimerWrite().hashCode());
        result = prime * result + ((getAvgTimerWrite() == null) ? 0 : getAvgTimerWrite().hashCode());
        result = prime * result + ((getMaxTimerWrite() == null) ? 0 : getMaxTimerWrite().hashCode());
        result = prime * result + ((getCountReadNormal() == null) ? 0 : getCountReadNormal().hashCode());
        result = prime * result + ((getSumTimerReadNormal() == null) ? 0 : getSumTimerReadNormal().hashCode());
        result = prime * result + ((getMinTimerReadNormal() == null) ? 0 : getMinTimerReadNormal().hashCode());
        result = prime * result + ((getAvgTimerReadNormal() == null) ? 0 : getAvgTimerReadNormal().hashCode());
        result = prime * result + ((getMaxTimerReadNormal() == null) ? 0 : getMaxTimerReadNormal().hashCode());
        result = prime * result + ((getCountReadWithSharedLocks() == null) ? 0 : getCountReadWithSharedLocks().hashCode());
        result = prime * result + ((getSumTimerReadWithSharedLocks() == null) ? 0 : getSumTimerReadWithSharedLocks().hashCode());
        result = prime * result + ((getMinTimerReadWithSharedLocks() == null) ? 0 : getMinTimerReadWithSharedLocks().hashCode());
        result = prime * result + ((getAvgTimerReadWithSharedLocks() == null) ? 0 : getAvgTimerReadWithSharedLocks().hashCode());
        result = prime * result + ((getMaxTimerReadWithSharedLocks() == null) ? 0 : getMaxTimerReadWithSharedLocks().hashCode());
        result = prime * result + ((getCountReadHighPriority() == null) ? 0 : getCountReadHighPriority().hashCode());
        result = prime * result + ((getSumTimerReadHighPriority() == null) ? 0 : getSumTimerReadHighPriority().hashCode());
        result = prime * result + ((getMinTimerReadHighPriority() == null) ? 0 : getMinTimerReadHighPriority().hashCode());
        result = prime * result + ((getAvgTimerReadHighPriority() == null) ? 0 : getAvgTimerReadHighPriority().hashCode());
        result = prime * result + ((getMaxTimerReadHighPriority() == null) ? 0 : getMaxTimerReadHighPriority().hashCode());
        result = prime * result + ((getCountReadNoInsert() == null) ? 0 : getCountReadNoInsert().hashCode());
        result = prime * result + ((getSumTimerReadNoInsert() == null) ? 0 : getSumTimerReadNoInsert().hashCode());
        result = prime * result + ((getMinTimerReadNoInsert() == null) ? 0 : getMinTimerReadNoInsert().hashCode());
        result = prime * result + ((getAvgTimerReadNoInsert() == null) ? 0 : getAvgTimerReadNoInsert().hashCode());
        result = prime * result + ((getMaxTimerReadNoInsert() == null) ? 0 : getMaxTimerReadNoInsert().hashCode());
        result = prime * result + ((getCountReadExternal() == null) ? 0 : getCountReadExternal().hashCode());
        result = prime * result + ((getSumTimerReadExternal() == null) ? 0 : getSumTimerReadExternal().hashCode());
        result = prime * result + ((getMinTimerReadExternal() == null) ? 0 : getMinTimerReadExternal().hashCode());
        result = prime * result + ((getAvgTimerReadExternal() == null) ? 0 : getAvgTimerReadExternal().hashCode());
        result = prime * result + ((getMaxTimerReadExternal() == null) ? 0 : getMaxTimerReadExternal().hashCode());
        result = prime * result + ((getCountWriteAllowWrite() == null) ? 0 : getCountWriteAllowWrite().hashCode());
        result = prime * result + ((getSumTimerWriteAllowWrite() == null) ? 0 : getSumTimerWriteAllowWrite().hashCode());
        result = prime * result + ((getMinTimerWriteAllowWrite() == null) ? 0 : getMinTimerWriteAllowWrite().hashCode());
        result = prime * result + ((getAvgTimerWriteAllowWrite() == null) ? 0 : getAvgTimerWriteAllowWrite().hashCode());
        result = prime * result + ((getMaxTimerWriteAllowWrite() == null) ? 0 : getMaxTimerWriteAllowWrite().hashCode());
        result = prime * result + ((getCountWriteConcurrentInsert() == null) ? 0 : getCountWriteConcurrentInsert().hashCode());
        result = prime * result + ((getSumTimerWriteConcurrentInsert() == null) ? 0 : getSumTimerWriteConcurrentInsert().hashCode());
        result = prime * result + ((getMinTimerWriteConcurrentInsert() == null) ? 0 : getMinTimerWriteConcurrentInsert().hashCode());
        result = prime * result + ((getAvgTimerWriteConcurrentInsert() == null) ? 0 : getAvgTimerWriteConcurrentInsert().hashCode());
        result = prime * result + ((getMaxTimerWriteConcurrentInsert() == null) ? 0 : getMaxTimerWriteConcurrentInsert().hashCode());
        result = prime * result + ((getCountWriteLowPriority() == null) ? 0 : getCountWriteLowPriority().hashCode());
        result = prime * result + ((getSumTimerWriteLowPriority() == null) ? 0 : getSumTimerWriteLowPriority().hashCode());
        result = prime * result + ((getMinTimerWriteLowPriority() == null) ? 0 : getMinTimerWriteLowPriority().hashCode());
        result = prime * result + ((getAvgTimerWriteLowPriority() == null) ? 0 : getAvgTimerWriteLowPriority().hashCode());
        result = prime * result + ((getMaxTimerWriteLowPriority() == null) ? 0 : getMaxTimerWriteLowPriority().hashCode());
        result = prime * result + ((getCountWriteNormal() == null) ? 0 : getCountWriteNormal().hashCode());
        result = prime * result + ((getSumTimerWriteNormal() == null) ? 0 : getSumTimerWriteNormal().hashCode());
        result = prime * result + ((getMinTimerWriteNormal() == null) ? 0 : getMinTimerWriteNormal().hashCode());
        result = prime * result + ((getAvgTimerWriteNormal() == null) ? 0 : getAvgTimerWriteNormal().hashCode());
        result = prime * result + ((getMaxTimerWriteNormal() == null) ? 0 : getMaxTimerWriteNormal().hashCode());
        result = prime * result + ((getCountWriteExternal() == null) ? 0 : getCountWriteExternal().hashCode());
        result = prime * result + ((getSumTimerWriteExternal() == null) ? 0 : getSumTimerWriteExternal().hashCode());
        result = prime * result + ((getMinTimerWriteExternal() == null) ? 0 : getMinTimerWriteExternal().hashCode());
        result = prime * result + ((getAvgTimerWriteExternal() == null) ? 0 : getAvgTimerWriteExternal().hashCode());
        result = prime * result + ((getMaxTimerWriteExternal() == null) ? 0 : getMaxTimerWriteExternal().hashCode());
        return result;
    }
}