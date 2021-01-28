package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbCmpPerIndexReset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    private String databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    private Integer compressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    private Integer compressOpsOk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    private Integer compressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    private Integer uncompressOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    private Integer uncompressTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source Table: INNODB_CMP_PER_INDEX_RESET")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.database_name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.047758+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    public Integer getCompressOps() {
        return compressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops")
    public void setCompressOps(Integer compressOps) {
        this.compressOps = compressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    public Integer getCompressOpsOk() {
        return compressOpsOk;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_ops_ok")
    public void setCompressOpsOk(Integer compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    public Integer getCompressTime() {
        return compressTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.compress_time")
    public void setCompressTime(Integer compressTime) {
        this.compressTime = compressTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    public Integer getUncompressOps() {
        return uncompressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_ops")
    public void setUncompressOps(Integer uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    public Integer getUncompressTime() {
        return uncompressTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source field: INNODB_CMP_PER_INDEX_RESET.uncompress_time")
    public void setUncompressTime(Integer uncompressTime) {
        this.uncompressTime = uncompressTime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source Table: INNODB_CMP_PER_INDEX_RESET")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", databaseName=").append(databaseName);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", compressOps=").append(compressOps);
        sb.append(", compressOpsOk=").append(compressOpsOk);
        sb.append(", compressTime=").append(compressTime);
        sb.append(", uncompressOps=").append(uncompressOps);
        sb.append(", uncompressTime=").append(uncompressTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source Table: INNODB_CMP_PER_INDEX_RESET")
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
        InnodbCmpPerIndexReset other = (InnodbCmpPerIndexReset) that;
        return (this.getDatabaseName() == null ? other.getDatabaseName() == null : this.getDatabaseName().equals(other.getDatabaseName()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getCompressOps() == null ? other.getCompressOps() == null : this.getCompressOps().equals(other.getCompressOps()))
            && (this.getCompressOpsOk() == null ? other.getCompressOpsOk() == null : this.getCompressOpsOk().equals(other.getCompressOpsOk()))
            && (this.getCompressTime() == null ? other.getCompressTime() == null : this.getCompressTime().equals(other.getCompressTime()))
            && (this.getUncompressOps() == null ? other.getUncompressOps() == null : this.getUncompressOps().equals(other.getUncompressOps()))
            && (this.getUncompressTime() == null ? other.getUncompressTime() == null : this.getUncompressTime().equals(other.getUncompressTime()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0487586+08:00", comments="Source Table: INNODB_CMP_PER_INDEX_RESET")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getCompressOps() == null) ? 0 : getCompressOps().hashCode());
        result = prime * result + ((getCompressOpsOk() == null) ? 0 : getCompressOpsOk().hashCode());
        result = prime * result + ((getCompressTime() == null) ? 0 : getCompressTime().hashCode());
        result = prime * result + ((getUncompressOps() == null) ? 0 : getUncompressOps().hashCode());
        result = prime * result + ((getUncompressTime() == null) ? 0 : getUncompressTime().hashCode());
        return result;
    }
}