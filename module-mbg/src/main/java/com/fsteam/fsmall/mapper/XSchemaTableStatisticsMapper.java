package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XSchemaTableStatisticsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XSchemaTableStatistics;
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
public interface XSchemaTableStatisticsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, totalLatency, rowsFetched, fetchLatency, rowsInserted, insertLatency, rowsUpdated, updateLatency, rowsDeleted, deleteLatency, ioReadRequests, ioRead, ioReadLatency, ioWriteRequests, ioWrite, ioWriteLatency, ioMiscRequests, ioMiscLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XSchemaTableStatistics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XSchemaTableStatisticsResult")
    Optional<XSchemaTableStatistics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XSchemaTableStatisticsResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_fetched", property="rowsFetched", jdbcType=JdbcType.BIGINT),
        @Result(column="fetch_latency", property="fetchLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_inserted", property="rowsInserted", jdbcType=JdbcType.BIGINT),
        @Result(column="insert_latency", property="insertLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_updated", property="rowsUpdated", jdbcType=JdbcType.BIGINT),
        @Result(column="update_latency", property="updateLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_deleted", property="rowsDeleted", jdbcType=JdbcType.BIGINT),
        @Result(column="delete_latency", property="deleteLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="io_read_requests", property="ioReadRequests", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_read", property="ioRead", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_read_latency", property="ioReadLatency", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_write_requests", property="ioWriteRequests", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_write", property="ioWrite", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_write_latency", property="ioWriteLatency", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_misc_requests", property="ioMiscRequests", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_misc_latency", property="ioMiscLatency", jdbcType=JdbcType.DECIMAL)
    })
    List<XSchemaTableStatistics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XSchemaTableStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XSchemaTableStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default int insert(XSchemaTableStatistics record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaTableStatistics, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(totalLatency).toProperty("totalLatency")
            .map(rowsFetched).toProperty("rowsFetched")
            .map(fetchLatency).toProperty("fetchLatency")
            .map(rowsInserted).toProperty("rowsInserted")
            .map(insertLatency).toProperty("insertLatency")
            .map(rowsUpdated).toProperty("rowsUpdated")
            .map(updateLatency).toProperty("updateLatency")
            .map(rowsDeleted).toProperty("rowsDeleted")
            .map(deleteLatency).toProperty("deleteLatency")
            .map(ioReadRequests).toProperty("ioReadRequests")
            .map(ioRead).toProperty("ioRead")
            .map(ioReadLatency).toProperty("ioReadLatency")
            .map(ioWriteRequests).toProperty("ioWriteRequests")
            .map(ioWrite).toProperty("ioWrite")
            .map(ioWriteLatency).toProperty("ioWriteLatency")
            .map(ioMiscRequests).toProperty("ioMiscRequests")
            .map(ioMiscLatency).toProperty("ioMiscLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default int insertSelective(XSchemaTableStatistics record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaTableStatistics, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(rowsFetched).toPropertyWhenPresent("rowsFetched", record::getRowsFetched)
            .map(fetchLatency).toPropertyWhenPresent("fetchLatency", record::getFetchLatency)
            .map(rowsInserted).toPropertyWhenPresent("rowsInserted", record::getRowsInserted)
            .map(insertLatency).toPropertyWhenPresent("insertLatency", record::getInsertLatency)
            .map(rowsUpdated).toPropertyWhenPresent("rowsUpdated", record::getRowsUpdated)
            .map(updateLatency).toPropertyWhenPresent("updateLatency", record::getUpdateLatency)
            .map(rowsDeleted).toPropertyWhenPresent("rowsDeleted", record::getRowsDeleted)
            .map(deleteLatency).toPropertyWhenPresent("deleteLatency", record::getDeleteLatency)
            .map(ioReadRequests).toPropertyWhenPresent("ioReadRequests", record::getIoReadRequests)
            .map(ioRead).toPropertyWhenPresent("ioRead", record::getIoRead)
            .map(ioReadLatency).toPropertyWhenPresent("ioReadLatency", record::getIoReadLatency)
            .map(ioWriteRequests).toPropertyWhenPresent("ioWriteRequests", record::getIoWriteRequests)
            .map(ioWrite).toPropertyWhenPresent("ioWrite", record::getIoWrite)
            .map(ioWriteLatency).toPropertyWhenPresent("ioWriteLatency", record::getIoWriteLatency)
            .map(ioMiscRequests).toPropertyWhenPresent("ioMiscRequests", record::getIoMiscRequests)
            .map(ioMiscLatency).toPropertyWhenPresent("ioMiscLatency", record::getIoMiscLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default Optional<XSchemaTableStatistics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XSchemaTableStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default List<XSchemaTableStatistics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XSchemaTableStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default List<XSchemaTableStatistics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XSchemaTableStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XSchemaTableStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    static UpdateDSL<UpdateModel> updateAllColumns(XSchemaTableStatistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(rowsFetched).equalTo(record::getRowsFetched)
                .set(fetchLatency).equalTo(record::getFetchLatency)
                .set(rowsInserted).equalTo(record::getRowsInserted)
                .set(insertLatency).equalTo(record::getInsertLatency)
                .set(rowsUpdated).equalTo(record::getRowsUpdated)
                .set(updateLatency).equalTo(record::getUpdateLatency)
                .set(rowsDeleted).equalTo(record::getRowsDeleted)
                .set(deleteLatency).equalTo(record::getDeleteLatency)
                .set(ioReadRequests).equalTo(record::getIoReadRequests)
                .set(ioRead).equalTo(record::getIoRead)
                .set(ioReadLatency).equalTo(record::getIoReadLatency)
                .set(ioWriteRequests).equalTo(record::getIoWriteRequests)
                .set(ioWrite).equalTo(record::getIoWrite)
                .set(ioWriteLatency).equalTo(record::getIoWriteLatency)
                .set(ioMiscRequests).equalTo(record::getIoMiscRequests)
                .set(ioMiscLatency).equalTo(record::getIoMiscLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1908903+08:00", comments="Source Table: x$schema_table_statistics")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XSchemaTableStatistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(rowsFetched).equalToWhenPresent(record::getRowsFetched)
                .set(fetchLatency).equalToWhenPresent(record::getFetchLatency)
                .set(rowsInserted).equalToWhenPresent(record::getRowsInserted)
                .set(insertLatency).equalToWhenPresent(record::getInsertLatency)
                .set(rowsUpdated).equalToWhenPresent(record::getRowsUpdated)
                .set(updateLatency).equalToWhenPresent(record::getUpdateLatency)
                .set(rowsDeleted).equalToWhenPresent(record::getRowsDeleted)
                .set(deleteLatency).equalToWhenPresent(record::getDeleteLatency)
                .set(ioReadRequests).equalToWhenPresent(record::getIoReadRequests)
                .set(ioRead).equalToWhenPresent(record::getIoRead)
                .set(ioReadLatency).equalToWhenPresent(record::getIoReadLatency)
                .set(ioWriteRequests).equalToWhenPresent(record::getIoWriteRequests)
                .set(ioWrite).equalToWhenPresent(record::getIoWrite)
                .set(ioWriteLatency).equalToWhenPresent(record::getIoWriteLatency)
                .set(ioMiscRequests).equalToWhenPresent(record::getIoMiscRequests)
                .set(ioMiscLatency).equalToWhenPresent(record::getIoMiscLatency);
    }
}