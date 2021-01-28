package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.UsersDynamicSqlSupport.*;

import com.fsteam.fsmall.model.Users;
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
public interface UsersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    BasicColumn[] selectList = BasicColumn.columnList(user, currentConnections, totalConnections);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Users> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UsersResult")
    Optional<Users> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UsersResult", value = {
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="CURRENT_CONNECTIONS", property="currentConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="TOTAL_CONNECTIONS", property="totalConnections", jdbcType=JdbcType.BIGINT)
    })
    List<Users> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default int insert(Users record) {
        return MyBatis3Utils.insert(this::insert, record, users, c ->
            c.map(user).toProperty("user")
            .map(currentConnections).toProperty("currentConnections")
            .map(totalConnections).toProperty("totalConnections")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default int insertSelective(Users record) {
        return MyBatis3Utils.insert(this::insert, record, users, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(currentConnections).toPropertyWhenPresent("currentConnections", record::getCurrentConnections)
            .map(totalConnections).toPropertyWhenPresent("totalConnections", record::getTotalConnections)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default Optional<Users> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default List<Users> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default List<Users> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, users, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateAllColumns(Users record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(currentConnections).equalTo(record::getCurrentConnections)
                .set(totalConnections).equalTo(record::getTotalConnections);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Users record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(currentConnections).equalToWhenPresent(record::getCurrentConnections)
                .set(totalConnections).equalToWhenPresent(record::getTotalConnections);
    }
}