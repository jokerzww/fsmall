package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemoryByUserByCurrentBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source Table: memory_by_user_by_current_bytes")
    public static final MemoryByUserByCurrentBytes memoryByUserByCurrentBytes = new MemoryByUserByCurrentBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source field: memory_by_user_by_current_bytes.user")
    public static final SqlColumn<String> user = memoryByUserByCurrentBytes.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source field: memory_by_user_by_current_bytes.current_count_used")
    public static final SqlColumn<BigDecimal> currentCountUsed = memoryByUserByCurrentBytes.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source field: memory_by_user_by_current_bytes.current_allocated")
    public static final SqlColumn<String> currentAllocated = memoryByUserByCurrentBytes.currentAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source field: memory_by_user_by_current_bytes.current_avg_alloc")
    public static final SqlColumn<String> currentAvgAlloc = memoryByUserByCurrentBytes.currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source field: memory_by_user_by_current_bytes.current_max_alloc")
    public static final SqlColumn<String> currentMaxAlloc = memoryByUserByCurrentBytes.currentMaxAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source field: memory_by_user_by_current_bytes.total_allocated")
    public static final SqlColumn<String> totalAllocated = memoryByUserByCurrentBytes.totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1688685+08:00", comments="Source Table: memory_by_user_by_current_bytes")
    public static final class MemoryByUserByCurrentBytes extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> currentCountUsed = column("current_count_used", JDBCType.DECIMAL);

        public final SqlColumn<String> currentAllocated = column("current_allocated", JDBCType.VARCHAR);

        public final SqlColumn<String> currentAvgAlloc = column("current_avg_alloc", JDBCType.VARCHAR);

        public final SqlColumn<String> currentMaxAlloc = column("current_max_alloc", JDBCType.VARCHAR);

        public final SqlColumn<String> totalAllocated = column("total_allocated", JDBCType.VARCHAR);

        public MemoryByUserByCurrentBytes() {
            super("memory_by_user_by_current_bytes");
        }
    }
}