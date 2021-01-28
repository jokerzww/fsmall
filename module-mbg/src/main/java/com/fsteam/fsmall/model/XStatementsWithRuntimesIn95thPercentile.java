package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class XStatementsWithRuntimesIn95thPercentile implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.full_scan")
    private String fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.exec_count")
    private Long execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.err_count")
    private Long errCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.warn_count")
    private Long warnCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.total_latency")
    private Long totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.max_latency")
    private Long maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.avg_latency")
    private Long avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_sent")
    private Long rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_examined")
    private Long rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.first_seen")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.last_seen")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.digest")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.query")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source Table: x$statements_with_runtimes_in_95th_percentile")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.full_scan")
    public String getFullScan() {
        return fullScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.full_scan")
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.exec_count")
    public Long getExecCount() {
        return execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.exec_count")
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.err_count")
    public Long getErrCount() {
        return errCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.err_count")
    public void setErrCount(Long errCount) {
        this.errCount = errCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.warn_count")
    public Long getWarnCount() {
        return warnCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.warn_count")
    public void setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.total_latency")
    public Long getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.total_latency")
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.max_latency")
    public Long getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.max_latency")
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.avg_latency")
    public Long getAvgLatency() {
        return avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.avg_latency")
    public void setAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_sent")
    public Long getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_sent")
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_sent_avg")
    public BigDecimal getRowsSentAvg() {
        return rowsSentAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_sent_avg")
    public void setRowsSentAvg(BigDecimal rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_examined")
    public Long getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_examined")
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_examined_avg")
    public BigDecimal getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.rows_examined_avg")
    public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.first_seen")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.first_seen")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.last_seen")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.last_seen")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.digest")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.query")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source field: x$statements_with_runtimes_in_95th_percentile.query")
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source Table: x$statements_with_runtimes_in_95th_percentile")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", fullScan=").append(fullScan);
        sb.append(", execCount=").append(execCount);
        sb.append(", errCount=").append(errCount);
        sb.append(", warnCount=").append(warnCount);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", avgLatency=").append(avgLatency);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsSentAvg=").append(rowsSentAvg);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsExaminedAvg=").append(rowsExaminedAvg);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", digest=").append(digest);
        sb.append(", query=").append(query);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source Table: x$statements_with_runtimes_in_95th_percentile")
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
        XStatementsWithRuntimesIn95thPercentile other = (XStatementsWithRuntimesIn95thPercentile) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getFullScan() == null ? other.getFullScan() == null : this.getFullScan().equals(other.getFullScan()))
            && (this.getExecCount() == null ? other.getExecCount() == null : this.getExecCount().equals(other.getExecCount()))
            && (this.getErrCount() == null ? other.getErrCount() == null : this.getErrCount().equals(other.getErrCount()))
            && (this.getWarnCount() == null ? other.getWarnCount() == null : this.getWarnCount().equals(other.getWarnCount()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()))
            && (this.getAvgLatency() == null ? other.getAvgLatency() == null : this.getAvgLatency().equals(other.getAvgLatency()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsSentAvg() == null ? other.getRowsSentAvg() == null : this.getRowsSentAvg().equals(other.getRowsSentAvg()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getRowsExaminedAvg() == null ? other.getRowsExaminedAvg() == null : this.getRowsExaminedAvg().equals(other.getRowsExaminedAvg()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.533201+08:00", comments="Source Table: x$statements_with_runtimes_in_95th_percentile")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getFullScan() == null) ? 0 : getFullScan().hashCode());
        result = prime * result + ((getExecCount() == null) ? 0 : getExecCount().hashCode());
        result = prime * result + ((getErrCount() == null) ? 0 : getErrCount().hashCode());
        result = prime * result + ((getWarnCount() == null) ? 0 : getWarnCount().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getMaxLatency() == null) ? 0 : getMaxLatency().hashCode());
        result = prime * result + ((getAvgLatency() == null) ? 0 : getAvgLatency().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsSentAvg() == null) ? 0 : getRowsSentAvg().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getRowsExaminedAvg() == null) ? 0 : getRowsExaminedAvg().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return result;
    }
}