package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class TableConstraints implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_NAME")
    private String constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_TYPE")
    private String constraintType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.ENFORCED")
    private String enforced;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: TABLE_CONSTRAINTS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_CATALOG")
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_CATALOG")
    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public String getConstraintSchema() {
        return constraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_NAME")
    public String getConstraintName() {
        return constraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_NAME")
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_TYPE")
    public String getConstraintType() {
        return constraintType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.CONSTRAINT_TYPE")
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.ENFORCED")
    public String getEnforced() {
        return enforced;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source field: TABLE_CONSTRAINTS.ENFORCED")
    public void setEnforced(String enforced) {
        this.enforced = enforced;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: TABLE_CONSTRAINTS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", constraintType=").append(constraintType);
        sb.append(", enforced=").append(enforced);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: TABLE_CONSTRAINTS")
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
        TableConstraints other = (TableConstraints) that;
        return (this.getConstraintCatalog() == null ? other.getConstraintCatalog() == null : this.getConstraintCatalog().equals(other.getConstraintCatalog()))
            && (this.getConstraintSchema() == null ? other.getConstraintSchema() == null : this.getConstraintSchema().equals(other.getConstraintSchema()))
            && (this.getConstraintName() == null ? other.getConstraintName() == null : this.getConstraintName().equals(other.getConstraintName()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getConstraintType() == null ? other.getConstraintType() == null : this.getConstraintType().equals(other.getConstraintType()))
            && (this.getEnforced() == null ? other.getEnforced() == null : this.getEnforced().equals(other.getEnforced()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: TABLE_CONSTRAINTS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConstraintCatalog() == null) ? 0 : getConstraintCatalog().hashCode());
        result = prime * result + ((getConstraintSchema() == null) ? 0 : getConstraintSchema().hashCode());
        result = prime * result + ((getConstraintName() == null) ? 0 : getConstraintName().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getConstraintType() == null) ? 0 : getConstraintType().hashCode());
        result = prime * result + ((getEnforced() == null) ? 0 : getEnforced().hashCode());
        return result;
    }
}