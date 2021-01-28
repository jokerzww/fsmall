package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Version implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.sys_version")
    private String sysVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.mysql_version")
    private String mysqlVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.sys_version")
    public String getSysVersion() {
        return sysVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.sys_version")
    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.mysql_version")
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.mysql_version")
    public void setMysqlVersion(String mysqlVersion) {
        this.mysqlVersion = mysqlVersion;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysVersion=").append(sysVersion);
        sb.append(", mysqlVersion=").append(mysqlVersion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
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
        Version other = (Version) that;
        return (this.getSysVersion() == null ? other.getSysVersion() == null : this.getSysVersion().equals(other.getSysVersion()))
            && (this.getMysqlVersion() == null ? other.getMysqlVersion() == null : this.getMysqlVersion().equals(other.getMysqlVersion()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSysVersion() == null) ? 0 : getSysVersion().hashCode());
        result = prime * result + ((getMysqlVersion() == null) ? 0 : getMysqlVersion().hashCode());
        return result;
    }
}