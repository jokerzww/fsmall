package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SlaveRelayLogInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SlaveRelayLogInfo;
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
public interface SlaveRelayLogInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, numberOfLines, relayLogPos, masterLogPos, sqlDelay, numberOfWorkers, id, privilegeChecksUsername, privilegeChecksHostname, requireRowFormat, requireTablePrimaryKeyCheck, relayLogName, masterLogName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SlaveRelayLogInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SlaveRelayLogInfoResult")
    Optional<SlaveRelayLogInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SlaveRelayLogInfoResult", value = {
        @Result(column="Channel_name", property="channelName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Number_of_lines", property="numberOfLines", jdbcType=JdbcType.INTEGER),
        @Result(column="Relay_log_pos", property="relayLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Master_log_pos", property="masterLogPos", jdbcType=JdbcType.BIGINT),
        @Result(column="Sql_delay", property="sqlDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="Number_of_workers", property="numberOfWorkers", jdbcType=JdbcType.INTEGER),
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="Privilege_checks_username", property="privilegeChecksUsername", jdbcType=JdbcType.CHAR),
        @Result(column="Privilege_checks_hostname", property="privilegeChecksHostname", jdbcType=JdbcType.CHAR),
        @Result(column="Require_row_format", property="requireRowFormat", jdbcType=JdbcType.BIT),
        @Result(column="Require_table_primary_key_check", property="requireTablePrimaryKeyCheck", jdbcType=JdbcType.CHAR),
        @Result(column="Relay_log_name", property="relayLogName", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="Master_log_name", property="masterLogName", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SlaveRelayLogInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, slaveRelayLogInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, slaveRelayLogInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int deleteByPrimaryKey(String channelName_) {
        return delete(c -> 
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int insert(SlaveRelayLogInfo record) {
        return MyBatis3Utils.insert(this::insert, record, slaveRelayLogInfo, c ->
            c.map(channelName).toProperty("channelName")
            .map(numberOfLines).toProperty("numberOfLines")
            .map(relayLogPos).toProperty("relayLogPos")
            .map(masterLogPos).toProperty("masterLogPos")
            .map(sqlDelay).toProperty("sqlDelay")
            .map(numberOfWorkers).toProperty("numberOfWorkers")
            .map(privilegeChecksUsername).toProperty("privilegeChecksUsername")
            .map(privilegeChecksHostname).toProperty("privilegeChecksHostname")
            .map(requireRowFormat).toProperty("requireRowFormat")
            .map(requireTablePrimaryKeyCheck).toProperty("requireTablePrimaryKeyCheck")
            .map(relayLogName).toProperty("relayLogName")
            .map(masterLogName).toProperty("masterLogName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int insertSelective(SlaveRelayLogInfo record) {
        return MyBatis3Utils.insert(this::insert, record, slaveRelayLogInfo, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(numberOfLines).toPropertyWhenPresent("numberOfLines", record::getNumberOfLines)
            .map(relayLogPos).toPropertyWhenPresent("relayLogPos", record::getRelayLogPos)
            .map(masterLogPos).toPropertyWhenPresent("masterLogPos", record::getMasterLogPos)
            .map(sqlDelay).toPropertyWhenPresent("sqlDelay", record::getSqlDelay)
            .map(numberOfWorkers).toPropertyWhenPresent("numberOfWorkers", record::getNumberOfWorkers)
            .map(privilegeChecksUsername).toPropertyWhenPresent("privilegeChecksUsername", record::getPrivilegeChecksUsername)
            .map(privilegeChecksHostname).toPropertyWhenPresent("privilegeChecksHostname", record::getPrivilegeChecksHostname)
            .map(requireRowFormat).toPropertyWhenPresent("requireRowFormat", record::getRequireRowFormat)
            .map(requireTablePrimaryKeyCheck).toPropertyWhenPresent("requireTablePrimaryKeyCheck", record::getRequireTablePrimaryKeyCheck)
            .map(relayLogName).toPropertyWhenPresent("relayLogName", record::getRelayLogName)
            .map(masterLogName).toPropertyWhenPresent("masterLogName", record::getMasterLogName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default Optional<SlaveRelayLogInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, slaveRelayLogInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default List<SlaveRelayLogInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, slaveRelayLogInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default List<SlaveRelayLogInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, slaveRelayLogInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default Optional<SlaveRelayLogInfo> selectByPrimaryKey(String channelName_) {
        return selectOne(c ->
            c.where(channelName, isEqualTo(channelName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, slaveRelayLogInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    static UpdateDSL<UpdateModel> updateAllColumns(SlaveRelayLogInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(numberOfLines).equalTo(record::getNumberOfLines)
                .set(relayLogPos).equalTo(record::getRelayLogPos)
                .set(masterLogPos).equalTo(record::getMasterLogPos)
                .set(sqlDelay).equalTo(record::getSqlDelay)
                .set(numberOfWorkers).equalTo(record::getNumberOfWorkers)
                .set(privilegeChecksUsername).equalTo(record::getPrivilegeChecksUsername)
                .set(privilegeChecksHostname).equalTo(record::getPrivilegeChecksHostname)
                .set(requireRowFormat).equalTo(record::getRequireRowFormat)
                .set(requireTablePrimaryKeyCheck).equalTo(record::getRequireTablePrimaryKeyCheck)
                .set(relayLogName).equalTo(record::getRelayLogName)
                .set(masterLogName).equalTo(record::getMasterLogName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SlaveRelayLogInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(numberOfLines).equalToWhenPresent(record::getNumberOfLines)
                .set(relayLogPos).equalToWhenPresent(record::getRelayLogPos)
                .set(masterLogPos).equalToWhenPresent(record::getMasterLogPos)
                .set(sqlDelay).equalToWhenPresent(record::getSqlDelay)
                .set(numberOfWorkers).equalToWhenPresent(record::getNumberOfWorkers)
                .set(privilegeChecksUsername).equalToWhenPresent(record::getPrivilegeChecksUsername)
                .set(privilegeChecksHostname).equalToWhenPresent(record::getPrivilegeChecksHostname)
                .set(requireRowFormat).equalToWhenPresent(record::getRequireRowFormat)
                .set(requireTablePrimaryKeyCheck).equalToWhenPresent(record::getRequireTablePrimaryKeyCheck)
                .set(relayLogName).equalToWhenPresent(record::getRelayLogName)
                .set(masterLogName).equalToWhenPresent(record::getMasterLogName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int updateByPrimaryKey(SlaveRelayLogInfo record) {
        return update(c ->
            c.set(numberOfLines).equalTo(record::getNumberOfLines)
            .set(relayLogPos).equalTo(record::getRelayLogPos)
            .set(masterLogPos).equalTo(record::getMasterLogPos)
            .set(sqlDelay).equalTo(record::getSqlDelay)
            .set(numberOfWorkers).equalTo(record::getNumberOfWorkers)
            .set(privilegeChecksUsername).equalTo(record::getPrivilegeChecksUsername)
            .set(privilegeChecksHostname).equalTo(record::getPrivilegeChecksHostname)
            .set(requireRowFormat).equalTo(record::getRequireRowFormat)
            .set(requireTablePrimaryKeyCheck).equalTo(record::getRequireTablePrimaryKeyCheck)
            .set(relayLogName).equalTo(record::getRelayLogName)
            .set(masterLogName).equalTo(record::getMasterLogName)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4030831+08:00", comments="Source Table: slave_relay_log_info")
    default int updateByPrimaryKeySelective(SlaveRelayLogInfo record) {
        return update(c ->
            c.set(numberOfLines).equalToWhenPresent(record::getNumberOfLines)
            .set(relayLogPos).equalToWhenPresent(record::getRelayLogPos)
            .set(masterLogPos).equalToWhenPresent(record::getMasterLogPos)
            .set(sqlDelay).equalToWhenPresent(record::getSqlDelay)
            .set(numberOfWorkers).equalToWhenPresent(record::getNumberOfWorkers)
            .set(privilegeChecksUsername).equalToWhenPresent(record::getPrivilegeChecksUsername)
            .set(privilegeChecksHostname).equalToWhenPresent(record::getPrivilegeChecksHostname)
            .set(requireRowFormat).equalToWhenPresent(record::getRequireRowFormat)
            .set(requireTablePrimaryKeyCheck).equalToWhenPresent(record::getRequireTablePrimaryKeyCheck)
            .set(relayLogName).equalToWhenPresent(record::getRelayLogName)
            .set(masterLogName).equalToWhenPresent(record::getMasterLogName)
            .where(channelName, isEqualTo(record::getChannelName))
        );
    }
}