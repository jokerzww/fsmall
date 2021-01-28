package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class UserSummaryByFileIo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.ios")
    private BigDecimal ios;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.io_latency")
    private String ioLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source Table: user_summary_by_file_io")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.ios")
    public BigDecimal getIos() {
        return ios;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.ios")
    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.io_latency")
    public String getIoLatency() {
        return ioLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source field: user_summary_by_file_io.io_latency")
    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source Table: user_summary_by_file_io")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", ios=").append(ios);
        sb.append(", ioLatency=").append(ioLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source Table: user_summary_by_file_io")
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
        UserSummaryByFileIo other = (UserSummaryByFileIo) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getIos() == null ? other.getIos() == null : this.getIos().equals(other.getIos()))
            && (this.getIoLatency() == null ? other.getIoLatency() == null : this.getIoLatency().equals(other.getIoLatency()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0407522+08:00", comments="Source Table: user_summary_by_file_io")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getIos() == null) ? 0 : getIos().hashCode());
        result = prime * result + ((getIoLatency() == null) ? 0 : getIoLatency().hashCode());
        return result;
    }
}