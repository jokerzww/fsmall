package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class HelpKeyword implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: help_keyword.help_keyword_id")
    private Integer helpKeywordId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: help_keyword.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: help_keyword")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: help_keyword.help_keyword_id")
    public Integer getHelpKeywordId() {
        return helpKeywordId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: help_keyword.help_keyword_id")
    public void setHelpKeywordId(Integer helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: help_keyword.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source field: help_keyword.name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: help_keyword")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpKeywordId=").append(helpKeywordId);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: help_keyword")
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
        HelpKeyword other = (HelpKeyword) that;
        return (this.getHelpKeywordId() == null ? other.getHelpKeywordId() == null : this.getHelpKeywordId().equals(other.getHelpKeywordId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: help_keyword")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpKeywordId() == null) ? 0 : getHelpKeywordId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}