package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class XHostSummaryByStatementType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.statement")
    private String statement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total")
    private Long total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total_latency")
    private Long totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.max_latency")
    private Long maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.lock_latency")
    private Long lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_sent")
    private Long rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_examined")
    private Long rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_affected")
    private Long rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.full_scans")
    private Long fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: x$host_summary_by_statement_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.statement")
    public String getStatement() {
        return statement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.statement")
    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total")
    public Long getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total_latency")
    public Long getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.total_latency")
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.max_latency")
    public Long getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.max_latency")
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.lock_latency")
    public Long getLockLatency() {
        return lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.lock_latency")
    public void setLockLatency(Long lockLatency) {
        this.lockLatency = lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_sent")
    public Long getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_sent")
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_examined")
    public Long getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_examined")
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_affected")
    public Long getRowsAffected() {
        return rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.rows_affected")
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.full_scans")
    public Long getFullScans() {
        return fullScans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source field: x$host_summary_by_statement_type.full_scans")
    public void setFullScans(Long fullScans) {
        this.fullScans = fullScans;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: x$host_summary_by_statement_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", statement=").append(statement);
        sb.append(", total=").append(total);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", lockLatency=").append(lockLatency);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", fullScans=").append(fullScans);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: x$host_summary_by_statement_type")
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
        XHostSummaryByStatementType other = (XHostSummaryByStatementType) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getStatement() == null ? other.getStatement() == null : this.getStatement().equals(other.getStatement()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()))
            && (this.getLockLatency() == null ? other.getLockLatency() == null : this.getLockLatency().equals(other.getLockLatency()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getRowsAffected() == null ? other.getRowsAffected() == null : this.getRowsAffected().equals(other.getRowsAffected()))
            && (this.getFullScans() == null ? other.getFullScans() == null : this.getFullScans().equals(other.getFullScans()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: x$host_summary_by_statement_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getStatement() == null) ? 0 : getStatement().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        result = prime * result + ((getLockLatency() == null) ? 0 : getLockLatency().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getRowsAffected() == null) ? 0 : getRowsAffected().hashCode());
        result = prime * result + ((getFullScans() == null) ? 0 : getFullScans().hashCode());
        return result;
    }
}