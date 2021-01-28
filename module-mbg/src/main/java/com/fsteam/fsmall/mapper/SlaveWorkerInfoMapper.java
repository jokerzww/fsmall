package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SlaveWorkerInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SlaveWorkerInfo;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface SlaveWorkerInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, id, relayLogPos, masterLogPos, checkpointRelayLogPos, checkpointMasterLogPos, checkpointSeqno, checkpointGroupSize, relayLogName, masterLogName, checkpointRelayLogName, checkpointMasterLogName, checkpointGroupBitmap);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SlaveWorkerInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SlaveWorkerInfoResult")
    Optional<SlaveWorkerInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SlaveWorkerInfoResult", value = {
        @Result(column="Channel_name", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Relay_log_pos", property="relayLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Master_log_pos", property="masterLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Checkpoint_relay_log_pos", property="checkpointRelayLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Checkpoint_master_log_pos", property="checkpointMasterLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Checkpoint_seqno", property="checkpointSeqno", jdbcType=JdbcType.INTEGER),
        @Result(column="Checkpoint_group_size", property="checkpointGroupSize", jdbcType=JdbcType.INTEGER),
        @Result(column="Relay_log_name", property="relayLogName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Master_log_name", property="masterLogName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Checkpoint_relay_log_name", property="checkpointRelayLogName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Checkpoint_master_log_name", property="checkpointMasterLogName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Checkpoint_group_bitmap", property="checkpointGroupBitmap", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<SlaveWorkerInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, slaveWorkerInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, slaveWorkerInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int deleteByPrimaryKey(String channelName_, Integer id_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
            .and(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int insert(SlaveWorkerInfo record) {
        return MyBatis3Utils.insert(this::insert, record, slaveWorkerInfo, c ->
            c.map(channelName).toProperty("channelName")
            .map(relayLogPos).toProperty("relayLogPos")
            .map(masterLogPos).toProperty("masterLogPos")
            .map(checkpointRelayLogPos).toProperty("checkpointRelayLogPos")
            .map(checkpointMasterLogPos).toProperty("checkpointMasterLogPos")
            .map(checkpointSeqno).toProperty("checkpointSeqno")
            .map(checkpointGroupSize).toProperty("checkpointGroupSize")
            .map(relayLogName).toProperty("relayLogName")
            .map(masterLogName).toProperty("masterLogName")
            .map(checkpointRelayLogName).toProperty("checkpointRelayLogName")
            .map(checkpointMasterLogName).toProperty("checkpointMasterLogName")
            .map(checkpointGroupBitmap).toProperty("checkpointGroupBitmap")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int insertSelective(SlaveWorkerInfo record) {
        return MyBatis3Utils.insert(this::insert, record, slaveWorkerInfo, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(relayLogPos).toPropertyWhenPresent("relayLogPos", record::getRelayLogPos)
            .map(masterLogPos).toPropertyWhenPresent("masterLogPos", record::getMasterLogPos)
            .map(checkpointRelayLogPos).toPropertyWhenPresent("checkpointRelayLogPos", record::getCheckpointRelayLogPos)
            .map(checkpointMasterLogPos).toPropertyWhenPresent("checkpointMasterLogPos", record::getCheckpointMasterLogPos)
            .map(checkpointSeqno).toPropertyWhenPresent("checkpointSeqno", record::getCheckpointSeqno)
            .map(checkpointGroupSize).toPropertyWhenPresent("checkpointGroupSize", record::getCheckpointGroupSize)
            .map(relayLogName).toPropertyWhenPresent("relayLogName", record::getRelayLogName)
            .map(masterLogName).toPropertyWhenPresent("masterLogName", record::getMasterLogName)
            .map(checkpointRelayLogName).toPropertyWhenPresent("checkpointRelayLogName", record::getCheckpointRelayLogName)
            .map(checkpointMasterLogName).toPropertyWhenPresent("checkpointMasterLogName", record::getCheckpointMasterLogName)
            .map(checkpointGroupBitmap).toPropertyWhenPresent("checkpointGroupBitmap", record::getCheckpointGroupBitmap)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default Optional<SlaveWorkerInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, slaveWorkerInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default List<SlaveWorkerInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, slaveWorkerInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default List<SlaveWorkerInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, slaveWorkerInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default Optional<SlaveWorkerInfo> selectByPrimaryKey(String channelName_, Integer id_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
            .and(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, slaveWorkerInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    static UpdateDSL<UpdateModel> updateAllColumns(SlaveWorkerInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(relayLogPos).equalTo(record::getRelayLogPos)
                .set(masterLogPos).equalTo(record::getMasterLogPos)
                .set(checkpointRelayLogPos).equalTo(record::getCheckpointRelayLogPos)
                .set(checkpointMasterLogPos).equalTo(record::getCheckpointMasterLogPos)
                .set(checkpointSeqno).equalTo(record::getCheckpointSeqno)
                .set(checkpointGroupSize).equalTo(record::getCheckpointGroupSize)
                .set(relayLogName).equalTo(record::getRelayLogName)
                .set(masterLogName).equalTo(record::getMasterLogName)
                .set(checkpointRelayLogName).equalTo(record::getCheckpointRelayLogName)
                .set(checkpointMasterLogName).equalTo(record::getCheckpointMasterLogName)
                .set(checkpointGroupBitmap).equalTo(record::getCheckpointGroupBitmap);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SlaveWorkerInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(relayLogPos).equalToWhenPresent(record::getRelayLogPos)
                .set(masterLogPos).equalToWhenPresent(record::getMasterLogPos)
                .set(checkpointRelayLogPos).equalToWhenPresent(record::getCheckpointRelayLogPos)
                .set(checkpointMasterLogPos).equalToWhenPresent(record::getCheckpointMasterLogPos)
                .set(checkpointSeqno).equalToWhenPresent(record::getCheckpointSeqno)
                .set(checkpointGroupSize).equalToWhenPresent(record::getCheckpointGroupSize)
                .set(relayLogName).equalToWhenPresent(record::getRelayLogName)
                .set(masterLogName).equalToWhenPresent(record::getMasterLogName)
                .set(checkpointRelayLogName).equalToWhenPresent(record::getCheckpointRelayLogName)
                .set(checkpointMasterLogName).equalToWhenPresent(record::getCheckpointMasterLogName)
                .set(checkpointGroupBitmap).equalToWhenPresent(record::getCheckpointGroupBitmap);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int updateByPrimaryKey(SlaveWorkerInfo record) {
        return update(c ->
            c.set(relayLogPos).equalTo(record::getRelayLogPos)
            .set(masterLogPos).equalTo(record::getMasterLogPos)
            .set(checkpointRelayLogPos).equalTo(record::getCheckpointRelayLogPos)
            .set(checkpointMasterLogPos).equalTo(record::getCheckpointMasterLogPos)
            .set(checkpointSeqno).equalTo(record::getCheckpointSeqno)
            .set(checkpointGroupSize).equalTo(record::getCheckpointGroupSize)
            .set(relayLogName).equalTo(record::getRelayLogName)
            .set(masterLogName).equalTo(record::getMasterLogName)
            .set(checkpointRelayLogName).equalTo(record::getCheckpointRelayLogName)
            .set(checkpointMasterLogName).equalTo(record::getCheckpointMasterLogName)
            .set(checkpointGroupBitmap).equalTo(record::getCheckpointGroupBitmap)
            .where(channelName, isEqualTo(record::getChannelName))
            .and(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source Table: slave_worker_info")
    default int updateByPrimaryKeySelective(SlaveWorkerInfo record) {
        return update(c ->
            c.set(relayLogPos).equalToWhenPresent(record::getRelayLogPos)
            .set(masterLogPos).equalToWhenPresent(record::getMasterLogPos)
            .set(checkpointRelayLogPos).equalToWhenPresent(record::getCheckpointRelayLogPos)
            .set(checkpointMasterLogPos).equalToWhenPresent(record::getCheckpointMasterLogPos)
            .set(checkpointSeqno).equalToWhenPresent(record::getCheckpointSeqno)
            .set(checkpointGroupSize).equalToWhenPresent(record::getCheckpointGroupSize)
            .set(relayLogName).equalToWhenPresent(record::getRelayLogName)
            .set(masterLogName).equalToWhenPresent(record::getMasterLogName)
            .set(checkpointRelayLogName).equalToWhenPresent(record::getCheckpointRelayLogName)
            .set(checkpointMasterLogName).equalToWhenPresent(record::getCheckpointMasterLogName)
            .set(checkpointGroupBitmap).equalToWhenPresent(record::getCheckpointGroupBitmap)
            .where(channelName, isEqualTo(record::getChannelName))
            .and(id, isEqualTo(record::getId))
        );
    }
}