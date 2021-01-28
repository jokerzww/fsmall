package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XIoGlobalByFileByBytes implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.file")
    private String file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_read")
    private Long countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_read")
    private Long totalRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_read")
    private BigDecimal avgRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_write")
    private Long countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_written")
    private Long totalWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_write")
    private BigDecimal avgWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total")
    private Long total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.write_pct")
    private BigDecimal writePct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.file")
    public String getFile() {
        return file;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.file")
    public void setFile(String file) {
        this.file = file;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_read")
    public Long getCountRead() {
        return countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_read")
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_read")
    public Long getTotalRead() {
        return totalRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_read")
    public void setTotalRead(Long totalRead) {
        this.totalRead = totalRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_read")
    public BigDecimal getAvgRead() {
        return avgRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_read")
    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_write")
    public Long getCountWrite() {
        return countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.count_write")
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_written")
    public Long getTotalWritten() {
        return totalWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total_written")
    public void setTotalWritten(Long totalWritten) {
        this.totalWritten = totalWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_write")
    public BigDecimal getAvgWrite() {
        return avgWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.avg_write")
    public void setAvgWrite(BigDecimal avgWrite) {
        this.avgWrite = avgWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source field: x$io_global_by_file_by_bytes.total")
    public Long getTotal() {
        return total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.write_pct")
    public BigDecimal getWritePct() {
        return writePct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source field: x$io_global_by_file_by_bytes.write_pct")
    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", file=").append(file);
        sb.append(", countRead=").append(countRead);
        sb.append(", totalRead=").append(totalRead);
        sb.append(", avgRead=").append(avgRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", totalWritten=").append(totalWritten);
        sb.append(", avgWrite=").append(avgWrite);
        sb.append(", total=").append(total);
        sb.append(", writePct=").append(writePct);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
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
        XIoGlobalByFileByBytes other = (XIoGlobalByFileByBytes) that;
        return (this.getFile() == null ? other.getFile() == null : this.getFile().equals(other.getFile()))
            && (this.getCountRead() == null ? other.getCountRead() == null : this.getCountRead().equals(other.getCountRead()))
            && (this.getTotalRead() == null ? other.getTotalRead() == null : this.getTotalRead().equals(other.getTotalRead()))
            && (this.getAvgRead() == null ? other.getAvgRead() == null : this.getAvgRead().equals(other.getAvgRead()))
            && (this.getCountWrite() == null ? other.getCountWrite() == null : this.getCountWrite().equals(other.getCountWrite()))
            && (this.getTotalWritten() == null ? other.getTotalWritten() == null : this.getTotalWritten().equals(other.getTotalWritten()))
            && (this.getAvgWrite() == null ? other.getAvgWrite() == null : this.getAvgWrite().equals(other.getAvgWrite()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getWritePct() == null ? other.getWritePct() == null : this.getWritePct().equals(other.getWritePct()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFile() == null) ? 0 : getFile().hashCode());
        result = prime * result + ((getCountRead() == null) ? 0 : getCountRead().hashCode());
        result = prime * result + ((getTotalRead() == null) ? 0 : getTotalRead().hashCode());
        result = prime * result + ((getAvgRead() == null) ? 0 : getAvgRead().hashCode());
        result = prime * result + ((getCountWrite() == null) ? 0 : getCountWrite().hashCode());
        result = prime * result + ((getTotalWritten() == null) ? 0 : getTotalWritten().hashCode());
        result = prime * result + ((getAvgWrite() == null) ? 0 : getAvgWrite().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getWritePct() == null) ? 0 : getWritePct().hashCode());
        return result;
    }
}