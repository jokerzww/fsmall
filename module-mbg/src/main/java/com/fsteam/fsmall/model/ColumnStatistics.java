package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class ColumnStatistics implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    private String schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    private String histogram;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0938006+08:00", comments="Source Table: COLUMN_STATISTICS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    public String getSchemaName() {
        return schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.SCHEMA_NAME")
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.COLUMN_NAME")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    public String getHistogram() {
        return histogram;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0928+08:00", comments="Source field: COLUMN_STATISTICS.HISTOGRAM")
    public void setHistogram(String histogram) {
        this.histogram = histogram;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0938006+08:00", comments="Source Table: COLUMN_STATISTICS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaName=").append(schemaName);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", histogram=").append(histogram);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0938006+08:00", comments="Source Table: COLUMN_STATISTICS")
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
        ColumnStatistics other = (ColumnStatistics) that;
        return (this.getSchemaName() == null ? other.getSchemaName() == null : this.getSchemaName().equals(other.getSchemaName()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getHistogram() == null ? other.getHistogram() == null : this.getHistogram().equals(other.getHistogram()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0938006+08:00", comments="Source Table: COLUMN_STATISTICS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getHistogram() == null) ? 0 : getHistogram().hashCode());
        return result;
    }
}