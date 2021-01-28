package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Engines implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.ENGINE")
    private String engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.SUPPORT")
    private String support;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.COMMENT")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.TRANSACTIONS")
    private String transactions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.XA")
    private String xa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.SAVEPOINTS")
    private String savepoints;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source Table: ENGINES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.ENGINE")
    public String getEngine() {
        return engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.ENGINE")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.SUPPORT")
    public String getSupport() {
        return support;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.SUPPORT")
    public void setSupport(String support) {
        this.support = support;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.COMMENT")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.COMMENT")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.TRANSACTIONS")
    public String getTransactions() {
        return transactions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.TRANSACTIONS")
    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.XA")
    public String getXa() {
        return xa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.XA")
    public void setXa(String xa) {
        this.xa = xa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.SAVEPOINTS")
    public String getSavepoints() {
        return savepoints;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source field: ENGINES.SAVEPOINTS")
    public void setSavepoints(String savepoints) {
        this.savepoints = savepoints;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source Table: ENGINES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", engine=").append(engine);
        sb.append(", support=").append(support);
        sb.append(", comment=").append(comment);
        sb.append(", transactions=").append(transactions);
        sb.append(", xa=").append(xa);
        sb.append(", savepoints=").append(savepoints);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source Table: ENGINES")
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
        Engines other = (Engines) that;
        return (this.getEngine() == null ? other.getEngine() == null : this.getEngine().equals(other.getEngine()))
            && (this.getSupport() == null ? other.getSupport() == null : this.getSupport().equals(other.getSupport()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getTransactions() == null ? other.getTransactions() == null : this.getTransactions().equals(other.getTransactions()))
            && (this.getXa() == null ? other.getXa() == null : this.getXa().equals(other.getXa()))
            && (this.getSavepoints() == null ? other.getSavepoints() == null : this.getSavepoints().equals(other.getSavepoints()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3140006+08:00", comments="Source Table: ENGINES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEngine() == null) ? 0 : getEngine().hashCode());
        result = prime * result + ((getSupport() == null) ? 0 : getSupport().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getTransactions() == null) ? 0 : getTransactions().hashCode());
        result = prime * result + ((getXa() == null) ? 0 : getXa().hashCode());
        result = prime * result + ((getSavepoints() == null) ? 0 : getSavepoints().hashCode());
        return result;
    }
}