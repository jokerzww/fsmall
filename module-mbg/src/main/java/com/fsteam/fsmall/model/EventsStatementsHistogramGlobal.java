package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class EventsStatementsHistogramGlobal implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_NUMBER")
    private Integer bucketNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_LOW")
    private Long bucketTimerLow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_HIGH")
    private Long bucketTimerHigh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET")
    private Long countBucket;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET_AND_LOWER")
    private Long countBucketAndLower;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_QUANTILE")
    private Double bucketQuantile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_NUMBER")
    public Integer getBucketNumber() {
        return bucketNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_NUMBER")
    public void setBucketNumber(Integer bucketNumber) {
        this.bucketNumber = bucketNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_LOW")
    public Long getBucketTimerLow() {
        return bucketTimerLow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_LOW")
    public void setBucketTimerLow(Long bucketTimerLow) {
        this.bucketTimerLow = bucketTimerLow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_HIGH")
    public Long getBucketTimerHigh() {
        return bucketTimerHigh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_TIMER_HIGH")
    public void setBucketTimerHigh(Long bucketTimerHigh) {
        this.bucketTimerHigh = bucketTimerHigh;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET")
    public Long getCountBucket() {
        return countBucket;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET")
    public void setCountBucket(Long countBucket) {
        this.countBucket = countBucket;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET_AND_LOWER")
    public Long getCountBucketAndLower() {
        return countBucketAndLower;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.COUNT_BUCKET_AND_LOWER")
    public void setCountBucketAndLower(Long countBucketAndLower) {
        this.countBucketAndLower = countBucketAndLower;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_QUANTILE")
    public Double getBucketQuantile() {
        return bucketQuantile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source field: events_statements_histogram_global.BUCKET_QUANTILE")
    public void setBucketQuantile(Double bucketQuantile) {
        this.bucketQuantile = bucketQuantile;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bucketNumber=").append(bucketNumber);
        sb.append(", bucketTimerLow=").append(bucketTimerLow);
        sb.append(", bucketTimerHigh=").append(bucketTimerHigh);
        sb.append(", countBucket=").append(countBucket);
        sb.append(", countBucketAndLower=").append(countBucketAndLower);
        sb.append(", bucketQuantile=").append(bucketQuantile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
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
        EventsStatementsHistogramGlobal other = (EventsStatementsHistogramGlobal) that;
        return (this.getBucketNumber() == null ? other.getBucketNumber() == null : this.getBucketNumber().equals(other.getBucketNumber()))
            && (this.getBucketTimerLow() == null ? other.getBucketTimerLow() == null : this.getBucketTimerLow().equals(other.getBucketTimerLow()))
            && (this.getBucketTimerHigh() == null ? other.getBucketTimerHigh() == null : this.getBucketTimerHigh().equals(other.getBucketTimerHigh()))
            && (this.getCountBucket() == null ? other.getCountBucket() == null : this.getCountBucket().equals(other.getCountBucket()))
            && (this.getCountBucketAndLower() == null ? other.getCountBucketAndLower() == null : this.getCountBucketAndLower().equals(other.getCountBucketAndLower()))
            && (this.getBucketQuantile() == null ? other.getBucketQuantile() == null : this.getBucketQuantile().equals(other.getBucketQuantile()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBucketNumber() == null) ? 0 : getBucketNumber().hashCode());
        result = prime * result + ((getBucketTimerLow() == null) ? 0 : getBucketTimerLow().hashCode());
        result = prime * result + ((getBucketTimerHigh() == null) ? 0 : getBucketTimerHigh().hashCode());
        result = prime * result + ((getCountBucket() == null) ? 0 : getCountBucket().hashCode());
        result = prime * result + ((getCountBucketAndLower() == null) ? 0 : getCountBucketAndLower().hashCode());
        result = prime * result + ((getBucketQuantile() == null) ? 0 : getBucketQuantile().hashCode());
        return result;
    }
}