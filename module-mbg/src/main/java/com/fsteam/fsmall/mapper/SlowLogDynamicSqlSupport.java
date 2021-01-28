package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SlowLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0237366+08:00", comments="Source Table: slow_log")
    public static final SlowLog slowLog = new SlowLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source field: slow_log.start_time")
    public static final SqlColumn<Date> startTime = slowLog.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source field: slow_log.query_time")
    public static final SqlColumn<Date> queryTime = slowLog.queryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source field: slow_log.lock_time")
    public static final SqlColumn<Date> lockTime = slowLog.lockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source field: slow_log.rows_sent")
    public static final SqlColumn<Integer> rowsSent = slowLog.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source field: slow_log.rows_examined")
    public static final SqlColumn<Integer> rowsExamined = slowLog.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source field: slow_log.db")
    public static final SqlColumn<String> db = slowLog.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source field: slow_log.last_insert_id")
    public static final SqlColumn<Integer> lastInsertId = slowLog.lastInsertId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source field: slow_log.insert_id")
    public static final SqlColumn<Integer> insertId = slowLog.insertId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source field: slow_log.server_id")
    public static final SqlColumn<Integer> serverId = slowLog.serverId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source field: slow_log.thread_id")
    public static final SqlColumn<Long> threadId = slowLog.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source field: slow_log.user_host")
    public static final SqlColumn<String> userHost = slowLog.userHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source field: slow_log.sql_text")
    public static final SqlColumn<byte[]> sqlText = slowLog.sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.024737+08:00", comments="Source Table: slow_log")
    public static final class SlowLog extends SqlTable {
        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> queryTime = column("query_time", JDBCType.TIME);

        public final SqlColumn<Date> lockTime = column("lock_time", JDBCType.TIME);

        public final SqlColumn<Integer> rowsSent = column("rows_sent", JDBCType.INTEGER);

        public final SqlColumn<Integer> rowsExamined = column("rows_examined", JDBCType.INTEGER);

        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Integer> lastInsertId = column("last_insert_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> insertId = column("insert_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> serverId = column("server_id", JDBCType.INTEGER);

        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<String> userHost = column("user_host", JDBCType.LONGVARCHAR);

        public final SqlColumn<byte[]> sqlText = column("sql_text", JDBCType.LONGVARBINARY);

        public SlowLog() {
            super("slow_log");
        }
    }
}