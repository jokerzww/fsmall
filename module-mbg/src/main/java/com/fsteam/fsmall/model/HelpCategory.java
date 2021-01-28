package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class HelpCategory implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.help_category_id")
    private Short helpCategoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.parent_category_id")
    private Short parentCategoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.help_category_id")
    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.help_category_id")
    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.parent_category_id")
    public Short getParentCategoryId() {
        return parentCategoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.parent_category_id")
    public void setParentCategoryId(Short parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: help_category.url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpCategoryId=").append(helpCategoryId);
        sb.append(", name=").append(name);
        sb.append(", parentCategoryId=").append(parentCategoryId);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
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
        HelpCategory other = (HelpCategory) that;
        return (this.getHelpCategoryId() == null ? other.getHelpCategoryId() == null : this.getHelpCategoryId().equals(other.getHelpCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentCategoryId() == null ? other.getParentCategoryId() == null : this.getParentCategoryId().equals(other.getParentCategoryId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpCategoryId() == null) ? 0 : getHelpCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentCategoryId() == null) ? 0 : getParentCategoryId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }
}