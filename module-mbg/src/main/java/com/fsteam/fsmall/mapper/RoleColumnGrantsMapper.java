package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.RoleColumnGrantsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.RoleColumnGrants;
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
public interface RoleColumnGrantsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    BasicColumn[] selectList = BasicColumn.columnList(grantor, grantorHost, grantee, granteeHost, tableCatalog, tableSchema, tableName, columnName, privilegeType, isGrantable);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RoleColumnGrants> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleColumnGrantsResult")
    Optional<RoleColumnGrants> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleColumnGrantsResult", value = {
        @Result(column="GRANTOR", property="grantor", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTOR_HOST", property="grantorHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.CHAR),
        @Result(column="GRANTEE_HOST", property="granteeHost", jdbcType=JdbcType.CHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.CHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.CHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.CHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.CHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<RoleColumnGrants> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleColumnGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleColumnGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default int insert(RoleColumnGrants record) {
        return MyBatis3Utils.insert(this::insert, record, roleColumnGrants, c ->
            c.map(grantor).toProperty("grantor")
            .map(grantorHost).toProperty("grantorHost")
            .map(grantee).toProperty("grantee")
            .map(granteeHost).toProperty("granteeHost")
            .map(tableCatalog).toProperty("tableCatalog")
            .map(tableSchema).toProperty("tableSchema")
            .map(tableName).toProperty("tableName")
            .map(columnName).toProperty("columnName")
            .map(privilegeType).toProperty("privilegeType")
            .map(isGrantable).toProperty("isGrantable")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default int insertSelective(RoleColumnGrants record) {
        return MyBatis3Utils.insert(this::insert, record, roleColumnGrants, c ->
            c.map(grantor).toPropertyWhenPresent("grantor", record::getGrantor)
            .map(grantorHost).toPropertyWhenPresent("grantorHost", record::getGrantorHost)
            .map(grantee).toPropertyWhenPresent("grantee", record::getGrantee)
            .map(granteeHost).toPropertyWhenPresent("granteeHost", record::getGranteeHost)
            .map(tableCatalog).toPropertyWhenPresent("tableCatalog", record::getTableCatalog)
            .map(tableSchema).toPropertyWhenPresent("tableSchema", record::getTableSchema)
            .map(tableName).toPropertyWhenPresent("tableName", record::getTableName)
            .map(columnName).toPropertyWhenPresent("columnName", record::getColumnName)
            .map(privilegeType).toPropertyWhenPresent("privilegeType", record::getPrivilegeType)
            .map(isGrantable).toPropertyWhenPresent("isGrantable", record::getIsGrantable)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default Optional<RoleColumnGrants> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleColumnGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default List<RoleColumnGrants> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleColumnGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default List<RoleColumnGrants> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleColumnGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleColumnGrants, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleColumnGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantor).equalTo(record::getGrantor)
                .set(grantorHost).equalTo(record::getGrantorHost)
                .set(grantee).equalTo(record::getGrantee)
                .set(granteeHost).equalTo(record::getGranteeHost)
                .set(tableCatalog).equalTo(record::getTableCatalog)
                .set(tableSchema).equalTo(record::getTableSchema)
                .set(tableName).equalTo(record::getTableName)
                .set(columnName).equalTo(record::getColumnName)
                .set(privilegeType).equalTo(record::getPrivilegeType)
                .set(isGrantable).equalTo(record::getIsGrantable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2309256+08:00", comments="Source Table: ROLE_COLUMN_GRANTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleColumnGrants record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(grantor).equalToWhenPresent(record::getGrantor)
                .set(grantorHost).equalToWhenPresent(record::getGrantorHost)
                .set(grantee).equalToWhenPresent(record::getGrantee)
                .set(granteeHost).equalToWhenPresent(record::getGranteeHost)
                .set(tableCatalog).equalToWhenPresent(record::getTableCatalog)
                .set(tableSchema).equalToWhenPresent(record::getTableSchema)
                .set(tableName).equalToWhenPresent(record::getTableName)
                .set(columnName).equalToWhenPresent(record::getColumnName)
                .set(privilegeType).equalToWhenPresent(record::getPrivilegeType)
                .set(isGrantable).equalToWhenPresent(record::getIsGrantable);
    }
}