package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.EnabledRolesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.EnabledRoles;
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
public interface EnabledRolesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    BasicColumn[] selectList = BasicColumn.columnList(roleName, roleHost, isDefault, isMandatory);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<EnabledRoles> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EnabledRolesResult")
    Optional<EnabledRoles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: ENABLED_ROLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EnabledRolesResult", value = {
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_HOST", property="roleHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_MANDATORY", property="isMandatory", jdbcType=JdbcType.VARCHAR)
    })
    List<EnabledRoles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, enabledRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, enabledRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default int insert(EnabledRoles record) {
        return MyBatis3Utils.insert(this::insert, record, enabledRoles, c ->
            c.map(roleName).toProperty("roleName")
            .map(roleHost).toProperty("roleHost")
            .map(isDefault).toProperty("isDefault")
            .map(isMandatory).toProperty("isMandatory")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default int insertSelective(EnabledRoles record) {
        return MyBatis3Utils.insert(this::insert, record, enabledRoles, c ->
            c.map(roleName).toPropertyWhenPresent("roleName", record::getRoleName)
            .map(roleHost).toPropertyWhenPresent("roleHost", record::getRoleHost)
            .map(isDefault).toPropertyWhenPresent("isDefault", record::getIsDefault)
            .map(isMandatory).toPropertyWhenPresent("isMandatory", record::getIsMandatory)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default Optional<EnabledRoles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, enabledRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default List<EnabledRoles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, enabledRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default List<EnabledRoles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, enabledRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, enabledRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    static UpdateDSL<UpdateModel> updateAllColumns(EnabledRoles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleName).equalTo(record::getRoleName)
                .set(roleHost).equalTo(record::getRoleHost)
                .set(isDefault).equalTo(record::getIsDefault)
                .set(isMandatory).equalTo(record::getIsMandatory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2889791+08:00", comments="Source Table: ENABLED_ROLES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(EnabledRoles record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleName).equalToWhenPresent(record::getRoleName)
                .set(roleHost).equalToWhenPresent(record::getRoleHost)
                .set(isDefault).equalToWhenPresent(record::getIsDefault)
                .set(isMandatory).equalToWhenPresent(record::getIsMandatory);
    }
}