package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbCmpmemReset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: INNODB_CMPMEM_RESET.page_size")
    private Integer pageSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: INNODB_CMPMEM_RESET.buffer_pool_instance")
    private Integer bufferPoolInstance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.pages_used")
    private Integer pagesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.pages_free")
    private Integer pagesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_ops")
    private Long relocationOps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_time")
    private Integer relocationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source Table: INNODB_CMPMEM_RESET")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: INNODB_CMPMEM_RESET.page_size")
    public Integer getPageSize() {
        return pageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: INNODB_CMPMEM_RESET.page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4681414+08:00", comments="Source field: INNODB_CMPMEM_RESET.buffer_pool_instance")
    public Integer getBufferPoolInstance() {
        return bufferPoolInstance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.buffer_pool_instance")
    public void setBufferPoolInstance(Integer bufferPoolInstance) {
        this.bufferPoolInstance = bufferPoolInstance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.pages_used")
    public Integer getPagesUsed() {
        return pagesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.pages_used")
    public void setPagesUsed(Integer pagesUsed) {
        this.pagesUsed = pagesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.pages_free")
    public Integer getPagesFree() {
        return pagesFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.pages_free")
    public void setPagesFree(Integer pagesFree) {
        this.pagesFree = pagesFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_ops")
    public Long getRelocationOps() {
        return relocationOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_ops")
    public void setRelocationOps(Long relocationOps) {
        this.relocationOps = relocationOps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_time")
    public Integer getRelocationTime() {
        return relocationTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: INNODB_CMPMEM_RESET.relocation_time")
    public void setRelocationTime(Integer relocationTime) {
        this.relocationTime = relocationTime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source Table: INNODB_CMPMEM_RESET")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pageSize=").append(pageSize);
        sb.append(", bufferPoolInstance=").append(bufferPoolInstance);
        sb.append(", pagesUsed=").append(pagesUsed);
        sb.append(", pagesFree=").append(pagesFree);
        sb.append(", relocationOps=").append(relocationOps);
        sb.append(", relocationTime=").append(relocationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source Table: INNODB_CMPMEM_RESET")
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
        InnodbCmpmemReset other = (InnodbCmpmemReset) that;
        return (this.getPageSize() == null ? other.getPageSize() == null : this.getPageSize().equals(other.getPageSize()))
            && (this.getBufferPoolInstance() == null ? other.getBufferPoolInstance() == null : this.getBufferPoolInstance().equals(other.getBufferPoolInstance()))
            && (this.getPagesUsed() == null ? other.getPagesUsed() == null : this.getPagesUsed().equals(other.getPagesUsed()))
            && (this.getPagesFree() == null ? other.getPagesFree() == null : this.getPagesFree().equals(other.getPagesFree()))
            && (this.getRelocationOps() == null ? other.getRelocationOps() == null : this.getRelocationOps().equals(other.getRelocationOps()))
            && (this.getRelocationTime() == null ? other.getRelocationTime() == null : this.getRelocationTime().equals(other.getRelocationTime()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source Table: INNODB_CMPMEM_RESET")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        result = prime * result + ((getBufferPoolInstance() == null) ? 0 : getBufferPoolInstance().hashCode());
        result = prime * result + ((getPagesUsed() == null) ? 0 : getPagesUsed().hashCode());
        result = prime * result + ((getPagesFree() == null) ? 0 : getPagesFree().hashCode());
        result = prime * result + ((getRelocationOps() == null) ? 0 : getRelocationOps().hashCode());
        result = prime * result + ((getRelocationTime() == null) ? 0 : getRelocationTime().hashCode());
        return result;
    }
}