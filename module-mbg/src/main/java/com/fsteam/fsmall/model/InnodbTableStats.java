package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class InnodbTableStats implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.database_name")
    private String databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.last_update")
    private Date lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.n_rows")
    private Long nRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.clustered_index_size")
    private Long clusteredIndexSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.sum_of_other_index_sizes")
    private Long sumOfOtherIndexSizes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.database_name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.last_update")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.last_update")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.n_rows")
    public Long getnRows() {
        return nRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.n_rows")
    public void setnRows(Long nRows) {
        this.nRows = nRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.clustered_index_size")
    public Long getClusteredIndexSize() {
        return clusteredIndexSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.clustered_index_size")
    public void setClusteredIndexSize(Long clusteredIndexSize) {
        this.clusteredIndexSize = clusteredIndexSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.sum_of_other_index_sizes")
    public Long getSumOfOtherIndexSizes() {
        return sumOfOtherIndexSizes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source field: innodb_table_stats.sum_of_other_index_sizes")
    public void setSumOfOtherIndexSizes(Long sumOfOtherIndexSizes) {
        this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", databaseName=").append(databaseName);
        sb.append(", tableName=").append(tableName);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", nRows=").append(nRows);
        sb.append(", clusteredIndexSize=").append(clusteredIndexSize);
        sb.append(", sumOfOtherIndexSizes=").append(sumOfOtherIndexSizes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
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
        InnodbTableStats other = (InnodbTableStats) that;
        return (this.getDatabaseName() == null ? other.getDatabaseName() == null : this.getDatabaseName().equals(other.getDatabaseName()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getnRows() == null ? other.getnRows() == null : this.getnRows().equals(other.getnRows()))
            && (this.getClusteredIndexSize() == null ? other.getClusteredIndexSize() == null : this.getClusteredIndexSize().equals(other.getClusteredIndexSize()))
            && (this.getSumOfOtherIndexSizes() == null ? other.getSumOfOtherIndexSizes() == null : this.getSumOfOtherIndexSizes().equals(other.getSumOfOtherIndexSizes()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getnRows() == null) ? 0 : getnRows().hashCode());
        result = prime * result + ((getClusteredIndexSize() == null) ? 0 : getClusteredIndexSize().hashCode());
        result = prime * result + ((getSumOfOtherIndexSizes() == null) ? 0 : getSumOfOtherIndexSizes().hashCode());
        return result;
    }
}