package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationApplierFiltersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: replication_applier_filters")
    public static final ReplicationApplierFilters replicationApplierFilters = new ReplicationApplierFilters();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationApplierFilters.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source field: replication_applier_filters.FILTER_NAME")
    public static final SqlColumn<String> filterName = replicationApplierFilters.filterName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3670496+08:00", comments="Source field: replication_applier_filters.CONFIGURED_BY")
    public static final SqlColumn<String> configuredBy = replicationApplierFilters.configuredBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3670496+08:00", comments="Source field: replication_applier_filters.ACTIVE_SINCE")
    public static final SqlColumn<Date> activeSince = replicationApplierFilters.activeSince;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3670496+08:00", comments="Source field: replication_applier_filters.COUNTER")
    public static final SqlColumn<Long> counter = replicationApplierFilters.counter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3670496+08:00", comments="Source field: replication_applier_filters.FILTER_RULE")
    public static final SqlColumn<String> filterRule = replicationApplierFilters.filterRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: replication_applier_filters")
    public static final class ReplicationApplierFilters extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<String> filterName = column("FILTER_NAME", JDBCType.CHAR);

        public final SqlColumn<String> configuredBy = column("CONFIGURED_BY", JDBCType.CHAR);

        public final SqlColumn<Date> activeSince = column("ACTIVE_SINCE", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> counter = column("COUNTER", JDBCType.BIGINT);

        public final SqlColumn<String> filterRule = column("FILTER_RULE", JDBCType.LONGVARCHAR);

        public ReplicationApplierFilters() {
            super("replication_applier_filters");
        }
    }
}