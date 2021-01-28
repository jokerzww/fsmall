package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Partitions implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_NAME")
    private String partitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_NAME")
    private String subpartitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_ORDINAL_POSITION")
    private Integer partitionOrdinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_ORDINAL_POSITION")
    private Integer subpartitionOrdinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_METHOD")
    private String partitionMethod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_METHOD")
    private String subpartitionMethod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_EXPRESSION")
    private String partitionExpression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_EXPRESSION")
    private String subpartitionExpression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_ROWS")
    private Long tableRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.AVG_ROW_LENGTH")
    private Long avgRowLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.DATA_LENGTH")
    private Long dataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.MAX_DATA_LENGTH")
    private Long maxDataLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.INDEX_LENGTH")
    private Long indexLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.DATA_FREE")
    private Long dataFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CREATE_TIME")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.UPDATE_TIME")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CHECK_TIME")
    private Date checkTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CHECKSUM")
    private Long checksum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.NODEGROUP")
    private String nodegroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLESPACE_NAME")
    private String tablespaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_DESCRIPTION")
    private String partitionDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_COMMENT")
    private String partitionComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source Table: PARTITIONS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_NAME")
    public String getPartitionName() {
        return partitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_NAME")
    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_NAME")
    public String getSubpartitionName() {
        return subpartitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_NAME")
    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_ORDINAL_POSITION")
    public Integer getPartitionOrdinalPosition() {
        return partitionOrdinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_ORDINAL_POSITION")
    public void setPartitionOrdinalPosition(Integer partitionOrdinalPosition) {
        this.partitionOrdinalPosition = partitionOrdinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_ORDINAL_POSITION")
    public Integer getSubpartitionOrdinalPosition() {
        return subpartitionOrdinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_ORDINAL_POSITION")
    public void setSubpartitionOrdinalPosition(Integer subpartitionOrdinalPosition) {
        this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_METHOD")
    public String getPartitionMethod() {
        return partitionMethod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_METHOD")
    public void setPartitionMethod(String partitionMethod) {
        this.partitionMethod = partitionMethod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_METHOD")
    public String getSubpartitionMethod() {
        return subpartitionMethod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_METHOD")
    public void setSubpartitionMethod(String subpartitionMethod) {
        this.subpartitionMethod = subpartitionMethod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_EXPRESSION")
    public String getPartitionExpression() {
        return partitionExpression;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_EXPRESSION")
    public void setPartitionExpression(String partitionExpression) {
        this.partitionExpression = partitionExpression;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_EXPRESSION")
    public String getSubpartitionExpression() {
        return subpartitionExpression;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.SUBPARTITION_EXPRESSION")
    public void setSubpartitionExpression(String subpartitionExpression) {
        this.subpartitionExpression = subpartitionExpression;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_ROWS")
    public Long getTableRows() {
        return tableRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLE_ROWS")
    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.AVG_ROW_LENGTH")
    public Long getAvgRowLength() {
        return avgRowLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.AVG_ROW_LENGTH")
    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.DATA_LENGTH")
    public Long getDataLength() {
        return dataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.DATA_LENGTH")
    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.MAX_DATA_LENGTH")
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.MAX_DATA_LENGTH")
    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.INDEX_LENGTH")
    public Long getIndexLength() {
        return indexLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.INDEX_LENGTH")
    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.DATA_FREE")
    public Long getDataFree() {
        return dataFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.DATA_FREE")
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CREATE_TIME")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.UPDATE_TIME")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.UPDATE_TIME")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CHECK_TIME")
    public Date getCheckTime() {
        return checkTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CHECK_TIME")
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CHECKSUM")
    public Long getChecksum() {
        return checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.CHECKSUM")
    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.NODEGROUP")
    public String getNodegroup() {
        return nodegroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.NODEGROUP")
    public void setNodegroup(String nodegroup) {
        this.nodegroup = nodegroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLESPACE_NAME")
    public String getTablespaceName() {
        return tablespaceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.TABLESPACE_NAME")
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_DESCRIPTION")
    public String getPartitionDescription() {
        return partitionDescription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_DESCRIPTION")
    public void setPartitionDescription(String partitionDescription) {
        this.partitionDescription = partitionDescription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_COMMENT")
    public String getPartitionComment() {
        return partitionComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source field: PARTITIONS.PARTITION_COMMENT")
    public void setPartitionComment(String partitionComment) {
        this.partitionComment = partitionComment;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source Table: PARTITIONS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", partitionName=").append(partitionName);
        sb.append(", subpartitionName=").append(subpartitionName);
        sb.append(", partitionOrdinalPosition=").append(partitionOrdinalPosition);
        sb.append(", subpartitionOrdinalPosition=").append(subpartitionOrdinalPosition);
        sb.append(", partitionMethod=").append(partitionMethod);
        sb.append(", subpartitionMethod=").append(subpartitionMethod);
        sb.append(", partitionExpression=").append(partitionExpression);
        sb.append(", subpartitionExpression=").append(subpartitionExpression);
        sb.append(", tableRows=").append(tableRows);
        sb.append(", avgRowLength=").append(avgRowLength);
        sb.append(", dataLength=").append(dataLength);
        sb.append(", maxDataLength=").append(maxDataLength);
        sb.append(", indexLength=").append(indexLength);
        sb.append(", dataFree=").append(dataFree);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", checksum=").append(checksum);
        sb.append(", nodegroup=").append(nodegroup);
        sb.append(", tablespaceName=").append(tablespaceName);
        sb.append(", partitionDescription=").append(partitionDescription);
        sb.append(", partitionComment=").append(partitionComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source Table: PARTITIONS")
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
        Partitions other = (Partitions) that;
        return (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getPartitionName() == null ? other.getPartitionName() == null : this.getPartitionName().equals(other.getPartitionName()))
            && (this.getSubpartitionName() == null ? other.getSubpartitionName() == null : this.getSubpartitionName().equals(other.getSubpartitionName()))
            && (this.getPartitionOrdinalPosition() == null ? other.getPartitionOrdinalPosition() == null : this.getPartitionOrdinalPosition().equals(other.getPartitionOrdinalPosition()))
            && (this.getSubpartitionOrdinalPosition() == null ? other.getSubpartitionOrdinalPosition() == null : this.getSubpartitionOrdinalPosition().equals(other.getSubpartitionOrdinalPosition()))
            && (this.getPartitionMethod() == null ? other.getPartitionMethod() == null : this.getPartitionMethod().equals(other.getPartitionMethod()))
            && (this.getSubpartitionMethod() == null ? other.getSubpartitionMethod() == null : this.getSubpartitionMethod().equals(other.getSubpartitionMethod()))
            && (this.getPartitionExpression() == null ? other.getPartitionExpression() == null : this.getPartitionExpression().equals(other.getPartitionExpression()))
            && (this.getSubpartitionExpression() == null ? other.getSubpartitionExpression() == null : this.getSubpartitionExpression().equals(other.getSubpartitionExpression()))
            && (this.getTableRows() == null ? other.getTableRows() == null : this.getTableRows().equals(other.getTableRows()))
            && (this.getAvgRowLength() == null ? other.getAvgRowLength() == null : this.getAvgRowLength().equals(other.getAvgRowLength()))
            && (this.getDataLength() == null ? other.getDataLength() == null : this.getDataLength().equals(other.getDataLength()))
            && (this.getMaxDataLength() == null ? other.getMaxDataLength() == null : this.getMaxDataLength().equals(other.getMaxDataLength()))
            && (this.getIndexLength() == null ? other.getIndexLength() == null : this.getIndexLength().equals(other.getIndexLength()))
            && (this.getDataFree() == null ? other.getDataFree() == null : this.getDataFree().equals(other.getDataFree()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCheckTime() == null ? other.getCheckTime() == null : this.getCheckTime().equals(other.getCheckTime()))
            && (this.getChecksum() == null ? other.getChecksum() == null : this.getChecksum().equals(other.getChecksum()))
            && (this.getNodegroup() == null ? other.getNodegroup() == null : this.getNodegroup().equals(other.getNodegroup()))
            && (this.getTablespaceName() == null ? other.getTablespaceName() == null : this.getTablespaceName().equals(other.getTablespaceName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5532186+08:00", comments="Source Table: PARTITIONS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getPartitionName() == null) ? 0 : getPartitionName().hashCode());
        result = prime * result + ((getSubpartitionName() == null) ? 0 : getSubpartitionName().hashCode());
        result = prime * result + ((getPartitionOrdinalPosition() == null) ? 0 : getPartitionOrdinalPosition().hashCode());
        result = prime * result + ((getSubpartitionOrdinalPosition() == null) ? 0 : getSubpartitionOrdinalPosition().hashCode());
        result = prime * result + ((getPartitionMethod() == null) ? 0 : getPartitionMethod().hashCode());
        result = prime * result + ((getSubpartitionMethod() == null) ? 0 : getSubpartitionMethod().hashCode());
        result = prime * result + ((getPartitionExpression() == null) ? 0 : getPartitionExpression().hashCode());
        result = prime * result + ((getSubpartitionExpression() == null) ? 0 : getSubpartitionExpression().hashCode());
        result = prime * result + ((getTableRows() == null) ? 0 : getTableRows().hashCode());
        result = prime * result + ((getAvgRowLength() == null) ? 0 : getAvgRowLength().hashCode());
        result = prime * result + ((getDataLength() == null) ? 0 : getDataLength().hashCode());
        result = prime * result + ((getMaxDataLength() == null) ? 0 : getMaxDataLength().hashCode());
        result = prime * result + ((getIndexLength() == null) ? 0 : getIndexLength().hashCode());
        result = prime * result + ((getDataFree() == null) ? 0 : getDataFree().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCheckTime() == null) ? 0 : getCheckTime().hashCode());
        result = prime * result + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        result = prime * result + ((getNodegroup() == null) ? 0 : getNodegroup().hashCode());
        result = prime * result + ((getTablespaceName() == null) ? 0 : getTablespaceName().hashCode());
        return result;
    }
}