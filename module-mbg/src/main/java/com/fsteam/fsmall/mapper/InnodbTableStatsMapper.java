package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.InnodbTableStatsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.InnodbTableStats;
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
public interface InnodbTableStatsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    BasicColumn[] selectList = BasicColumn.columnList(databaseName, tableName, lastUpdate, nRows, clusteredIndexSize, sumOfOtherIndexSizes);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4080878+08:00", comments="Source Table: innodb_table_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbTableStats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbTableStatsResult")
    Optional<InnodbTableStats> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbTableStatsResult", value = {
        @Result(column="database_name", property="databaseName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="n_rows", property="nRows", jdbcType=JdbcType.BIGINT),
        @Result(column="clustered_index_size", property="clusteredIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="sum_of_other_index_sizes", property="sumOfOtherIndexSizes", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbTableStats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbTableStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbTableStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int deleteByPrimaryKey(String databaseName_, String tableName_) {
        return delete(c -> 
            c.where(databaseName, isEqualTo(databaseName_))
            .and(tableName, isEqualTo(tableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int insert(InnodbTableStats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTableStats, c ->
            c.map(databaseName).toProperty("databaseName")
            .map(tableName).toProperty("tableName")
            .map(lastUpdate).toProperty("lastUpdate")
            .map(nRows).toProperty("nRows")
            .map(clusteredIndexSize).toProperty("clusteredIndexSize")
            .map(sumOfOtherIndexSizes).toProperty("sumOfOtherIndexSizes")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int insertSelective(InnodbTableStats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbTableStats, c ->
            c.map(databaseName).toPropertyWhenPresent("databaseName", record::getDatabaseName)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(lastUpdate).toPropertyWhenPresent("lastUpdate", record::getLastUpdate)
            .map(nRows).toPropertyWhenPresent("nRows", record::getnRows)
            .map(clusteredIndexSize).toPropertyWhenPresent("clusteredIndexSize", record::getClusteredIndexSize)
            .map(sumOfOtherIndexSizes).toPropertyWhenPresent("sumOfOtherIndexSizes", record::getSumOfOtherIndexSizes)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default Optional<InnodbTableStats> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbTableStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default List<InnodbTableStats> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbTableStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default List<InnodbTableStats> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbTableStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default Optional<InnodbTableStats> selectByPrimaryKey(String databaseName_, String tableName_) {
        return selectOne(c ->
            c.where(databaseName, isEqualTo(databaseName_))
            .and(tableName, isEqualTo(tableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbTableStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbTableStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(databaseName).equalTo(record::getDatabaseName)
                .set(tableName).equalTo(record::getTableName)
                .set(lastUpdate).equalTo(record::getLastUpdate)
                .set(nRows).equalTo(record::getnRows)
                .set(clusteredIndexSize).equalTo(record::getClusteredIndexSize)
                .set(sumOfOtherIndexSizes).equalTo(record::getSumOfOtherIndexSizes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbTableStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(databaseName).equalToWhenPresent(record::getDatabaseName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(lastUpdate).equalToWhenPresent(record::getLastUpdate)
                .set(nRows).equalToWhenPresent(record::getnRows)
                .set(clusteredIndexSize).equalToWhenPresent(record::getClusteredIndexSize)
                .set(sumOfOtherIndexSizes).equalToWhenPresent(record::getSumOfOtherIndexSizes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int updateByPrimaryKey(InnodbTableStats record) {
        return update(c ->
            c.set(lastUpdate).equalTo(record::getLastUpdate)
            .set(nRows).equalTo(record::getnRows)
            .set(clusteredIndexSize).equalTo(record::getClusteredIndexSize)
            .set(sumOfOtherIndexSizes).equalTo(record::getSumOfOtherIndexSizes)
            .where(databaseName, isEqualTo(record::getDatabaseName))
            .and(tableName, isEqualTo(record::getTableName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4090873+08:00", comments="Source Table: innodb_table_stats")
    default int updateByPrimaryKeySelective(InnodbTableStats record) {
        return update(c ->
            c.set(lastUpdate).equalToWhenPresent(record::getLastUpdate)
            .set(nRows).equalToWhenPresent(record::getnRows)
            .set(clusteredIndexSize).equalToWhenPresent(record::getClusteredIndexSize)
            .set(sumOfOtherIndexSizes).equalToWhenPresent(record::getSumOfOtherIndexSizes)
            .where(databaseName, isEqualTo(record::getDatabaseName))
            .and(tableName, isEqualTo(record::getTableName))
        );
    }
}