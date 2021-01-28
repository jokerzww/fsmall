package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbTablespaces implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE")
    private Integer space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FLAG")
    private Integer flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ROW_FORMAT")
    private String rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.PAGE_SIZE")
    private Integer pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE_TYPE")
    private String spaceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FS_BLOCK_SIZE")
    private Integer fsBlockSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FILE_SIZE")
    private Long fileSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ALLOCATED_SIZE")
    private Long allocatedSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SERVER_VERSION")
    private String serverVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE_VERSION")
    private Integer spaceVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ENCRYPTION")
    private String encryption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: INNODB_TABLESPACES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE")
    public Integer getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE")
    public void setSpace(Integer space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FLAG")
    public Integer getFlag() {
        return flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FLAG")
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ROW_FORMAT")
    public String getRowFormat() {
        return rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ROW_FORMAT")
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.PAGE_SIZE")
    public Integer getPageSize() {
        return pageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.PAGE_SIZE")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ZIP_PAGE_SIZE")
    public Integer getZipPageSize() {
        return zipPageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ZIP_PAGE_SIZE")
    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE_TYPE")
    public String getSpaceType() {
        return spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE_TYPE")
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FS_BLOCK_SIZE")
    public Integer getFsBlockSize() {
        return fsBlockSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FS_BLOCK_SIZE")
    public void setFsBlockSize(Integer fsBlockSize) {
        this.fsBlockSize = fsBlockSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FILE_SIZE")
    public Long getFileSize() {
        return fileSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.FILE_SIZE")
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ALLOCATED_SIZE")
    public Long getAllocatedSize() {
        return allocatedSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ALLOCATED_SIZE")
    public void setAllocatedSize(Long allocatedSize) {
        this.allocatedSize = allocatedSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SERVER_VERSION")
    public String getServerVersion() {
        return serverVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SERVER_VERSION")
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE_VERSION")
    public Integer getSpaceVersion() {
        return spaceVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.SPACE_VERSION")
    public void setSpaceVersion(Integer spaceVersion) {
        this.spaceVersion = spaceVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ENCRYPTION")
    public String getEncryption() {
        return encryption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.ENCRYPTION")
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source field: INNODB_TABLESPACES.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: INNODB_TABLESPACES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", space=").append(space);
        sb.append(", name=").append(name);
        sb.append(", flag=").append(flag);
        sb.append(", rowFormat=").append(rowFormat);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", zipPageSize=").append(zipPageSize);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", fsBlockSize=").append(fsBlockSize);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", allocatedSize=").append(allocatedSize);
        sb.append(", serverVersion=").append(serverVersion);
        sb.append(", spaceVersion=").append(spaceVersion);
        sb.append(", encryption=").append(encryption);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: INNODB_TABLESPACES")
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
        InnodbTablespaces other = (InnodbTablespaces) that;
        return (this.getSpace() == null ? other.getSpace() == null : this.getSpace().equals(other.getSpace()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getRowFormat() == null ? other.getRowFormat() == null : this.getRowFormat().equals(other.getRowFormat()))
            && (this.getPageSize() == null ? other.getPageSize() == null : this.getPageSize().equals(other.getPageSize()))
            && (this.getZipPageSize() == null ? other.getZipPageSize() == null : this.getZipPageSize().equals(other.getZipPageSize()))
            && (this.getSpaceType() == null ? other.getSpaceType() == null : this.getSpaceType().equals(other.getSpaceType()))
            && (this.getFsBlockSize() == null ? other.getFsBlockSize() == null : this.getFsBlockSize().equals(other.getFsBlockSize()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getAllocatedSize() == null ? other.getAllocatedSize() == null : this.getAllocatedSize().equals(other.getAllocatedSize()))
            && (this.getServerVersion() == null ? other.getServerVersion() == null : this.getServerVersion().equals(other.getServerVersion()))
            && (this.getSpaceVersion() == null ? other.getSpaceVersion() == null : this.getSpaceVersion().equals(other.getSpaceVersion()))
            && (this.getEncryption() == null ? other.getEncryption() == null : this.getEncryption().equals(other.getEncryption()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2939829+08:00", comments="Source Table: INNODB_TABLESPACES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpace() == null) ? 0 : getSpace().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getRowFormat() == null) ? 0 : getRowFormat().hashCode());
        result = prime * result + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        result = prime * result + ((getZipPageSize() == null) ? 0 : getZipPageSize().hashCode());
        result = prime * result + ((getSpaceType() == null) ? 0 : getSpaceType().hashCode());
        result = prime * result + ((getFsBlockSize() == null) ? 0 : getFsBlockSize().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getAllocatedSize() == null) ? 0 : getAllocatedSize().hashCode());
        result = prime * result + ((getServerVersion() == null) ? 0 : getServerVersion().hashCode());
        result = prime * result + ((getSpaceVersion() == null) ? 0 : getSpaceVersion().hashCode());
        result = prime * result + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}