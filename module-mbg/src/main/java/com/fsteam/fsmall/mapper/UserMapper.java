package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.User;
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
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    BasicColumn[] selectList = BasicColumn.columnList(host, user.user, selectPriv, insertPriv, updatePriv, deletePriv, createPriv, dropPriv, reloadPriv, shutdownPriv, processPriv, filePriv, grantPriv, referencesPriv, indexPriv, alterPriv, showDbPriv, superPriv, createTmpTablePriv, lockTablesPriv, executePriv, replSlavePriv, replClientPriv, createViewPriv, showViewPriv, createRoutinePriv, alterRoutinePriv, createUserPriv, eventPriv, triggerPriv, createTablespacePriv, sslType, maxQuestions, maxUpdates, maxConnections, maxUserConnections, plugin, passwordExpired, passwordLastChanged, passwordLifetime, accountLocked, createRolePriv, dropRolePriv, passwordReuseHistory, passwordReuseTime, passwordRequireCurrent, sslCipher, x509Issuer, x509Subject, authenticationString, userAttributes);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Select_priv", property="selectPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Insert_priv", property="insertPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Update_priv", property="updatePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Delete_priv", property="deletePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_priv", property="createPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_priv", property="dropPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Reload_priv", property="reloadPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Shutdown_priv", property="shutdownPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Process_priv", property="processPriv", jdbcType=JdbcType.CHAR),
        @Result(column="File_priv", property="filePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Grant_priv", property="grantPriv", jdbcType=JdbcType.CHAR),
        @Result(column="References_priv", property="referencesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Index_priv", property="indexPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_priv", property="alterPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_db_priv", property="showDbPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Super_priv", property="superPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tmp_table_priv", property="createTmpTablePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Lock_tables_priv", property="lockTablesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Execute_priv", property="executePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Repl_slave_priv", property="replSlavePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Repl_client_priv", property="replClientPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_view_priv", property="createViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_view_priv", property="showViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_routine_priv", property="createRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_routine_priv", property="alterRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_user_priv", property="createUserPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Event_priv", property="eventPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Trigger_priv", property="triggerPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tablespace_priv", property="createTablespacePriv", jdbcType=JdbcType.CHAR),
        @Result(column="ssl_type", property="sslType", jdbcType=JdbcType.CHAR),
        @Result(column="max_questions", property="maxQuestions", jdbcType=JdbcType.INTEGER),
        @Result(column="max_updates", property="maxUpdates", jdbcType=JdbcType.INTEGER),
        @Result(column="max_connections", property="maxConnections", jdbcType=JdbcType.INTEGER),
        @Result(column="max_user_connections", property="maxUserConnections", jdbcType=JdbcType.INTEGER),
        @Result(column="plugin", property="plugin", jdbcType=JdbcType.CHAR),
        @Result(column="password_expired", property="passwordExpired", jdbcType=JdbcType.CHAR),
        @Result(column="password_last_changed", property="passwordLastChanged", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="password_lifetime", property="passwordLifetime", jdbcType=JdbcType.SMALLINT),
        @Result(column="account_locked", property="accountLocked", jdbcType=JdbcType.CHAR),
        @Result(column="Create_role_priv", property="createRolePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_role_priv", property="dropRolePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Password_reuse_history", property="passwordReuseHistory", jdbcType=JdbcType.SMALLINT),
        @Result(column="Password_reuse_time", property="passwordReuseTime", jdbcType=JdbcType.SMALLINT),
        @Result(column="Password_require_current", property="passwordRequireCurrent", jdbcType=JdbcType.CHAR),
        @Result(column="ssl_cipher", property="sslCipher", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="x509_issuer", property="x509Issuer", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="x509_subject", property="x509Subject", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="authentication_string", property="authenticationString", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="User_attributes", property="userAttributes", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default int deleteByPrimaryKey(String host_, String user_) {
        return delete(c -> 
            c.where(host, isEqualTo(host_))
            .and(user.user, isEqualTo(user_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(host).toProperty("host")
            .map(user.user).toProperty("user")
            .map(selectPriv).toProperty("selectPriv")
            .map(insertPriv).toProperty("insertPriv")
            .map(updatePriv).toProperty("updatePriv")
            .map(deletePriv).toProperty("deletePriv")
            .map(createPriv).toProperty("createPriv")
            .map(dropPriv).toProperty("dropPriv")
            .map(reloadPriv).toProperty("reloadPriv")
            .map(shutdownPriv).toProperty("shutdownPriv")
            .map(processPriv).toProperty("processPriv")
            .map(filePriv).toProperty("filePriv")
            .map(grantPriv).toProperty("grantPriv")
            .map(referencesPriv).toProperty("referencesPriv")
            .map(indexPriv).toProperty("indexPriv")
            .map(alterPriv).toProperty("alterPriv")
            .map(showDbPriv).toProperty("showDbPriv")
            .map(superPriv).toProperty("superPriv")
            .map(createTmpTablePriv).toProperty("createTmpTablePriv")
            .map(lockTablesPriv).toProperty("lockTablesPriv")
            .map(executePriv).toProperty("executePriv")
            .map(replSlavePriv).toProperty("replSlavePriv")
            .map(replClientPriv).toProperty("replClientPriv")
            .map(createViewPriv).toProperty("createViewPriv")
            .map(showViewPriv).toProperty("showViewPriv")
            .map(createRoutinePriv).toProperty("createRoutinePriv")
            .map(alterRoutinePriv).toProperty("alterRoutinePriv")
            .map(createUserPriv).toProperty("createUserPriv")
            .map(eventPriv).toProperty("eventPriv")
            .map(triggerPriv).toProperty("triggerPriv")
            .map(createTablespacePriv).toProperty("createTablespacePriv")
            .map(sslType).toProperty("sslType")
            .map(maxQuestions).toProperty("maxQuestions")
            .map(maxUpdates).toProperty("maxUpdates")
            .map(maxConnections).toProperty("maxConnections")
            .map(maxUserConnections).toProperty("maxUserConnections")
            .map(plugin).toProperty("plugin")
            .map(passwordExpired).toProperty("passwordExpired")
            .map(passwordLastChanged).toProperty("passwordLastChanged")
            .map(passwordLifetime).toProperty("passwordLifetime")
            .map(accountLocked).toProperty("accountLocked")
            .map(createRolePriv).toProperty("createRolePriv")
            .map(dropRolePriv).toProperty("dropRolePriv")
            .map(passwordReuseHistory).toProperty("passwordReuseHistory")
            .map(passwordReuseTime).toProperty("passwordReuseTime")
            .map(passwordRequireCurrent).toProperty("passwordRequireCurrent")
            .map(sslCipher).toProperty("sslCipher")
            .map(x509Issuer).toProperty("x509Issuer")
            .map(x509Subject).toProperty("x509Subject")
            .map(authenticationString).toProperty("authenticationString")
            .map(userAttributes).toProperty("userAttributes")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(user.user).toPropertyWhenPresent("user", record::getUser)
            .map(selectPriv).toPropertyWhenPresent("selectPriv", record::getSelectPriv)
            .map(insertPriv).toPropertyWhenPresent("insertPriv", record::getInsertPriv)
            .map(updatePriv).toPropertyWhenPresent("updatePriv", record::getUpdatePriv)
            .map(deletePriv).toPropertyWhenPresent("deletePriv", record::getDeletePriv)
            .map(createPriv).toPropertyWhenPresent("createPriv", record::getCreatePriv)
            .map(dropPriv).toPropertyWhenPresent("dropPriv", record::getDropPriv)
            .map(reloadPriv).toPropertyWhenPresent("reloadPriv", record::getReloadPriv)
            .map(shutdownPriv).toPropertyWhenPresent("shutdownPriv", record::getShutdownPriv)
            .map(processPriv).toPropertyWhenPresent("processPriv", record::getProcessPriv)
            .map(filePriv).toPropertyWhenPresent("filePriv", record::getFilePriv)
            .map(grantPriv).toPropertyWhenPresent("grantPriv", record::getGrantPriv)
            .map(referencesPriv).toPropertyWhenPresent("referencesPriv", record::getReferencesPriv)
            .map(indexPriv).toPropertyWhenPresent("indexPriv", record::getIndexPriv)
            .map(alterPriv).toPropertyWhenPresent("alterPriv", record::getAlterPriv)
            .map(showDbPriv).toPropertyWhenPresent("showDbPriv", record::getShowDbPriv)
            .map(superPriv).toPropertyWhenPresent("superPriv", record::getSuperPriv)
            .map(createTmpTablePriv).toPropertyWhenPresent("createTmpTablePriv", record::getCreateTmpTablePriv)
            .map(lockTablesPriv).toPropertyWhenPresent("lockTablesPriv", record::getLockTablesPriv)
            .map(executePriv).toPropertyWhenPresent("executePriv", record::getExecutePriv)
            .map(replSlavePriv).toPropertyWhenPresent("replSlavePriv", record::getReplSlavePriv)
            .map(replClientPriv).toPropertyWhenPresent("replClientPriv", record::getReplClientPriv)
            .map(createViewPriv).toPropertyWhenPresent("createViewPriv", record::getCreateViewPriv)
            .map(showViewPriv).toPropertyWhenPresent("showViewPriv", record::getShowViewPriv)
            .map(createRoutinePriv).toPropertyWhenPresent("createRoutinePriv", record::getCreateRoutinePriv)
            .map(alterRoutinePriv).toPropertyWhenPresent("alterRoutinePriv", record::getAlterRoutinePriv)
            .map(createUserPriv).toPropertyWhenPresent("createUserPriv", record::getCreateUserPriv)
            .map(eventPriv).toPropertyWhenPresent("eventPriv", record::getEventPriv)
            .map(triggerPriv).toPropertyWhenPresent("triggerPriv", record::getTriggerPriv)
            .map(createTablespacePriv).toPropertyWhenPresent("createTablespacePriv", record::getCreateTablespacePriv)
            .map(sslType).toPropertyWhenPresent("sslType", record::getSslType)
            .map(maxQuestions).toPropertyWhenPresent("maxQuestions", record::getMaxQuestions)
            .map(maxUpdates).toPropertyWhenPresent("maxUpdates", record::getMaxUpdates)
            .map(maxConnections).toPropertyWhenPresent("maxConnections", record::getMaxConnections)
            .map(maxUserConnections).toPropertyWhenPresent("maxUserConnections", record::getMaxUserConnections)
            .map(plugin).toPropertyWhenPresent("plugin", record::getPlugin)
            .map(passwordExpired).toPropertyWhenPresent("passwordExpired", record::getPasswordExpired)
            .map(passwordLastChanged).toPropertyWhenPresent("passwordLastChanged", record::getPasswordLastChanged)
            .map(passwordLifetime).toPropertyWhenPresent("passwordLifetime", record::getPasswordLifetime)
            .map(accountLocked).toPropertyWhenPresent("accountLocked", record::getAccountLocked)
            .map(createRolePriv).toPropertyWhenPresent("createRolePriv", record::getCreateRolePriv)
            .map(dropRolePriv).toPropertyWhenPresent("dropRolePriv", record::getDropRolePriv)
            .map(passwordReuseHistory).toPropertyWhenPresent("passwordReuseHistory", record::getPasswordReuseHistory)
            .map(passwordReuseTime).toPropertyWhenPresent("passwordReuseTime", record::getPasswordReuseTime)
            .map(passwordRequireCurrent).toPropertyWhenPresent("passwordRequireCurrent", record::getPasswordRequireCurrent)
            .map(sslCipher).toPropertyWhenPresent("sslCipher", record::getSslCipher)
            .map(x509Issuer).toPropertyWhenPresent("x509Issuer", record::getX509Issuer)
            .map(x509Subject).toPropertyWhenPresent("x509Subject", record::getX509Subject)
            .map(authenticationString).toPropertyWhenPresent("authenticationString", record::getAuthenticationString)
            .map(userAttributes).toPropertyWhenPresent("userAttributes", record::getUserAttributes)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default Optional<User> selectByPrimaryKey(String host_, String user_) {
        return selectOne(c ->
            c.where(host, isEqualTo(host_))
            .and(user.user, isEqualTo(user_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(user.user).equalTo(record::getUser)
                .set(selectPriv).equalTo(record::getSelectPriv)
                .set(insertPriv).equalTo(record::getInsertPriv)
                .set(updatePriv).equalTo(record::getUpdatePriv)
                .set(deletePriv).equalTo(record::getDeletePriv)
                .set(createPriv).equalTo(record::getCreatePriv)
                .set(dropPriv).equalTo(record::getDropPriv)
                .set(reloadPriv).equalTo(record::getReloadPriv)
                .set(shutdownPriv).equalTo(record::getShutdownPriv)
                .set(processPriv).equalTo(record::getProcessPriv)
                .set(filePriv).equalTo(record::getFilePriv)
                .set(grantPriv).equalTo(record::getGrantPriv)
                .set(referencesPriv).equalTo(record::getReferencesPriv)
                .set(indexPriv).equalTo(record::getIndexPriv)
                .set(alterPriv).equalTo(record::getAlterPriv)
                .set(showDbPriv).equalTo(record::getShowDbPriv)
                .set(superPriv).equalTo(record::getSuperPriv)
                .set(createTmpTablePriv).equalTo(record::getCreateTmpTablePriv)
                .set(lockTablesPriv).equalTo(record::getLockTablesPriv)
                .set(executePriv).equalTo(record::getExecutePriv)
                .set(replSlavePriv).equalTo(record::getReplSlavePriv)
                .set(replClientPriv).equalTo(record::getReplClientPriv)
                .set(createViewPriv).equalTo(record::getCreateViewPriv)
                .set(showViewPriv).equalTo(record::getShowViewPriv)
                .set(createRoutinePriv).equalTo(record::getCreateRoutinePriv)
                .set(alterRoutinePriv).equalTo(record::getAlterRoutinePriv)
                .set(createUserPriv).equalTo(record::getCreateUserPriv)
                .set(eventPriv).equalTo(record::getEventPriv)
                .set(triggerPriv).equalTo(record::getTriggerPriv)
                .set(createTablespacePriv).equalTo(record::getCreateTablespacePriv)
                .set(sslType).equalTo(record::getSslType)
                .set(maxQuestions).equalTo(record::getMaxQuestions)
                .set(maxUpdates).equalTo(record::getMaxUpdates)
                .set(maxConnections).equalTo(record::getMaxConnections)
                .set(maxUserConnections).equalTo(record::getMaxUserConnections)
                .set(plugin).equalTo(record::getPlugin)
                .set(passwordExpired).equalTo(record::getPasswordExpired)
                .set(passwordLastChanged).equalTo(record::getPasswordLastChanged)
                .set(passwordLifetime).equalTo(record::getPasswordLifetime)
                .set(accountLocked).equalTo(record::getAccountLocked)
                .set(createRolePriv).equalTo(record::getCreateRolePriv)
                .set(dropRolePriv).equalTo(record::getDropRolePriv)
                .set(passwordReuseHistory).equalTo(record::getPasswordReuseHistory)
                .set(passwordReuseTime).equalTo(record::getPasswordReuseTime)
                .set(passwordRequireCurrent).equalTo(record::getPasswordRequireCurrent)
                .set(sslCipher).equalTo(record::getSslCipher)
                .set(x509Issuer).equalTo(record::getX509Issuer)
                .set(x509Subject).equalTo(record::getX509Subject)
                .set(authenticationString).equalTo(record::getAuthenticationString)
                .set(userAttributes).equalTo(record::getUserAttributes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source Table: user")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(user.user).equalToWhenPresent(record::getUser)
                .set(selectPriv).equalToWhenPresent(record::getSelectPriv)
                .set(insertPriv).equalToWhenPresent(record::getInsertPriv)
                .set(updatePriv).equalToWhenPresent(record::getUpdatePriv)
                .set(deletePriv).equalToWhenPresent(record::getDeletePriv)
                .set(createPriv).equalToWhenPresent(record::getCreatePriv)
                .set(dropPriv).equalToWhenPresent(record::getDropPriv)
                .set(reloadPriv).equalToWhenPresent(record::getReloadPriv)
                .set(shutdownPriv).equalToWhenPresent(record::getShutdownPriv)
                .set(processPriv).equalToWhenPresent(record::getProcessPriv)
                .set(filePriv).equalToWhenPresent(record::getFilePriv)
                .set(grantPriv).equalToWhenPresent(record::getGrantPriv)
                .set(referencesPriv).equalToWhenPresent(record::getReferencesPriv)
                .set(indexPriv).equalToWhenPresent(record::getIndexPriv)
                .set(alterPriv).equalToWhenPresent(record::getAlterPriv)
                .set(showDbPriv).equalToWhenPresent(record::getShowDbPriv)
                .set(superPriv).equalToWhenPresent(record::getSuperPriv)
                .set(createTmpTablePriv).equalToWhenPresent(record::getCreateTmpTablePriv)
                .set(lockTablesPriv).equalToWhenPresent(record::getLockTablesPriv)
                .set(executePriv).equalToWhenPresent(record::getExecutePriv)
                .set(replSlavePriv).equalToWhenPresent(record::getReplSlavePriv)
                .set(replClientPriv).equalToWhenPresent(record::getReplClientPriv)
                .set(createViewPriv).equalToWhenPresent(record::getCreateViewPriv)
                .set(showViewPriv).equalToWhenPresent(record::getShowViewPriv)
                .set(createRoutinePriv).equalToWhenPresent(record::getCreateRoutinePriv)
                .set(alterRoutinePriv).equalToWhenPresent(record::getAlterRoutinePriv)
                .set(createUserPriv).equalToWhenPresent(record::getCreateUserPriv)
                .set(eventPriv).equalToWhenPresent(record::getEventPriv)
                .set(triggerPriv).equalToWhenPresent(record::getTriggerPriv)
                .set(createTablespacePriv).equalToWhenPresent(record::getCreateTablespacePriv)
                .set(sslType).equalToWhenPresent(record::getSslType)
                .set(maxQuestions).equalToWhenPresent(record::getMaxQuestions)
                .set(maxUpdates).equalToWhenPresent(record::getMaxUpdates)
                .set(maxConnections).equalToWhenPresent(record::getMaxConnections)
                .set(maxUserConnections).equalToWhenPresent(record::getMaxUserConnections)
                .set(plugin).equalToWhenPresent(record::getPlugin)
                .set(passwordExpired).equalToWhenPresent(record::getPasswordExpired)
                .set(passwordLastChanged).equalToWhenPresent(record::getPasswordLastChanged)
                .set(passwordLifetime).equalToWhenPresent(record::getPasswordLifetime)
                .set(accountLocked).equalToWhenPresent(record::getAccountLocked)
                .set(createRolePriv).equalToWhenPresent(record::getCreateRolePriv)
                .set(dropRolePriv).equalToWhenPresent(record::getDropRolePriv)
                .set(passwordReuseHistory).equalToWhenPresent(record::getPasswordReuseHistory)
                .set(passwordReuseTime).equalToWhenPresent(record::getPasswordReuseTime)
                .set(passwordRequireCurrent).equalToWhenPresent(record::getPasswordRequireCurrent)
                .set(sslCipher).equalToWhenPresent(record::getSslCipher)
                .set(x509Issuer).equalToWhenPresent(record::getX509Issuer)
                .set(x509Subject).equalToWhenPresent(record::getX509Subject)
                .set(authenticationString).equalToWhenPresent(record::getAuthenticationString)
                .set(userAttributes).equalToWhenPresent(record::getUserAttributes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: user")
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(selectPriv).equalTo(record::getSelectPriv)
            .set(insertPriv).equalTo(record::getInsertPriv)
            .set(updatePriv).equalTo(record::getUpdatePriv)
            .set(deletePriv).equalTo(record::getDeletePriv)
            .set(createPriv).equalTo(record::getCreatePriv)
            .set(dropPriv).equalTo(record::getDropPriv)
            .set(reloadPriv).equalTo(record::getReloadPriv)
            .set(shutdownPriv).equalTo(record::getShutdownPriv)
            .set(processPriv).equalTo(record::getProcessPriv)
            .set(filePriv).equalTo(record::getFilePriv)
            .set(grantPriv).equalTo(record::getGrantPriv)
            .set(referencesPriv).equalTo(record::getReferencesPriv)
            .set(indexPriv).equalTo(record::getIndexPriv)
            .set(alterPriv).equalTo(record::getAlterPriv)
            .set(showDbPriv).equalTo(record::getShowDbPriv)
            .set(superPriv).equalTo(record::getSuperPriv)
            .set(createTmpTablePriv).equalTo(record::getCreateTmpTablePriv)
            .set(lockTablesPriv).equalTo(record::getLockTablesPriv)
            .set(executePriv).equalTo(record::getExecutePriv)
            .set(replSlavePriv).equalTo(record::getReplSlavePriv)
            .set(replClientPriv).equalTo(record::getReplClientPriv)
            .set(createViewPriv).equalTo(record::getCreateViewPriv)
            .set(showViewPriv).equalTo(record::getShowViewPriv)
            .set(createRoutinePriv).equalTo(record::getCreateRoutinePriv)
            .set(alterRoutinePriv).equalTo(record::getAlterRoutinePriv)
            .set(createUserPriv).equalTo(record::getCreateUserPriv)
            .set(eventPriv).equalTo(record::getEventPriv)
            .set(triggerPriv).equalTo(record::getTriggerPriv)
            .set(createTablespacePriv).equalTo(record::getCreateTablespacePriv)
            .set(sslType).equalTo(record::getSslType)
            .set(maxQuestions).equalTo(record::getMaxQuestions)
            .set(maxUpdates).equalTo(record::getMaxUpdates)
            .set(maxConnections).equalTo(record::getMaxConnections)
            .set(maxUserConnections).equalTo(record::getMaxUserConnections)
            .set(plugin).equalTo(record::getPlugin)
            .set(passwordExpired).equalTo(record::getPasswordExpired)
            .set(passwordLastChanged).equalTo(record::getPasswordLastChanged)
            .set(passwordLifetime).equalTo(record::getPasswordLifetime)
            .set(accountLocked).equalTo(record::getAccountLocked)
            .set(createRolePriv).equalTo(record::getCreateRolePriv)
            .set(dropRolePriv).equalTo(record::getDropRolePriv)
            .set(passwordReuseHistory).equalTo(record::getPasswordReuseHistory)
            .set(passwordReuseTime).equalTo(record::getPasswordReuseTime)
            .set(passwordRequireCurrent).equalTo(record::getPasswordRequireCurrent)
            .set(sslCipher).equalTo(record::getSslCipher)
            .set(x509Issuer).equalTo(record::getX509Issuer)
            .set(x509Subject).equalTo(record::getX509Subject)
            .set(authenticationString).equalTo(record::getAuthenticationString)
            .set(userAttributes).equalTo(record::getUserAttributes)
            .where(host, isEqualTo(record::getHost))
            .and(user.user, isEqualTo(record::getUser))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3580424+08:00", comments="Source Table: user")
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(selectPriv).equalToWhenPresent(record::getSelectPriv)
            .set(insertPriv).equalToWhenPresent(record::getInsertPriv)
            .set(updatePriv).equalToWhenPresent(record::getUpdatePriv)
            .set(deletePriv).equalToWhenPresent(record::getDeletePriv)
            .set(createPriv).equalToWhenPresent(record::getCreatePriv)
            .set(dropPriv).equalToWhenPresent(record::getDropPriv)
            .set(reloadPriv).equalToWhenPresent(record::getReloadPriv)
            .set(shutdownPriv).equalToWhenPresent(record::getShutdownPriv)
            .set(processPriv).equalToWhenPresent(record::getProcessPriv)
            .set(filePriv).equalToWhenPresent(record::getFilePriv)
            .set(grantPriv).equalToWhenPresent(record::getGrantPriv)
            .set(referencesPriv).equalToWhenPresent(record::getReferencesPriv)
            .set(indexPriv).equalToWhenPresent(record::getIndexPriv)
            .set(alterPriv).equalToWhenPresent(record::getAlterPriv)
            .set(showDbPriv).equalToWhenPresent(record::getShowDbPriv)
            .set(superPriv).equalToWhenPresent(record::getSuperPriv)
            .set(createTmpTablePriv).equalToWhenPresent(record::getCreateTmpTablePriv)
            .set(lockTablesPriv).equalToWhenPresent(record::getLockTablesPriv)
            .set(executePriv).equalToWhenPresent(record::getExecutePriv)
            .set(replSlavePriv).equalToWhenPresent(record::getReplSlavePriv)
            .set(replClientPriv).equalToWhenPresent(record::getReplClientPriv)
            .set(createViewPriv).equalToWhenPresent(record::getCreateViewPriv)
            .set(showViewPriv).equalToWhenPresent(record::getShowViewPriv)
            .set(createRoutinePriv).equalToWhenPresent(record::getCreateRoutinePriv)
            .set(alterRoutinePriv).equalToWhenPresent(record::getAlterRoutinePriv)
            .set(createUserPriv).equalToWhenPresent(record::getCreateUserPriv)
            .set(eventPriv).equalToWhenPresent(record::getEventPriv)
            .set(triggerPriv).equalToWhenPresent(record::getTriggerPriv)
            .set(createTablespacePriv).equalToWhenPresent(record::getCreateTablespacePriv)
            .set(sslType).equalToWhenPresent(record::getSslType)
            .set(maxQuestions).equalToWhenPresent(record::getMaxQuestions)
            .set(maxUpdates).equalToWhenPresent(record::getMaxUpdates)
            .set(maxConnections).equalToWhenPresent(record::getMaxConnections)
            .set(maxUserConnections).equalToWhenPresent(record::getMaxUserConnections)
            .set(plugin).equalToWhenPresent(record::getPlugin)
            .set(passwordExpired).equalToWhenPresent(record::getPasswordExpired)
            .set(passwordLastChanged).equalToWhenPresent(record::getPasswordLastChanged)
            .set(passwordLifetime).equalToWhenPresent(record::getPasswordLifetime)
            .set(accountLocked).equalToWhenPresent(record::getAccountLocked)
            .set(createRolePriv).equalToWhenPresent(record::getCreateRolePriv)
            .set(dropRolePriv).equalToWhenPresent(record::getDropRolePriv)
            .set(passwordReuseHistory).equalToWhenPresent(record::getPasswordReuseHistory)
            .set(passwordReuseTime).equalToWhenPresent(record::getPasswordReuseTime)
            .set(passwordRequireCurrent).equalToWhenPresent(record::getPasswordRequireCurrent)
            .set(sslCipher).equalToWhenPresent(record::getSslCipher)
            .set(x509Issuer).equalToWhenPresent(record::getX509Issuer)
            .set(x509Subject).equalToWhenPresent(record::getX509Subject)
            .set(authenticationString).equalToWhenPresent(record::getAuthenticationString)
            .set(userAttributes).equalToWhenPresent(record::getUserAttributes)
            .where(host, isEqualTo(record::getHost))
            .and(user.user, isEqualTo(record::getUser))
        );
    }
}