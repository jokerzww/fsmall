package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class XStatementsWithFullTableScans implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.exec_count")
    private Long execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.total_latency")
    private Long totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_count")
    private Long noIndexUsedCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_good_index_used_count")
    private Long noGoodIndexUsedCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_pct")
    private BigDecimal noIndexUsedPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent")
    private Long rowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined")
    private Long rowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.first_seen")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.last_seen")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.digest")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.query")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source Table: x$statements_with_full_table_scans")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.exec_count")
    public Long getExecCount() {
        return execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.exec_count")
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.total_latency")
    public Long getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.total_latency")
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_count")
    public Long getNoIndexUsedCount() {
        return noIndexUsedCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_count")
    public void setNoIndexUsedCount(Long noIndexUsedCount) {
        this.noIndexUsedCount = noIndexUsedCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_good_index_used_count")
    public Long getNoGoodIndexUsedCount() {
        return noGoodIndexUsedCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_good_index_used_count")
    public void setNoGoodIndexUsedCount(Long noGoodIndexUsedCount) {
        this.noGoodIndexUsedCount = noGoodIndexUsedCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_pct")
    public BigDecimal getNoIndexUsedPct() {
        return noIndexUsedPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.no_index_used_pct")
    public void setNoIndexUsedPct(BigDecimal noIndexUsedPct) {
        this.noIndexUsedPct = noIndexUsedPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent")
    public Long getRowsSent() {
        return rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent")
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined")
    public Long getRowsExamined() {
        return rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined")
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent_avg")
    public BigDecimal getRowsSentAvg() {
        return rowsSentAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_sent_avg")
    public void setRowsSentAvg(BigDecimal rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined_avg")
    public BigDecimal getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.rows_examined_avg")
    public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.first_seen")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.first_seen")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.last_seen")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.last_seen")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.digest")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.query")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source field: x$statements_with_full_table_scans.query")
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source Table: x$statements_with_full_table_scans")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", execCount=").append(execCount);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", noIndexUsedCount=").append(noIndexUsedCount);
        sb.append(", noGoodIndexUsedCount=").append(noGoodIndexUsedCount);
        sb.append(", noIndexUsedPct=").append(noIndexUsedPct);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsSentAvg=").append(rowsSentAvg);
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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source Table: x$statements_with_full_table_scans")
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
        XStatementsWithFullTableScans other = (XStatementsWithFullTableScans) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getExecCount() == null ? other.getExecCount() == null : this.getExecCount().equals(other.getExecCount()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getNoIndexUsedCount() == null ? other.getNoIndexUsedCount() == null : this.getNoIndexUsedCount().equals(other.getNoIndexUsedCount()))
            && (this.getNoGoodIndexUsedCount() == null ? other.getNoGoodIndexUsedCount() == null : this.getNoGoodIndexUsedCount().equals(other.getNoGoodIndexUsedCount()))
            && (this.getNoIndexUsedPct() == null ? other.getNoIndexUsedPct() == null : this.getNoIndexUsedPct().equals(other.getNoIndexUsedPct()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getRowsSentAvg() == null ? other.getRowsSentAvg() == null : this.getRowsSentAvg().equals(other.getRowsSentAvg()))
            && (this.getRowsExaminedAvg() == null ? other.getRowsExaminedAvg() == null : this.getRowsExaminedAvg().equals(other.getRowsExaminedAvg()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4771508+08:00", comments="Source Table: x$statements_with_full_table_scans")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getExecCount() == null) ? 0 : getExecCount().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getNoIndexUsedCount() == null) ? 0 : getNoIndexUsedCount().hashCode());
        result = prime * result + ((getNoGoodIndexUsedCount() == null) ? 0 : getNoGoodIndexUsedCount().hashCode());
        result = prime * result + ((getNoIndexUsedPct() == null) ? 0 : getNoIndexUsedPct().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getRowsSentAvg() == null) ? 0 : getRowsSentAvg().hashCode());
        result = prime * result + ((getRowsExaminedAvg() == null) ? 0 : getRowsExaminedAvg().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return result;
    }
}