package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SocketInstancesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SocketInstances;
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
public interface SocketInstancesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    BasicColumn[] selectList = BasicColumn.columnList(objectInstanceBegin, eventName, threadId, socketId, ip, port, state);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SocketInstances> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SocketInstancesResult")
    Optional<SocketInstances> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SocketInstancesResult", value = {
        @Result(column="OBJECT_INSTANCE_BEGIN", property="objectInstanceBegin", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="SOCKET_ID", property="socketId", jdbcType=JdbcType.INTEGER),
        @Result(column="IP", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="PORT", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.CHAR)
    })
    List<SocketInstances> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, socketInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, socketInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int deleteByPrimaryKey(Long objectInstanceBegin_) {
        return delete(c -> 
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int insert(SocketInstances record) {
        return MyBatis3Utils.insert(this::insert, record, socketInstances, c ->
            c.map(objectInstanceBegin).toProperty("objectInstanceBegin")
            .map(eventName).toProperty("eventName")
            .map(threadId).toProperty("threadId")
            .map(socketId).toProperty("socketId")
            .map(ip).toProperty("ip")
            .map(port).toProperty("port")
            .map(state).toProperty("state")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int insertSelective(SocketInstances record) {
        return MyBatis3Utils.insert(this::insert, record, socketInstances, c ->
            c.map(objectInstanceBegin).toPropertyWhenPresent("objectInstanceBegin", record::getObjectInstanceBegin)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(socketId).toPropertyWhenPresent("socketId", record::getSocketId)
            .map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(port).toPropertyWhenPresent("port", record::getPort)
            .map(state).toPropertyWhenPresent("state", record::getState)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default Optional<SocketInstances> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, socketInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default List<SocketInstances> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, socketInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default List<SocketInstances> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, socketInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default Optional<SocketInstances> selectByPrimaryKey(Long objectInstanceBegin_) {
        return selectOne(c ->
            c.where(objectInstanceBegin, isEqualTo(objectInstanceBegin_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, socketInstances, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    static UpdateDSL<UpdateModel> updateAllColumns(SocketInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalTo(record::getObjectInstanceBegin)
                .set(eventName).equalTo(record::getEventName)
                .set(threadId).equalTo(record::getThreadId)
                .set(socketId).equalTo(record::getSocketId)
                .set(ip).equalTo(record::getIp)
                .set(port).equalTo(record::getPort)
                .set(state).equalTo(record::getState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SocketInstances record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectInstanceBegin).equalToWhenPresent(record::getObjectInstanceBegin)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(socketId).equalToWhenPresent(record::getSocketId)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(port).equalToWhenPresent(record::getPort)
                .set(state).equalToWhenPresent(record::getState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int updateByPrimaryKey(SocketInstances record) {
        return update(c ->
            c.set(eventName).equalTo(record::getEventName)
            .set(threadId).equalTo(record::getThreadId)
            .set(socketId).equalTo(record::getSocketId)
            .set(ip).equalTo(record::getIp)
            .set(port).equalTo(record::getPort)
            .set(state).equalTo(record::getState)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    default int updateByPrimaryKeySelective(SocketInstances record) {
        return update(c ->
            c.set(eventName).equalToWhenPresent(record::getEventName)
            .set(threadId).equalToWhenPresent(record::getThreadId)
            .set(socketId).equalToWhenPresent(record::getSocketId)
            .set(ip).equalToWhenPresent(record::getIp)
            .set(port).equalToWhenPresent(record::getPort)
            .set(state).equalToWhenPresent(record::getState)
            .where(objectInstanceBegin, isEqualTo(record::getObjectInstanceBegin))
        );
    }
}