package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementsWithFullTableScansDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: statements_with_full_table_scans")
    public static final StatementsWithFullTableScans statementsWithFullTableScans = new StatementsWithFullTableScans();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source field: statements_with_full_table_scans.db")
    public static final SqlColumn<String> db = statementsWithFullTableScans.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source field: statements_with_full_table_scans.exec_count")
    public static final SqlColumn<Long> execCount = statementsWithFullTableScans.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source field: statements_with_full_table_scans.total_latency")
    public static final SqlColumn<String> totalLatency = statementsWithFullTableScans.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source field: statements_with_full_table_scans.no_index_used_count")
    public static final SqlColumn<Long> noIndexUsedCount = statementsWithFullTableScans.noIndexUsedCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source field: statements_with_full_table_scans.no_good_index_used_count")
    public static final SqlColumn<Long> noGoodIndexUsedCount = statementsWithFullTableScans.noGoodIndexUsedCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.no_index_used_pct")
    public static final SqlColumn<BigDecimal> noIndexUsedPct = statementsWithFullTableScans.noIndexUsedPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.rows_sent")
    public static final SqlColumn<Long> rowsSent = statementsWithFullTableScans.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.rows_examined")
    public static final SqlColumn<Long> rowsExamined = statementsWithFullTableScans.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.rows_sent_avg")
    public static final SqlColumn<BigDecimal> rowsSentAvg = statementsWithFullTableScans.rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.rows_examined_avg")
    public static final SqlColumn<BigDecimal> rowsExaminedAvg = statementsWithFullTableScans.rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.first_seen")
    public static final SqlColumn<Date> firstSeen = statementsWithFullTableScans.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.last_seen")
    public static final SqlColumn<Date> lastSeen = statementsWithFullTableScans.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.digest")
    public static final SqlColumn<String> digest = statementsWithFullTableScans.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2989873+08:00", comments="Source field: statements_with_full_table_scans.query")
    public static final SqlColumn<String> query = statementsWithFullTableScans.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: statements_with_full_table_scans")
    public static final class StatementsWithFullTableScans extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> noIndexUsedCount = column("no_index_used_count", JDBCType.BIGINT);

        public final SqlColumn<Long> noGoodIndexUsedCount = column("no_good_index_used_count", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> noIndexUsedPct = column("no_index_used_pct", JDBCType.DECIMAL);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsSentAvg = column("rows_sent_avg", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> rowsExaminedAvg = column("rows_examined_avg", JDBCType.DECIMAL);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public StatementsWithFullTableScans() {
            super("statements_with_full_table_scans");
        }
    }
}