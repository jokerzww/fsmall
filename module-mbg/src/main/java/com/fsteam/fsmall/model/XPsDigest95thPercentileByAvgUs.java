package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XPsDigest95thPercentileByAvgUs implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.avg_us")
    private BigDecimal avgUs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.percentile")
    private BigDecimal percentile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.avg_us")
    public BigDecimal getAvgUs() {
        return avgUs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.avg_us")
    public void setAvgUs(BigDecimal avgUs) {
        this.avgUs = avgUs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.percentile")
    public BigDecimal getPercentile() {
        return percentile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.percentile")
    public void setPercentile(BigDecimal percentile) {
        this.percentile = percentile;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", avgUs=").append(avgUs);
        sb.append(", percentile=").append(percentile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
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
        XPsDigest95thPercentileByAvgUs other = (XPsDigest95thPercentileByAvgUs) that;
        return (this.getAvgUs() == null ? other.getAvgUs() == null : this.getAvgUs().equals(other.getAvgUs()))
            && (this.getPercentile() == null ? other.getPercentile() == null : this.getPercentile().equals(other.getPercentile()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAvgUs() == null) ? 0 : getAvgUs().hashCode());
        result = prime * result + ((getPercentile() == null) ? 0 : getPercentile().hashCode());
        return result;
    }
}