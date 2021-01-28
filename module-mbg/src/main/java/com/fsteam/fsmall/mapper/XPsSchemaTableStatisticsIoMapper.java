package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XPsSchemaTableStatisticsIoDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XPsSchemaTableStatisticsIo;
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
public interface XPsSchemaTableStatisticsIoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    BasicColumn[] selectList = BasicColumn.columnList(tableSchema, tableName, countRead, sumNumberOfBytesRead, sumTimerRead, countWrite, sumNumberOfBytesWrite, sumTimerWrite, countMisc, sumTimerMisc);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XPsSchemaTableStatisticsIo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XPsSchemaTableStatisticsIoResult")
    Optional<XPsSchemaTableStatisticsIo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XPsSchemaTableStatisticsIoResult", value = {
        @Result(column="table_schema", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_read", property="countRead", jdbcType=JdbcType.DECIMAL),
        @Result(column="sum_number_of_bytes_read", property="sumNumberOfBytesRead", jdbcType=JdbcType.DECIMAL),
        @Result(column="sum_timer_read", property="sumTimerRead", jdbcType=JdbcType.DECIMAL),
        @Result(column="count_write", property="countWrite", jdbcType=JdbcType.DECIMAL),
        @Result(column="sum_number_of_bytes_write", property="sumNumberOfBytesWrite", jdbcType=JdbcType.DECIMAL),
        @Result(column="sum_timer_write", property="sumTimerWrite", jdbcType=JdbcType.DECIMAL),
        @Result(column="count_misc", property="countMisc", jdbcType=JdbcType.DECIMAL),
        @Result(column="sum_timer_misc", property="sumTimerMisc", jdbcType=JdbcType.DECIMAL)
    })
    List<XPsSchemaTableStatisticsIo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XPsSchemaTableStatisticsIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XPsSchemaTableStatisticsIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default int insert(XPsSchemaTableStatisticsIo record) {
        return MyBatis3Utils.insert(this::insert, record, XPsSchemaTableStatisticsIo, c ->
            c.map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(countRead).toProperty("countRead")
            .map(sumNumberOfBytesRead).toProperty("sumNumberOfBytesRead")
            .map(sumTimerRead).toProperty("sumTimerRead")
            .map(countWrite).toProperty("countWrite")
            .map(sumNumberOfBytesWrite).toProperty("sumNumberOfBytesWrite")
            .map(sumTimerWrite).toProperty("sumTimerWrite")
            .map(countMisc).toProperty("countMisc")
            .map(sumTimerMisc).toProperty("sumTimerMisc")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default int insertSelective(XPsSchemaTableStatisticsIo record) {
        return MyBatis3Utils.insert(this::insert, record, XPsSchemaTableStatisticsIo, c ->
            c.map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(sumNumberOfBytesRead).toPropertyWhenPresent("sumNumberOfBytesRead", record::getSumNumberOfBytesRead)
            .map(sumTimerRead).toPropertyWhenPresent("sumTimerRead", record::getSumTimerRead)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(sumNumberOfBytesWrite).toPropertyWhenPresent("sumNumberOfBytesWrite", record::getSumNumberOfBytesWrite)
            .map(sumTimerWrite).toPropertyWhenPresent("sumTimerWrite", record::getSumTimerWrite)
            .map(countMisc).toPropertyWhenPresent("countMisc", record::getCountMisc)
            .map(sumTimerMisc).toPropertyWhenPresent("sumTimerMisc", record::getSumTimerMisc)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default Optional<XPsSchemaTableStatisticsIo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XPsSchemaTableStatisticsIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default List<XPsSchemaTableStatisticsIo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XPsSchemaTableStatisticsIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default List<XPsSchemaTableStatisticsIo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XPsSchemaTableStatisticsIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XPsSchemaTableStatisticsIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    static UpdateDSL<UpdateModel> updateAllColumns(XPsSchemaTableStatisticsIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(countRead).equalTo(record::getCountRead)
                .set(sumNumberOfBytesRead).equalTo(record::getSumNumberOfBytesRead)
                .set(sumTimerRead).equalTo(record::getSumTimerRead)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(sumNumberOfBytesWrite).equalTo(record::getSumNumberOfBytesWrite)
                .set(sumTimerWrite).equalTo(record::getSumTimerWrite)
                .set(countMisc).equalTo(record::getCountMisc)
                .set(sumTimerMisc).equalTo(record::getSumTimerMisc);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5562211+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XPsSchemaTableStatisticsIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(sumNumberOfBytesRead).equalToWhenPresent(record::getSumNumberOfBytesRead)
                .set(sumTimerRead).equalToWhenPresent(record::getSumTimerRead)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(sumNumberOfBytesWrite).equalToWhenPresent(record::getSumNumberOfBytesWrite)
                .set(sumTimerWrite).equalToWhenPresent(record::getSumTimerWrite)
                .set(countMisc).equalToWhenPresent(record::getCountMisc)
                .set(sumTimerMisc).equalToWhenPresent(record::getSumTimerMisc);
    }
}