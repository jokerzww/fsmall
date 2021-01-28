package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XPsSchemaTableStatisticsIo implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_schema")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_read")
    private BigDecimal countRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_read")
    private BigDecimal sumNumberOfBytesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_read")
    private BigDecimal sumTimerRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_write")
    private BigDecimal countWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_write")
    private BigDecimal sumNumberOfBytesWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_write")
    private BigDecimal sumTimerWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_misc")
    private BigDecimal countMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_misc")
    private BigDecimal sumTimerMisc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_schema")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_schema")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_read")
    public BigDecimal getCountRead() {
        return countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_read")
    public void setCountRead(BigDecimal countRead) {
        this.countRead = countRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_read")
    public BigDecimal getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_read")
    public void setSumNumberOfBytesRead(BigDecimal sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_read")
    public BigDecimal getSumTimerRead() {
        return sumTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_read")
    public void setSumTimerRead(BigDecimal sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_write")
    public BigDecimal getCountWrite() {
        return countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_write")
    public void setCountWrite(BigDecimal countWrite) {
        this.countWrite = countWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_write")
    public BigDecimal getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_number_of_bytes_write")
    public void setSumNumberOfBytesWrite(BigDecimal sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_write")
    public BigDecimal getSumTimerWrite() {
        return sumTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_write")
    public void setSumTimerWrite(BigDecimal sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_misc")
    public BigDecimal getCountMisc() {
        return countMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.count_misc")
    public void setCountMisc(BigDecimal countMisc) {
        this.countMisc = countMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_misc")
    public BigDecimal getSumTimerMisc() {
        return sumTimerMisc;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source field: x$ps_schema_table_statistics_io.sum_timer_misc")
    public void setSumTimerMisc(BigDecimal sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", countRead=").append(countRead);
        sb.append(", sumNumberOfBytesRead=").append(sumNumberOfBytesRead);
        sb.append(", sumTimerRead=").append(sumTimerRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", sumNumberOfBytesWrite=").append(sumNumberOfBytesWrite);
        sb.append(", sumTimerWrite=").append(sumTimerWrite);
        sb.append(", countMisc=").append(countMisc);
        sb.append(", sumTimerMisc=").append(sumTimerMisc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
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
        XPsSchemaTableStatisticsIo other = (XPsSchemaTableStatisticsIo) that;
        return (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getCountRead() == null ? other.getCountRead() == null : this.getCountRead().equals(other.getCountRead()))
            && (this.getSumNumberOfBytesRead() == null ? other.getSumNumberOfBytesRead() == null : this.getSumNumberOfBytesRead().equals(other.getSumNumberOfBytesRead()))
            && (this.getSumTimerRead() == null ? other.getSumTimerRead() == null : this.getSumTimerRead().equals(other.getSumTimerRead()))
            && (this.getCountWrite() == null ? other.getCountWrite() == null : this.getCountWrite().equals(other.getCountWrite()))
            && (this.getSumNumberOfBytesWrite() == null ? other.getSumNumberOfBytesWrite() == null : this.getSumNumberOfBytesWrite().equals(other.getSumNumberOfBytesWrite()))
            && (this.getSumTimerWrite() == null ? other.getSumTimerWrite() == null : this.getSumTimerWrite().equals(other.getSumTimerWrite()))
            && (this.getCountMisc() == null ? other.getCountMisc() == null : this.getCountMisc().equals(other.getCountMisc()))
            && (this.getSumTimerMisc() == null ? other.getSumTimerMisc() == null : this.getSumTimerMisc().equals(other.getSumTimerMisc()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5552205+08:00", comments="Source Table: x$ps_schema_table_statistics_io")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getCountRead() == null) ? 0 : getCountRead().hashCode());
        result = prime * result + ((getSumNumberOfBytesRead() == null) ? 0 : getSumNumberOfBytesRead().hashCode());
        result = prime * result + ((getSumTimerRead() == null) ? 0 : getSumTimerRead().hashCode());
        result = prime * result + ((getCountWrite() == null) ? 0 : getCountWrite().hashCode());
        result = prime * result + ((getSumNumberOfBytesWrite() == null) ? 0 : getSumNumberOfBytesWrite().hashCode());
        result = prime * result + ((getSumTimerWrite() == null) ? 0 : getSumTimerWrite().hashCode());
        result = prime * result + ((getCountMisc() == null) ? 0 : getCountMisc().hashCode());
        result = prime * result + ((getSumTimerMisc() == null) ? 0 : getSumTimerMisc().hashCode());
        return result;
    }
}