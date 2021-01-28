package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class PicTb implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.item_id")
    private Integer itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.abs_path")
    private String absPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.item_id")
    public Integer getItemId() {
        return itemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.item_id")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.abs_path")
    public String getAbsPath() {
        return absPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source field: pic_tb.abs_path")
    public void setAbsPath(String absPath) {
        this.absPath = absPath;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", url=").append(url);
        sb.append(", absPath=").append(absPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
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
        PicTb other = (PicTb) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getAbsPath() == null ? other.getAbsPath() == null : this.getAbsPath().equals(other.getAbsPath()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2589504+08:00", comments="Source Table: pic_tb")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getAbsPath() == null) ? 0 : getAbsPath().hashCode());
        return result;
    }
}