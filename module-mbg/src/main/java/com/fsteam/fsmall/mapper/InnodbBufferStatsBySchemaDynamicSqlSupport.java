package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbBufferStatsBySchemaDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source Table: innodb_buffer_stats_by_schema")
    public static final InnodbBufferStatsBySchema innodbBufferStatsBySchema = new InnodbBufferStatsBySchema();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.allocated")
    public static final SqlColumn<String> allocated = innodbBufferStatsBySchema.allocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.data")
    public static final SqlColumn<String> data = innodbBufferStatsBySchema.data;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.pages")
    public static final SqlColumn<Long> pages = innodbBufferStatsBySchema.pages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.pages_hashed")
    public static final SqlColumn<Long> pagesHashed = innodbBufferStatsBySchema.pagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.pages_old")
    public static final SqlColumn<Long> pagesOld = innodbBufferStatsBySchema.pagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.rows_cached")
    public static final SqlColumn<BigDecimal> rowsCached = innodbBufferStatsBySchema.rowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source field: innodb_buffer_stats_by_schema.object_schema")
    public static final SqlColumn<String> objectSchema = innodbBufferStatsBySchema.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4451202+08:00", comments="Source Table: innodb_buffer_stats_by_schema")
    public static final class InnodbBufferStatsBySchema extends SqlTable {
        public final SqlColumn<String> allocated = column("allocated", JDBCType.VARCHAR);

        public final SqlColumn<String> data = column("data", JDBCType.VARCHAR);

        public final SqlColumn<Long> pages = column("pages", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesHashed = column("pages_hashed", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesOld = column("pages_old", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsCached = column("rows_cached", JDBCType.DECIMAL);

        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.LONGVARCHAR);

        public InnodbBufferStatsBySchema() {
            super("innodb_buffer_stats_by_schema");
        }
    }
}