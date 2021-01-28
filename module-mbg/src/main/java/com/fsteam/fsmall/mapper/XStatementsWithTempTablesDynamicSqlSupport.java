package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XStatementsWithTempTablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    public static final XStatementsWithTempTables XStatementsWithTempTables = new XStatementsWithTempTables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.db")
    public static final SqlColumn<String> db = XStatementsWithTempTables.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.exec_count")
    public static final SqlColumn<Long> execCount = XStatementsWithTempTables.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.total_latency")
    public static final SqlColumn<Long> totalLatency = XStatementsWithTempTables.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.memory_tmp_tables")
    public static final SqlColumn<Long> memoryTmpTables = XStatementsWithTempTables.memoryTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.disk_tmp_tables")
    public static final SqlColumn<Long> diskTmpTables = XStatementsWithTempTables.diskTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.avg_tmp_tables_per_query")
    public static final SqlColumn<BigDecimal> avgTmpTablesPerQuery = XStatementsWithTempTables.avgTmpTablesPerQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.tmp_tables_to_disk_pct")
    public static final SqlColumn<BigDecimal> tmpTablesToDiskPct = XStatementsWithTempTables.tmpTablesToDiskPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.first_seen")
    public static final SqlColumn<Date> firstSeen = XStatementsWithTempTables.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.last_seen")
    public static final SqlColumn<Date> lastSeen = XStatementsWithTempTables.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.digest")
    public static final SqlColumn<String> digest = XStatementsWithTempTables.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source field: x$statements_with_temp_tables.query")
    public static final SqlColumn<String> query = XStatementsWithTempTables.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    public static final class XStatementsWithTempTables extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> memoryTmpTables = column("memory_tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<Long> diskTmpTables = column("disk_tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgTmpTablesPerQuery = column("avg_tmp_tables_per_query", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> tmpTablesToDiskPct = column("tmp_tables_to_disk_pct", JDBCType.DECIMAL);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public XStatementsWithTempTables() {
            super("x$statements_with_temp_tables");
        }
    }
}