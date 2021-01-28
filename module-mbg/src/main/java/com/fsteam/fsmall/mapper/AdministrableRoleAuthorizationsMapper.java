package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.AdministrableRoleAuthorizationsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.AdministrableRoleAuthorizations;
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
public interface AdministrableRoleAuthorizationsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    BasicColumn[] selectList = BasicColumn.columnList(user, host, grantee, granteeHost, roleName, roleHost, isGrantable, isDefault, isMandatory);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3970764+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AdministrableRoleAuthorizations> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AdministrableRoleAuthorizationsResult")
    Optional<AdministrableRoleAuthorizations> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AdministrableRoleAuthorizationsResult", value = {
        @Result(column="USER", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTEE_HOST", property="granteeHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_HOST", property="roleHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_MANDATORY", property="isMandatory", jdbcType=JdbcType.VARCHAR)
    })
    List<AdministrableRoleAuthorizations> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, administrableRoleAuthorizations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, administrableRoleAuthorizations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default int insert(AdministrableRoleAuthorizations record) {
        return MyBatis3Utils.insert(this::insert, record, administrableRoleAuthorizations, c ->
            c.map(user).toProperty("user")
            .map(host).toProperty("host")
            .map(grantee).toProperty("grantee")
            .map(granteeHost).toProperty("granteeHost")
            .map(roleName).toProperty("roleName")
            .map(roleHost).toProperty("roleHost")
            .map(isGrantable).toProperty("isGrantable")
            .map(isDefault).toProperty("isDefault")
            .map(isMandatory).toProperty("isMandatory")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default int insertSelective(AdministrableRoleAuthorizations record) {
        return MyBatis3Utils.insert(this::insert, record, administrableRoleAuthorizations, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(granteeHost).toPropertyWhenPresent("granteeHost", record::getGranteeHost)
            .map(roleName).toPropertyWhenPresent("roleName", record::getRoleName)
            .map(roleHost).toPropertyWhenPresent("roleHost", record::getRoleHost)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
            .map(isDefault).toPropertyWhenPresent("isDefault", record::getIsDefault)
            .map(isMandatory).toPropertyWhenPresent("isMandatory", record::getIsMandatory)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default Optional<AdministrableRoleAuthorizations> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, administrableRoleAuthorizations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default List<AdministrableRoleAuthorizations> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, administrableRoleAuthorizations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default List<AdministrableRoleAuthorizations> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, administrableRoleAuthorizations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, administrableRoleAuthorizations, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    static UpdateDSL<UpdateModel> updateAllColumns(AdministrableRoleAuthorizations record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(host).equalTo(record::getHost)
                .set(grantee).equalTo(record::getGrantee)
                .set(granteeHost).equalTo(record::getGranteeHost)
                .set(roleName).equalTo(record::getRoleName)
                .set(roleHost).equalTo(record::getRoleHost)
                .set(isGrantable).equalTo(record::getIsGrantable)
                .set(isDefault).equalTo(record::getIsDefault)
                .set(isMandatory).equalTo(record::getIsMandatory);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3980773+08:00", comments="Source Table: ADMINISTRABLE_ROLE_AUTHORIZATIONS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AdministrableRoleAuthorizations record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(host).equalToWhenPresent(record::getHost)
                .set(grantee).equalToWhenPresent(record::getGrantee)
                .set(granteeHost).equalToWhenPresent(record::getGranteeHost)
                .set(roleName).equalToWhenPresent(record::getRoleName)
                .set(roleHost).equalToWhenPresent(record::getRoleHost)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable)
                .set(isDefault).equalToWhenPresent(record::getIsDefault)
                .set(isMandatory).equalToWhenPresent(record::getIsMandatory);
    }
}