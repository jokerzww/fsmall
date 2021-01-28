package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.PasswordHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.PasswordHistory;
import java.util.Date;
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
public interface PasswordHistoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    BasicColumn[] selectList = BasicColumn.columnList(host, user, passwordTimestamp, password);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<PasswordHistory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PasswordHistoryResult")
    Optional<PasswordHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PasswordHistoryResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Password_timestamp", property="passwordTimestamp", jdbcType=JdbcType.TIMESTAMP, id=true),
        @Result(column="Password", property="password", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PasswordHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, passwordHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, passwordHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3990792+08:00", comments="Source Table: password_history")
    default int deleteByPrimaryKey(String host_, String user_, Date passwordTimestamp_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(passwordTimestamp, isEqualTo(passwordTimestamp_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default int insert(PasswordHistory record) {
        return MyBatis3Utils.insert(this::insert, record, passwordHistory, c ->
            c.map(host).toProperty("host")
            .map(user).toProperty("user")
            .map(passwordTimestamp).toProperty("passwordTimestamp")
            .map(password).toProperty("password")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default int insertSelective(PasswordHistory record) {
        return MyBatis3Utils.insert(this::insert, record, passwordHistory, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(passwordTimestamp).toPropertyWhenPresent("passwordTimestamp", record::getPasswordTimestamp)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default Optional<PasswordHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, passwordHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default List<PasswordHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, passwordHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default List<PasswordHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, passwordHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default Optional<PasswordHistory> selectByPrimaryKey(String host_, String user_, Date passwordTimestamp_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(passwordTimestamp, isEqualTo(passwordTimestamp_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, passwordHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    static UpdateDSL<UpdateModel> updateAllColumns(PasswordHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(user).equalTo(record::getUser)
                .set(passwordTimestamp).equalTo(record::getPasswordTimestamp)
                .set(password).equalTo(record::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PasswordHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(user).equalToWhenPresent(record::getUser)
                .set(passwordTimestamp).equalToWhenPresent(record::getPasswordTimestamp)
                .set(password).equalToWhenPresent(record::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default int updateByPrimaryKey(PasswordHistory record) {
        return update(c ->
            c.set(password).equalTo(record::getPassword)
            .where(host, isEqualTo(record::getHost))
            .and(user, isEqualTo(record::getUser))
            .and(passwordTimestamp, isEqualTo(record::getPasswordTimestamp))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4000794+08:00", comments="Source Table: password_history")
    default int updateByPrimaryKeySelective(PasswordHistory record) {
        return update(c ->
            c.set(password).equalToWhenPresent(record::getPassword)
            .where(host, isEqualTo(record::getHost))
            .and(user, isEqualTo(record::getUser))
            .and(passwordTimestamp, isEqualTo(record::getPasswordTimestamp))
        );
    }
}