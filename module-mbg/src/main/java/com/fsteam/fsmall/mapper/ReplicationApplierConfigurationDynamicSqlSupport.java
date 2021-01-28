package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationApplierConfigurationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    public static final ReplicationApplierConfiguration replicationApplierConfiguration = new ReplicationApplierConfiguration();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationApplierConfiguration.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.DESIRED_DELAY")
    public static final SqlColumn<Integer> desiredDelay = replicationApplierConfiguration.desiredDelay;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_ROW_FORMAT")
    public static final SqlColumn<String> requireRowFormat = replicationApplierConfiguration.requireRowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK")
    public static final SqlColumn<String> requireTablePrimaryKeyCheck = replicationApplierConfiguration.requireTablePrimaryKeyCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source field: replication_applier_configuration.PRIVILEGE_CHECKS_USER")
    public static final SqlColumn<String> privilegeChecksUser = replicationApplierConfiguration.privilegeChecksUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    public static final class ReplicationApplierConfiguration extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<Integer> desiredDelay = column("DESIRED_DELAY", JDBCType.INTEGER);

        public final SqlColumn<String> requireRowFormat = column("REQUIRE_ROW_FORMAT", JDBCType.CHAR);

        public final SqlColumn<String> requireTablePrimaryKeyCheck = column("REQUIRE_TABLE_PRIMARY_KEY_CHECK", JDBCType.CHAR);

        public final SqlColumn<String> privilegeChecksUser = column("PRIVILEGE_CHECKS_USER", JDBCType.LONGVARCHAR);

        public ReplicationApplierConfiguration() {
            super("replication_applier_configuration");
        }
    }
}