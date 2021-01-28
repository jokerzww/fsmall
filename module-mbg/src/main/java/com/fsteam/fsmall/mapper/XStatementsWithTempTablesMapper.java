package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XStatementsWithTempTablesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XStatementsWithTempTables;
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
public interface XStatementsWithTempTablesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    BasicColumn[] selectList = BasicColumn.columnList(db, execCount, totalLatency, memoryTmpTables, diskTmpTables, avgTmpTablesPerQuery, tmpTablesToDiskPct, firstSeen, lastSeen, digest, query);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XStatementsWithTempTables> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XStatementsWithTempTablesResult")
    Optional<XStatementsWithTempTables> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XStatementsWithTempTablesResult", value = {
        @Result(column="db", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="exec_count", property="execCount", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="memory_tmp_tables", property="memoryTmpTables", jdbcType=JdbcType.BIGINT),
        @Result(column="disk_tmp_tables", property="diskTmpTables", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_tmp_tables_per_query", property="avgTmpTablesPerQuery", jdbcType=JdbcType.DECIMAL),
        @Result(column="tmp_tables_to_disk_pct", property="tmpTablesToDiskPct", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_seen", property="firstSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_seen", property="lastSeen", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="digest", property="digest", jdbcType=JdbcType.VARCHAR),
        @Result(column="query", property="query", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<XStatementsWithTempTables> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XStatementsWithTempTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XStatementsWithTempTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2049035+08:00", comments="Source Table: x$statements_with_temp_tables")
    default int insert(XStatementsWithTempTables record) {
        return MyBatis3Utils.insert(this::insert, record, XStatementsWithTempTables, c ->
            c.map(db).toProperty("db")
            .map(execCount).toProperty("execCount")
            .map(totalLatency).toProperty("totalLatency")
            .map(memoryTmpTables).toProperty("memoryTmpTables")
            .map(diskTmpTables).toProperty("diskTmpTables")
            .map(avgTmpTablesPerQuery).toProperty("avgTmpTablesPerQuery")
            .map(tmpTablesToDiskPct).toProperty("tmpTablesToDiskPct")
            .map(firstSeen).toProperty("firstSeen")
            .map(lastSeen).toProperty("lastSeen")
            .map(digest).toProperty("digest")
            .map(query).toProperty("query")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    default int insertSelective(XStatementsWithTempTables record) {
        return MyBatis3Utils.insert(this::insert, record, XStatementsWithTempTables, c ->
            c.map(db).toPropertyWhenPresent("db", record::getDb)
            .map(execCount).toPropertyWhenPresent("execCount", record::getExecCount)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(memoryTmpTables).toPropertyWhenPresent("memoryTmpTables", record::getMemoryTmpTables)
            .map(diskTmpTables).toPropertyWhenPresent("diskTmpTables", record::getDiskTmpTables)
            .map(avgTmpTablesPerQuery).toPropertyWhenPresent("avgTmpTablesPerQuery", record::getAvgTmpTablesPerQuery)
            .map(tmpTablesToDiskPct).toPropertyWhenPresent("tmpTablesToDiskPct", record::getTmpTablesToDiskPct)
            .map(firstSeen).toPropertyWhenPresent("firstSeen", record::getFirstSeen)
            .map(lastSeen).toPropertyWhenPresent("lastSeen", record::getLastSeen)
            .map(digest).toPropertyWhenPresent("digest", record::getDigest)
            .map(query).toPropertyWhenPresent("query", record::getQuery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    default Optional<XStatementsWithTempTables> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XStatementsWithTempTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    default List<XStatementsWithTempTables> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XStatementsWithTempTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    default List<XStatementsWithTempTables> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XStatementsWithTempTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XStatementsWithTempTables, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    static UpdateDSL<UpdateModel> updateAllColumns(XStatementsWithTempTables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalTo(record::getDb)
                .set(execCount).equalTo(record::getExecCount)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(memoryTmpTables).equalTo(record::getMemoryTmpTables)
                .set(diskTmpTables).equalTo(record::getDiskTmpTables)
                .set(avgTmpTablesPerQuery).equalTo(record::getAvgTmpTablesPerQuery)
                .set(tmpTablesToDiskPct).equalTo(record::getTmpTablesToDiskPct)
                .set(firstSeen).equalTo(record::getFirstSeen)
                .set(lastSeen).equalTo(record::getLastSeen)
                .set(digest).equalTo(record::getDigest)
                .set(query).equalTo(record::getQuery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2059038+08:00", comments="Source Table: x$statements_with_temp_tables")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XStatementsWithTempTables record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(db).equalToWhenPresent(record::getDb)
                .set(execCount).equalToWhenPresent(record::getExecCount)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(memoryTmpTables).equalToWhenPresent(record::getMemoryTmpTables)
                .set(diskTmpTables).equalToWhenPresent(record::getDiskTmpTables)
                .set(avgTmpTablesPerQuery).equalToWhenPresent(record::getAvgTmpTablesPerQuery)
                .set(tmpTablesToDiskPct).equalToWhenPresent(record::getTmpTablesToDiskPct)
                .set(firstSeen).equalToWhenPresent(record::getFirstSeen)
                .set(lastSeen).equalToWhenPresent(record::getLastSeen)
                .set(digest).equalToWhenPresent(record::getDigest)
                .set(query).equalToWhenPresent(record::getQuery);
    }
}