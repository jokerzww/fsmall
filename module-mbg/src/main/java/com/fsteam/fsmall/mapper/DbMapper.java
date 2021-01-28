package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.DbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Db;
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
public interface DbMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    BasicColumn[] selectList = BasicColumn.columnList(host, db.db, user, selectPriv, insertPriv, updatePriv, deletePriv, createPriv, dropPriv, grantPriv, referencesPriv, indexPriv, alterPriv, createTmpTablePriv, lockTablesPriv, createViewPriv, showViewPriv, createRoutinePriv, alterRoutinePriv, executePriv, eventPriv, triggerPriv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source Table: db")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source Table: db")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source Table: db")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Db> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source Table: db")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DbResult")
    Optional<Db> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source Table: db")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DbResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Db", property="db", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Select_priv", property="selectPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Insert_priv", property="insertPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Update_priv", property="updatePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Delete_priv", property="deletePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_priv", property="createPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_priv", property="dropPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Grant_priv", property="grantPriv", jdbcType=JdbcType.CHAR),
        @Result(column="References_priv", property="referencesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Index_priv", property="indexPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_priv", property="alterPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tmp_table_priv", property="createTmpTablePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Lock_tables_priv", property="lockTablesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_view_priv", property="createViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_view_priv", property="showViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_routine_priv", property="createRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_routine_priv", property="alterRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Execute_priv", property="executePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Event_priv", property="eventPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Trigger_priv", property="triggerPriv", jdbcType=JdbcType.CHAR)
    })
    List<Db> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source Table: db")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, db, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, db, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int deleteByPrimaryKey(String host_, String db_, String user_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(db.db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int insert(Db record) {
        return MyBatis3Utils.insert(this::insert, record, db, c ->
            c.map(host).toProperty("host")
            .map(db.db).toProperty("db")
            .map(user).toProperty("user")
            .map(selectPriv).toProperty("selectPriv")
            .map(insertPriv).toProperty("insertPriv")
            .map(updatePriv).toProperty("updatePriv")
            .map(deletePriv).toProperty("deletePriv")
            .map(createPriv).toProperty("createPriv")
            .map(dropPriv).toProperty("dropPriv")
            .map(grantPriv).toProperty("grantPriv")
            .map(referencesPriv).toProperty("referencesPriv")
            .map(indexPriv).toProperty("indexPriv")
            .map(alterPriv).toProperty("alterPriv")
            .map(createTmpTablePriv).toProperty("createTmpTablePriv")
            .map(lockTablesPriv).toProperty("lockTablesPriv")
            .map(createViewPriv).toProperty("createViewPriv")
            .map(showViewPriv).toProperty("showViewPriv")
            .map(createRoutinePriv).toProperty("createRoutinePriv")
            .map(alterRoutinePriv).toProperty("alterRoutinePriv")
            .map(executePriv).toProperty("executePriv")
            .map(eventPriv).toProperty("eventPriv")
            .map(triggerPriv).toProperty("triggerPriv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int insertSelective(Db record) {
        return MyBatis3Utils.insert(this::insert, record, db, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(db.db).toPropertyWhenPresent("db", record::getDb)
            .map(user).toPropertyWhenPresent("user", record::getUser)
            .map(selectPriv).toPropertyWhenPresent("selectPriv", record::getSelectPriv)
            .map(insertPriv).toPropertyWhenPresent("insertPriv", record::getInsertPriv)
            .map(updatePriv).toPropertyWhenPresent("updatePriv", record::getUpdatePriv)
            .map(deletePriv).toPropertyWhenPresent("deletePriv", record::getDeletePriv)
            .map(createPriv).toPropertyWhenPresent("createPriv", record::getCreatePriv)
            .map(dropPriv).toPropertyWhenPresent("dropPriv", record::getDropPriv)
            .map(grantPriv).toPropertyWhenPresent("grantPriv", record::getGrantPriv)
            .map(referencesPriv).toPropertyWhenPresent("referencesPriv", record::getReferencesPriv)
            .map(indexPriv).toPropertyWhenPresent("indexPriv", record::getIndexPriv)
            .map(alterPriv).toPropertyWhenPresent("alterPriv", record::getAlterPriv)
            .map(createTmpTablePriv).toPropertyWhenPresent("createTmpTablePriv", record::getCreateTmpTablePriv)
            .map(lockTablesPriv).toPropertyWhenPresent("lockTablesPriv", record::getLockTablesPriv)
            .map(createViewPriv).toPropertyWhenPresent("createViewPriv", record::getCreateViewPriv)
            .map(showViewPriv).toPropertyWhenPresent("showViewPriv", record::getShowViewPriv)
            .map(createRoutinePriv).toPropertyWhenPresent("createRoutinePriv", record::getCreateRoutinePriv)
            .map(alterRoutinePriv).toPropertyWhenPresent("alterRoutinePriv", record::getAlterRoutinePriv)
            .map(executePriv).toPropertyWhenPresent("executePriv", record::getExecutePriv)
            .map(eventPriv).toPropertyWhenPresent("eventPriv", record::getEventPriv)
            .map(triggerPriv).toPropertyWhenPresent("triggerPriv", record::getTriggerPriv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default Optional<Db> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, db, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default List<Db> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, db, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default List<Db> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, db, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default Optional<Db> selectByPrimaryKey(String host_, String db_, String user_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(db.db, isEqualTo(db_))
            .and(user, isEqualTo(user_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, db, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    static UpdateDSL<UpdateModel> updateAllColumns(Db record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(db.db).equalTo(record::getDb)
                .set(user).equalTo(record::getUser)
                .set(selectPriv).equalTo(record::getSelectPriv)
                .set(insertPriv).equalTo(record::getInsertPriv)
                .set(updatePriv).equalTo(record::getUpdatePriv)
                .set(deletePriv).equalTo(record::getDeletePriv)
                .set(createPriv).equalTo(record::getCreatePriv)
                .set(dropPriv).equalTo(record::getDropPriv)
                .set(grantPriv).equalTo(record::getGrantPriv)
                .set(referencesPriv).equalTo(record::getReferencesPriv)
                .set(indexPriv).equalTo(record::getIndexPriv)
                .set(alterPriv).equalTo(record::getAlterPriv)
                .set(createTmpTablePriv).equalTo(record::getCreateTmpTablePriv)
                .set(lockTablesPriv).equalTo(record::getLockTablesPriv)
                .set(createViewPriv).equalTo(record::getCreateViewPriv)
                .set(showViewPriv).equalTo(record::getShowViewPriv)
                .set(createRoutinePriv).equalTo(record::getCreateRoutinePriv)
                .set(alterRoutinePriv).equalTo(record::getAlterRoutinePriv)
                .set(executePriv).equalTo(record::getExecutePriv)
                .set(eventPriv).equalTo(record::getEventPriv)
                .set(triggerPriv).equalTo(record::getTriggerPriv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Db record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(db.db).equalToWhenPresent(record::getDb)
                .set(user).equalToWhenPresent(record::getUser)
                .set(selectPriv).equalToWhenPresent(record::getSelectPriv)
                .set(insertPriv).equalToWhenPresent(record::getInsertPriv)
                .set(updatePriv).equalToWhenPresent(record::getUpdatePriv)
                .set(deletePriv).equalToWhenPresent(record::getDeletePriv)
                .set(createPriv).equalToWhenPresent(record::getCreatePriv)
                .set(dropPriv).equalToWhenPresent(record::getDropPriv)
                .set(grantPriv).equalToWhenPresent(record::getGrantPriv)
                .set(referencesPriv).equalToWhenPresent(record::getReferencesPriv)
                .set(indexPriv).equalToWhenPresent(record::getIndexPriv)
                .set(alterPriv).equalToWhenPresent(record::getAlterPriv)
                .set(createTmpTablePriv).equalToWhenPresent(record::getCreateTmpTablePriv)
                .set(lockTablesPriv).equalToWhenPresent(record::getLockTablesPriv)
                .set(createViewPriv).equalToWhenPresent(record::getCreateViewPriv)
                .set(showViewPriv).equalToWhenPresent(record::getShowViewPriv)
                .set(createRoutinePriv).equalToWhenPresent(record::getCreateRoutinePriv)
                .set(alterRoutinePriv).equalToWhenPresent(record::getAlterRoutinePriv)
                .set(executePriv).equalToWhenPresent(record::getExecutePriv)
                .set(eventPriv).equalToWhenPresent(record::getEventPriv)
                .set(triggerPriv).equalToWhenPresent(record::getTriggerPriv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int updateByPrimaryKey(Db record) {
        return update(c ->
            c.set(selectPriv).equalTo(record::getSelectPriv)
            .set(insertPriv).equalTo(record::getInsertPriv)
            .set(updatePriv).equalTo(record::getUpdatePriv)
            .set(deletePriv).equalTo(record::getDeletePriv)
            .set(createPriv).equalTo(record::getCreatePriv)
            .set(dropPriv).equalTo(record::getDropPriv)
            .set(grantPriv).equalTo(record::getGrantPriv)
            .set(referencesPriv).equalTo(record::getReferencesPriv)
            .set(indexPriv).equalTo(record::getIndexPriv)
            .set(alterPriv).equalTo(record::getAlterPriv)
            .set(createTmpTablePriv).equalTo(record::getCreateTmpTablePriv)
            .set(lockTablesPriv).equalTo(record::getLockTablesPriv)
            .set(createViewPriv).equalTo(record::getCreateViewPriv)
            .set(showViewPriv).equalTo(record::getShowViewPriv)
            .set(createRoutinePriv).equalTo(record::getCreateRoutinePriv)
            .set(alterRoutinePriv).equalTo(record::getAlterRoutinePriv)
            .set(executePriv).equalTo(record::getExecutePriv)
            .set(eventPriv).equalTo(record::getEventPriv)
            .set(triggerPriv).equalTo(record::getTriggerPriv)
            .where(host, isEqualTo(record::getHost))
            .and(db.db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3660492+08:00", comments="Source Table: db")
    default int updateByPrimaryKeySelective(Db record) {
        return update(c ->
            c.set(selectPriv).equalToWhenPresent(record::getSelectPriv)
            .set(insertPriv).equalToWhenPresent(record::getInsertPriv)
            .set(updatePriv).equalToWhenPresent(record::getUpdatePriv)
            .set(deletePriv).equalToWhenPresent(record::getDeletePriv)
            .set(createPriv).equalToWhenPresent(record::getCreatePriv)
            .set(dropPriv).equalToWhenPresent(record::getDropPriv)
            .set(grantPriv).equalToWhenPresent(record::getGrantPriv)
            .set(referencesPriv).equalToWhenPresent(record::getReferencesPriv)
            .set(indexPriv).equalToWhenPresent(record::getIndexPriv)
            .set(alterPriv).equalToWhenPresent(record::getAlterPriv)
            .set(createTmpTablePriv).equalToWhenPresent(record::getCreateTmpTablePriv)
            .set(lockTablesPriv).equalToWhenPresent(record::getLockTablesPriv)
            .set(createViewPriv).equalToWhenPresent(record::getCreateViewPriv)
            .set(showViewPriv).equalToWhenPresent(record::getShowViewPriv)
            .set(createRoutinePriv).equalToWhenPresent(record::getCreateRoutinePriv)
            .set(alterRoutinePriv).equalToWhenPresent(record::getAlterRoutinePriv)
            .set(executePriv).equalToWhenPresent(record::getExecutePriv)
            .set(eventPriv).equalToWhenPresent(record::getEventPriv)
            .set(triggerPriv).equalToWhenPresent(record::getTriggerPriv)
            .where(host, isEqualTo(record::getHost))
            .and(db.db, isEqualTo(record::getDb))
            .and(user, isEqualTo(record::getUser))
        );
    }
}