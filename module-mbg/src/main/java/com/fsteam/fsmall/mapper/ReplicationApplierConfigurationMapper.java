package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationApplierConfigurationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ReplicationApplierConfiguration;
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
public interface ReplicationApplierConfigurationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, desiredDelay, requireRowFormat, requireTablePrimaryKeyCheck, privilegeChecksUser);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3260117+08:00", comments="Source Table: replication_applier_configuration")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationApplierConfiguration> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationApplierConfigurationResult")
    Optional<ReplicationApplierConfiguration> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationApplierConfigurationResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="DESIRED_DELAY", property="desiredDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="REQUIRE_ROW_FORMAT", property="requireRowFormat", jdbcType=JdbcType.CHAR),
        @Result(column="REQUIRE_TABLE_PRIMARY_KEY_CHECK", property="requireTablePrimaryKeyCheck", jdbcType=JdbcType.CHAR),
        @Result(column="PRIVILEGE_CHECKS_USER", property="privilegeChecksUser", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ReplicationApplierConfiguration> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationApplierConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationApplierConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int insert(ReplicationApplierConfiguration record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierConfiguration, c ->
            c.map(channelName).toProperty("channelName")
            .map(desiredDelay).toProperty("desiredDelay")
            .map(requireRowFormat).toProperty("requireRowFormat")
            .map(requireTablePrimaryKeyCheck).toProperty("requireTablePrimaryKeyCheck")
            .map(privilegeChecksUser).toProperty("privilegeChecksUser")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int insertSelective(ReplicationApplierConfiguration record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierConfiguration, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(desiredDelay).toPropertyWhenPresent("desiredDelay", record::getDesiredDelay)
            .map(requireRowFormat).toPropertyWhenPresent("requireRowFormat", record::getRequireRowFormat)
            .map(requireTablePrimaryKeyCheck).toPropertyWhenPresent("requireTablePrimaryKeyCheck", record::getRequireTablePrimaryKeyCheck)
            .map(privilegeChecksUser).toPropertyWhenPresent("privilegeChecksUser", record::getPrivilegeChecksUser)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default Optional<ReplicationApplierConfiguration> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationApplierConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default List<ReplicationApplierConfiguration> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationApplierConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default List<ReplicationApplierConfiguration> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationApplierConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default Optional<ReplicationApplierConfiguration> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationApplierConfiguration, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationApplierConfiguration record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(desiredDelay).equalTo(record::getDesiredDelay)
                .set(requireRowFormat).equalTo(record::getRequireRowFormat)
                .set(requireTablePrimaryKeyCheck).equalTo(record::getRequireTablePrimaryKeyCheck)
                .set(privilegeChecksUser).equalTo(record::getPrivilegeChecksUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationApplierConfiguration record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(desiredDelay).equalToWhenPresent(record::getDesiredDelay)
                .set(requireRowFormat).equalToWhenPresent(record::getRequireRowFormat)
                .set(requireTablePrimaryKeyCheck).equalToWhenPresent(record::getRequireTablePrimaryKeyCheck)
                .set(privilegeChecksUser).equalToWhenPresent(record::getPrivilegeChecksUser);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int updateByPrimaryKey(ReplicationApplierConfiguration record) {
        return update(c ->
            c.set(desiredDelay).equalTo(record::getDesiredDelay)
            .set(requireRowFormat).equalTo(record::getRequireRowFormat)
            .set(requireTablePrimaryKeyCheck).equalTo(record::getRequireTablePrimaryKeyCheck)
            .set(privilegeChecksUser).equalTo(record::getPrivilegeChecksUser)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3270122+08:00", comments="Source Table: replication_applier_configuration")
    default int updateByPrimaryKeySelective(ReplicationApplierConfiguration record) {
        return update(c ->
            c.set(desiredDelay).equalToWhenPresent(record::getDesiredDelay)
            .set(requireRowFormat).equalToWhenPresent(record::getRequireRowFormat)
            .set(requireTablePrimaryKeyCheck).equalToWhenPresent(record::getRequireTablePrimaryKeyCheck)
            .set(privilegeChecksUser).equalToWhenPresent(record::getPrivilegeChecksUser)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}