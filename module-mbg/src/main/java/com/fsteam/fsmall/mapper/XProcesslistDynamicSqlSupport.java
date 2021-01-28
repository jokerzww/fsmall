package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XProcesslistDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3160031+08:00", comments="Source Table: x$processlist")
    public static final XProcesslist XProcesslist = new XProcesslist();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3160031+08:00", comments="Source field: x$processlist.thd_id")
    public static final SqlColumn<Long> thdId = XProcesslist.thdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3160031+08:00", comments="Source field: x$processlist.conn_id")
    public static final SqlColumn<Long> connId = XProcesslist.connId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3160031+08:00", comments="Source field: x$processlist.user")
    public static final SqlColumn<String> user = XProcesslist.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.db")
    public static final SqlColumn<String> db = XProcesslist.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.command")
    public static final SqlColumn<String> command = XProcesslist.command;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.state")
    public static final SqlColumn<String> state = XProcesslist.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.time")
    public static final SqlColumn<Long> time = XProcesslist.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.statement_latency")
    public static final SqlColumn<Long> statementLatency = XProcesslist.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.progress")
    public static final SqlColumn<BigDecimal> progress = XProcesslist.progress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.lock_latency")
    public static final SqlColumn<Long> lockLatency = XProcesslist.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.rows_examined")
    public static final SqlColumn<Long> rowsExamined = XProcesslist.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.rows_sent")
    public static final SqlColumn<Long> rowsSent = XProcesslist.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.rows_affected")
    public static final SqlColumn<Long> rowsAffected = XProcesslist.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.tmp_tables")
    public static final SqlColumn<Long> tmpTables = XProcesslist.tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.tmp_disk_tables")
    public static final SqlColumn<Long> tmpDiskTables = XProcesslist.tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.full_scan")
    public static final SqlColumn<String> fullScan = XProcesslist.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.last_statement_latency")
    public static final SqlColumn<Long> lastStatementLatency = XProcesslist.lastStatementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.current_memory")
    public static final SqlColumn<BigDecimal> currentMemory = XProcesslist.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.last_wait")
    public static final SqlColumn<String> lastWait = XProcesslist.lastWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.last_wait_latency")
    public static final SqlColumn<String> lastWaitLatency = XProcesslist.lastWaitLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.source")
    public static final SqlColumn<String> source = XProcesslist.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.trx_latency")
    public static final SqlColumn<Long> trxLatency = XProcesslist.trxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.317003+08:00", comments="Source field: x$processlist.trx_state")
    public static final SqlColumn<String> trxState = XProcesslist.trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3180041+08:00", comments="Source field: x$processlist.trx_autocommit")
    public static final SqlColumn<String> trxAutocommit = XProcesslist.trxAutocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3180041+08:00", comments="Source field: x$processlist.pid")
    public static final SqlColumn<String> pid = XProcesslist.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3180041+08:00", comments="Source field: x$processlist.program_name")
    public static final SqlColumn<String> programName = XProcesslist.programName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3180041+08:00", comments="Source field: x$processlist.current_statement")
    public static final SqlColumn<String> currentStatement = XProcesslist.currentStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3180041+08:00", comments="Source field: x$processlist.last_statement")
    public static final SqlColumn<String> lastStatement = XProcesslist.lastStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3160031+08:00", comments="Source Table: x$processlist")
    public static final class XProcesslist extends SqlTable {
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

        public XProcesslist() {
            super("x$processlist");
        }
    }
}