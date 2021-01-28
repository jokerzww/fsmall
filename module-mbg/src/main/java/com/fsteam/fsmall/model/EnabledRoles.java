package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EnabledRoles implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_NAME")
    private String roleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_HOST")
    private String roleHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_DEFAULT")
    private String isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_MANDATORY")
    private String isMandatory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_NAME")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_HOST")
    public String getRoleHost() {
        return roleHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.ROLE_HOST")
    public void setRoleHost(String roleHost) {
        this.roleHost = roleHost;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_DEFAULT")
    public String getIsDefault() {
        return isDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_DEFAULT")
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_MANDATORY")
    public String getIsMandatory() {
        return isMandatory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source field: ENABLED_ROLES.IS_MANDATORY")
    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleName=").append(roleName);
        sb.append(", roleHost=").append(roleHost);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", isMandatory=").append(isMandatory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
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
        EnabledRoles other = (EnabledRoles) that;
        return (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getRoleHost() == null ? other.getRoleHost() == null : this.getRoleHost().equals(other.getRoleHost()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getIsMandatory() == null ? other.getIsMandatory() == null : this.getIsMandatory().equals(other.getIsMandatory()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleHost() == null) ? 0 : getRoleHost().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getIsMandatory() == null) ? 0 : getIsMandatory().hashCode());
        return result;
    }
}