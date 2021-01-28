package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ReferentialConstraints implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME")
    private String constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG")
    private String uniqueConstraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA")
    private String uniqueConstraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME")
    private String uniqueConstraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.MATCH_OPTION")
    private String matchOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UPDATE_RULE")
    private String updateRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.DELETE_RULE")
    private String deleteRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME")
    private String referencedTableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG")
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG")
    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public String getConstraintSchema() {
        return constraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME")
    public String getConstraintName() {
        return constraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME")
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG")
    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG")
    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA")
    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA")
    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME")
    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME")
    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.MATCH_OPTION")
    public String getMatchOption() {
        return matchOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.MATCH_OPTION")
    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UPDATE_RULE")
    public String getUpdateRule() {
        return updateRule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.UPDATE_RULE")
    public void setUpdateRule(String updateRule) {
        this.updateRule = updateRule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.DELETE_RULE")
    public String getDeleteRule() {
        return deleteRule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.DELETE_RULE")
    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME")
    public String getReferencedTableName() {
        return referencedTableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source field: REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME")
    public void setReferencedTableName(String referencedTableName) {
        this.referencedTableName = referencedTableName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", uniqueConstraintCatalog=").append(uniqueConstraintCatalog);
        sb.append(", uniqueConstraintSchema=").append(uniqueConstraintSchema);
        sb.append(", uniqueConstraintName=").append(uniqueConstraintName);
        sb.append(", matchOption=").append(matchOption);
        sb.append(", updateRule=").append(updateRule);
        sb.append(", deleteRule=").append(deleteRule);
        sb.append(", tableName=").append(tableName);
        sb.append(", referencedTableName=").append(referencedTableName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
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
        ReferentialConstraints other = (ReferentialConstraints) that;
        return (this.getConstraintCatalog() == null ? other.getConstraintCatalog() == null : this.getConstraintCatalog().equals(other.getConstraintCatalog()))
            && (this.getConstraintSchema() == null ? other.getConstraintSchema() == null : this.getConstraintSchema().equals(other.getConstraintSchema()))
            && (this.getConstraintName() == null ? other.getConstraintName() == null : this.getConstraintName().equals(other.getConstraintName()))
            && (this.getUniqueConstraintCatalog() == null ? other.getUniqueConstraintCatalog() == null : this.getUniqueConstraintCatalog().equals(other.getUniqueConstraintCatalog()))
            && (this.getUniqueConstraintSchema() == null ? other.getUniqueConstraintSchema() == null : this.getUniqueConstraintSchema().equals(other.getUniqueConstraintSchema()))
            && (this.getUniqueConstraintName() == null ? other.getUniqueConstraintName() == null : this.getUniqueConstraintName().equals(other.getUniqueConstraintName()))
            && (this.getMatchOption() == null ? other.getMatchOption() == null : this.getMatchOption().equals(other.getMatchOption()))
            && (this.getUpdateRule() == null ? other.getUpdateRule() == null : this.getUpdateRule().equals(other.getUpdateRule()))
            && (this.getDeleteRule() == null ? other.getDeleteRule() == null : this.getDeleteRule().equals(other.getDeleteRule()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getReferencedTableName() == null ? other.getReferencedTableName() == null : this.getReferencedTableName().equals(other.getReferencedTableName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3129992+08:00", comments="Source Table: REFERENTIAL_CONSTRAINTS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConstraintCatalog() == null) ? 0 : getConstraintCatalog().hashCode());
        result = prime * result + ((getConstraintSchema() == null) ? 0 : getConstraintSchema().hashCode());
        result = prime * result + ((getConstraintName() == null) ? 0 : getConstraintName().hashCode());
        result = prime * result + ((getUniqueConstraintCatalog() == null) ? 0 : getUniqueConstraintCatalog().hashCode());
        result = prime * result + ((getUniqueConstraintSchema() == null) ? 0 : getUniqueConstraintSchema().hashCode());
        result = prime * result + ((getUniqueConstraintName() == null) ? 0 : getUniqueConstraintName().hashCode());
        result = prime * result + ((getMatchOption() == null) ? 0 : getMatchOption().hashCode());
        result = prime * result + ((getUpdateRule() == null) ? 0 : getUpdateRule().hashCode());
        result = prime * result + ((getDeleteRule() == null) ? 0 : getDeleteRule().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getReferencedTableName() == null) ? 0 : getReferencedTableName().hashCode());
        return result;
    }
}