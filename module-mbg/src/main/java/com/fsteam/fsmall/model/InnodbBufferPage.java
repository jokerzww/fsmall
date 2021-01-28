package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbBufferPage implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    private Long poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    private Long blockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    private Long space;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    private Long pageNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    private String pageType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    private Long flushType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    private Long fixCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    private String isHashed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    private Long newestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    private Long oldestModification;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    private Long accessTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    private Long numberRecords;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    private Long dataSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    private Long compressedSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    private String pageState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    private String ioFix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    private String isOld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    private Long freePageClock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source Table: INNODB_BUFFER_PAGE")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    public Long getPoolId() {
        return poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.POOL_ID")
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    public Long getBlockId() {
        return blockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.BLOCK_ID")
    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    public Long getSpace() {
        return space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.SPACE")
    public void setSpace(Long space) {
        this.space = space;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    public Long getPageNumber() {
        return pageNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_NUMBER")
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    public String getPageType() {
        return pageType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_TYPE")
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    public Long getFlushType() {
        return flushType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.FLUSH_TYPE")
    public void setFlushType(Long flushType) {
        this.flushType = flushType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    public Long getFixCount() {
        return fixCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.FIX_COUNT")
    public void setFixCount(Long fixCount) {
        this.fixCount = fixCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    public String getIsHashed() {
        return isHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.IS_HASHED")
    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    public Long getNewestModification() {
        return newestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.NEWEST_MODIFICATION")
    public void setNewestModification(Long newestModification) {
        this.newestModification = newestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    public Long getOldestModification() {
        return oldestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.OLDEST_MODIFICATION")
    public void setOldestModification(Long oldestModification) {
        this.oldestModification = oldestModification;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    public Long getAccessTime() {
        return accessTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1658667+08:00", comments="Source field: INNODB_BUFFER_PAGE.ACCESS_TIME")
    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.INDEX_NAME")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    public Long getNumberRecords() {
        return numberRecords;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.NUMBER_RECORDS")
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    public Long getDataSize() {
        return dataSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.DATA_SIZE")
    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    public Long getCompressedSize() {
        return compressedSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.COMPRESSED_SIZE")
    public void setCompressedSize(Long compressedSize) {
        this.compressedSize = compressedSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    public String getPageState() {
        return pageState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.PAGE_STATE")
    public void setPageState(String pageState) {
        this.pageState = pageState;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    public String getIoFix() {
        return ioFix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.IO_FIX")
    public void setIoFix(String ioFix) {
        this.ioFix = ioFix;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    public String getIsOld() {
        return isOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.IS_OLD")
    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    public Long getFreePageClock() {
        return freePageClock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source field: INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK")
    public void setFreePageClock(Long freePageClock) {
        this.freePageClock = freePageClock;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source Table: INNODB_BUFFER_PAGE")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", poolId=").append(poolId);
        sb.append(", blockId=").append(blockId);
        sb.append(", space=").append(space);
        sb.append(", pageNumber=").append(pageNumber);
        sb.append(", pageType=").append(pageType);
        sb.append(", flushType=").append(flushType);
        sb.append(", fixCount=").append(fixCount);
        sb.append(", isHashed=").append(isHashed);
        sb.append(", newestModification=").append(newestModification);
        sb.append(", oldestModification=").append(oldestModification);
        sb.append(", accessTime=").append(accessTime);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", numberRecords=").append(numberRecords);
        sb.append(", dataSize=").append(dataSize);
        sb.append(", compressedSize=").append(compressedSize);
        sb.append(", pageState=").append(pageState);
        sb.append(", ioFix=").append(ioFix);
        sb.append(", isOld=").append(isOld);
        sb.append(", freePageClock=").append(freePageClock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source Table: INNODB_BUFFER_PAGE")
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
        InnodbBufferPage other = (InnodbBufferPage) that;
        return (this.getPoolId() == null ? other.getPoolId() == null : this.getPoolId().equals(other.getPoolId()))
            && (this.getBlockId() == null ? other.getBlockId() == null : this.getBlockId().equals(other.getBlockId()))
            && (this.getSpace() == null ? other.getSpace() == null : this.getSpace().equals(other.getSpace()))
            && (this.getPageNumber() == null ? other.getPageNumber() == null : this.getPageNumber().equals(other.getPageNumber()))
            && (this.getPageType() == null ? other.getPageType() == null : this.getPageType().equals(other.getPageType()))
            && (this.getFlushType() == null ? other.getFlushType() == null : this.getFlushType().equals(other.getFlushType()))
            && (this.getFixCount() == null ? other.getFixCount() == null : this.getFixCount().equals(other.getFixCount()))
            && (this.getIsHashed() == null ? other.getIsHashed() == null : this.getIsHashed().equals(other.getIsHashed()))
            && (this.getNewestModification() == null ? other.getNewestModification() == null : this.getNewestModification().equals(other.getNewestModification()))
            && (this.getOldestModification() == null ? other.getOldestModification() == null : this.getOldestModification().equals(other.getOldestModification()))
            && (this.getAccessTime() == null ? other.getAccessTime() == null : this.getAccessTime().equals(other.getAccessTime()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getNumberRecords() == null ? other.getNumberRecords() == null : this.getNumberRecords().equals(other.getNumberRecords()))
            && (this.getDataSize() == null ? other.getDataSize() == null : this.getDataSize().equals(other.getDataSize()))
            && (this.getCompressedSize() == null ? other.getCompressedSize() == null : this.getCompressedSize().equals(other.getCompressedSize()))
            && (this.getPageState() == null ? other.getPageState() == null : this.getPageState().equals(other.getPageState()))
            && (this.getIoFix() == null ? other.getIoFix() == null : this.getIoFix().equals(other.getIoFix()))
            && (this.getIsOld() == null ? other.getIsOld() == null : this.getIsOld().equals(other.getIsOld()))
            && (this.getFreePageClock() == null ? other.getFreePageClock() == null : this.getFreePageClock().equals(other.getFreePageClock()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1668663+08:00", comments="Source Table: INNODB_BUFFER_PAGE")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        result = prime * result + ((getBlockId() == null) ? 0 : getBlockId().hashCode());
        result = prime * result + ((getSpace() == null) ? 0 : getSpace().hashCode());
        result = prime * result + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        result = prime * result + ((getPageType() == null) ? 0 : getPageType().hashCode());
        result = prime * result + ((getFlushType() == null) ? 0 : getFlushType().hashCode());
        result = prime * result + ((getFixCount() == null) ? 0 : getFixCount().hashCode());
        result = prime * result + ((getIsHashed() == null) ? 0 : getIsHashed().hashCode());
        result = prime * result + ((getNewestModification() == null) ? 0 : getNewestModification().hashCode());
        result = prime * result + ((getOldestModification() == null) ? 0 : getOldestModification().hashCode());
        result = prime * result + ((getAccessTime() == null) ? 0 : getAccessTime().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getNumberRecords() == null) ? 0 : getNumberRecords().hashCode());
        result = prime * result + ((getDataSize() == null) ? 0 : getDataSize().hashCode());
        result = prime * result + ((getCompressedSize() == null) ? 0 : getCompressedSize().hashCode());
        result = prime * result + ((getPageState() == null) ? 0 : getPageState().hashCode());
        result = prime * result + ((getIoFix() == null) ? 0 : getIoFix().hashCode());
        result = prime * result + ((getIsOld() == null) ? 0 : getIsOld().hashCode());
        result = prime * result + ((getFreePageClock() == null) ? 0 : getFreePageClock().hashCode());
        return result;
    }
}