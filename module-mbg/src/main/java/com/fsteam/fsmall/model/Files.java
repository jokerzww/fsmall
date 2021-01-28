package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Files implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_ID")
    private Long fileId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_TYPE")
    private String fileType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLESPACE_NAME")
    private String tablespaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LOGFILE_GROUP_NUMBER")
    private Long logfileGroupNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.ENGINE")
    private String engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FREE_EXTENTS")
    private Long freeExtents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TOTAL_EXTENTS")
    private Long totalExtents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.EXTENT_SIZE")
    private Long extentSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.INITIAL_SIZE")
    private Long initialSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.MAXIMUM_SIZE")
    private Long maximumSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.VERSION")
    private Long version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.ROW_FORMAT")
    private String rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.DATA_FREE")
    private Long dataFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.STATUS")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.EXTRA")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_NAME")
    private String fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_SCHEMA")
    private byte[] tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_NAME")
    private byte[] tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FULLTEXT_KEYS")
    private byte[] fulltextKeys;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.DELETED_ROWS")
    private byte[] deletedRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.UPDATE_COUNT")
    private byte[] updateCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.CREATION_TIME")
    private byte[] creationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LAST_UPDATE_TIME")
    private byte[] lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LAST_ACCESS_TIME")
    private byte[] lastAccessTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.RECOVER_TIME")
    private byte[] recoverTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TRANSACTION_COUNTER")
    private byte[] transactionCounter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_ROWS")
    private byte[] tableRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.AVG_ROW_LENGTH")
    private byte[] avgRowLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.DATA_LENGTH")
    private byte[] dataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.MAX_DATA_LENGTH")
    private byte[] maxDataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.INDEX_LENGTH")
    private byte[] indexLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CREATE_TIME")
    private byte[] createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.UPDATE_TIME")
    private byte[] updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CHECK_TIME")
    private byte[] checkTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CHECKSUM")
    private byte[] checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source Table: FILES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_ID")
    public Long getFileId() {
        return fileId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_ID")
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_TYPE")
    public String getFileType() {
        return fileType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_TYPE")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLESPACE_NAME")
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LOGFILE_GROUP_NAME")
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LOGFILE_GROUP_NAME")
    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LOGFILE_GROUP_NUMBER")
    public Long getLogfileGroupNumber() {
        return logfileGroupNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LOGFILE_GROUP_NUMBER")
    public void setLogfileGroupNumber(Long logfileGroupNumber) {
        this.logfileGroupNumber = logfileGroupNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.ENGINE")
    public String getEngine() {
        return engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.ENGINE")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FREE_EXTENTS")
    public Long getFreeExtents() {
        return freeExtents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FREE_EXTENTS")
    public void setFreeExtents(Long freeExtents) {
        this.freeExtents = freeExtents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TOTAL_EXTENTS")
    public Long getTotalExtents() {
        return totalExtents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TOTAL_EXTENTS")
    public void setTotalExtents(Long totalExtents) {
        this.totalExtents = totalExtents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.EXTENT_SIZE")
    public Long getExtentSize() {
        return extentSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.EXTENT_SIZE")
    public void setExtentSize(Long extentSize) {
        this.extentSize = extentSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.INITIAL_SIZE")
    public Long getInitialSize() {
        return initialSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.INITIAL_SIZE")
    public void setInitialSize(Long initialSize) {
        this.initialSize = initialSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.MAXIMUM_SIZE")
    public Long getMaximumSize() {
        return maximumSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.MAXIMUM_SIZE")
    public void setMaximumSize(Long maximumSize) {
        this.maximumSize = maximumSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.AUTOEXTEND_SIZE")
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.AUTOEXTEND_SIZE")
    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.VERSION")
    public Long getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.VERSION")
    public void setVersion(Long version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.ROW_FORMAT")
    public String getRowFormat() {
        return rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.ROW_FORMAT")
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.DATA_FREE")
    public Long getDataFree() {
        return dataFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.DATA_FREE")
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.STATUS")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.STATUS")
    public void setStatus(String status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.EXTRA")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.EXTRA")
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_NAME")
    public String getFileName() {
        return fileName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FILE_NAME")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_SCHEMA")
    public byte[] getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_SCHEMA")
    public void setTableSchema(byte[] tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_NAME")
    public byte[] getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_NAME")
    public void setTableName(byte[] tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FULLTEXT_KEYS")
    public byte[] getFulltextKeys() {
        return fulltextKeys;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.FULLTEXT_KEYS")
    public void setFulltextKeys(byte[] fulltextKeys) {
        this.fulltextKeys = fulltextKeys;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.DELETED_ROWS")
    public byte[] getDeletedRows() {
        return deletedRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.DELETED_ROWS")
    public void setDeletedRows(byte[] deletedRows) {
        this.deletedRows = deletedRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.UPDATE_COUNT")
    public byte[] getUpdateCount() {
        return updateCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.UPDATE_COUNT")
    public void setUpdateCount(byte[] updateCount) {
        this.updateCount = updateCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.CREATION_TIME")
    public byte[] getCreationTime() {
        return creationTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.CREATION_TIME")
    public void setCreationTime(byte[] creationTime) {
        this.creationTime = creationTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LAST_UPDATE_TIME")
    public byte[] getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LAST_UPDATE_TIME")
    public void setLastUpdateTime(byte[] lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LAST_ACCESS_TIME")
    public byte[] getLastAccessTime() {
        return lastAccessTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.LAST_ACCESS_TIME")
    public void setLastAccessTime(byte[] lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.RECOVER_TIME")
    public byte[] getRecoverTime() {
        return recoverTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.RECOVER_TIME")
    public void setRecoverTime(byte[] recoverTime) {
        this.recoverTime = recoverTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TRANSACTION_COUNTER")
    public byte[] getTransactionCounter() {
        return transactionCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TRANSACTION_COUNTER")
    public void setTransactionCounter(byte[] transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_ROWS")
    public byte[] getTableRows() {
        return tableRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.TABLE_ROWS")
    public void setTableRows(byte[] tableRows) {
        this.tableRows = tableRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.AVG_ROW_LENGTH")
    public byte[] getAvgRowLength() {
        return avgRowLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3390233+08:00", comments="Source field: FILES.AVG_ROW_LENGTH")
    public void setAvgRowLength(byte[] avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.DATA_LENGTH")
    public byte[] getDataLength() {
        return dataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.DATA_LENGTH")
    public void setDataLength(byte[] dataLength) {
        this.dataLength = dataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.MAX_DATA_LENGTH")
    public byte[] getMaxDataLength() {
        return maxDataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.MAX_DATA_LENGTH")
    public void setMaxDataLength(byte[] maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.INDEX_LENGTH")
    public byte[] getIndexLength() {
        return indexLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.INDEX_LENGTH")
    public void setIndexLength(byte[] indexLength) {
        this.indexLength = indexLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CREATE_TIME")
    public byte[] getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CREATE_TIME")
    public void setCreateTime(byte[] createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.UPDATE_TIME")
    public byte[] getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.UPDATE_TIME")
    public void setUpdateTime(byte[] updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CHECK_TIME")
    public byte[] getCheckTime() {
        return checkTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CHECK_TIME")
    public void setCheckTime(byte[] checkTime) {
        this.checkTime = checkTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CHECKSUM")
    public byte[] getChecksum() {
        return checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source field: FILES.CHECKSUM")
    public void setChecksum(byte[] checksum) {
        this.checksum = checksum;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source Table: FILES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", fileType=").append(fileType);
        sb.append(", tablespaceName=").append(tablespaceName);
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", logfileGroupName=").append(logfileGroupName);
        sb.append(", logfileGroupNumber=").append(logfileGroupNumber);
        sb.append(", engine=").append(engine);
        sb.append(", freeExtents=").append(freeExtents);
        sb.append(", totalExtents=").append(totalExtents);
        sb.append(", extentSize=").append(extentSize);
        sb.append(", initialSize=").append(initialSize);
        sb.append(", maximumSize=").append(maximumSize);
        sb.append(", autoextendSize=").append(autoextendSize);
        sb.append(", version=").append(version);
        sb.append(", rowFormat=").append(rowFormat);
        sb.append(", dataFree=").append(dataFree);
        sb.append(", status=").append(status);
        sb.append(", extra=").append(extra);
        sb.append(", fileName=").append(fileName);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", fulltextKeys=").append(fulltextKeys);
        sb.append(", deletedRows=").append(deletedRows);
        sb.append(", updateCount=").append(updateCount);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", recoverTime=").append(recoverTime);
        sb.append(", transactionCounter=").append(transactionCounter);
        sb.append(", tableRows=").append(tableRows);
        sb.append(", avgRowLength=").append(avgRowLength);
        sb.append(", dataLength=").append(dataLength);
        sb.append(", maxDataLength=").append(maxDataLength);
        sb.append(", indexLength=").append(indexLength);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checksum=").append(checksum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source Table: FILES")
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
        Files other = (Files) that;
        return (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getTablespaceName() == null ? other.getTablespaceName() == null : this.getTablespaceName().equals(other.getTablespaceName()))
            && (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getLogfileGroupName() == null ? other.getLogfileGroupName() == null : this.getLogfileGroupName().equals(other.getLogfileGroupName()))
            && (this.getLogfileGroupNumber() == null ? other.getLogfileGroupNumber() == null : this.getLogfileGroupNumber().equals(other.getLogfileGroupNumber()))
            && (this.getEngine() == null ? other.getEngine() == null : this.getEngine().equals(other.getEngine()))
            && (this.getFreeExtents() == null ? other.getFreeExtents() == null : this.getFreeExtents().equals(other.getFreeExtents()))
            && (this.getTotalExtents() == null ? other.getTotalExtents() == null : this.getTotalExtents().equals(other.getTotalExtents()))
            && (this.getExtentSize() == null ? other.getExtentSize() == null : this.getExtentSize().equals(other.getExtentSize()))
            && (this.getInitialSize() == null ? other.getInitialSize() == null : this.getInitialSize().equals(other.getInitialSize()))
            && (this.getMaximumSize() == null ? other.getMaximumSize() == null : this.getMaximumSize().equals(other.getMaximumSize()))
            && (this.getAutoextendSize() == null ? other.getAutoextendSize() == null : this.getAutoextendSize().equals(other.getAutoextendSize()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getRowFormat() == null ? other.getRowFormat() == null : this.getRowFormat().equals(other.getRowFormat()))
            && (this.getDataFree() == null ? other.getDataFree() == null : this.getDataFree().equals(other.getDataFree()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3400239+08:00", comments="Source Table: FILES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getTablespaceName() == null) ? 0 : getTablespaceName().hashCode());
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getLogfileGroupName() == null) ? 0 : getLogfileGroupName().hashCode());
        result = prime * result + ((getLogfileGroupNumber() == null) ? 0 : getLogfileGroupNumber().hashCode());
        result = prime * result + ((getEngine() == null) ? 0 : getEngine().hashCode());
        result = prime * result + ((getFreeExtents() == null) ? 0 : getFreeExtents().hashCode());
        result = prime * result + ((getTotalExtents() == null) ? 0 : getTotalExtents().hashCode());
        result = prime * result + ((getExtentSize() == null) ? 0 : getExtentSize().hashCode());
        result = prime * result + ((getInitialSize() == null) ? 0 : getInitialSize().hashCode());
        result = prime * result + ((getMaximumSize() == null) ? 0 : getMaximumSize().hashCode());
        result = prime * result + ((getAutoextendSize() == null) ? 0 : getAutoextendSize().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getRowFormat() == null) ? 0 : getRowFormat().hashCode());
        result = prime * result + ((getDataFree() == null) ? 0 : getDataFree().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        return result;
    }
}