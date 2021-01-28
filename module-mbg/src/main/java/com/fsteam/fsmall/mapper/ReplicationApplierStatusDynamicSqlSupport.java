package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationApplierStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    public static final ReplicationApplierStatus replicationApplierStatus = new ReplicationApplierStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationApplierStatus.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.SERVICE_STATE")
    public static final SqlColumn<String> serviceState = replicationApplierStatus.serviceState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.REMAINING_DELAY")
    public static final SqlColumn<Integer> remainingDelay = replicationApplierStatus.remainingDelay;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source field: replication_applier_status.COUNT_TRANSACTIONS_RETRIES")
    public static final SqlColumn<Long> countTransactionsRetries = replicationApplierStatus.countTransactionsRetries;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    public static final class ReplicationApplierStatus extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<String> serviceState = column("SERVICE_STATE", JDBCType.CHAR);

        public final SqlColumn<Integer> remainingDelay = column("REMAINING_DELAY", JDBCType.INTEGER);

        public final SqlColumn<Long> countTransactionsRetries = column("COUNT_TRANSACTIONS_RETRIES", JDBCType.BIGINT);

        public ReplicationApplierStatus() {
            super("replication_applier_status");
        }
    }
}