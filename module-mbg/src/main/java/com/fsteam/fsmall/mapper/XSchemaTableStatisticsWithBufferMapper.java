package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XSchemaTableStatisticsWithBufferDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XSchemaTableStatisticsWithBuffer;
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
public interface XSchemaTableStatisticsWithBufferMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, rowsFetched, fetchLatency, rowsInserted, insertLatency, rowsUpdated, updateLatency, rowsDeleted, deleteLatency, ioReadRequests, ioRead, ioReadLatency, ioWriteRequests, ioWrite, ioWriteLatency, ioMiscRequests, ioMiscLatency, innodbBufferAllocated, innodbBufferData, innodbBufferFree, innodbBufferPages, innodbBufferPagesHashed, innodbBufferPagesOld, innodbBufferRowsCached);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XSchemaTableStatisticsWithBuffer> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XSchemaTableStatisticsWithBufferResult")
    Optional<XSchemaTableStatisticsWithBuffer> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4361127+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XSchemaTableStatisticsWithBufferResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
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
        @Result(column="io_misc_latency", property="ioMiscLatency", jdbcType=JdbcType.DECIMAL),
        @Result(column="innodb_buffer_allocated", property="innodbBufferAllocated", jdbcType=JdbcType.DECIMAL),
        @Result(column="innodb_buffer_data", property="innodbBufferData", jdbcType=JdbcType.DECIMAL),
        @Result(column="innodb_buffer_free", property="innodbBufferFree", jdbcType=JdbcType.DECIMAL),
        @Result(column="innodb_buffer_pages", property="innodbBufferPages", jdbcType=JdbcType.BIGINT),
        @Result(column="innodb_buffer_pages_hashed", property="innodbBufferPagesHashed", jdbcType=JdbcType.BIGINT),
        @Result(column="innodb_buffer_pages_old", property="innodbBufferPagesOld", jdbcType=JdbcType.BIGINT),
        @Result(column="innodb_buffer_rows_cached", property="innodbBufferRowsCached", jdbcType=JdbcType.DECIMAL)
    })
    List<XSchemaTableStatisticsWithBuffer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XSchemaTableStatisticsWithBuffer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XSchemaTableStatisticsWithBuffer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default int insert(XSchemaTableStatisticsWithBuffer record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaTableStatisticsWithBuffer, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
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
            .map(innodbBufferAllocated).toProperty("innodbBufferAllocated")
            .map(innodbBufferData).toProperty("innodbBufferData")
            .map(innodbBufferFree).toProperty("innodbBufferFree")
            .map(innodbBufferPages).toProperty("innodbBufferPages")
            .map(innodbBufferPagesHashed).toProperty("innodbBufferPagesHashed")
            .map(innodbBufferPagesOld).toProperty("innodbBufferPagesOld")
            .map(innodbBufferRowsCached).toProperty("innodbBufferRowsCached")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default int insertSelective(XSchemaTableStatisticsWithBuffer record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaTableStatisticsWithBuffer, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
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
            .map(innodbBufferAllocated).toPropertyWhenPresent("innodbBufferAllocated", record::getInnodbBufferAllocated)
            .map(innodbBufferData).toPropertyWhenPresent("innodbBufferData", record::getInnodbBufferData)
            .map(innodbBufferFree).toPropertyWhenPresent("innodbBufferFree", record::getInnodbBufferFree)
            .map(innodbBufferPages).toPropertyWhenPresent("innodbBufferPages", record::getInnodbBufferPages)
            .map(innodbBufferPagesHashed).toPropertyWhenPresent("innodbBufferPagesHashed", record::getInnodbBufferPagesHashed)
            .map(innodbBufferPagesOld).toPropertyWhenPresent("innodbBufferPagesOld", record::getInnodbBufferPagesOld)
            .map(innodbBufferRowsCached).toPropertyWhenPresent("innodbBufferRowsCached", record::getInnodbBufferRowsCached)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default Optional<XSchemaTableStatisticsWithBuffer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XSchemaTableStatisticsWithBuffer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default List<XSchemaTableStatisticsWithBuffer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XSchemaTableStatisticsWithBuffer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default List<XSchemaTableStatisticsWithBuffer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XSchemaTableStatisticsWithBuffer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XSchemaTableStatisticsWithBuffer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    static UpdateDSL<UpdateModel> updateAllColumns(XSchemaTableStatisticsWithBuffer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
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
                .set(ioMiscLatency).equalTo(record::getIoMiscLatency)
                .set(innodbBufferAllocated).equalTo(record::getInnodbBufferAllocated)
                .set(innodbBufferData).equalTo(record::getInnodbBufferData)
                .set(innodbBufferFree).equalTo(record::getInnodbBufferFree)
                .set(innodbBufferPages).equalTo(record::getInnodbBufferPages)
                .set(innodbBufferPagesHashed).equalTo(record::getInnodbBufferPagesHashed)
                .set(innodbBufferPagesOld).equalTo(record::getInnodbBufferPagesOld)
                .set(innodbBufferRowsCached).equalTo(record::getInnodbBufferRowsCached);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4371139+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XSchemaTableStatisticsWithBuffer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
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
                .set(ioMiscLatency).equalToWhenPresent(record::getIoMiscLatency)
                .set(innodbBufferAllocated).equalToWhenPresent(record::getInnodbBufferAllocated)
                .set(innodbBufferData).equalToWhenPresent(record::getInnodbBufferData)
                .set(innodbBufferFree).equalToWhenPresent(record::getInnodbBufferFree)
                .set(innodbBufferPages).equalToWhenPresent(record::getInnodbBufferPages)
                .set(innodbBufferPagesHashed).equalToWhenPresent(record::getInnodbBufferPagesHashed)
                .set(innodbBufferPagesOld).equalToWhenPresent(record::getInnodbBufferPagesOld)
                .set(innodbBufferRowsCached).equalToWhenPresent(record::getInnodbBufferRowsCached);
    }
}