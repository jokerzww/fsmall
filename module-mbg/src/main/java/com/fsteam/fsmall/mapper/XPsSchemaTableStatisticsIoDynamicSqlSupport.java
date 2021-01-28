package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XPsSchemaTableStatisticsIoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    public static final XPsSchemaTableStatisticsIo XPsSchemaTableStatisticsIo = new XPsSchemaTableStatisticsIo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_schema")
    public static final SqlColumn<String> tableSchema = XPsSchemaTableStatisticsIo.tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_name")
    public static final SqlColumn<String> tableName = XPsSchemaTableStatisticsIo.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_read")
    public static final SqlColumn<BigDecimal> countRead = XPsSchemaTableStatisticsIo.countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_read")
    public static final SqlColumn<BigDecimal> sumNumberOfBytesRead = XPsSchemaTableStatisticsIo.sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_read")
    public static final SqlColumn<BigDecimal> sumTimerRead = XPsSchemaTableStatisticsIo.sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_write")
    public static final SqlColumn<BigDecimal> countWrite = XPsSchemaTableStatisticsIo.countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_write")
    public static final SqlColumn<BigDecimal> sumNumberOfBytesWrite = XPsSchemaTableStatisticsIo.sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_write")
    public static final SqlColumn<BigDecimal> sumTimerWrite = XPsSchemaTableStatisticsIo.sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_misc")
    public static final SqlColumn<BigDecimal> countMisc = XPsSchemaTableStatisticsIo.countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_misc")
    public static final SqlColumn<BigDecimal> sumTimerMisc = XPsSchemaTableStatisticsIo.sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    public static final class XPsSchemaTableStatisticsIo extends SqlTable {
        public final SqlColumn<String> tableSchema = column("table_schema", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> countRead = column("count_read", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> sumNumberOfBytesRead = column("sum_number_of_bytes_read", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> sumTimerRead = column("sum_timer_read", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> countWrite = column("count_write", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> sumNumberOfBytesWrite = column("sum_number_of_bytes_write", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> sumTimerWrite = column("sum_timer_write", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> countMisc = column("count_misc", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> sumTimerMisc = column("sum_timer_misc", JDBCType.DECIMAL);

        public XPsSchemaTableStatisticsIo() {
            super("x$ps_schema_table_statistics_io");
        }
    }
}