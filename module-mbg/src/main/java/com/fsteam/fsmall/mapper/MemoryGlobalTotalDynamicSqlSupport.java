package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemoryGlobalTotalDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_global_total")
    public static final MemoryGlobalTotal memoryGlobalTotal = new MemoryGlobalTotal();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source field: memory_global_total.total_allocated")
    public static final SqlColumn<String> totalAllocated = memoryGlobalTotal.totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1868863+08:00", comments="Source Table: memory_global_total")
    public static final class MemoryGlobalTotal extends SqlTable {
        public final SqlColumn<String> totalAllocated = column("total_allocated", JDBCType.VARCHAR);

        public MemoryGlobalTotal() {
            super("memory_global_total");
        }
    }
}