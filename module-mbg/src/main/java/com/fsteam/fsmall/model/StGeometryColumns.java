package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class StGeometryColumns implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.COLUMN_NAME")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_NAME")
    private String srsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_ID")
    private Integer srsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.GEOMETRY_TYPE_NAME")
    private String geometryTypeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.COLUMN_NAME")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_NAME")
    public String getSrsName() {
        return srsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_NAME")
    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_ID")
    public Integer getSrsId() {
        return srsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.SRS_ID")
    public void setSrsId(Integer srsId) {
        this.srsId = srsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.GEOMETRY_TYPE_NAME")
    public String getGeometryTypeName() {
        return geometryTypeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source field: ST_GEOMETRY_COLUMNS.GEOMETRY_TYPE_NAME")
    public void setGeometryTypeName(String geometryTypeName) {
        this.geometryTypeName = geometryTypeName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", srsName=").append(srsName);
        sb.append(", srsId=").append(srsId);
        sb.append(", geometryTypeName=").append(geometryTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
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
        StGeometryColumns other = (StGeometryColumns) that;
        return (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getSrsName() == null ? other.getSrsName() == null : this.getSrsName().equals(other.getSrsName()))
            && (this.getSrsId() == null ? other.getSrsId() == null : this.getSrsId().equals(other.getSrsId()))
            && (this.getGeometryTypeName() == null ? other.getGeometryTypeName() == null : this.getGeometryTypeName().equals(other.getGeometryTypeName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3850664+08:00", comments="Source Table: ST_GEOMETRY_COLUMNS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getSrsName() == null) ? 0 : getSrsName().hashCode());
        result = prime * result + ((getSrsId() == null) ? 0 : getSrsId().hashCode());
        result = prime * result + ((getGeometryTypeName() == null) ? 0 : getGeometryTypeName().hashCode());
        return result;
    }
}