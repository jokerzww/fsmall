package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStatementsHistogramGlobalDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.EventsStatementsHistogramGlobal;
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
public interface EventsStatementsHistogramGlobalMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    BasicColumn[] selectList = BasicColumn.columnList(bucketNumber, bucketTimerLow, bucketTimerHigh, countBucket, countBucketAndLower, bucketQuantile);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: events_statements_histogram_global")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStatementsHistogramGlobal> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStatementsHistogramGlobalResult")
    Optional<EventsStatementsHistogramGlobal> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStatementsHistogramGlobalResult", value = {
        @Result(column="BUCKET_NUMBER", property="bucketNumber", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BUCKET_TIMER_LOW", property="bucketTimerLow", jdbcType=JdbcType.BIGINT),
        @Result(column="BUCKET_TIMER_HIGH", property="bucketTimerHigh", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_BUCKET", property="countBucket", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_BUCKET_AND_LOWER", property="countBucketAndLower", jdbcType=JdbcType.BIGINT),
        @Result(column="BUCKET_QUANTILE", property="bucketQuantile", jdbcType=JdbcType.DOUBLE)
    })
    List<EventsStatementsHistogramGlobal> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStatementsHistogramGlobal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStatementsHistogramGlobal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int deleteByPrimaryKey(Integer bucketNumber_) {
        return delete(c -> 
            c.where(bucketNumber, isEqualTo(bucketNumber_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int insert(EventsStatementsHistogramGlobal record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsHistogramGlobal, c ->
            c.map(bucketNumber).toProperty("bucketNumber")
            .map(bucketTimerLow).toProperty("bucketTimerLow")
            .map(bucketTimerHigh).toProperty("bucketTimerHigh")
            .map(countBucket).toProperty("countBucket")
            .map(countBucketAndLower).toProperty("countBucketAndLower")
            .map(bucketQuantile).toProperty("bucketQuantile")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int insertSelective(EventsStatementsHistogramGlobal record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsHistogramGlobal, c ->
            c.map(bucketNumber).toPropertyWhenPresent("bucketNumber", record::getBucketNumber)
            .map(bucketTimerLow).toPropertyWhenPresent("bucketTimerLow", record::getBucketTimerLow)
            .map(bucketTimerHigh).toPropertyWhenPresent("bucketTimerHigh", record::getBucketTimerHigh)
            .map(countBucket).toPropertyWhenPresent("countBucket", record::getCountBucket)
            .map(countBucketAndLower).toPropertyWhenPresent("countBucketAndLower", record::getCountBucketAndLower)
            .map(bucketQuantile).toPropertyWhenPresent("bucketQuantile", record::getBucketQuantile)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default Optional<EventsStatementsHistogramGlobal> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStatementsHistogramGlobal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default List<EventsStatementsHistogramGlobal> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStatementsHistogramGlobal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default List<EventsStatementsHistogramGlobal> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStatementsHistogramGlobal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default Optional<EventsStatementsHistogramGlobal> selectByPrimaryKey(Integer bucketNumber_) {
        return selectOne(c ->
            c.where(bucketNumber, isEqualTo(bucketNumber_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStatementsHistogramGlobal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStatementsHistogramGlobal record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bucketNumber).equalTo(record::getBucketNumber)
                .set(bucketTimerLow).equalTo(record::getBucketTimerLow)
                .set(bucketTimerHigh).equalTo(record::getBucketTimerHigh)
                .set(countBucket).equalTo(record::getCountBucket)
                .set(countBucketAndLower).equalTo(record::getCountBucketAndLower)
                .set(bucketQuantile).equalTo(record::getBucketQuantile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStatementsHistogramGlobal record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bucketNumber).equalToWhenPresent(record::getBucketNumber)
                .set(bucketTimerLow).equalToWhenPresent(record::getBucketTimerLow)
                .set(bucketTimerHigh).equalToWhenPresent(record::getBucketTimerHigh)
                .set(countBucket).equalToWhenPresent(record::getCountBucket)
                .set(countBucketAndLower).equalToWhenPresent(record::getCountBucketAndLower)
                .set(bucketQuantile).equalToWhenPresent(record::getBucketQuantile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int updateByPrimaryKey(EventsStatementsHistogramGlobal record) {
        return update(c ->
            c.set(bucketTimerLow).equalTo(record::getBucketTimerLow)
            .set(bucketTimerHigh).equalTo(record::getBucketTimerHigh)
            .set(countBucket).equalTo(record::getCountBucket)
            .set(countBucketAndLower).equalTo(record::getCountBucketAndLower)
            .set(bucketQuantile).equalTo(record::getBucketQuantile)
            .where(bucketNumber, isEqualTo(record::getBucketNumber))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4531279+08:00", comments="Source Table: events_statements_histogram_global")
    default int updateByPrimaryKeySelective(EventsStatementsHistogramGlobal record) {
        return update(c ->
            c.set(bucketTimerLow).equalToWhenPresent(record::getBucketTimerLow)
            .set(bucketTimerHigh).equalToWhenPresent(record::getBucketTimerHigh)
            .set(countBucket).equalToWhenPresent(record::getCountBucket)
            .set(countBucketAndLower).equalToWhenPresent(record::getCountBucketAndLower)
            .set(bucketQuantile).equalToWhenPresent(record::getBucketQuantile)
            .where(bucketNumber, isEqualTo(record::getBucketNumber))
        );
    }
}