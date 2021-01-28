package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XSession implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0507607+08:00", comments="Source field: x$session.thd_id")
    private Long thdId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0507607+08:00", comments="Source field: x$session.conn_id")
    private Long connId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.command")
    private String command;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.state")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.time")
    private Long time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.statement_latency")
    private Long statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.progress")
    private BigDecimal progress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.lock_latency")
    private Long lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_examined")
    private Long rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_sent")
    private Long rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_affected")
    private Long rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.tmp_tables")
    private Long tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.tmp_disk_tables")
    private Long tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.full_scan")
    private String fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.last_statement_latency")
    private Long lastStatementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.current_memory")
    private BigDecimal currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.last_wait")
    private String lastWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.last_wait_latency")
    private String lastWaitLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.source")
    private String source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_latency")
    private Long trxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_state")
    private String trxState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_autocommit")
    private String trxAutocommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.pid")
    private String pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.program_name")
    private String programName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.current_statement")
    private String currentStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.last_statement")
    private String lastStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source Table: x$session")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0507607+08:00", comments="Source field: x$session.thd_id")
    public Long getThdId() {
        return thdId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0507607+08:00", comments="Source field: x$session.thd_id")
    public void setThdId(Long thdId) {
        this.thdId = thdId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.conn_id")
    public Long getConnId() {
        return connId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.conn_id")
    public void setConnId(Long connId) {
        this.connId = connId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.command")
    public String getCommand() {
        return command;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.command")
    public void setCommand(String command) {
        this.command = command;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.state")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.state")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.time")
    public Long getTime() {
        return time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.time")
    public void setTime(Long time) {
        this.time = time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.statement_latency")
    public Long getStatementLatency() {
        return statementLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.statement_latency")
    public void setStatementLatency(Long statementLatency) {
        this.statementLatency = statementLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.progress")
    public BigDecimal getProgress() {
        return progress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.progress")
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.lock_latency")
    public Long getLockLatency() {
        return lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.lock_latency")
    public void setLockLatency(Long lockLatency) {
        this.lockLatency = lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_examined")
    public Long getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_examined")
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_sent")
    public Long getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_sent")
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_affected")
    public Long getRowsAffected() {
        return rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.rows_affected")
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.tmp_tables")
    public Long getTmpTables() {
        return tmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.tmp_tables")
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.tmp_disk_tables")
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.tmp_disk_tables")
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.full_scan")
    public String getFullScan() {
        return fullScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.full_scan")
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.last_statement_latency")
    public Long getLastStatementLatency() {
        return lastStatementLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.last_statement_latency")
    public void setLastStatementLatency(Long lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.current_memory")
    public BigDecimal getCurrentMemory() {
        return currentMemory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.current_memory")
    public void setCurrentMemory(BigDecimal currentMemory) {
        this.currentMemory = currentMemory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.last_wait")
    public String getLastWait() {
        return lastWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0517615+08:00", comments="Source field: x$session.last_wait")
    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.last_wait_latency")
    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.last_wait_latency")
    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.source")
    public String getSource() {
        return source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.source")
    public void setSource(String source) {
        this.source = source;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_latency")
    public Long getTrxLatency() {
        return trxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_latency")
    public void setTrxLatency(Long trxLatency) {
        this.trxLatency = trxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_state")
    public String getTrxState() {
        return trxState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_state")
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_autocommit")
    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.trx_autocommit")
    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.pid")
    public String getPid() {
        return pid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.pid")
    public void setPid(String pid) {
        this.pid = pid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.program_name")
    public String getProgramName() {
        return programName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.program_name")
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.current_statement")
    public String getCurrentStatement() {
        return currentStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.current_statement")
    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.last_statement")
    public String getLastStatement() {
        return lastStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source field: x$session.last_statement")
    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source Table: x$session")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", thdId=").append(thdId);
        sb.append(", connId=").append(connId);
        sb.append(", user=").append(user);
        sb.append(", db=").append(db);
        sb.append(", command=").append(command);
        sb.append(", state=").append(state);
        sb.append(", time=").append(time);
        sb.append(", statementLatency=").append(statementLatency);
        sb.append(", progress=").append(progress);
        sb.append(", lockLatency=").append(lockLatency);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", tmpTables=").append(tmpTables);
        sb.append(", tmpDiskTables=").append(tmpDiskTables);
        sb.append(", fullScan=").append(fullScan);
        sb.append(", lastStatementLatency=").append(lastStatementLatency);
        sb.append(", currentMemory=").append(currentMemory);
        sb.append(", lastWait=").append(lastWait);
        sb.append(", lastWaitLatency=").append(lastWaitLatency);
        sb.append(", source=").append(source);
        sb.append(", trxLatency=").append(trxLatency);
        sb.append(", trxState=").append(trxState);
        sb.append(", trxAutocommit=").append(trxAutocommit);
        sb.append(", pid=").append(pid);
        sb.append(", programName=").append(programName);
        sb.append(", currentStatement=").append(currentStatement);
        sb.append(", lastStatement=").append(lastStatement);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source Table: x$session")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        XSession other = (XSession) that;
        return (this.getThdId() == null ? other.getThdId() == null : this.getThdId().equals(other.getThdId()))
            && (this.getConnId() == null ? other.getConnId() == null : this.getConnId().equals(other.getConnId()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getCommand() == null ? other.getCommand() == null : this.getCommand().equals(other.getCommand()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getStatementLatency() == null ? other.getStatementLatency() == null : this.getStatementLatency().equals(other.getStatementLatency()))
            && (this.getProgress() == null ? other.getProgress() == null : this.getProgress().equals(other.getProgress()))
            && (this.getLockLatency() == null ? other.getLockLatency() == null : this.getLockLatency().equals(other.getLockLatency()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsAffected() == null ? other.getRowsAffected() == null : this.getRowsAffected().equals(other.getRowsAffected()))
            && (this.getTmpTables() == null ? other.getTmpTables() == null : this.getTmpTables().equals(other.getTmpTables()))
            && (this.getTmpDiskTables() == null ? other.getTmpDiskTables() == null : this.getTmpDiskTables().equals(other.getTmpDiskTables()))
            && (this.getFullScan() == null ? other.getFullScan() == null : this.getFullScan().equals(other.getFullScan()))
            && (this.getLastStatementLatency() == null ? other.getLastStatementLatency() == null : this.getLastStatementLatency().equals(other.getLastStatementLatency()))
            && (this.getCurrentMemory() == null ? other.getCurrentMemory() == null : this.getCurrentMemory().equals(other.getCurrentMemory()))
            && (this.getLastWait() == null ? other.getLastWait() == null : this.getLastWait().equals(other.getLastWait()))
            && (this.getLastWaitLatency() == null ? other.getLastWaitLatency() == null : this.getLastWaitLatency().equals(other.getLastWaitLatency()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTrxLatency() == null ? other.getTrxLatency() == null : this.getTrxLatency().equals(other.getTrxLatency()))
            && (this.getTrxState() == null ? other.getTrxState() == null : this.getTrxState().equals(other.getTrxState()))
            && (this.getTrxAutocommit() == null ? other.getTrxAutocommit() == null : this.getTrxAutocommit().equals(other.getTrxAutocommit()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getProgramName() == null ? other.getProgramName() == null : this.getProgramName().equals(other.getProgramName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0527622+08:00", comments="Source Table: x$session")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThdId() == null) ? 0 : getThdId().hashCode());
        result = prime * result + ((getConnId() == null) ? 0 : getConnId().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getCommand() == null) ? 0 : getCommand().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getStatementLatency() == null) ? 0 : getStatementLatency().hashCode());
        result = prime * result + ((getProgress() == null) ? 0 : getProgress().hashCode());
        result = prime * result + ((getLockLatency() == null) ? 0 : getLockLatency().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsAffected() == null) ? 0 : getRowsAffected().hashCode());
        result = prime * result + ((getTmpTables() == null) ? 0 : getTmpTables().hashCode());
        result = prime * result + ((getTmpDiskTables() == null) ? 0 : getTmpDiskTables().hashCode());
        result = prime * result + ((getFullScan() == null) ? 0 : getFullScan().hashCode());
        result = prime * result + ((getLastStatementLatency() == null) ? 0 : getLastStatementLatency().hashCode());
        result = prime * result + ((getCurrentMemory() == null) ? 0 : getCurrentMemory().hashCode());
        result = prime * result + ((getLastWait() == null) ? 0 : getLastWait().hashCode());
        result = prime * result + ((getLastWaitLatency() == null) ? 0 : getLastWaitLatency().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getTrxLatency() == null) ? 0 : getTrxLatency().hashCode());
        result = prime * result + ((getTrxState() == null) ? 0 : getTrxState().hashCode());
        result = prime * result + ((getTrxAutocommit() == null) ? 0 : getTrxAutocommit().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        return result;
    }
}