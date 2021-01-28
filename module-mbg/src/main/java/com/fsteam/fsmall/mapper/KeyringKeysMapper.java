package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.KeyringKeysDynamicSqlSupport.*;

import com.fsteam.fsmall.model.KeyringKeys;
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
public interface KeyringKeysMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    BasicColumn[] selectList = BasicColumn.columnList(keyId, keyOwner, backendKeyId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<KeyringKeys> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("KeyringKeysResult")
    Optional<KeyringKeys> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="KeyringKeysResult", value = {
        @Result(column="KEY_ID", property="keyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="KEY_OWNER", property="keyOwner", jdbcType=JdbcType.VARCHAR),
        @Result(column="BACKEND_KEY_ID", property="backendKeyId", jdbcType=JdbcType.VARCHAR)
    })
    List<KeyringKeys> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, keyringKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, keyringKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default int insert(KeyringKeys record) {
        return MyBatis3Utils.insert(this::insert, record, keyringKeys, c ->
            c.map(keyId).toProperty("keyId")
            .map(keyOwner).toProperty("keyOwner")
            .map(backendKeyId).toProperty("backendKeyId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default int insertSelective(KeyringKeys record) {
        return MyBatis3Utils.insert(this::insert, record, keyringKeys, c ->
            c.map(keyId).toPropertyWhenPresent("keyId", record::getKeyId)
            .map(keyOwner).toPropertyWhenPresent("keyOwner", record::getKeyOwner)
            .map(backendKeyId).toPropertyWhenPresent("backendKeyId", record::getBackendKeyId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default Optional<KeyringKeys> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, keyringKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default List<KeyringKeys> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, keyringKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default List<KeyringKeys> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, keyringKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, keyringKeys, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    static UpdateDSL<UpdateModel> updateAllColumns(KeyringKeys record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(keyId).equalTo(record::getKeyId)
                .set(keyOwner).equalTo(record::getKeyOwner)
                .set(backendKeyId).equalTo(record::getBackendKeyId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: keyring_keys")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(KeyringKeys record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(keyId).equalToWhenPresent(record::getKeyId)
                .set(keyOwner).equalToWhenPresent(record::getKeyOwner)
                .set(backendKeyId).equalToWhenPresent(record::getBackendKeyId);
    }
}