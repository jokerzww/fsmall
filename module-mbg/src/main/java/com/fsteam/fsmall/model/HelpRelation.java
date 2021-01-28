package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class HelpRelation implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_keyword_id")
    private Integer helpKeywordId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_topic_id")
    private Integer helpTopicId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_keyword_id")
    public Integer getHelpKeywordId() {
        return helpKeywordId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_keyword_id")
    public void setHelpKeywordId(Integer helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_topic_id")
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_topic_id")
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpKeywordId=").append(helpKeywordId);
        sb.append(", helpTopicId=").append(helpTopicId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
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
        HelpRelation other = (HelpRelation) that;
        return (this.getHelpKeywordId() == null ? other.getHelpKeywordId() == null : this.getHelpKeywordId().equals(other.getHelpKeywordId()))
            && (this.getHelpTopicId() == null ? other.getHelpTopicId() == null : this.getHelpTopicId().equals(other.getHelpTopicId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpKeywordId() == null) ? 0 : getHelpKeywordId().hashCode());
        result = prime * result + ((getHelpTopicId() == null) ? 0 : getHelpTopicId().hashCode());
        return result;
    }
}