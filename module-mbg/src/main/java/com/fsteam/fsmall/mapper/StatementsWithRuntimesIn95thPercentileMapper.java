package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.StatementsWithRuntimesIn95thPercentileDynamicSqlSupport.*;

import com.fsteam.fsmall.model.StatementsWithRuntimesIn95thPercentile;
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
public interface StatementsWithRuntimesIn95thPercentileMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    BasicColumn[] selectList = BasicColumn.columnList(db, fullScan, execCount, errCount, warnCount, totalLatency, maxLatency, avgLatency, rowsSent, rowsSentAvg, rowsExamined, rowsExaminedAvg, firstSeen, lastSeen, digest, query);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StatementsWithRuntimesIn95thPercentile> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatementsWithRuntimesIn95thPercentileResult")
    Optional<StatementsWithRuntimesIn95thPercentile> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatementsWithRuntimesIn95thPercentileResult", value = {
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_scan", property="fullScan", jdbcType=JdbcType.VARCHAR),
        @Result(column="exec_count", property="execCount", jdbcType=JdbcType.BIGINT),
        @Result(column="err_count", property="errCount", jdbcType=JdbcType.BIGINT),
        @Result(column="warn_count", property="warnCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="rows_sent", property="rowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_sent_avg", property="rowsSentAvg", jdbcType=JdbcType.DECIMAL),
        @Result(column="rows_examined", property="rowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_examined_avg", property="rowsExaminedAvg", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_seen", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_seen", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="digest", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="query", property="query", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<StatementsWithRuntimesIn95thPercentile> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statementsWithRuntimesIn95thPercentile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statementsWithRuntimesIn95thPercentile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default int insert(StatementsWithRuntimesIn95thPercentile record) {
        return MyBatis3Utils.insert(this::insert, record, statementsWithRuntimesIn95thPercentile, c ->
            c.map(db).toProperty("db")
            .map(fullScan).toProperty("fullScan")
            .map(execCount).toProperty("execCount")
            .map(errCount).toProperty("errCount")
            .map(warnCount).toProperty("warnCount")
            .map(totalLatency).toProperty("totalLatency")
            .map(maxLatency).toProperty("maxLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(rowsSent).toProperty("rowsSent")
            .map(rowsSentAvg).toProperty("rowsSentAvg")
            .map(rowsExamined).toProperty("rowsExamined")
            .map(rowsExaminedAvg).toProperty("rowsExaminedAvg")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(digest).toProperty("digest")
            .map(query).toProperty("query")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default int insertSelective(StatementsWithRuntimesIn95thPercentile record) {
        return MyBatis3Utils.insert(this::insert, record, statementsWithRuntimesIn95thPercentile, c ->
            c.map(db).toPropertyWhenPresent("db", record::getDb)
            .map(fullScan).toPropertyWhenPresent("fullScan", record::getFullScan)
            .map(execCount).toPropertyWhenPresent("execCount", record::getExecCount)
            .map(errCount).toPropertyWhenPresent("errCount", record::getErrCount)
            .map(warnCount).toPropertyWhenPresent("warnCount", record::getWarnCount)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(rowsSent).toPropertyWhenPresent("rowsSent", record::getRowsSent)
            .map(rowsSentAvg).toPropertyWhenPresent("rowsSentAvg", record::getRowsSentAvg)
            .map(rowsExamined).toPropertyWhenPresent("rowsExamined", record::getRowsExamined)
            .map(rowsExaminedAvg).toPropertyWhenPresent("rowsExaminedAvg", record::getRowsExaminedAvg)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(query).toPropertyWhenPresent("query", record::getQuery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default Optional<StatementsWithRuntimesIn95thPercentile> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statementsWithRuntimesIn95thPercentile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default List<StatementsWithRuntimesIn95thPercentile> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statementsWithRuntimesIn95thPercentile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default List<StatementsWithRuntimesIn95thPercentile> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statementsWithRuntimesIn95thPercentile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statementsWithRuntimesIn95thPercentile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    static UpdateDSL<UpdateModel> updateAllColumns(StatementsWithRuntimesIn95thPercentile record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalTo(record::getDb)
                .set(fullScan).equalTo(record::getFullScan)
                .set(execCount).equalTo(record::getExecCount)
                .set(errCount).equalTo(record::getErrCount)
                .set(warnCount).equalTo(record::getWarnCount)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(maxLatency).equalTo(record::getMaxLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(rowsSent).equalTo(record::getRowsSent)
                .set(rowsSentAvg).equalTo(record::getRowsSentAvg)
                .set(rowsExamined).equalTo(record::getRowsExamined)
                .set(rowsExaminedAvg).equalTo(record::getRowsExaminedAvg)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(digest).equalTo(record::getDigest)
                .set(query).equalTo(record::getQuery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source Table: statements_with_runtimes_in_95th_percentile")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StatementsWithRuntimesIn95thPercentile record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalToWhenPresent(record::getDb)
                .set(fullScan).equalToWhenPresent(record::getFullScan)
                .set(execCount).equalToWhenPresent(record::getExecCount)
                .set(errCount).equalToWhenPresent(record::getErrCount)
                .set(warnCount).equalToWhenPresent(record::getWarnCount)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(rowsSent).equalToWhenPresent(record::getRowsSent)
                .set(rowsSentAvg).equalToWhenPresent(record::getRowsSentAvg)
                .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
                .set(rowsExaminedAvg).equalToWhenPresent(record::getRowsExaminedAvg)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(query).equalToWhenPresent(record::getQuery);
    }
}