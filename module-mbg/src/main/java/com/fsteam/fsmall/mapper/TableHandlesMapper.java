package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TableHandlesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TableHandles;
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
public interface TableHandlesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, objectType, objectSchema, objectName, ownerThreadId, ownerEventId, internalLock, externalLock);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TableHandles> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TableHandlesResult")
    Optional<TableHandles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TableHandlesResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNER_THREAD_ID", property="ownerThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="OWNER_EVENT_ID", property="ownerEventId", jdbcType=JdbcType.BIGINT),
        @Result(column="INTERNAL_LOCK", property="internalLock", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTERNAL_LOCK", property="externalLock", jdbcType=JdbcType.VARCHAR)
    })
    List<TableHandles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tableHandles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tableHandles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default int insert(TableHandles record) {
        return MyBatis3Utils.insert(this::insert, record, tableHandles, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(ownerThreadId).toProperty("ownerThreadId")
            .map(ownerEventId).toProperty("ownerEventId")
            .map(internalLock).toProperty("internalLock")
            .map(externalLock).toProperty("externalLock")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default int insertSelective(TableHandles record) {
        return MyBatis3Utils.insert(this::insert, record, tableHandles, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(ownerThreadId).toPropertyWhenPresent("ownerThreadId", record::getOwnerThreadId)
            .map(ownerEventId).toPropertyWhenPresent("ownerEventId", record::getOwnerEventId)
            .map(internalLock).toPropertyWhenPresent("internalLock", record::getInternalLock)
            .map(externalLock).toPropertyWhenPresent("externalLock", record::getExternalLock)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default Optional<TableHandles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tableHandles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default List<TableHandles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tableHandles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default List<TableHandles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tableHandles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default Optional<TableHandles> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tableHandles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    static UpdateDSL<UpdateModel> updateAllColumns(TableHandles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(ownerThreadId).equalTo(record::getOwnerThreadId)
                .set(ownerEventId).equalTo(record::getOwnerEventId)
                .set(internalLock).equalTo(record::getInternalLock)
                .set(externalLock).equalTo(record::getExternalLock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: table_handles")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TableHandles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(ownerThreadId).equalToWhenPresent(record::getOwnerThreadId)
                .set(ownerEventId).equalToWhenPresent(record::getOwnerEventId)
                .set(internalLock).equalToWhenPresent(record::getInternalLock)
                .set(externalLock).equalToWhenPresent(record::getExternalLock);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: table_handles")
    default int updateByPrimaryKey(TableHandles record) {
        return update(c ->
            c.set(objectType).equalTo(record::getObjectType)
            .set(objectSchema).equalTo(record::getObjectSchema)
            .set(objectName).equalTo(record::getObjectName)
            .set(ownerThreadId).equalTo(record::getOwnerThreadId)
            .set(ownerEventId).equalTo(record::getOwnerEventId)
            .set(internalLock).equalTo(record::getInternalLock)
            .set(externalLock).equalTo(record::getExternalLock)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: table_handles")
    default int updateByPrimaryKeySelective(TableHandles record) {
        return update(c ->
            c.set(objectType).equalToWhenPresent(record::getObjectType)
            .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
            .set(objectName).equalToWhenPresent(record::getObjectName)
            .set(ownerThreadId).equalToWhenPresent(record::getOwnerThreadId)
            .set(ownerEventId).equalToWhenPresent(record::getOwnerEventId)
            .set(internalLock).equalToWhenPresent(record::getInternalLock)
            .set(externalLock).equalToWhenPresent(record::getExternalLock)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}