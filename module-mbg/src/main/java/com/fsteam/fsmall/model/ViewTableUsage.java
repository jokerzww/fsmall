package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ViewTableUsage implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_CATALOG")
    private String viewCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_SCHEMA")
    private String viewSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_NAME")
    private String viewName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source Table: VIEW_TABLE_USAGE")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_CATALOG")
    public String getViewCatalog() {
        return viewCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_CATALOG")
    public void setViewCatalog(String viewCatalog) {
        this.viewCatalog = viewCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_SCHEMA")
    public String getViewSchema() {
        return viewSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_SCHEMA")
    public void setViewSchema(String viewSchema) {
        this.viewSchema = viewSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_NAME")
    public String getViewName() {
        return viewName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.VIEW_NAME")
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source field: VIEW_TABLE_USAGE.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source Table: VIEW_TABLE_USAGE")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", viewCatalog=").append(viewCatalog);
        sb.append(", viewSchema=").append(viewSchema);
        sb.append(", viewName=").append(viewName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source Table: VIEW_TABLE_USAGE")
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
        ViewTableUsage other = (ViewTableUsage) that;
        return (this.getViewCatalog() == null ? other.getViewCatalog() == null : this.getViewCatalog().equals(other.getViewCatalog()))
            && (this.getViewSchema() == null ? other.getViewSchema() == null : this.getViewSchema().equals(other.getViewSchema()))
            && (this.getViewName() == null ? other.getViewName() == null : this.getViewName().equals(other.getViewName()))
            && (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.447122+08:00", comments="Source Table: VIEW_TABLE_USAGE")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getViewCatalog() == null) ? 0 : getViewCatalog().hashCode());
        result = prime * result + ((getViewSchema() == null) ? 0 : getViewSchema().hashCode());
        result = prime * result + ((getViewName() == null) ? 0 : getViewName().hashCode());
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return result;
    }
}