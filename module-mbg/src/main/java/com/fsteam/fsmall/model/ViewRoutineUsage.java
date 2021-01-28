package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ViewRoutineUsage implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0727807+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG")
    private String specificCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA")
    private String specificSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_NAME")
    private String specificName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0727807+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG")
    public String getSpecificCatalog() {
        return specificCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG")
    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA")
    public String getSpecificSchema() {
        return specificSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA")
    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_NAME")
    public String getSpecificName() {
        return specificName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source field: VIEW_ROUTINE_USAGE.SPECIFIC_NAME")
    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source Table: VIEW_ROUTINE_USAGE")
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
        ViewRoutineUsage other = (ViewRoutineUsage) that;
        return (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getSpecificCatalog() == null ? other.getSpecificCatalog() == null : this.getSpecificCatalog().equals(other.getSpecificCatalog()))
            && (this.getSpecificSchema() == null ? other.getSpecificSchema() == null : this.getSpecificSchema().equals(other.getSpecificSchema()))
            && (this.getSpecificName() == null ? other.getSpecificName() == null : this.getSpecificName().equals(other.getSpecificName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0737827+08:00", comments="Source Table: VIEW_ROUTINE_USAGE")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getSpecificCatalog() == null) ? 0 : getSpecificCatalog().hashCode());
        result = prime * result + ((getSpecificSchema() == null) ? 0 : getSpecificSchema().hashCode());
        result = prime * result + ((getSpecificName() == null) ? 0 : getSpecificName().hashCode());
        return result;
    }
}