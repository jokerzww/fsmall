package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TableLockWaitsSummaryByTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    public static final TableLockWaitsSummaryByTable tableLockWaitsSummaryByTable = new TableLockWaitsSummaryByTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = tableLockWaitsSummaryByTable.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = tableLockWaitsSummaryByTable.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.OBJECT_NAME")
    public static final SqlColumn<String> objectName = tableLockWaitsSummaryByTable.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_STAR")
    public static final SqlColumn<Long> countStar = tableLockWaitsSummaryByTable.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = tableLockWaitsSummaryByTable.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = tableLockWaitsSummaryByTable.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = tableLockWaitsSummaryByTable.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = tableLockWaitsSummaryByTable.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ")
    public static final SqlColumn<Long> countRead = tableLockWaitsSummaryByTable.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = tableLockWaitsSummaryByTable.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = tableLockWaitsSummaryByTable.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = tableLockWaitsSummaryByTable.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = tableLockWaitsSummaryByTable.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = tableLockWaitsSummaryByTable.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = tableLockWaitsSummaryByTable.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = tableLockWaitsSummaryByTable.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = tableLockWaitsSummaryByTable.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = tableLockWaitsSummaryByTable.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NORMAL")
    public static final SqlColumn<Long> countReadNormal = tableLockWaitsSummaryByTable.countReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL")
    public static final SqlColumn<Long> sumTimerReadNormal = tableLockWaitsSummaryByTable.sumTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL")
    public static final SqlColumn<Long> minTimerReadNormal = tableLockWaitsSummaryByTable.minTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.539206+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL")
    public static final SqlColumn<Long> avgTimerReadNormal = tableLockWaitsSummaryByTable.avgTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL")
    public static final SqlColumn<Long> maxTimerReadNormal = tableLockWaitsSummaryByTable.maxTimerReadNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS")
    public static final SqlColumn<Long> countReadWithSharedLocks = tableLockWaitsSummaryByTable.countReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS")
    public static final SqlColumn<Long> sumTimerReadWithSharedLocks = tableLockWaitsSummaryByTable.sumTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS")
    public static final SqlColumn<Long> minTimerReadWithSharedLocks = tableLockWaitsSummaryByTable.minTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS")
    public static final SqlColumn<Long> avgTimerReadWithSharedLocks = tableLockWaitsSummaryByTable.avgTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS")
    public static final SqlColumn<Long> maxTimerReadWithSharedLocks = tableLockWaitsSummaryByTable.maxTimerReadWithSharedLocks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY")
    public static final SqlColumn<Long> countReadHighPriority = tableLockWaitsSummaryByTable.countReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY")
    public static final SqlColumn<Long> sumTimerReadHighPriority = tableLockWaitsSummaryByTable.sumTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY")
    public static final SqlColumn<Long> minTimerReadHighPriority = tableLockWaitsSummaryByTable.minTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY")
    public static final SqlColumn<Long> avgTimerReadHighPriority = tableLockWaitsSummaryByTable.avgTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY")
    public static final SqlColumn<Long> maxTimerReadHighPriority = tableLockWaitsSummaryByTable.maxTimerReadHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT")
    public static final SqlColumn<Long> countReadNoInsert = tableLockWaitsSummaryByTable.countReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT")
    public static final SqlColumn<Long> sumTimerReadNoInsert = tableLockWaitsSummaryByTable.sumTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT")
    public static final SqlColumn<Long> minTimerReadNoInsert = tableLockWaitsSummaryByTable.minTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT")
    public static final SqlColumn<Long> avgTimerReadNoInsert = tableLockWaitsSummaryByTable.avgTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5402068+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT")
    public static final SqlColumn<Long> maxTimerReadNoInsert = tableLockWaitsSummaryByTable.maxTimerReadNoInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL")
    public static final SqlColumn<Long> countReadExternal = tableLockWaitsSummaryByTable.countReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL")
    public static final SqlColumn<Long> sumTimerReadExternal = tableLockWaitsSummaryByTable.sumTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL")
    public static final SqlColumn<Long> minTimerReadExternal = tableLockWaitsSummaryByTable.minTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL")
    public static final SqlColumn<Long> avgTimerReadExternal = tableLockWaitsSummaryByTable.avgTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL")
    public static final SqlColumn<Long> maxTimerReadExternal = tableLockWaitsSummaryByTable.maxTimerReadExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE")
    public static final SqlColumn<Long> countWriteAllowWrite = tableLockWaitsSummaryByTable.countWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE")
    public static final SqlColumn<Long> sumTimerWriteAllowWrite = tableLockWaitsSummaryByTable.sumTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE")
    public static final SqlColumn<Long> minTimerWriteAllowWrite = tableLockWaitsSummaryByTable.minTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE")
    public static final SqlColumn<Long> avgTimerWriteAllowWrite = tableLockWaitsSummaryByTable.avgTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE")
    public static final SqlColumn<Long> maxTimerWriteAllowWrite = tableLockWaitsSummaryByTable.maxTimerWriteAllowWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT")
    public static final SqlColumn<Long> countWriteConcurrentInsert = tableLockWaitsSummaryByTable.countWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT")
    public static final SqlColumn<Long> sumTimerWriteConcurrentInsert = tableLockWaitsSummaryByTable.sumTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT")
    public static final SqlColumn<Long> minTimerWriteConcurrentInsert = tableLockWaitsSummaryByTable.minTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT")
    public static final SqlColumn<Long> avgTimerWriteConcurrentInsert = tableLockWaitsSummaryByTable.avgTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT")
    public static final SqlColumn<Long> maxTimerWriteConcurrentInsert = tableLockWaitsSummaryByTable.maxTimerWriteConcurrentInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY")
    public static final SqlColumn<Long> countWriteLowPriority = tableLockWaitsSummaryByTable.countWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.541208+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY")
    public static final SqlColumn<Long> sumTimerWriteLowPriority = tableLockWaitsSummaryByTable.sumTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY")
    public static final SqlColumn<Long> minTimerWriteLowPriority = tableLockWaitsSummaryByTable.minTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY")
    public static final SqlColumn<Long> avgTimerWriteLowPriority = tableLockWaitsSummaryByTable.avgTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY")
    public static final SqlColumn<Long> maxTimerWriteLowPriority = tableLockWaitsSummaryByTable.maxTimerWriteLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL")
    public static final SqlColumn<Long> countWriteNormal = tableLockWaitsSummaryByTable.countWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL")
    public static final SqlColumn<Long> sumTimerWriteNormal = tableLockWaitsSummaryByTable.sumTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL")
    public static final SqlColumn<Long> minTimerWriteNormal = tableLockWaitsSummaryByTable.minTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL")
    public static final SqlColumn<Long> avgTimerWriteNormal = tableLockWaitsSummaryByTable.avgTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL")
    public static final SqlColumn<Long> maxTimerWriteNormal = tableLockWaitsSummaryByTable.maxTimerWriteNormal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL")
    public static final SqlColumn<Long> countWriteExternal = tableLockWaitsSummaryByTable.countWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL")
    public static final SqlColumn<Long> sumTimerWriteExternal = tableLockWaitsSummaryByTable.sumTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL")
    public static final SqlColumn<Long> minTimerWriteExternal = tableLockWaitsSummaryByTable.minTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL")
    public static final SqlColumn<Long> avgTimerWriteExternal = tableLockWaitsSummaryByTable.avgTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source field: table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL")
    public static final SqlColumn<Long> maxTimerWriteExternal = tableLockWaitsSummaryByTable.maxTimerWriteExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5382062+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    public static final class TableLockWaitsSummaryByTable extends SqlTable {
        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> countRead = column("COUNT_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerRead = column("SUM_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerRead = column("MIN_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerRead = column("AVG_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerRead = column("MAX_TIMER_READ", JDBCType.BIGINT);

        public final SqlColumn<Long> countWrite = column("COUNT_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWrite = column("SUM_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWrite = column("MIN_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWrite = column("AVG_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWrite = column("MAX_TIMER_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadNormal = column("COUNT_READ_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadNormal = column("SUM_TIMER_READ_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadNormal = column("MIN_TIMER_READ_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadNormal = column("AVG_TIMER_READ_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadNormal = column("MAX_TIMER_READ_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadWithSharedLocks = column("COUNT_READ_WITH_SHARED_LOCKS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadWithSharedLocks = column("SUM_TIMER_READ_WITH_SHARED_LOCKS", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadWithSharedLocks = column("MIN_TIMER_READ_WITH_SHARED_LOCKS", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadWithSharedLocks = column("AVG_TIMER_READ_WITH_SHARED_LOCKS", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadWithSharedLocks = column("MAX_TIMER_READ_WITH_SHARED_LOCKS", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadHighPriority = column("COUNT_READ_HIGH_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadHighPriority = column("SUM_TIMER_READ_HIGH_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadHighPriority = column("MIN_TIMER_READ_HIGH_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadHighPriority = column("AVG_TIMER_READ_HIGH_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadHighPriority = column("MAX_TIMER_READ_HIGH_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadNoInsert = column("COUNT_READ_NO_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadNoInsert = column("SUM_TIMER_READ_NO_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadNoInsert = column("MIN_TIMER_READ_NO_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadNoInsert = column("AVG_TIMER_READ_NO_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadNoInsert = column("MAX_TIMER_READ_NO_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> countReadExternal = column("COUNT_READ_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerReadExternal = column("SUM_TIMER_READ_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerReadExternal = column("MIN_TIMER_READ_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerReadExternal = column("AVG_TIMER_READ_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerReadExternal = column("MAX_TIMER_READ_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> countWriteAllowWrite = column("COUNT_WRITE_ALLOW_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWriteAllowWrite = column("SUM_TIMER_WRITE_ALLOW_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWriteAllowWrite = column("MIN_TIMER_WRITE_ALLOW_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWriteAllowWrite = column("AVG_TIMER_WRITE_ALLOW_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWriteAllowWrite = column("MAX_TIMER_WRITE_ALLOW_WRITE", JDBCType.BIGINT);

        public final SqlColumn<Long> countWriteConcurrentInsert = column("COUNT_WRITE_CONCURRENT_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWriteConcurrentInsert = column("SUM_TIMER_WRITE_CONCURRENT_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWriteConcurrentInsert = column("MIN_TIMER_WRITE_CONCURRENT_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWriteConcurrentInsert = column("AVG_TIMER_WRITE_CONCURRENT_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWriteConcurrentInsert = column("MAX_TIMER_WRITE_CONCURRENT_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> countWriteLowPriority = column("COUNT_WRITE_LOW_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWriteLowPriority = column("SUM_TIMER_WRITE_LOW_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWriteLowPriority = column("MIN_TIMER_WRITE_LOW_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWriteLowPriority = column("AVG_TIMER_WRITE_LOW_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWriteLowPriority = column("MAX_TIMER_WRITE_LOW_PRIORITY", JDBCType.BIGINT);

        public final SqlColumn<Long> countWriteNormal = column("COUNT_WRITE_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWriteNormal = column("SUM_TIMER_WRITE_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWriteNormal = column("MIN_TIMER_WRITE_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWriteNormal = column("AVG_TIMER_WRITE_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWriteNormal = column("MAX_TIMER_WRITE_NORMAL", JDBCType.BIGINT);

        public final SqlColumn<Long> countWriteExternal = column("COUNT_WRITE_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWriteExternal = column("SUM_TIMER_WRITE_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWriteExternal = column("MIN_TIMER_WRITE_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWriteExternal = column("AVG_TIMER_WRITE_EXTERNAL", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWriteExternal = column("MAX_TIMER_WRITE_EXTERNAL", JDBCType.BIGINT);

        public TableLockWaitsSummaryByTable() {
            super("table_lock_waits_summary_by_table");
        }
    }
}