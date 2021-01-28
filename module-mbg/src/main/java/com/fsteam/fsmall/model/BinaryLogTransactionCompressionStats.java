package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class BinaryLogTransactionCompressionStats implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LOG_TYPE")
    private String logType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_TYPE")
    private String compressionType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.TRANSACTION_COUNTER")
    private Long transactionCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER")
    private Long compressedBytesCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER")
    private Long uncompressedBytesCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE")
    private Short compressionPercentage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES")
    private Long firstTransactionCompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES")
    private Long firstTransactionUncompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP")
    private Date firstTransactionTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES")
    private Long lastTransactionCompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES")
    private Long lastTransactionUncompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP")
    private Date lastTransactionTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID")
    private String firstTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_ID")
    private String lastTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LOG_TYPE")
    public String getLogType() {
        return logType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LOG_TYPE")
    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_TYPE")
    public String getCompressionType() {
        return compressionType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_TYPE")
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.TRANSACTION_COUNTER")
    public Long getTransactionCounter() {
        return transactionCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.TRANSACTION_COUNTER")
    public void setTransactionCounter(Long transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER")
    public Long getCompressedBytesCounter() {
        return compressedBytesCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER")
    public void setCompressedBytesCounter(Long compressedBytesCounter) {
        this.compressedBytesCounter = compressedBytesCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER")
    public Long getUncompressedBytesCounter() {
        return uncompressedBytesCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER")
    public void setUncompressedBytesCounter(Long uncompressedBytesCounter) {
        this.uncompressedBytesCounter = uncompressedBytesCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE")
    public Short getCompressionPercentage() {
        return compressionPercentage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE")
    public void setCompressionPercentage(Short compressionPercentage) {
        this.compressionPercentage = compressionPercentage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES")
    public Long getFirstTransactionCompressedBytes() {
        return firstTransactionCompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES")
    public void setFirstTransactionCompressedBytes(Long firstTransactionCompressedBytes) {
        this.firstTransactionCompressedBytes = firstTransactionCompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES")
    public Long getFirstTransactionUncompressedBytes() {
        return firstTransactionUncompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES")
    public void setFirstTransactionUncompressedBytes(Long firstTransactionUncompressedBytes) {
        this.firstTransactionUncompressedBytes = firstTransactionUncompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP")
    public Date getFirstTransactionTimestamp() {
        return firstTransactionTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP")
    public void setFirstTransactionTimestamp(Date firstTransactionTimestamp) {
        this.firstTransactionTimestamp = firstTransactionTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES")
    public Long getLastTransactionCompressedBytes() {
        return lastTransactionCompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES")
    public void setLastTransactionCompressedBytes(Long lastTransactionCompressedBytes) {
        this.lastTransactionCompressedBytes = lastTransactionCompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES")
    public Long getLastTransactionUncompressedBytes() {
        return lastTransactionUncompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES")
    public void setLastTransactionUncompressedBytes(Long lastTransactionUncompressedBytes) {
        this.lastTransactionUncompressedBytes = lastTransactionUncompressedBytes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP")
    public Date getLastTransactionTimestamp() {
        return lastTransactionTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP")
    public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {
        this.lastTransactionTimestamp = lastTransactionTimestamp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID")
    public String getFirstTransactionId() {
        return firstTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID")
    public void setFirstTransactionId(String firstTransactionId) {
        this.firstTransactionId = firstTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_ID")
    public String getLastTransactionId() {
        return lastTransactionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_ID")
    public void setLastTransactionId(String lastTransactionId) {
        this.lastTransactionId = lastTransactionId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logType=").append(logType);
        sb.append(", compressionType=").append(compressionType);
        sb.append(", transactionCounter=").append(transactionCounter);
        sb.append(", compressedBytesCounter=").append(compressedBytesCounter);
        sb.append(", uncompressedBytesCounter=").append(uncompressedBytesCounter);
        sb.append(", compressionPercentage=").append(compressionPercentage);
        sb.append(", firstTransactionCompressedBytes=").append(firstTransactionCompressedBytes);
        sb.append(", firstTransactionUncompressedBytes=").append(firstTransactionUncompressedBytes);
        sb.append(", firstTransactionTimestamp=").append(firstTransactionTimestamp);
        sb.append(", lastTransactionCompressedBytes=").append(lastTransactionCompressedBytes);
        sb.append(", lastTransactionUncompressedBytes=").append(lastTransactionUncompressedBytes);
        sb.append(", lastTransactionTimestamp=").append(lastTransactionTimestamp);
        sb.append(", firstTransactionId=").append(firstTransactionId);
        sb.append(", lastTransactionId=").append(lastTransactionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source Table: binary_log_transaction_compression_stats")
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
        BinaryLogTransactionCompressionStats other = (BinaryLogTransactionCompressionStats) that;
        return (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getCompressionType() == null ? other.getCompressionType() == null : this.getCompressionType().equals(other.getCompressionType()))
            && (this.getTransactionCounter() == null ? other.getTransactionCounter() == null : this.getTransactionCounter().equals(other.getTransactionCounter()))
            && (this.getCompressedBytesCounter() == null ? other.getCompressedBytesCounter() == null : this.getCompressedBytesCounter().equals(other.getCompressedBytesCounter()))
            && (this.getUncompressedBytesCounter() == null ? other.getUncompressedBytesCounter() == null : this.getUncompressedBytesCounter().equals(other.getUncompressedBytesCounter()))
            && (this.getCompressionPercentage() == null ? other.getCompressionPercentage() == null : this.getCompressionPercentage().equals(other.getCompressionPercentage()))
            && (this.getFirstTransactionCompressedBytes() == null ? other.getFirstTransactionCompressedBytes() == null : this.getFirstTransactionCompressedBytes().equals(other.getFirstTransactionCompressedBytes()))
            && (this.getFirstTransactionUncompressedBytes() == null ? other.getFirstTransactionUncompressedBytes() == null : this.getFirstTransactionUncompressedBytes().equals(other.getFirstTransactionUncompressedBytes()))
            && (this.getFirstTransactionTimestamp() == null ? other.getFirstTransactionTimestamp() == null : this.getFirstTransactionTimestamp().equals(other.getFirstTransactionTimestamp()))
            && (this.getLastTransactionCompressedBytes() == null ? other.getLastTransactionCompressedBytes() == null : this.getLastTransactionCompressedBytes().equals(other.getLastTransactionCompressedBytes()))
            && (this.getLastTransactionUncompressedBytes() == null ? other.getLastTransactionUncompressedBytes() == null : this.getLastTransactionUncompressedBytes().equals(other.getLastTransactionUncompressedBytes()))
            && (this.getLastTransactionTimestamp() == null ? other.getLastTransactionTimestamp() == null : this.getLastTransactionTimestamp().equals(other.getLastTransactionTimestamp()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        result = prime * result + ((getTransactionCounter() == null) ? 0 : getTransactionCounter().hashCode());
        result = prime * result + ((getCompressedBytesCounter() == null) ? 0 : getCompressedBytesCounter().hashCode());
        result = prime * result + ((getUncompressedBytesCounter() == null) ? 0 : getUncompressedBytesCounter().hashCode());
        result = prime * result + ((getCompressionPercentage() == null) ? 0 : getCompressionPercentage().hashCode());
        result = prime * result + ((getFirstTransactionCompressedBytes() == null) ? 0 : getFirstTransactionCompressedBytes().hashCode());
        result = prime * result + ((getFirstTransactionUncompressedBytes() == null) ? 0 : getFirstTransactionUncompressedBytes().hashCode());
        result = prime * result + ((getFirstTransactionTimestamp() == null) ? 0 : getFirstTransactionTimestamp().hashCode());
        result = prime * result + ((getLastTransactionCompressedBytes() == null) ? 0 : getLastTransactionCompressedBytes().hashCode());
        result = prime * result + ((getLastTransactionUncompressedBytes() == null) ? 0 : getLastTransactionUncompressedBytes().hashCode());
        result = prime * result + ((getLastTransactionTimestamp() == null) ? 0 : getLastTransactionTimestamp().hashCode());
        return result;
    }
}