package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ProcsPrivDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ProcsPriv;
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
public interface ProcsPrivMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    BasicColumn[] selectList = BasicColumn.columnList(host, db, user, routineName, routineType, grantor, procPriv, timestamp);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ProcsPriv> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProcsPrivResult")
    Optional<ProcsPriv> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProcsPrivResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Db", property="db", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Routine_name", property="routineName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Routine_type", property="routineType", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Grantor", property="grantor", jdbcType=JdbcType.VARCHAR),
        @Result(column="Proc_priv", property="procPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Timestamp", property="timestamp", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ProcsPriv> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, procsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, procsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int deleteByPrimaryKey(String host_, String db_, String user_, String routineName_, String routineType_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
            .and(routineName, isEqualTo(routineName_))
            .and(routineType, isEqualTo(routineType_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int insert(ProcsPriv record) {
        return MyBatis3Utils.insert(this::insert, record, procsPriv, c ->
            c.map(host).toProperty("host")
            .map(db).toProperty("db")
            .map(user).toProperty("user")
            .map(routineName).toProperty("routineName")
            .map(routineType).toProperty("routineType")
            .map(grantor).toProperty("grantor")
            .map(procPriv).toProperty("procPriv")
            .map(timestamp).toProperty("timestamp")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int insertSelective(ProcsPriv record) {
        return MyBatis3Utils.insert(this::insert, record, procsPriv, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(routineName).toPropertyWhenPresent("routineName", record::getRoutineName)
            .map(routineType).toPropertyWhenPresent("routineType", record::getRoutineType)
            .map(grantor).toPropertyWhenPresent("grantor", record::getGrantor)
            .map(procPriv).toPropertyWhenPresent("procPriv", record::getProcPriv)
            .map(timestamp).toPropertyWhenPresent("timestamp", record::getTimestamp)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default Optional<ProcsPriv> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, procsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default List<ProcsPriv> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, procsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default List<ProcsPriv> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, procsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default Optional<ProcsPriv> selectByPrimaryKey(String host_, String db_, String user_, String routineName_, String routineType_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
            .and(routineName, isEqualTo(routineName_))
            .and(routineType, isEqualTo(routineType_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, procsPriv, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    static UpdateDSL<UpdateModel> updateAllColumns(ProcsPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(db).equalTo(record::getDb)
                .set(user).equalTo(record::getUser)
                .set(routineName).equalTo(record::getRoutineName)
                .set(routineType).equalTo(record::getRoutineType)
                .set(grantor).equalTo(record::getGrantor)
                .set(procPriv).equalTo(record::getProcPriv)
                .set(timestamp).equalTo(record::getTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ProcsPriv record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(db).equalToWhenPresent(record::getDb)
                .set(user).equalToWhenPresent(record::getUser)
                .set(routineName).equalToWhenPresent(record::getRoutineName)
                .set(routineType).equalToWhenPresent(record::getRoutineType)
                .set(grantor).equalToWhenPresent(record::getGrantor)
                .set(procPriv).equalToWhenPresent(record::getProcPriv)
                .set(timestamp).equalToWhenPresent(record::getTimestamp);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int updateByPrimaryKey(ProcsPriv record) {
        return update(c ->
            c.set(grantor).equalTo(record::getGrantor)
            .set(procPriv).equalTo(record::getProcPriv)
            .set(timestamp).equalTo(record::getTimestamp)
            .where(host, isEqualTo(record::getHost))
            .and(db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
            .and(routineName, isEqualTo(record::getRoutineName))
            .and(routineType, isEqualTo(record::getRoutineType))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5181878+08:00", comments="Source Table: procs_priv")
    default int updateByPrimaryKeySelective(ProcsPriv record) {
        return update(c ->
            c.set(grantor).equalToWhenPresent(record::getGrantor)
            .set(procPriv).equalToWhenPresent(record::getProcPriv)
            .set(timestamp).equalToWhenPresent(record::getTimestamp)
            .where(host, isEqualTo(record::getHost))
            .and(db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
            .and(routineName, isEqualTo(record::getRoutineName))
            .and(routineType, isEqualTo(record::getRoutineType))
        );
    }
}