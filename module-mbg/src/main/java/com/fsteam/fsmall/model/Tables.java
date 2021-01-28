package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Tables implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_TYPE")
    private String tableType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.ENGINE")
    private String engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.VERSION")
    private Integer version;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.ROW_FORMAT")
    private String rowFormat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_ROWS")
    private Long tableRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.AVG_ROW_LENGTH")
    private Long avgRowLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.DATA_LENGTH")
    private Long dataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.MAX_DATA_LENGTH")
    private Long maxDataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.INDEX_LENGTH")
    private Long indexLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.DATA_FREE")
    private Long dataFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.AUTO_INCREMENT")
    private Long autoIncrement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CREATE_TIME")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.UPDATE_TIME")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CHECK_TIME")
    private Date checkTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_COLLATION")
    private String tableCollation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CHECKSUM")
    private Long checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CREATE_OPTIONS")
    private String createOptions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_COMMENT")
    private String tableComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source Table: TABLES")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_TYPE")
    public String getTableType() {
        return tableType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_TYPE")
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.ENGINE")
    public String getEngine() {
        return engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.ENGINE")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.VERSION")
    public Integer getVersion() {
        return version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.VERSION")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.ROW_FORMAT")
    public String getRowFormat() {
        return rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.ROW_FORMAT")
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_ROWS")
    public Long getTableRows() {
        return tableRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_ROWS")
    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.AVG_ROW_LENGTH")
    public Long getAvgRowLength() {
        return avgRowLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.AVG_ROW_LENGTH")
    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.DATA_LENGTH")
    public Long getDataLength() {
        return dataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.DATA_LENGTH")
    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.MAX_DATA_LENGTH")
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.MAX_DATA_LENGTH")
    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.INDEX_LENGTH")
    public Long getIndexLength() {
        return indexLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.INDEX_LENGTH")
    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.DATA_FREE")
    public Long getDataFree() {
        return dataFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.DATA_FREE")
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.AUTO_INCREMENT")
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.AUTO_INCREMENT")
    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CREATE_TIME")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.UPDATE_TIME")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CHECK_TIME")
    public Date getCheckTime() {
        return checkTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CHECK_TIME")
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_COLLATION")
    public String getTableCollation() {
        return tableCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_COLLATION")
    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CHECKSUM")
    public Long getChecksum() {
        return checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CHECKSUM")
    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CREATE_OPTIONS")
    public String getCreateOptions() {
        return createOptions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.CREATE_OPTIONS")
    public void setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_COMMENT")
    public String getTableComment() {
        return tableComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source field: TABLES.TABLE_COMMENT")
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source Table: TABLES")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", tableType=").append(tableType);
        sb.append(", engine=").append(engine);
        sb.append(", version=").append(version);
        sb.append(", rowFormat=").append(rowFormat);
        sb.append(", tableRows=").append(tableRows);
        sb.append(", avgRowLength=").append(avgRowLength);
        sb.append(", dataLength=").append(dataLength);
        sb.append(", maxDataLength=").append(maxDataLength);
        sb.append(", indexLength=").append(indexLength);
        sb.append(", dataFree=").append(dataFree);
        sb.append(", autoIncrement=").append(autoIncrement);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", tableCollation=").append(tableCollation);
        sb.append(", checksum=").append(checksum);
        sb.append(", createOptions=").append(createOptions);
        sb.append(", tableComment=").append(tableComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4871602+08:00", comments="Source Table: TABLES")
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
        Tables other = (Tables) that;
        return (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getTableType() == null ? other.getTableType() == null : this.getTableType().equals(other.getTableType()))
            && (this.getEngine() == null ? other.getEngine() == null : this.getEngine().equals(other.getEngine()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getRowFormat() == null ? other.getRowFormat() == null : this.getRowFormat().equals(other.getRowFormat()))
            && (this.getTableRows() == null ? other.getTableRows() == null : this.getTableRows().equals(other.getTableRows()))
            && (this.getAvgRowLength() == null ? other.getAvgRowLength() == null : this.getAvgRowLength().equals(other.getAvgRowLength()))
            && (this.getDataLength() == null ? other.getDataLength() == null : this.getDataLength().equals(other.getDataLength()))
            && (this.getMaxDataLength() == null ? other.getMaxDataLength() == null : this.getMaxDataLength().equals(other.getMaxDataLength()))
            && (this.getIndexLength() == null ? other.getIndexLength() == null : this.getIndexLength().equals(other.getIndexLength()))
            && (this.getDataFree() == null ? other.getDataFree() == null : this.getDataFree().equals(other.getDataFree()))
            && (this.getAutoIncrement() == null ? other.getAutoIncrement() == null : this.getAutoIncrement().equals(other.getAutoIncrement()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getTableCollation() == null ? other.getTableCollation() == null : this.getTableCollation().equals(other.getTableCollation()))
            && (this.getChecksum() == null ? other.getChecksum() == null : this.getChecksum().equals(other.getChecksum()))
            && (this.getCreateOptions() == null ? other.getCreateOptions() == null : this.getCreateOptions().equals(other.getCreateOptions()))
            && (this.getTableComment() == null ? other.getTableComment() == null : this.getTableComment().equals(other.getTableComment()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4881608+08:00", comments="Source Table: TABLES")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getTableType() == null) ? 0 : getTableType().hashCode());
        result = prime * result + ((getEngine() == null) ? 0 : getEngine().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getRowFormat() == null) ? 0 : getRowFormat().hashCode());
        result = prime * result + ((getTableRows() == null) ? 0 : getTableRows().hashCode());
        result = prime * result + ((getAvgRowLength() == null) ? 0 : getAvgRowLength().hashCode());
        result = prime * result + ((getDataLength() == null) ? 0 : getDataLength().hashCode());
        result = prime * result + ((getMaxDataLength() == null) ? 0 : getMaxDataLength().hashCode());
        result = prime * result + ((getIndexLength() == null) ? 0 : getIndexLength().hashCode());
        result = prime * result + ((getDataFree() == null) ? 0 : getDataFree().hashCode());
        result = prime * result + ((getAutoIncrement() == null) ? 0 : getAutoIncrement().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getTableCollation() == null) ? 0 : getTableCollation().hashCode());
        result = prime * result + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        result = prime * result + ((getCreateOptions() == null) ? 0 : getCreateOptions().hashCode());
        result = prime * result + ((getTableComment() == null) ? 0 : getTableComment().hashCode());
        return result;
    }
}