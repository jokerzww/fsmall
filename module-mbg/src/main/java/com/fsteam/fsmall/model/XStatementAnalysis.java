package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class XStatementAnalysis implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.full_scan")
    private String fullScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.exec_count")
    private Long execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.err_count")
    private Long errCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.warn_count")
    private Long warnCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.total_latency")
    private Long totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.max_latency")
    private Long maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.avg_latency")
    private Long avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.lock_latency")
    private Long lockLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sent")
    private Long rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_examined")
    private Long rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_affected")
    private Long rowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_affected_avg")
    private BigDecimal rowsAffectedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.tmp_tables")
    private Long tmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.tmp_disk_tables")
    private Long tmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sorted")
    private Long rowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.sort_merge_passes")
    private Long sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.digest")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.first_seen")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.last_seen")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.query")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$statement_analysis")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.full_scan")
    public String getFullScan() {
        return fullScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.full_scan")
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.exec_count")
    public Long getExecCount() {
        return execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.exec_count")
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.err_count")
    public Long getErrCount() {
        return errCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.err_count")
    public void setErrCount(Long errCount) {
        this.errCount = errCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.warn_count")
    public Long getWarnCount() {
        return warnCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.warn_count")
    public void setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.total_latency")
    public Long getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.total_latency")
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.max_latency")
    public Long getMaxLatency() {
        return maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.max_latency")
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.avg_latency")
    public Long getAvgLatency() {
        return avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.avg_latency")
    public void setAvgLatency(Long avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.lock_latency")
    public Long getLockLatency() {
        return lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.lock_latency")
    public void setLockLatency(Long lockLatency) {
        this.lockLatency = lockLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sent")
    public Long getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sent")
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sent_avg")
    public BigDecimal getRowsSentAvg() {
        return rowsSentAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sent_avg")
    public void setRowsSentAvg(BigDecimal rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_examined")
    public Long getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_examined")
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_examined_avg")
    public BigDecimal getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_examined_avg")
    public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_affected")
    public Long getRowsAffected() {
        return rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_affected")
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_affected_avg")
    public BigDecimal getRowsAffectedAvg() {
        return rowsAffectedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_affected_avg")
    public void setRowsAffectedAvg(BigDecimal rowsAffectedAvg) {
        this.rowsAffectedAvg = rowsAffectedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.tmp_tables")
    public Long getTmpTables() {
        return tmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.tmp_tables")
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.tmp_disk_tables")
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.tmp_disk_tables")
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sorted")
    public Long getRowsSorted() {
        return rowsSorted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.rows_sorted")
    public void setRowsSorted(Long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.sort_merge_passes")
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.sort_merge_passes")
    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.digest")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.first_seen")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.first_seen")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.last_seen")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.last_seen")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.query")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source field: x$statement_analysis.query")
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$statement_analysis")
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
        sb.append(", lockLatency=").append(lockLatency);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsSentAvg=").append(rowsSentAvg);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsExaminedAvg=").append(rowsExaminedAvg);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", rowsAffectedAvg=").append(rowsAffectedAvg);
        sb.append(", tmpTables=").append(tmpTables);
        sb.append(", tmpDiskTables=").append(tmpDiskTables);
        sb.append(", rowsSorted=").append(rowsSorted);
        sb.append(", sortMergePasses=").append(sortMergePasses);
        sb.append(", digest=").append(digest);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", query=").append(query);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$statement_analysis")
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
        XStatementAnalysis other = (XStatementAnalysis) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getFullScan() == null ? other.getFullScan() == null : this.getFullScan().equals(other.getFullScan()))
            && (this.getExecCount() == null ? other.getExecCount() == null : this.getExecCount().equals(other.getExecCount()))
            && (this.getErrCount() == null ? other.getErrCount() == null : this.getErrCount().equals(other.getErrCount()))
            && (this.getWarnCount() == null ? other.getWarnCount() == null : this.getWarnCount().equals(other.getWarnCount()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getMaxLatency() == null ? other.getMaxLatency() == null : this.getMaxLatency().equals(other.getMaxLatency()))
            && (this.getAvgLatency() == null ? other.getAvgLatency() == null : this.getAvgLatency().equals(other.getAvgLatency()))
            && (this.getLockLatency() == null ? other.getLockLatency() == null : this.getLockLatency().equals(other.getLockLatency()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsSentAvg() == null ? other.getRowsSentAvg() == null : this.getRowsSentAvg().equals(other.getRowsSentAvg()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getRowsExaminedAvg() == null ? other.getRowsExaminedAvg() == null : this.getRowsExaminedAvg().equals(other.getRowsExaminedAvg()))
            && (this.getRowsAffected() == null ? other.getRowsAffected() == null : this.getRowsAffected().equals(other.getRowsAffected()))
            && (this.getRowsAffectedAvg() == null ? other.getRowsAffectedAvg() == null : this.getRowsAffectedAvg().equals(other.getRowsAffectedAvg()))
            && (this.getTmpTables() == null ? other.getTmpTables() == null : this.getTmpTables().equals(other.getTmpTables()))
            && (this.getTmpDiskTables() == null ? other.getTmpDiskTables() == null : this.getTmpDiskTables().equals(other.getTmpDiskTables()))
            && (this.getRowsSorted() == null ? other.getRowsSorted() == null : this.getRowsSorted().equals(other.getRowsSorted()))
            && (this.getSortMergePasses() == null ? other.getSortMergePasses() == null : this.getSortMergePasses().equals(other.getSortMergePasses()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4731463+08:00", comments="Source Table: x$statement_analysis")
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
        result = prime * result + ((getLockLatency() == null) ? 0 : getLockLatency().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsSentAvg() == null) ? 0 : getRowsSentAvg().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getRowsExaminedAvg() == null) ? 0 : getRowsExaminedAvg().hashCode());
        result = prime * result + ((getRowsAffected() == null) ? 0 : getRowsAffected().hashCode());
        result = prime * result + ((getRowsAffectedAvg() == null) ? 0 : getRowsAffectedAvg().hashCode());
        result = prime * result + ((getTmpTables() == null) ? 0 : getTmpTables().hashCode());
        result = prime * result + ((getTmpDiskTables() == null) ? 0 : getTmpDiskTables().hashCode());
        result = prime * result + ((getRowsSorted() == null) ? 0 : getRowsSorted().hashCode());
        result = prime * result + ((getSortMergePasses() == null) ? 0 : getSortMergePasses().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return result;
    }
}