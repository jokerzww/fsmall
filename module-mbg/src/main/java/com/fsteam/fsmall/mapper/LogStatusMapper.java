package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.LogStatusDynamicSqlSupport.*;

import com.fsteam.fsmall.model.LogStatus;
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
public interface LogStatusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    BasicColumn[] selectList = BasicColumn.columnList(serverUuid, local, replication, storageEngines);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LogStatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LogStatusResult")
    Optional<LogStatus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LogStatusResult", value = {
        @Result(column="SERVER_UUID", property="serverUuid", jdbcType=JdbcType.CHAR),
        @Result(column="LOCAL", property="local", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="REPLICATION", property="replication", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="STORAGE_ENGINES", property="storageEngines", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<LogStatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, logStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, logStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default int insert(LogStatus record) {
        return MyBatis3Utils.insert(this::insert, record, logStatus, c ->
            c.map(serverUuid).toProperty("serverUuid")
            .map(local).toProperty("local")
            .map(replication).toProperty("replication")
            .map(storageEngines).toProperty("storageEngines")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default int insertSelective(LogStatus record) {
        return MyBatis3Utils.insert(this::insert, record, logStatus, c ->
            c.map(serverUuid).toPropertyWhenPresent("serverUuid", record::getServerUuid)
            .map(local).toPropertyWhenPresent("local", record::getLocal)
            .map(replication).toPropertyWhenPresent("replication", record::getReplication)
            .map(storageEngines).toPropertyWhenPresent("storageEngines", record::getStorageEngines)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default Optional<LogStatus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, logStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default List<LogStatus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, logStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default List<LogStatus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, logStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, logStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    static UpdateDSL<UpdateModel> updateAllColumns(LogStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(serverUuid).equalTo(record::getServerUuid)
                .set(local).equalTo(record::getLocal)
                .set(replication).equalTo(record::getReplication)
                .set(storageEngines).equalTo(record::getStorageEngines);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LogStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(serverUuid).equalToWhenPresent(record::getServerUuid)
                .set(local).equalToWhenPresent(record::getLocal)
                .set(replication).equalToWhenPresent(record::getReplication)
                .set(storageEngines).equalToWhenPresent(record::getStorageEngines);
    }
}