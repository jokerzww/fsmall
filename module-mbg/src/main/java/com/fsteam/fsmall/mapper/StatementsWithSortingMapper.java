package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.StatementsWithSortingDynamicSqlSupport.*;

import com.fsteam.fsmall.model.StatementsWithSorting;
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
public interface StatementsWithSortingMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    BasicColumn[] selectList = BasicColumn.columnList(db, execCount, totalLatency, sortMergePasses, avgSortMerges, sortsUsingScans, sortUsingRange, rowsSorted, avgRowsSorted, firstSeen, lastSeen, digest, query);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StatementsWithSorting> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatementsWithSortingResult")
    Optional<StatementsWithSorting> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatementsWithSortingResult", value = {
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="exec_count", property="execCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort_merge_passes", property="sortMergePasses", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_sort_merges", property="avgSortMerges", jdbcType=JdbcType.DECIMAL),
        @Result(column="sorts_using_scans", property="sortsUsingScans", jdbcType=JdbcType.BIGINT),
        @Result(column="sort_using_range", property="sortUsingRange", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_sorted", property="rowsSorted", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_rows_sorted", property="avgRowsSorted", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_seen", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_seen", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="digest", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="query", property="query", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<StatementsWithSorting> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statementsWithSorting, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statementsWithSorting, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default int insert(StatementsWithSorting record) {
        return MyBatis3Utils.insert(this::insert, record, statementsWithSorting, c ->
            c.map(db).toProperty("db")
            .map(execCount).toProperty("execCount")
            .map(totalLatency).toProperty("totalLatency")
            .map(sortMergePasses).toProperty("sortMergePasses")
            .map(avgSortMerges).toProperty("avgSortMerges")
            .map(sortsUsingScans).toProperty("sortsUsingScans")
            .map(sortUsingRange).toProperty("sortUsingRange")
            .map(rowsSorted).toProperty("rowsSorted")
            .map(avgRowsSorted).toProperty("avgRowsSorted")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(digest).toProperty("digest")
            .map(query).toProperty("query")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default int insertSelective(StatementsWithSorting record) {
        return MyBatis3Utils.insert(this::insert, record, statementsWithSorting, c ->
            c.map(db).toPropertyWhenPresent("db", record::getDb)
            .map(execCount).toPropertyWhenPresent("execCount", record::getExecCount)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(sortMergePasses).toPropertyWhenPresent("sortMergePasses", record::getSortMergePasses)
            .map(avgSortMerges).toPropertyWhenPresent("avgSortMerges", record::getAvgSortMerges)
            .map(sortsUsingScans).toPropertyWhenPresent("sortsUsingScans", record::getSortsUsingScans)
            .map(sortUsingRange).toPropertyWhenPresent("sortUsingRange", record::getSortUsingRange)
            .map(rowsSorted).toPropertyWhenPresent("rowsSorted", record::getRowsSorted)
            .map(avgRowsSorted).toPropertyWhenPresent("avgRowsSorted", record::getAvgRowsSorted)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(query).toPropertyWhenPresent("query", record::getQuery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default Optional<StatementsWithSorting> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statementsWithSorting, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default List<StatementsWithSorting> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statementsWithSorting, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default List<StatementsWithSorting> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statementsWithSorting, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statementsWithSorting, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    static UpdateDSL<UpdateModel> updateAllColumns(StatementsWithSorting record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalTo(record::getDb)
                .set(execCount).equalTo(record::getExecCount)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(sortMergePasses).equalTo(record::getSortMergePasses)
                .set(avgSortMerges).equalTo(record::getAvgSortMerges)
                .set(sortsUsingScans).equalTo(record::getSortsUsingScans)
                .set(sortUsingRange).equalTo(record::getSortUsingRange)
                .set(rowsSorted).equalTo(record::getRowsSorted)
                .set(avgRowsSorted).equalTo(record::getAvgRowsSorted)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(digest).equalTo(record::getDigest)
                .set(query).equalTo(record::getQuery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source Table: statements_with_sorting")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StatementsWithSorting record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalToWhenPresent(record::getDb)
                .set(execCount).equalToWhenPresent(record::getExecCount)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(sortMergePasses).equalToWhenPresent(record::getSortMergePasses)
                .set(avgSortMerges).equalToWhenPresent(record::getAvgSortMerges)
                .set(sortsUsingScans).equalToWhenPresent(record::getSortsUsingScans)
                .set(sortUsingRange).equalToWhenPresent(record::getSortUsingRange)
                .set(rowsSorted).equalToWhenPresent(record::getRowsSorted)
                .set(avgRowsSorted).equalToWhenPresent(record::getAvgRowsSorted)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(query).equalToWhenPresent(record::getQuery);
    }
}