package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class XSchemaTableStatisticsWithBuffer implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_schema")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_fetched")
    private Long rowsFetched;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.fetch_latency")
    private Long fetchLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_inserted")
    private Long rowsInserted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.insert_latency")
    private Long insertLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_updated")
    private Long rowsUpdated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.update_latency")
    private Long updateLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_deleted")
    private Long rowsDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.delete_latency")
    private Long deleteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_requests")
    private BigDecimal ioReadRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read")
    private BigDecimal ioRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_latency")
    private BigDecimal ioReadLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_requests")
    private BigDecimal ioWriteRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write")
    private BigDecimal ioWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_latency")
    private BigDecimal ioWriteLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_requests")
    private BigDecimal ioMiscRequests;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_latency")
    private BigDecimal ioMiscLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_allocated")
    private BigDecimal innodbBufferAllocated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_data")
    private BigDecimal innodbBufferData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_free")
    private BigDecimal innodbBufferFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages")
    private Long innodbBufferPages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed")
    private Long innodbBufferPagesHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_old")
    private Long innodbBufferPagesOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached")
    private BigDecimal innodbBufferRowsCached;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_schema")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_schema")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_fetched")
    public Long getRowsFetched() {
        return rowsFetched;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_fetched")
    public void setRowsFetched(Long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.fetch_latency")
    public Long getFetchLatency() {
        return fetchLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.fetch_latency")
    public void setFetchLatency(Long fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_inserted")
    public Long getRowsInserted() {
        return rowsInserted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_inserted")
    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.insert_latency")
    public Long getInsertLatency() {
        return insertLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.insert_latency")
    public void setInsertLatency(Long insertLatency) {
        this.insertLatency = insertLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_updated")
    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_updated")
    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.update_latency")
    public Long getUpdateLatency() {
        return updateLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.update_latency")
    public void setUpdateLatency(Long updateLatency) {
        this.updateLatency = updateLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_deleted")
    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.rows_deleted")
    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.delete_latency")
    public Long getDeleteLatency() {
        return deleteLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.434111+08:00", comments="Source field: x$schema_table_statistics_with_buffer.delete_latency")
    public void setDeleteLatency(Long deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_requests")
    public BigDecimal getIoReadRequests() {
        return ioReadRequests;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_requests")
    public void setIoReadRequests(BigDecimal ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read")
    public BigDecimal getIoRead() {
        return ioRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read")
    public void setIoRead(BigDecimal ioRead) {
        this.ioRead = ioRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_latency")
    public BigDecimal getIoReadLatency() {
        return ioReadLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_read_latency")
    public void setIoReadLatency(BigDecimal ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_requests")
    public BigDecimal getIoWriteRequests() {
        return ioWriteRequests;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_requests")
    public void setIoWriteRequests(BigDecimal ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write")
    public BigDecimal getIoWrite() {
        return ioWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write")
    public void setIoWrite(BigDecimal ioWrite) {
        this.ioWrite = ioWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_latency")
    public BigDecimal getIoWriteLatency() {
        return ioWriteLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_write_latency")
    public void setIoWriteLatency(BigDecimal ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_requests")
    public BigDecimal getIoMiscRequests() {
        return ioMiscRequests;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_requests")
    public void setIoMiscRequests(BigDecimal ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_latency")
    public BigDecimal getIoMiscLatency() {
        return ioMiscLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.io_misc_latency")
    public void setIoMiscLatency(BigDecimal ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_allocated")
    public BigDecimal getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_allocated")
    public void setInnodbBufferAllocated(BigDecimal innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_data")
    public BigDecimal getInnodbBufferData() {
        return innodbBufferData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_data")
    public void setInnodbBufferData(BigDecimal innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_free")
    public BigDecimal getInnodbBufferFree() {
        return innodbBufferFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_free")
    public void setInnodbBufferFree(BigDecimal innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages")
    public Long getInnodbBufferPages() {
        return innodbBufferPages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages")
    public void setInnodbBufferPages(Long innodbBufferPages) {
        this.innodbBufferPages = innodbBufferPages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed")
    public Long getInnodbBufferPagesHashed() {
        return innodbBufferPagesHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed")
    public void setInnodbBufferPagesHashed(Long innodbBufferPagesHashed) {
        this.innodbBufferPagesHashed = innodbBufferPagesHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_old")
    public Long getInnodbBufferPagesOld() {
        return innodbBufferPagesOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_pages_old")
    public void setInnodbBufferPagesOld(Long innodbBufferPagesOld) {
        this.innodbBufferPagesOld = innodbBufferPagesOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached")
    public BigDecimal getInnodbBufferRowsCached() {
        return innodbBufferRowsCached;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source field: x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached")
    public void setInnodbBufferRowsCached(BigDecimal innodbBufferRowsCached) {
        this.innodbBufferRowsCached = innodbBufferRowsCached;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", rowsFetched=").append(rowsFetched);
        sb.append(", fetchLatency=").append(fetchLatency);
        sb.append(", rowsInserted=").append(rowsInserted);
        sb.append(", insertLatency=").append(insertLatency);
        sb.append(", rowsUpdated=").append(rowsUpdated);
        sb.append(", updateLatency=").append(updateLatency);
        sb.append(", rowsDeleted=").append(rowsDeleted);
        sb.append(", deleteLatency=").append(deleteLatency);
        sb.append(", ioReadRequests=").append(ioReadRequests);
        sb.append(", ioRead=").append(ioRead);
        sb.append(", ioReadLatency=").append(ioReadLatency);
        sb.append(", ioWriteRequests=").append(ioWriteRequests);
        sb.append(", ioWrite=").append(ioWrite);
        sb.append(", ioWriteLatency=").append(ioWriteLatency);
        sb.append(", ioMiscRequests=").append(ioMiscRequests);
        sb.append(", ioMiscLatency=").append(ioMiscLatency);
        sb.append(", innodbBufferAllocated=").append(innodbBufferAllocated);
        sb.append(", innodbBufferData=").append(innodbBufferData);
        sb.append(", innodbBufferFree=").append(innodbBufferFree);
        sb.append(", innodbBufferPages=").append(innodbBufferPages);
        sb.append(", innodbBufferPagesHashed=").append(innodbBufferPagesHashed);
        sb.append(", innodbBufferPagesOld=").append(innodbBufferPagesOld);
        sb.append(", innodbBufferRowsCached=").append(innodbBufferRowsCached);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
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
        XSchemaTableStatisticsWithBuffer other = (XSchemaTableStatisticsWithBuffer) that;
        return (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getRowsFetched() == null ? other.getRowsFetched() == null : this.getRowsFetched().equals(other.getRowsFetched()))
            && (this.getFetchLatency() == null ? other.getFetchLatency() == null : this.getFetchLatency().equals(other.getFetchLatency()))
            && (this.getRowsInserted() == null ? other.getRowsInserted() == null : this.getRowsInserted().equals(other.getRowsInserted()))
            && (this.getInsertLatency() == null ? other.getInsertLatency() == null : this.getInsertLatency().equals(other.getInsertLatency()))
            && (this.getRowsUpdated() == null ? other.getRowsUpdated() == null : this.getRowsUpdated().equals(other.getRowsUpdated()))
            && (this.getUpdateLatency() == null ? other.getUpdateLatency() == null : this.getUpdateLatency().equals(other.getUpdateLatency()))
            && (this.getRowsDeleted() == null ? other.getRowsDeleted() == null : this.getRowsDeleted().equals(other.getRowsDeleted()))
            && (this.getDeleteLatency() == null ? other.getDeleteLatency() == null : this.getDeleteLatency().equals(other.getDeleteLatency()))
            && (this.getIoReadRequests() == null ? other.getIoReadRequests() == null : this.getIoReadRequests().equals(other.getIoReadRequests()))
            && (this.getIoRead() == null ? other.getIoRead() == null : this.getIoRead().equals(other.getIoRead()))
            && (this.getIoReadLatency() == null ? other.getIoReadLatency() == null : this.getIoReadLatency().equals(other.getIoReadLatency()))
            && (this.getIoWriteRequests() == null ? other.getIoWriteRequests() == null : this.getIoWriteRequests().equals(other.getIoWriteRequests()))
            && (this.getIoWrite() == null ? other.getIoWrite() == null : this.getIoWrite().equals(other.getIoWrite()))
            && (this.getIoWriteLatency() == null ? other.getIoWriteLatency() == null : this.getIoWriteLatency().equals(other.getIoWriteLatency()))
            && (this.getIoMiscRequests() == null ? other.getIoMiscRequests() == null : this.getIoMiscRequests().equals(other.getIoMiscRequests()))
            && (this.getIoMiscLatency() == null ? other.getIoMiscLatency() == null : this.getIoMiscLatency().equals(other.getIoMiscLatency()))
            && (this.getInnodbBufferAllocated() == null ? other.getInnodbBufferAllocated() == null : this.getInnodbBufferAllocated().equals(other.getInnodbBufferAllocated()))
            && (this.getInnodbBufferData() == null ? other.getInnodbBufferData() == null : this.getInnodbBufferData().equals(other.getInnodbBufferData()))
            && (this.getInnodbBufferFree() == null ? other.getInnodbBufferFree() == null : this.getInnodbBufferFree().equals(other.getInnodbBufferFree()))
            && (this.getInnodbBufferPages() == null ? other.getInnodbBufferPages() == null : this.getInnodbBufferPages().equals(other.getInnodbBufferPages()))
            && (this.getInnodbBufferPagesHashed() == null ? other.getInnodbBufferPagesHashed() == null : this.getInnodbBufferPagesHashed().equals(other.getInnodbBufferPagesHashed()))
            && (this.getInnodbBufferPagesOld() == null ? other.getInnodbBufferPagesOld() == null : this.getInnodbBufferPagesOld().equals(other.getInnodbBufferPagesOld()))
            && (this.getInnodbBufferRowsCached() == null ? other.getInnodbBufferRowsCached() == null : this.getInnodbBufferRowsCached().equals(other.getInnodbBufferRowsCached()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4351118+08:00", comments="Source Table: x$schema_table_statistics_with_buffer")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getRowsFetched() == null) ? 0 : getRowsFetched().hashCode());
        result = prime * result + ((getFetchLatency() == null) ? 0 : getFetchLatency().hashCode());
        result = prime * result + ((getRowsInserted() == null) ? 0 : getRowsInserted().hashCode());
        result = prime * result + ((getInsertLatency() == null) ? 0 : getInsertLatency().hashCode());
        result = prime * result + ((getRowsUpdated() == null) ? 0 : getRowsUpdated().hashCode());
        result = prime * result + ((getUpdateLatency() == null) ? 0 : getUpdateLatency().hashCode());
        result = prime * result + ((getRowsDeleted() == null) ? 0 : getRowsDeleted().hashCode());
        result = prime * result + ((getDeleteLatency() == null) ? 0 : getDeleteLatency().hashCode());
        result = prime * result + ((getIoReadRequests() == null) ? 0 : getIoReadRequests().hashCode());
        result = prime * result + ((getIoRead() == null) ? 0 : getIoRead().hashCode());
        result = prime * result + ((getIoReadLatency() == null) ? 0 : getIoReadLatency().hashCode());
        result = prime * result + ((getIoWriteRequests() == null) ? 0 : getIoWriteRequests().hashCode());
        result = prime * result + ((getIoWrite() == null) ? 0 : getIoWrite().hashCode());
        result = prime * result + ((getIoWriteLatency() == null) ? 0 : getIoWriteLatency().hashCode());
        result = prime * result + ((getIoMiscRequests() == null) ? 0 : getIoMiscRequests().hashCode());
        result = prime * result + ((getIoMiscLatency() == null) ? 0 : getIoMiscLatency().hashCode());
        result = prime * result + ((getInnodbBufferAllocated() == null) ? 0 : getInnodbBufferAllocated().hashCode());
        result = prime * result + ((getInnodbBufferData() == null) ? 0 : getInnodbBufferData().hashCode());
        result = prime * result + ((getInnodbBufferFree() == null) ? 0 : getInnodbBufferFree().hashCode());
        result = prime * result + ((getInnodbBufferPages() == null) ? 0 : getInnodbBufferPages().hashCode());
        result = prime * result + ((getInnodbBufferPagesHashed() == null) ? 0 : getInnodbBufferPagesHashed().hashCode());
        result = prime * result + ((getInnodbBufferPagesOld() == null) ? 0 : getInnodbBufferPagesOld().hashCode());
        result = prime * result + ((getInnodbBufferRowsCached() == null) ? 0 : getInnodbBufferRowsCached().hashCode());
        return result;
    }
}