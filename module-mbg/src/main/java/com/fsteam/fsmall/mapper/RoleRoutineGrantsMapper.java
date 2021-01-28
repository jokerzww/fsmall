package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.RoleRoutineGrantsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.RoleRoutineGrants;
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
public interface RoleRoutineGrantsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    BasicColumn[] selectList = BasicColumn.columnList(grantor, grantorHost, grantee, granteeHost, specificCatalog, specificSchema, specificName, routineCatalog, routineSchema, routineName, privilegeType, isGrantable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1918903+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RoleRoutineGrants> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleRoutineGrantsResult")
    Optional<RoleRoutineGrants> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleRoutineGrantsResult", value = {
        @Result(column="GRANTOR", property="grantor", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTOR_HOST", property="grantorHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.CHAR),
        @Result(column="GRANTEE_HOST", property="granteeHost", jdbcType=JdbcType.CHAR),
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.CHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.CHAR),
        @Result(column="ROUTINE_CATALOG", property="routineCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_SCHEMA", property="routineSchema", jdbcType=JdbcType.CHAR),
        @Result(column="ROUTINE_NAME", property="routineName", jdbcType=JdbcType.CHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.CHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<RoleRoutineGrants> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleRoutineGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleRoutineGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default int insert(RoleRoutineGrants record) {
        return MyBatis3Utils.insert(this::insert, record, roleRoutineGrants, c ->
            c.map(grantor).toProperty("grantor")
            .map(grantorHost).toProperty("grantorHost")
            .map(grantee).toProperty("grantee")
            .map(granteeHost).toProperty("granteeHost")
            .map(specificCatalog).toProperty("specificCatalog")
            .map(specificSchema).toProperty("specificSchema")
            .map(specificName).toProperty("specificName")
            .map(routineCatalog).toProperty("routineCatalog")
            .map(routineSchema).toProperty("routineSchema")
            .map(routineName).toProperty("routineName")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default int insertSelective(RoleRoutineGrants record) {
        return MyBatis3Utils.insert(this::insert, record, roleRoutineGrants, c ->
            c.map(grantor).toPropertyWhenPresent("grantor", record::getGrantor)
            .map(grantorHost).toPropertyWhenPresent("grantorHost", record::getGrantorHost)
            .map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(granteeHost).toPropertyWhenPresent("granteeHost", record::getGranteeHost)
            .map(specificCatalog).toPropertyWhenPresent("specificCatalog", record::getSpecificCatalog)
            .map(specificSchema).toPropertyWhenPresent("specificSchema", record::getSpecificSchema)
            .map(specificName).toPropertyWhenPresent("specificName", record::getSpecificName)
            .map(routineCatalog).toPropertyWhenPresent("routineCatalog", record::getRoutineCatalog)
            .map(routineSchema).toPropertyWhenPresent("routineSchema", record::getRoutineSchema)
            .map(routineName).toPropertyWhenPresent("routineName", record::getRoutineName)
            .map(privilegeType).toPropertyWhenPresent("privilegeType", record::getPrivilegeType)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default Optional<RoleRoutineGrants> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleRoutineGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default List<RoleRoutineGrants> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleRoutineGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default List<RoleRoutineGrants> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleRoutineGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleRoutineGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleRoutineGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantor).equalTo(record::getGrantor)
                .set(grantorHost).equalTo(record::getGrantorHost)
                .set(grantee).equalTo(record::getGrantee)
                .set(granteeHost).equalTo(record::getGranteeHost)
                .set(specificCatalog).equalTo(record::getSpecificCatalog)
                .set(specificSchema).equalTo(record::getSpecificSchema)
                .set(specificName).equalTo(record::getSpecificName)
                .set(routineCatalog).equalTo(record::getRoutineCatalog)
                .set(routineSchema).equalTo(record::getRoutineSchema)
                .set(routineName).equalTo(record::getRoutineName)
                .set(privilegeType).equalTo(record::getPrivilegeType)
                .set(isGrantable).equalTo(record::getIsGrantable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1928915+08:00", comments="Source Table: ROLE_ROUTINE_GRANTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleRoutineGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantor).equalToWhenPresent(record::getGrantor)
                .set(grantorHost).equalToWhenPresent(record::getGrantorHost)
                .set(grantee).equalToWhenPresent(record::getGrantee)
                .set(granteeHost).equalToWhenPresent(record::getGranteeHost)
                .set(specificCatalog).equalToWhenPresent(record::getSpecificCatalog)
                .set(specificSchema).equalToWhenPresent(record::getSpecificSchema)
                .set(specificName).equalToWhenPresent(record::getSpecificName)
                .set(routineCatalog).equalToWhenPresent(record::getRoutineCatalog)
                .set(routineSchema).equalToWhenPresent(record::getRoutineSchema)
                .set(routineName).equalToWhenPresent(record::getRoutineName)
                .set(privilegeType).equalToWhenPresent(record::getPrivilegeType)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable);
    }
}