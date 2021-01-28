package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BinaryLogTransactionCompressionStatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    public static final BinaryLogTransactionCompressionStats binaryLogTransactionCompressionStats = new BinaryLogTransactionCompressionStats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.LOG_TYPE")
    public static final SqlColumn<String> logType = binaryLogTransactionCompressionStats.logType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_TYPE")
    public static final SqlColumn<String> compressionType = binaryLogTransactionCompressionStats.compressionType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.TRANSACTION_COUNTER")
    public static final SqlColumn<Long> transactionCounter = binaryLogTransactionCompressionStats.transactionCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER")
    public static final SqlColumn<Long> compressedBytesCounter = binaryLogTransactionCompressionStats.compressedBytesCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER")
    public static final SqlColumn<Long> uncompressedBytesCounter = binaryLogTransactionCompressionStats.uncompressedBytesCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE")
    public static final SqlColumn<Short> compressionPercentage = binaryLogTransactionCompressionStats.compressionPercentage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES")
    public static final SqlColumn<Long> firstTransactionCompressedBytes = binaryLogTransactionCompressionStats.firstTransactionCompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES")
    public static final SqlColumn<Long> firstTransactionUncompressedBytes = binaryLogTransactionCompressionStats.firstTransactionUncompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP")
    public static final SqlColumn<Date> firstTransactionTimestamp = binaryLogTransactionCompressionStats.firstTransactionTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES")
    public static final SqlColumn<Long> lastTransactionCompressedBytes = binaryLogTransactionCompressionStats.lastTransactionCompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES")
    public static final SqlColumn<Long> lastTransactionUncompressedBytes = binaryLogTransactionCompressionStats.lastTransactionUncompressedBytes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP")
    public static final SqlColumn<Date> lastTransactionTimestamp = binaryLogTransactionCompressionStats.lastTransactionTimestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID")
    public static final SqlColumn<String> firstTransactionId = binaryLogTransactionCompressionStats.firstTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source field: binary_log_transaction_compression_stats.LAST_TRANSACTION_ID")
    public static final SqlColumn<String> lastTransactionId = binaryLogTransactionCompressionStats.lastTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.099806+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    public static final class BinaryLogTransactionCompressionStats extends SqlTable {
        public final SqlColumn<String> logType = column("LOG_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> compressionType = column("COMPRESSION_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<Long> transactionCounter = column("TRANSACTION_COUNTER", JDBCType.BIGINT);

        public final SqlColumn<Long> compressedBytesCounter = column("COMPRESSED_BYTES_COUNTER", JDBCType.BIGINT);

        public final SqlColumn<Long> uncompressedBytesCounter = column("UNCOMPRESSED_BYTES_COUNTER", JDBCType.BIGINT);

        public final SqlColumn<Short> compressionPercentage = column("COMPRESSION_PERCENTAGE", JDBCType.SMALLINT);

        public final SqlColumn<Long> firstTransactionCompressedBytes = column("FIRST_TRANSACTION_COMPRESSED_BYTES", JDBCType.BIGINT);

        public final SqlColumn<Long> firstTransactionUncompressedBytes = column("FIRST_TRANSACTION_UNCOMPRESSED_BYTES", JDBCType.BIGINT);

        public final SqlColumn<Date> firstTransactionTimestamp = column("FIRST_TRANSACTION_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> lastTransactionCompressedBytes = column("LAST_TRANSACTION_COMPRESSED_BYTES", JDBCType.BIGINT);

        public final SqlColumn<Long> lastTransactionUncompressedBytes = column("LAST_TRANSACTION_UNCOMPRESSED_BYTES", JDBCType.BIGINT);

        public final SqlColumn<Date> lastTransactionTimestamp = column("LAST_TRANSACTION_TIMESTAMP", JDBCType.TIMESTAMP);

        public final SqlColumn<String> firstTransactionId = column("FIRST_TRANSACTION_ID", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> lastTransactionId = column("LAST_TRANSACTION_ID", JDBCType.LONGVARCHAR);

        public BinaryLogTransactionCompressionStats() {
            super("binary_log_transaction_compression_stats");
        }
    }
}