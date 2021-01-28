package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SlaveRelayLogInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source Table: slave_relay_log_info")
    public static final SlaveRelayLogInfo slaveRelayLogInfo = new SlaveRelayLogInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Channel_name")
    public static final SqlColumn<String> channelName = slaveRelayLogInfo.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Number_of_lines")
    public static final SqlColumn<Integer> numberOfLines = slaveRelayLogInfo.numberOfLines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Relay_log_pos")
    public static final SqlColumn<Long> relayLogPos = slaveRelayLogInfo.relayLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Master_log_pos")
    public static final SqlColumn<Long> masterLogPos = slaveRelayLogInfo.masterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Sql_delay")
    public static final SqlColumn<Integer> sqlDelay = slaveRelayLogInfo.sqlDelay;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Number_of_workers")
    public static final SqlColumn<Integer> numberOfWorkers = slaveRelayLogInfo.numberOfWorkers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Id")
    public static final SqlColumn<Integer> id = slaveRelayLogInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_username")
    public static final SqlColumn<String> privilegeChecksUsername = slaveRelayLogInfo.privilegeChecksUsername;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Privilege_checks_hostname")
    public static final SqlColumn<String> privilegeChecksHostname = slaveRelayLogInfo.privilegeChecksHostname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_row_format")
    public static final SqlColumn<Boolean> requireRowFormat = slaveRelayLogInfo.requireRowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Require_table_primary_key_check")
    public static final SqlColumn<String> requireTablePrimaryKeyCheck = slaveRelayLogInfo.requireTablePrimaryKeyCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source field: slave_relay_log_info.Relay_log_name")
    public static final SqlColumn<String> relayLogName = slaveRelayLogInfo.relayLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source field: slave_relay_log_info.Master_log_name")
    public static final SqlColumn<String> masterLogName = slaveRelayLogInfo.masterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4020808+08:00", comments="Source Table: slave_relay_log_info")
    public static final class SlaveRelayLogInfo extends SqlTable {
        public final SqlColumn<String> channelName = column("Channel_name", JDBCType.CHAR);

        public final SqlColumn<Integer> numberOfLines = column("Number_of_lines", JDBCType.INTEGER);

        public final SqlColumn<Long> relayLogPos = column("Relay_log_pos", JDBCType.BIGINT);

        public final SqlColumn<Long> masterLogPos = column("Master_log_pos", JDBCType.BIGINT);

        public final SqlColumn<Integer> sqlDelay = column("Sql_delay", JDBCType.INTEGER);

        public final SqlColumn<Integer> numberOfWorkers = column("Number_of_workers", JDBCType.INTEGER);

        public final SqlColumn<Integer> id = column("Id", JDBCType.INTEGER);

        public final SqlColumn<String> privilegeChecksUsername = column("Privilege_checks_username", JDBCType.CHAR);

        public final SqlColumn<String> privilegeChecksHostname = column("Privilege_checks_hostname", JDBCType.CHAR);

        public final SqlColumn<Boolean> requireRowFormat = column("Require_row_format", JDBCType.BIT);

        public final SqlColumn<String> requireTablePrimaryKeyCheck = column("Require_table_primary_key_check", JDBCType.CHAR);

        public final SqlColumn<String> relayLogName = column("Relay_log_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> masterLogName = column("Master_log_name", JDBCType.LONGVARCHAR);

        public SlaveRelayLogInfo() {
            super("slave_relay_log_info");
        }
    }
}