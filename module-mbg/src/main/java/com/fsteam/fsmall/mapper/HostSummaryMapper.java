package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HostSummaryDynamicSqlSupport.*;

import com.fsteam.fsmall.model.HostSummary;
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
public interface HostSummaryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    BasicColumn[] selectList = BasicColumn.columnList(host, statements, statementLatency, statementAvgLatency, tableScans, fileIos, fileIoLatency, currentConnections, totalConnections, uniqueUsers, currentMemory, totalMemoryAllocated);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HostSummary> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HostSummaryResult")
    Optional<HostSummary> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HostSummaryResult", value = {
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="statements", property="statements", jdbcType=JdbcType.DECIMAL),
        @Result(column="statement_latency", property="statementLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="statement_avg_latency", property="statementAvgLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_scans", property="tableScans", jdbcType=JdbcType.DECIMAL),
        @Result(column="file_ios", property="fileIos", jdbcType=JdbcType.DECIMAL),
        @Result(column="file_io_latency", property="fileIoLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_connections", property="currentConnections", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_connections", property="totalConnections", jdbcType=JdbcType.DECIMAL),
        @Result(column="unique_users", property="uniqueUsers", jdbcType=JdbcType.BIGINT),
        @Result(column="current_memory", property="currentMemory", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_memory_allocated", property="totalMemoryAllocated", jdbcType=JdbcType.VARCHAR)
    })
    List<HostSummary> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hostSummary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hostSummary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default int insert(HostSummary record) {
        return MyBatis3Utils.insert(this::insert, record, hostSummary, c ->
            c.map(host).toProperty("host")
            .map(statements).toProperty("statements")
            .map(statementLatency).toProperty("statementLatency")
            .map(statementAvgLatency).toProperty("statementAvgLatency")
            .map(tableScans).toProperty("tableScans")
            .map(fileIos).toProperty("fileIos")
            .map(fileIoLatency).toProperty("fileIoLatency")
            .map(currentConnections).toProperty("currentConnections")
            .map(totalConnections).toProperty("totalConnections")
            .map(uniqueUsers).toProperty("uniqueUsers")
            .map(currentMemory).toProperty("currentMemory")
            .map(totalMemoryAllocated).toProperty("totalMemoryAllocated")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default int insertSelective(HostSummary record) {
        return MyBatis3Utils.insert(this::insert, record, hostSummary, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(statements).toPropertyWhenPresent("statements", record::getStatements)
            .map(statementLatency).toPropertyWhenPresent("statementLatency", record::getStatementLatency)
            .map(statementAvgLatency).toPropertyWhenPresent("statementAvgLatency", record::getStatementAvgLatency)
            .map(tableScans).toPropertyWhenPresent("tableScans", record::getTableScans)
            .map(fileIos).toPropertyWhenPresent("fileIos", record::getFileIos)
            .map(fileIoLatency).toPropertyWhenPresent("fileIoLatency", record::getFileIoLatency)
            .map(currentConnections).toPropertyWhenPresent("currentConnections", record::getCurrentConnections)
            .map(totalConnections).toPropertyWhenPresent("totalConnections", record::getTotalConnections)
            .map(uniqueUsers).toPropertyWhenPresent("uniqueUsers", record::getUniqueUsers)
            .map(currentMemory).toPropertyWhenPresent("currentMemory", record::getCurrentMemory)
            .map(totalMemoryAllocated).toPropertyWhenPresent("totalMemoryAllocated", record::getTotalMemoryAllocated)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default Optional<HostSummary> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hostSummary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default List<HostSummary> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hostSummary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default List<HostSummary> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hostSummary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hostSummary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    static UpdateDSL<UpdateModel> updateAllColumns(HostSummary record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(statements).equalTo(record::getStatements)
                .set(statementLatency).equalTo(record::getStatementLatency)
                .set(statementAvgLatency).equalTo(record::getStatementAvgLatency)
                .set(tableScans).equalTo(record::getTableScans)
                .set(fileIos).equalTo(record::getFileIos)
                .set(fileIoLatency).equalTo(record::getFileIoLatency)
                .set(currentConnections).equalTo(record::getCurrentConnections)
                .set(totalConnections).equalTo(record::getTotalConnections)
                .set(uniqueUsers).equalTo(record::getUniqueUsers)
                .set(currentMemory).equalTo(record::getCurrentMemory)
                .set(totalMemoryAllocated).equalTo(record::getTotalMemoryAllocated);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5031731+08:00", comments="Source Table: host_summary")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HostSummary record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(statements).equalToWhenPresent(record::getStatements)
                .set(statementLatency).equalToWhenPresent(record::getStatementLatency)
                .set(statementAvgLatency).equalToWhenPresent(record::getStatementAvgLatency)
                .set(tableScans).equalToWhenPresent(record::getTableScans)
                .set(fileIos).equalToWhenPresent(record::getFileIos)
                .set(fileIoLatency).equalToWhenPresent(record::getFileIoLatency)
                .set(currentConnections).equalToWhenPresent(record::getCurrentConnections)
                .set(totalConnections).equalToWhenPresent(record::getTotalConnections)
                .set(uniqueUsers).equalToWhenPresent(record::getUniqueUsers)
                .set(currentMemory).equalToWhenPresent(record::getCurrentMemory)
                .set(totalMemoryAllocated).equalToWhenPresent(record::getTotalMemoryAllocated);
    }
}