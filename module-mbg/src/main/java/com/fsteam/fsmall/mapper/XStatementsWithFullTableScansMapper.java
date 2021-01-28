package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XStatementsWithFullTableScansDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XStatementsWithFullTableScans;
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
public interface XStatementsWithFullTableScansMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    BasicColumn[] selectList = BasicColumn.columnList(db, execCount, totalLatency, noIndexUsedCount, noGoodIndexUsedCount, noIndexUsedPct, rowsSent, rowsExamined, rowsSentAvg, rowsExaminedAvg, firstSeen, lastSeen, digest, query);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XStatementsWithFullTableScans> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XStatementsWithFullTableScansResult")
    Optional<XStatementsWithFullTableScans> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XStatementsWithFullTableScansResult", value = {
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="exec_count", property="execCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="no_index_used_count", property="noIndexUsedCount", jdbcType=JdbcType.BIGINT),
        @Result(column="no_good_index_used_count", property="noGoodIndexUsedCount", jdbcType=JdbcType.BIGINT),
        @Result(column="no_index_used_pct", property="noIndexUsedPct", jdbcType=JdbcType.DECIMAL),
        @Result(column="rows_sent", property="rowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_examined", property="rowsExamined", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_sent_avg", property="rowsSentAvg", jdbcType=JdbcType.DECIMAL),
        @Result(column="rows_examined_avg", property="rowsExaminedAvg", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_seen", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_seen", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="digest", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="query", property="query", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<XStatementsWithFullTableScans> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XStatementsWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XStatementsWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default int insert(XStatementsWithFullTableScans record) {
        return MyBatis3Utils.insert(this::insert, record, XStatementsWithFullTableScans, c ->
            c.map(db).toProperty("db")
            .map(execCount).toProperty("execCount")
            .map(totalLatency).toProperty("totalLatency")
            .map(noIndexUsedCount).toProperty("noIndexUsedCount")
            .map(noGoodIndexUsedCount).toProperty("noGoodIndexUsedCount")
            .map(noIndexUsedPct).toProperty("noIndexUsedPct")
            .map(rowsSent).toProperty("rowsSent")
            .map(rowsExamined).toProperty("rowsExamined")
            .map(rowsSentAvg).toProperty("rowsSentAvg")
            .map(rowsExaminedAvg).toProperty("rowsExaminedAvg")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(digest).toProperty("digest")
            .map(query).toProperty("query")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default int insertSelective(XStatementsWithFullTableScans record) {
        return MyBatis3Utils.insert(this::insert, record, XStatementsWithFullTableScans, c ->
            c.map(db).toPropertyWhenPresent("db", record::getDb)
            .map(execCount).toPropertyWhenPresent("execCount", record::getExecCount)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(noIndexUsedCount).toPropertyWhenPresent("noIndexUsedCount", record::getNoIndexUsedCount)
            .map(noGoodIndexUsedCount).toPropertyWhenPresent("noGoodIndexUsedCount", record::getNoGoodIndexUsedCount)
            .map(noIndexUsedPct).toPropertyWhenPresent("noIndexUsedPct", record::getNoIndexUsedPct)
            .map(rowsSent).toPropertyWhenPresent("rowsSent", record::getRowsSent)
            .map(rowsExamined).toPropertyWhenPresent("rowsExamined", record::getRowsExamined)
            .map(rowsSentAvg).toPropertyWhenPresent("rowsSentAvg", record::getRowsSentAvg)
            .map(rowsExaminedAvg).toPropertyWhenPresent("rowsExaminedAvg", record::getRowsExaminedAvg)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(query).toPropertyWhenPresent("query", record::getQuery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default Optional<XStatementsWithFullTableScans> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XStatementsWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default List<XStatementsWithFullTableScans> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XStatementsWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default List<XStatementsWithFullTableScans> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XStatementsWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XStatementsWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    static UpdateDSL<UpdateModel> updateAllColumns(XStatementsWithFullTableScans record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalTo(record::getDb)
                .set(execCount).equalTo(record::getExecCount)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(noIndexUsedCount).equalTo(record::getNoIndexUsedCount)
                .set(noGoodIndexUsedCount).equalTo(record::getNoGoodIndexUsedCount)
                .set(noIndexUsedPct).equalTo(record::getNoIndexUsedPct)
                .set(rowsSent).equalTo(record::getRowsSent)
                .set(rowsExamined).equalTo(record::getRowsExamined)
                .set(rowsSentAvg).equalTo(record::getRowsSentAvg)
                .set(rowsExaminedAvg).equalTo(record::getRowsExaminedAvg)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(digest).equalTo(record::getDigest)
                .set(query).equalTo(record::getQuery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.478152+08:00", comments="Source Table: x$statements_with_full_table_scans")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XStatementsWithFullTableScans record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalToWhenPresent(record::getDb)
                .set(execCount).equalToWhenPresent(record::getExecCount)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(noIndexUsedCount).equalToWhenPresent(record::getNoIndexUsedCount)
                .set(noGoodIndexUsedCount).equalToWhenPresent(record::getNoGoodIndexUsedCount)
                .set(noIndexUsedPct).equalToWhenPresent(record::getNoIndexUsedPct)
                .set(rowsSent).equalToWhenPresent(record::getRowsSent)
                .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
                .set(rowsSentAvg).equalToWhenPresent(record::getRowsSentAvg)
                .set(rowsExaminedAvg).equalToWhenPresent(record::getRowsExaminedAvg)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(query).equalToWhenPresent(record::getQuery);
    }
}