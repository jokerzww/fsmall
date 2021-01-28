package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SchemaPrivileges implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0627718+08:00", comments="Source field: SCHEMA_PRIVILEGES.GRANTEE")
    private String grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.PRIVILEGE_TYPE")
    private String privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.IS_GRANTABLE")
    private String isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source Table: SCHEMA_PRIVILEGES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0627718+08:00", comments="Source field: SCHEMA_PRIVILEGES.GRANTEE")
    public String getGrantee() {
        return grantee;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.GRANTEE")
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.PRIVILEGE_TYPE")
    public String getPrivilegeType() {
        return privilegeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.PRIVILEGE_TYPE")
    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.IS_GRANTABLE")
    public String getIsGrantable() {
        return isGrantable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source field: SCHEMA_PRIVILEGES.IS_GRANTABLE")
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source Table: SCHEMA_PRIVILEGES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantee=").append(grantee);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source Table: SCHEMA_PRIVILEGES")
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
        SchemaPrivileges other = (SchemaPrivileges) that;
        return (this.getGrantee() == null ? other.getGrantee() == null : this.getGrantee().equals(other.getGrantee()))
            && (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getPrivilegeType() == null ? other.getPrivilegeType() == null : this.getPrivilegeType().equals(other.getPrivilegeType()))
            && (this.getIsGrantable() == null ? other.getIsGrantable() == null : this.getIsGrantable().equals(other.getIsGrantable()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0637723+08:00", comments="Source Table: SCHEMA_PRIVILEGES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getPrivilegeType() == null) ? 0 : getPrivilegeType().hashCode());
        result = prime * result + ((getIsGrantable() == null) ? 0 : getIsGrantable().hashCode());
        return result;
    }
}