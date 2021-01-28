package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XUserSummaryByStatementLatency implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.total")
    private BigDecimal total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.total_latency")
    private BigDecimal totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.max_latency")
    private BigDecimal maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.lock_latency")
    private BigDecimal lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_sent")
    private BigDecimal rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_examined")
    private BigDecimal rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_affected")
    private BigDecimal rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.full_scans")
    private BigDecimal fullScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source Table: x$user_summary_by_statement_latency")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.total")
    public BigDecimal getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.total")
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.total_latency")
    public BigDecimal getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.total_latency")
    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source field: x$user_summary_by_statement_latency.max_latency")
    public BigDecimal getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.max_latency")
    public void setMaxLatency(BigDecimal maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.lock_latency")
    public BigDecimal getLockLatency() {
        return lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.lock_latency")
    public void setLockLatency(BigDecimal lockLatency) {
        this.lockLatency = lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_sent")
    public BigDecimal getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_sent")
    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_examined")
    public BigDecimal getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_examined")
    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_affected")
    public BigDecimal getRowsAffected() {
        return rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.rows_affected")
    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.full_scans")
    public BigDecimal getFullScans() {
        return fullScans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source field: x$user_summary_by_statement_latency.full_scans")
    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source Table: x$user_summary_by_statement_latency")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source Table: x$user_summary_by_statement_latency")
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
        XUserSummaryByStatementLatency other = (XUserSummaryByStatementLatency) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3280141+08:00", comments="Source Table: x$user_summary_by_statement_latency")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
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