package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HostSummaryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: host_summary")
    public static final HostSummary hostSummary = new HostSummary();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source field: host_summary.host")
    public static final SqlColumn<String> host = hostSummary.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source field: host_summary.statements")
    public static final SqlColumn<BigDecimal> statements = hostSummary.statements;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source field: host_summary.statement_latency")
    public static final SqlColumn<String> statementLatency = hostSummary.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.statement_avg_latency")
    public static final SqlColumn<String> statementAvgLatency = hostSummary.statementAvgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.table_scans")
    public static final SqlColumn<BigDecimal> tableScans = hostSummary.tableScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.file_ios")
    public static final SqlColumn<BigDecimal> fileIos = hostSummary.fileIos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.file_io_latency")
    public static final SqlColumn<String> fileIoLatency = hostSummary.fileIoLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.current_connections")
    public static final SqlColumn<BigDecimal> currentConnections = hostSummary.currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.total_connections")
    public static final SqlColumn<BigDecimal> totalConnections = hostSummary.totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.unique_users")
    public static final SqlColumn<Long> uniqueUsers = hostSummary.uniqueUsers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.current_memory")
    public static final SqlColumn<String> currentMemory = hostSummary.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source field: host_summary.total_memory_allocated")
    public static final SqlColumn<String> totalMemoryAllocated = hostSummary.totalMemoryAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5021723+08:00", comments="Source Table: host_summary")
    public static final class HostSummary extends SqlTable {
        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> statements = column("statements", JDBCType.DECIMAL);

        public final SqlColumn<String> statementLatency = column("statement_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> statementAvgLatency = column("statement_avg_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> tableScans = column("table_scans", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> fileIos = column("file_ios", JDBCType.DECIMAL);

        public final SqlColumn<String> fileIoLatency = column("file_io_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> currentConnections = column("current_connections", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> totalConnections = column("total_connections", JDBCType.DECIMAL);

        public final SqlColumn<Long> uniqueUsers = column("unique_users", JDBCType.BIGINT);

        public final SqlColumn<String> currentMemory = column("current_memory", JDBCType.VARCHAR);

        public final SqlColumn<String> totalMemoryAllocated = column("total_memory_allocated", JDBCType.VARCHAR);

        public HostSummary() {
            super("host_summary");
        }
    }
}