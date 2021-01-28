package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class HelpTopic implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_topic_id")
    private Integer helpTopicId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_category_id")
    private Short helpCategoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.example")
    private String example;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.url")
    private String url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_topic_id")
    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_topic_id")
    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_category_id")
    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_category_id")
    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.example")
    public String getExample() {
        return example;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.example")
    public void setExample(String example) {
        this.example = example;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.url")
    public String getUrl() {
        return url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpTopicId=").append(helpTopicId);
        sb.append(", name=").append(name);
        sb.append(", helpCategoryId=").append(helpCategoryId);
        sb.append(", description=").append(description);
        sb.append(", example=").append(example);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
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
        HelpTopic other = (HelpTopic) that;
        return (this.getHelpTopicId() == null ? other.getHelpTopicId() == null : this.getHelpTopicId().equals(other.getHelpTopicId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHelpCategoryId() == null ? other.getHelpCategoryId() == null : this.getHelpCategoryId().equals(other.getHelpCategoryId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpTopicId() == null) ? 0 : getHelpTopicId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHelpCategoryId() == null) ? 0 : getHelpCategoryId().hashCode());
        return result;
    }
}