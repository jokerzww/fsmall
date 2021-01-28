package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XHostSummaryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: x$host_summary")
    public static final XHostSummary XHostSummary = new XHostSummary();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source field: x$host_summary.host")
    public static final SqlColumn<String> host = XHostSummary.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source field: x$host_summary.statements")
    public static final SqlColumn<BigDecimal> statements = XHostSummary.statements;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source field: x$host_summary.statement_latency")
    public static final SqlColumn<BigDecimal> statementLatency = XHostSummary.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source field: x$host_summary.statement_avg_latency")
    public static final SqlColumn<BigDecimal> statementAvgLatency = XHostSummary.statementAvgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.table_scans")
    public static final SqlColumn<BigDecimal> tableScans = XHostSummary.tableScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.file_ios")
    public static final SqlColumn<BigDecimal> fileIos = XHostSummary.fileIos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.file_io_latency")
    public static final SqlColumn<BigDecimal> fileIoLatency = XHostSummary.fileIoLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.current_connections")
    public static final SqlColumn<BigDecimal> currentConnections = XHostSummary.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.total_connections")
    public static final SqlColumn<BigDecimal> totalConnections = XHostSummary.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.unique_users")
    public static final SqlColumn<Long> uniqueUsers = XHostSummary.uniqueUsers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.current_memory")
    public static final SqlColumn<BigDecimal> currentMemory = XHostSummary.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2339277+08:00", comments="Source field: x$host_summary.total_memory_allocated")
    public static final SqlColumn<BigDecimal> totalMemoryAllocated = XHostSummary.totalMemoryAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2329271+08:00", comments="Source Table: x$host_summary")
    public static final class XHostSummary extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> statements = column("statements", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> statementLatency = column("statement_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> statementAvgLatency = column("statement_avg_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> tableScans = column("table_scans", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fileIos = column("file_ios", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fileIoLatency = column("file_io_latency", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> currentConnections = column("current_connections", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalConnections = column("total_connections", JDBCType.DECIMAL);

        public final SqlColumn<Long> uniqueUsers = column("unique_users", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> currentMemory = column("current_memory", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalMemoryAllocated = column("total_memory_allocated", JDBCType.DECIMAL);

        public XHostSummary() {
            super("x$host_summary");
        }
    }
}