package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ThreadsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Threads;
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
public interface ThreadsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, name, type, processlistId, processlistUser, processlistHost, processlistDb, processlistCommand, processlistTime, processlistState, parentThreadId, role, instrumented, history, connectionType, threadOsId, resourceGroup, processlistInfo);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Threads> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ThreadsResult")
    Optional<Threads> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ThreadsResult", value = {
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROCESSLIST_ID", property="processlistId", jdbcType=JdbcType.BIGINT),
        @Result(column="PROCESSLIST_USER", property="processlistUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROCESSLIST_HOST", property="processlistHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROCESSLIST_DB", property="processlistDb", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROCESSLIST_COMMAND", property="processlistCommand", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROCESSLIST_TIME", property="processlistTime", jdbcType=JdbcType.BIGINT),
        @Result(column="PROCESSLIST_STATE", property="processlistState", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_THREAD_ID", property="parentThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="ROLE", property="role", jdbcType=JdbcType.VARCHAR),
        @Result(column="INSTRUMENTED", property="instrumented", jdbcType=JdbcType.CHAR),
        @Result(column="HISTORY", property="history", jdbcType=JdbcType.CHAR),
        @Result(column="CONNECTION_TYPE", property="connectionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="THREAD_OS_ID", property="threadOsId", jdbcType=JdbcType.BIGINT),
        @Result(column="RESOURCE_GROUP", property="resourceGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROCESSLIST_INFO", property="processlistInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Threads> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, threads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, threads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    default int deleteByPrimaryKey(Long threadId_) {
        return delete(c -> 
            c.where(threadId, isEqualTo(threadId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    default int insert(Threads record) {
        return MyBatis3Utils.insert(this::insert, record, threads, c ->
            c.map(threadId).toProperty("threadId")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(processlistId).toProperty("processlistId")
            .map(processlistUser).toProperty("processlistUser")
            .map(processlistHost).toProperty("processlistHost")
            .map(processlistDb).toProperty("processlistDb")
            .map(processlistCommand).toProperty("processlistCommand")
            .map(processlistTime).toProperty("processlistTime")
            .map(processlistState).toProperty("processlistState")
            .map(parentThreadId).toProperty("parentThreadId")
            .map(role).toProperty("role")
            .map(instrumented).toProperty("instrumented")
            .map(history).toProperty("history")
            .map(connectionType).toProperty("connectionType")
            .map(threadOsId).toProperty("threadOsId")
            .map(resourceGroup).toProperty("resourceGroup")
            .map(processlistInfo).toProperty("processlistInfo")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0907977+08:00", comments="Source Table: threads")
    default int insertSelective(Threads record) {
        return MyBatis3Utils.insert(this::insert, record, threads, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(processlistId).toPropertyWhenPresent("processlistId", record::getProcesslistId)
            .map(processlistUser).toPropertyWhenPresent("processlistUser", record::getProcesslistUser)
            .map(processlistHost).toPropertyWhenPresent("processlistHost", record::getProcesslistHost)
            .map(processlistDb).toPropertyWhenPresent("processlistDb", record::getProcesslistDb)
            .map(processlistCommand).toPropertyWhenPresent("processlistCommand", record::getProcesslistCommand)
            .map(processlistTime).toPropertyWhenPresent("processlistTime", record::getProcesslistTime)
            .map(processlistState).toPropertyWhenPresent("processlistState", record::getProcesslistState)
            .map(parentThreadId).toPropertyWhenPresent("parentThreadId", record::getParentThreadId)
            .map(role).toPropertyWhenPresent("role", record::getRole)
            .map(instrumented).toPropertyWhenPresent("instrumented", record::getInstrumented)
            .map(history).toPropertyWhenPresent("history", record::getHistory)
            .map(connectionType).toPropertyWhenPresent("connectionType", record::getConnectionType)
            .map(threadOsId).toPropertyWhenPresent("threadOsId", record::getThreadOsId)
            .map(resourceGroup).toPropertyWhenPresent("resourceGroup", record::getResourceGroup)
            .map(processlistInfo).toPropertyWhenPresent("processlistInfo", record::getProcesslistInfo)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default Optional<Threads> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, threads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default List<Threads> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, threads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default List<Threads> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, threads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default Optional<Threads> selectByPrimaryKey(Long threadId_) {
        return selectOne(c ->
            c.where(threadId, isEqualTo(threadId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, threads, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    static UpdateDSL<UpdateModel> updateAllColumns(Threads record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(name).equalTo(record::getName)
                .set(type).equalTo(record::getType)
                .set(processlistId).equalTo(record::getProcesslistId)
                .set(processlistUser).equalTo(record::getProcesslistUser)
                .set(processlistHost).equalTo(record::getProcesslistHost)
                .set(processlistDb).equalTo(record::getProcesslistDb)
                .set(processlistCommand).equalTo(record::getProcesslistCommand)
                .set(processlistTime).equalTo(record::getProcesslistTime)
                .set(processlistState).equalTo(record::getProcesslistState)
                .set(parentThreadId).equalTo(record::getParentThreadId)
                .set(role).equalTo(record::getRole)
                .set(instrumented).equalTo(record::getInstrumented)
                .set(history).equalTo(record::getHistory)
                .set(connectionType).equalTo(record::getConnectionType)
                .set(threadOsId).equalTo(record::getThreadOsId)
                .set(resourceGroup).equalTo(record::getResourceGroup)
                .set(processlistInfo).equalTo(record::getProcesslistInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Threads record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(name).equalToWhenPresent(record::getName)
                .set(type).equalToWhenPresent(record::getType)
                .set(processlistId).equalToWhenPresent(record::getProcesslistId)
                .set(processlistUser).equalToWhenPresent(record::getProcesslistUser)
                .set(processlistHost).equalToWhenPresent(record::getProcesslistHost)
                .set(processlistDb).equalToWhenPresent(record::getProcesslistDb)
                .set(processlistCommand).equalToWhenPresent(record::getProcesslistCommand)
                .set(processlistTime).equalToWhenPresent(record::getProcesslistTime)
                .set(processlistState).equalToWhenPresent(record::getProcesslistState)
                .set(parentThreadId).equalToWhenPresent(record::getParentThreadId)
                .set(role).equalToWhenPresent(record::getRole)
                .set(instrumented).equalToWhenPresent(record::getInstrumented)
                .set(history).equalToWhenPresent(record::getHistory)
                .set(connectionType).equalToWhenPresent(record::getConnectionType)
                .set(threadOsId).equalToWhenPresent(record::getThreadOsId)
                .set(resourceGroup).equalToWhenPresent(record::getResourceGroup)
                .set(processlistInfo).equalToWhenPresent(record::getProcesslistInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default int updateByPrimaryKey(Threads record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(type).equalTo(record::getType)
            .set(processlistId).equalTo(record::getProcesslistId)
            .set(processlistUser).equalTo(record::getProcesslistUser)
            .set(processlistHost).equalTo(record::getProcesslistHost)
            .set(processlistDb).equalTo(record::getProcesslistDb)
            .set(processlistCommand).equalTo(record::getProcesslistCommand)
            .set(processlistTime).equalTo(record::getProcesslistTime)
            .set(processlistState).equalTo(record::getProcesslistState)
            .set(parentThreadId).equalTo(record::getParentThreadId)
            .set(role).equalTo(record::getRole)
            .set(instrumented).equalTo(record::getInstrumented)
            .set(history).equalTo(record::getHistory)
            .set(connectionType).equalTo(record::getConnectionType)
            .set(threadOsId).equalTo(record::getThreadOsId)
            .set(resourceGroup).equalTo(record::getResourceGroup)
            .set(processlistInfo).equalTo(record::getProcesslistInfo)
            .where(threadId, isEqualTo(record::getThreadId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.091799+08:00", comments="Source Table: threads")
    default int updateByPrimaryKeySelective(Threads record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(type).equalToWhenPresent(record::getType)
            .set(processlistId).equalToWhenPresent(record::getProcesslistId)
            .set(processlistUser).equalToWhenPresent(record::getProcesslistUser)
            .set(processlistHost).equalToWhenPresent(record::getProcesslistHost)
            .set(processlistDb).equalToWhenPresent(record::getProcesslistDb)
            .set(processlistCommand).equalToWhenPresent(record::getProcesslistCommand)
            .set(processlistTime).equalToWhenPresent(record::getProcesslistTime)
            .set(processlistState).equalToWhenPresent(record::getProcesslistState)
            .set(parentThreadId).equalToWhenPresent(record::getParentThreadId)
            .set(role).equalToWhenPresent(record::getRole)
            .set(instrumented).equalToWhenPresent(record::getInstrumented)
            .set(history).equalToWhenPresent(record::getHistory)
            .set(connectionType).equalToWhenPresent(record::getConnectionType)
            .set(threadOsId).equalToWhenPresent(record::getThreadOsId)
            .set(resourceGroup).equalToWhenPresent(record::getResourceGroup)
            .set(processlistInfo).equalToWhenPresent(record::getProcesslistInfo)
            .where(threadId, isEqualTo(record::getThreadId))
        );
    }
}