package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XSessionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source Table: x$session")
    public static final XSession XSession = new XSession();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.thd_id")
    public static final SqlColumn<Long> thdId = XSession.thdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.conn_id")
    public static final SqlColumn<Long> connId = XSession.connId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.user")
    public static final SqlColumn<String> user = XSession.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.db")
    public static final SqlColumn<String> db = XSession.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.command")
    public static final SqlColumn<String> command = XSession.command;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.state")
    public static final SqlColumn<String> state = XSession.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.time")
    public static final SqlColumn<Long> time = XSession.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0537632+08:00", comments="Source field: x$session.statement_latency")
    public static final SqlColumn<Long> statementLatency = XSession.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.progress")
    public static final SqlColumn<BigDecimal> progress = XSession.progress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.lock_latency")
    public static final SqlColumn<Long> lockLatency = XSession.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.rows_examined")
    public static final SqlColumn<Long> rowsExamined = XSession.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.rows_sent")
    public static final SqlColumn<Long> rowsSent = XSession.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.rows_affected")
    public static final SqlColumn<Long> rowsAffected = XSession.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.tmp_tables")
    public static final SqlColumn<Long> tmpTables = XSession.tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.054764+08:00", comments="Source field: x$session.tmp_disk_tables")
    public static final SqlColumn<Long> tmpDiskTables = XSession.tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.full_scan")
    public static final SqlColumn<String> fullScan = XSession.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.last_statement_latency")
    public static final SqlColumn<Long> lastStatementLatency = XSession.lastStatementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.current_memory")
    public static final SqlColumn<BigDecimal> currentMemory = XSession.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.last_wait")
    public static final SqlColumn<String> lastWait = XSession.lastWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.last_wait_latency")
    public static final SqlColumn<String> lastWaitLatency = XSession.lastWaitLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.source")
    public static final SqlColumn<String> source = XSession.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.trx_latency")
    public static final SqlColumn<Long> trxLatency = XSession.trxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.trx_state")
    public static final SqlColumn<String> trxState = XSession.trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0557651+08:00", comments="Source field: x$session.trx_autocommit")
    public static final SqlColumn<String> trxAutocommit = XSession.trxAutocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source field: x$session.pid")
    public static final SqlColumn<String> pid = XSession.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source field: x$session.program_name")
    public static final SqlColumn<String> programName = XSession.programName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source field: x$session.current_statement")
    public static final SqlColumn<String> currentStatement = XSession.currentStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source field: x$session.last_statement")
    public static final SqlColumn<String> lastStatement = XSession.lastStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source Table: x$session")
    public static final class XSession extends SqlTable {
        public final SqlColumn<Long> thdId = column("thd_id", JDBCType.BIGINT);

        public final SqlColumn<Long> connId = column("conn_id", JDBCType.BIGINT);

        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<String> command = column("command", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("state", JDBCType.VARCHAR);

        public final SqlColumn<Long> time = column("time", JDBCType.BIGINT);

        public final SqlColumn<Long> statementLatency = column("statement_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> progress = column("progress", JDBCType.DECIMAL);

        public final SqlColumn<Long> lockLatency = column("lock_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> tmpTables = column("tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<Long> tmpDiskTables = column("tmp_disk_tables", JDBCType.BIGINT);

        public final SqlColumn<String> fullScan = column("full_scan", JDBCType.VARCHAR);

        public final SqlColumn<Long> lastStatementLatency = column("last_statement_latency", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> currentMemory = column("current_memory", JDBCType.DECIMAL);

        public final SqlColumn<String> lastWait = column("last_wait", JDBCType.VARCHAR);

        public final SqlColumn<String> lastWaitLatency = column("last_wait_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<Long> trxLatency = column("trx_latency", JDBCType.BIGINT);

        public final SqlColumn<String> trxState = column("trx_state", JDBCType.CHAR);

        public final SqlColumn<String> trxAutocommit = column("trx_autocommit", JDBCType.CHAR);

        public final SqlColumn<String> pid = column("pid", JDBCType.VARCHAR);

        public final SqlColumn<String> programName = column("program_name", JDBCType.VARCHAR);

        public final SqlColumn<String> currentStatement = column("current_statement", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> lastStatement = column("last_statement", JDBCType.LONGVARCHAR);

        public XSession() {
            super("x$session");
        }
    }
}