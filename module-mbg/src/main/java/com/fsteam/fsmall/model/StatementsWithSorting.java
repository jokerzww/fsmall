package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class StatementsWithSorting implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.exec_count")
    private Long execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.total_latency")
    private String totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_merge_passes")
    private Long sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.avg_sort_merges")
    private BigDecimal avgSortMerges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sorts_using_scans")
    private Long sortsUsingScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_using_range")
    private Long sortUsingRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.rows_sorted")
    private Long rowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.avg_rows_sorted")
    private BigDecimal avgRowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.first_seen")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.last_seen")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.digest")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.query")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source Table: statements_with_sorting")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.exec_count")
    public Long getExecCount() {
        return execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.exec_count")
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.total_latency")
    public String getTotalLatency() {
        return totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.total_latency")
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_merge_passes")
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_merge_passes")
    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.avg_sort_merges")
    public BigDecimal getAvgSortMerges() {
        return avgSortMerges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.avg_sort_merges")
    public void setAvgSortMerges(BigDecimal avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sorts_using_scans")
    public Long getSortsUsingScans() {
        return sortsUsingScans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sorts_using_scans")
    public void setSortsUsingScans(Long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_using_range")
    public Long getSortUsingRange() {
        return sortUsingRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_using_range")
    public void setSortUsingRange(Long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.rows_sorted")
    public Long getRowsSorted() {
        return rowsSorted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.rows_sorted")
    public void setRowsSorted(Long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.avg_rows_sorted")
    public BigDecimal getAvgRowsSorted() {
        return avgRowsSorted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.avg_rows_sorted")
    public void setAvgRowsSorted(BigDecimal avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.first_seen")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.first_seen")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.last_seen")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.last_seen")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.digest")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.query")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.query")
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source Table: statements_with_sorting")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", execCount=").append(execCount);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", sortMergePasses=").append(sortMergePasses);
        sb.append(", avgSortMerges=").append(avgSortMerges);
        sb.append(", sortsUsingScans=").append(sortsUsingScans);
        sb.append(", sortUsingRange=").append(sortUsingRange);
        sb.append(", rowsSorted=").append(rowsSorted);
        sb.append(", avgRowsSorted=").append(avgRowsSorted);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", digest=").append(digest);
        sb.append(", query=").append(query);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source Table: statements_with_sorting")
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
        StatementsWithSorting other = (StatementsWithSorting) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getExecCount() == null ? other.getExecCount() == null : this.getExecCount().equals(other.getExecCount()))
            && (this.getTotalLatency() == null ? other.getTotalLatency() == null : this.getTotalLatency().equals(other.getTotalLatency()))
            && (this.getSortMergePasses() == null ? other.getSortMergePasses() == null : this.getSortMergePasses().equals(other.getSortMergePasses()))
            && (this.getAvgSortMerges() == null ? other.getAvgSortMerges() == null : this.getAvgSortMerges().equals(other.getAvgSortMerges()))
            && (this.getSortsUsingScans() == null ? other.getSortsUsingScans() == null : this.getSortsUsingScans().equals(other.getSortsUsingScans()))
            && (this.getSortUsingRange() == null ? other.getSortUsingRange() == null : this.getSortUsingRange().equals(other.getSortUsingRange()))
            && (this.getRowsSorted() == null ? other.getRowsSorted() == null : this.getRowsSorted().equals(other.getRowsSorted()))
            && (this.getAvgRowsSorted() == null ? other.getAvgRowsSorted() == null : this.getAvgRowsSorted().equals(other.getAvgRowsSorted()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source Table: statements_with_sorting")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getExecCount() == null) ? 0 : getExecCount().hashCode());
        result = prime * result + ((getTotalLatency() == null) ? 0 : getTotalLatency().hashCode());
        result = prime * result + ((getSortMergePasses() == null) ? 0 : getSortMergePasses().hashCode());
        result = prime * result + ((getAvgSortMerges() == null) ? 0 : getAvgSortMerges().hashCode());
        result = prime * result + ((getSortsUsingScans() == null) ? 0 : getSortsUsingScans().hashCode());
        result = prime * result + ((getSortUsingRange() == null) ? 0 : getSortUsingRange().hashCode());
        result = prime * result + ((getRowsSorted() == null) ? 0 : getRowsSorted().hashCode());
        result = prime * result + ((getAvgRowsSorted() == null) ? 0 : getAvgRowsSorted().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return result;
    }
}