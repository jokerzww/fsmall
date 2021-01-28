package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GeneralLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    public static final GeneralLog generalLog = new GeneralLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.event_time")
    public static final SqlColumn<Date> eventTime = generalLog.eventTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.thread_id")
    public static final SqlColumn<Long> threadId = generalLog.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.server_id")
    public static final SqlColumn<Integer> serverId = generalLog.serverId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.command_type")
    public static final SqlColumn<String> commandType = generalLog.commandType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.user_host")
    public static final SqlColumn<String> userHost = generalLog.userHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: general_log.argument")
    public static final SqlColumn<byte[]> argument = generalLog.argument;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    public static final class GeneralLog extends SqlTable {
        public final SqlColumn<Date> eventTime = column("event_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> serverId = column("server_id", JDBCType.INTEGER);

        public final SqlColumn<String> commandType = column("command_type", JDBCType.VARCHAR);

        public final SqlColumn<String> userHost = column("user_host", JDBCType.LONGVARCHAR);

        public final SqlColumn<byte[]> argument = column("argument", JDBCType.LONGVARBINARY);

        public GeneralLog() {
            super("general_log");
        }
    }
}