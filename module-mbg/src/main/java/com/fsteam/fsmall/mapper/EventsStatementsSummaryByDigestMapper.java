package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EventsStatementsSummaryByDigestDynamicSqlSupport.*;

import com.fsteam.fsmall.model.EventsStatementsSummaryByDigest;
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
public interface EventsStatementsSummaryByDigestMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    BasicColumn[] selectList = BasicColumn.columnList(schemaName, digest, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait, sumLockTime, sumErrors, sumWarnings, sumRowsAffected, sumRowsSent, sumRowsExamined, sumCreatedTmpDiskTables, sumCreatedTmpTables, sumSelectFullJoin, sumSelectFullRangeJoin, sumSelectRange, sumSelectRangeCheck, sumSelectScan, sumSortMergePasses, sumSortRange, sumSortRows, sumSortScan, sumNoIndexUsed, sumNoGoodIndexUsed, firstSeen, lastSeen, quantile95, quantile99, quantile999, querySampleSeen, querySampleTimerWait, digestText, querySampleText);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EventsStatementsSummaryByDigest> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EventsStatementsSummaryByDigestResult")
    Optional<EventsStatementsSummaryByDigest> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EventsStatementsSummaryByDigestResult", value = {
        @Result(column="SCHEMA_NAME", property="schemaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DIGEST", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_LOCK_TIME", property="sumLockTime", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ERRORS", property="sumErrors", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_WARNINGS", property="sumWarnings", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ROWS_AFFECTED", property="sumRowsAffected", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ROWS_SENT", property="sumRowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_ROWS_EXAMINED", property="sumRowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_CREATED_TMP_DISK_TABLES", property="sumCreatedTmpDiskTables", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_CREATED_TMP_TABLES", property="sumCreatedTmpTables", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_FULL_JOIN", property="sumSelectFullJoin", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_FULL_RANGE_JOIN", property="sumSelectFullRangeJoin", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_RANGE", property="sumSelectRange", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_RANGE_CHECK", property="sumSelectRangeCheck", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SELECT_SCAN", property="sumSelectScan", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_MERGE_PASSES", property="sumSortMergePasses", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_RANGE", property="sumSortRange", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_ROWS", property="sumSortRows", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_SORT_SCAN", property="sumSortScan", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NO_INDEX_USED", property="sumNoIndexUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NO_GOOD_INDEX_USED", property="sumNoGoodIndexUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="FIRST_SEEN", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_SEEN", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="QUANTILE_95", property="quantile95", jdbcType=JdbcType.BIGINT),
        @Result(column="QUANTILE_99", property="quantile99", jdbcType=JdbcType.BIGINT),
        @Result(column="QUANTILE_999", property="quantile999", jdbcType=JdbcType.BIGINT),
        @Result(column="QUERY_SAMPLE_SEEN", property="querySampleSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="QUERY_SAMPLE_TIMER_WAIT", property="querySampleTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="DIGEST_TEXT", property="digestText", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="QUERY_SAMPLE_TEXT", property="querySampleText", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<EventsStatementsSummaryByDigest> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, eventsStatementsSummaryByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4631373+08:00", comments="Source Table: events_statements_summary_by_digest")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, eventsStatementsSummaryByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    default int insert(EventsStatementsSummaryByDigest record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsSummaryByDigest, c ->
            c.map(schemaName).toProperty("schemaName")
            .map(digest).toProperty("digest")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
            .map(sumLockTime).toProperty("sumLockTime")
            .map(sumErrors).toProperty("sumErrors")
            .map(sumWarnings).toProperty("sumWarnings")
            .map(sumRowsAffected).toProperty("sumRowsAffected")
            .map(sumRowsSent).toProperty("sumRowsSent")
            .map(sumRowsExamined).toProperty("sumRowsExamined")
            .map(sumCreatedTmpDiskTables).toProperty("sumCreatedTmpDiskTables")
            .map(sumCreatedTmpTables).toProperty("sumCreatedTmpTables")
            .map(sumSelectFullJoin).toProperty("sumSelectFullJoin")
            .map(sumSelectFullRangeJoin).toProperty("sumSelectFullRangeJoin")
            .map(sumSelectRange).toProperty("sumSelectRange")
            .map(sumSelectRangeCheck).toProperty("sumSelectRangeCheck")
            .map(sumSelectScan).toProperty("sumSelectScan")
            .map(sumSortMergePasses).toProperty("sumSortMergePasses")
            .map(sumSortRange).toProperty("sumSortRange")
            .map(sumSortRows).toProperty("sumSortRows")
            .map(sumSortScan).toProperty("sumSortScan")
            .map(sumNoIndexUsed).toProperty("sumNoIndexUsed")
            .map(sumNoGoodIndexUsed).toProperty("sumNoGoodIndexUsed")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(quantile95).toProperty("quantile95")
            .map(quantile99).toProperty("quantile99")
            .map(quantile999).toProperty("quantile999")
            .map(querySampleSeen).toProperty("querySampleSeen")
            .map(querySampleTimerWait).toProperty("querySampleTimerWait")
            .map(digestText).toProperty("digestText")
            .map(querySampleText).toProperty("querySampleText")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    default int insertSelective(EventsStatementsSummaryByDigest record) {
        return MyBatis3Utils.insert(this::insert, record, eventsStatementsSummaryByDigest, c ->
            c.map(schemaName).toPropertyWhenPresent("schemaName", record::getSchemaName)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
            .map(sumLockTime).toPropertyWhenPresent("sumLockTime", record::getSumLockTime)
            .map(sumErrors).toPropertyWhenPresent("sumErrors", record::getSumErrors)
            .map(sumWarnings).toPropertyWhenPresent("sumWarnings", record::getSumWarnings)
            .map(sumRowsAffected).toPropertyWhenPresent("sumRowsAffected", record::getSumRowsAffected)
            .map(sumRowsSent).toPropertyWhenPresent("sumRowsSent", record::getSumRowsSent)
            .map(sumRowsExamined).toPropertyWhenPresent("sumRowsExamined", record::getSumRowsExamined)
            .map(sumCreatedTmpDiskTables).toPropertyWhenPresent("sumCreatedTmpDiskTables", record::getSumCreatedTmpDiskTables)
            .map(sumCreatedTmpTables).toPropertyWhenPresent("sumCreatedTmpTables", record::getSumCreatedTmpTables)
            .map(sumSelectFullJoin).toPropertyWhenPresent("sumSelectFullJoin", record::getSumSelectFullJoin)
            .map(sumSelectFullRangeJoin).toPropertyWhenPresent("sumSelectFullRangeJoin", record::getSumSelectFullRangeJoin)
            .map(sumSelectRange).toPropertyWhenPresent("sumSelectRange", record::getSumSelectRange)
            .map(sumSelectRangeCheck).toPropertyWhenPresent("sumSelectRangeCheck", record::getSumSelectRangeCheck)
            .map(sumSelectScan).toPropertyWhenPresent("sumSelectScan", record::getSumSelectScan)
            .map(sumSortMergePasses).toPropertyWhenPresent("sumSortMergePasses", record::getSumSortMergePasses)
            .map(sumSortRange).toPropertyWhenPresent("sumSortRange", record::getSumSortRange)
            .map(sumSortRows).toPropertyWhenPresent("sumSortRows", record::getSumSortRows)
            .map(sumSortScan).toPropertyWhenPresent("sumSortScan", record::getSumSortScan)
            .map(sumNoIndexUsed).toPropertyWhenPresent("sumNoIndexUsed", record::getSumNoIndexUsed)
            .map(sumNoGoodIndexUsed).toPropertyWhenPresent("sumNoGoodIndexUsed", record::getSumNoGoodIndexUsed)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(quantile95).toPropertyWhenPresent("quantile95", record::getQuantile95)
            .map(quantile99).toPropertyWhenPresent("quantile99", record::getQuantile99)
            .map(quantile999).toPropertyWhenPresent("quantile999", record::getQuantile999)
            .map(querySampleSeen).toPropertyWhenPresent("querySampleSeen", record::getQuerySampleSeen)
            .map(querySampleTimerWait).toPropertyWhenPresent("querySampleTimerWait", record::getQuerySampleTimerWait)
            .map(digestText).toPropertyWhenPresent("digestText", record::getDigestText)
            .map(querySampleText).toPropertyWhenPresent("querySampleText", record::getQuerySampleText)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    default Optional<EventsStatementsSummaryByDigest> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, eventsStatementsSummaryByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    default List<EventsStatementsSummaryByDigest> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, eventsStatementsSummaryByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    default List<EventsStatementsSummaryByDigest> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, eventsStatementsSummaryByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, eventsStatementsSummaryByDigest, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    static UpdateDSL<UpdateModel> updateAllColumns(EventsStatementsSummaryByDigest record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(schemaName).equalTo(record::getSchemaName)
                .set(digest).equalTo(record::getDigest)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait)
                .set(sumLockTime).equalTo(record::getSumLockTime)
                .set(sumErrors).equalTo(record::getSumErrors)
                .set(sumWarnings).equalTo(record::getSumWarnings)
                .set(sumRowsAffected).equalTo(record::getSumRowsAffected)
                .set(sumRowsSent).equalTo(record::getSumRowsSent)
                .set(sumRowsExamined).equalTo(record::getSumRowsExamined)
                .set(sumCreatedTmpDiskTables).equalTo(record::getSumCreatedTmpDiskTables)
                .set(sumCreatedTmpTables).equalTo(record::getSumCreatedTmpTables)
                .set(sumSelectFullJoin).equalTo(record::getSumSelectFullJoin)
                .set(sumSelectFullRangeJoin).equalTo(record::getSumSelectFullRangeJoin)
                .set(sumSelectRange).equalTo(record::getSumSelectRange)
                .set(sumSelectRangeCheck).equalTo(record::getSumSelectRangeCheck)
                .set(sumSelectScan).equalTo(record::getSumSelectScan)
                .set(sumSortMergePasses).equalTo(record::getSumSortMergePasses)
                .set(sumSortRange).equalTo(record::getSumSortRange)
                .set(sumSortRows).equalTo(record::getSumSortRows)
                .set(sumSortScan).equalTo(record::getSumSortScan)
                .set(sumNoIndexUsed).equalTo(record::getSumNoIndexUsed)
                .set(sumNoGoodIndexUsed).equalTo(record::getSumNoGoodIndexUsed)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(quantile95).equalTo(record::getQuantile95)
                .set(quantile99).equalTo(record::getQuantile99)
                .set(quantile999).equalTo(record::getQuantile999)
                .set(querySampleSeen).equalTo(record::getQuerySampleSeen)
                .set(querySampleTimerWait).equalTo(record::getQuerySampleTimerWait)
                .set(digestText).equalTo(record::getDigestText)
                .set(querySampleText).equalTo(record::getQuerySampleText);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4641384+08:00", comments="Source Table: events_statements_summary_by_digest")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EventsStatementsSummaryByDigest record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(schemaName).equalToWhenPresent(record::getSchemaName)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
                .set(sumLockTime).equalToWhenPresent(record::getSumLockTime)
                .set(sumErrors).equalToWhenPresent(record::getSumErrors)
                .set(sumWarnings).equalToWhenPresent(record::getSumWarnings)
                .set(sumRowsAffected).equalToWhenPresent(record::getSumRowsAffected)
                .set(sumRowsSent).equalToWhenPresent(record::getSumRowsSent)
                .set(sumRowsExamined).equalToWhenPresent(record::getSumRowsExamined)
                .set(sumCreatedTmpDiskTables).equalToWhenPresent(record::getSumCreatedTmpDiskTables)
                .set(sumCreatedTmpTables).equalToWhenPresent(record::getSumCreatedTmpTables)
                .set(sumSelectFullJoin).equalToWhenPresent(record::getSumSelectFullJoin)
                .set(sumSelectFullRangeJoin).equalToWhenPresent(record::getSumSelectFullRangeJoin)
                .set(sumSelectRange).equalToWhenPresent(record::getSumSelectRange)
                .set(sumSelectRangeCheck).equalToWhenPresent(record::getSumSelectRangeCheck)
                .set(sumSelectScan).equalToWhenPresent(record::getSumSelectScan)
                .set(sumSortMergePasses).equalToWhenPresent(record::getSumSortMergePasses)
                .set(sumSortRange).equalToWhenPresent(record::getSumSortRange)
                .set(sumSortRows).equalToWhenPresent(record::getSumSortRows)
                .set(sumSortScan).equalToWhenPresent(record::getSumSortScan)
                .set(sumNoIndexUsed).equalToWhenPresent(record::getSumNoIndexUsed)
                .set(sumNoGoodIndexUsed).equalToWhenPresent(record::getSumNoGoodIndexUsed)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(quantile95).equalToWhenPresent(record::getQuantile95)
                .set(quantile99).equalToWhenPresent(record::getQuantile99)
                .set(quantile999).equalToWhenPresent(record::getQuantile999)
                .set(querySampleSeen).equalToWhenPresent(record::getQuerySampleSeen)
                .set(querySampleTimerWait).equalToWhenPresent(record::getQuerySampleTimerWait)
                .set(digestText).equalToWhenPresent(record::getDigestText)
                .set(querySampleText).equalToWhenPresent(record::getQuerySampleText);
    }
}