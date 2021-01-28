package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.FileInstancesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.FileInstances;
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
public interface FileInstancesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    BasicColumn[] selectList = BasicColumn.columnList(fileName, eventName, openCount);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<FileInstances> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FileInstancesResult")
    Optional<FileInstances> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FileInstancesResult", value = {
        @Result(column="FILE_NAME", property="fileName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OPEN_COUNT", property="openCount", jdbcType=JdbcType.INTEGER)
    })
    List<FileInstances> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, fileInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, fileInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int deleteByPrimaryKey(String fileName_) {
        return delete(c -> 
            c.where(fileName, isEqualTo(fileName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int insert(FileInstances record) {
        return MyBatis3Utils.insert(this::insert, record, fileInstances, c ->
            c.map(fileName).toProperty("fileName")
            .map(eventName).toProperty("eventName")
            .map(openCount).toProperty("openCount")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int insertSelective(FileInstances record) {
        return MyBatis3Utils.insert(this::insert, record, fileInstances, c ->
            c.map(fileName).toPropertyWhenPresent("fileName", record::getFileName)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(openCount).toPropertyWhenPresent("openCount", record::getOpenCount)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default Optional<FileInstances> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, fileInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default List<FileInstances> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, fileInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default List<FileInstances> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, fileInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default Optional<FileInstances> selectByPrimaryKey(String fileName_) {
        return selectOne(c ->
            c.where(fileName, isEqualTo(fileName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, fileInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    static UpdateDSL<UpdateModel> updateAllColumns(FileInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileName).equalTo(record::getFileName)
                .set(eventName).equalTo(record::getEventName)
                .set(openCount).equalTo(record::getOpenCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(FileInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileName).equalToWhenPresent(record::getFileName)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(openCount).equalToWhenPresent(record::getOpenCount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int updateByPrimaryKey(FileInstances record) {
        return update(c ->
            c.set(eventName).equalTo(record::getEventName)
            .set(openCount).equalTo(record::getOpenCount)
            .where(fileName, isEqualTo(record::getFileName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source Table: file_instances")
    default int updateByPrimaryKeySelective(FileInstances record) {
        return update(c ->
            c.set(eventName).equalToWhenPresent(record::getEventName)
            .set(openCount).equalToWhenPresent(record::getOpenCount)
            .where(fileName, isEqualTo(record::getFileName))
        );
    }
}