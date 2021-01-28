package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XSessionDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XSession;
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
public interface XSessionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    BasicColumn[] selectList = BasicColumn.columnList(thdId, connId, user, db, command, state, time, statementLatency, progress, lockLatency, rowsExamined, rowsSent, rowsAffected, tmpTables, tmpDiskTables, fullScan, lastStatementLatency, currentMemory, lastWait, lastWaitLatency, source, trxLatency, trxState, trxAutocommit, pid, programName, currentStatement, lastStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XSession> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XSessionResult")
    Optional<XSession> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XSessionResult", value = {
        @Result(column="thd_id", property="thdId", jdbcType=JdbcType.BIGINT),
        @Result(column="conn_id", property="connId", jdbcType=JdbcType.BIGINT),
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="command", property="command", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.BIGINT),
        @Result(column="statement_latency", property="statementLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="progress", property="progress", jdbcType=JdbcType.DECIMAL),
        @Result(column="lock_latency", property="lockLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_examined", property="rowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_sent", property="rowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_affected", property="rowsAffected", jdbcType=JdbcType.BIGINT),
        @Result(column="tmp_tables", property="tmpTables", jdbcType=JdbcType.BIGINT),
        @Result(column="tmp_disk_tables", property="tmpDiskTables", jdbcType=JdbcType.BIGINT),
        @Result(column="full_scan", property="fullScan", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_statement_latency", property="lastStatementLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="current_memory", property="currentMemory", jdbcType=JdbcType.DECIMAL),
        @Result(column="last_wait", property="lastWait", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_wait_latency", property="lastWaitLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_latency", property="trxLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_state", property="trxState", jdbcType=JdbcType.CHAR),
        @Result(column="trx_autocommit", property="trxAutocommit", jdbcType=JdbcType.CHAR),
        @Result(column="pid", property="pid", jdbcType=JdbcType.VARCHAR),
        @Result(column="program_name", property="programName", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_statement", property="currentStatement", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="last_statement", property="lastStatement", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<XSession> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XSession, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XSession, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    default int insert(XSession record) {
        return MyBatis3Utils.insert(this::insert, record, XSession, c ->
            c.map(thdId).toProperty("thdId")
            .map(connId).toProperty("connId")
            .map(user).toProperty("user")
            .map(db).toProperty("db")
            .map(command).toProperty("command")
            .map(state).toProperty("state")
            .map(time).toProperty("time")
            .map(statementLatency).toProperty("statementLatency")
            .map(progress).toProperty("progress")
            .map(lockLatency).toProperty("lockLatency")
            .map(rowsExamined).toProperty("rowsExamined")
            .map(rowsSent).toProperty("rowsSent")
            .map(rowsAffected).toProperty("rowsAffected")
            .map(tmpTables).toProperty("tmpTables")
            .map(tmpDiskTables).toProperty("tmpDiskTables")
            .map(fullScan).toProperty("fullScan")
            .map(lastStatementLatency).toProperty("lastStatementLatency")
            .map(currentMemory).toProperty("currentMemory")
            .map(lastWait).toProperty("lastWait")
            .map(lastWaitLatency).toProperty("lastWaitLatency")
            .map(source).toProperty("source")
            .map(trxLatency).toProperty("trxLatency")
            .map(trxState).toProperty("trxState")
            .map(trxAutocommit).toProperty("trxAutocommit")
            .map(pid).toProperty("pid")
            .map(programName).toProperty("programName")
            .map(currentStatement).toProperty("currentStatement")
            .map(lastStatement).toProperty("lastStatement")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.056766+08:00", comments="Source Table: x$session")
    default int insertSelective(XSession record) {
        return MyBatis3Utils.insert(this::insert, record, XSession, c ->
            c.map(thdId).toPropertyWhenPresent("thdId", record::getThdId)
            .map(connId).toPropertyWhenPresent("connId", record::getConnId)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(command).toPropertyWhenPresent("command", record::getCommand)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(statementLatency).toPropertyWhenPresent("statementLatency", record::getStatementLatency)
            .map(progress).toPropertyWhenPresent("progress", record::getProgress)
            .map(lockLatency).toPropertyWhenPresent("lockLatency", record::getLockLatency)
            .map(rowsExamined).toPropertyWhenPresent("rowsExamined", record::getRowsExamined)
            .map(rowsSent).toPropertyWhenPresent("rowsSent", record::getRowsSent)
            .map(rowsAffected).toPropertyWhenPresent("rowsAffected", record::getRowsAffected)
            .map(tmpTables).toPropertyWhenPresent("tmpTables", record::getTmpTables)
            .map(tmpDiskTables).toPropertyWhenPresent("tmpDiskTables", record::getTmpDiskTables)
            .map(fullScan).toPropertyWhenPresent("fullScan", record::getFullScan)
            .map(lastStatementLatency).toPropertyWhenPresent("lastStatementLatency", record::getLastStatementLatency)
            .map(currentMemory).toPropertyWhenPresent("currentMemory", record::getCurrentMemory)
            .map(lastWait).toPropertyWhenPresent("lastWait", record::getLastWait)
            .map(lastWaitLatency).toPropertyWhenPresent("lastWaitLatency", record::getLastWaitLatency)
            .map(source).toPropertyWhenPresent("source", record::getSource)
            .map(trxLatency).toPropertyWhenPresent("trxLatency", record::getTrxLatency)
            .map(trxState).toPropertyWhenPresent("trxState", record::getTrxState)
            .map(trxAutocommit).toPropertyWhenPresent("trxAutocommit", record::getTrxAutocommit)
            .map(pid).toPropertyWhenPresent("pid", record::getPid)
            .map(programName).toPropertyWhenPresent("programName", record::getProgramName)
            .map(currentStatement).toPropertyWhenPresent("currentStatement", record::getCurrentStatement)
            .map(lastStatement).toPropertyWhenPresent("lastStatement", record::getLastStatement)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    default Optional<XSession> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XSession, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    default List<XSession> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XSession, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    default List<XSession> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XSession, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XSession, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    static UpdateDSL<UpdateModel> updateAllColumns(XSession record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(thdId).equalTo(record::getThdId)
                .set(connId).equalTo(record::getConnId)
                .set(user).equalTo(record::getUser)
                .set(db).equalTo(record::getDb)
                .set(command).equalTo(record::getCommand)
                .set(state).equalTo(record::getState)
                .set(time).equalTo(record::getTime)
                .set(statementLatency).equalTo(record::getStatementLatency)
                .set(progress).equalTo(record::getProgress)
                .set(lockLatency).equalTo(record::getLockLatency)
                .set(rowsExamined).equalTo(record::getRowsExamined)
                .set(rowsSent).equalTo(record::getRowsSent)
                .set(rowsAffected).equalTo(record::getRowsAffected)
                .set(tmpTables).equalTo(record::getTmpTables)
                .set(tmpDiskTables).equalTo(record::getTmpDiskTables)
                .set(fullScan).equalTo(record::getFullScan)
                .set(lastStatementLatency).equalTo(record::getLastStatementLatency)
                .set(currentMemory).equalTo(record::getCurrentMemory)
                .set(lastWait).equalTo(record::getLastWait)
                .set(lastWaitLatency).equalTo(record::getLastWaitLatency)
                .set(source).equalTo(record::getSource)
                .set(trxLatency).equalTo(record::getTrxLatency)
                .set(trxState).equalTo(record::getTrxState)
                .set(trxAutocommit).equalTo(record::getTrxAutocommit)
                .set(pid).equalTo(record::getPid)
                .set(programName).equalTo(record::getProgramName)
                .set(currentStatement).equalTo(record::getCurrentStatement)
                .set(lastStatement).equalTo(record::getLastStatement);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0577668+08:00", comments="Source Table: x$session")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XSession record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(thdId).equalToWhenPresent(record::getThdId)
                .set(connId).equalToWhenPresent(record::getConnId)
                .set(user).equalToWhenPresent(record::getUser)
                .set(db).equalToWhenPresent(record::getDb)
                .set(command).equalToWhenPresent(record::getCommand)
                .set(state).equalToWhenPresent(record::getState)
                .set(time).equalToWhenPresent(record::getTime)
                .set(statementLatency).equalToWhenPresent(record::getStatementLatency)
                .set(progress).equalToWhenPresent(record::getProgress)
                .set(lockLatency).equalToWhenPresent(record::getLockLatency)
                .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
                .set(rowsSent).equalToWhenPresent(record::getRowsSent)
                .set(rowsAffected).equalToWhenPresent(record::getRowsAffected)
                .set(tmpTables).equalToWhenPresent(record::getTmpTables)
                .set(tmpDiskTables).equalToWhenPresent(record::getTmpDiskTables)
                .set(fullScan).equalToWhenPresent(record::getFullScan)
                .set(lastStatementLatency).equalToWhenPresent(record::getLastStatementLatency)
                .set(currentMemory).equalToWhenPresent(record::getCurrentMemory)
                .set(lastWait).equalToWhenPresent(record::getLastWait)
                .set(lastWaitLatency).equalToWhenPresent(record::getLastWaitLatency)
                .set(source).equalToWhenPresent(record::getSource)
                .set(trxLatency).equalToWhenPresent(record::getTrxLatency)
                .set(trxState).equalToWhenPresent(record::getTrxState)
                .set(trxAutocommit).equalToWhenPresent(record::getTrxAutocommit)
                .set(pid).equalToWhenPresent(record::getPid)
                .set(programName).equalToWhenPresent(record::getProgramName)
                .set(currentStatement).equalToWhenPresent(record::getCurrentStatement)
                .set(lastStatement).equalToWhenPresent(record::getLastStatement);
    }
}