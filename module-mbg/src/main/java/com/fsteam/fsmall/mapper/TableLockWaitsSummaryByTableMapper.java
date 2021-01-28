package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TableLockWaitsSummaryByTableDynamicSqlSupport.*;

import com.fsteam.fsmall.model.TableLockWaitsSummaryByTable;
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
public interface TableLockWaitsSummaryByTableMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    BasicColumn[] selectList = BasicColumn.columnList(objectType, objectSchema, objectName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait, countRead, sumTimerRead, minTimerRead, avgTimerRead, maxTimerRead, countWrite, sumTimerWrite, minTimerWrite, avgTimerWrite, maxTimerWrite, countReadNormal, sumTimerReadNormal, minTimerReadNormal, avgTimerReadNormal, maxTimerReadNormal, countReadWithSharedLocks, sumTimerReadWithSharedLocks, minTimerReadWithSharedLocks, avgTimerReadWithSharedLocks, maxTimerReadWithSharedLocks, countReadHighPriority, sumTimerReadHighPriority, minTimerReadHighPriority, avgTimerReadHighPriority, maxTimerReadHighPriority, countReadNoInsert, sumTimerReadNoInsert, minTimerReadNoInsert, avgTimerReadNoInsert, maxTimerReadNoInsert, countReadExternal, sumTimerReadExternal, minTimerReadExternal, avgTimerReadExternal, maxTimerReadExternal, countWriteAllowWrite, sumTimerWriteAllowWrite, minTimerWriteAllowWrite, avgTimerWriteAllowWrite, maxTimerWriteAllowWrite, countWriteConcurrentInsert, sumTimerWriteConcurrentInsert, minTimerWriteConcurrentInsert, avgTimerWriteConcurrentInsert, maxTimerWriteConcurrentInsert, countWriteLowPriority, sumTimerWriteLowPriority, minTimerWriteLowPriority, avgTimerWriteLowPriority, maxTimerWriteLowPriority, countWriteNormal, sumTimerWriteNormal, minTimerWriteNormal, avgTimerWriteNormal, maxTimerWriteNormal, countWriteExternal, sumTimerWriteExternal, minTimerWriteExternal, avgTimerWriteExternal, maxTimerWriteExternal);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TableLockWaitsSummaryByTable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TableLockWaitsSummaryByTableResult")
    Optional<TableLockWaitsSummaryByTable> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TableLockWaitsSummaryByTableResult", value = {
        @Result(column="OBJECT_TYPE", property="objectType", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_SCHEMA", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
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
        @Result(column="COUNT_READ_NORMAL", property="countReadNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_NORMAL", property="sumTimerReadNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_NORMAL", property="minTimerReadNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_NORMAL", property="avgTimerReadNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_NORMAL", property="maxTimerReadNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ_WITH_SHARED_LOCKS", property="countReadWithSharedLocks", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_WITH_SHARED_LOCKS", property="sumTimerReadWithSharedLocks", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_WITH_SHARED_LOCKS", property="minTimerReadWithSharedLocks", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_WITH_SHARED_LOCKS", property="avgTimerReadWithSharedLocks", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_WITH_SHARED_LOCKS", property="maxTimerReadWithSharedLocks", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ_HIGH_PRIORITY", property="countReadHighPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_HIGH_PRIORITY", property="sumTimerReadHighPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_HIGH_PRIORITY", property="minTimerReadHighPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_HIGH_PRIORITY", property="avgTimerReadHighPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_HIGH_PRIORITY", property="maxTimerReadHighPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ_NO_INSERT", property="countReadNoInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_NO_INSERT", property="sumTimerReadNoInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_NO_INSERT", property="minTimerReadNoInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_NO_INSERT", property="avgTimerReadNoInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_NO_INSERT", property="maxTimerReadNoInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ_EXTERNAL", property="countReadExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ_EXTERNAL", property="sumTimerReadExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ_EXTERNAL", property="minTimerReadExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ_EXTERNAL", property="avgTimerReadExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ_EXTERNAL", property="maxTimerReadExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE_ALLOW_WRITE", property="countWriteAllowWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE_ALLOW_WRITE", property="sumTimerWriteAllowWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE_ALLOW_WRITE", property="minTimerWriteAllowWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE_ALLOW_WRITE", property="avgTimerWriteAllowWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE_ALLOW_WRITE", property="maxTimerWriteAllowWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE_CONCURRENT_INSERT", property="countWriteConcurrentInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE_CONCURRENT_INSERT", property="sumTimerWriteConcurrentInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE_CONCURRENT_INSERT", property="minTimerWriteConcurrentInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE_CONCURRENT_INSERT", property="avgTimerWriteConcurrentInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE_CONCURRENT_INSERT", property="maxTimerWriteConcurrentInsert", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE_LOW_PRIORITY", property="countWriteLowPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE_LOW_PRIORITY", property="sumTimerWriteLowPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE_LOW_PRIORITY", property="minTimerWriteLowPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE_LOW_PRIORITY", property="avgTimerWriteLowPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE_LOW_PRIORITY", property="maxTimerWriteLowPriority", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE_NORMAL", property="countWriteNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE_NORMAL", property="sumTimerWriteNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE_NORMAL", property="minTimerWriteNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE_NORMAL", property="avgTimerWriteNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE_NORMAL", property="maxTimerWriteNormal", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE_EXTERNAL", property="countWriteExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE_EXTERNAL", property="sumTimerWriteExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE_EXTERNAL", property="minTimerWriteExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE_EXTERNAL", property="avgTimerWriteExternal", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE_EXTERNAL", property="maxTimerWriteExternal", jdbcType=JdbcType.BIGINT)
    })
    List<TableLockWaitsSummaryByTable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tableLockWaitsSummaryByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tableLockWaitsSummaryByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default int insert(TableLockWaitsSummaryByTable record) {
        return MyBatis3Utils.insert(this::insert, record, tableLockWaitsSummaryByTable, c ->
            c.map(objectType).toProperty("objectType")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
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
            .map(countReadNormal).toProperty("countReadNormal")
            .map(sumTimerReadNormal).toProperty("sumTimerReadNormal")
            .map(minTimerReadNormal).toProperty("minTimerReadNormal")
            .map(avgTimerReadNormal).toProperty("avgTimerReadNormal")
            .map(maxTimerReadNormal).toProperty("maxTimerReadNormal")
            .map(countReadWithSharedLocks).toProperty("countReadWithSharedLocks")
            .map(sumTimerReadWithSharedLocks).toProperty("sumTimerReadWithSharedLocks")
            .map(minTimerReadWithSharedLocks).toProperty("minTimerReadWithSharedLocks")
            .map(avgTimerReadWithSharedLocks).toProperty("avgTimerReadWithSharedLocks")
            .map(maxTimerReadWithSharedLocks).toProperty("maxTimerReadWithSharedLocks")
            .map(countReadHighPriority).toProperty("countReadHighPriority")
            .map(sumTimerReadHighPriority).toProperty("sumTimerReadHighPriority")
            .map(minTimerReadHighPriority).toProperty("minTimerReadHighPriority")
            .map(avgTimerReadHighPriority).toProperty("avgTimerReadHighPriority")
            .map(maxTimerReadHighPriority).toProperty("maxTimerReadHighPriority")
            .map(countReadNoInsert).toProperty("countReadNoInsert")
            .map(sumTimerReadNoInsert).toProperty("sumTimerReadNoInsert")
            .map(minTimerReadNoInsert).toProperty("minTimerReadNoInsert")
            .map(avgTimerReadNoInsert).toProperty("avgTimerReadNoInsert")
            .map(maxTimerReadNoInsert).toProperty("maxTimerReadNoInsert")
            .map(countReadExternal).toProperty("countReadExternal")
            .map(sumTimerReadExternal).toProperty("sumTimerReadExternal")
            .map(minTimerReadExternal).toProperty("minTimerReadExternal")
            .map(avgTimerReadExternal).toProperty("avgTimerReadExternal")
            .map(maxTimerReadExternal).toProperty("maxTimerReadExternal")
            .map(countWriteAllowWrite).toProperty("countWriteAllowWrite")
            .map(sumTimerWriteAllowWrite).toProperty("sumTimerWriteAllowWrite")
            .map(minTimerWriteAllowWrite).toProperty("minTimerWriteAllowWrite")
            .map(avgTimerWriteAllowWrite).toProperty("avgTimerWriteAllowWrite")
            .map(maxTimerWriteAllowWrite).toProperty("maxTimerWriteAllowWrite")
            .map(countWriteConcurrentInsert).toProperty("countWriteConcurrentInsert")
            .map(sumTimerWriteConcurrentInsert).toProperty("sumTimerWriteConcurrentInsert")
            .map(minTimerWriteConcurrentInsert).toProperty("minTimerWriteConcurrentInsert")
            .map(avgTimerWriteConcurrentInsert).toProperty("avgTimerWriteConcurrentInsert")
            .map(maxTimerWriteConcurrentInsert).toProperty("maxTimerWriteConcurrentInsert")
            .map(countWriteLowPriority).toProperty("countWriteLowPriority")
            .map(sumTimerWriteLowPriority).toProperty("sumTimerWriteLowPriority")
            .map(minTimerWriteLowPriority).toProperty("minTimerWriteLowPriority")
            .map(avgTimerWriteLowPriority).toProperty("avgTimerWriteLowPriority")
            .map(maxTimerWriteLowPriority).toProperty("maxTimerWriteLowPriority")
            .map(countWriteNormal).toProperty("countWriteNormal")
            .map(sumTimerWriteNormal).toProperty("sumTimerWriteNormal")
            .map(minTimerWriteNormal).toProperty("minTimerWriteNormal")
            .map(avgTimerWriteNormal).toProperty("avgTimerWriteNormal")
            .map(maxTimerWriteNormal).toProperty("maxTimerWriteNormal")
            .map(countWriteExternal).toProperty("countWriteExternal")
            .map(sumTimerWriteExternal).toProperty("sumTimerWriteExternal")
            .map(minTimerWriteExternal).toProperty("minTimerWriteExternal")
            .map(avgTimerWriteExternal).toProperty("avgTimerWriteExternal")
            .map(maxTimerWriteExternal).toProperty("maxTimerWriteExternal")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5422091+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default int insertSelective(TableLockWaitsSummaryByTable record) {
        return MyBatis3Utils.insert(this::insert, record, tableLockWaitsSummaryByTable, c ->
            c.map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
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
            .map(countReadNormal).toPropertyWhenPresent("countReadNormal", record::getCountReadNormal)
            .map(sumTimerReadNormal).toPropertyWhenPresent("sumTimerReadNormal", record::getSumTimerReadNormal)
            .map(minTimerReadNormal).toPropertyWhenPresent("minTimerReadNormal", record::getMinTimerReadNormal)
            .map(avgTimerReadNormal).toPropertyWhenPresent("avgTimerReadNormal", record::getAvgTimerReadNormal)
            .map(maxTimerReadNormal).toPropertyWhenPresent("maxTimerReadNormal", record::getMaxTimerReadNormal)
            .map(countReadWithSharedLocks).toPropertyWhenPresent("countReadWithSharedLocks", record::getCountReadWithSharedLocks)
            .map(sumTimerReadWithSharedLocks).toPropertyWhenPresent("sumTimerReadWithSharedLocks", record::getSumTimerReadWithSharedLocks)
            .map(minTimerReadWithSharedLocks).toPropertyWhenPresent("minTimerReadWithSharedLocks", record::getMinTimerReadWithSharedLocks)
            .map(avgTimerReadWithSharedLocks).toPropertyWhenPresent("avgTimerReadWithSharedLocks", record::getAvgTimerReadWithSharedLocks)
            .map(maxTimerReadWithSharedLocks).toPropertyWhenPresent("maxTimerReadWithSharedLocks", record::getMaxTimerReadWithSharedLocks)
            .map(countReadHighPriority).toPropertyWhenPresent("countReadHighPriority", record::getCountReadHighPriority)
            .map(sumTimerReadHighPriority).toPropertyWhenPresent("sumTimerReadHighPriority", record::getSumTimerReadHighPriority)
            .map(minTimerReadHighPriority).toPropertyWhenPresent("minTimerReadHighPriority", record::getMinTimerReadHighPriority)
            .map(avgTimerReadHighPriority).toPropertyWhenPresent("avgTimerReadHighPriority", record::getAvgTimerReadHighPriority)
            .map(maxTimerReadHighPriority).toPropertyWhenPresent("maxTimerReadHighPriority", record::getMaxTimerReadHighPriority)
            .map(countReadNoInsert).toPropertyWhenPresent("countReadNoInsert", record::getCountReadNoInsert)
            .map(sumTimerReadNoInsert).toPropertyWhenPresent("sumTimerReadNoInsert", record::getSumTimerReadNoInsert)
            .map(minTimerReadNoInsert).toPropertyWhenPresent("minTimerReadNoInsert", record::getMinTimerReadNoInsert)
            .map(avgTimerReadNoInsert).toPropertyWhenPresent("avgTimerReadNoInsert", record::getAvgTimerReadNoInsert)
            .map(maxTimerReadNoInsert).toPropertyWhenPresent("maxTimerReadNoInsert", record::getMaxTimerReadNoInsert)
            .map(countReadExternal).toPropertyWhenPresent("countReadExternal", record::getCountReadExternal)
            .map(sumTimerReadExternal).toPropertyWhenPresent("sumTimerReadExternal", record::getSumTimerReadExternal)
            .map(minTimerReadExternal).toPropertyWhenPresent("minTimerReadExternal", record::getMinTimerReadExternal)
            .map(avgTimerReadExternal).toPropertyWhenPresent("avgTimerReadExternal", record::getAvgTimerReadExternal)
            .map(maxTimerReadExternal).toPropertyWhenPresent("maxTimerReadExternal", record::getMaxTimerReadExternal)
            .map(countWriteAllowWrite).toPropertyWhenPresent("countWriteAllowWrite", record::getCountWriteAllowWrite)
            .map(sumTimerWriteAllowWrite).toPropertyWhenPresent("sumTimerWriteAllowWrite", record::getSumTimerWriteAllowWrite)
            .map(minTimerWriteAllowWrite).toPropertyWhenPresent("minTimerWriteAllowWrite", record::getMinTimerWriteAllowWrite)
            .map(avgTimerWriteAllowWrite).toPropertyWhenPresent("avgTimerWriteAllowWrite", record::getAvgTimerWriteAllowWrite)
            .map(maxTimerWriteAllowWrite).toPropertyWhenPresent("maxTimerWriteAllowWrite", record::getMaxTimerWriteAllowWrite)
            .map(countWriteConcurrentInsert).toPropertyWhenPresent("countWriteConcurrentInsert", record::getCountWriteConcurrentInsert)
            .map(sumTimerWriteConcurrentInsert).toPropertyWhenPresent("sumTimerWriteConcurrentInsert", record::getSumTimerWriteConcurrentInsert)
            .map(minTimerWriteConcurrentInsert).toPropertyWhenPresent("minTimerWriteConcurrentInsert", record::getMinTimerWriteConcurrentInsert)
            .map(avgTimerWriteConcurrentInsert).toPropertyWhenPresent("avgTimerWriteConcurrentInsert", record::getAvgTimerWriteConcurrentInsert)
            .map(maxTimerWriteConcurrentInsert).toPropertyWhenPresent("maxTimerWriteConcurrentInsert", record::getMaxTimerWriteConcurrentInsert)
            .map(countWriteLowPriority).toPropertyWhenPresent("countWriteLowPriority", record::getCountWriteLowPriority)
            .map(sumTimerWriteLowPriority).toPropertyWhenPresent("sumTimerWriteLowPriority", record::getSumTimerWriteLowPriority)
            .map(minTimerWriteLowPriority).toPropertyWhenPresent("minTimerWriteLowPriority", record::getMinTimerWriteLowPriority)
            .map(avgTimerWriteLowPriority).toPropertyWhenPresent("avgTimerWriteLowPriority", record::getAvgTimerWriteLowPriority)
            .map(maxTimerWriteLowPriority).toPropertyWhenPresent("maxTimerWriteLowPriority", record::getMaxTimerWriteLowPriority)
            .map(countWriteNormal).toPropertyWhenPresent("countWriteNormal", record::getCountWriteNormal)
            .map(sumTimerWriteNormal).toPropertyWhenPresent("sumTimerWriteNormal", record::getSumTimerWriteNormal)
            .map(minTimerWriteNormal).toPropertyWhenPresent("minTimerWriteNormal", record::getMinTimerWriteNormal)
            .map(avgTimerWriteNormal).toPropertyWhenPresent("avgTimerWriteNormal", record::getAvgTimerWriteNormal)
            .map(maxTimerWriteNormal).toPropertyWhenPresent("maxTimerWriteNormal", record::getMaxTimerWriteNormal)
            .map(countWriteExternal).toPropertyWhenPresent("countWriteExternal", record::getCountWriteExternal)
            .map(sumTimerWriteExternal).toPropertyWhenPresent("sumTimerWriteExternal", record::getSumTimerWriteExternal)
            .map(minTimerWriteExternal).toPropertyWhenPresent("minTimerWriteExternal", record::getMinTimerWriteExternal)
            .map(avgTimerWriteExternal).toPropertyWhenPresent("avgTimerWriteExternal", record::getAvgTimerWriteExternal)
            .map(maxTimerWriteExternal).toPropertyWhenPresent("maxTimerWriteExternal", record::getMaxTimerWriteExternal)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default Optional<TableLockWaitsSummaryByTable> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tableLockWaitsSummaryByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default List<TableLockWaitsSummaryByTable> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tableLockWaitsSummaryByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default List<TableLockWaitsSummaryByTable> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tableLockWaitsSummaryByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tableLockWaitsSummaryByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    static UpdateDSL<UpdateModel> updateAllColumns(TableLockWaitsSummaryByTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalTo(record::getObjectType)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
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
                .set(countReadNormal).equalTo(record::getCountReadNormal)
                .set(sumTimerReadNormal).equalTo(record::getSumTimerReadNormal)
                .set(minTimerReadNormal).equalTo(record::getMinTimerReadNormal)
                .set(avgTimerReadNormal).equalTo(record::getAvgTimerReadNormal)
                .set(maxTimerReadNormal).equalTo(record::getMaxTimerReadNormal)
                .set(countReadWithSharedLocks).equalTo(record::getCountReadWithSharedLocks)
                .set(sumTimerReadWithSharedLocks).equalTo(record::getSumTimerReadWithSharedLocks)
                .set(minTimerReadWithSharedLocks).equalTo(record::getMinTimerReadWithSharedLocks)
                .set(avgTimerReadWithSharedLocks).equalTo(record::getAvgTimerReadWithSharedLocks)
                .set(maxTimerReadWithSharedLocks).equalTo(record::getMaxTimerReadWithSharedLocks)
                .set(countReadHighPriority).equalTo(record::getCountReadHighPriority)
                .set(sumTimerReadHighPriority).equalTo(record::getSumTimerReadHighPriority)
                .set(minTimerReadHighPriority).equalTo(record::getMinTimerReadHighPriority)
                .set(avgTimerReadHighPriority).equalTo(record::getAvgTimerReadHighPriority)
                .set(maxTimerReadHighPriority).equalTo(record::getMaxTimerReadHighPriority)
                .set(countReadNoInsert).equalTo(record::getCountReadNoInsert)
                .set(sumTimerReadNoInsert).equalTo(record::getSumTimerReadNoInsert)
                .set(minTimerReadNoInsert).equalTo(record::getMinTimerReadNoInsert)
                .set(avgTimerReadNoInsert).equalTo(record::getAvgTimerReadNoInsert)
                .set(maxTimerReadNoInsert).equalTo(record::getMaxTimerReadNoInsert)
                .set(countReadExternal).equalTo(record::getCountReadExternal)
                .set(sumTimerReadExternal).equalTo(record::getSumTimerReadExternal)
                .set(minTimerReadExternal).equalTo(record::getMinTimerReadExternal)
                .set(avgTimerReadExternal).equalTo(record::getAvgTimerReadExternal)
                .set(maxTimerReadExternal).equalTo(record::getMaxTimerReadExternal)
                .set(countWriteAllowWrite).equalTo(record::getCountWriteAllowWrite)
                .set(sumTimerWriteAllowWrite).equalTo(record::getSumTimerWriteAllowWrite)
                .set(minTimerWriteAllowWrite).equalTo(record::getMinTimerWriteAllowWrite)
                .set(avgTimerWriteAllowWrite).equalTo(record::getAvgTimerWriteAllowWrite)
                .set(maxTimerWriteAllowWrite).equalTo(record::getMaxTimerWriteAllowWrite)
                .set(countWriteConcurrentInsert).equalTo(record::getCountWriteConcurrentInsert)
                .set(sumTimerWriteConcurrentInsert).equalTo(record::getSumTimerWriteConcurrentInsert)
                .set(minTimerWriteConcurrentInsert).equalTo(record::getMinTimerWriteConcurrentInsert)
                .set(avgTimerWriteConcurrentInsert).equalTo(record::getAvgTimerWriteConcurrentInsert)
                .set(maxTimerWriteConcurrentInsert).equalTo(record::getMaxTimerWriteConcurrentInsert)
                .set(countWriteLowPriority).equalTo(record::getCountWriteLowPriority)
                .set(sumTimerWriteLowPriority).equalTo(record::getSumTimerWriteLowPriority)
                .set(minTimerWriteLowPriority).equalTo(record::getMinTimerWriteLowPriority)
                .set(avgTimerWriteLowPriority).equalTo(record::getAvgTimerWriteLowPriority)
                .set(maxTimerWriteLowPriority).equalTo(record::getMaxTimerWriteLowPriority)
                .set(countWriteNormal).equalTo(record::getCountWriteNormal)
                .set(sumTimerWriteNormal).equalTo(record::getSumTimerWriteNormal)
                .set(minTimerWriteNormal).equalTo(record::getMinTimerWriteNormal)
                .set(avgTimerWriteNormal).equalTo(record::getAvgTimerWriteNormal)
                .set(maxTimerWriteNormal).equalTo(record::getMaxTimerWriteNormal)
                .set(countWriteExternal).equalTo(record::getCountWriteExternal)
                .set(sumTimerWriteExternal).equalTo(record::getSumTimerWriteExternal)
                .set(minTimerWriteExternal).equalTo(record::getMinTimerWriteExternal)
                .set(avgTimerWriteExternal).equalTo(record::getAvgTimerWriteExternal)
                .set(maxTimerWriteExternal).equalTo(record::getMaxTimerWriteExternal);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5432099+08:00", comments="Source Table: table_lock_waits_summary_by_table")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TableLockWaitsSummaryByTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectType).equalToWhenPresent(record::getObjectType)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
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
                .set(countReadNormal).equalToWhenPresent(record::getCountReadNormal)
                .set(sumTimerReadNormal).equalToWhenPresent(record::getSumTimerReadNormal)
                .set(minTimerReadNormal).equalToWhenPresent(record::getMinTimerReadNormal)
                .set(avgTimerReadNormal).equalToWhenPresent(record::getAvgTimerReadNormal)
                .set(maxTimerReadNormal).equalToWhenPresent(record::getMaxTimerReadNormal)
                .set(countReadWithSharedLocks).equalToWhenPresent(record::getCountReadWithSharedLocks)
                .set(sumTimerReadWithSharedLocks).equalToWhenPresent(record::getSumTimerReadWithSharedLocks)
                .set(minTimerReadWithSharedLocks).equalToWhenPresent(record::getMinTimerReadWithSharedLocks)
                .set(avgTimerReadWithSharedLocks).equalToWhenPresent(record::getAvgTimerReadWithSharedLocks)
                .set(maxTimerReadWithSharedLocks).equalToWhenPresent(record::getMaxTimerReadWithSharedLocks)
                .set(countReadHighPriority).equalToWhenPresent(record::getCountReadHighPriority)
                .set(sumTimerReadHighPriority).equalToWhenPresent(record::getSumTimerReadHighPriority)
                .set(minTimerReadHighPriority).equalToWhenPresent(record::getMinTimerReadHighPriority)
                .set(avgTimerReadHighPriority).equalToWhenPresent(record::getAvgTimerReadHighPriority)
                .set(maxTimerReadHighPriority).equalToWhenPresent(record::getMaxTimerReadHighPriority)
                .set(countReadNoInsert).equalToWhenPresent(record::getCountReadNoInsert)
                .set(sumTimerReadNoInsert).equalToWhenPresent(record::getSumTimerReadNoInsert)
                .set(minTimerReadNoInsert).equalToWhenPresent(record::getMinTimerReadNoInsert)
                .set(avgTimerReadNoInsert).equalToWhenPresent(record::getAvgTimerReadNoInsert)
                .set(maxTimerReadNoInsert).equalToWhenPresent(record::getMaxTimerReadNoInsert)
                .set(countReadExternal).equalToWhenPresent(record::getCountReadExternal)
                .set(sumTimerReadExternal).equalToWhenPresent(record::getSumTimerReadExternal)
                .set(minTimerReadExternal).equalToWhenPresent(record::getMinTimerReadExternal)
                .set(avgTimerReadExternal).equalToWhenPresent(record::getAvgTimerReadExternal)
                .set(maxTimerReadExternal).equalToWhenPresent(record::getMaxTimerReadExternal)
                .set(countWriteAllowWrite).equalToWhenPresent(record::getCountWriteAllowWrite)
                .set(sumTimerWriteAllowWrite).equalToWhenPresent(record::getSumTimerWriteAllowWrite)
                .set(minTimerWriteAllowWrite).equalToWhenPresent(record::getMinTimerWriteAllowWrite)
                .set(avgTimerWriteAllowWrite).equalToWhenPresent(record::getAvgTimerWriteAllowWrite)
                .set(maxTimerWriteAllowWrite).equalToWhenPresent(record::getMaxTimerWriteAllowWrite)
                .set(countWriteConcurrentInsert).equalToWhenPresent(record::getCountWriteConcurrentInsert)
                .set(sumTimerWriteConcurrentInsert).equalToWhenPresent(record::getSumTimerWriteConcurrentInsert)
                .set(minTimerWriteConcurrentInsert).equalToWhenPresent(record::getMinTimerWriteConcurrentInsert)
                .set(avgTimerWriteConcurrentInsert).equalToWhenPresent(record::getAvgTimerWriteConcurrentInsert)
                .set(maxTimerWriteConcurrentInsert).equalToWhenPresent(record::getMaxTimerWriteConcurrentInsert)
                .set(countWriteLowPriority).equalToWhenPresent(record::getCountWriteLowPriority)
                .set(sumTimerWriteLowPriority).equalToWhenPresent(record::getSumTimerWriteLowPriority)
                .set(minTimerWriteLowPriority).equalToWhenPresent(record::getMinTimerWriteLowPriority)
                .set(avgTimerWriteLowPriority).equalToWhenPresent(record::getAvgTimerWriteLowPriority)
                .set(maxTimerWriteLowPriority).equalToWhenPresent(record::getMaxTimerWriteLowPriority)
                .set(countWriteNormal).equalToWhenPresent(record::getCountWriteNormal)
                .set(sumTimerWriteNormal).equalToWhenPresent(record::getSumTimerWriteNormal)
                .set(minTimerWriteNormal).equalToWhenPresent(record::getMinTimerWriteNormal)
                .set(avgTimerWriteNormal).equalToWhenPresent(record::getAvgTimerWriteNormal)
                .set(maxTimerWriteNormal).equalToWhenPresent(record::getMaxTimerWriteNormal)
                .set(countWriteExternal).equalToWhenPresent(record::getCountWriteExternal)
                .set(sumTimerWriteExternal).equalToWhenPresent(record::getSumTimerWriteExternal)
                .set(minTimerWriteExternal).equalToWhenPresent(record::getMinTimerWriteExternal)
                .set(avgTimerWriteExternal).equalToWhenPresent(record::getAvgTimerWriteExternal)
                .set(maxTimerWriteExternal).equalToWhenPresent(record::getMaxTimerWriteExternal);
    }
}