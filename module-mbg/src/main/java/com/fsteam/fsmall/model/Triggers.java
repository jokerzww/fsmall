package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Triggers implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    private String triggerCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    private String triggerSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    private String triggerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    private String eventManipulation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    private String eventObjectCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    private String eventObjectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    private String eventObjectTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    private Integer actionOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    private String actionOrientation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    private String actionTiming;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    private String actionReferenceOldRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    private String actionReferenceNewRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.CREATED")
    private Date created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.SQL_MODE")
    private String sqlMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.DEFINER")
    private String definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    private String collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    private String databaseCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    private byte[] actionCondition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    private String actionStatement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    private byte[] actionReferenceOldTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    private byte[] actionReferenceNewTable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source Table: TRIGGERS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    public String getTriggerCatalog() {
        return triggerCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_CATALOG")
    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    public String getTriggerSchema() {
        return triggerSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_SCHEMA")
    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    public String getTriggerName() {
        return triggerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.TRIGGER_NAME")
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    public String getEventManipulation() {
        return eventManipulation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_MANIPULATION")
    public void setEventManipulation(String eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    public String getEventObjectCatalog() {
        return eventObjectCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_CATALOG")
    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    public String getEventObjectSchema() {
        return eventObjectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_SCHEMA")
    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    public String getEventObjectTable() {
        return eventObjectTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.EVENT_OBJECT_TABLE")
    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    public Integer getActionOrder() {
        return actionOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_ORDER")
    public void setActionOrder(Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    public String getActionOrientation() {
        return actionOrientation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_ORIENTATION")
    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    public String getActionTiming() {
        return actionTiming;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_TIMING")
    public void setActionTiming(String actionTiming) {
        this.actionTiming = actionTiming;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    public String getActionReferenceOldRow() {
        return actionReferenceOldRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_ROW")
    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    public String getActionReferenceNewRow() {
        return actionReferenceNewRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_ROW")
    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.CREATED")
    public Date getCreated() {
        return created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.CREATED")
    public void setCreated(Date created) {
        this.created = created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.SQL_MODE")
    public String getSqlMode() {
        return sqlMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.SQL_MODE")
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.DEFINER")
    public String getDefiner() {
        return definer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.DEFINER")
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.CHARACTER_SET_CLIENT")
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    public String getCollationConnection() {
        return collationConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.COLLATION_CONNECTION")
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.DATABASE_COLLATION")
    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    public byte[] getActionCondition() {
        return actionCondition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_CONDITION")
    public void setActionCondition(byte[] actionCondition) {
        this.actionCondition = actionCondition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    public String getActionStatement() {
        return actionStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_STATEMENT")
    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    public byte[] getActionReferenceOldTable() {
        return actionReferenceOldTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_OLD_TABLE")
    public void setActionReferenceOldTable(byte[] actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    public byte[] getActionReferenceNewTable() {
        return actionReferenceNewTable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source field: TRIGGERS.ACTION_REFERENCE_NEW_TABLE")
    public void setActionReferenceNewTable(byte[] actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.465139+08:00", comments="Source Table: TRIGGERS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", triggerCatalog=").append(triggerCatalog);
        sb.append(", triggerSchema=").append(triggerSchema);
        sb.append(", triggerName=").append(triggerName);
        sb.append(", eventManipulation=").append(eventManipulation);
        sb.append(", eventObjectCatalog=").append(eventObjectCatalog);
        sb.append(", eventObjectSchema=").append(eventObjectSchema);
        sb.append(", eventObjectTable=").append(eventObjectTable);
        sb.append(", actionOrder=").append(actionOrder);
        sb.append(", actionOrientation=").append(actionOrientation);
        sb.append(", actionTiming=").append(actionTiming);
        sb.append(", actionReferenceOldRow=").append(actionReferenceOldRow);
        sb.append(", actionReferenceNewRow=").append(actionReferenceNewRow);
        sb.append(", created=").append(created);
        sb.append(", sqlMode=").append(sqlMode);
        sb.append(", definer=").append(definer);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", databaseCollation=").append(databaseCollation);
        sb.append(", actionCondition=").append(actionCondition);
        sb.append(", actionStatement=").append(actionStatement);
        sb.append(", actionReferenceOldTable=").append(actionReferenceOldTable);
        sb.append(", actionReferenceNewTable=").append(actionReferenceNewTable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4661396+08:00", comments="Source Table: TRIGGERS")
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
        Triggers other = (Triggers) that;
        return (this.getTriggerCatalog() == null ? other.getTriggerCatalog() == null : this.getTriggerCatalog().equals(other.getTriggerCatalog()))
            && (this.getTriggerSchema() == null ? other.getTriggerSchema() == null : this.getTriggerSchema().equals(other.getTriggerSchema()))
            && (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getEventManipulation() == null ? other.getEventManipulation() == null : this.getEventManipulation().equals(other.getEventManipulation()))
            && (this.getEventObjectCatalog() == null ? other.getEventObjectCatalog() == null : this.getEventObjectCatalog().equals(other.getEventObjectCatalog()))
            && (this.getEventObjectSchema() == null ? other.getEventObjectSchema() == null : this.getEventObjectSchema().equals(other.getEventObjectSchema()))
            && (this.getEventObjectTable() == null ? other.getEventObjectTable() == null : this.getEventObjectTable().equals(other.getEventObjectTable()))
            && (this.getActionOrder() == null ? other.getActionOrder() == null : this.getActionOrder().equals(other.getActionOrder()))
            && (this.getActionOrientation() == null ? other.getActionOrientation() == null : this.getActionOrientation().equals(other.getActionOrientation()))
            && (this.getActionTiming() == null ? other.getActionTiming() == null : this.getActionTiming().equals(other.getActionTiming()))
            && (this.getActionReferenceOldRow() == null ? other.getActionReferenceOldRow() == null : this.getActionReferenceOldRow().equals(other.getActionReferenceOldRow()))
            && (this.getActionReferenceNewRow() == null ? other.getActionReferenceNewRow() == null : this.getActionReferenceNewRow().equals(other.getActionReferenceNewRow()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getSqlMode() == null ? other.getSqlMode() == null : this.getSqlMode().equals(other.getSqlMode()))
            && (this.getDefiner() == null ? other.getDefiner() == null : this.getDefiner().equals(other.getDefiner()))
            && (this.getCharacterSetClient() == null ? other.getCharacterSetClient() == null : this.getCharacterSetClient().equals(other.getCharacterSetClient()))
            && (this.getCollationConnection() == null ? other.getCollationConnection() == null : this.getCollationConnection().equals(other.getCollationConnection()))
            && (this.getDatabaseCollation() == null ? other.getDatabaseCollation() == null : this.getDatabaseCollation().equals(other.getDatabaseCollation()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4661396+08:00", comments="Source Table: TRIGGERS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTriggerCatalog() == null) ? 0 : getTriggerCatalog().hashCode());
        result = prime * result + ((getTriggerSchema() == null) ? 0 : getTriggerSchema().hashCode());
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getEventManipulation() == null) ? 0 : getEventManipulation().hashCode());
        result = prime * result + ((getEventObjectCatalog() == null) ? 0 : getEventObjectCatalog().hashCode());
        result = prime * result + ((getEventObjectSchema() == null) ? 0 : getEventObjectSchema().hashCode());
        result = prime * result + ((getEventObjectTable() == null) ? 0 : getEventObjectTable().hashCode());
        result = prime * result + ((getActionOrder() == null) ? 0 : getActionOrder().hashCode());
        result = prime * result + ((getActionOrientation() == null) ? 0 : getActionOrientation().hashCode());
        result = prime * result + ((getActionTiming() == null) ? 0 : getActionTiming().hashCode());
        result = prime * result + ((getActionReferenceOldRow() == null) ? 0 : getActionReferenceOldRow().hashCode());
        result = prime * result + ((getActionReferenceNewRow() == null) ? 0 : getActionReferenceNewRow().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getSqlMode() == null) ? 0 : getSqlMode().hashCode());
        result = prime * result + ((getDefiner() == null) ? 0 : getDefiner().hashCode());
        result = prime * result + ((getCharacterSetClient() == null) ? 0 : getCharacterSetClient().hashCode());
        result = prime * result + ((getCollationConnection() == null) ? 0 : getCollationConnection().hashCode());
        result = prime * result + ((getDatabaseCollation() == null) ? 0 : getDatabaseCollation().hashCode());
        return result;
    }
}