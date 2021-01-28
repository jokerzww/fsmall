package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XInnodbBufferStatsByTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    public static final XInnodbBufferStatsByTable XInnodbBufferStatsByTable = new XInnodbBufferStatsByTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.allocated")
    public static final SqlColumn<BigDecimal> allocated = XInnodbBufferStatsByTable.allocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.data")
    public static final SqlColumn<BigDecimal> data = XInnodbBufferStatsByTable.data;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.pages")
    public static final SqlColumn<Long> pages = XInnodbBufferStatsByTable.pages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.pages_hashed")
    public static final SqlColumn<Long> pagesHashed = XInnodbBufferStatsByTable.pagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.pages_old")
    public static final SqlColumn<Long> pagesOld = XInnodbBufferStatsByTable.pagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.rows_cached")
    public static final SqlColumn<BigDecimal> rowsCached = XInnodbBufferStatsByTable.rowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source field: x$innodb_buffer_stats_by_table.object_schema")
    public static final SqlColumn<String> objectSchema = XInnodbBufferStatsByTable.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source field: x$innodb_buffer_stats_by_table.object_name")
    public static final SqlColumn<String> objectName = XInnodbBufferStatsByTable.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3820636+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    public static final class XInnodbBufferStatsByTable extends SqlTable {
        public final SqlColumn<BigDecimal> allocated = column("allocated", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> data = column("data", JDBCType.DECIMAL);

        public final SqlColumn<Long> pages = column("pages", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesHashed = column("pages_hashed", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesOld = column("pages_old", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsCached = column("rows_cached", JDBCType.DECIMAL);

        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> objectName = column("object_name", JDBCType.LONGVARCHAR);

        public XInnodbBufferStatsByTable() {
            super("x$innodb_buffer_stats_by_table");
        }
    }
}