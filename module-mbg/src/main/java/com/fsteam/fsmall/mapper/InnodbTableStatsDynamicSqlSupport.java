package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbTableStatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
    public static final InnodbTableStats innodbTableStats = new InnodbTableStats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.database_name")
    public static final SqlColumn<String> databaseName = innodbTableStats.databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.table_name")
    public static final SqlColumn<String> tableName = innodbTableStats.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.last_update")
    public static final SqlColumn<Date> lastUpdate = innodbTableStats.lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.n_rows")
    public static final SqlColumn<Long> nRows = innodbTableStats.nRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.clustered_index_size")
    public static final SqlColumn<Long> clusteredIndexSize = innodbTableStats.clusteredIndexSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.sum_of_other_index_sizes")
    public static final SqlColumn<Long> sumOfOtherIndexSizes = innodbTableStats.sumOfOtherIndexSizes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
    public static final class InnodbTableStats extends SqlTable {
        public final SqlColumn<String> databaseName = column("database_name", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> nRows = column("n_rows", JDBCType.BIGINT);

        public final SqlColumn<Long> clusteredIndexSize = column("clustered_index_size", JDBCType.BIGINT);

        public final SqlColumn<Long> sumOfOtherIndexSizes = column("sum_of_other_index_sizes", JDBCType.BIGINT);

        public InnodbTableStats() {
            super("innodb_table_stats");
        }
    }
}