package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class XLatestFileIo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.thread")
    private String thread;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.file")
    private String file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.latency")
    private Long latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.operation")
    private String operation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.requested")
    private Long requested;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source Table: x$latest_file_io")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.thread")
    public String getThread() {
        return thread;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.thread")
    public void setThread(String thread) {
        this.thread = thread;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.file")
    public String getFile() {
        return file;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.file")
    public void setFile(String file) {
        this.file = file;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.latency")
    public Long getLatency() {
        return latency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.latency")
    public void setLatency(Long latency) {
        this.latency = latency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.operation")
    public String getOperation() {
        return operation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.requested")
    public Long getRequested() {
        return requested;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source field: x$latest_file_io.requested")
    public void setRequested(Long requested) {
        this.requested = requested;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source Table: x$latest_file_io")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", thread=").append(thread);
        sb.append(", file=").append(file);
        sb.append(", latency=").append(latency);
        sb.append(", operation=").append(operation);
        sb.append(", requested=").append(requested);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source Table: x$latest_file_io")
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
        XLatestFileIo other = (XLatestFileIo) that;
        return (this.getThread() == null ? other.getThread() == null : this.getThread().equals(other.getThread()))
            && (this.getFile() == null ? other.getFile() == null : this.getFile().equals(other.getFile()))
            && (this.getLatency() == null ? other.getLatency() == null : this.getLatency().equals(other.getLatency()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getRequested() == null ? other.getRequested() == null : this.getRequested().equals(other.getRequested()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1098161+08:00", comments="Source Table: x$latest_file_io")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThread() == null) ? 0 : getThread().hashCode());
        result = prime * result + ((getFile() == null) ? 0 : getFile().hashCode());
        result = prime * result + ((getLatency() == null) ? 0 : getLatency().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getRequested() == null) ? 0 : getRequested().hashCode());
        return result;
    }
}