package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementsWithTempTablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source Table: statements_with_temp_tables")
    public static final StatementsWithTempTables statementsWithTempTables = new StatementsWithTempTables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source field: statements_with_temp_tables.db")
    public static final SqlColumn<String> db = statementsWithTempTables.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source field: statements_with_temp_tables.exec_count")
    public static final SqlColumn<Long> execCount = statementsWithTempTables.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source field: statements_with_temp_tables.total_latency")
    public static final SqlColumn<String> totalLatency = statementsWithTempTables.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source field: statements_with_temp_tables.memory_tmp_tables")
    public static final SqlColumn<Long> memoryTmpTables = statementsWithTempTables.memoryTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source field: statements_with_temp_tables.disk_tmp_tables")
    public static final SqlColumn<Long> diskTmpTables = statementsWithTempTables.diskTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0817887+08:00", comments="Source field: statements_with_temp_tables.avg_tmp_tables_per_query")
    public static final SqlColumn<BigDecimal> avgTmpTablesPerQuery = statementsWithTempTables.avgTmpTablesPerQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0817887+08:00", comments="Source field: statements_with_temp_tables.tmp_tables_to_disk_pct")
    public static final SqlColumn<BigDecimal> tmpTablesToDiskPct = statementsWithTempTables.tmpTablesToDiskPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0817887+08:00", comments="Source field: statements_with_temp_tables.first_seen")
    public static final SqlColumn<Date> firstSeen = statementsWithTempTables.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0817887+08:00", comments="Source field: statements_with_temp_tables.last_seen")
    public static final SqlColumn<Date> lastSeen = statementsWithTempTables.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0817887+08:00", comments="Source field: statements_with_temp_tables.digest")
    public static final SqlColumn<String> digest = statementsWithTempTables.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0817887+08:00", comments="Source field: statements_with_temp_tables.query")
    public static final SqlColumn<String> query = statementsWithTempTables.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0807877+08:00", comments="Source Table: statements_with_temp_tables")
    public static final class StatementsWithTempTables extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> memoryTmpTables = column("memory_tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<Long> diskTmpTables = column("disk_tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgTmpTablesPerQuery = column("avg_tmp_tables_per_query", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> tmpTablesToDiskPct = column("tmp_tables_to_disk_pct", JDBCType.DECIMAL);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public StatementsWithTempTables() {
            super("statements_with_temp_tables");
        }
    }
}