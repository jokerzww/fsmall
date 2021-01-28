package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.BinaryLogTransactionCompressionStatsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.BinaryLogTransactionCompressionStats;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface BinaryLogTransactionCompressionStatsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    BasicColumn[] selectList = BasicColumn.columnList(logType, compressionType, transactionCounter, compressedBytesCounter, uncompressedBytesCounter, compressionPercentage, firstTransactionCompressedBytes, firstTransactionUncompressedBytes, firstTransactionTimestamp, lastTransactionCompressedBytes, lastTransactionUncompressedBytes, lastTransactionTimestamp, firstTransactionId, lastTransactionId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<BinaryLogTransactionCompressionStats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BinaryLogTransactionCompressionStatsResult")
    Optional<BinaryLogTransactionCompressionStats> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BinaryLogTransactionCompressionStatsResult", value = {
        @Result(column="LOG_TYPE", property="logType", jdbcType=JdbcType.CHAR),
        @Result(column="COMPRESSION_TYPE", property="compressionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRANSACTION_COUNTER", property="transactionCounter", jdbcType=JdbcType.BIGINT),
        @Result(column="COMPRESSED_BYTES_COUNTER", property="compressedBytesCounter", jdbcType=JdbcType.BIGINT),
        @Result(column="UNCOMPRESSED_BYTES_COUNTER", property="uncompressedBytesCounter", jdbcType=JdbcType.BIGINT),
        @Result(column="COMPRESSION_PERCENTAGE", property="compressionPercentage", jdbcType=JdbcType.SMALLINT),
        @Result(column="FIRST_TRANSACTION_COMPRESSED_BYTES", property="firstTransactionCompressedBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="FIRST_TRANSACTION_UNCOMPRESSED_BYTES", property="firstTransactionUncompressedBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="FIRST_TRANSACTION_TIMESTAMP", property="firstTransactionTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_TRANSACTION_COMPRESSED_BYTES", property="lastTransactionCompressedBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_TRANSACTION_UNCOMPRESSED_BYTES", property="lastTransactionUncompressedBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_TRANSACTION_TIMESTAMP", property="lastTransactionTimestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FIRST_TRANSACTION_ID", property="firstTransactionId", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="LAST_TRANSACTION_ID", property="lastTransactionId", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BinaryLogTransactionCompressionStats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, binaryLogTransactionCompressionStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, binaryLogTransactionCompressionStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default int insert(BinaryLogTransactionCompressionStats record) {
        return MyBatis3Utils.insert(this::insert, record, binaryLogTransactionCompressionStats, c ->
            c.map(logType).toProperty("logType")
            .map(compressionType).toProperty("compressionType")
            .map(transactionCounter).toProperty("transactionCounter")
            .map(compressedBytesCounter).toProperty("compressedBytesCounter")
            .map(uncompressedBytesCounter).toProperty("uncompressedBytesCounter")
            .map(compressionPercentage).toProperty("compressionPercentage")
            .map(firstTransactionCompressedBytes).toProperty("firstTransactionCompressedBytes")
            .map(firstTransactionUncompressedBytes).toProperty("firstTransactionUncompressedBytes")
            .map(firstTransactionTimestamp).toProperty("firstTransactionTimestamp")
            .map(lastTransactionCompressedBytes).toProperty("lastTransactionCompressedBytes")
            .map(lastTransactionUncompressedBytes).toProperty("lastTransactionUncompressedBytes")
            .map(lastTransactionTimestamp).toProperty("lastTransactionTimestamp")
            .map(firstTransactionId).toProperty("firstTransactionId")
            .map(lastTransactionId).toProperty("lastTransactionId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1008072+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default int insertSelective(BinaryLogTransactionCompressionStats record) {
        return MyBatis3Utils.insert(this::insert, record, binaryLogTransactionCompressionStats, c ->
            c.map(logType).toPropertyWhenPresent("logType", record::getLogType)
            .map(compressionType).toPropertyWhenPresent("compressionType", record::getCompressionType)
            .map(transactionCounter).toPropertyWhenPresent("transactionCounter", record::getTransactionCounter)
            .map(compressedBytesCounter).toPropertyWhenPresent("compressedBytesCounter", record::getCompressedBytesCounter)
            .map(uncompressedBytesCounter).toPropertyWhenPresent("uncompressedBytesCounter", record::getUncompressedBytesCounter)
            .map(compressionPercentage).toPropertyWhenPresent("compressionPercentage", record::getCompressionPercentage)
            .map(firstTransactionCompressedBytes).toPropertyWhenPresent("firstTransactionCompressedBytes", record::getFirstTransactionCompressedBytes)
            .map(firstTransactionUncompressedBytes).toPropertyWhenPresent("firstTransactionUncompressedBytes", record::getFirstTransactionUncompressedBytes)
            .map(firstTransactionTimestamp).toPropertyWhenPresent("firstTransactionTimestamp", record::getFirstTransactionTimestamp)
            .map(lastTransactionCompressedBytes).toPropertyWhenPresent("lastTransactionCompressedBytes", record::getLastTransactionCompressedBytes)
            .map(lastTransactionUncompressedBytes).toPropertyWhenPresent("lastTransactionUncompressedBytes", record::getLastTransactionUncompressedBytes)
            .map(lastTransactionTimestamp).toPropertyWhenPresent("lastTransactionTimestamp", record::getLastTransactionTimestamp)
            .map(firstTransactionId).toPropertyWhenPresent("firstTransactionId", record::getFirstTransactionId)
            .map(lastTransactionId).toPropertyWhenPresent("lastTransactionId", record::getLastTransactionId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default Optional<BinaryLogTransactionCompressionStats> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, binaryLogTransactionCompressionStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default List<BinaryLogTransactionCompressionStats> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, binaryLogTransactionCompressionStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default List<BinaryLogTransactionCompressionStats> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, binaryLogTransactionCompressionStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, binaryLogTransactionCompressionStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    static UpdateDSL<UpdateModel> updateAllColumns(BinaryLogTransactionCompressionStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(logType).equalTo(record::getLogType)
                .set(compressionType).equalTo(record::getCompressionType)
                .set(transactionCounter).equalTo(record::getTransactionCounter)
                .set(compressedBytesCounter).equalTo(record::getCompressedBytesCounter)
                .set(uncompressedBytesCounter).equalTo(record::getUncompressedBytesCounter)
                .set(compressionPercentage).equalTo(record::getCompressionPercentage)
                .set(firstTransactionCompressedBytes).equalTo(record::getFirstTransactionCompressedBytes)
                .set(firstTransactionUncompressedBytes).equalTo(record::getFirstTransactionUncompressedBytes)
                .set(firstTransactionTimestamp).equalTo(record::getFirstTransactionTimestamp)
                .set(lastTransactionCompressedBytes).equalTo(record::getLastTransactionCompressedBytes)
                .set(lastTransactionUncompressedBytes).equalTo(record::getLastTransactionUncompressedBytes)
                .set(lastTransactionTimestamp).equalTo(record::getLastTransactionTimestamp)
                .set(firstTransactionId).equalTo(record::getFirstTransactionId)
                .set(lastTransactionId).equalTo(record::getLastTransactionId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: binary_log_transaction_compression_stats")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BinaryLogTransactionCompressionStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(logType).equalToWhenPresent(record::getLogType)
                .set(compressionType).equalToWhenPresent(record::getCompressionType)
                .set(transactionCounter).equalToWhenPresent(record::getTransactionCounter)
                .set(compressedBytesCounter).equalToWhenPresent(record::getCompressedBytesCounter)
                .set(uncompressedBytesCounter).equalToWhenPresent(record::getUncompressedBytesCounter)
                .set(compressionPercentage).equalToWhenPresent(record::getCompressionPercentage)
                .set(firstTransactionCompressedBytes).equalToWhenPresent(record::getFirstTransactionCompressedBytes)
                .set(firstTransactionUncompressedBytes).equalToWhenPresent(record::getFirstTransactionUncompressedBytes)
                .set(firstTransactionTimestamp).equalToWhenPresent(record::getFirstTransactionTimestamp)
                .set(lastTransactionCompressedBytes).equalToWhenPresent(record::getLastTransactionCompressedBytes)
                .set(lastTransactionUncompressedBytes).equalToWhenPresent(record::getLastTransactionUncompressedBytes)
                .set(lastTransactionTimestamp).equalToWhenPresent(record::getLastTransactionTimestamp)
                .set(firstTransactionId).equalToWhenPresent(record::getFirstTransactionId)
                .set(lastTransactionId).equalToWhenPresent(record::getLastTransactionId);
    }
}