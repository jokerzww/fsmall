package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserSummaryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: user_summary")
    public static final UserSummary userSummary = new UserSummary();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.user")
    public static final SqlColumn<String> user = userSummary.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statements")
    public static final SqlColumn<BigDecimal> statements = userSummary.statements;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.statement_latency")
    public static final SqlColumn<String> statementLatency = userSummary.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.statement_avg_latency")
    public static final SqlColumn<String> statementAvgLatency = userSummary.statementAvgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.table_scans")
    public static final SqlColumn<BigDecimal> tableScans = userSummary.tableScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.file_ios")
    public static final SqlColumn<BigDecimal> fileIos = userSummary.fileIos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.file_io_latency")
    public static final SqlColumn<String> fileIoLatency = userSummary.fileIoLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.current_connections")
    public static final SqlColumn<BigDecimal> currentConnections = userSummary.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.total_connections")
    public static final SqlColumn<BigDecimal> totalConnections = userSummary.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.unique_hosts")
    public static final SqlColumn<Long> uniqueHosts = userSummary.uniqueHosts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.current_memory")
    public static final SqlColumn<String> currentMemory = userSummary.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4561306+08:00", comments="Source field: user_summary.total_memory_allocated")
    public static final SqlColumn<String> totalMemoryAllocated = userSummary.totalMemoryAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: user_summary")
    public static final class UserSummary extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> statements = column("statements", JDBCType.DECIMAL);

        public final SqlColumn<String> statementLatency = column("statement_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> statementAvgLatency = column("statement_avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> tableScans = column("table_scans", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fileIos = column("file_ios", JDBCType.DECIMAL);

        public final SqlColumn<String> fileIoLatency = column("file_io_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> currentConnections = column("current_connections", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalConnections = column("total_connections", JDBCType.DECIMAL);

        public final SqlColumn<Long> uniqueHosts = column("unique_hosts", JDBCType.BIGINT);

        public final SqlColumn<String> currentMemory = column("current_memory", JDBCType.VARCHAR);

        public final SqlColumn<String> totalMemoryAllocated = column("total_memory_allocated", JDBCType.VARCHAR);

        public UserSummary() {
            super("user_summary");
        }
    }
}