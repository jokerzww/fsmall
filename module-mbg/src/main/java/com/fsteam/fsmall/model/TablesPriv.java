package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class TablesPriv implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.User")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Grantor")
    private String grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Timestamp")
    private Date timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Table_priv")
    private String tablePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Column_priv")
    private String columnPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.User")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.User")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Grantor")
    public String getGrantor() {
        return grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Grantor")
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5291972+08:00", comments="Source field: tables_priv.Timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Table_priv")
    public String getTablePriv() {
        return tablePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Table_priv")
    public void setTablePriv(String tablePriv) {
        this.tablePriv = tablePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Column_priv")
    public String getColumnPriv() {
        return columnPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Column_priv")
    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", db=").append(db);
        sb.append(", user=").append(user);
        sb.append(", tableName=").append(tableName);
        sb.append(", grantor=").append(grantor);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", tablePriv=").append(tablePriv);
        sb.append(", columnPriv=").append(columnPriv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
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
        TablesPriv other = (TablesPriv) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()))
            && (this.getTablePriv() == null ? other.getTablePriv() == null : this.getTablePriv().equals(other.getTablePriv()))
            && (this.getColumnPriv() == null ? other.getColumnPriv() == null : this.getColumnPriv().equals(other.getColumnPriv()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        result = prime * result + ((getTablePriv() == null) ? 0 : getTablePriv().hashCode());
        result = prime * result + ((getColumnPriv() == null) ? 0 : getColumnPriv().hashCode());
        return result;
    }
}