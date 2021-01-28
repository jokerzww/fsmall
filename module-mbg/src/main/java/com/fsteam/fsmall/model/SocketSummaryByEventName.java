package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SocketSummaryByEventName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_STAR")
    private Long countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WAIT")
    private Long maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_READ")
    private Long countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_READ")
    private Long sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_READ")
    private Long minTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_READ")
    private Long avgTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_READ")
    private Long maxTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ")
    private Long sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_WRITE")
    private Long countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WRITE")
    private Long sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WRITE")
    private Long minTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WRITE")
    private Long avgTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WRITE")
    private Long maxTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE")
    private Long sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.COUNT_MISC")
    private Long countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_MISC")
    private Long sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_MISC")
    private Long minTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_MISC")
    private Long avgTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_MISC")
    private Long maxTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source Table: socket_summary_by_event_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_STAR")
    public Long getCountStar() {
        return countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_STAR")
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WAIT")
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WAIT")
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WAIT")
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WAIT")
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WAIT")
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WAIT")
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WAIT")
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WAIT")
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_READ")
    public Long getCountRead() {
        return countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_READ")
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_READ")
    public Long getSumTimerRead() {
        return sumTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_READ")
    public void setSumTimerRead(Long sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_READ")
    public Long getMinTimerRead() {
        return minTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_READ")
    public void setMinTimerRead(Long minTimerRead) {
        this.minTimerRead = minTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_READ")
    public Long getAvgTimerRead() {
        return avgTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_READ")
    public void setAvgTimerRead(Long avgTimerRead) {
        this.avgTimerRead = avgTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_READ")
    public Long getMaxTimerRead() {
        return maxTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_READ")
    public void setMaxTimerRead(Long maxTimerRead) {
        this.maxTimerRead = maxTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ")
    public Long getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ")
    public void setSumNumberOfBytesRead(Long sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2899796+08:00", comments="Source field: socket_summary_by_event_name.COUNT_WRITE")
    public Long getCountWrite() {
        return countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.COUNT_WRITE")
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WRITE")
    public Long getSumTimerWrite() {
        return sumTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_WRITE")
    public void setSumTimerWrite(Long sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WRITE")
    public Long getMinTimerWrite() {
        return minTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_WRITE")
    public void setMinTimerWrite(Long minTimerWrite) {
        this.minTimerWrite = minTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WRITE")
    public Long getAvgTimerWrite() {
        return avgTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_WRITE")
    public void setAvgTimerWrite(Long avgTimerWrite) {
        this.avgTimerWrite = avgTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WRITE")
    public Long getMaxTimerWrite() {
        return maxTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_WRITE")
    public void setMaxTimerWrite(Long maxTimerWrite) {
        this.maxTimerWrite = maxTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE")
    public Long getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE")
    public void setSumNumberOfBytesWrite(Long sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.COUNT_MISC")
    public Long getCountMisc() {
        return countMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.COUNT_MISC")
    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_MISC")
    public Long getSumTimerMisc() {
        return sumTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.SUM_TIMER_MISC")
    public void setSumTimerMisc(Long sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_MISC")
    public Long getMinTimerMisc() {
        return minTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MIN_TIMER_MISC")
    public void setMinTimerMisc(Long minTimerMisc) {
        this.minTimerMisc = minTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_MISC")
    public Long getAvgTimerMisc() {
        return avgTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.AVG_TIMER_MISC")
    public void setAvgTimerMisc(Long avgTimerMisc) {
        this.avgTimerMisc = avgTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_MISC")
    public Long getMaxTimerMisc() {
        return maxTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source field: socket_summary_by_event_name.MAX_TIMER_MISC")
    public void setMaxTimerMisc(Long maxTimerMisc) {
        this.maxTimerMisc = maxTimerMisc;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source Table: socket_summary_by_event_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventName=").append(eventName);
        sb.append(", countStar=").append(countStar);
        sb.append(", sumTimerWait=").append(sumTimerWait);
        sb.append(", minTimerWait=").append(minTimerWait);
        sb.append(", avgTimerWait=").append(avgTimerWait);
        sb.append(", maxTimerWait=").append(maxTimerWait);
        sb.append(", countRead=").append(countRead);
        sb.append(", sumTimerRead=").append(sumTimerRead);
        sb.append(", minTimerRead=").append(minTimerRead);
        sb.append(", avgTimerRead=").append(avgTimerRead);
        sb.append(", maxTimerRead=").append(maxTimerRead);
        sb.append(", sumNumberOfBytesRead=").append(sumNumberOfBytesRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", sumTimerWrite=").append(sumTimerWrite);
        sb.append(", minTimerWrite=").append(minTimerWrite);
        sb.append(", avgTimerWrite=").append(avgTimerWrite);
        sb.append(", maxTimerWrite=").append(maxTimerWrite);
        sb.append(", sumNumberOfBytesWrite=").append(sumNumberOfBytesWrite);
        sb.append(", countMisc=").append(countMisc);
        sb.append(", sumTimerMisc=").append(sumTimerMisc);
        sb.append(", minTimerMisc=").append(minTimerMisc);
        sb.append(", avgTimerMisc=").append(avgTimerMisc);
        sb.append(", maxTimerMisc=").append(maxTimerMisc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source Table: socket_summary_by_event_name")
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
        SocketSummaryByEventName other = (SocketSummaryByEventName) that;
        return (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getCountStar() == null ? other.getCountStar() == null : this.getCountStar().equals(other.getCountStar()))
            && (this.getSumTimerWait() == null ? other.getSumTimerWait() == null : this.getSumTimerWait().equals(other.getSumTimerWait()))
            && (this.getMinTimerWait() == null ? other.getMinTimerWait() == null : this.getMinTimerWait().equals(other.getMinTimerWait()))
            && (this.getAvgTimerWait() == null ? other.getAvgTimerWait() == null : this.getAvgTimerWait().equals(other.getAvgTimerWait()))
            && (this.getMaxTimerWait() == null ? other.getMaxTimerWait() == null : this.getMaxTimerWait().equals(other.getMaxTimerWait()))
            && (this.getCountRead() == null ? other.getCountRead() == null : this.getCountRead().equals(other.getCountRead()))
            && (this.getSumTimerRead() == null ? other.getSumTimerRead() == null : this.getSumTimerRead().equals(other.getSumTimerRead()))
            && (this.getMinTimerRead() == null ? other.getMinTimerRead() == null : this.getMinTimerRead().equals(other.getMinTimerRead()))
            && (this.getAvgTimerRead() == null ? other.getAvgTimerRead() == null : this.getAvgTimerRead().equals(other.getAvgTimerRead()))
            && (this.getMaxTimerRead() == null ? other.getMaxTimerRead() == null : this.getMaxTimerRead().equals(other.getMaxTimerRead()))
            && (this.getSumNumberOfBytesRead() == null ? other.getSumNumberOfBytesRead() == null : this.getSumNumberOfBytesRead().equals(other.getSumNumberOfBytesRead()))
            && (this.getCountWrite() == null ? other.getCountWrite() == null : this.getCountWrite().equals(other.getCountWrite()))
            && (this.getSumTimerWrite() == null ? other.getSumTimerWrite() == null : this.getSumTimerWrite().equals(other.getSumTimerWrite()))
            && (this.getMinTimerWrite() == null ? other.getMinTimerWrite() == null : this.getMinTimerWrite().equals(other.getMinTimerWrite()))
            && (this.getAvgTimerWrite() == null ? other.getAvgTimerWrite() == null : this.getAvgTimerWrite().equals(other.getAvgTimerWrite()))
            && (this.getMaxTimerWrite() == null ? other.getMaxTimerWrite() == null : this.getMaxTimerWrite().equals(other.getMaxTimerWrite()))
            && (this.getSumNumberOfBytesWrite() == null ? other.getSumNumberOfBytesWrite() == null : this.getSumNumberOfBytesWrite().equals(other.getSumNumberOfBytesWrite()))
            && (this.getCountMisc() == null ? other.getCountMisc() == null : this.getCountMisc().equals(other.getCountMisc()))
            && (this.getSumTimerMisc() == null ? other.getSumTimerMisc() == null : this.getSumTimerMisc().equals(other.getSumTimerMisc()))
            && (this.getMinTimerMisc() == null ? other.getMinTimerMisc() == null : this.getMinTimerMisc().equals(other.getMinTimerMisc()))
            && (this.getAvgTimerMisc() == null ? other.getAvgTimerMisc() == null : this.getAvgTimerMisc().equals(other.getAvgTimerMisc()))
            && (this.getMaxTimerMisc() == null ? other.getMaxTimerMisc() == null : this.getMaxTimerMisc().equals(other.getMaxTimerMisc()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2909808+08:00", comments="Source Table: socket_summary_by_event_name")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getCountStar() == null) ? 0 : getCountStar().hashCode());
        result = prime * result + ((getSumTimerWait() == null) ? 0 : getSumTimerWait().hashCode());
        result = prime * result + ((getMinTimerWait() == null) ? 0 : getMinTimerWait().hashCode());
        result = prime * result + ((getAvgTimerWait() == null) ? 0 : getAvgTimerWait().hashCode());
        result = prime * result + ((getMaxTimerWait() == null) ? 0 : getMaxTimerWait().hashCode());
        result = prime * result + ((getCountRead() == null) ? 0 : getCountRead().hashCode());
        result = prime * result + ((getSumTimerRead() == null) ? 0 : getSumTimerRead().hashCode());
        result = prime * result + ((getMinTimerRead() == null) ? 0 : getMinTimerRead().hashCode());
        result = prime * result + ((getAvgTimerRead() == null) ? 0 : getAvgTimerRead().hashCode());
        result = prime * result + ((getMaxTimerRead() == null) ? 0 : getMaxTimerRead().hashCode());
        result = prime * result + ((getSumNumberOfBytesRead() == null) ? 0 : getSumNumberOfBytesRead().hashCode());
        result = prime * result + ((getCountWrite() == null) ? 0 : getCountWrite().hashCode());
        result = prime * result + ((getSumTimerWrite() == null) ? 0 : getSumTimerWrite().hashCode());
        result = prime * result + ((getMinTimerWrite() == null) ? 0 : getMinTimerWrite().hashCode());
        result = prime * result + ((getAvgTimerWrite() == null) ? 0 : getAvgTimerWrite().hashCode());
        result = prime * result + ((getMaxTimerWrite() == null) ? 0 : getMaxTimerWrite().hashCode());
        result = prime * result + ((getSumNumberOfBytesWrite() == null) ? 0 : getSumNumberOfBytesWrite().hashCode());
        result = prime * result + ((getCountMisc() == null) ? 0 : getCountMisc().hashCode());
        result = prime * result + ((getSumTimerMisc() == null) ? 0 : getSumTimerMisc().hashCode());
        result = prime * result + ((getMinTimerMisc() == null) ? 0 : getMinTimerMisc().hashCode());
        result = prime * result + ((getAvgTimerMisc() == null) ? 0 : getAvgTimerMisc().hashCode());
        result = prime * result + ((getMaxTimerMisc() == null) ? 0 : getMaxTimerMisc().hashCode());
        return result;
    }
}