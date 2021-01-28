package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TableIoWaitsSummaryByIndexUsageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    public static final TableIoWaitsSummaryByIndexUsage tableIoWaitsSummaryByIndexUsage = new TableIoWaitsSummaryByIndexUsage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = tableIoWaitsSummaryByIndexUsage.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = tableIoWaitsSummaryByIndexUsage.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.OBJECT_NAME")
    public static final SqlColumn<String> objectName = tableIoWaitsSummaryByIndexUsage.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.INDEX_NAME")
    public static final SqlColumn<String> indexName = tableIoWaitsSummaryByIndexUsage.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_STAR")
    public static final SqlColumn<Long> countStar = tableIoWaitsSummaryByIndexUsage.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = tableIoWaitsSummaryByIndexUsage.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = tableIoWaitsSummaryByIndexUsage.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = tableIoWaitsSummaryByIndexUsage.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = tableIoWaitsSummaryByIndexUsage.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_READ")
    public static final SqlColumn<Long> countRead = tableIoWaitsSummaryByIndexUsage.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = tableIoWaitsSummaryByIndexUsage.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = tableIoWaitsSummaryByIndexUsage.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = tableIoWaitsSummaryByIndexUsage.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = tableIoWaitsSummaryByIndexUsage.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = tableIoWaitsSummaryByIndexUsage.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = tableIoWaitsSummaryByIndexUsage.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = tableIoWaitsSummaryByIndexUsage.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = tableIoWaitsSummaryByIndexUsage.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = tableIoWaitsSummaryByIndexUsage.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_FETCH")
    public static final SqlColumn<Long> countFetch = tableIoWaitsSummaryByIndexUsage.countFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH")
    public static final SqlColumn<Long> sumTimerFetch = tableIoWaitsSummaryByIndexUsage.sumTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH")
    public static final SqlColumn<Long> minTimerFetch = tableIoWaitsSummaryByIndexUsage.minTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH")
    public static final SqlColumn<Long> avgTimerFetch = tableIoWaitsSummaryByIndexUsage.avgTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH")
    public static final SqlColumn<Long> maxTimerFetch = tableIoWaitsSummaryByIndexUsage.maxTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_INSERT")
    public static final SqlColumn<Long> countInsert = tableIoWaitsSummaryByIndexUsage.countInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT")
    public static final SqlColumn<Long> sumTimerInsert = tableIoWaitsSummaryByIndexUsage.sumTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT")
    public static final SqlColumn<Long> minTimerInsert = tableIoWaitsSummaryByIndexUsage.minTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT")
    public static final SqlColumn<Long> avgTimerInsert = tableIoWaitsSummaryByIndexUsage.avgTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT")
    public static final SqlColumn<Long> maxTimerInsert = tableIoWaitsSummaryByIndexUsage.maxTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4110917+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_UPDATE")
    public static final SqlColumn<Long> countUpdate = tableIoWaitsSummaryByIndexUsage.countUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE")
    public static final SqlColumn<Long> sumTimerUpdate = tableIoWaitsSummaryByIndexUsage.sumTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE")
    public static final SqlColumn<Long> minTimerUpdate = tableIoWaitsSummaryByIndexUsage.minTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE")
    public static final SqlColumn<Long> avgTimerUpdate = tableIoWaitsSummaryByIndexUsage.avgTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE")
    public static final SqlColumn<Long> maxTimerUpdate = tableIoWaitsSummaryByIndexUsage.maxTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.COUNT_DELETE")
    public static final SqlColumn<Long> countDelete = tableIoWaitsSummaryByIndexUsage.countDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE")
    public static final SqlColumn<Long> sumTimerDelete = tableIoWaitsSummaryByIndexUsage.sumTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE")
    public static final SqlColumn<Long> minTimerDelete = tableIoWaitsSummaryByIndexUsage.minTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE")
    public static final SqlColumn<Long> avgTimerDelete = tableIoWaitsSummaryByIndexUsage.avgTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source field: table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE")
    public static final SqlColumn<Long> maxTimerDelete = tableIoWaitsSummaryByIndexUsage.maxTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4100887+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    public static final class TableIoWaitsSummaryByIndexUsage extends SqlTable {
        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("INDEX_NAME", JDBCType.VARCHAR);

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

        public final SqlColumn<Long> countFetch = column("COUNT_FETCH", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerFetch = column("SUM_TIMER_FETCH", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerFetch = column("MIN_TIMER_FETCH", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerFetch = column("AVG_TIMER_FETCH", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerFetch = column("MAX_TIMER_FETCH", JDBCType.BIGINT);

        public final SqlColumn<Long> countInsert = column("COUNT_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerInsert = column("SUM_TIMER_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerInsert = column("MIN_TIMER_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerInsert = column("AVG_TIMER_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerInsert = column("MAX_TIMER_INSERT", JDBCType.BIGINT);

        public final SqlColumn<Long> countUpdate = column("COUNT_UPDATE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerUpdate = column("SUM_TIMER_UPDATE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerUpdate = column("MIN_TIMER_UPDATE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerUpdate = column("AVG_TIMER_UPDATE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerUpdate = column("MAX_TIMER_UPDATE", JDBCType.BIGINT);

        public final SqlColumn<Long> countDelete = column("COUNT_DELETE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerDelete = column("SUM_TIMER_DELETE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerDelete = column("MIN_TIMER_DELETE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerDelete = column("AVG_TIMER_DELETE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerDelete = column("MAX_TIMER_DELETE", JDBCType.BIGINT);

        public TableIoWaitsSummaryByIndexUsage() {
            super("table_io_waits_summary_by_index_usage");
        }
    }
}