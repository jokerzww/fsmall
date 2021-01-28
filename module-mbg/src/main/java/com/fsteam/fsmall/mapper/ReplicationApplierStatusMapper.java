package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationApplierStatusDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ReplicationApplierStatus;
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
public interface ReplicationApplierStatusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, serviceState, remainingDelay, countTransactionsRetries);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationApplierStatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationApplierStatusResult")
    Optional<ReplicationApplierStatus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationApplierStatusResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="SERVICE_STATE", property="serviceState", jdbcType=JdbcType.CHAR),
        @Result(column="REMAINING_DELAY", property="remainingDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="COUNT_TRANSACTIONS_RETRIES", property="countTransactionsRetries", jdbcType=JdbcType.BIGINT)
    })
    List<ReplicationApplierStatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationApplierStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationApplierStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    default int insert(ReplicationApplierStatus record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierStatus, c ->
            c.map(channelName).toProperty("channelName")
            .map(serviceState).toProperty("serviceState")
            .map(remainingDelay).toProperty("remainingDelay")
            .map(countTransactionsRetries).toProperty("countTransactionsRetries")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4961675+08:00", comments="Source Table: replication_applier_status")
    default int insertSelective(ReplicationApplierStatus record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierStatus, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(serviceState).toPropertyWhenPresent("serviceState", record::getServiceState)
            .map(remainingDelay).toPropertyWhenPresent("remainingDelay", record::getRemainingDelay)
            .map(countTransactionsRetries).toPropertyWhenPresent("countTransactionsRetries", record::getCountTransactionsRetries)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default Optional<ReplicationApplierStatus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationApplierStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default List<ReplicationApplierStatus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationApplierStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default List<ReplicationApplierStatus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationApplierStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default Optional<ReplicationApplierStatus> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationApplierStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationApplierStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(serviceState).equalTo(record::getServiceState)
                .set(remainingDelay).equalTo(record::getRemainingDelay)
                .set(countTransactionsRetries).equalTo(record::getCountTransactionsRetries);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationApplierStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(serviceState).equalToWhenPresent(record::getServiceState)
                .set(remainingDelay).equalToWhenPresent(record::getRemainingDelay)
                .set(countTransactionsRetries).equalToWhenPresent(record::getCountTransactionsRetries);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default int updateByPrimaryKey(ReplicationApplierStatus record) {
        return update(c ->
            c.set(serviceState).equalTo(record::getServiceState)
            .set(remainingDelay).equalTo(record::getRemainingDelay)
            .set(countTransactionsRetries).equalTo(record::getCountTransactionsRetries)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4971676+08:00", comments="Source Table: replication_applier_status")
    default int updateByPrimaryKeySelective(ReplicationApplierStatus record) {
        return update(c ->
            c.set(serviceState).equalToWhenPresent(record::getServiceState)
            .set(remainingDelay).equalToWhenPresent(record::getRemainingDelay)
            .set(countTransactionsRetries).equalToWhenPresent(record::getCountTransactionsRetries)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}