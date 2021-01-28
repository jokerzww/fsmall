package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class UserSummary implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statements")
    private BigDecimal statements;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statement_latency")
    private String statementLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statement_avg_latency")
    private String statementAvgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.table_scans")
    private BigDecimal tableScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.file_ios")
    private BigDecimal fileIos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.file_io_latency")
    private String fileIoLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.current_connections")
    private BigDecimal currentConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.total_connections")
    private BigDecimal totalConnections;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.unique_hosts")
    private Long uniqueHosts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.current_memory")
    private String currentMemory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.total_memory_allocated")
    private String totalMemoryAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: user_summary")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.user")
    public void setUser(String user) {
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statements")
    public BigDecimal getStatements() {
        return statements;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statements")
    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statement_latency")
    public String getStatementLatency() {
        return statementLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statement_latency")
    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statement_avg_latency")
    public String getStatementAvgLatency() {
        return statementAvgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.statement_avg_latency")
    public void setStatementAvgLatency(String statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.table_scans")
    public BigDecimal getTableScans() {
        return tableScans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.table_scans")
    public void setTableScans(BigDecimal tableScans) {
        this.tableScans = tableScans;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.file_ios")
    public BigDecimal getFileIos() {
        return fileIos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.file_ios")
    public void setFileIos(BigDecimal fileIos) {
        this.fileIos = fileIos;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.file_io_latency")
    public String getFileIoLatency() {
        return fileIoLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.file_io_latency")
    public void setFileIoLatency(String fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.current_connections")
    public BigDecimal getCurrentConnections() {
        return currentConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.current_connections")
    public void setCurrentConnections(BigDecimal currentConnections) {
        this.currentConnections = currentConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.total_connections")
    public BigDecimal getTotalConnections() {
        return totalConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.total_connections")
    public void setTotalConnections(BigDecimal totalConnections) {
        this.totalConnections = totalConnections;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.unique_hosts")
    public Long getUniqueHosts() {
        return uniqueHosts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.unique_hosts")
    public void setUniqueHosts(Long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.current_memory")
    public String getCurrentMemory() {
        return currentMemory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.current_memory")
    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.total_memory_allocated")
    public String getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source field: user_summary.total_memory_allocated")
    public void setTotalMemoryAllocated(String totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: user_summary")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", statements=").append(statements);
        sb.append(", statementLatency=").append(statementLatency);
        sb.append(", statementAvgLatency=").append(statementAvgLatency);
        sb.append(", tableScans=").append(tableScans);
        sb.append(", fileIos=").append(fileIos);
        sb.append(", fileIoLatency=").append(fileIoLatency);
        sb.append(", currentConnections=").append(currentConnections);
        sb.append(", totalConnections=").append(totalConnections);
        sb.append(", uniqueHosts=").append(uniqueHosts);
        sb.append(", currentMemory=").append(currentMemory);
        sb.append(", totalMemoryAllocated=").append(totalMemoryAllocated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: user_summary")
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
        UserSummary other = (UserSummary) that;
        return (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getStatements() == null ? other.getStatements() == null : this.getStatements().equals(other.getStatements()))
            && (this.getStatementLatency() == null ? other.getStatementLatency() == null : this.getStatementLatency().equals(other.getStatementLatency()))
            && (this.getStatementAvgLatency() == null ? other.getStatementAvgLatency() == null : this.getStatementAvgLatency().equals(other.getStatementAvgLatency()))
            && (this.getTableScans() == null ? other.getTableScans() == null : this.getTableScans().equals(other.getTableScans()))
            && (this.getFileIos() == null ? other.getFileIos() == null : this.getFileIos().equals(other.getFileIos()))
            && (this.getFileIoLatency() == null ? other.getFileIoLatency() == null : this.getFileIoLatency().equals(other.getFileIoLatency()))
            && (this.getCurrentConnections() == null ? other.getCurrentConnections() == null : this.getCurrentConnections().equals(other.getCurrentConnections()))
            && (this.getTotalConnections() == null ? other.getTotalConnections() == null : this.getTotalConnections().equals(other.getTotalConnections()))
            && (this.getUniqueHosts() == null ? other.getUniqueHosts() == null : this.getUniqueHosts().equals(other.getUniqueHosts()))
            && (this.getCurrentMemory() == null ? other.getCurrentMemory() == null : this.getCurrentMemory().equals(other.getCurrentMemory()))
            && (this.getTotalMemoryAllocated() == null ? other.getTotalMemoryAllocated() == null : this.getTotalMemoryAllocated().equals(other.getTotalMemoryAllocated()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4551293+08:00", comments="Source Table: user_summary")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getStatements() == null) ? 0 : getStatements().hashCode());
        result = prime * result + ((getStatementLatency() == null) ? 0 : getStatementLatency().hashCode());
        result = prime * result + ((getStatementAvgLatency() == null) ? 0 : getStatementAvgLatency().hashCode());
        result = prime * result + ((getTableScans() == null) ? 0 : getTableScans().hashCode());
        result = prime * result + ((getFileIos() == null) ? 0 : getFileIos().hashCode());
        result = prime * result + ((getFileIoLatency() == null) ? 0 : getFileIoLatency().hashCode());
        result = prime * result + ((getCurrentConnections() == null) ? 0 : getCurrentConnections().hashCode());
        result = prime * result + ((getTotalConnections() == null) ? 0 : getTotalConnections().hashCode());
        result = prime * result + ((getUniqueHosts() == null) ? 0 : getUniqueHosts().hashCode());
        result = prime * result + ((getCurrentMemory() == null) ? 0 : getCurrentMemory().hashCode());
        result = prime * result + ((getTotalMemoryAllocated() == null) ? 0 : getTotalMemoryAllocated().hashCode());
        return result;
    }
}