package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XMemoryByUserByCurrentBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$memory_by_user_by_current_bytes")
    public static final XMemoryByUserByCurrentBytes XMemoryByUserByCurrentBytes = new XMemoryByUserByCurrentBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.user")
    public static final SqlColumn<String> user = XMemoryByUserByCurrentBytes.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_count_used")
    public static final SqlColumn<BigDecimal> currentCountUsed = XMemoryByUserByCurrentBytes.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_allocated")
    public static final SqlColumn<BigDecimal> currentAllocated = XMemoryByUserByCurrentBytes.currentAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_avg_alloc")
    public static final SqlColumn<BigDecimal> currentAvgAlloc = XMemoryByUserByCurrentBytes.currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.current_max_alloc")
    public static final SqlColumn<Long> currentMaxAlloc = XMemoryByUserByCurrentBytes.currentMaxAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source field: x$memory_by_user_by_current_bytes.total_allocated")
    public static final SqlColumn<BigDecimal> totalAllocated = XMemoryByUserByCurrentBytes.totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$memory_by_user_by_current_bytes")
    public static final class XMemoryByUserByCurrentBytes extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> currentCountUsed = column("current_count_used", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> currentAllocated = column("current_allocated", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> currentAvgAlloc = column("current_avg_alloc", JDBCType.DECIMAL);

        public final SqlColumn<Long> currentMaxAlloc = column("current_max_alloc", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> totalAllocated = column("total_allocated", JDBCType.DECIMAL);

        public XMemoryByUserByCurrentBytes() {
            super("x$memory_by_user_by_current_bytes");
        }
    }
}