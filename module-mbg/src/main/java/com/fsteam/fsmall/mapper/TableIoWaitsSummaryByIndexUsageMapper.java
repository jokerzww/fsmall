package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TableIoWaitsSummaryByIndexUsageDynamicSqlSupport.*;

import com.fsteam.fsmall.model.TableIoWaitsSummaryByIndexUsage;
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
public interface TableIoWaitsSummaryByIndexUsageMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    BasicColumn[] selectList = BasicColumn.columnList(objectType, objectSchema, objectName, indexName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait, countRead, sumTimerRead, minTimerRead, avgTimerRead, maxTimerRead, countWrite, sumTimerWrite, minTimerWrite, avgTimerWrite, maxTimerWrite, countFetch, sumTimerFetch, minTimerFetch, avgTimerFetch, maxTimerFetch, countInsert, sumTimerInsert, minTimerInsert, avgTimerInsert, maxTimerInsert, countUpdate, sumTimerUpdate, minTimerUpdate, avgTimerUpdate, maxTimerUpdate, countDelete, sumTimerDelete, minTimerDelete, avgTimerDelete, maxTimerDelete);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TableIoWaitsSummaryByIndexUsage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TableIoWaitsSummaryByIndexUsageResult")
    Optional<TableIoWaitsSummaryByIndexUsage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TableIoWaitsSummaryByIndexUsageResult", value = {
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ", property="countRead", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ", property="sumTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ", property="minTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ", property="avgTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ", property="maxTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE", property="countWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE", property="sumTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE", property="minTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE", property="avgTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE", property="maxTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_FETCH", property="countFetch", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_FETCH", property="sumTimerFetch", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_FETCH", property="minTimerFetch", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_FETCH", property="avgTimerFetch", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_FETCH", property="maxTimerFetch", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_INSERT", property="countInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_INSERT", property="sumTimerInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_INSERT", property="minTimerInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_INSERT", property="avgTimerInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_INSERT", property="maxTimerInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_UPDATE", property="countUpdate", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_UPDATE", property="sumTimerUpdate", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_UPDATE", property="minTimerUpdate", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_UPDATE", property="avgTimerUpdate", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_UPDATE", property="maxTimerUpdate", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_DELETE", property="countDelete", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_DELETE", property="sumTimerDelete", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_DELETE", property="minTimerDelete", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_DELETE", property="avgTimerDelete", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_DELETE", property="maxTimerDelete", jdbcType=JdbcType.BIGINT)
    })
    List<TableIoWaitsSummaryByIndexUsage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tableIoWaitsSummaryByIndexUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tableIoWaitsSummaryByIndexUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default int insert(TableIoWaitsSummaryByIndexUsage record) {
        return MyBatis3Utils.insert(this::insert, record, tableIoWaitsSummaryByIndexUsage, c ->
            c.map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(indexName).toProperty("indexName")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
            .map(countRead).toProperty("countRead")
            .map(sumTimerRead).toProperty("sumTimerRead")
            .map(minTimerRead).toProperty("minTimerRead")
            .map(avgTimerRead).toProperty("avgTimerRead")
            .map(maxTimerRead).toProperty("maxTimerRead")
            .map(countWrite).toProperty("countWrite")
            .map(sumTimerWrite).toProperty("sumTimerWrite")
            .map(minTimerWrite).toProperty("minTimerWrite")
            .map(avgTimerWrite).toProperty("avgTimerWrite")
            .map(maxTimerWrite).toProperty("maxTimerWrite")
            .map(countFetch).toProperty("countFetch")
            .map(sumTimerFetch).toProperty("sumTimerFetch")
            .map(minTimerFetch).toProperty("minTimerFetch")
            .map(avgTimerFetch).toProperty("avgTimerFetch")
            .map(maxTimerFetch).toProperty("maxTimerFetch")
            .map(countInsert).toProperty("countInsert")
            .map(sumTimerInsert).toProperty("sumTimerInsert")
            .map(minTimerInsert).toProperty("minTimerInsert")
            .map(avgTimerInsert).toProperty("avgTimerInsert")
            .map(maxTimerInsert).toProperty("maxTimerInsert")
            .map(countUpdate).toProperty("countUpdate")
            .map(sumTimerUpdate).toProperty("sumTimerUpdate")
            .map(minTimerUpdate).toProperty("minTimerUpdate")
            .map(avgTimerUpdate).toProperty("avgTimerUpdate")
            .map(maxTimerUpdate).toProperty("maxTimerUpdate")
            .map(countDelete).toProperty("countDelete")
            .map(sumTimerDelete).toProperty("sumTimerDelete")
            .map(minTimerDelete).toProperty("minTimerDelete")
            .map(avgTimerDelete).toProperty("avgTimerDelete")
            .map(maxTimerDelete).toProperty("maxTimerDelete")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4120909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default int insertSelective(TableIoWaitsSummaryByIndexUsage record) {
        return MyBatis3Utils.insert(this::insert, record, tableIoWaitsSummaryByIndexUsage, c ->
            c.map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(sumTimerRead).toPropertyWhenPresent("sumTimerRead", record::getSumTimerRead)
            .map(minTimerRead).toPropertyWhenPresent("minTimerRead", record::getMinTimerRead)
            .map(avgTimerRead).toPropertyWhenPresent("avgTimerRead", record::getAvgTimerRead)
            .map(maxTimerRead).toPropertyWhenPresent("maxTimerRead", record::getMaxTimerRead)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(sumTimerWrite).toPropertyWhenPresent("sumTimerWrite", record::getSumTimerWrite)
            .map(minTimerWrite).toPropertyWhenPresent("minTimerWrite", record::getMinTimerWrite)
            .map(avgTimerWrite).toPropertyWhenPresent("avgTimerWrite", record::getAvgTimerWrite)
            .map(maxTimerWrite).toPropertyWhenPresent("maxTimerWrite", record::getMaxTimerWrite)
            .map(countFetch).toPropertyWhenPresent("countFetch", record::getCountFetch)
            .map(sumTimerFetch).toPropertyWhenPresent("sumTimerFetch", record::getSumTimerFetch)
            .map(minTimerFetch).toPropertyWhenPresent("minTimerFetch", record::getMinTimerFetch)
            .map(avgTimerFetch).toPropertyWhenPresent("avgTimerFetch", record::getAvgTimerFetch)
            .map(maxTimerFetch).toPropertyWhenPresent("maxTimerFetch", record::getMaxTimerFetch)
            .map(countInsert).toPropertyWhenPresent("countInsert", record::getCountInsert)
            .map(sumTimerInsert).toPropertyWhenPresent("sumTimerInsert", record::getSumTimerInsert)
            .map(minTimerInsert).toPropertyWhenPresent("minTimerInsert", record::getMinTimerInsert)
            .map(avgTimerInsert).toPropertyWhenPresent("avgTimerInsert", record::getAvgTimerInsert)
            .map(maxTimerInsert).toPropertyWhenPresent("maxTimerInsert", record::getMaxTimerInsert)
            .map(countUpdate).toPropertyWhenPresent("countUpdate", record::getCountUpdate)
            .map(sumTimerUpdate).toPropertyWhenPresent("sumTimerUpdate", record::getSumTimerUpdate)
            .map(minTimerUpdate).toPropertyWhenPresent("minTimerUpdate", record::getMinTimerUpdate)
            .map(avgTimerUpdate).toPropertyWhenPresent("avgTimerUpdate", record::getAvgTimerUpdate)
            .map(maxTimerUpdate).toPropertyWhenPresent("maxTimerUpdate", record::getMaxTimerUpdate)
            .map(countDelete).toPropertyWhenPresent("countDelete", record::getCountDelete)
            .map(sumTimerDelete).toPropertyWhenPresent("sumTimerDelete", record::getSumTimerDelete)
            .map(minTimerDelete).toPropertyWhenPresent("minTimerDelete", record::getMinTimerDelete)
            .map(avgTimerDelete).toPropertyWhenPresent("avgTimerDelete", record::getAvgTimerDelete)
            .map(maxTimerDelete).toPropertyWhenPresent("maxTimerDelete", record::getMaxTimerDelete)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default Optional<TableIoWaitsSummaryByIndexUsage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tableIoWaitsSummaryByIndexUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default List<TableIoWaitsSummaryByIndexUsage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tableIoWaitsSummaryByIndexUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default List<TableIoWaitsSummaryByIndexUsage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tableIoWaitsSummaryByIndexUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tableIoWaitsSummaryByIndexUsage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    static UpdateDSL<UpdateModel> updateAllColumns(TableIoWaitsSummaryByIndexUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(indexName).equalTo(record::getIndexName)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait)
                .set(countRead).equalTo(record::getCountRead)
                .set(sumTimerRead).equalTo(record::getSumTimerRead)
                .set(minTimerRead).equalTo(record::getMinTimerRead)
                .set(avgTimerRead).equalTo(record::getAvgTimerRead)
                .set(maxTimerRead).equalTo(record::getMaxTimerRead)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(sumTimerWrite).equalTo(record::getSumTimerWrite)
                .set(minTimerWrite).equalTo(record::getMinTimerWrite)
                .set(avgTimerWrite).equalTo(record::getAvgTimerWrite)
                .set(maxTimerWrite).equalTo(record::getMaxTimerWrite)
                .set(countFetch).equalTo(record::getCountFetch)
                .set(sumTimerFetch).equalTo(record::getSumTimerFetch)
                .set(minTimerFetch).equalTo(record::getMinTimerFetch)
                .set(avgTimerFetch).equalTo(record::getAvgTimerFetch)
                .set(maxTimerFetch).equalTo(record::getMaxTimerFetch)
                .set(countInsert).equalTo(record::getCountInsert)
                .set(sumTimerInsert).equalTo(record::getSumTimerInsert)
                .set(minTimerInsert).equalTo(record::getMinTimerInsert)
                .set(avgTimerInsert).equalTo(record::getAvgTimerInsert)
                .set(maxTimerInsert).equalTo(record::getMaxTimerInsert)
                .set(countUpdate).equalTo(record::getCountUpdate)
                .set(sumTimerUpdate).equalTo(record::getSumTimerUpdate)
                .set(minTimerUpdate).equalTo(record::getMinTimerUpdate)
                .set(avgTimerUpdate).equalTo(record::getAvgTimerUpdate)
                .set(maxTimerUpdate).equalTo(record::getMaxTimerUpdate)
                .set(countDelete).equalTo(record::getCountDelete)
                .set(sumTimerDelete).equalTo(record::getSumTimerDelete)
                .set(minTimerDelete).equalTo(record::getMinTimerDelete)
                .set(avgTimerDelete).equalTo(record::getAvgTimerDelete)
                .set(maxTimerDelete).equalTo(record::getMaxTimerDelete);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4130909+08:00", comments="Source Table: table_io_waits_summary_by_index_usage")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TableIoWaitsSummaryByIndexUsage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(sumTimerRead).equalToWhenPresent(record::getSumTimerRead)
                .set(minTimerRead).equalToWhenPresent(record::getMinTimerRead)
                .set(avgTimerRead).equalToWhenPresent(record::getAvgTimerRead)
                .set(maxTimerRead).equalToWhenPresent(record::getMaxTimerRead)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(sumTimerWrite).equalToWhenPresent(record::getSumTimerWrite)
                .set(minTimerWrite).equalToWhenPresent(record::getMinTimerWrite)
                .set(avgTimerWrite).equalToWhenPresent(record::getAvgTimerWrite)
                .set(maxTimerWrite).equalToWhenPresent(record::getMaxTimerWrite)
                .set(countFetch).equalToWhenPresent(record::getCountFetch)
                .set(sumTimerFetch).equalToWhenPresent(record::getSumTimerFetch)
                .set(minTimerFetch).equalToWhenPresent(record::getMinTimerFetch)
                .set(avgTimerFetch).equalToWhenPresent(record::getAvgTimerFetch)
                .set(maxTimerFetch).equalToWhenPresent(record::getMaxTimerFetch)
                .set(countInsert).equalToWhenPresent(record::getCountInsert)
                .set(sumTimerInsert).equalToWhenPresent(record::getSumTimerInsert)
                .set(minTimerInsert).equalToWhenPresent(record::getMinTimerInsert)
                .set(avgTimerInsert).equalToWhenPresent(record::getAvgTimerInsert)
                .set(maxTimerInsert).equalToWhenPresent(record::getMaxTimerInsert)
                .set(countUpdate).equalToWhenPresent(record::getCountUpdate)
                .set(sumTimerUpdate).equalToWhenPresent(record::getSumTimerUpdate)
                .set(minTimerUpdate).equalToWhenPresent(record::getMinTimerUpdate)
                .set(avgTimerUpdate).equalToWhenPresent(record::getAvgTimerUpdate)
                .set(maxTimerUpdate).equalToWhenPresent(record::getMaxTimerUpdate)
                .set(countDelete).equalToWhenPresent(record::getCountDelete)
                .set(sumTimerDelete).equalToWhenPresent(record::getSumTimerDelete)
                .set(minTimerDelete).equalToWhenPresent(record::getMinTimerDelete)
                .set(avgTimerDelete).equalToWhenPresent(record::getAvgTimerDelete)
                .set(maxTimerDelete).equalToWhenPresent(record::getMaxTimerDelete);
    }
}