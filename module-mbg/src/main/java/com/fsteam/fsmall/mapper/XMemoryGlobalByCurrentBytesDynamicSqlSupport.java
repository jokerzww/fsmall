package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XMemoryGlobalByCurrentBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    public static final XMemoryGlobalByCurrentBytes XMemoryGlobalByCurrentBytes = new XMemoryGlobalByCurrentBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.event_name")
    public static final SqlColumn<String> eventName = XMemoryGlobalByCurrentBytes.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.current_count")
    public static final SqlColumn<Long> currentCount = XMemoryGlobalByCurrentBytes.currentCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.current_alloc")
    public static final SqlColumn<Long> currentAlloc = XMemoryGlobalByCurrentBytes.currentAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.current_avg_alloc")
    public static final SqlColumn<BigDecimal> currentAvgAlloc = XMemoryGlobalByCurrentBytes.currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.high_count")
    public static final SqlColumn<Long> highCount = XMemoryGlobalByCurrentBytes.highCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.high_alloc")
    public static final SqlColumn<Long> highAlloc = XMemoryGlobalByCurrentBytes.highAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source field: x$memory_global_by_current_bytes.high_avg_alloc")
    public static final SqlColumn<BigDecimal> highAvgAlloc = XMemoryGlobalByCurrentBytes.highAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4721447+08:00", comments="Source Table: x$memory_global_by_current_bytes")
    public static final class XMemoryGlobalByCurrentBytes extends SqlTable {
        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> currentCount = column("current_count", JDBCType.BIGINT);

        public final SqlColumn<Long> currentAlloc = column("current_alloc", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> currentAvgAlloc = column("current_avg_alloc", JDBCType.DECIMAL);

        public final SqlColumn<Long> highCount = column("high_count", JDBCType.BIGINT);

        public final SqlColumn<Long> highAlloc = column("high_alloc", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> highAvgAlloc = column("high_avg_alloc", JDBCType.DECIMAL);

        public XMemoryGlobalByCurrentBytes() {
            super("x$memory_global_by_current_bytes");
        }
    }
}