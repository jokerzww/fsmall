package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class MemorySummaryByUserByEventName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.USER")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_ALLOC")
    private Long countAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_FREE")
    private Long countFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC")
    private Long sumNumberOfBytesAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE")
    private Long sumNumberOfBytesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_COUNT_USED")
    private Long lowCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_COUNT_USED")
    private Long currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_COUNT_USED")
    private Long highCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED")
    private Long lowNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED")
    private Long currentNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED")
    private Long highNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.USER")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.USER")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_ALLOC")
    public Long getCountAlloc() {
        return countAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_ALLOC")
    public void setCountAlloc(Long countAlloc) {
        this.countAlloc = countAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_FREE")
    public Long getCountFree() {
        return countFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_FREE")
    public void setCountFree(Long countFree) {
        this.countFree = countFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC")
    public Long getSumNumberOfBytesAlloc() {
        return sumNumberOfBytesAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC")
    public void setSumNumberOfBytesAlloc(Long sumNumberOfBytesAlloc) {
        this.sumNumberOfBytesAlloc = sumNumberOfBytesAlloc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE")
    public Long getSumNumberOfBytesFree() {
        return sumNumberOfBytesFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE")
    public void setSumNumberOfBytesFree(Long sumNumberOfBytesFree) {
        this.sumNumberOfBytesFree = sumNumberOfBytesFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_COUNT_USED")
    public Long getLowCountUsed() {
        return lowCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_COUNT_USED")
    public void setLowCountUsed(Long lowCountUsed) {
        this.lowCountUsed = lowCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_COUNT_USED")
    public Long getCurrentCountUsed() {
        return currentCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_COUNT_USED")
    public void setCurrentCountUsed(Long currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_COUNT_USED")
    public Long getHighCountUsed() {
        return highCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_COUNT_USED")
    public void setHighCountUsed(Long highCountUsed) {
        this.highCountUsed = highCountUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED")
    public Long getLowNumberOfBytesUsed() {
        return lowNumberOfBytesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED")
    public void setLowNumberOfBytesUsed(Long lowNumberOfBytesUsed) {
        this.lowNumberOfBytesUsed = lowNumberOfBytesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED")
    public Long getCurrentNumberOfBytesUsed() {
        return currentNumberOfBytesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED")
    public void setCurrentNumberOfBytesUsed(Long currentNumberOfBytesUsed) {
        this.currentNumberOfBytesUsed = currentNumberOfBytesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED")
    public Long getHighNumberOfBytesUsed() {
        return highNumberOfBytesUsed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED")
    public void setHighNumberOfBytesUsed(Long highNumberOfBytesUsed) {
        this.highNumberOfBytesUsed = highNumberOfBytesUsed;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", eventName=").append(eventName);
        sb.append(", countAlloc=").append(countAlloc);
        sb.append(", countFree=").append(countFree);
        sb.append(", sumNumberOfBytesAlloc=").append(sumNumberOfBytesAlloc);
        sb.append(", sumNumberOfBytesFree=").append(sumNumberOfBytesFree);
        sb.append(", lowCountUsed=").append(lowCountUsed);
        sb.append(", currentCountUsed=").append(currentCountUsed);
        sb.append(", highCountUsed=").append(highCountUsed);
        sb.append(", lowNumberOfBytesUsed=").append(lowNumberOfBytesUsed);
        sb.append(", currentNumberOfBytesUsed=").append(currentNumberOfBytesUsed);
        sb.append(", highNumberOfBytesUsed=").append(highNumberOfBytesUsed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
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
        MemorySummaryByUserByEventName other = (MemorySummaryByUserByEventName) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getCountAlloc() == null ? other.getCountAlloc() == null : this.getCountAlloc().equals(other.getCountAlloc()))
            && (this.getCountFree() == null ? other.getCountFree() == null : this.getCountFree().equals(other.getCountFree()))
            && (this.getSumNumberOfBytesAlloc() == null ? other.getSumNumberOfBytesAlloc() == null : this.getSumNumberOfBytesAlloc().equals(other.getSumNumberOfBytesAlloc()))
            && (this.getSumNumberOfBytesFree() == null ? other.getSumNumberOfBytesFree() == null : this.getSumNumberOfBytesFree().equals(other.getSumNumberOfBytesFree()))
            && (this.getLowCountUsed() == null ? other.getLowCountUsed() == null : this.getLowCountUsed().equals(other.getLowCountUsed()))
            && (this.getCurrentCountUsed() == null ? other.getCurrentCountUsed() == null : this.getCurrentCountUsed().equals(other.getCurrentCountUsed()))
            && (this.getHighCountUsed() == null ? other.getHighCountUsed() == null : this.getHighCountUsed().equals(other.getHighCountUsed()))
            && (this.getLowNumberOfBytesUsed() == null ? other.getLowNumberOfBytesUsed() == null : this.getLowNumberOfBytesUsed().equals(other.getLowNumberOfBytesUsed()))
            && (this.getCurrentNumberOfBytesUsed() == null ? other.getCurrentNumberOfBytesUsed() == null : this.getCurrentNumberOfBytesUsed().equals(other.getCurrentNumberOfBytesUsed()))
            && (this.getHighNumberOfBytesUsed() == null ? other.getHighNumberOfBytesUsed() == null : this.getHighNumberOfBytesUsed().equals(other.getHighNumberOfBytesUsed()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getCountAlloc() == null) ? 0 : getCountAlloc().hashCode());
        result = prime * result + ((getCountFree() == null) ? 0 : getCountFree().hashCode());
        result = prime * result + ((getSumNumberOfBytesAlloc() == null) ? 0 : getSumNumberOfBytesAlloc().hashCode());
        result = prime * result + ((getSumNumberOfBytesFree() == null) ? 0 : getSumNumberOfBytesFree().hashCode());
        result = prime * result + ((getLowCountUsed() == null) ? 0 : getLowCountUsed().hashCode());
        result = prime * result + ((getCurrentCountUsed() == null) ? 0 : getCurrentCountUsed().hashCode());
        result = prime * result + ((getHighCountUsed() == null) ? 0 : getHighCountUsed().hashCode());
        result = prime * result + ((getLowNumberOfBytesUsed() == null) ? 0 : getLowNumberOfBytesUsed().hashCode());
        result = prime * result + ((getCurrentNumberOfBytesUsed() == null) ? 0 : getCurrentNumberOfBytesUsed().hashCode());
        result = prime * result + ((getHighNumberOfBytesUsed() == null) ? 0 : getHighNumberOfBytesUsed().hashCode());
        return result;
    }
}