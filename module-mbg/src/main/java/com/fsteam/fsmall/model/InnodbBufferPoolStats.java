package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class InnodbBufferPoolStats implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    private Long poolId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    private Long poolSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    private Long freeBuffers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    private Long databasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    private Long oldDatabasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    private Long modifiedDatabasePages;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    private Long pendingDecompress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    private Long pendingReads;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    private Long pendingFlushLru;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    private Long pendingFlushList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    private Long pagesMadeYoung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    private Long pagesNotMadeYoung;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    private Float pagesMadeYoungRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    private Float pagesMadeNotYoungRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    private Long numberPagesRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    private Long numberPagesCreated;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    private Long numberPagesWritten;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    private Float pagesReadRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    private Float pagesCreateRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    private Float pagesWrittenRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    private Long numberPagesGet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    private Long hitRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long youngMakePerThousandGets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long notYoungMakePerThousandGets;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    private Long numberPagesReadAhead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    private Long numberReadAheadEvicted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    private Float readAheadRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    private Float readAheadEvictedRate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    private Long lruIoTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    private Long lruIoCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    private Long uncompressTotal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    private Long uncompressCurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    public Long getPoolId() {
        return poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_ID")
    public void setPoolId(Long poolId) {
        this.poolId = poolId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    public Long getPoolSize() {
        return poolSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.POOL_SIZE")
    public void setPoolSize(Long poolSize) {
        this.poolSize = poolSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    public Long getFreeBuffers() {
        return freeBuffers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.FREE_BUFFERS")
    public void setFreeBuffers(Long freeBuffers) {
        this.freeBuffers = freeBuffers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    public Long getDatabasePages() {
        return databasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.DATABASE_PAGES")
    public void setDatabasePages(Long databasePages) {
        this.databasePages = databasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    public Long getOldDatabasePages() {
        return oldDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES")
    public void setOldDatabasePages(Long oldDatabasePages) {
        this.oldDatabasePages = oldDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    public Long getModifiedDatabasePages() {
        return modifiedDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES")
    public void setModifiedDatabasePages(Long modifiedDatabasePages) {
        this.modifiedDatabasePages = modifiedDatabasePages;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    public Long getPendingDecompress() {
        return pendingDecompress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS")
    public void setPendingDecompress(Long pendingDecompress) {
        this.pendingDecompress = pendingDecompress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    public Long getPendingReads() {
        return pendingReads;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_READS")
    public void setPendingReads(Long pendingReads) {
        this.pendingReads = pendingReads;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    public Long getPendingFlushLru() {
        return pendingFlushLru;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU")
    public void setPendingFlushLru(Long pendingFlushLru) {
        this.pendingFlushLru = pendingFlushLru;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    public Long getPendingFlushList() {
        return pendingFlushList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST")
    public void setPendingFlushList(Long pendingFlushList) {
        this.pendingFlushList = pendingFlushList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    public Long getPagesMadeYoung() {
        return pagesMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG")
    public void setPagesMadeYoung(Long pagesMadeYoung) {
        this.pagesMadeYoung = pagesMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    public Long getPagesNotMadeYoung() {
        return pagesNotMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG")
    public void setPagesNotMadeYoung(Long pagesNotMadeYoung) {
        this.pagesNotMadeYoung = pagesNotMadeYoung;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    public Float getPagesMadeYoungRate() {
        return pagesMadeYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE")
    public void setPagesMadeYoungRate(Float pagesMadeYoungRate) {
        this.pagesMadeYoungRate = pagesMadeYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    public Float getPagesMadeNotYoungRate() {
        return pagesMadeNotYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE")
    public void setPagesMadeNotYoungRate(Float pagesMadeNotYoungRate) {
        this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    public Long getNumberPagesRead() {
        return numberPagesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ")
    public void setNumberPagesRead(Long numberPagesRead) {
        this.numberPagesRead = numberPagesRead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    public Long getNumberPagesCreated() {
        return numberPagesCreated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED")
    public void setNumberPagesCreated(Long numberPagesCreated) {
        this.numberPagesCreated = numberPagesCreated;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    public Long getNumberPagesWritten() {
        return numberPagesWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN")
    public void setNumberPagesWritten(Long numberPagesWritten) {
        this.numberPagesWritten = numberPagesWritten;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    public Float getPagesReadRate() {
        return pagesReadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE")
    public void setPagesReadRate(Float pagesReadRate) {
        this.pagesReadRate = pagesReadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    public Float getPagesCreateRate() {
        return pagesCreateRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE")
    public void setPagesCreateRate(Float pagesCreateRate) {
        this.pagesCreateRate = pagesCreateRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    public Float getPagesWrittenRate() {
        return pagesWrittenRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE")
    public void setPagesWrittenRate(Float pagesWrittenRate) {
        this.pagesWrittenRate = pagesWrittenRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    public Long getNumberPagesGet() {
        return numberPagesGet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET")
    public void setNumberPagesGet(Long numberPagesGet) {
        this.numberPagesGet = numberPagesGet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    public Long getHitRate() {
        return hitRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.HIT_RATE")
    public void setHitRate(Long hitRate) {
        this.hitRate = hitRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    public Long getYoungMakePerThousandGets() {
        return youngMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS")
    public void setYoungMakePerThousandGets(Long youngMakePerThousandGets) {
        this.youngMakePerThousandGets = youngMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    public Long getNotYoungMakePerThousandGets() {
        return notYoungMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    public void setNotYoungMakePerThousandGets(Long notYoungMakePerThousandGets) {
        this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    public Long getNumberPagesReadAhead() {
        return numberPagesReadAhead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD")
    public void setNumberPagesReadAhead(Long numberPagesReadAhead) {
        this.numberPagesReadAhead = numberPagesReadAhead;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    public Long getNumberReadAheadEvicted() {
        return numberReadAheadEvicted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED")
    public void setNumberReadAheadEvicted(Long numberReadAheadEvicted) {
        this.numberReadAheadEvicted = numberReadAheadEvicted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    public Float getReadAheadRate() {
        return readAheadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE")
    public void setReadAheadRate(Float readAheadRate) {
        this.readAheadRate = readAheadRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    public Float getReadAheadEvictedRate() {
        return readAheadEvictedRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE")
    public void setReadAheadEvictedRate(Float readAheadEvictedRate) {
        this.readAheadEvictedRate = readAheadEvictedRate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    public Long getLruIoTotal() {
        return lruIoTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL")
    public void setLruIoTotal(Long lruIoTotal) {
        this.lruIoTotal = lruIoTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    public Long getLruIoCurrent() {
        return lruIoCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT")
    public void setLruIoCurrent(Long lruIoCurrent) {
        this.lruIoCurrent = lruIoCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    public Long getUncompressTotal() {
        return uncompressTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL")
    public void setUncompressTotal(Long uncompressTotal) {
        this.uncompressTotal = uncompressTotal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    public Long getUncompressCurrent() {
        return uncompressCurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source field: INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT")
    public void setUncompressCurrent(Long uncompressCurrent) {
        this.uncompressCurrent = uncompressCurrent;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", poolId=").append(poolId);
        sb.append(", poolSize=").append(poolSize);
        sb.append(", freeBuffers=").append(freeBuffers);
        sb.append(", databasePages=").append(databasePages);
        sb.append(", oldDatabasePages=").append(oldDatabasePages);
        sb.append(", modifiedDatabasePages=").append(modifiedDatabasePages);
        sb.append(", pendingDecompress=").append(pendingDecompress);
        sb.append(", pendingReads=").append(pendingReads);
        sb.append(", pendingFlushLru=").append(pendingFlushLru);
        sb.append(", pendingFlushList=").append(pendingFlushList);
        sb.append(", pagesMadeYoung=").append(pagesMadeYoung);
        sb.append(", pagesNotMadeYoung=").append(pagesNotMadeYoung);
        sb.append(", pagesMadeYoungRate=").append(pagesMadeYoungRate);
        sb.append(", pagesMadeNotYoungRate=").append(pagesMadeNotYoungRate);
        sb.append(", numberPagesRead=").append(numberPagesRead);
        sb.append(", numberPagesCreated=").append(numberPagesCreated);
        sb.append(", numberPagesWritten=").append(numberPagesWritten);
        sb.append(", pagesReadRate=").append(pagesReadRate);
        sb.append(", pagesCreateRate=").append(pagesCreateRate);
        sb.append(", pagesWrittenRate=").append(pagesWrittenRate);
        sb.append(", numberPagesGet=").append(numberPagesGet);
        sb.append(", hitRate=").append(hitRate);
        sb.append(", youngMakePerThousandGets=").append(youngMakePerThousandGets);
        sb.append(", notYoungMakePerThousandGets=").append(notYoungMakePerThousandGets);
        sb.append(", numberPagesReadAhead=").append(numberPagesReadAhead);
        sb.append(", numberReadAheadEvicted=").append(numberReadAheadEvicted);
        sb.append(", readAheadRate=").append(readAheadRate);
        sb.append(", readAheadEvictedRate=").append(readAheadEvictedRate);
        sb.append(", lruIoTotal=").append(lruIoTotal);
        sb.append(", lruIoCurrent=").append(lruIoCurrent);
        sb.append(", uncompressTotal=").append(uncompressTotal);
        sb.append(", uncompressCurrent=").append(uncompressCurrent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
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
        InnodbBufferPoolStats other = (InnodbBufferPoolStats) that;
        return (this.getPoolId() == null ? other.getPoolId() == null : this.getPoolId().equals(other.getPoolId()))
            && (this.getPoolSize() == null ? other.getPoolSize() == null : this.getPoolSize().equals(other.getPoolSize()))
            && (this.getFreeBuffers() == null ? other.getFreeBuffers() == null : this.getFreeBuffers().equals(other.getFreeBuffers()))
            && (this.getDatabasePages() == null ? other.getDatabasePages() == null : this.getDatabasePages().equals(other.getDatabasePages()))
            && (this.getOldDatabasePages() == null ? other.getOldDatabasePages() == null : this.getOldDatabasePages().equals(other.getOldDatabasePages()))
            && (this.getModifiedDatabasePages() == null ? other.getModifiedDatabasePages() == null : this.getModifiedDatabasePages().equals(other.getModifiedDatabasePages()))
            && (this.getPendingDecompress() == null ? other.getPendingDecompress() == null : this.getPendingDecompress().equals(other.getPendingDecompress()))
            && (this.getPendingReads() == null ? other.getPendingReads() == null : this.getPendingReads().equals(other.getPendingReads()))
            && (this.getPendingFlushLru() == null ? other.getPendingFlushLru() == null : this.getPendingFlushLru().equals(other.getPendingFlushLru()))
            && (this.getPendingFlushList() == null ? other.getPendingFlushList() == null : this.getPendingFlushList().equals(other.getPendingFlushList()))
            && (this.getPagesMadeYoung() == null ? other.getPagesMadeYoung() == null : this.getPagesMadeYoung().equals(other.getPagesMadeYoung()))
            && (this.getPagesNotMadeYoung() == null ? other.getPagesNotMadeYoung() == null : this.getPagesNotMadeYoung().equals(other.getPagesNotMadeYoung()))
            && (this.getPagesMadeYoungRate() == null ? other.getPagesMadeYoungRate() == null : this.getPagesMadeYoungRate().equals(other.getPagesMadeYoungRate()))
            && (this.getPagesMadeNotYoungRate() == null ? other.getPagesMadeNotYoungRate() == null : this.getPagesMadeNotYoungRate().equals(other.getPagesMadeNotYoungRate()))
            && (this.getNumberPagesRead() == null ? other.getNumberPagesRead() == null : this.getNumberPagesRead().equals(other.getNumberPagesRead()))
            && (this.getNumberPagesCreated() == null ? other.getNumberPagesCreated() == null : this.getNumberPagesCreated().equals(other.getNumberPagesCreated()))
            && (this.getNumberPagesWritten() == null ? other.getNumberPagesWritten() == null : this.getNumberPagesWritten().equals(other.getNumberPagesWritten()))
            && (this.getPagesReadRate() == null ? other.getPagesReadRate() == null : this.getPagesReadRate().equals(other.getPagesReadRate()))
            && (this.getPagesCreateRate() == null ? other.getPagesCreateRate() == null : this.getPagesCreateRate().equals(other.getPagesCreateRate()))
            && (this.getPagesWrittenRate() == null ? other.getPagesWrittenRate() == null : this.getPagesWrittenRate().equals(other.getPagesWrittenRate()))
            && (this.getNumberPagesGet() == null ? other.getNumberPagesGet() == null : this.getNumberPagesGet().equals(other.getNumberPagesGet()))
            && (this.getHitRate() == null ? other.getHitRate() == null : this.getHitRate().equals(other.getHitRate()))
            && (this.getYoungMakePerThousandGets() == null ? other.getYoungMakePerThousandGets() == null : this.getYoungMakePerThousandGets().equals(other.getYoungMakePerThousandGets()))
            && (this.getNotYoungMakePerThousandGets() == null ? other.getNotYoungMakePerThousandGets() == null : this.getNotYoungMakePerThousandGets().equals(other.getNotYoungMakePerThousandGets()))
            && (this.getNumberPagesReadAhead() == null ? other.getNumberPagesReadAhead() == null : this.getNumberPagesReadAhead().equals(other.getNumberPagesReadAhead()))
            && (this.getNumberReadAheadEvicted() == null ? other.getNumberReadAheadEvicted() == null : this.getNumberReadAheadEvicted().equals(other.getNumberReadAheadEvicted()))
            && (this.getReadAheadRate() == null ? other.getReadAheadRate() == null : this.getReadAheadRate().equals(other.getReadAheadRate()))
            && (this.getReadAheadEvictedRate() == null ? other.getReadAheadEvictedRate() == null : this.getReadAheadEvictedRate().equals(other.getReadAheadEvictedRate()))
            && (this.getLruIoTotal() == null ? other.getLruIoTotal() == null : this.getLruIoTotal().equals(other.getLruIoTotal()))
            && (this.getLruIoCurrent() == null ? other.getLruIoCurrent() == null : this.getLruIoCurrent().equals(other.getLruIoCurrent()))
            && (this.getUncompressTotal() == null ? other.getUncompressTotal() == null : this.getUncompressTotal().equals(other.getUncompressTotal()))
            && (this.getUncompressCurrent() == null ? other.getUncompressCurrent() == null : this.getUncompressCurrent().equals(other.getUncompressCurrent()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4170946+08:00", comments="Source Table: INNODB_BUFFER_POOL_STATS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        result = prime * result + ((getPoolSize() == null) ? 0 : getPoolSize().hashCode());
        result = prime * result + ((getFreeBuffers() == null) ? 0 : getFreeBuffers().hashCode());
        result = prime * result + ((getDatabasePages() == null) ? 0 : getDatabasePages().hashCode());
        result = prime * result + ((getOldDatabasePages() == null) ? 0 : getOldDatabasePages().hashCode());
        result = prime * result + ((getModifiedDatabasePages() == null) ? 0 : getModifiedDatabasePages().hashCode());
        result = prime * result + ((getPendingDecompress() == null) ? 0 : getPendingDecompress().hashCode());
        result = prime * result + ((getPendingReads() == null) ? 0 : getPendingReads().hashCode());
        result = prime * result + ((getPendingFlushLru() == null) ? 0 : getPendingFlushLru().hashCode());
        result = prime * result + ((getPendingFlushList() == null) ? 0 : getPendingFlushList().hashCode());
        result = prime * result + ((getPagesMadeYoung() == null) ? 0 : getPagesMadeYoung().hashCode());
        result = prime * result + ((getPagesNotMadeYoung() == null) ? 0 : getPagesNotMadeYoung().hashCode());
        result = prime * result + ((getPagesMadeYoungRate() == null) ? 0 : getPagesMadeYoungRate().hashCode());
        result = prime * result + ((getPagesMadeNotYoungRate() == null) ? 0 : getPagesMadeNotYoungRate().hashCode());
        result = prime * result + ((getNumberPagesRead() == null) ? 0 : getNumberPagesRead().hashCode());
        result = prime * result + ((getNumberPagesCreated() == null) ? 0 : getNumberPagesCreated().hashCode());
        result = prime * result + ((getNumberPagesWritten() == null) ? 0 : getNumberPagesWritten().hashCode());
        result = prime * result + ((getPagesReadRate() == null) ? 0 : getPagesReadRate().hashCode());
        result = prime * result + ((getPagesCreateRate() == null) ? 0 : getPagesCreateRate().hashCode());
        result = prime * result + ((getPagesWrittenRate() == null) ? 0 : getPagesWrittenRate().hashCode());
        result = prime * result + ((getNumberPagesGet() == null) ? 0 : getNumberPagesGet().hashCode());
        result = prime * result + ((getHitRate() == null) ? 0 : getHitRate().hashCode());
        result = prime * result + ((getYoungMakePerThousandGets() == null) ? 0 : getYoungMakePerThousandGets().hashCode());
        result = prime * result + ((getNotYoungMakePerThousandGets() == null) ? 0 : getNotYoungMakePerThousandGets().hashCode());
        result = prime * result + ((getNumberPagesReadAhead() == null) ? 0 : getNumberPagesReadAhead().hashCode());
        result = prime * result + ((getNumberReadAheadEvicted() == null) ? 0 : getNumberReadAheadEvicted().hashCode());
        result = prime * result + ((getReadAheadRate() == null) ? 0 : getReadAheadRate().hashCode());
        result = prime * result + ((getReadAheadEvictedRate() == null) ? 0 : getReadAheadEvictedRate().hashCode());
        result = prime * result + ((getLruIoTotal() == null) ? 0 : getLruIoTotal().hashCode());
        result = prime * result + ((getLruIoCurrent() == null) ? 0 : getLruIoCurrent().hashCode());
        result = prime * result + ((getUncompressTotal() == null) ? 0 : getUncompressTotal().hashCode());
        result = prime * result + ((getUncompressCurrent() == null) ? 0 : getUncompressCurrent().hashCode());
        return result;
    }
}