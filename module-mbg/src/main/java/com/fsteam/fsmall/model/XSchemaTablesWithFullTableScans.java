package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class XSchemaTablesWithFullTableScans implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_schema")
    private String objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_name")
    private String objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.rows_full_scanned")
    private Long rowsFullScanned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.latency")
    private Long latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source Table: x$schema_tables_with_full_table_scans")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_schema")
    public String getObjectSchema() {
        return objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_schema")
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_name")
    public String getObjectName() {
        return objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.object_name")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.rows_full_scanned")
    public Long getRowsFullScanned() {
        return rowsFullScanned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.rows_full_scanned")
    public void setRowsFullScanned(Long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5111808+08:00", comments="Source field: x$schema_tables_with_full_table_scans.latency")
    public Long getLatency() {
        return latency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source field: x$schema_tables_with_full_table_scans.latency")
    public void setLatency(Long latency) {
        this.latency = latency;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source Table: x$schema_tables_with_full_table_scans")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", rowsFullScanned=").append(rowsFullScanned);
        sb.append(", latency=").append(latency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source Table: x$schema_tables_with_full_table_scans")
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
        XSchemaTablesWithFullTableScans other = (XSchemaTablesWithFullTableScans) that;
        return (this.getObjectSchema() == null ? other.getObjectSchema() == null : this.getObjectSchema().equals(other.getObjectSchema()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()))
            && (this.getRowsFullScanned() == null ? other.getRowsFullScanned() == null : this.getRowsFullScanned().equals(other.getRowsFullScanned()))
            && (this.getLatency() == null ? other.getLatency() == null : this.getLatency().equals(other.getLatency()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5121818+08:00", comments="Source Table: x$schema_tables_with_full_table_scans")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectSchema() == null) ? 0 : getObjectSchema().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        result = prime * result + ((getRowsFullScanned() == null) ? 0 : getRowsFullScanned().hashCode());
        result = prime * result + ((getLatency() == null) ? 0 : getLatency().hashCode());
        return result;
    }
}