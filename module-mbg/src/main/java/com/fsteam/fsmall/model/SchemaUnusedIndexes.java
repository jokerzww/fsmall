package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SchemaUnusedIndexes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_schema")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_name")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.index_name")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source Table: schema_unused_indexes")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_schema")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_schema")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_name")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.object_name")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.index_name")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source field: schema_unused_indexes.index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source Table: schema_unused_indexes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", indexName=").append(indexName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source Table: schema_unused_indexes")
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
        SchemaUnusedIndexes other = (SchemaUnusedIndexes) that;
        return (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0767841+08:00", comments="Source Table: schema_unused_indexes")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        return result;
    }
}