package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStatementsHistogramByDigestDynamicSqlSupport.*;

import com.fsteam.fsmall.model.EventsStatementsHistogramByDigest;
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
public interface EventsStatementsHistogramByDigestMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0147289+08:00", comments="Source Table: events_statements_histogram_by_digest")
    BasicColumn[] selectList = BasicColumn.columnList(schemaName, digest, bucketNumber, bucketTimerLow, bucketTimerHigh, countBucket, countBucketAndLower, bucketQuantile);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0077212+08:00", comments="Source Table: events_statements_histogram_by_digest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0077212+08:00", comments="Source Table: events_statements_histogram_by_digest")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0087228+08:00", comments="Source Table: events_statements_histogram_by_digest")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStatementsHistogramByDigest> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0107245+08:00", comments="Source Table: events_statements_histogram_by_digest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStatementsHistogramByDigestResult")
    Optional<EventsStatementsHistogramByDigest> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0107245+08:00", comments="Source Table: events_statements_histogram_by_digest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStatementsHistogramByDigestResult", value = {
        @Result(column="SCHEMA_NAME", property="schemaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DIGEST", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUCKET_NUMBER", property="bucketNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="BUCKET_TIMER_LOW", property="bucketTimerLow", jdbcType=JdbcType.BIGINT),
        @Result(column="BUCKET_TIMER_HIGH", property="bucketTimerHigh", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_BUCKET", property="countBucket", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_BUCKET_AND_LOWER", property="countBucketAndLower", jdbcType=JdbcType.BIGINT),
        @Result(column="BUCKET_QUANTILE", property="bucketQuantile", jdbcType=JdbcType.DOUBLE)
    })
    List<EventsStatementsHistogramByDigest> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0107245+08:00", comments="Source Table: events_statements_histogram_by_digest")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0117255+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStatementsHistogramByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0117255+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStatementsHistogramByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0117255+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default int insert(EventsStatementsHistogramByDigest record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsHistogramByDigest, c ->
            c.map(schemaName).toProperty("schemaName")
            .map(digest).toProperty("digest")
            .map(bucketNumber).toProperty("bucketNumber")
            .map(bucketTimerLow).toProperty("bucketTimerLow")
            .map(bucketTimerHigh).toProperty("bucketTimerHigh")
            .map(countBucket).toProperty("countBucket")
            .map(countBucketAndLower).toProperty("countBucketAndLower")
            .map(bucketQuantile).toProperty("bucketQuantile")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0137281+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default int insertSelective(EventsStatementsHistogramByDigest record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsHistogramByDigest, c ->
            c.map(schemaName).toPropertyWhenPresent("schemaName", record::getSchemaName)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(bucketNumber).toPropertyWhenPresent("bucketNumber", record::getBucketNumber)
            .map(bucketTimerLow).toPropertyWhenPresent("bucketTimerLow", record::getBucketTimerLow)
            .map(bucketTimerHigh).toPropertyWhenPresent("bucketTimerHigh", record::getBucketTimerHigh)
            .map(countBucket).toPropertyWhenPresent("countBucket", record::getCountBucket)
            .map(countBucketAndLower).toPropertyWhenPresent("countBucketAndLower", record::getCountBucketAndLower)
            .map(bucketQuantile).toPropertyWhenPresent("bucketQuantile", record::getBucketQuantile)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0147289+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default Optional<EventsStatementsHistogramByDigest> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStatementsHistogramByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0157299+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default List<EventsStatementsHistogramByDigest> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStatementsHistogramByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0157299+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default List<EventsStatementsHistogramByDigest> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStatementsHistogramByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0157299+08:00", comments="Source Table: events_statements_histogram_by_digest")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStatementsHistogramByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0167307+08:00", comments="Source Table: events_statements_histogram_by_digest")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStatementsHistogramByDigest record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(schemaName).equalTo(record::getSchemaName)
                .set(digest).equalTo(record::getDigest)
                .set(bucketNumber).equalTo(record::getBucketNumber)
                .set(bucketTimerLow).equalTo(record::getBucketTimerLow)
                .set(bucketTimerHigh).equalTo(record::getBucketTimerHigh)
                .set(countBucket).equalTo(record::getCountBucket)
                .set(countBucketAndLower).equalTo(record::getCountBucketAndLower)
                .set(bucketQuantile).equalTo(record::getBucketQuantile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0167307+08:00", comments="Source Table: events_statements_histogram_by_digest")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStatementsHistogramByDigest record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(schemaName).equalToWhenPresent(record::getSchemaName)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(bucketNumber).equalToWhenPresent(record::getBucketNumber)
                .set(bucketTimerLow).equalToWhenPresent(record::getBucketTimerLow)
                .set(bucketTimerHigh).equalToWhenPresent(record::getBucketTimerHigh)
                .set(countBucket).equalToWhenPresent(record::getCountBucket)
                .set(countBucketAndLower).equalToWhenPresent(record::getCountBucketAndLower)
                .set(bucketQuantile).equalToWhenPresent(record::getBucketQuantile);
    }
}