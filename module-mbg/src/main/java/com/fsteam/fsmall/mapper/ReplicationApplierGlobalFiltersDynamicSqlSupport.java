package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationApplierGlobalFiltersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: replication_applier_global_filters")
    public static final ReplicationApplierGlobalFilters replicationApplierGlobalFilters = new ReplicationApplierGlobalFilters();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source field: replication_applier_global_filters.FILTER_NAME")
    public static final SqlColumn<String> filterName = replicationApplierGlobalFilters.filterName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source field: replication_applier_global_filters.CONFIGURED_BY")
    public static final SqlColumn<String> configuredBy = replicationApplierGlobalFilters.configuredBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source field: replication_applier_global_filters.ACTIVE_SINCE")
    public static final SqlColumn<Date> activeSince = replicationApplierGlobalFilters.activeSince;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source field: replication_applier_global_filters.FILTER_RULE")
    public static final SqlColumn<String> filterRule = replicationApplierGlobalFilters.filterRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1488509+08:00", comments="Source Table: replication_applier_global_filters")
    public static final class ReplicationApplierGlobalFilters extends SqlTable {
        public final SqlColumn<String> filterName = column("FILTER_NAME", JDBCType.CHAR);

        public final SqlColumn<String> configuredBy = column("CONFIGURED_BY", JDBCType.CHAR);

        public final SqlColumn<Date> activeSince = column("ACTIVE_SINCE", JDBCType.TIMESTAMP);

        public final SqlColumn<String> filterRule = column("FILTER_RULE", JDBCType.LONGVARCHAR);

        public ReplicationApplierGlobalFilters() {
            super("replication_applier_global_filters");
        }
    }
}