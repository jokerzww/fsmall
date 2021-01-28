package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemoryByThreadByCurrentBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: memory_by_thread_by_current_bytes")
    public static final MemoryByThreadByCurrentBytes memoryByThreadByCurrentBytes = new MemoryByThreadByCurrentBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.thread_id")
    public static final SqlColumn<Long> threadId = memoryByThreadByCurrentBytes.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.user")
    public static final SqlColumn<String> user = memoryByThreadByCurrentBytes.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.current_count_used")
    public static final SqlColumn<BigDecimal> currentCountUsed = memoryByThreadByCurrentBytes.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.current_allocated")
    public static final SqlColumn<String> currentAllocated = memoryByThreadByCurrentBytes.currentAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.current_avg_alloc")
    public static final SqlColumn<String> currentAvgAlloc = memoryByThreadByCurrentBytes.currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.current_max_alloc")
    public static final SqlColumn<String> currentMaxAlloc = memoryByThreadByCurrentBytes.currentMaxAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source field: memory_by_thread_by_current_bytes.total_allocated")
    public static final SqlColumn<String> totalAllocated = memoryByThreadByCurrentBytes.totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: memory_by_thread_by_current_bytes")
    public static final class MemoryByThreadByCurrentBytes extends SqlTable {
        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> currentCountUsed = column("current_count_used", JDBCType.DECIMAL);

        public final SqlColumn<String> currentAllocated = column("current_allocated", JDBCType.VARCHAR);

        public final SqlColumn<String> currentAvgAlloc = column("current_avg_alloc", JDBCType.VARCHAR);

        public final SqlColumn<String> currentMaxAlloc = column("current_max_alloc", JDBCType.VARCHAR);

        public final SqlColumn<String> totalAllocated = column("total_allocated", JDBCType.VARCHAR);

        public MemoryByThreadByCurrentBytes() {
            super("memory_by_thread_by_current_bytes");
        }
    }
}