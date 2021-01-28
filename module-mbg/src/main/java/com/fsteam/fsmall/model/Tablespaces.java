package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Tablespaces implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_NAME")
    private String tablespaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.ENGINE")
    private String engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_TYPE")
    private String tablespaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.EXTENT_SIZE")
    private Long extentSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.MAXIMUM_SIZE")
    private Long maximumSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.NODEGROUP_ID")
    private Long nodegroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_COMMENT")
    private String tablespaceComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: TABLESPACES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_NAME")
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.ENGINE")
    public String getEngine() {
        return engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.ENGINE")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_TYPE")
    public String getTablespaceType() {
        return tablespaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_TYPE")
    public void setTablespaceType(String tablespaceType) {
        this.tablespaceType = tablespaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.LOGFILE_GROUP_NAME")
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.LOGFILE_GROUP_NAME")
    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.EXTENT_SIZE")
    public Long getExtentSize() {
        return extentSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.EXTENT_SIZE")
    public void setExtentSize(Long extentSize) {
        this.extentSize = extentSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.AUTOEXTEND_SIZE")
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.AUTOEXTEND_SIZE")
    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.MAXIMUM_SIZE")
    public Long getMaximumSize() {
        return maximumSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.MAXIMUM_SIZE")
    public void setMaximumSize(Long maximumSize) {
        this.maximumSize = maximumSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.NODEGROUP_ID")
    public Long getNodegroupId() {
        return nodegroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.NODEGROUP_ID")
    public void setNodegroupId(Long nodegroupId) {
        this.nodegroupId = nodegroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_COMMENT")
    public String getTablespaceComment() {
        return tablespaceComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source field: TABLESPACES.TABLESPACE_COMMENT")
    public void setTablespaceComment(String tablespaceComment) {
        this.tablespaceComment = tablespaceComment;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: TABLESPACES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tablespaceName=").append(tablespaceName);
        sb.append(", engine=").append(engine);
        sb.append(", tablespaceType=").append(tablespaceType);
        sb.append(", logfileGroupName=").append(logfileGroupName);
        sb.append(", extentSize=").append(extentSize);
        sb.append(", autoextendSize=").append(autoextendSize);
        sb.append(", maximumSize=").append(maximumSize);
        sb.append(", nodegroupId=").append(nodegroupId);
        sb.append(", tablespaceComment=").append(tablespaceComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: TABLESPACES")
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
        Tablespaces other = (Tablespaces) that;
        return (this.getTablespaceName() == null ? other.getTablespaceName() == null : this.getTablespaceName().equals(other.getTablespaceName()))
            && (this.getEngine() == null ? other.getEngine() == null : this.getEngine().equals(other.getEngine()))
            && (this.getTablespaceType() == null ? other.getTablespaceType() == null : this.getTablespaceType().equals(other.getTablespaceType()))
            && (this.getLogfileGroupName() == null ? other.getLogfileGroupName() == null : this.getLogfileGroupName().equals(other.getLogfileGroupName()))
            && (this.getExtentSize() == null ? other.getExtentSize() == null : this.getExtentSize().equals(other.getExtentSize()))
            && (this.getAutoextendSize() == null ? other.getAutoextendSize() == null : this.getAutoextendSize().equals(other.getAutoextendSize()))
            && (this.getMaximumSize() == null ? other.getMaximumSize() == null : this.getMaximumSize().equals(other.getMaximumSize()))
            && (this.getNodegroupId() == null ? other.getNodegroupId() == null : this.getNodegroupId().equals(other.getNodegroupId()))
            && (this.getTablespaceComment() == null ? other.getTablespaceComment() == null : this.getTablespaceComment().equals(other.getTablespaceComment()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2289236+08:00", comments="Source Table: TABLESPACES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTablespaceName() == null) ? 0 : getTablespaceName().hashCode());
        result = prime * result + ((getEngine() == null) ? 0 : getEngine().hashCode());
        result = prime * result + ((getTablespaceType() == null) ? 0 : getTablespaceType().hashCode());
        result = prime * result + ((getLogfileGroupName() == null) ? 0 : getLogfileGroupName().hashCode());
        result = prime * result + ((getExtentSize() == null) ? 0 : getExtentSize().hashCode());
        result = prime * result + ((getAutoextendSize() == null) ? 0 : getAutoextendSize().hashCode());
        result = prime * result + ((getMaximumSize() == null) ? 0 : getMaximumSize().hashCode());
        result = prime * result + ((getNodegroupId() == null) ? 0 : getNodegroupId().hashCode());
        result = prime * result + ((getTablespaceComment() == null) ? 0 : getTablespaceComment().hashCode());
        return result;
    }
}