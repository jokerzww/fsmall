package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XUserSummaryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: x$user_summary")
    public static final XUserSummary XUserSummary = new XUserSummary();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source field: x$user_summary.user")
    public static final SqlColumn<String> user = XUserSummary.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source field: x$user_summary.statements")
    public static final SqlColumn<BigDecimal> statements = XUserSummary.statements;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source field: x$user_summary.statement_latency")
    public static final SqlColumn<BigDecimal> statementLatency = XUserSummary.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source field: x$user_summary.statement_avg_latency")
    public static final SqlColumn<BigDecimal> statementAvgLatency = XUserSummary.statementAvgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source field: x$user_summary.table_scans")
    public static final SqlColumn<BigDecimal> tableScans = XUserSummary.tableScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source field: x$user_summary.file_ios")
    public static final SqlColumn<BigDecimal> fileIos = XUserSummary.fileIos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4140918+08:00", comments="Source field: x$user_summary.file_io_latency")
    public static final SqlColumn<BigDecimal> fileIoLatency = XUserSummary.fileIoLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4140918+08:00", comments="Source field: x$user_summary.current_connections")
    public static final SqlColumn<BigDecimal> currentConnections = XUserSummary.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4140918+08:00", comments="Source field: x$user_summary.total_connections")
    public static final SqlColumn<BigDecimal> totalConnections = XUserSummary.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4140918+08:00", comments="Source field: x$user_summary.unique_hosts")
    public static final SqlColumn<Long> uniqueHosts = XUserSummary.uniqueHosts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4140918+08:00", comments="Source field: x$user_summary.current_memory")
    public static final SqlColumn<BigDecimal> currentMemory = XUserSummary.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4140918+08:00", comments="Source field: x$user_summary.total_memory_allocated")
    public static final SqlColumn<BigDecimal> totalMemoryAllocated = XUserSummary.totalMemoryAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: x$user_summary")
    public static final class XUserSummary extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> statements = column("statements", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> statementLatency = column("statement_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> statementAvgLatency = column("statement_avg_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> tableScans = column("table_scans", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fileIos = column("file_ios", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fileIoLatency = column("file_io_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> currentConnections = column("current_connections", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalConnections = column("total_connections", JDBCType.DECIMAL);

        public final SqlColumn<Long> uniqueHosts = column("unique_hosts", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> currentMemory = column("current_memory", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalMemoryAllocated = column("total_memory_allocated", JDBCType.DECIMAL);

        public XUserSummary() {
            super("x$user_summary");
        }
    }
}