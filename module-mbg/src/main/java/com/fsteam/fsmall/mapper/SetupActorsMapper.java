package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SetupActorsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SetupActors;
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
public interface SetupActorsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    BasicColumn[] selectList = BasicColumn.columnList(host, user, role, enabled, history);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SetupActors> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SetupActorsResult")
    Optional<SetupActors> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SetupActorsResult", value = {
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ROLE", property="role", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ENABLED", property="enabled", jdbcType=JdbcType.CHAR),
        @Result(column="HISTORY", property="history", jdbcType=JdbcType.CHAR)
    })
    List<SetupActors> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, setupActors, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, setupActors, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int deleteByPrimaryKey(String host_, String user_, String role_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(role, isEqualTo(role_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int insert(SetupActors record) {
        return MyBatis3Utils.insert(this::insert, record, setupActors, c ->
            c.map(host).toProperty("host")
            .map(user).toProperty("user")
            .map(role).toProperty("role")
            .map(enabled).toProperty("enabled")
            .map(history).toProperty("history")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int insertSelective(SetupActors record) {
        return MyBatis3Utils.insert(this::insert, record, setupActors, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(role).toPropertyWhenPresent("role", record::getRole)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
            .map(history).toPropertyWhenPresent("history", record::getHistory)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default Optional<SetupActors> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, setupActors, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default List<SetupActors> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, setupActors, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default List<SetupActors> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, setupActors, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default Optional<SetupActors> selectByPrimaryKey(String host_, String user_, String role_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(role, isEqualTo(role_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, setupActors, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    static UpdateDSL<UpdateModel> updateAllColumns(SetupActors record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(user).equalTo(record::getUser)
                .set(role).equalTo(record::getRole)
                .set(enabled).equalTo(record::getEnabled)
                .set(history).equalTo(record::getHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SetupActors record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(user).equalToWhenPresent(record::getUser)
                .set(role).equalToWhenPresent(record::getRole)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(history).equalToWhenPresent(record::getHistory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int updateByPrimaryKey(SetupActors record) {
        return update(c ->
            c.set(enabled).equalTo(record::getEnabled)
            .set(history).equalTo(record::getHistory)
            .where(host, isEqualTo(record::getHost))
            .and(user, isEqualTo(record::getUser))
            .and(role, isEqualTo(record::getRole))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2249196+08:00", comments="Source Table: setup_actors")
    default int updateByPrimaryKeySelective(SetupActors record) {
        return update(c ->
            c.set(enabled).equalToWhenPresent(record::getEnabled)
            .set(history).equalToWhenPresent(record::getHistory)
            .where(host, isEqualTo(record::getHost))
            .and(user, isEqualTo(record::getUser))
            .and(role, isEqualTo(record::getRole))
        );
    }
}