package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.RoleTableGrantsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.RoleTableGrants;
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
public interface RoleTableGrantsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    BasicColumn[] selectList = BasicColumn.columnList(grantor, grantorHost, grantee, granteeHost, tableCatalog, tableSchema, tableName, privilegeType, isGrantable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RoleTableGrants> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleTableGrantsResult")
    Optional<RoleTableGrants> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleTableGrantsResult", value = {
        @Result(column="GRANTOR", property="grantor", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTOR_HOST", property="grantorHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.CHAR),
        @Result(column="GRANTEE_HOST", property="granteeHost", jdbcType=JdbcType.CHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.CHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.CHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.CHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<RoleTableGrants> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleTableGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1408426+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleTableGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default int insert(RoleTableGrants record) {
        return MyBatis3Utils.insert(this::insert, record, roleTableGrants, c ->
            c.map(grantor).toProperty("grantor")
            .map(grantorHost).toProperty("grantorHost")
            .map(grantee).toProperty("grantee")
            .map(granteeHost).toProperty("granteeHost")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default int insertSelective(RoleTableGrants record) {
        return MyBatis3Utils.insert(this::insert, record, roleTableGrants, c ->
            c.map(grantor).toPropertyWhenPresent("grantor", record::getGrantor)
            .map(grantorHost).toPropertyWhenPresent("grantorHost", record::getGrantorHost)
            .map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(granteeHost).toPropertyWhenPresent("granteeHost", record::getGranteeHost)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(privilegeType).toPropertyWhenPresent("privilegeType", record::getPrivilegeType)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default Optional<RoleTableGrants> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleTableGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default List<RoleTableGrants> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleTableGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default List<RoleTableGrants> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleTableGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleTableGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleTableGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantor).equalTo(record::getGrantor)
                .set(grantorHost).equalTo(record::getGrantorHost)
                .set(grantee).equalTo(record::getGrantee)
                .set(granteeHost).equalTo(record::getGranteeHost)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(privilegeType).equalTo(record::getPrivilegeType)
                .set(isGrantable).equalTo(record::getIsGrantable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1418435+08:00", comments="Source Table: ROLE_TABLE_GRANTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleTableGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantor).equalToWhenPresent(record::getGrantor)
                .set(grantorHost).equalToWhenPresent(record::getGrantorHost)
                .set(grantee).equalToWhenPresent(record::getGrantee)
                .set(granteeHost).equalToWhenPresent(record::getGranteeHost)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(privilegeType).equalToWhenPresent(record::getPrivilegeType)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable);
    }
}