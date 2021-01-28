package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Host")
    public static final SqlColumn<String> host = user.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Select_priv")
    public static final SqlColumn<String> selectPriv = user.selectPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Insert_priv")
    public static final SqlColumn<String> insertPriv = user.insertPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Update_priv")
    public static final SqlColumn<String> updatePriv = user.updatePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Delete_priv")
    public static final SqlColumn<String> deletePriv = user.deletePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Create_priv")
    public static final SqlColumn<String> createPriv = user.createPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Drop_priv")
    public static final SqlColumn<String> dropPriv = user.dropPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Reload_priv")
    public static final SqlColumn<String> reloadPriv = user.reloadPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Shutdown_priv")
    public static final SqlColumn<String> shutdownPriv = user.shutdownPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.Process_priv")
    public static final SqlColumn<String> processPriv = user.processPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.File_priv")
    public static final SqlColumn<String> filePriv = user.filePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Grant_priv")
    public static final SqlColumn<String> grantPriv = user.grantPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.References_priv")
    public static final SqlColumn<String> referencesPriv = user.referencesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Index_priv")
    public static final SqlColumn<String> indexPriv = user.indexPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Alter_priv")
    public static final SqlColumn<String> alterPriv = user.alterPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Show_db_priv")
    public static final SqlColumn<String> showDbPriv = user.showDbPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Super_priv")
    public static final SqlColumn<String> superPriv = user.superPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Create_tmp_table_priv")
    public static final SqlColumn<String> createTmpTablePriv = user.createTmpTablePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Lock_tables_priv")
    public static final SqlColumn<String> lockTablesPriv = user.lockTablesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Execute_priv")
    public static final SqlColumn<String> executePriv = user.executePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Repl_slave_priv")
    public static final SqlColumn<String> replSlavePriv = user.replSlavePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Repl_client_priv")
    public static final SqlColumn<String> replClientPriv = user.replClientPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Create_view_priv")
    public static final SqlColumn<String> createViewPriv = user.createViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Show_view_priv")
    public static final SqlColumn<String> showViewPriv = user.showViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Create_routine_priv")
    public static final SqlColumn<String> createRoutinePriv = user.createRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Alter_routine_priv")
    public static final SqlColumn<String> alterRoutinePriv = user.alterRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Create_user_priv")
    public static final SqlColumn<String> createUserPriv = user.createUserPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Event_priv")
    public static final SqlColumn<String> eventPriv = user.eventPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Trigger_priv")
    public static final SqlColumn<String> triggerPriv = user.triggerPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3550392+08:00", comments="Source field: user.Create_tablespace_priv")
    public static final SqlColumn<String> createTablespacePriv = user.createTablespacePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.ssl_type")
    public static final SqlColumn<String> sslType = user.sslType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.max_questions")
    public static final SqlColumn<Integer> maxQuestions = user.maxQuestions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.max_updates")
    public static final SqlColumn<Integer> maxUpdates = user.maxUpdates;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.max_connections")
    public static final SqlColumn<Integer> maxConnections = user.maxConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.max_user_connections")
    public static final SqlColumn<Integer> maxUserConnections = user.maxUserConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.plugin")
    public static final SqlColumn<String> plugin = user.plugin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.password_expired")
    public static final SqlColumn<String> passwordExpired = user.passwordExpired;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.password_last_changed")
    public static final SqlColumn<Date> passwordLastChanged = user.passwordLastChanged;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.password_lifetime")
    public static final SqlColumn<Short> passwordLifetime = user.passwordLifetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.account_locked")
    public static final SqlColumn<String> accountLocked = user.accountLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.Create_role_priv")
    public static final SqlColumn<String> createRolePriv = user.createRolePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.Drop_role_priv")
    public static final SqlColumn<String> dropRolePriv = user.dropRolePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.Password_reuse_history")
    public static final SqlColumn<Short> passwordReuseHistory = user.passwordReuseHistory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.Password_reuse_time")
    public static final SqlColumn<Short> passwordReuseTime = user.passwordReuseTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.Password_require_current")
    public static final SqlColumn<String> passwordRequireCurrent = user.passwordRequireCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.ssl_cipher")
    public static final SqlColumn<byte[]> sslCipher = user.sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.x509_issuer")
    public static final SqlColumn<byte[]> x509Issuer = user.x509Issuer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3560392+08:00", comments="Source field: user.x509_subject")
    public static final SqlColumn<byte[]> x509Subject = user.x509Subject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source field: user.authentication_string")
    public static final SqlColumn<String> authenticationString = user.authenticationString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3570401+08:00", comments="Source field: user.User_attributes")
    public static final SqlColumn<String> userAttributes = user.userAttributes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<String> selectPriv = column("Select_priv", JDBCType.CHAR);

        public final SqlColumn<String> insertPriv = column("Insert_priv", JDBCType.CHAR);

        public final SqlColumn<String> updatePriv = column("Update_priv", JDBCType.CHAR);

        public final SqlColumn<String> deletePriv = column("Delete_priv", JDBCType.CHAR);

        public final SqlColumn<String> createPriv = column("Create_priv", JDBCType.CHAR);

        public final SqlColumn<String> dropPriv = column("Drop_priv", JDBCType.CHAR);

        public final SqlColumn<String> reloadPriv = column("Reload_priv", JDBCType.CHAR);

        public final SqlColumn<String> shutdownPriv = column("Shutdown_priv", JDBCType.CHAR);

        public final SqlColumn<String> processPriv = column("Process_priv", JDBCType.CHAR);

        public final SqlColumn<String> filePriv = column("File_priv", JDBCType.CHAR);

        public final SqlColumn<String> grantPriv = column("Grant_priv", JDBCType.CHAR);

        public final SqlColumn<String> referencesPriv = column("References_priv", JDBCType.CHAR);

        public final SqlColumn<String> indexPriv = column("Index_priv", JDBCType.CHAR);

        public final SqlColumn<String> alterPriv = column("Alter_priv", JDBCType.CHAR);

        public final SqlColumn<String> showDbPriv = column("Show_db_priv", JDBCType.CHAR);

        public final SqlColumn<String> superPriv = column("Super_priv", JDBCType.CHAR);

        public final SqlColumn<String> createTmpTablePriv = column("Create_tmp_table_priv", JDBCType.CHAR);

        public final SqlColumn<String> lockTablesPriv = column("Lock_tables_priv", JDBCType.CHAR);

        public final SqlColumn<String> executePriv = column("Execute_priv", JDBCType.CHAR);

        public final SqlColumn<String> replSlavePriv = column("Repl_slave_priv", JDBCType.CHAR);

        public final SqlColumn<String> replClientPriv = column("Repl_client_priv", JDBCType.CHAR);

        public final SqlColumn<String> createViewPriv = column("Create_view_priv", JDBCType.CHAR);

        public final SqlColumn<String> showViewPriv = column("Show_view_priv", JDBCType.CHAR);

        public final SqlColumn<String> createRoutinePriv = column("Create_routine_priv", JDBCType.CHAR);

        public final SqlColumn<String> alterRoutinePriv = column("Alter_routine_priv", JDBCType.CHAR);

        public final SqlColumn<String> createUserPriv = column("Create_user_priv", JDBCType.CHAR);

        public final SqlColumn<String> eventPriv = column("Event_priv", JDBCType.CHAR);

        public final SqlColumn<String> triggerPriv = column("Trigger_priv", JDBCType.CHAR);

        public final SqlColumn<String> createTablespacePriv = column("Create_tablespace_priv", JDBCType.CHAR);

        public final SqlColumn<String> sslType = column("ssl_type", JDBCType.CHAR);

        public final SqlColumn<Integer> maxQuestions = column("max_questions", JDBCType.INTEGER);

        public final SqlColumn<Integer> maxUpdates = column("max_updates", JDBCType.INTEGER);

        public final SqlColumn<Integer> maxConnections = column("max_connections", JDBCType.INTEGER);

        public final SqlColumn<Integer> maxUserConnections = column("max_user_connections", JDBCType.INTEGER);

        public final SqlColumn<String> plugin = column("plugin", JDBCType.CHAR);

        public final SqlColumn<String> passwordExpired = column("password_expired", JDBCType.CHAR);

        public final SqlColumn<Date> passwordLastChanged = column("password_last_changed", JDBCType.TIMESTAMP);

        public final SqlColumn<Short> passwordLifetime = column("password_lifetime", JDBCType.SMALLINT);

        public final SqlColumn<String> accountLocked = column("account_locked", JDBCType.CHAR);

        public final SqlColumn<String> createRolePriv = column("Create_role_priv", JDBCType.CHAR);

        public final SqlColumn<String> dropRolePriv = column("Drop_role_priv", JDBCType.CHAR);

        public final SqlColumn<Short> passwordReuseHistory = column("Password_reuse_history", JDBCType.SMALLINT);

        public final SqlColumn<Short> passwordReuseTime = column("Password_reuse_time", JDBCType.SMALLINT);

        public final SqlColumn<String> passwordRequireCurrent = column("Password_require_current", JDBCType.CHAR);

        public final SqlColumn<byte[]> sslCipher = column("ssl_cipher", JDBCType.LONGVARBINARY);

        public final SqlColumn<byte[]> x509Issuer = column("x509_issuer", JDBCType.LONGVARBINARY);

        public final SqlColumn<byte[]> x509Subject = column("x509_subject", JDBCType.LONGVARBINARY);

        public final SqlColumn<String> authenticationString = column("authentication_string", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> userAttributes = column("User_attributes", JDBCType.LONGVARCHAR);

        public User() {
            super("user");
        }
    }
}