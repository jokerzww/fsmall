package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.GtidExecutedDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.GtidExecuted;
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
public interface GtidExecutedMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    BasicColumn[] selectList = BasicColumn.columnList(sourceUuid, intervalStart, intervalEnd);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GtidExecuted> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GtidExecutedResult")
    Optional<GtidExecuted> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GtidExecutedResult", value = {
        @Result(column="source_uuid", property="sourceUuid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="interval_start", property="intervalStart", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="interval_end", property="intervalEnd", jdbcType=JdbcType.BIGINT)
    })
    List<GtidExecuted> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, gtidExecuted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, gtidExecuted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int deleteByPrimaryKey(String sourceUuid_, Long intervalStart_) {
        return delete(c -> 
            c.where(sourceUuid, isEqualTo(sourceUuid_))
            .and(intervalStart, isEqualTo(intervalStart_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int insert(GtidExecuted record) {
        return MyBatis3Utils.insert(this::insert, record, gtidExecuted, c ->
            c.map(sourceUuid).toProperty("sourceUuid")
            .map(intervalStart).toProperty("intervalStart")
            .map(intervalEnd).toProperty("intervalEnd")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int insertSelective(GtidExecuted record) {
        return MyBatis3Utils.insert(this::insert, record, gtidExecuted, c ->
            c.map(sourceUuid).toPropertyWhenPresent("sourceUuid", record::getSourceUuid)
            .map(intervalStart).toPropertyWhenPresent("intervalStart", record::getIntervalStart)
            .map(intervalEnd).toPropertyWhenPresent("intervalEnd", record::getIntervalEnd)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default Optional<GtidExecuted> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, gtidExecuted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default List<GtidExecuted> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, gtidExecuted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default List<GtidExecuted> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, gtidExecuted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default Optional<GtidExecuted> selectByPrimaryKey(String sourceUuid_, Long intervalStart_) {
        return selectOne(c ->
            c.where(sourceUuid, isEqualTo(sourceUuid_))
            .and(intervalStart, isEqualTo(intervalStart_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, gtidExecuted, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    static UpdateDSL<UpdateModel> updateAllColumns(GtidExecuted record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sourceUuid).equalTo(record::getSourceUuid)
                .set(intervalStart).equalTo(record::getIntervalStart)
                .set(intervalEnd).equalTo(record::getIntervalEnd);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GtidExecuted record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sourceUuid).equalToWhenPresent(record::getSourceUuid)
                .set(intervalStart).equalToWhenPresent(record::getIntervalStart)
                .set(intervalEnd).equalToWhenPresent(record::getIntervalEnd);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int updateByPrimaryKey(GtidExecuted record) {
        return update(c ->
            c.set(intervalEnd).equalTo(record::getIntervalEnd)
            .where(sourceUuid, isEqualTo(record::getSourceUuid))
            .and(intervalStart, isEqualTo(record::getIntervalStart))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    default int updateByPrimaryKeySelective(GtidExecuted record) {
        return update(c ->
            c.set(intervalEnd).equalToWhenPresent(record::getIntervalEnd)
            .where(sourceUuid, isEqualTo(record::getSourceUuid))
            .and(intervalStart, isEqualTo(record::getIntervalStart))
        );
    }
}