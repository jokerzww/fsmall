package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class RoleRoutineGrants implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR")
    private String grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR_HOST")
    private String grantorHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE")
    private String grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE_HOST")
    private String granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG")
    private String specificCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA")
    private String specificSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_NAME")
    private String specificName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG")
    private String routineCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA")
    private String routineSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_NAME")
    private String routineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE")
    private String privilegeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.IS_GRANTABLE")
    private String isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR")
    public String getGrantor() {
        return grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR")
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR_HOST")
    public String getGrantorHost() {
        return grantorHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTOR_HOST")
    public void setGrantorHost(String grantorHost) {
        this.grantorHost = grantorHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE")
    public String getGrantee() {
        return grantee;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE")
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE_HOST")
    public String getGranteeHost() {
        return granteeHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.GRANTEE_HOST")
    public void setGranteeHost(String granteeHost) {
        this.granteeHost = granteeHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG")
    public String getSpecificCatalog() {
        return specificCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG")
    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA")
    public String getSpecificSchema() {
        return specificSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA")
    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_NAME")
    public String getSpecificName() {
        return specificName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.SPECIFIC_NAME")
    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG")
    public String getRoutineCatalog() {
        return routineCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG")
    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA")
    public String getRoutineSchema() {
        return routineSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA")
    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_NAME")
    public String getRoutineName() {
        return routineName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.ROUTINE_NAME")
    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE")
    public String getPrivilegeType() {
        return privilegeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE")
    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.IS_GRANTABLE")
    public String getIsGrantable() {
        return isGrantable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source field: ROLE_ROUTINE_GRANTS.IS_GRANTABLE")
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", grantorHost=").append(grantorHost);
        sb.append(", grantee=").append(grantee);
        sb.append(", granteeHost=").append(granteeHost);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", routineCatalog=").append(routineCatalog);
        sb.append(", routineSchema=").append(routineSchema);
        sb.append(", routineName=").append(routineName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
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
        RoleRoutineGrants other = (RoleRoutineGrants) that;
        return (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getGrantorHost() == null ? other.getGrantorHost() == null : this.getGrantorHost().equals(other.getGrantorHost()))
            && (this.getGrantee() == null ? other.getGrantee() == null : this.getGrantee().equals(other.getGrantee()))
            && (this.getGranteeHost() == null ? other.getGranteeHost() == null : this.getGranteeHost().equals(other.getGranteeHost()))
            && (this.getSpecificCatalog() == null ? other.getSpecificCatalog() == null : this.getSpecificCatalog().equals(other.getSpecificCatalog()))
            && (this.getSpecificSchema() == null ? other.getSpecificSchema() == null : this.getSpecificSchema().equals(other.getSpecificSchema()))
            && (this.getSpecificName() == null ? other.getSpecificName() == null : this.getSpecificName().equals(other.getSpecificName()))
            && (this.getRoutineCatalog() == null ? other.getRoutineCatalog() == null : this.getRoutineCatalog().equals(other.getRoutineCatalog()))
            && (this.getRoutineSchema() == null ? other.getRoutineSchema() == null : this.getRoutineSchema().equals(other.getRoutineSchema()))
            && (this.getRoutineName() == null ? other.getRoutineName() == null : this.getRoutineName().equals(other.getRoutineName()))
            && (this.getPrivilegeType() == null ? other.getPrivilegeType() == null : this.getPrivilegeType().equals(other.getPrivilegeType()))
            && (this.getIsGrantable() == null ? other.getIsGrantable() == null : this.getIsGrantable().equals(other.getIsGrantable()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getGrantorHost() == null) ? 0 : getGrantorHost().hashCode());
        result = prime * result + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        result = prime * result + ((getGranteeHost() == null) ? 0 : getGranteeHost().hashCode());
        result = prime * result + ((getSpecificCatalog() == null) ? 0 : getSpecificCatalog().hashCode());
        result = prime * result + ((getSpecificSchema() == null) ? 0 : getSpecificSchema().hashCode());
        result = prime * result + ((getSpecificName() == null) ? 0 : getSpecificName().hashCode());
        result = prime * result + ((getRoutineCatalog() == null) ? 0 : getRoutineCatalog().hashCode());
        result = prime * result + ((getRoutineSchema() == null) ? 0 : getRoutineSchema().hashCode());
        result = prime * result + ((getRoutineName() == null) ? 0 : getRoutineName().hashCode());
        result = prime * result + ((getPrivilegeType() == null) ? 0 : getPrivilegeType().hashCode());
        result = prime * result + ((getIsGrantable() == null) ? 0 : getIsGrantable().hashCode());
        return result;
    }
}