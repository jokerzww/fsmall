package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SessionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source Table: session")
    public static final Session session = new Session();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.thd_id")
    public static final SqlColumn<Long> thdId = session.thdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.conn_id")
    public static final SqlColumn<Long> connId = session.connId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.user")
    public static final SqlColumn<String> user = session.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.db")
    public static final SqlColumn<String> db = session.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.command")
    public static final SqlColumn<String> command = session.command;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.state")
    public static final SqlColumn<String> state = session.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.time")
    public static final SqlColumn<Long> time = session.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.statement_latency")
    public static final SqlColumn<String> statementLatency = session.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.progress")
    public static final SqlColumn<BigDecimal> progress = session.progress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.lock_latency")
    public static final SqlColumn<String> lockLatency = session.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.rows_examined")
    public static final SqlColumn<Long> rowsExamined = session.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source field: session.rows_sent")
    public static final SqlColumn<Long> rowsSent = session.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.rows_affected")
    public static final SqlColumn<Long> rowsAffected = session.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.tmp_tables")
    public static final SqlColumn<Long> tmpTables = session.tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.tmp_disk_tables")
    public static final SqlColumn<Long> tmpDiskTables = session.tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.full_scan")
    public static final SqlColumn<String> fullScan = session.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.last_statement_latency")
    public static final SqlColumn<String> lastStatementLatency = session.lastStatementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.current_memory")
    public static final SqlColumn<String> currentMemory = session.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.last_wait")
    public static final SqlColumn<String> lastWait = session.lastWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.last_wait_latency")
    public static final SqlColumn<String> lastWaitLatency = session.lastWaitLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.source")
    public static final SqlColumn<String> source = session.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.trx_latency")
    public static final SqlColumn<String> trxLatency = session.trxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.trx_state")
    public static final SqlColumn<String> trxState = session.trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.trx_autocommit")
    public static final SqlColumn<String> trxAutocommit = session.trxAutocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.pid")
    public static final SqlColumn<String> pid = session.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.program_name")
    public static final SqlColumn<String> programName = session.programName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.current_statement")
    public static final SqlColumn<String> currentStatement = session.currentStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1618625+08:00", comments="Source field: session.last_statement")
    public static final SqlColumn<String> lastStatement = session.lastStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1608615+08:00", comments="Source Table: session")
    public static final class Session extends SqlTable {
        public final SqlColumn<Long> thdId = column("thd_id", JDBCType.BIGINT);

        public final SqlColumn<Long> connId = column("conn_id", JDBCType.BIGINT);

        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<String> command = column("command", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("state", JDBCType.VARCHAR);

        public final SqlColumn<Long> time = column("time", JDBCType.BIGINT);

        public final SqlColumn<String> statementLatency = column("statement_latency", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> progress = column("progress", JDBCType.DECIMAL);

        public final SqlColumn<String> lockLatency = column("lock_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowsExamined = column("rows_examined", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSent = column("rows_sent", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsAffected = column("rows_affected", JDBCType.BIGINT);

        public final SqlColumn<Long> tmpTables = column("tmp_tables", JDBCType.BIGINT);

        public final SqlColumn<Long> tmpDiskTables = column("tmp_disk_tables", JDBCType.BIGINT);

        public final SqlColumn<String> fullScan = column("full_scan", JDBCType.VARCHAR);

        public final SqlColumn<String> lastStatementLatency = column("last_statement_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> currentMemory = column("current_memory", JDBCType.VARCHAR);

        public final SqlColumn<String> lastWait = column("last_wait", JDBCType.VARCHAR);

        public final SqlColumn<String> lastWaitLatency = column("last_wait_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("source", JDBCType.VARCHAR);

        public final SqlColumn<String> trxLatency = column("trx_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> trxState = column("trx_state", JDBCType.CHAR);

        public final SqlColumn<String> trxAutocommit = column("trx_autocommit", JDBCType.CHAR);

        public final SqlColumn<String> pid = column("pid", JDBCType.VARCHAR);

        public final SqlColumn<String> programName = column("program_name", JDBCType.VARCHAR);

        public final SqlColumn<String> currentStatement = column("current_statement", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> lastStatement = column("last_statement", JDBCType.LONGVARCHAR);

        public Session() {
            super("session");
        }
    }
}