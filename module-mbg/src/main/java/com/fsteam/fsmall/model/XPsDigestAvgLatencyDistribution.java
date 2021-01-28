package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XPsDigestAvgLatencyDistribution implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.cnt")
    private Long cnt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.avg_us")
    private BigDecimal avgUs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.cnt")
    public Long getCnt() {
        return cnt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.cnt")
    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.avg_us")
    public BigDecimal getAvgUs() {
        return avgUs;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.avg_us")
    public void setAvgUs(BigDecimal avgUs) {
        this.avgUs = avgUs;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnt=").append(cnt);
        sb.append(", avgUs=").append(avgUs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
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
        XPsDigestAvgLatencyDistribution other = (XPsDigestAvgLatencyDistribution) that;
        return (this.getCnt() == null ? other.getCnt() == null : this.getCnt().equals(other.getCnt()))
            && (this.getAvgUs() == null ? other.getAvgUs() == null : this.getAvgUs().equals(other.getAvgUs()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCnt() == null) ? 0 : getCnt().hashCode());
        result = prime * result + ((getAvgUs() == null) ? 0 : getAvgUs().hashCode());
        return result;
    }
}