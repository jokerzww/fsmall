package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XStatementsWithFullTableScansDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source Table: x$statements_with_full_table_scans")
    public static final XStatementsWithFullTableScans XStatementsWithFullTableScans = new XStatementsWithFullTableScans();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.db")
    public static final SqlColumn<String> db = XStatementsWithFullTableScans.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.exec_count")
    public static final SqlColumn<Long> execCount = XStatementsWithFullTableScans.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.total_latency")
    public static final SqlColumn<Long> totalLatency = XStatementsWithFullTableScans.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_count")
    public static final SqlColumn<Long> noIndexUsedCount = XStatementsWithFullTableScans.noIndexUsedCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.no_good_index_used_count")
    public static final SqlColumn<Long> noGoodIndexUsedCount = XStatementsWithFullTableScans.noGoodIndexUsedCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_pct")
    public static final SqlColumn<BigDecimal> noIndexUsedPct = XStatementsWithFullTableScans.noIndexUsedPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent")
    public static final SqlColumn<Long> rowsSent = XStatementsWithFullTableScans.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined")
    public static final SqlColumn<Long> rowsExamined = XStatementsWithFullTableScans.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent_avg")
    public static final SqlColumn<BigDecimal> rowsSentAvg = XStatementsWithFullTableScans.rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined_avg")
    public static final SqlColumn<BigDecimal> rowsExaminedAvg = XStatementsWithFullTableScans.rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.first_seen")
    public static final SqlColumn<Date> firstSeen = XStatementsWithFullTableScans.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.last_seen")
    public static final SqlColumn<Date> lastSeen = XStatementsWithFullTableScans.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.digest")
    public static final SqlColumn<String> digest = XStatementsWithFullTableScans.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source field: x$statements_with_full_table_scans.query")
    public static final SqlColumn<String> query = XStatementsWithFullTableScans.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source Table: x$statements_with_full_table_scans")
    public static final class XStatementsWithFullTableScans extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

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

        public XStatementsWithFullTableScans() {
            super("x$statements_with_full_table_scans");
        }
    }
}