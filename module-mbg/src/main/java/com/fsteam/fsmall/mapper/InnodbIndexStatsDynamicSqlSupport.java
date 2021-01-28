package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbIndexStatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    public static final InnodbIndexStats innodbIndexStats = new InnodbIndexStats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.database_name")
    public static final SqlColumn<String> databaseName = innodbIndexStats.databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.table_name")
    public static final SqlColumn<String> tableName = innodbIndexStats.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.index_name")
    public static final SqlColumn<String> indexName = innodbIndexStats.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_name")
    public static final SqlColumn<String> statName = innodbIndexStats.statName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.last_update")
    public static final SqlColumn<Date> lastUpdate = innodbIndexStats.lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_value")
    public static final SqlColumn<Long> statValue = innodbIndexStats.statValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.sample_size")
    public static final SqlColumn<Long> sampleSize = innodbIndexStats.sampleSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_description")
    public static final SqlColumn<String> statDescription = innodbIndexStats.statDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    public static final class InnodbIndexStats extends SqlTable {
        public final SqlColumn<String> databaseName = column("database_name", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("table_name", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("index_name", JDBCType.VARCHAR);

        public final SqlColumn<String> statName = column("stat_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> statValue = column("stat_value", JDBCType.BIGINT);

        public final SqlColumn<Long> sampleSize = column("sample_size", JDBCType.BIGINT);

        public final SqlColumn<String> statDescription = column("stat_description", JDBCType.VARCHAR);

        public InnodbIndexStats() {
            super("innodb_index_stats");
        }
    }
}