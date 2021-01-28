package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XMemoryByThreadByCurrentBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    public static final XMemoryByThreadByCurrentBytes XMemoryByThreadByCurrentBytes = new XMemoryByThreadByCurrentBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.thread_id")
    public static final SqlColumn<Long> threadId = XMemoryByThreadByCurrentBytes.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.user")
    public static final SqlColumn<String> user = XMemoryByThreadByCurrentBytes.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.current_count_used")
    public static final SqlColumn<BigDecimal> currentCountUsed = XMemoryByThreadByCurrentBytes.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.current_allocated")
    public static final SqlColumn<BigDecimal> currentAllocated = XMemoryByThreadByCurrentBytes.currentAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.current_avg_alloc")
    public static final SqlColumn<BigDecimal> currentAvgAlloc = XMemoryByThreadByCurrentBytes.currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.current_max_alloc")
    public static final SqlColumn<Long> currentMaxAlloc = XMemoryByThreadByCurrentBytes.currentMaxAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source field: x$memory_by_thread_by_current_bytes.total_allocated")
    public static final SqlColumn<BigDecimal> totalAllocated = XMemoryByThreadByCurrentBytes.totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5051771+08:00", comments="Source Table: x$memory_by_thread_by_current_bytes")
    public static final class XMemoryByThreadByCurrentBytes extends SqlTable {
        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> currentCountUsed = column("current_count_used", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> currentAllocated = column("current_allocated", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> currentAvgAlloc = column("current_avg_alloc", JDBCType.DECIMAL);

        public final SqlColumn<Long> currentMaxAlloc = column("current_max_alloc", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> totalAllocated = column("total_allocated", JDBCType.DECIMAL);

        public XMemoryByThreadByCurrentBytes() {
            super("x$memory_by_thread_by_current_bytes");
        }
    }
}