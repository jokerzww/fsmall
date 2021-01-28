package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ObjectsSummaryGlobalByTypeDynamicSqlSupport.*;

import com.fsteam.fsmall.model.ObjectsSummaryGlobalByType;
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
public interface ObjectsSummaryGlobalByTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    BasicColumn[] selectList = BasicColumn.columnList(objectType, objectSchema, objectName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ObjectsSummaryGlobalByType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ObjectsSummaryGlobalByTypeResult")
    Optional<ObjectsSummaryGlobalByType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ObjectsSummaryGlobalByTypeResult", value = {
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT)
    })
    List<ObjectsSummaryGlobalByType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, objectsSummaryGlobalByType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, objectsSummaryGlobalByType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default int insert(ObjectsSummaryGlobalByType record) {
        return MyBatis3Utils.insert(this::insert, record, objectsSummaryGlobalByType, c ->
            c.map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default int insertSelective(ObjectsSummaryGlobalByType record) {
        return MyBatis3Utils.insert(this::insert, record, objectsSummaryGlobalByType, c ->
            c.map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default Optional<ObjectsSummaryGlobalByType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, objectsSummaryGlobalByType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default List<ObjectsSummaryGlobalByType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, objectsSummaryGlobalByType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default List<ObjectsSummaryGlobalByType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, objectsSummaryGlobalByType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, objectsSummaryGlobalByType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    static UpdateDSL<UpdateModel> updateAllColumns(ObjectsSummaryGlobalByType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source Table: objects_summary_global_by_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ObjectsSummaryGlobalByType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait);
    }
}