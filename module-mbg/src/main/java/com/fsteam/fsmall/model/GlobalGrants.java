package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class GlobalGrants implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.HOST")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.PRIV")
    private String priv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.WITH_GRANT_OPTION")
    private String withGrantOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: global_grants")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.HOST")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.HOST")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.PRIV")
    public String getPriv() {
        return priv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.PRIV")
    public void setPriv(String priv) {
        this.priv = priv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.WITH_GRANT_OPTION")
    public String getWithGrantOption() {
        return withGrantOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.WITH_GRANT_OPTION")
    public void setWithGrantOption(String withGrantOption) {
        this.withGrantOption = withGrantOption;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: global_grants")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", host=").append(host);
        sb.append(", priv=").append(priv);
        sb.append(", withGrantOption=").append(withGrantOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: global_grants")
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
        GlobalGrants other = (GlobalGrants) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getPriv() == null ? other.getPriv() == null : this.getPriv().equals(other.getPriv()))
            && (this.getWithGrantOption() == null ? other.getWithGrantOption() == null : this.getWithGrantOption().equals(other.getWithGrantOption()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: global_grants")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getPriv() == null) ? 0 : getPriv().hashCode());
        result = prime * result + ((getWithGrantOption() == null) ? 0 : getWithGrantOption().hashCode());
        return result;
    }
}