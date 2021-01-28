package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class XSchemaFlattenedKeys implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_schema")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.index_name")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.non_unique")
    private Integer nonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.subpart_exists")
    private Long subpartExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.index_columns")
    private String indexColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: x$schema_flattened_keys")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_schema")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_schema")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.index_name")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.non_unique")
    public Integer getNonUnique() {
        return nonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.non_unique")
    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.subpart_exists")
    public Long getSubpartExists() {
        return subpartExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.subpart_exists")
    public void setSubpartExists(Long subpartExists) {
        this.subpartExists = subpartExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.index_columns")
    public String getIndexColumns() {
        return indexColumns;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source field: x$schema_flattened_keys.index_columns")
    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: x$schema_flattened_keys")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", nonUnique=").append(nonUnique);
        sb.append(", subpartExists=").append(subpartExists);
        sb.append(", indexColumns=").append(indexColumns);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: x$schema_flattened_keys")
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
        XSchemaFlattenedKeys other = (XSchemaFlattenedKeys) that;
        return (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getNonUnique() == null ? other.getNonUnique() == null : this.getNonUnique().equals(other.getNonUnique()))
            && (this.getSubpartExists() == null ? other.getSubpartExists() == null : this.getSubpartExists().equals(other.getSubpartExists()))
            && (this.getIndexColumns() == null ? other.getIndexColumns() == null : this.getIndexColumns().equals(other.getIndexColumns()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: x$schema_flattened_keys")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getNonUnique() == null) ? 0 : getNonUnique().hashCode());
        result = prime * result + ((getSubpartExists() == null) ? 0 : getSubpartExists().hashCode());
        result = prime * result + ((getIndexColumns() == null) ? 0 : getIndexColumns().hashCode());
        return result;
    }
}