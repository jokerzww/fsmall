package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProcesslistDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source Table: processlist")
    public static final Processlist processlist = new Processlist();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.thd_id")
    public static final SqlColumn<Long> thdId = processlist.thdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.conn_id")
    public static final SqlColumn<Long> connId = processlist.connId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.user")
    public static final SqlColumn<String> user = processlist.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.db")
    public static final SqlColumn<String> db = processlist.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.command")
    public static final SqlColumn<String> command = processlist.command;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.state")
    public static final SqlColumn<String> state = processlist.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.time")
    public static final SqlColumn<Long> time = processlist.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.statement_latency")
    public static final SqlColumn<String> statementLatency = processlist.statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.progress")
    public static final SqlColumn<BigDecimal> progress = processlist.progress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.lock_latency")
    public static final SqlColumn<String> lockLatency = processlist.lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.rows_examined")
    public static final SqlColumn<Long> rowsExamined = processlist.rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.rows_sent")
    public static final SqlColumn<Long> rowsSent = processlist.rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.rows_affected")
    public static final SqlColumn<Long> rowsAffected = processlist.rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.tmp_tables")
    public static final SqlColumn<Long> tmpTables = processlist.tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.tmp_disk_tables")
    public static final SqlColumn<Long> tmpDiskTables = processlist.tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.full_scan")
    public static final SqlColumn<String> fullScan = processlist.fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source field: processlist.last_statement_latency")
    public static final SqlColumn<String> lastStatementLatency = processlist.lastStatementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.current_memory")
    public static final SqlColumn<String> currentMemory = processlist.currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.last_wait")
    public static final SqlColumn<String> lastWait = processlist.lastWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.last_wait_latency")
    public static final SqlColumn<String> lastWaitLatency = processlist.lastWaitLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.source")
    public static final SqlColumn<String> source = processlist.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.trx_latency")
    public static final SqlColumn<String> trxLatency = processlist.trxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.trx_state")
    public static final SqlColumn<String> trxState = processlist.trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.trx_autocommit")
    public static final SqlColumn<String> trxAutocommit = processlist.trxAutocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.pid")
    public static final SqlColumn<String> pid = processlist.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.program_name")
    public static final SqlColumn<String> programName = processlist.programName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.current_statement")
    public static final SqlColumn<String> currentStatement = processlist.currentStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3880686+08:00", comments="Source field: processlist.last_statement")
    public static final SqlColumn<String> lastStatement = processlist.lastStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.387069+08:00", comments="Source Table: processlist")
    public static final class Processlist extends SqlTable {
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

        public Processlist() {
            super("processlist");
        }
    }
}