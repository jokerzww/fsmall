package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class XStatementsWithTempTables implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.exec_count")
    private Long execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.total_latency")
    private Long totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.memory_tmp_tables")
    private Long memoryTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.disk_tmp_tables")
    private Long diskTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.avg_tmp_tables_per_query")
    private BigDecimal avgTmpTablesPerQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.tmp_tables_to_disk_pct")
    private BigDecimal tmpTablesToDiskPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.first_seen")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.last_seen")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.digest")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.query")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source Table: x$statements_with_temp_tables")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.exec_count")
    public Long getExecCount() {
        return execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.exec_count")
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.total_latency")
    public Long getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.total_latency")
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.memory_tmp_tables")
    public Long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.memory_tmp_tables")
    public void setMemoryTmpTables(Long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.disk_tmp_tables")
    public Long getDiskTmpTables() {
        return diskTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.disk_tmp_tables")
    public void setDiskTmpTables(Long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.avg_tmp_tables_per_query")
    public BigDecimal getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.avg_tmp_tables_per_query")
    public void setAvgTmpTablesPerQuery(BigDecimal avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.tmp_tables_to_disk_pct")
    public BigDecimal getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.tmp_tables_to_disk_pct")
    public void setTmpTablesToDiskPct(BigDecimal tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.first_seen")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.first_seen")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.last_seen")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.last_seen")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.digest")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.query")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source field: x$statements_with_temp_tables.query")
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2039026+08:00", comments="Source Table: x$statements_with_temp_tables")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", execCount=").append(execCount);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", memoryTmpTables=").append(memoryTmpTables);
        sb.append(", diskTmpTables=").append(diskTmpTables);
        sb.append(", avgTmpTablesPerQuery=").append(avgTmpTablesPerQuery);
        sb.append(", tmpTablesToDiskPct=").append(tmpTablesToDiskPct);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", digest=").append(digest);
        sb.append(", query=").append(query);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
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
        XStatementsWithTempTables other = (XStatementsWithTempTables) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getExecCount() == null ? other.getExecCount() == null : this.getExecCount().equals(other.getExecCount()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getMemoryTmpTables() == null ? other.getMemoryTmpTables() == null : this.getMemoryTmpTables().equals(other.getMemoryTmpTables()))
            && (this.getDiskTmpTables() == null ? other.getDiskTmpTables() == null : this.getDiskTmpTables().equals(other.getDiskTmpTables()))
            && (this.getAvgTmpTablesPerQuery() == null ? other.getAvgTmpTablesPerQuery() == null : this.getAvgTmpTablesPerQuery().equals(other.getAvgTmpTablesPerQuery()))
            && (this.getTmpTablesToDiskPct() == null ? other.getTmpTablesToDiskPct() == null : this.getTmpTablesToDiskPct().equals(other.getTmpTablesToDiskPct()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getExecCount() == null) ? 0 : getExecCount().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getMemoryTmpTables() == null) ? 0 : getMemoryTmpTables().hashCode());
        result = prime * result + ((getDiskTmpTables() == null) ? 0 : getDiskTmpTables().hashCode());
        result = prime * result + ((getAvgTmpTablesPerQuery() == null) ? 0 : getAvgTmpTablesPerQuery().hashCode());
        result = prime * result + ((getTmpTablesToDiskPct() == null) ? 0 : getTmpTablesToDiskPct().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return result;
    }
}