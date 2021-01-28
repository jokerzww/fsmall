package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Events implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_CATALOG")
    private String eventCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_SCHEMA")
    private String eventSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_NAME")
    private String eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.DEFINER")
    private String definer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.TIME_ZONE")
    private String timeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_BODY")
    private String eventBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_TYPE")
    private String eventType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EXECUTE_AT")
    private Date executeAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.INTERVAL_VALUE")
    private String intervalValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.INTERVAL_FIELD")
    private String intervalField;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.SQL_MODE")
    private String sqlMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.STARTS")
    private Date starts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.ENDS")
    private Date ends;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.STATUS")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.ON_COMPLETION")
    private String onCompletion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.CREATED")
    private Date created;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.LAST_ALTERED")
    private Date lastAltered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.LAST_EXECUTED")
    private Date lastExecuted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_COMMENT")
    private String eventComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.ORIGINATOR")
    private Integer originator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.COLLATION_CONNECTION")
    private String collationConnection;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.DATABASE_COLLATION")
    private String databaseCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.EVENT_DEFINITION")
    private String eventDefinition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source Table: EVENTS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_CATALOG")
    public String getEventCatalog() {
        return eventCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_CATALOG")
    public void setEventCatalog(String eventCatalog) {
        this.eventCatalog = eventCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_SCHEMA")
    public String getEventSchema() {
        return eventSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_SCHEMA")
    public void setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_NAME")
    public String getEventName() {
        return eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_NAME")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.DEFINER")
    public String getDefiner() {
        return definer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.DEFINER")
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.TIME_ZONE")
    public String getTimeZone() {
        return timeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.TIME_ZONE")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_BODY")
    public String getEventBody() {
        return eventBody;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_BODY")
    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_TYPE")
    public String getEventType() {
        return eventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_TYPE")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EXECUTE_AT")
    public Date getExecuteAt() {
        return executeAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EXECUTE_AT")
    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.INTERVAL_VALUE")
    public String getIntervalValue() {
        return intervalValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.INTERVAL_VALUE")
    public void setIntervalValue(String intervalValue) {
        this.intervalValue = intervalValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.INTERVAL_FIELD")
    public String getIntervalField() {
        return intervalField;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.INTERVAL_FIELD")
    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.SQL_MODE")
    public String getSqlMode() {
        return sqlMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.SQL_MODE")
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.STARTS")
    public Date getStarts() {
        return starts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.STARTS")
    public void setStarts(Date starts) {
        this.starts = starts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.ENDS")
    public Date getEnds() {
        return ends;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.ENDS")
    public void setEnds(Date ends) {
        this.ends = ends;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.STATUS")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.STATUS")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.ON_COMPLETION")
    public String getOnCompletion() {
        return onCompletion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.ON_COMPLETION")
    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.CREATED")
    public Date getCreated() {
        return created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.CREATED")
    public void setCreated(Date created) {
        this.created = created;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.LAST_ALTERED")
    public Date getLastAltered() {
        return lastAltered;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.LAST_ALTERED")
    public void setLastAltered(Date lastAltered) {
        this.lastAltered = lastAltered;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.LAST_EXECUTED")
    public Date getLastExecuted() {
        return lastExecuted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.LAST_EXECUTED")
    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: EVENTS.EVENT_COMMENT")
    public String getEventComment() {
        return eventComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.EVENT_COMMENT")
    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.ORIGINATOR")
    public Integer getOriginator() {
        return originator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.ORIGINATOR")
    public void setOriginator(Integer originator) {
        this.originator = originator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.CHARACTER_SET_CLIENT")
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.CHARACTER_SET_CLIENT")
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.COLLATION_CONNECTION")
    public String getCollationConnection() {
        return collationConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.COLLATION_CONNECTION")
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.DATABASE_COLLATION")
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.DATABASE_COLLATION")
    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.EVENT_DEFINITION")
    public String getEventDefinition() {
        return eventDefinition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source field: EVENTS.EVENT_DEFINITION")
    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source Table: EVENTS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventCatalog=").append(eventCatalog);
        sb.append(", eventSchema=").append(eventSchema);
        sb.append(", eventName=").append(eventName);
        sb.append(", definer=").append(definer);
        sb.append(", timeZone=").append(timeZone);
        sb.append(", eventBody=").append(eventBody);
        sb.append(", eventType=").append(eventType);
        sb.append(", executeAt=").append(executeAt);
        sb.append(", intervalValue=").append(intervalValue);
        sb.append(", intervalField=").append(intervalField);
        sb.append(", sqlMode=").append(sqlMode);
        sb.append(", starts=").append(starts);
        sb.append(", ends=").append(ends);
        sb.append(", status=").append(status);
        sb.append(", onCompletion=").append(onCompletion);
        sb.append(", created=").append(created);
        sb.append(", lastAltered=").append(lastAltered);
        sb.append(", lastExecuted=").append(lastExecuted);
        sb.append(", eventComment=").append(eventComment);
        sb.append(", originator=").append(originator);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", databaseCollation=").append(databaseCollation);
        sb.append(", eventDefinition=").append(eventDefinition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source Table: EVENTS")
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
        Events other = (Events) that;
        return (this.getEventCatalog() == null ? other.getEventCatalog() == null : this.getEventCatalog().equals(other.getEventCatalog()))
            && (this.getEventSchema() == null ? other.getEventSchema() == null : this.getEventSchema().equals(other.getEventSchema()))
            && (this.getEventName() == null ? other.getEventName() == null : this.getEventName().equals(other.getEventName()))
            && (this.getDefiner() == null ? other.getDefiner() == null : this.getDefiner().equals(other.getDefiner()))
            && (this.getTimeZone() == null ? other.getTimeZone() == null : this.getTimeZone().equals(other.getTimeZone()))
            && (this.getEventBody() == null ? other.getEventBody() == null : this.getEventBody().equals(other.getEventBody()))
            && (this.getEventType() == null ? other.getEventType() == null : this.getEventType().equals(other.getEventType()))
            && (this.getExecuteAt() == null ? other.getExecuteAt() == null : this.getExecuteAt().equals(other.getExecuteAt()))
            && (this.getIntervalValue() == null ? other.getIntervalValue() == null : this.getIntervalValue().equals(other.getIntervalValue()))
            && (this.getIntervalField() == null ? other.getIntervalField() == null : this.getIntervalField().equals(other.getIntervalField()))
            && (this.getSqlMode() == null ? other.getSqlMode() == null : this.getSqlMode().equals(other.getSqlMode()))
            && (this.getStarts() == null ? other.getStarts() == null : this.getStarts().equals(other.getStarts()))
            && (this.getEnds() == null ? other.getEnds() == null : this.getEnds().equals(other.getEnds()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOnCompletion() == null ? other.getOnCompletion() == null : this.getOnCompletion().equals(other.getOnCompletion()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getLastAltered() == null ? other.getLastAltered() == null : this.getLastAltered().equals(other.getLastAltered()))
            && (this.getLastExecuted() == null ? other.getLastExecuted() == null : this.getLastExecuted().equals(other.getLastExecuted()))
            && (this.getEventComment() == null ? other.getEventComment() == null : this.getEventComment().equals(other.getEventComment()))
            && (this.getOriginator() == null ? other.getOriginator() == null : this.getOriginator().equals(other.getOriginator()))
            && (this.getCharacterSetClient() == null ? other.getCharacterSetClient() == null : this.getCharacterSetClient().equals(other.getCharacterSetClient()))
            && (this.getCollationConnection() == null ? other.getCollationConnection() == null : this.getCollationConnection().equals(other.getCollationConnection()))
            && (this.getDatabaseCollation() == null ? other.getDatabaseCollation() == null : this.getDatabaseCollation().equals(other.getDatabaseCollation()))
            && (this.getEventDefinition() == null ? other.getEventDefinition() == null : this.getEventDefinition().equals(other.getEventDefinition()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5131824+08:00", comments="Source Table: EVENTS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventCatalog() == null) ? 0 : getEventCatalog().hashCode());
        result = prime * result + ((getEventSchema() == null) ? 0 : getEventSchema().hashCode());
        result = prime * result + ((getEventName() == null) ? 0 : getEventName().hashCode());
        result = prime * result + ((getDefiner() == null) ? 0 : getDefiner().hashCode());
        result = prime * result + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        result = prime * result + ((getEventBody() == null) ? 0 : getEventBody().hashCode());
        result = prime * result + ((getEventType() == null) ? 0 : getEventType().hashCode());
        result = prime * result + ((getExecuteAt() == null) ? 0 : getExecuteAt().hashCode());
        result = prime * result + ((getIntervalValue() == null) ? 0 : getIntervalValue().hashCode());
        result = prime * result + ((getIntervalField() == null) ? 0 : getIntervalField().hashCode());
        result = prime * result + ((getSqlMode() == null) ? 0 : getSqlMode().hashCode());
        result = prime * result + ((getStarts() == null) ? 0 : getStarts().hashCode());
        result = prime * result + ((getEnds() == null) ? 0 : getEnds().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOnCompletion() == null) ? 0 : getOnCompletion().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getLastAltered() == null) ? 0 : getLastAltered().hashCode());
        result = prime * result + ((getLastExecuted() == null) ? 0 : getLastExecuted().hashCode());
        result = prime * result + ((getEventComment() == null) ? 0 : getEventComment().hashCode());
        result = prime * result + ((getOriginator() == null) ? 0 : getOriginator().hashCode());
        result = prime * result + ((getCharacterSetClient() == null) ? 0 : getCharacterSetClient().hashCode());
        result = prime * result + ((getCollationConnection() == null) ? 0 : getCollationConnection().hashCode());
        result = prime * result + ((getDatabaseCollation() == null) ? 0 : getDatabaseCollation().hashCode());
        result = prime * result + ((getEventDefinition() == null) ? 0 : getEventDefinition().hashCode());
        return result;
    }
}