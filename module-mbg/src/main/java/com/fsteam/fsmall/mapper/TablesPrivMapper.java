package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.TablesPrivDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.TablesPriv;
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
public interface TablesPrivMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    BasicColumn[] selectList = BasicColumn.columnList(host, db, user, tableName, grantor, timestamp, tablePriv, columnPriv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TablesPriv> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TablesPrivResult")
    Optional<TablesPriv> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TablesPrivResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Db", property="db", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Table_name", property="tableName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Grantor", property="grantor", jdbcType=JdbcType.VARCHAR),
        @Result(column="Timestamp", property="timestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Table_priv", property="tablePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Column_priv", property="columnPriv", jdbcType=JdbcType.CHAR)
    })
    List<TablesPriv> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tablesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tablesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default int deleteByPrimaryKey(String host_, String db_, String user_, String tableName_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
            .and(tableName, isEqualTo(tableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default int insert(TablesPriv record) {
        return MyBatis3Utils.insert(this::insert, record, tablesPriv, c ->
            c.map(host).toProperty("host")
            .map(db).toProperty("db")
            .map(user).toProperty("user")
            .map(tableName).toProperty("tableName")
            .map(grantor).toProperty("grantor")
            .map(timestamp).toProperty("timestamp")
            .map(tablePriv).toProperty("tablePriv")
            .map(columnPriv).toProperty("columnPriv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default int insertSelective(TablesPriv record) {
        return MyBatis3Utils.insert(this::insert, record, tablesPriv, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(grantor).toPropertyWhenPresent("grantor", record::getGrantor)
            .map(timestamp).toPropertyWhenPresent("timestamp", record::getTimestamp)
            .map(tablePriv).toPropertyWhenPresent("tablePriv", record::getTablePriv)
            .map(columnPriv).toPropertyWhenPresent("columnPriv", record::getColumnPriv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default Optional<TablesPriv> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tablesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default List<TablesPriv> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tablesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default List<TablesPriv> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tablesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default Optional<TablesPriv> selectByPrimaryKey(String host_, String db_, String user_, String tableName_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
            .and(tableName, isEqualTo(tableName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tablesPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    static UpdateDSL<UpdateModel> updateAllColumns(TablesPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(db).equalTo(record::getDb)
                .set(user).equalTo(record::getUser)
                .set(tableName).equalTo(record::getTableName)
                .set(grantor).equalTo(record::getGrantor)
                .set(timestamp).equalTo(record::getTimestamp)
                .set(tablePriv).equalTo(record::getTablePriv)
                .set(columnPriv).equalTo(record::getColumnPriv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TablesPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(db).equalToWhenPresent(record::getDb)
                .set(user).equalToWhenPresent(record::getUser)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(grantor).equalToWhenPresent(record::getGrantor)
                .set(timestamp).equalToWhenPresent(record::getTimestamp)
                .set(tablePriv).equalToWhenPresent(record::getTablePriv)
                .set(columnPriv).equalToWhenPresent(record::getColumnPriv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    default int updateByPrimaryKey(TablesPriv record) {
        return update(c ->
            c.set(grantor).equalTo(record::getGrantor)
            .set(timestamp).equalTo(record::getTimestamp)
            .set(tablePriv).equalTo(record::getTablePriv)
            .set(columnPriv).equalTo(record::getColumnPriv)
            .where(host, isEqualTo(record::getHost))
            .and(db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
            .and(tableName, isEqualTo(record::getTableName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: tables_priv")
    default int updateByPrimaryKeySelective(TablesPriv record) {
        return update(c ->
            c.set(grantor).equalToWhenPresent(record::getGrantor)
            .set(timestamp).equalToWhenPresent(record::getTimestamp)
            .set(tablePriv).equalToWhenPresent(record::getTablePriv)
            .set(columnPriv).equalToWhenPresent(record::getColumnPriv)
            .where(host, isEqualTo(record::getHost))
            .and(db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
            .and(tableName, isEqualTo(record::getTableName))
        );
    }
}