package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Profiling implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.QUERY_ID")
    private Integer queryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SEQ")
    private Integer seq;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.DURATION")
    private Short duration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CPU_USER")
    private Short cpuUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CPU_SYSTEM")
    private Short cpuSystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    private Integer contextVoluntary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    private Integer contextInvoluntary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    private Integer blockOpsIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    private Integer blockOpsOut;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.MESSAGES_SENT")
    private Integer messagesSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    private Integer messagesReceived;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    private Integer pageFaultsMajor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    private Integer pageFaultsMinor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SWAPS")
    private Integer swaps;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    private String sourceFunction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_FILE")
    private String sourceFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_LINE")
    private Integer sourceLine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: PROFILING")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.QUERY_ID")
    public Integer getQueryId() {
        return queryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.QUERY_ID")
    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SEQ")
    public Integer getSeq() {
        return seq;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SEQ")
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.DURATION")
    public Short getDuration() {
        return duration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.DURATION")
    public void setDuration(Short duration) {
        this.duration = duration;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CPU_USER")
    public Short getCpuUser() {
        return cpuUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CPU_USER")
    public void setCpuUser(Short cpuUser) {
        this.cpuUser = cpuUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CPU_SYSTEM")
    public Short getCpuSystem() {
        return cpuSystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CPU_SYSTEM")
    public void setCpuSystem(Short cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    public Integer getContextVoluntary() {
        return contextVoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CONTEXT_VOLUNTARY")
    public void setContextVoluntary(Integer contextVoluntary) {
        this.contextVoluntary = contextVoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    public Integer getContextInvoluntary() {
        return contextInvoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.CONTEXT_INVOLUNTARY")
    public void setContextInvoluntary(Integer contextInvoluntary) {
        this.contextInvoluntary = contextInvoluntary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    public Integer getBlockOpsIn() {
        return blockOpsIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.BLOCK_OPS_IN")
    public void setBlockOpsIn(Integer blockOpsIn) {
        this.blockOpsIn = blockOpsIn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    public Integer getBlockOpsOut() {
        return blockOpsOut;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.BLOCK_OPS_OUT")
    public void setBlockOpsOut(Integer blockOpsOut) {
        this.blockOpsOut = blockOpsOut;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.MESSAGES_SENT")
    public Integer getMessagesSent() {
        return messagesSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.MESSAGES_SENT")
    public void setMessagesSent(Integer messagesSent) {
        this.messagesSent = messagesSent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    public Integer getMessagesReceived() {
        return messagesReceived;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.MESSAGES_RECEIVED")
    public void setMessagesReceived(Integer messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    public Integer getPageFaultsMajor() {
        return pageFaultsMajor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.PAGE_FAULTS_MAJOR")
    public void setPageFaultsMajor(Integer pageFaultsMajor) {
        this.pageFaultsMajor = pageFaultsMajor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    public Integer getPageFaultsMinor() {
        return pageFaultsMinor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.PAGE_FAULTS_MINOR")
    public void setPageFaultsMinor(Integer pageFaultsMinor) {
        this.pageFaultsMinor = pageFaultsMinor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SWAPS")
    public Integer getSwaps() {
        return swaps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SWAPS")
    public void setSwaps(Integer swaps) {
        this.swaps = swaps;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    public String getSourceFunction() {
        return sourceFunction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_FUNCTION")
    public void setSourceFunction(String sourceFunction) {
        this.sourceFunction = sourceFunction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_FILE")
    public String getSourceFile() {
        return sourceFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_FILE")
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_LINE")
    public Integer getSourceLine() {
        return sourceLine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source field: PROFILING.SOURCE_LINE")
    public void setSourceLine(Integer sourceLine) {
        this.sourceLine = sourceLine;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: PROFILING")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", queryId=").append(queryId);
        sb.append(", seq=").append(seq);
        sb.append(", state=").append(state);
        sb.append(", duration=").append(duration);
        sb.append(", cpuUser=").append(cpuUser);
        sb.append(", cpuSystem=").append(cpuSystem);
        sb.append(", contextVoluntary=").append(contextVoluntary);
        sb.append(", contextInvoluntary=").append(contextInvoluntary);
        sb.append(", blockOpsIn=").append(blockOpsIn);
        sb.append(", blockOpsOut=").append(blockOpsOut);
        sb.append(", messagesSent=").append(messagesSent);
        sb.append(", messagesReceived=").append(messagesReceived);
        sb.append(", pageFaultsMajor=").append(pageFaultsMajor);
        sb.append(", pageFaultsMinor=").append(pageFaultsMinor);
        sb.append(", swaps=").append(swaps);
        sb.append(", sourceFunction=").append(sourceFunction);
        sb.append(", sourceFile=").append(sourceFile);
        sb.append(", sourceLine=").append(sourceLine);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: PROFILING")
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
        Profiling other = (Profiling) that;
        return (this.getQueryId() == null ? other.getQueryId() == null : this.getQueryId().equals(other.getQueryId()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getCpuUser() == null ? other.getCpuUser() == null : this.getCpuUser().equals(other.getCpuUser()))
            && (this.getCpuSystem() == null ? other.getCpuSystem() == null : this.getCpuSystem().equals(other.getCpuSystem()))
            && (this.getContextVoluntary() == null ? other.getContextVoluntary() == null : this.getContextVoluntary().equals(other.getContextVoluntary()))
            && (this.getContextInvoluntary() == null ? other.getContextInvoluntary() == null : this.getContextInvoluntary().equals(other.getContextInvoluntary()))
            && (this.getBlockOpsIn() == null ? other.getBlockOpsIn() == null : this.getBlockOpsIn().equals(other.getBlockOpsIn()))
            && (this.getBlockOpsOut() == null ? other.getBlockOpsOut() == null : this.getBlockOpsOut().equals(other.getBlockOpsOut()))
            && (this.getMessagesSent() == null ? other.getMessagesSent() == null : this.getMessagesSent().equals(other.getMessagesSent()))
            && (this.getMessagesReceived() == null ? other.getMessagesReceived() == null : this.getMessagesReceived().equals(other.getMessagesReceived()))
            && (this.getPageFaultsMajor() == null ? other.getPageFaultsMajor() == null : this.getPageFaultsMajor().equals(other.getPageFaultsMajor()))
            && (this.getPageFaultsMinor() == null ? other.getPageFaultsMinor() == null : this.getPageFaultsMinor().equals(other.getPageFaultsMinor()))
            && (this.getSwaps() == null ? other.getSwaps() == null : this.getSwaps().equals(other.getSwaps()))
            && (this.getSourceFunction() == null ? other.getSourceFunction() == null : this.getSourceFunction().equals(other.getSourceFunction()))
            && (this.getSourceFile() == null ? other.getSourceFile() == null : this.getSourceFile().equals(other.getSourceFile()))
            && (this.getSourceLine() == null ? other.getSourceLine() == null : this.getSourceLine().equals(other.getSourceLine()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1708703+08:00", comments="Source Table: PROFILING")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getCpuUser() == null) ? 0 : getCpuUser().hashCode());
        result = prime * result + ((getCpuSystem() == null) ? 0 : getCpuSystem().hashCode());
        result = prime * result + ((getContextVoluntary() == null) ? 0 : getContextVoluntary().hashCode());
        result = prime * result + ((getContextInvoluntary() == null) ? 0 : getContextInvoluntary().hashCode());
        result = prime * result + ((getBlockOpsIn() == null) ? 0 : getBlockOpsIn().hashCode());
        result = prime * result + ((getBlockOpsOut() == null) ? 0 : getBlockOpsOut().hashCode());
        result = prime * result + ((getMessagesSent() == null) ? 0 : getMessagesSent().hashCode());
        result = prime * result + ((getMessagesReceived() == null) ? 0 : getMessagesReceived().hashCode());
        result = prime * result + ((getPageFaultsMajor() == null) ? 0 : getPageFaultsMajor().hashCode());
        result = prime * result + ((getPageFaultsMinor() == null) ? 0 : getPageFaultsMinor().hashCode());
        result = prime * result + ((getSwaps() == null) ? 0 : getSwaps().hashCode());
        result = prime * result + ((getSourceFunction() == null) ? 0 : getSourceFunction().hashCode());
        result = prime * result + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        result = prime * result + ((getSourceLine() == null) ? 0 : getSourceLine().hashCode());
        return result;
    }
}