package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SchemaTablesWithFullTableScansDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SchemaTablesWithFullTableScans;
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
public interface SchemaTablesWithFullTableScansMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    BasicColumn[] selectList = BasicColumn.columnList(objectSchema, objectName, rowsFullScanned, latency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SchemaTablesWithFullTableScans> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SchemaTablesWithFullTableScansResult")
    Optional<SchemaTablesWithFullTableScans> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SchemaTablesWithFullTableScansResult", value = {
        @Result(column="object_schema", property="objectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="object_name", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="rows_full_scanned", property="rowsFullScanned", jdbcType=JdbcType.BIGINT),
        @Result(column="latency", property="latency", jdbcType=JdbcType.VARCHAR)
    })
    List<SchemaTablesWithFullTableScans> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, schemaTablesWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, schemaTablesWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default int insert(SchemaTablesWithFullTableScans record) {
        return MyBatis3Utils.insert(this::insert, record, schemaTablesWithFullTableScans, c ->
            c.map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
            .map(rowsFullScanned).toProperty("rowsFullScanned")
            .map(latency).toProperty("latency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default int insertSelective(SchemaTablesWithFullTableScans record) {
        return MyBatis3Utils.insert(this::insert, record, schemaTablesWithFullTableScans, c ->
            c.map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
            .map(rowsFullScanned).toPropertyWhenPresent("rowsFullScanned", record::getRowsFullScanned)
            .map(latency).toPropertyWhenPresent("latency", record::getLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default Optional<SchemaTablesWithFullTableScans> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, schemaTablesWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default List<SchemaTablesWithFullTableScans> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, schemaTablesWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default List<SchemaTablesWithFullTableScans> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, schemaTablesWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, schemaTablesWithFullTableScans, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    static UpdateDSL<UpdateModel> updateAllColumns(SchemaTablesWithFullTableScans record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName)
                .set(rowsFullScanned).equalTo(record::getRowsFullScanned)
                .set(latency).equalTo(record::getLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1788793+08:00", comments="Source Table: schema_tables_with_full_table_scans")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SchemaTablesWithFullTableScans record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName)
                .set(rowsFullScanned).equalToWhenPresent(record::getRowsFullScanned)
                .set(latency).equalToWhenPresent(record::getLatency);
    }
}