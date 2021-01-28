package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class User implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.User")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Select_priv")
    private String selectPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Insert_priv")
    private String insertPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Update_priv")
    private String updatePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Delete_priv")
    private String deletePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_priv")
    private String createPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Drop_priv")
    private String dropPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Reload_priv")
    private String reloadPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Shutdown_priv")
    private String shutdownPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Process_priv")
    private String processPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.File_priv")
    private String filePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Grant_priv")
    private String grantPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.References_priv")
    private String referencesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Index_priv")
    private String indexPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Alter_priv")
    private String alterPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Show_db_priv")
    private String showDbPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Super_priv")
    private String superPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_tmp_table_priv")
    private String createTmpTablePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Lock_tables_priv")
    private String lockTablesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Execute_priv")
    private String executePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Repl_slave_priv")
    private String replSlavePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Repl_client_priv")
    private String replClientPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_view_priv")
    private String createViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Show_view_priv")
    private String showViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_routine_priv")
    private String createRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Alter_routine_priv")
    private String alterRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_user_priv")
    private String createUserPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Event_priv")
    private String eventPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Trigger_priv")
    private String triggerPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_tablespace_priv")
    private String createTablespacePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.ssl_type")
    private String sslType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_questions")
    private Integer maxQuestions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_updates")
    private Integer maxUpdates;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_connections")
    private Integer maxConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_user_connections")
    private Integer maxUserConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.plugin")
    private String plugin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_expired")
    private String passwordExpired;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_last_changed")
    private Date passwordLastChanged;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_lifetime")
    private Short passwordLifetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.account_locked")
    private String accountLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_role_priv")
    private String createRolePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Drop_role_priv")
    private String dropRolePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_reuse_history")
    private Short passwordReuseHistory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_reuse_time")
    private Short passwordReuseTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_require_current")
    private String passwordRequireCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.ssl_cipher")
    private byte[] sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.x509_issuer")
    private byte[] x509Issuer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.x509_subject")
    private byte[] x509Subject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.authentication_string")
    private String authenticationString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.User_attributes")
    private String userAttributes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source Table: user")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.User")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.User")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Select_priv")
    public String getSelectPriv() {
        return selectPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Select_priv")
    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Insert_priv")
    public String getInsertPriv() {
        return insertPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Insert_priv")
    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Update_priv")
    public String getUpdatePriv() {
        return updatePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Update_priv")
    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Delete_priv")
    public String getDeletePriv() {
        return deletePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Delete_priv")
    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_priv")
    public String getCreatePriv() {
        return createPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_priv")
    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Drop_priv")
    public String getDropPriv() {
        return dropPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Drop_priv")
    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Reload_priv")
    public String getReloadPriv() {
        return reloadPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Reload_priv")
    public void setReloadPriv(String reloadPriv) {
        this.reloadPriv = reloadPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Shutdown_priv")
    public String getShutdownPriv() {
        return shutdownPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Shutdown_priv")
    public void setShutdownPriv(String shutdownPriv) {
        this.shutdownPriv = shutdownPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Process_priv")
    public String getProcessPriv() {
        return processPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Process_priv")
    public void setProcessPriv(String processPriv) {
        this.processPriv = processPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.File_priv")
    public String getFilePriv() {
        return filePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.File_priv")
    public void setFilePriv(String filePriv) {
        this.filePriv = filePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Grant_priv")
    public String getGrantPriv() {
        return grantPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Grant_priv")
    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.References_priv")
    public String getReferencesPriv() {
        return referencesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.References_priv")
    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Index_priv")
    public String getIndexPriv() {
        return indexPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Index_priv")
    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Alter_priv")
    public String getAlterPriv() {
        return alterPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Alter_priv")
    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Show_db_priv")
    public String getShowDbPriv() {
        return showDbPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Show_db_priv")
    public void setShowDbPriv(String showDbPriv) {
        this.showDbPriv = showDbPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Super_priv")
    public String getSuperPriv() {
        return superPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Super_priv")
    public void setSuperPriv(String superPriv) {
        this.superPriv = superPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_tmp_table_priv")
    public String getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_tmp_table_priv")
    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Lock_tables_priv")
    public String getLockTablesPriv() {
        return lockTablesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Lock_tables_priv")
    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Execute_priv")
    public String getExecutePriv() {
        return executePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Execute_priv")
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Repl_slave_priv")
    public String getReplSlavePriv() {
        return replSlavePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Repl_slave_priv")
    public void setReplSlavePriv(String replSlavePriv) {
        this.replSlavePriv = replSlavePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Repl_client_priv")
    public String getReplClientPriv() {
        return replClientPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Repl_client_priv")
    public void setReplClientPriv(String replClientPriv) {
        this.replClientPriv = replClientPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_view_priv")
    public String getCreateViewPriv() {
        return createViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_view_priv")
    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Show_view_priv")
    public String getShowViewPriv() {
        return showViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Show_view_priv")
    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_routine_priv")
    public String getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_routine_priv")
    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Alter_routine_priv")
    public String getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Alter_routine_priv")
    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_user_priv")
    public String getCreateUserPriv() {
        return createUserPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_user_priv")
    public void setCreateUserPriv(String createUserPriv) {
        this.createUserPriv = createUserPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Event_priv")
    public String getEventPriv() {
        return eventPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Event_priv")
    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Trigger_priv")
    public String getTriggerPriv() {
        return triggerPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Trigger_priv")
    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_tablespace_priv")
    public String getCreateTablespacePriv() {
        return createTablespacePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_tablespace_priv")
    public void setCreateTablespacePriv(String createTablespacePriv) {
        this.createTablespacePriv = createTablespacePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.ssl_type")
    public String getSslType() {
        return sslType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.ssl_type")
    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_questions")
    public Integer getMaxQuestions() {
        return maxQuestions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_questions")
    public void setMaxQuestions(Integer maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_updates")
    public Integer getMaxUpdates() {
        return maxUpdates;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_updates")
    public void setMaxUpdates(Integer maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_connections")
    public Integer getMaxConnections() {
        return maxConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_connections")
    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_user_connections")
    public Integer getMaxUserConnections() {
        return maxUserConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.max_user_connections")
    public void setMaxUserConnections(Integer maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.plugin")
    public String getPlugin() {
        return plugin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_expired")
    public String getPasswordExpired() {
        return passwordExpired;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_expired")
    public void setPasswordExpired(String passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_last_changed")
    public Date getPasswordLastChanged() {
        return passwordLastChanged;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_last_changed")
    public void setPasswordLastChanged(Date passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_lifetime")
    public Short getPasswordLifetime() {
        return passwordLifetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.password_lifetime")
    public void setPasswordLifetime(Short passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.account_locked")
    public String getAccountLocked() {
        return accountLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.account_locked")
    public void setAccountLocked(String accountLocked) {
        this.accountLocked = accountLocked;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_role_priv")
    public String getCreateRolePriv() {
        return createRolePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Create_role_priv")
    public void setCreateRolePriv(String createRolePriv) {
        this.createRolePriv = createRolePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Drop_role_priv")
    public String getDropRolePriv() {
        return dropRolePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Drop_role_priv")
    public void setDropRolePriv(String dropRolePriv) {
        this.dropRolePriv = dropRolePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_reuse_history")
    public Short getPasswordReuseHistory() {
        return passwordReuseHistory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_reuse_history")
    public void setPasswordReuseHistory(Short passwordReuseHistory) {
        this.passwordReuseHistory = passwordReuseHistory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_reuse_time")
    public Short getPasswordReuseTime() {
        return passwordReuseTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_reuse_time")
    public void setPasswordReuseTime(Short passwordReuseTime) {
        this.passwordReuseTime = passwordReuseTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_require_current")
    public String getPasswordRequireCurrent() {
        return passwordRequireCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.Password_require_current")
    public void setPasswordRequireCurrent(String passwordRequireCurrent) {
        this.passwordRequireCurrent = passwordRequireCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.ssl_cipher")
    public byte[] getSslCipher() {
        return sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3530371+08:00", comments="Source field: user.ssl_cipher")
    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.x509_issuer")
    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.x509_issuer")
    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.x509_subject")
    public byte[] getX509Subject() {
        return x509Subject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.x509_subject")
    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.authentication_string")
    public String getAuthenticationString() {
        return authenticationString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.authentication_string")
    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.User_attributes")
    public String getUserAttributes() {
        return userAttributes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source field: user.User_attributes")
    public void setUserAttributes(String userAttributes) {
        this.userAttributes = userAttributes;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source Table: user")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", selectPriv=").append(selectPriv);
        sb.append(", insertPriv=").append(insertPriv);
        sb.append(", updatePriv=").append(updatePriv);
        sb.append(", deletePriv=").append(deletePriv);
        sb.append(", createPriv=").append(createPriv);
        sb.append(", dropPriv=").append(dropPriv);
        sb.append(", reloadPriv=").append(reloadPriv);
        sb.append(", shutdownPriv=").append(shutdownPriv);
        sb.append(", processPriv=").append(processPriv);
        sb.append(", filePriv=").append(filePriv);
        sb.append(", grantPriv=").append(grantPriv);
        sb.append(", referencesPriv=").append(referencesPriv);
        sb.append(", indexPriv=").append(indexPriv);
        sb.append(", alterPriv=").append(alterPriv);
        sb.append(", showDbPriv=").append(showDbPriv);
        sb.append(", superPriv=").append(superPriv);
        sb.append(", createTmpTablePriv=").append(createTmpTablePriv);
        sb.append(", lockTablesPriv=").append(lockTablesPriv);
        sb.append(", executePriv=").append(executePriv);
        sb.append(", replSlavePriv=").append(replSlavePriv);
        sb.append(", replClientPriv=").append(replClientPriv);
        sb.append(", createViewPriv=").append(createViewPriv);
        sb.append(", showViewPriv=").append(showViewPriv);
        sb.append(", createRoutinePriv=").append(createRoutinePriv);
        sb.append(", alterRoutinePriv=").append(alterRoutinePriv);
        sb.append(", createUserPriv=").append(createUserPriv);
        sb.append(", eventPriv=").append(eventPriv);
        sb.append(", triggerPriv=").append(triggerPriv);
        sb.append(", createTablespacePriv=").append(createTablespacePriv);
        sb.append(", sslType=").append(sslType);
        sb.append(", maxQuestions=").append(maxQuestions);
        sb.append(", maxUpdates=").append(maxUpdates);
        sb.append(", maxConnections=").append(maxConnections);
        sb.append(", maxUserConnections=").append(maxUserConnections);
        sb.append(", plugin=").append(plugin);
        sb.append(", passwordExpired=").append(passwordExpired);
        sb.append(", passwordLastChanged=").append(passwordLastChanged);
        sb.append(", passwordLifetime=").append(passwordLifetime);
        sb.append(", accountLocked=").append(accountLocked);
        sb.append(", createRolePriv=").append(createRolePriv);
        sb.append(", dropRolePriv=").append(dropRolePriv);
        sb.append(", passwordReuseHistory=").append(passwordReuseHistory);
        sb.append(", passwordReuseTime=").append(passwordReuseTime);
        sb.append(", passwordRequireCurrent=").append(passwordRequireCurrent);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", x509Issuer=").append(x509Issuer);
        sb.append(", x509Subject=").append(x509Subject);
        sb.append(", authenticationString=").append(authenticationString);
        sb.append(", userAttributes=").append(userAttributes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source Table: user")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getSelectPriv() == null ? other.getSelectPriv() == null : this.getSelectPriv().equals(other.getSelectPriv()))
            && (this.getInsertPriv() == null ? other.getInsertPriv() == null : this.getInsertPriv().equals(other.getInsertPriv()))
            && (this.getUpdatePriv() == null ? other.getUpdatePriv() == null : this.getUpdatePriv().equals(other.getUpdatePriv()))
            && (this.getDeletePriv() == null ? other.getDeletePriv() == null : this.getDeletePriv().equals(other.getDeletePriv()))
            && (this.getCreatePriv() == null ? other.getCreatePriv() == null : this.getCreatePriv().equals(other.getCreatePriv()))
            && (this.getDropPriv() == null ? other.getDropPriv() == null : this.getDropPriv().equals(other.getDropPriv()))
            && (this.getReloadPriv() == null ? other.getReloadPriv() == null : this.getReloadPriv().equals(other.getReloadPriv()))
            && (this.getShutdownPriv() == null ? other.getShutdownPriv() == null : this.getShutdownPriv().equals(other.getShutdownPriv()))
            && (this.getProcessPriv() == null ? other.getProcessPriv() == null : this.getProcessPriv().equals(other.getProcessPriv()))
            && (this.getFilePriv() == null ? other.getFilePriv() == null : this.getFilePriv().equals(other.getFilePriv()))
            && (this.getGrantPriv() == null ? other.getGrantPriv() == null : this.getGrantPriv().equals(other.getGrantPriv()))
            && (this.getReferencesPriv() == null ? other.getReferencesPriv() == null : this.getReferencesPriv().equals(other.getReferencesPriv()))
            && (this.getIndexPriv() == null ? other.getIndexPriv() == null : this.getIndexPriv().equals(other.getIndexPriv()))
            && (this.getAlterPriv() == null ? other.getAlterPriv() == null : this.getAlterPriv().equals(other.getAlterPriv()))
            && (this.getShowDbPriv() == null ? other.getShowDbPriv() == null : this.getShowDbPriv().equals(other.getShowDbPriv()))
            && (this.getSuperPriv() == null ? other.getSuperPriv() == null : this.getSuperPriv().equals(other.getSuperPriv()))
            && (this.getCreateTmpTablePriv() == null ? other.getCreateTmpTablePriv() == null : this.getCreateTmpTablePriv().equals(other.getCreateTmpTablePriv()))
            && (this.getLockTablesPriv() == null ? other.getLockTablesPriv() == null : this.getLockTablesPriv().equals(other.getLockTablesPriv()))
            && (this.getExecutePriv() == null ? other.getExecutePriv() == null : this.getExecutePriv().equals(other.getExecutePriv()))
            && (this.getReplSlavePriv() == null ? other.getReplSlavePriv() == null : this.getReplSlavePriv().equals(other.getReplSlavePriv()))
            && (this.getReplClientPriv() == null ? other.getReplClientPriv() == null : this.getReplClientPriv().equals(other.getReplClientPriv()))
            && (this.getCreateViewPriv() == null ? other.getCreateViewPriv() == null : this.getCreateViewPriv().equals(other.getCreateViewPriv()))
            && (this.getShowViewPriv() == null ? other.getShowViewPriv() == null : this.getShowViewPriv().equals(other.getShowViewPriv()))
            && (this.getCreateRoutinePriv() == null ? other.getCreateRoutinePriv() == null : this.getCreateRoutinePriv().equals(other.getCreateRoutinePriv()))
            && (this.getAlterRoutinePriv() == null ? other.getAlterRoutinePriv() == null : this.getAlterRoutinePriv().equals(other.getAlterRoutinePriv()))
            && (this.getCreateUserPriv() == null ? other.getCreateUserPriv() == null : this.getCreateUserPriv().equals(other.getCreateUserPriv()))
            && (this.getEventPriv() == null ? other.getEventPriv() == null : this.getEventPriv().equals(other.getEventPriv()))
            && (this.getTriggerPriv() == null ? other.getTriggerPriv() == null : this.getTriggerPriv().equals(other.getTriggerPriv()))
            && (this.getCreateTablespacePriv() == null ? other.getCreateTablespacePriv() == null : this.getCreateTablespacePriv().equals(other.getCreateTablespacePriv()))
            && (this.getSslType() == null ? other.getSslType() == null : this.getSslType().equals(other.getSslType()))
            && (this.getMaxQuestions() == null ? other.getMaxQuestions() == null : this.getMaxQuestions().equals(other.getMaxQuestions()))
            && (this.getMaxUpdates() == null ? other.getMaxUpdates() == null : this.getMaxUpdates().equals(other.getMaxUpdates()))
            && (this.getMaxConnections() == null ? other.getMaxConnections() == null : this.getMaxConnections().equals(other.getMaxConnections()))
            && (this.getMaxUserConnections() == null ? other.getMaxUserConnections() == null : this.getMaxUserConnections().equals(other.getMaxUserConnections()))
            && (this.getPlugin() == null ? other.getPlugin() == null : this.getPlugin().equals(other.getPlugin()))
            && (this.getPasswordExpired() == null ? other.getPasswordExpired() == null : this.getPasswordExpired().equals(other.getPasswordExpired()))
            && (this.getPasswordLastChanged() == null ? other.getPasswordLastChanged() == null : this.getPasswordLastChanged().equals(other.getPasswordLastChanged()))
            && (this.getPasswordLifetime() == null ? other.getPasswordLifetime() == null : this.getPasswordLifetime().equals(other.getPasswordLifetime()))
            && (this.getAccountLocked() == null ? other.getAccountLocked() == null : this.getAccountLocked().equals(other.getAccountLocked()))
            && (this.getCreateRolePriv() == null ? other.getCreateRolePriv() == null : this.getCreateRolePriv().equals(other.getCreateRolePriv()))
            && (this.getDropRolePriv() == null ? other.getDropRolePriv() == null : this.getDropRolePriv().equals(other.getDropRolePriv()))
            && (this.getPasswordReuseHistory() == null ? other.getPasswordReuseHistory() == null : this.getPasswordReuseHistory().equals(other.getPasswordReuseHistory()))
            && (this.getPasswordReuseTime() == null ? other.getPasswordReuseTime() == null : this.getPasswordReuseTime().equals(other.getPasswordReuseTime()))
            && (this.getPasswordRequireCurrent() == null ? other.getPasswordRequireCurrent() == null : this.getPasswordRequireCurrent().equals(other.getPasswordRequireCurrent()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3540389+08:00", comments="Source Table: user")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getSelectPriv() == null) ? 0 : getSelectPriv().hashCode());
        result = prime * result + ((getInsertPriv() == null) ? 0 : getInsertPriv().hashCode());
        result = prime * result + ((getUpdatePriv() == null) ? 0 : getUpdatePriv().hashCode());
        result = prime * result + ((getDeletePriv() == null) ? 0 : getDeletePriv().hashCode());
        result = prime * result + ((getCreatePriv() == null) ? 0 : getCreatePriv().hashCode());
        result = prime * result + ((getDropPriv() == null) ? 0 : getDropPriv().hashCode());
        result = prime * result + ((getReloadPriv() == null) ? 0 : getReloadPriv().hashCode());
        result = prime * result + ((getShutdownPriv() == null) ? 0 : getShutdownPriv().hashCode());
        result = prime * result + ((getProcessPriv() == null) ? 0 : getProcessPriv().hashCode());
        result = prime * result + ((getFilePriv() == null) ? 0 : getFilePriv().hashCode());
        result = prime * result + ((getGrantPriv() == null) ? 0 : getGrantPriv().hashCode());
        result = prime * result + ((getReferencesPriv() == null) ? 0 : getReferencesPriv().hashCode());
        result = prime * result + ((getIndexPriv() == null) ? 0 : getIndexPriv().hashCode());
        result = prime * result + ((getAlterPriv() == null) ? 0 : getAlterPriv().hashCode());
        result = prime * result + ((getShowDbPriv() == null) ? 0 : getShowDbPriv().hashCode());
        result = prime * result + ((getSuperPriv() == null) ? 0 : getSuperPriv().hashCode());
        result = prime * result + ((getCreateTmpTablePriv() == null) ? 0 : getCreateTmpTablePriv().hashCode());
        result = prime * result + ((getLockTablesPriv() == null) ? 0 : getLockTablesPriv().hashCode());
        result = prime * result + ((getExecutePriv() == null) ? 0 : getExecutePriv().hashCode());
        result = prime * result + ((getReplSlavePriv() == null) ? 0 : getReplSlavePriv().hashCode());
        result = prime * result + ((getReplClientPriv() == null) ? 0 : getReplClientPriv().hashCode());
        result = prime * result + ((getCreateViewPriv() == null) ? 0 : getCreateViewPriv().hashCode());
        result = prime * result + ((getShowViewPriv() == null) ? 0 : getShowViewPriv().hashCode());
        result = prime * result + ((getCreateRoutinePriv() == null) ? 0 : getCreateRoutinePriv().hashCode());
        result = prime * result + ((getAlterRoutinePriv() == null) ? 0 : getAlterRoutinePriv().hashCode());
        result = prime * result + ((getCreateUserPriv() == null) ? 0 : getCreateUserPriv().hashCode());
        result = prime * result + ((getEventPriv() == null) ? 0 : getEventPriv().hashCode());
        result = prime * result + ((getTriggerPriv() == null) ? 0 : getTriggerPriv().hashCode());
        result = prime * result + ((getCreateTablespacePriv() == null) ? 0 : getCreateTablespacePriv().hashCode());
        result = prime * result + ((getSslType() == null) ? 0 : getSslType().hashCode());
        result = prime * result + ((getMaxQuestions() == null) ? 0 : getMaxQuestions().hashCode());
        result = prime * result + ((getMaxUpdates() == null) ? 0 : getMaxUpdates().hashCode());
        result = prime * result + ((getMaxConnections() == null) ? 0 : getMaxConnections().hashCode());
        result = prime * result + ((getMaxUserConnections() == null) ? 0 : getMaxUserConnections().hashCode());
        result = prime * result + ((getPlugin() == null) ? 0 : getPlugin().hashCode());
        result = prime * result + ((getPasswordExpired() == null) ? 0 : getPasswordExpired().hashCode());
        result = prime * result + ((getPasswordLastChanged() == null) ? 0 : getPasswordLastChanged().hashCode());
        result = prime * result + ((getPasswordLifetime() == null) ? 0 : getPasswordLifetime().hashCode());
        result = prime * result + ((getAccountLocked() == null) ? 0 : getAccountLocked().hashCode());
        result = prime * result + ((getCreateRolePriv() == null) ? 0 : getCreateRolePriv().hashCode());
        result = prime * result + ((getDropRolePriv() == null) ? 0 : getDropRolePriv().hashCode());
        result = prime * result + ((getPasswordReuseHistory() == null) ? 0 : getPasswordReuseHistory().hashCode());
        result = prime * result + ((getPasswordReuseTime() == null) ? 0 : getPasswordReuseTime().hashCode());
        result = prime * result + ((getPasswordRequireCurrent() == null) ? 0 : getPasswordRequireCurrent().hashCode());
        return result;
    }
}