package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.StatementsWithErrorsOrWarningsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.StatementsWithErrorsOrWarnings;
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
public interface StatementsWithErrorsOrWarningsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    BasicColumn[] selectList = BasicColumn.columnList(db, execCount, errors, errorPct, warnings, warningPct, firstSeen, lastSeen, digest, query);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StatementsWithErrorsOrWarnings> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatementsWithErrorsOrWarningsResult")
    Optional<StatementsWithErrorsOrWarnings> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatementsWithErrorsOrWarningsResult", value = {
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="exec_count", property="execCount", jdbcType=JdbcType.BIGINT),
        @Result(column="errors", property="errors", jdbcType=JdbcType.BIGINT),
        @Result(column="error_pct", property="errorPct", jdbcType=JdbcType.DECIMAL),
        @Result(column="warnings", property="warnings", jdbcType=JdbcType.BIGINT),
        @Result(column="warning_pct", property="warningPct", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_seen", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_seen", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="digest", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="query", property="query", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<StatementsWithErrorsOrWarnings> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statementsWithErrorsOrWarnings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statementsWithErrorsOrWarnings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default int insert(StatementsWithErrorsOrWarnings record) {
        return MyBatis3Utils.insert(this::insert, record, statementsWithErrorsOrWarnings, c ->
            c.map(db).toProperty("db")
            .map(execCount).toProperty("execCount")
            .map(errors).toProperty("errors")
            .map(errorPct).toProperty("errorPct")
            .map(warnings).toProperty("warnings")
            .map(warningPct).toProperty("warningPct")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(digest).toProperty("digest")
            .map(query).toProperty("query")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default int insertSelective(StatementsWithErrorsOrWarnings record) {
        return MyBatis3Utils.insert(this::insert, record, statementsWithErrorsOrWarnings, c ->
            c.map(db).toPropertyWhenPresent("db", record::getDb)
            .map(execCount).toPropertyWhenPresent("execCount", record::getExecCount)
            .map(errors).toPropertyWhenPresent("errors", record::getErrors)
            .map(errorPct).toPropertyWhenPresent("errorPct", record::getErrorPct)
            .map(warnings).toPropertyWhenPresent("warnings", record::getWarnings)
            .map(warningPct).toPropertyWhenPresent("warningPct", record::getWarningPct)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(query).toPropertyWhenPresent("query", record::getQuery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default Optional<StatementsWithErrorsOrWarnings> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statementsWithErrorsOrWarnings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default List<StatementsWithErrorsOrWarnings> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statementsWithErrorsOrWarnings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default List<StatementsWithErrorsOrWarnings> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statementsWithErrorsOrWarnings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statementsWithErrorsOrWarnings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    static UpdateDSL<UpdateModel> updateAllColumns(StatementsWithErrorsOrWarnings record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalTo(record::getDb)
                .set(execCount).equalTo(record::getExecCount)
                .set(errors).equalTo(record::getErrors)
                .set(errorPct).equalTo(record::getErrorPct)
                .set(warnings).equalTo(record::getWarnings)
                .set(warningPct).equalTo(record::getWarningPct)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(digest).equalTo(record::getDigest)
                .set(query).equalTo(record::getQuery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3059933+08:00", comments="Source Table: statements_with_errors_or_warnings")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StatementsWithErrorsOrWarnings record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalToWhenPresent(record::getDb)
                .set(execCount).equalToWhenPresent(record::getExecCount)
                .set(errors).equalToWhenPresent(record::getErrors)
                .set(errorPct).equalToWhenPresent(record::getErrorPct)
                .set(warnings).equalToWhenPresent(record::getWarnings)
                .set(warningPct).equalToWhenPresent(record::getWarningPct)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(query).equalToWhenPresent(record::getQuery);
    }
}