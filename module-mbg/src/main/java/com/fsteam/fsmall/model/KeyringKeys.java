package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class KeyringKeys implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_ID")
    private String keyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_OWNER")
    private String keyOwner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.BACKEND_KEY_ID")
    private String backendKeyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_ID")
    public String getKeyId() {
        return keyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_ID")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_OWNER")
    public String getKeyOwner() {
        return keyOwner;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_OWNER")
    public void setKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.BACKEND_KEY_ID")
    public String getBackendKeyId() {
        return backendKeyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.BACKEND_KEY_ID")
    public void setBackendKeyId(String backendKeyId) {
        this.backendKeyId = backendKeyId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keyId=").append(keyId);
        sb.append(", keyOwner=").append(keyOwner);
        sb.append(", backendKeyId=").append(backendKeyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
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
        KeyringKeys other = (KeyringKeys) that;
        return (this.getKeyId() == null ? other.getKeyId() == null : this.getKeyId().equals(other.getKeyId()))
            && (this.getKeyOwner() == null ? other.getKeyOwner() == null : this.getKeyOwner().equals(other.getKeyOwner()))
            && (this.getBackendKeyId() == null ? other.getBackendKeyId() == null : this.getBackendKeyId().equals(other.getBackendKeyId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        result = prime * result + ((getKeyOwner() == null) ? 0 : getKeyOwner().hashCode());
        result = prime * result + ((getBackendKeyId() == null) ? 0 : getBackendKeyId().hashCode());
        return result;
    }
}