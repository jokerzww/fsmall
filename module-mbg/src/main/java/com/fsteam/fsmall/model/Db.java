package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Db implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.User")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Select_priv")
    private String selectPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Insert_priv")
    private String insertPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Update_priv")
    private String updatePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Delete_priv")
    private String deletePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Create_priv")
    private String createPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Drop_priv")
    private String dropPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Grant_priv")
    private String grantPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.References_priv")
    private String referencesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Index_priv")
    private String indexPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Alter_priv")
    private String alterPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_tmp_table_priv")
    private String createTmpTablePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Lock_tables_priv")
    private String lockTablesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_view_priv")
    private String createViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Show_view_priv")
    private String showViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_routine_priv")
    private String createRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Alter_routine_priv")
    private String alterRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Execute_priv")
    private String executePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Event_priv")
    private String eventPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Trigger_priv")
    private String triggerPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source Table: db")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Host")
    public void setHost(String host) {
        this.host = host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.User")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.User")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Select_priv")
    public String getSelectPriv() {
        return selectPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Select_priv")
    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Insert_priv")
    public String getInsertPriv() {
        return insertPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Insert_priv")
    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Update_priv")
    public String getUpdatePriv() {
        return updatePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Update_priv")
    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Delete_priv")
    public String getDeletePriv() {
        return deletePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Delete_priv")
    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Create_priv")
    public String getCreatePriv() {
        return createPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Create_priv")
    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Drop_priv")
    public String getDropPriv() {
        return dropPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source field: db.Drop_priv")
    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Grant_priv")
    public String getGrantPriv() {
        return grantPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Grant_priv")
    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.References_priv")
    public String getReferencesPriv() {
        return referencesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.References_priv")
    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Index_priv")
    public String getIndexPriv() {
        return indexPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Index_priv")
    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Alter_priv")
    public String getAlterPriv() {
        return alterPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Alter_priv")
    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_tmp_table_priv")
    public String getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_tmp_table_priv")
    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Lock_tables_priv")
    public String getLockTablesPriv() {
        return lockTablesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Lock_tables_priv")
    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_view_priv")
    public String getCreateViewPriv() {
        return createViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_view_priv")
    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Show_view_priv")
    public String getShowViewPriv() {
        return showViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Show_view_priv")
    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_routine_priv")
    public String getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_routine_priv")
    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Alter_routine_priv")
    public String getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Alter_routine_priv")
    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Execute_priv")
    public String getExecutePriv() {
        return executePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Execute_priv")
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Event_priv")
    public String getEventPriv() {
        return eventPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Event_priv")
    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Trigger_priv")
    public String getTriggerPriv() {
        return triggerPriv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Trigger_priv")
    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source Table: db")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", db=").append(db);
        sb.append(", user=").append(user);
        sb.append(", selectPriv=").append(selectPriv);
        sb.append(", insertPriv=").append(insertPriv);
        sb.append(", updatePriv=").append(updatePriv);
        sb.append(", deletePriv=").append(deletePriv);
        sb.append(", createPriv=").append(createPriv);
        sb.append(", dropPriv=").append(dropPriv);
        sb.append(", grantPriv=").append(grantPriv);
        sb.append(", referencesPriv=").append(referencesPriv);
        sb.append(", indexPriv=").append(indexPriv);
        sb.append(", alterPriv=").append(alterPriv);
        sb.append(", createTmpTablePriv=").append(createTmpTablePriv);
        sb.append(", lockTablesPriv=").append(lockTablesPriv);
        sb.append(", createViewPriv=").append(createViewPriv);
        sb.append(", showViewPriv=").append(showViewPriv);
        sb.append(", createRoutinePriv=").append(createRoutinePriv);
        sb.append(", alterRoutinePriv=").append(alterRoutinePriv);
        sb.append(", executePriv=").append(executePriv);
        sb.append(", eventPriv=").append(eventPriv);
        sb.append(", triggerPriv=").append(triggerPriv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source Table: db")
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
        Db other = (Db) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getSelectPriv() == null ? other.getSelectPriv() == null : this.getSelectPriv().equals(other.getSelectPriv()))
            && (this.getInsertPriv() == null ? other.getInsertPriv() == null : this.getInsertPriv().equals(other.getInsertPriv()))
            && (this.getUpdatePriv() == null ? other.getUpdatePriv() == null : this.getUpdatePriv().equals(other.getUpdatePriv()))
            && (this.getDeletePriv() == null ? other.getDeletePriv() == null : this.getDeletePriv().equals(other.getDeletePriv()))
            && (this.getCreatePriv() == null ? other.getCreatePriv() == null : this.getCreatePriv().equals(other.getCreatePriv()))
            && (this.getDropPriv() == null ? other.getDropPriv() == null : this.getDropPriv().equals(other.getDropPriv()))
            && (this.getGrantPriv() == null ? other.getGrantPriv() == null : this.getGrantPriv().equals(other.getGrantPriv()))
            && (this.getReferencesPriv() == null ? other.getReferencesPriv() == null : this.getReferencesPriv().equals(other.getReferencesPriv()))
            && (this.getIndexPriv() == null ? other.getIndexPriv() == null : this.getIndexPriv().equals(other.getIndexPriv()))
            && (this.getAlterPriv() == null ? other.getAlterPriv() == null : this.getAlterPriv().equals(other.getAlterPriv()))
            && (this.getCreateTmpTablePriv() == null ? other.getCreateTmpTablePriv() == null : this.getCreateTmpTablePriv().equals(other.getCreateTmpTablePriv()))
            && (this.getLockTablesPriv() == null ? other.getLockTablesPriv() == null : this.getLockTablesPriv().equals(other.getLockTablesPriv()))
            && (this.getCreateViewPriv() == null ? other.getCreateViewPriv() == null : this.getCreateViewPriv().equals(other.getCreateViewPriv()))
            && (this.getShowViewPriv() == null ? other.getShowViewPriv() == null : this.getShowViewPriv().equals(other.getShowViewPriv()))
            && (this.getCreateRoutinePriv() == null ? other.getCreateRoutinePriv() == null : this.getCreateRoutinePriv().equals(other.getCreateRoutinePriv()))
            && (this.getAlterRoutinePriv() == null ? other.getAlterRoutinePriv() == null : this.getAlterRoutinePriv().equals(other.getAlterRoutinePriv()))
            && (this.getExecutePriv() == null ? other.getExecutePriv() == null : this.getExecutePriv().equals(other.getExecutePriv()))
            && (this.getEventPriv() == null ? other.getEventPriv() == null : this.getEventPriv().equals(other.getEventPriv()))
            && (this.getTriggerPriv() == null ? other.getTriggerPriv() == null : this.getTriggerPriv().equals(other.getTriggerPriv()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source Table: db")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getSelectPriv() == null) ? 0 : getSelectPriv().hashCode());
        result = prime * result + ((getInsertPriv() == null) ? 0 : getInsertPriv().hashCode());
        result = prime * result + ((getUpdatePriv() == null) ? 0 : getUpdatePriv().hashCode());
        result = prime * result + ((getDeletePriv() == null) ? 0 : getDeletePriv().hashCode());
        result = prime * result + ((getCreatePriv() == null) ? 0 : getCreatePriv().hashCode());
        result = prime * result + ((getDropPriv() == null) ? 0 : getDropPriv().hashCode());
        result = prime * result + ((getGrantPriv() == null) ? 0 : getGrantPriv().hashCode());
        result = prime * result + ((getReferencesPriv() == null) ? 0 : getReferencesPriv().hashCode());
        result = prime * result + ((getIndexPriv() == null) ? 0 : getIndexPriv().hashCode());
        result = prime * result + ((getAlterPriv() == null) ? 0 : getAlterPriv().hashCode());
        result = prime * result + ((getCreateTmpTablePriv() == null) ? 0 : getCreateTmpTablePriv().hashCode());
        result = prime * result + ((getLockTablesPriv() == null) ? 0 : getLockTablesPriv().hashCode());
        result = prime * result + ((getCreateViewPriv() == null) ? 0 : getCreateViewPriv().hashCode());
        result = prime * result + ((getShowViewPriv() == null) ? 0 : getShowViewPriv().hashCode());
        result = prime * result + ((getCreateRoutinePriv() == null) ? 0 : getCreateRoutinePriv().hashCode());
        result = prime * result + ((getAlterRoutinePriv() == null) ? 0 : getAlterRoutinePriv().hashCode());
        result = prime * result + ((getExecutePriv() == null) ? 0 : getExecutePriv().hashCode());
        result = prime * result + ((getEventPriv() == null) ? 0 : getEventPriv().hashCode());
        result = prime * result + ((getTriggerPriv() == null) ? 0 : getTriggerPriv().hashCode());
        return result;
    }
}