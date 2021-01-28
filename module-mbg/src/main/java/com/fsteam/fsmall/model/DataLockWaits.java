package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class DataLockWaits implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.ENGINE")
    private String engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_LOCK_ID")
    private String requestingEngineLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID")
    private Long requestingEngineTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_THREAD_ID")
    private Long requestingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_EVENT_ID")
    private Long requestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN")
    private Long requestingObjectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_LOCK_ID")
    private String blockingEngineLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID")
    private Long blockingEngineTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_THREAD_ID")
    private Long blockingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_EVENT_ID")
    private Long blockingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN")
    private Long blockingObjectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source Table: data_lock_waits")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.ENGINE")
    public String getEngine() {
        return engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.ENGINE")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_LOCK_ID")
    public String getRequestingEngineLockId() {
        return requestingEngineLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_LOCK_ID")
    public void setRequestingEngineLockId(String requestingEngineLockId) {
        this.requestingEngineLockId = requestingEngineLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID")
    public Long getRequestingEngineTransactionId() {
        return requestingEngineTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID")
    public void setRequestingEngineTransactionId(Long requestingEngineTransactionId) {
        this.requestingEngineTransactionId = requestingEngineTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_THREAD_ID")
    public Long getRequestingThreadId() {
        return requestingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_THREAD_ID")
    public void setRequestingThreadId(Long requestingThreadId) {
        this.requestingThreadId = requestingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_EVENT_ID")
    public Long getRequestingEventId() {
        return requestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_EVENT_ID")
    public void setRequestingEventId(Long requestingEventId) {
        this.requestingEventId = requestingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN")
    public Long getRequestingObjectInstanceBegin() {
        return requestingObjectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN")
    public void setRequestingObjectInstanceBegin(Long requestingObjectInstanceBegin) {
        this.requestingObjectInstanceBegin = requestingObjectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_LOCK_ID")
    public String getBlockingEngineLockId() {
        return blockingEngineLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_LOCK_ID")
    public void setBlockingEngineLockId(String blockingEngineLockId) {
        this.blockingEngineLockId = blockingEngineLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID")
    public Long getBlockingEngineTransactionId() {
        return blockingEngineTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID")
    public void setBlockingEngineTransactionId(Long blockingEngineTransactionId) {
        this.blockingEngineTransactionId = blockingEngineTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_THREAD_ID")
    public Long getBlockingThreadId() {
        return blockingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_THREAD_ID")
    public void setBlockingThreadId(Long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_EVENT_ID")
    public Long getBlockingEventId() {
        return blockingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_EVENT_ID")
    public void setBlockingEventId(Long blockingEventId) {
        this.blockingEventId = blockingEventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN")
    public Long getBlockingObjectInstanceBegin() {
        return blockingObjectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN")
    public void setBlockingObjectInstanceBegin(Long blockingObjectInstanceBegin) {
        this.blockingObjectInstanceBegin = blockingObjectInstanceBegin;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source Table: data_lock_waits")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", engine=").append(engine);
        sb.append(", requestingEngineLockId=").append(requestingEngineLockId);
        sb.append(", requestingEngineTransactionId=").append(requestingEngineTransactionId);
        sb.append(", requestingThreadId=").append(requestingThreadId);
        sb.append(", requestingEventId=").append(requestingEventId);
        sb.append(", requestingObjectInstanceBegin=").append(requestingObjectInstanceBegin);
        sb.append(", blockingEngineLockId=").append(blockingEngineLockId);
        sb.append(", blockingEngineTransactionId=").append(blockingEngineTransactionId);
        sb.append(", blockingThreadId=").append(blockingThreadId);
        sb.append(", blockingEventId=").append(blockingEventId);
        sb.append(", blockingObjectInstanceBegin=").append(blockingObjectInstanceBegin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source Table: data_lock_waits")
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
        DataLockWaits other = (DataLockWaits) that;
        return (this.getEngine() == null ? other.getEngine() == null : this.getEngine().equals(other.getEngine()))
            && (this.getRequestingEngineLockId() == null ? other.getRequestingEngineLockId() == null : this.getRequestingEngineLockId().equals(other.getRequestingEngineLockId()))
            && (this.getRequestingEngineTransactionId() == null ? other.getRequestingEngineTransactionId() == null : this.getRequestingEngineTransactionId().equals(other.getRequestingEngineTransactionId()))
            && (this.getRequestingThreadId() == null ? other.getRequestingThreadId() == null : this.getRequestingThreadId().equals(other.getRequestingThreadId()))
            && (this.getRequestingEventId() == null ? other.getRequestingEventId() == null : this.getRequestingEventId().equals(other.getRequestingEventId()))
            && (this.getRequestingObjectInstanceBegin() == null ? other.getRequestingObjectInstanceBegin() == null : this.getRequestingObjectInstanceBegin().equals(other.getRequestingObjectInstanceBegin()))
            && (this.getBlockingEngineLockId() == null ? other.getBlockingEngineLockId() == null : this.getBlockingEngineLockId().equals(other.getBlockingEngineLockId()))
            && (this.getBlockingEngineTransactionId() == null ? other.getBlockingEngineTransactionId() == null : this.getBlockingEngineTransactionId().equals(other.getBlockingEngineTransactionId()))
            && (this.getBlockingThreadId() == null ? other.getBlockingThreadId() == null : this.getBlockingThreadId().equals(other.getBlockingThreadId()))
            && (this.getBlockingEventId() == null ? other.getBlockingEventId() == null : this.getBlockingEventId().equals(other.getBlockingEventId()))
            && (this.getBlockingObjectInstanceBegin() == null ? other.getBlockingObjectInstanceBegin() == null : this.getBlockingObjectInstanceBegin().equals(other.getBlockingObjectInstanceBegin()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source Table: data_lock_waits")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEngine() == null) ? 0 : getEngine().hashCode());
        result = prime * result + ((getRequestingEngineLockId() == null) ? 0 : getRequestingEngineLockId().hashCode());
        result = prime * result + ((getRequestingEngineTransactionId() == null) ? 0 : getRequestingEngineTransactionId().hashCode());
        result = prime * result + ((getRequestingThreadId() == null) ? 0 : getRequestingThreadId().hashCode());
        result = prime * result + ((getRequestingEventId() == null) ? 0 : getRequestingEventId().hashCode());
        result = prime * result + ((getRequestingObjectInstanceBegin() == null) ? 0 : getRequestingObjectInstanceBegin().hashCode());
        result = prime * result + ((getBlockingEngineLockId() == null) ? 0 : getBlockingEngineLockId().hashCode());
        result = prime * result + ((getBlockingEngineTransactionId() == null) ? 0 : getBlockingEngineTransactionId().hashCode());
        result = prime * result + ((getBlockingThreadId() == null) ? 0 : getBlockingThreadId().hashCode());
        result = prime * result + ((getBlockingEventId() == null) ? 0 : getBlockingEventId().hashCode());
        result = prime * result + ((getBlockingObjectInstanceBegin() == null) ? 0 : getBlockingObjectInstanceBegin().hashCode());
        return result;
    }
}