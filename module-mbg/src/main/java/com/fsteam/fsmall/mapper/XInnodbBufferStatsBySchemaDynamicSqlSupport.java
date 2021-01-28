package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XInnodbBufferStatsBySchemaDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source Table: x$innodb_buffer_stats_by_schema")
    public static final XInnodbBufferStatsBySchema XInnodbBufferStatsBySchema = new XInnodbBufferStatsBySchema();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.allocated")
    public static final SqlColumn<BigDecimal> allocated = XInnodbBufferStatsBySchema.allocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.data")
    public static final SqlColumn<BigDecimal> data = XInnodbBufferStatsBySchema.data;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages")
    public static final SqlColumn<Long> pages = XInnodbBufferStatsBySchema.pages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_hashed")
    public static final SqlColumn<Long> pagesHashed = XInnodbBufferStatsBySchema.pagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.pages_old")
    public static final SqlColumn<Long> pagesOld = XInnodbBufferStatsBySchema.pagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.rows_cached")
    public static final SqlColumn<BigDecimal> rowsCached = XInnodbBufferStatsBySchema.rowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source field: x$innodb_buffer_stats_by_schema.object_schema")
    public static final SqlColumn<String> objectSchema = XInnodbBufferStatsBySchema.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4711455+08:00", comments="Source Table: x$innodb_buffer_stats_by_schema")
    public static final class XInnodbBufferStatsBySchema extends SqlTable {
        public final SqlColumn<BigDecimal> allocated = column("allocated", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> data = column("data", JDBCType.DECIMAL);

        public final SqlColumn<Long> pages = column("pages", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesHashed = column("pages_hashed", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesOld = column("pages_old", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsCached = column("rows_cached", JDBCType.DECIMAL);

        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.LONGVARCHAR);

        public XInnodbBufferStatsBySchema() {
            super("x$innodb_buffer_stats_by_schema");
        }
    }
}