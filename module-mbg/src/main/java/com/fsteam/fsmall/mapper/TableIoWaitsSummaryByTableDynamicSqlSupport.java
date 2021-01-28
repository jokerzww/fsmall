package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TableIoWaitsSummaryByTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source Table: table_io_waits_summary_by_table")
    public static final TableIoWaitsSummaryByTable tableIoWaitsSummaryByTable = new TableIoWaitsSummaryByTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = tableIoWaitsSummaryByTable.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = tableIoWaitsSummaryByTable.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.OBJECT_NAME")
    public static final SqlColumn<String> objectName = tableIoWaitsSummaryByTable.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_STAR")
    public static final SqlColumn<Long> countStar = tableIoWaitsSummaryByTable.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = tableIoWaitsSummaryByTable.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = tableIoWaitsSummaryByTable.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = tableIoWaitsSummaryByTable.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = tableIoWaitsSummaryByTable.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_READ")
    public static final SqlColumn<Long> countRead = tableIoWaitsSummaryByTable.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_READ")
    public static final SqlColumn<Long> sumTimerRead = tableIoWaitsSummaryByTable.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_READ")
    public static final SqlColumn<Long> minTimerRead = tableIoWaitsSummaryByTable.minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_READ")
    public static final SqlColumn<Long> avgTimerRead = tableIoWaitsSummaryByTable.avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_READ")
    public static final SqlColumn<Long> maxTimerRead = tableIoWaitsSummaryByTable.maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_WRITE")
    public static final SqlColumn<Long> countWrite = tableIoWaitsSummaryByTable.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_WRITE")
    public static final SqlColumn<Long> sumTimerWrite = tableIoWaitsSummaryByTable.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_WRITE")
    public static final SqlColumn<Long> minTimerWrite = tableIoWaitsSummaryByTable.minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_WRITE")
    public static final SqlColumn<Long> avgTimerWrite = tableIoWaitsSummaryByTable.avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_WRITE")
    public static final SqlColumn<Long> maxTimerWrite = tableIoWaitsSummaryByTable.maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_FETCH")
    public static final SqlColumn<Long> countFetch = tableIoWaitsSummaryByTable.countFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_FETCH")
    public static final SqlColumn<Long> sumTimerFetch = tableIoWaitsSummaryByTable.sumTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_FETCH")
    public static final SqlColumn<Long> minTimerFetch = tableIoWaitsSummaryByTable.minTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_FETCH")
    public static final SqlColumn<Long> avgTimerFetch = tableIoWaitsSummaryByTable.avgTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_FETCH")
    public static final SqlColumn<Long> maxTimerFetch = tableIoWaitsSummaryByTable.maxTimerFetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_INSERT")
    public static final SqlColumn<Long> countInsert = tableIoWaitsSummaryByTable.countInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_INSERT")
    public static final SqlColumn<Long> sumTimerInsert = tableIoWaitsSummaryByTable.sumTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_INSERT")
    public static final SqlColumn<Long> minTimerInsert = tableIoWaitsSummaryByTable.minTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_INSERT")
    public static final SqlColumn<Long> avgTimerInsert = tableIoWaitsSummaryByTable.avgTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_INSERT")
    public static final SqlColumn<Long> maxTimerInsert = tableIoWaitsSummaryByTable.maxTimerInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_UPDATE")
    public static final SqlColumn<Long> countUpdate = tableIoWaitsSummaryByTable.countUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_UPDATE")
    public static final SqlColumn<Long> sumTimerUpdate = tableIoWaitsSummaryByTable.sumTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_UPDATE")
    public static final SqlColumn<Long> minTimerUpdate = tableIoWaitsSummaryByTable.minTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_UPDATE")
    public static final SqlColumn<Long> avgTimerUpdate = tableIoWaitsSummaryByTable.avgTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_UPDATE")
    public static final SqlColumn<Long> maxTimerUpdate = tableIoWaitsSummaryByTable.maxTimerUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5251932+08:00", comments="Source field: table_io_waits_summary_by_table.COUNT_DELETE")
    public static final SqlColumn<Long> countDelete = tableIoWaitsSummaryByTable.countDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: table_io_waits_summary_by_table.SUM_TIMER_DELETE")
    public static final SqlColumn<Long> sumTimerDelete = tableIoWaitsSummaryByTable.sumTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: table_io_waits_summary_by_table.MIN_TIMER_DELETE")
    public static final SqlColumn<Long> minTimerDelete = tableIoWaitsSummaryByTable.minTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: table_io_waits_summary_by_table.AVG_TIMER_DELETE")
    public static final SqlColumn<Long> avgTimerDelete = tableIoWaitsSummaryByTable.avgTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source field: table_io_waits_summary_by_table.MAX_TIMER_DELETE")
    public static final SqlColumn<Long> maxTimerDelete = tableIoWaitsSummaryByTable.maxTimerDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5241926+08:00", comments="Source Table: table_io_waits_summary_by_table")
    public static final class TableIoWaitsSummaryByTable extends SqlTable {
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

        public TableIoWaitsSummaryByTable() {
            super("table_io_waits_summary_by_table");
        }
    }
}