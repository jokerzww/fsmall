package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.DefaultRolesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.DefaultRoles;
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
public interface DefaultRolesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    BasicColumn[] selectList = BasicColumn.columnList(host, user, defaultRoleHost, defaultRoleUser);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4911628+08:00", comments="Source Table: default_roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DefaultRoles> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DefaultRolesResult")
    Optional<DefaultRoles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DefaultRolesResult", value = {
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="DEFAULT_ROLE_HOST", property="defaultRoleHost", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="DEFAULT_ROLE_USER", property="defaultRoleUser", jdbcType=JdbcType.CHAR, id=true)
    })
    List<DefaultRoles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, defaultRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, defaultRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default int deleteByPrimaryKey(String host_, String user_, String defaultRoleHost_, String defaultRoleUser_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(user, isEqualTo(user_))
            .and(defaultRoleHost, isEqualTo(defaultRoleHost_))
            .and(defaultRoleUser, isEqualTo(defaultRoleUser_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default int insert(DefaultRoles record) {
        return MyBatis3Utils.insert(this::insert, record, defaultRoles, c ->
            c.map(host).toProperty("host")
            .map(user).toProperty("user")
            .map(defaultRoleHost).toProperty("defaultRoleHost")
            .map(defaultRoleUser).toProperty("defaultRoleUser")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default int insertSelective(DefaultRoles record) {
        return MyBatis3Utils.insert(this::insert, record, defaultRoles, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(defaultRoleHost).toPropertyWhenPresent("defaultRoleHost", record::getDefaultRoleHost)
            .map(defaultRoleUser).toPropertyWhenPresent("defaultRoleUser", record::getDefaultRoleUser)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default Optional<DefaultRoles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, defaultRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default List<DefaultRoles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, defaultRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default List<DefaultRoles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, defaultRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, defaultRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    static UpdateDSL<UpdateModel> updateAllColumns(DefaultRoles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(user).equalTo(record::getUser)
                .set(defaultRoleHost).equalTo(record::getDefaultRoleHost)
                .set(defaultRoleUser).equalTo(record::getDefaultRoleUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4921632+08:00", comments="Source Table: default_roles")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DefaultRoles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(user).equalToWhenPresent(record::getUser)
                .set(defaultRoleHost).equalToWhenPresent(record::getDefaultRoleHost)
                .set(defaultRoleUser).equalToWhenPresent(record::getDefaultRoleUser);
    }
}