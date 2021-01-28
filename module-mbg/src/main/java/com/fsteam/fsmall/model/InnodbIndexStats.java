package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class InnodbIndexStats implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.database_name")
    private String databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.index_name")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_name")
    private String statName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.last_update")
    private Date lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_value")
    private Long statValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.sample_size")
    private Long sampleSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_description")
    private String statDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.database_name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.index_name")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_name")
    public String getStatName() {
        return statName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_name")
    public void setStatName(String statName) {
        this.statName = statName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.last_update")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.last_update")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_value")
    public Long getStatValue() {
        return statValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_value")
    public void setStatValue(Long statValue) {
        this.statValue = statValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.sample_size")
    public Long getSampleSize() {
        return sampleSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.sample_size")
    public void setSampleSize(Long sampleSize) {
        this.sampleSize = sampleSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_description")
    public String getStatDescription() {
        return statDescription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source field: innodb_index_stats.stat_description")
    public void setStatDescription(String statDescription) {
        this.statDescription = statDescription;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", databaseName=").append(databaseName);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", statName=").append(statName);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", statValue=").append(statValue);
        sb.append(", sampleSize=").append(sampleSize);
        sb.append(", statDescription=").append(statDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
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
        InnodbIndexStats other = (InnodbIndexStats) that;
        return (this.getDatabaseName() == null ? other.getDatabaseName() == null : this.getDatabaseName().equals(other.getDatabaseName()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getStatName() == null ? other.getStatName() == null : this.getStatName().equals(other.getStatName()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getStatValue() == null ? other.getStatValue() == null : this.getStatValue().equals(other.getStatValue()))
            && (this.getSampleSize() == null ? other.getSampleSize() == null : this.getSampleSize().equals(other.getSampleSize()))
            && (this.getStatDescription() == null ? other.getStatDescription() == null : this.getStatDescription().equals(other.getStatDescription()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getStatName() == null) ? 0 : getStatName().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getStatValue() == null) ? 0 : getStatValue().hashCode());
        result = prime * result + ((getSampleSize() == null) ? 0 : getSampleSize().hashCode());
        result = prime * result + ((getStatDescription() == null) ? 0 : getStatDescription().hashCode());
        return result;
    }
}