package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XMemoryGlobalTotalDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    public static final XMemoryGlobalTotal XMemoryGlobalTotal = new XMemoryGlobalTotal();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source field: x$memory_global_total.total_allocated")
    public static final SqlColumn<BigDecimal> totalAllocated = XMemoryGlobalTotal.totalAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    public static final class XMemoryGlobalTotal extends SqlTable {
        public final SqlColumn<BigDecimal> totalAllocated = column("total_allocated", JDBCType.DECIMAL);

        public XMemoryGlobalTotal() {
            super("x$memory_global_total");
        }
    }
}