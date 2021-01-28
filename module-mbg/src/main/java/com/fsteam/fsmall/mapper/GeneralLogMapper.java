package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.GeneralLogDynamicSqlSupport.*;

import com.fsteam.fsmall.model.GeneralLog;
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
public interface GeneralLogMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    BasicColumn[] selectList = BasicColumn.columnList(eventTime, threadId, serverId, commandType, userHost, argument);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GeneralLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GeneralLogResult")
    Optional<GeneralLog> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GeneralLogResult", value = {
        @Result(column="event_time", property="eventTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="server_id", property="serverId", jdbcType=JdbcType.INTEGER),
        @Result(column="command_type", property="commandType", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_host", property="userHost", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="argument", property="argument", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<GeneralLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, generalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, generalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default int insert(GeneralLog record) {
        return MyBatis3Utils.insert(this::insert, record, generalLog, c ->
            c.map(eventTime).toProperty("eventTime")
            .map(threadId).toProperty("threadId")
            .map(serverId).toProperty("serverId")
            .map(commandType).toProperty("commandType")
            .map(userHost).toProperty("userHost")
            .map(argument).toProperty("argument")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default int insertSelective(GeneralLog record) {
        return MyBatis3Utils.insert(this::insert, record, generalLog, c ->
            c.map(eventTime).toPropertyWhenPresent("eventTime", record::getEventTime)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(serverId).toPropertyWhenPresent("serverId", record::getServerId)
            .map(commandType).toPropertyWhenPresent("commandType", record::getCommandType)
            .map(userHost).toPropertyWhenPresent("userHost", record::getUserHost)
            .map(argument).toPropertyWhenPresent("argument", record::getArgument)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default Optional<GeneralLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, generalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default List<GeneralLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, generalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default List<GeneralLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, generalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, generalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    static UpdateDSL<UpdateModel> updateAllColumns(GeneralLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventTime).equalTo(record::getEventTime)
                .set(threadId).equalTo(record::getThreadId)
                .set(serverId).equalTo(record::getServerId)
                .set(commandType).equalTo(record::getCommandType)
                .set(userHost).equalTo(record::getUserHost)
                .set(argument).equalTo(record::getArgument);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1878885+08:00", comments="Source Table: general_log")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GeneralLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventTime).equalToWhenPresent(record::getEventTime)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(serverId).equalToWhenPresent(record::getServerId)
                .set(commandType).equalToWhenPresent(record::getCommandType)
                .set(userHost).equalToWhenPresent(record::getUserHost)
                .set(argument).equalToWhenPresent(record::getArgument);
    }
}