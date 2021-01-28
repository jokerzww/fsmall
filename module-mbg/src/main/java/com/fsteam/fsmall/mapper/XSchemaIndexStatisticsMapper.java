package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XSchemaIndexStatisticsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XSchemaIndexStatistics;
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
public interface XSchemaIndexStatisticsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, indexName, rowsSelected, selectLatency, rowsInserted, insertLatency, rowsUpdated, updateLatency, rowsDeleted, deleteLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XSchemaIndexStatistics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XSchemaIndexStatisticsResult")
    Optional<XSchemaIndexStatistics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XSchemaIndexStatisticsResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="rows_selected", property="rowsSelected", jdbcType=JdbcType.BIGINT),
        @Result(column="select_latency", property="selectLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_inserted", property="rowsInserted", jdbcType=JdbcType.BIGINT),
        @Result(column="insert_latency", property="insertLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_updated", property="rowsUpdated", jdbcType=JdbcType.BIGINT),
        @Result(column="update_latency", property="updateLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_deleted", property="rowsDeleted", jdbcType=JdbcType.BIGINT),
        @Result(column="delete_latency", property="deleteLatency", jdbcType=JdbcType.BIGINT)
    })
    List<XSchemaIndexStatistics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XSchemaIndexStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XSchemaIndexStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    default int insert(XSchemaIndexStatistics record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaIndexStatistics, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(rowsSelected).toProperty("rowsSelected")
            .map(selectLatency).toProperty("selectLatency")
            .map(rowsInserted).toProperty("rowsInserted")
            .map(insertLatency).toProperty("insertLatency")
            .map(rowsUpdated).toProperty("rowsUpdated")
            .map(updateLatency).toProperty("updateLatency")
            .map(rowsDeleted).toProperty("rowsDeleted")
            .map(deleteLatency).toProperty("deleteLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5161858+08:00", comments="Source Table: x$schema_index_statistics")
    default int insertSelective(XSchemaIndexStatistics record) {
        return MyBatis3Utils.insert(this::insert, record, XSchemaIndexStatistics, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(rowsSelected).toPropertyWhenPresent("rowsSelected", record::getRowsSelected)
            .map(selectLatency).toPropertyWhenPresent("selectLatency", record::getSelectLatency)
            .map(rowsInserted).toPropertyWhenPresent("rowsInserted", record::getRowsInserted)
            .map(insertLatency).toPropertyWhenPresent("insertLatency", record::getInsertLatency)
            .map(rowsUpdated).toPropertyWhenPresent("rowsUpdated", record::getRowsUpdated)
            .map(updateLatency).toPropertyWhenPresent("updateLatency", record::getUpdateLatency)
            .map(rowsDeleted).toPropertyWhenPresent("rowsDeleted", record::getRowsDeleted)
            .map(deleteLatency).toPropertyWhenPresent("deleteLatency", record::getDeleteLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    default Optional<XSchemaIndexStatistics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XSchemaIndexStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    default List<XSchemaIndexStatistics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XSchemaIndexStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    default List<XSchemaIndexStatistics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XSchemaIndexStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XSchemaIndexStatistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    static UpdateDSL<UpdateModel> updateAllColumns(XSchemaIndexStatistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(indexName).equalTo(record::getIndexName)
                .set(rowsSelected).equalTo(record::getRowsSelected)
                .set(selectLatency).equalTo(record::getSelectLatency)
                .set(rowsInserted).equalTo(record::getRowsInserted)
                .set(insertLatency).equalTo(record::getInsertLatency)
                .set(rowsUpdated).equalTo(record::getRowsUpdated)
                .set(updateLatency).equalTo(record::getUpdateLatency)
                .set(rowsDeleted).equalTo(record::getRowsDeleted)
                .set(deleteLatency).equalTo(record::getDeleteLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: x$schema_index_statistics")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XSchemaIndexStatistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(rowsSelected).equalToWhenPresent(record::getRowsSelected)
                .set(selectLatency).equalToWhenPresent(record::getSelectLatency)
                .set(rowsInserted).equalToWhenPresent(record::getRowsInserted)
                .set(insertLatency).equalToWhenPresent(record::getInsertLatency)
                .set(rowsUpdated).equalToWhenPresent(record::getRowsUpdated)
                .set(updateLatency).equalToWhenPresent(record::getUpdateLatency)
                .set(rowsDeleted).equalToWhenPresent(record::getRowsDeleted)
                .set(deleteLatency).equalToWhenPresent(record::getDeleteLatency);
    }
}