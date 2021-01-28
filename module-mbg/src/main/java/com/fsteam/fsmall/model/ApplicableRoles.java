package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ApplicableRoles implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE")
    private String grantee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE_HOST")
    private String granteeHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_NAME")
    private String roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_HOST")
    private String roleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_GRANTABLE")
    private String isGrantable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_DEFAULT")
    private String isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_MANDATORY")
    private String isMandatory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE")
    public String getGrantee() {
        return grantee;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE")
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE_HOST")
    public String getGranteeHost() {
        return granteeHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.GRANTEE_HOST")
    public void setGranteeHost(String granteeHost) {
        this.granteeHost = granteeHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_NAME")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_HOST")
    public String getRoleHost() {
        return roleHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.ROLE_HOST")
    public void setRoleHost(String roleHost) {
        this.roleHost = roleHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_GRANTABLE")
    public String getIsGrantable() {
        return isGrantable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_GRANTABLE")
    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_DEFAULT")
    public String getIsDefault() {
        return isDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_DEFAULT")
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_MANDATORY")
    public String getIsMandatory() {
        return isMandatory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source field: APPLICABLE_ROLES.IS_MANDATORY")
    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", host=").append(host);
        sb.append(", grantee=").append(grantee);
        sb.append(", granteeHost=").append(granteeHost);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleHost=").append(roleHost);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", isMandatory=").append(isMandatory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
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
        ApplicableRoles other = (ApplicableRoles) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getGrantee() == null ? other.getGrantee() == null : this.getGrantee().equals(other.getGrantee()))
            && (this.getGranteeHost() == null ? other.getGranteeHost() == null : this.getGranteeHost().equals(other.getGranteeHost()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleHost() == null ? other.getRoleHost() == null : this.getRoleHost().equals(other.getRoleHost()))
            && (this.getIsGrantable() == null ? other.getIsGrantable() == null : this.getIsGrantable().equals(other.getIsGrantable()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getIsMandatory() == null ? other.getIsMandatory() == null : this.getIsMandatory().equals(other.getIsMandatory()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        result = prime * result + ((getGranteeHost() == null) ? 0 : getGranteeHost().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleHost() == null) ? 0 : getRoleHost().hashCode());
        result = prime * result + ((getIsGrantable() == null) ? 0 : getIsGrantable().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getIsMandatory() == null) ? 0 : getIsMandatory().hashCode());
        return result;
    }
}