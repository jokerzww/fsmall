package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SlowLogDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SlowLog;
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
public interface SlowLogMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    BasicColumn[] selectList = BasicColumn.columnList(startTime, queryTime, lockTime, rowsSent, rowsExamined, db, lastInsertId, insertId, serverId, threadId, userHost, sqlText);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source Table: slow_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0257391+08:00", comments="Source Table: slow_log")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SlowLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SlowLogResult")
    Optional<SlowLog> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SlowLogResult", value = {
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="query_time", property="queryTime", jdbcType=JdbcType.TIME),
        @Result(column="lock_time", property="lockTime", jdbcType=JdbcType.TIME),
        @Result(column="rows_sent", property="rowsSent", jdbcType=JdbcType.INTEGER),
        @Result(column="rows_examined", property="rowsExamined", jdbcType=JdbcType.INTEGER),
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_insert_id", property="lastInsertId", jdbcType=JdbcType.INTEGER),
        @Result(column="insert_id", property="insertId", jdbcType=JdbcType.INTEGER),
        @Result(column="server_id", property="serverId", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_host", property="userHost", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="sql_text", property="sqlText", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<SlowLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, slowLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, slowLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default int insert(SlowLog record) {
        return MyBatis3Utils.insert(this::insert, record, slowLog, c ->
            c.map(startTime).toProperty("startTime")
            .map(queryTime).toProperty("queryTime")
            .map(lockTime).toProperty("lockTime")
            .map(rowsSent).toProperty("rowsSent")
            .map(rowsExamined).toProperty("rowsExamined")
            .map(db).toProperty("db")
            .map(lastInsertId).toProperty("lastInsertId")
            .map(insertId).toProperty("insertId")
            .map(serverId).toProperty("serverId")
            .map(threadId).toProperty("threadId")
            .map(userHost).toProperty("userHost")
            .map(sqlText).toProperty("sqlText")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default int insertSelective(SlowLog record) {
        return MyBatis3Utils.insert(this::insert, record, slowLog, c ->
            c.map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(queryTime).toPropertyWhenPresent("queryTime", record::getQueryTime)
            .map(lockTime).toPropertyWhenPresent("lockTime", record::getLockTime)
            .map(rowsSent).toPropertyWhenPresent("rowsSent", record::getRowsSent)
            .map(rowsExamined).toPropertyWhenPresent("rowsExamined", record::getRowsExamined)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(lastInsertId).toPropertyWhenPresent("lastInsertId", record::getLastInsertId)
            .map(insertId).toPropertyWhenPresent("insertId", record::getInsertId)
            .map(serverId).toPropertyWhenPresent("serverId", record::getServerId)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(userHost).toPropertyWhenPresent("userHost", record::getUserHost)
            .map(sqlText).toPropertyWhenPresent("sqlText", record::getSqlText)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default Optional<SlowLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, slowLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default List<SlowLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, slowLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default List<SlowLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, slowLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, slowLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    static UpdateDSL<UpdateModel> updateAllColumns(SlowLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(startTime).equalTo(record::getStartTime)
                .set(queryTime).equalTo(record::getQueryTime)
                .set(lockTime).equalTo(record::getLockTime)
                .set(rowsSent).equalTo(record::getRowsSent)
                .set(rowsExamined).equalTo(record::getRowsExamined)
                .set(db).equalTo(record::getDb)
                .set(lastInsertId).equalTo(record::getLastInsertId)
                .set(insertId).equalTo(record::getInsertId)
                .set(serverId).equalTo(record::getServerId)
                .set(threadId).equalTo(record::getThreadId)
                .set(userHost).equalTo(record::getUserHost)
                .set(sqlText).equalTo(record::getSqlText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0267394+08:00", comments="Source Table: slow_log")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SlowLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(startTime).equalToWhenPresent(record::getStartTime)
                .set(queryTime).equalToWhenPresent(record::getQueryTime)
                .set(lockTime).equalToWhenPresent(record::getLockTime)
                .set(rowsSent).equalToWhenPresent(record::getRowsSent)
                .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
                .set(db).equalToWhenPresent(record::getDb)
                .set(lastInsertId).equalToWhenPresent(record::getLastInsertId)
                .set(insertId).equalToWhenPresent(record::getInsertId)
                .set(serverId).equalToWhenPresent(record::getServerId)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(userHost).equalToWhenPresent(record::getUserHost)
                .set(sqlText).equalToWhenPresent(record::getSqlText);
    }
}