package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.InnodbIndexStatsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.InnodbIndexStats;
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
public interface InnodbIndexStatsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    BasicColumn[] selectList = BasicColumn.columnList(databaseName, tableName, indexName, statName, lastUpdate, statValue, sampleSize, statDescription);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbIndexStats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbIndexStatsResult")
    Optional<InnodbIndexStats> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbIndexStatsResult", value = {
        @Result(column="database_name", property="databaseName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="stat_name", property="statName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="stat_value", property="statValue", jdbcType=JdbcType.BIGINT),
        @Result(column="sample_size", property="sampleSize", jdbcType=JdbcType.BIGINT),
        @Result(column="stat_description", property="statDescription", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbIndexStats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbIndexStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbIndexStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    default int deleteByPrimaryKey(String databaseName_, String tableName_, String indexName_, String statName_) {
        return delete(c -> 
            c.where(databaseName, isEqualTo(databaseName_))
            .and(tableName, isEqualTo(tableName_))
            .and(indexName, isEqualTo(indexName_))
            .and(statName, isEqualTo(statName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    default int insert(InnodbIndexStats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbIndexStats, c ->
            c.map(databaseName).toProperty("databaseName")
            .map(tableName).toProperty("tableName")
            .map(indexName).toProperty("indexName")
            .map(statName).toProperty("statName")
            .map(lastUpdate).toProperty("lastUpdate")
            .map(statValue).toProperty("statValue")
            .map(sampleSize).toProperty("sampleSize")
            .map(statDescription).toProperty("statDescription")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4511257+08:00", comments="Source Table: innodb_index_stats")
    default int insertSelective(InnodbIndexStats record) {
        return MyBatis3Utils.insert(this::insert, record, innodbIndexStats, c ->
            c.map(databaseName).toPropertyWhenPresent("databaseName", record::getDatabaseName)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(indexName).toPropertyWhenPresent("indexName", record::getIndexName)
            .map(statName).toPropertyWhenPresent("statName", record::getStatName)
            .map(lastUpdate).toPropertyWhenPresent("lastUpdate", record::getLastUpdate)
            .map(statValue).toPropertyWhenPresent("statValue", record::getStatValue)
            .map(sampleSize).toPropertyWhenPresent("sampleSize", record::getSampleSize)
            .map(statDescription).toPropertyWhenPresent("statDescription", record::getStatDescription)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default Optional<InnodbIndexStats> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbIndexStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default List<InnodbIndexStats> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbIndexStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default List<InnodbIndexStats> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbIndexStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default Optional<InnodbIndexStats> selectByPrimaryKey(String databaseName_, String tableName_, String indexName_, String statName_) {
        return selectOne(c ->
            c.where(databaseName, isEqualTo(databaseName_))
            .and(tableName, isEqualTo(tableName_))
            .and(indexName, isEqualTo(indexName_))
            .and(statName, isEqualTo(statName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbIndexStats, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbIndexStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(databaseName).equalTo(record::getDatabaseName)
                .set(tableName).equalTo(record::getTableName)
                .set(indexName).equalTo(record::getIndexName)
                .set(statName).equalTo(record::getStatName)
                .set(lastUpdate).equalTo(record::getLastUpdate)
                .set(statValue).equalTo(record::getStatValue)
                .set(sampleSize).equalTo(record::getSampleSize)
                .set(statDescription).equalTo(record::getStatDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbIndexStats record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(databaseName).equalToWhenPresent(record::getDatabaseName)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(indexName).equalToWhenPresent(record::getIndexName)
                .set(statName).equalToWhenPresent(record::getStatName)
                .set(lastUpdate).equalToWhenPresent(record::getLastUpdate)
                .set(statValue).equalToWhenPresent(record::getStatValue)
                .set(sampleSize).equalToWhenPresent(record::getSampleSize)
                .set(statDescription).equalToWhenPresent(record::getStatDescription);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default int updateByPrimaryKey(InnodbIndexStats record) {
        return update(c ->
            c.set(lastUpdate).equalTo(record::getLastUpdate)
            .set(statValue).equalTo(record::getStatValue)
            .set(sampleSize).equalTo(record::getSampleSize)
            .set(statDescription).equalTo(record::getStatDescription)
            .where(databaseName, isEqualTo(record::getDatabaseName))
            .and(tableName, isEqualTo(record::getTableName))
            .and(indexName, isEqualTo(record::getIndexName))
            .and(statName, isEqualTo(record::getStatName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4521263+08:00", comments="Source Table: innodb_index_stats")
    default int updateByPrimaryKeySelective(InnodbIndexStats record) {
        return update(c ->
            c.set(lastUpdate).equalToWhenPresent(record::getLastUpdate)
            .set(statValue).equalToWhenPresent(record::getStatValue)
            .set(sampleSize).equalToWhenPresent(record::getSampleSize)
            .set(statDescription).equalToWhenPresent(record::getStatDescription)
            .where(databaseName, isEqualTo(record::getDatabaseName))
            .and(tableName, isEqualTo(record::getTableName))
            .and(indexName, isEqualTo(record::getIndexName))
            .and(statName, isEqualTo(record::getStatName))
        );
    }
}