package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class CheckConstraints implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_NAME")
    private String constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CHECK_CLAUSE")
    private String checkClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_CATALOG")
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_CATALOG")
    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public String getConstraintSchema() {
        return constraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.285976+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_NAME")
    public String getConstraintName() {
        return constraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_NAME")
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CHECK_CLAUSE")
    public String getCheckClause() {
        return checkClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CHECK_CLAUSE")
    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", checkClause=").append(checkClause);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
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
        CheckConstraints other = (CheckConstraints) that;
        return (this.getConstraintCatalog() == null ? other.getConstraintCatalog() == null : this.getConstraintCatalog().equals(other.getConstraintCatalog()))
            && (this.getConstraintSchema() == null ? other.getConstraintSchema() == null : this.getConstraintSchema().equals(other.getConstraintSchema()))
            && (this.getConstraintName() == null ? other.getConstraintName() == null : this.getConstraintName().equals(other.getConstraintName()))
            && (this.getCheckClause() == null ? other.getCheckClause() == null : this.getCheckClause().equals(other.getCheckClause()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConstraintCatalog() == null) ? 0 : getConstraintCatalog().hashCode());
        result = prime * result + ((getConstraintSchema() == null) ? 0 : getConstraintSchema().hashCode());
        result = prime * result + ((getConstraintName() == null) ? 0 : getConstraintName().hashCode());
        result = prime * result + ((getCheckClause() == null) ? 0 : getCheckClause().hashCode());
        return result;
    }
}