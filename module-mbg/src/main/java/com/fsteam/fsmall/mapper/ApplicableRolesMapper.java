package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ApplicableRolesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.ApplicableRoles;
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
public interface ApplicableRolesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    BasicColumn[] selectList = BasicColumn.columnList(user, host, grantee, granteeHost, roleName, roleHost, isGrantable, isDefault, isMandatory);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ApplicableRoles> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ApplicableRolesResult")
    Optional<ApplicableRoles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1698694+08:00", comments="Source Table: APPLICABLE_ROLES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ApplicableRolesResult", value = {
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
    List<ApplicableRoles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, applicableRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, applicableRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default int insert(ApplicableRoles record) {
        return MyBatis3Utils.insert(this::insert, record, applicableRoles, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default int insertSelective(ApplicableRoles record) {
        return MyBatis3Utils.insert(this::insert, record, applicableRoles, c ->
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default Optional<ApplicableRoles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, applicableRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default List<ApplicableRoles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, applicableRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default List<ApplicableRoles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, applicableRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, applicableRoles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    static UpdateDSL<UpdateModel> updateAllColumns(ApplicableRoles record, UpdateDSL<UpdateModel> dsl) {
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: APPLICABLE_ROLES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ApplicableRoles record, UpdateDSL<UpdateModel> dsl) {
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