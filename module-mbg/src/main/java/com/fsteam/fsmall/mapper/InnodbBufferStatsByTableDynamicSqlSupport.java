package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbBufferStatsByTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source Table: innodb_buffer_stats_by_table")
    public static final InnodbBufferStatsByTable innodbBufferStatsByTable = new InnodbBufferStatsByTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.allocated")
    public static final SqlColumn<String> allocated = innodbBufferStatsByTable.allocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.data")
    public static final SqlColumn<String> data = innodbBufferStatsByTable.data;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.pages")
    public static final SqlColumn<Long> pages = innodbBufferStatsByTable.pages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.pages_hashed")
    public static final SqlColumn<Long> pagesHashed = innodbBufferStatsByTable.pagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.pages_old")
    public static final SqlColumn<Long> pagesOld = innodbBufferStatsByTable.pagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.rows_cached")
    public static final SqlColumn<BigDecimal> rowsCached = innodbBufferStatsByTable.rowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.object_schema")
    public static final SqlColumn<String> objectSchema = innodbBufferStatsByTable.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source field: innodb_buffer_stats_by_table.object_name")
    public static final SqlColumn<String> objectName = innodbBufferStatsByTable.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4200984+08:00", comments="Source Table: innodb_buffer_stats_by_table")
    public static final class InnodbBufferStatsByTable extends SqlTable {
        public final SqlColumn<String> allocated = column("allocated", JDBCType.VARCHAR);

        public final SqlColumn<String> data = column("data", JDBCType.VARCHAR);

        public final SqlColumn<Long> pages = column("pages", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesHashed = column("pages_hashed", JDBCType.BIGINT);

        public final SqlColumn<Long> pagesOld = column("pages_old", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> rowsCached = column("rows_cached", JDBCType.DECIMAL);

        public final SqlColumn<String> objectSchema = column("object_schema", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> objectName = column("object_name", JDBCType.LONGVARCHAR);

        public InnodbBufferStatsByTable() {
            super("innodb_buffer_stats_by_table");
        }
    }
}