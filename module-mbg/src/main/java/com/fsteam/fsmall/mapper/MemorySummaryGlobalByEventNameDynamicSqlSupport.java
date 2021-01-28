package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemorySummaryGlobalByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source Table: memory_summary_global_by_event_name")
    public static final MemorySummaryGlobalByEventName memorySummaryGlobalByEventName = new MemorySummaryGlobalByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = memorySummaryGlobalByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.COUNT_ALLOC")
    public static final SqlColumn<Long> countAlloc = memorySummaryGlobalByEventName.countAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.COUNT_FREE")
    public static final SqlColumn<Long> countFree = memorySummaryGlobalByEventName.countFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC")
    public static final SqlColumn<Long> sumNumberOfBytesAlloc = memorySummaryGlobalByEventName.sumNumberOfBytesAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_FREE")
    public static final SqlColumn<Long> sumNumberOfBytesFree = memorySummaryGlobalByEventName.sumNumberOfBytesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.LOW_COUNT_USED")
    public static final SqlColumn<Long> lowCountUsed = memorySummaryGlobalByEventName.lowCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.CURRENT_COUNT_USED")
    public static final SqlColumn<Long> currentCountUsed = memorySummaryGlobalByEventName.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.HIGH_COUNT_USED")
    public static final SqlColumn<Long> highCountUsed = memorySummaryGlobalByEventName.highCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.LOW_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> lowNumberOfBytesUsed = memorySummaryGlobalByEventName.lowNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.CURRENT_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> currentNumberOfBytesUsed = memorySummaryGlobalByEventName.currentNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source field: memory_summary_global_by_event_name.HIGH_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> highNumberOfBytesUsed = memorySummaryGlobalByEventName.highNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4951661+08:00", comments="Source Table: memory_summary_global_by_event_name")
    public static final class MemorySummaryGlobalByEventName extends SqlTable {
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

        public MemorySummaryGlobalByEventName() {
            super("memory_summary_global_by_event_name");
        }
    }
}