package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemorySummaryByHostByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source Table: memory_summary_by_host_by_event_name")
    public static final MemorySummaryByHostByEventName memorySummaryByHostByEventName = new MemorySummaryByHostByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.HOST")
    public static final SqlColumn<String> host = memorySummaryByHostByEventName.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = memorySummaryByHostByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.COUNT_ALLOC")
    public static final SqlColumn<Long> countAlloc = memorySummaryByHostByEventName.countAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.COUNT_FREE")
    public static final SqlColumn<Long> countFree = memorySummaryByHostByEventName.countFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC")
    public static final SqlColumn<Long> sumNumberOfBytesAlloc = memorySummaryByHostByEventName.sumNumberOfBytesAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.SUM_NUMBER_OF_BYTES_FREE")
    public static final SqlColumn<Long> sumNumberOfBytesFree = memorySummaryByHostByEventName.sumNumberOfBytesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source field: memory_summary_by_host_by_event_name.LOW_COUNT_USED")
    public static final SqlColumn<Long> lowCountUsed = memorySummaryByHostByEventName.lowCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2829729+08:00", comments="Source field: memory_summary_by_host_by_event_name.CURRENT_COUNT_USED")
    public static final SqlColumn<Long> currentCountUsed = memorySummaryByHostByEventName.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2829729+08:00", comments="Source field: memory_summary_by_host_by_event_name.HIGH_COUNT_USED")
    public static final SqlColumn<Long> highCountUsed = memorySummaryByHostByEventName.highCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2829729+08:00", comments="Source field: memory_summary_by_host_by_event_name.LOW_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> lowNumberOfBytesUsed = memorySummaryByHostByEventName.lowNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2829729+08:00", comments="Source field: memory_summary_by_host_by_event_name.CURRENT_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> currentNumberOfBytesUsed = memorySummaryByHostByEventName.currentNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2829729+08:00", comments="Source field: memory_summary_by_host_by_event_name.HIGH_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> highNumberOfBytesUsed = memorySummaryByHostByEventName.highNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2819721+08:00", comments="Source Table: memory_summary_by_host_by_event_name")
    public static final class MemorySummaryByHostByEventName extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countAlloc = column("COUNT_ALLOC", JDBCType.BIGINT);

        public final SqlColumn<Long> countFree = column("COUNT_FREE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNumberOfBytesAlloc = column("SUM_NUMBER_OF_BYTES_ALLOC", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNumberOfBytesFree = column("SUM_NUMBER_OF_BYTES_FREE", JDBCType.BIGINT);

        public final SqlColumn<Long> lowCountUsed = column("LOW_COUNT_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> currentCountUsed = column("CURRENT_COUNT_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> highCountUsed = column("HIGH_COUNT_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> lowNumberOfBytesUsed = column("LOW_NUMBER_OF_BYTES_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> currentNumberOfBytesUsed = column("CURRENT_NUMBER_OF_BYTES_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> highNumberOfBytesUsed = column("HIGH_NUMBER_OF_BYTES_USED", JDBCType.BIGINT);

        public MemorySummaryByHostByEventName() {
            super("memory_summary_by_host_by_event_name");
        }
    }
}