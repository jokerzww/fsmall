package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class DataLocks implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_LOCK_ID")
    private String engineLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE")
    private String engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_TRANSACTION_ID")
    private Long engineTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.THREAD_ID")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.EVENT_ID")
    private Long eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_SCHEMA")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_NAME")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.PARTITION_NAME")
    private String partitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.SUBPARTITION_NAME")
    private String subpartitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.INDEX_NAME")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_TYPE")
    private String lockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_MODE")
    private String lockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_STATUS")
    private String lockStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_DATA")
    private String lockData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_LOCK_ID")
    public String getEngineLockId() {
        return engineLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_LOCK_ID")
    public void setEngineLockId(String engineLockId) {
        this.engineLockId = engineLockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE")
    public String getEngine() {
        return engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_TRANSACTION_ID")
    public Long getEngineTransactionId() {
        return engineTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_TRANSACTION_ID")
    public void setEngineTransactionId(Long engineTransactionId) {
        this.engineTransactionId = engineTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.THREAD_ID")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.THREAD_ID")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.EVENT_ID")
    public Long getEventId() {
        return eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.EVENT_ID")
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_SCHEMA")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_SCHEMA")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_NAME")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_NAME")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.PARTITION_NAME")
    public String getPartitionName() {
        return partitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.PARTITION_NAME")
    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.SUBPARTITION_NAME")
    public String getSubpartitionName() {
        return subpartitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.SUBPARTITION_NAME")
    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.INDEX_NAME")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_INSTANCE_BEGIN")
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_INSTANCE_BEGIN")
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_TYPE")
    public String getLockType() {
        return lockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_TYPE")
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_MODE")
    public String getLockMode() {
        return lockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_MODE")
    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_STATUS")
    public String getLockStatus() {
        return lockStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_STATUS")
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_DATA")
    public String getLockData() {
        return lockData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_DATA")
    public void setLockData(String lockData) {
        this.lockData = lockData;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", engineLockId=").append(engineLockId);
        sb.append(", engine=").append(engine);
        sb.append(", engineTransactionId=").append(engineTransactionId);
        sb.append(", threadId=").append(threadId);
        sb.append(", eventId=").append(eventId);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", partitionName=").append(partitionName);
        sb.append(", subpartitionName=").append(subpartitionName);
        sb.append(", indexName=").append(indexName);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", lockType=").append(lockType);
        sb.append(", lockMode=").append(lockMode);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", lockData=").append(lockData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
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
        DataLocks other = (DataLocks) that;
        return (this.getEngineLockId() == null ? other.getEngineLockId() == null : this.getEngineLockId().equals(other.getEngineLockId()))
            && (this.getEngine() == null ? other.getEngine() == null : this.getEngine().equals(other.getEngine()))
            && (this.getEngineTransactionId() == null ? other.getEngineTransactionId() == null : this.getEngineTransactionId().equals(other.getEngineTransactionId()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getPartitionName() == null ? other.getPartitionName() == null : this.getPartitionName().equals(other.getPartitionName()))
            && (this.getSubpartitionName() == null ? other.getSubpartitionName() == null : this.getSubpartitionName().equals(other.getSubpartitionName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getObjectInstanceBegin() == null ? other.getObjectInstanceBegin() == null : this.getObjectInstanceBegin().equals(other.getObjectInstanceBegin()))
            && (this.getLockType() == null ? other.getLockType() == null : this.getLockType().equals(other.getLockType()))
            && (this.getLockMode() == null ? other.getLockMode() == null : this.getLockMode().equals(other.getLockMode()))
            && (this.getLockStatus() == null ? other.getLockStatus() == null : this.getLockStatus().equals(other.getLockStatus()))
            && (this.getLockData() == null ? other.getLockData() == null : this.getLockData().equals(other.getLockData()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEngineLockId() == null) ? 0 : getEngineLockId().hashCode());
        result = prime * result + ((getEngine() == null) ? 0 : getEngine().hashCode());
        result = prime * result + ((getEngineTransactionId() == null) ? 0 : getEngineTransactionId().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getPartitionName() == null) ? 0 : getPartitionName().hashCode());
        result = prime * result + ((getSubpartitionName() == null) ? 0 : getSubpartitionName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getObjectInstanceBegin() == null) ? 0 : getObjectInstanceBegin().hashCode());
        result = prime * result + ((getLockType() == null) ? 0 : getLockType().hashCode());
        result = prime * result + ((getLockMode() == null) ? 0 : getLockMode().hashCode());
        result = prime * result + ((getLockStatus() == null) ? 0 : getLockStatus().hashCode());
        result = prime * result + ((getLockData() == null) ? 0 : getLockData().hashCode());
        return result;
    }
}