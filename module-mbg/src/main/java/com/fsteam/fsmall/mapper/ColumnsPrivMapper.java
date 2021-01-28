package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ColumnsPrivDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ColumnsPriv;
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
public interface ColumnsPrivMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    BasicColumn[] selectList = BasicColumn.columnList(host, db, user, tableName, columnName, timestamp, columnPriv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ColumnsPriv> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ColumnsPrivResult")
    Optional<ColumnsPriv> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ColumnsPrivResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Db", property="db", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Table_name", property="tableName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Column_name", property="columnName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Timestamp", property="timestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Column_priv", property="columnPriv", jdbcType=JdbcType.CHAR)
    })
    List<ColumnsPriv> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, columnsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, columnsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int deleteByPrimaryKey(String host_, String db_, String user_, String tableName_, String columnName_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
            .and(tableName, isEqualTo(tableName_))
            .and(columnName, isEqualTo(columnName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int insert(ColumnsPriv record) {
        return MyBatis3Utils.insert(this::insert, record, columnsPriv, c ->
            c.map(host).toProperty("host")
            .map(db).toProperty("db")
            .map(user).toProperty("user")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(timestamp).toProperty("timestamp")
            .map(columnPriv).toProperty("columnPriv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int insertSelective(ColumnsPriv record) {
        return MyBatis3Utils.insert(this::insert, record, columnsPriv, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(timestamp).toPropertyWhenPresent("timestamp", record::getTimestamp)
            .map(columnPriv).toPropertyWhenPresent("columnPriv", record::getColumnPriv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default Optional<ColumnsPriv> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, columnsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default List<ColumnsPriv> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, columnsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default List<ColumnsPriv> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, columnsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default Optional<ColumnsPriv> selectByPrimaryKey(String host_, String db_, String user_, String tableName_, String columnName_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
            .and(tableName, isEqualTo(tableName_))
            .and(columnName, isEqualTo(columnName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, columnsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    static UpdateDSL<UpdateModel> updateAllColumns(ColumnsPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(db).equalTo(record::getDb)
                .set(user).equalTo(record::getUser)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(timestamp).equalTo(record::getTimestamp)
                .set(columnPriv).equalTo(record::getColumnPriv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ColumnsPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(db).equalToWhenPresent(record::getDb)
                .set(user).equalToWhenPresent(record::getUser)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(timestamp).equalToWhenPresent(record::getTimestamp)
                .set(columnPriv).equalToWhenPresent(record::getColumnPriv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int updateByPrimaryKey(ColumnsPriv record) {
        return update(c ->
            c.set(timestamp).equalTo(record::getTimestamp)
            .set(columnPriv).equalTo(record::getColumnPriv)
            .where(host, isEqualTo(record::getHost))
            .and(db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
            .and(tableName, isEqualTo(record::getTableName))
            .and(columnName, isEqualTo(record::getColumnName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source Table: columns_priv")
    default int updateByPrimaryKeySelective(ColumnsPriv record) {
        return update(c ->
            c.set(timestamp).equalToWhenPresent(record::getTimestamp)
            .set(columnPriv).equalToWhenPresent(record::getColumnPriv)
            .where(host, isEqualTo(record::getHost))
            .and(db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
            .and(tableName, isEqualTo(record::getTableName))
            .and(columnName, isEqualTo(record::getColumnName))
        );
    }
}