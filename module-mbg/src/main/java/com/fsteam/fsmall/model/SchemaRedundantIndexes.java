package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SchemaRedundantIndexes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_schema")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_name")
    private String redundantIndexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_non_unique")
    private Integer redundantIndexNonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_name")
    private String dominantIndexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_non_unique")
    private Integer dominantIndexNonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.subpart_exists")
    private Integer subpartExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.sql_drop_index")
    private String sqlDropIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_columns")
    private String redundantIndexColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_columns")
    private String dominantIndexColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source Table: schema_redundant_indexes")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_schema")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_schema")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_name")
    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_name")
    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_non_unique")
    public Integer getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_non_unique")
    public void setRedundantIndexNonUnique(Integer redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_name")
    public String getDominantIndexName() {
        return dominantIndexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_name")
    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_non_unique")
    public Integer getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_non_unique")
    public void setDominantIndexNonUnique(Integer dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.subpart_exists")
    public Integer getSubpartExists() {
        return subpartExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.subpart_exists")
    public void setSubpartExists(Integer subpartExists) {
        this.subpartExists = subpartExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.sql_drop_index")
    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.sql_drop_index")
    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_columns")
    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.redundant_index_columns")
    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_columns")
    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source field: schema_redundant_indexes.dominant_index_columns")
    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source Table: schema_redundant_indexes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", redundantIndexName=").append(redundantIndexName);
        sb.append(", redundantIndexNonUnique=").append(redundantIndexNonUnique);
        sb.append(", dominantIndexName=").append(dominantIndexName);
        sb.append(", dominantIndexNonUnique=").append(dominantIndexNonUnique);
        sb.append(", subpartExists=").append(subpartExists);
        sb.append(", sqlDropIndex=").append(sqlDropIndex);
        sb.append(", redundantIndexColumns=").append(redundantIndexColumns);
        sb.append(", dominantIndexColumns=").append(dominantIndexColumns);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source Table: schema_redundant_indexes")
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
        SchemaRedundantIndexes other = (SchemaRedundantIndexes) that;
        return (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getRedundantIndexName() == null ? other.getRedundantIndexName() == null : this.getRedundantIndexName().equals(other.getRedundantIndexName()))
            && (this.getRedundantIndexNonUnique() == null ? other.getRedundantIndexNonUnique() == null : this.getRedundantIndexNonUnique().equals(other.getRedundantIndexNonUnique()))
            && (this.getDominantIndexName() == null ? other.getDominantIndexName() == null : this.getDominantIndexName().equals(other.getDominantIndexName()))
            && (this.getDominantIndexNonUnique() == null ? other.getDominantIndexNonUnique() == null : this.getDominantIndexNonUnique().equals(other.getDominantIndexNonUnique()))
            && (this.getSubpartExists() == null ? other.getSubpartExists() == null : this.getSubpartExists().equals(other.getSubpartExists()))
            && (this.getSqlDropIndex() == null ? other.getSqlDropIndex() == null : this.getSqlDropIndex().equals(other.getSqlDropIndex()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1468484+08:00", comments="Source Table: schema_redundant_indexes")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getRedundantIndexName() == null) ? 0 : getRedundantIndexName().hashCode());
        result = prime * result + ((getRedundantIndexNonUnique() == null) ? 0 : getRedundantIndexNonUnique().hashCode());
        result = prime * result + ((getDominantIndexName() == null) ? 0 : getDominantIndexName().hashCode());
        result = prime * result + ((getDominantIndexNonUnique() == null) ? 0 : getDominantIndexNonUnique().hashCode());
        result = prime * result + ((getSubpartExists() == null) ? 0 : getSubpartExists().hashCode());
        result = prime * result + ((getSqlDropIndex() == null) ? 0 : getSqlDropIndex().hashCode());
        return result;
    }
}