package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemoryGlobalByCurrentBytesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source Table: memory_global_by_current_bytes")
    public static final MemoryGlobalByCurrentBytes memoryGlobalByCurrentBytes = new MemoryGlobalByCurrentBytes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.event_name")
    public static final SqlColumn<String> eventName = memoryGlobalByCurrentBytes.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_count")
    public static final SqlColumn<Long> currentCount = memoryGlobalByCurrentBytes.currentCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_alloc")
    public static final SqlColumn<String> currentAlloc = memoryGlobalByCurrentBytes.currentAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.current_avg_alloc")
    public static final SqlColumn<String> currentAvgAlloc = memoryGlobalByCurrentBytes.currentAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_count")
    public static final SqlColumn<Long> highCount = memoryGlobalByCurrentBytes.highCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_alloc")
    public static final SqlColumn<String> highAlloc = memoryGlobalByCurrentBytes.highAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source field: memory_global_by_current_bytes.high_avg_alloc")
    public static final SqlColumn<String> highAvgAlloc = memoryGlobalByCurrentBytes.highAvgAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4851573+08:00", comments="Source Table: memory_global_by_current_bytes")
    public static final class MemoryGlobalByCurrentBytes extends SqlTable {
        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> currentCount = column("current_count", JDBCType.BIGINT);

        public final SqlColumn<String> currentAlloc = column("current_alloc", JDBCType.VARCHAR);

        public final SqlColumn<String> currentAvgAlloc = column("current_avg_alloc", JDBCType.VARCHAR);

        public final SqlColumn<Long> highCount = column("high_count", JDBCType.BIGINT);

        public final SqlColumn<String> highAlloc = column("high_alloc", JDBCType.VARCHAR);

        public final SqlColumn<String> highAvgAlloc = column("high_avg_alloc", JDBCType.VARCHAR);

        public MemoryGlobalByCurrentBytes() {
            super("memory_global_by_current_bytes");
        }
    }
}