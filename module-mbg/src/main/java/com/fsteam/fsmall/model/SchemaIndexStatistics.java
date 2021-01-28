package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SchemaIndexStatistics implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_schema")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.index_name")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_selected")
    private Long rowsSelected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.select_latency")
    private String selectLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_inserted")
    private Long rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.insert_latency")
    private String insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_updated")
    private Long rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.update_latency")
    private String updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_deleted")
    private Long rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.delete_latency")
    private String deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: schema_index_statistics")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_schema")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_schema")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.index_name")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_selected")
    public Long getRowsSelected() {
        return rowsSelected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_selected")
    public void setRowsSelected(Long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.select_latency")
    public String getSelectLatency() {
        return selectLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.select_latency")
    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_inserted")
    public Long getRowsInserted() {
        return rowsInserted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_inserted")
    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.insert_latency")
    public String getInsertLatency() {
        return insertLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.insert_latency")
    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_updated")
    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_updated")
    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.update_latency")
    public String getUpdateLatency() {
        return updateLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.update_latency")
    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_deleted")
    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.rows_deleted")
    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.delete_latency")
    public String getDeleteLatency() {
        return deleteLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source field: schema_index_statistics.delete_latency")
    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: schema_index_statistics")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", rowsSelected=").append(rowsSelected);
        sb.append(", selectLatency=").append(selectLatency);
        sb.append(", rowsInserted=").append(rowsInserted);
        sb.append(", insertLatency=").append(insertLatency);
        sb.append(", rowsUpdated=").append(rowsUpdated);
        sb.append(", updateLatency=").append(updateLatency);
        sb.append(", rowsDeleted=").append(rowsDeleted);
        sb.append(", deleteLatency=").append(deleteLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: schema_index_statistics")
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
        SchemaIndexStatistics other = (SchemaIndexStatistics) that;
        return (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getRowsSelected() == null ? other.getRowsSelected() == null : this.getRowsSelected().equals(other.getRowsSelected()))
            && (this.getSelectLatency() == null ? other.getSelectLatency() == null : this.getSelectLatency().equals(other.getSelectLatency()))
            && (this.getRowsInserted() == null ? other.getRowsInserted() == null : this.getRowsInserted().equals(other.getRowsInserted()))
            && (this.getInsertLatency() == null ? other.getInsertLatency() == null : this.getInsertLatency().equals(other.getInsertLatency()))
            && (this.getRowsUpdated() == null ? other.getRowsUpdated() == null : this.getRowsUpdated().equals(other.getRowsUpdated()))
            && (this.getUpdateLatency() == null ? other.getUpdateLatency() == null : this.getUpdateLatency().equals(other.getUpdateLatency()))
            && (this.getRowsDeleted() == null ? other.getRowsDeleted() == null : this.getRowsDeleted().equals(other.getRowsDeleted()))
            && (this.getDeleteLatency() == null ? other.getDeleteLatency() == null : this.getDeleteLatency().equals(other.getDeleteLatency()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: schema_index_statistics")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getRowsSelected() == null) ? 0 : getRowsSelected().hashCode());
        result = prime * result + ((getSelectLatency() == null) ? 0 : getSelectLatency().hashCode());
        result = prime * result + ((getRowsInserted() == null) ? 0 : getRowsInserted().hashCode());
        result = prime * result + ((getInsertLatency() == null) ? 0 : getInsertLatency().hashCode());
        result = prime * result + ((getRowsUpdated() == null) ? 0 : getRowsUpdated().hashCode());
        result = prime * result + ((getUpdateLatency() == null) ? 0 : getUpdateLatency().hashCode());
        result = prime * result + ((getRowsDeleted() == null) ? 0 : getRowsDeleted().hashCode());
        result = prime * result + ((getDeleteLatency() == null) ? 0 : getDeleteLatency().hashCode());
        return result;
    }
}