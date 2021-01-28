package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MemorySummaryByUserByEventNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    public static final MemorySummaryByUserByEventName memorySummaryByUserByEventName = new MemorySummaryByUserByEventName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source field: memory_summary_by_user_by_event_name.USER")
    public static final SqlColumn<String> user = memorySummaryByUserByEventName.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.EVENT_NAME")
    public static final SqlColumn<String> eventName = memorySummaryByUserByEventName.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_ALLOC")
    public static final SqlColumn<Long> countAlloc = memorySummaryByUserByEventName.countAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.COUNT_FREE")
    public static final SqlColumn<Long> countFree = memorySummaryByUserByEventName.countFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC")
    public static final SqlColumn<Long> sumNumberOfBytesAlloc = memorySummaryByUserByEventName.sumNumberOfBytesAlloc;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE")
    public static final SqlColumn<Long> sumNumberOfBytesFree = memorySummaryByUserByEventName.sumNumberOfBytesFree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_COUNT_USED")
    public static final SqlColumn<Long> lowCountUsed = memorySummaryByUserByEventName.lowCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_COUNT_USED")
    public static final SqlColumn<Long> currentCountUsed = memorySummaryByUserByEventName.currentCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_COUNT_USED")
    public static final SqlColumn<Long> highCountUsed = memorySummaryByUserByEventName.highCountUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> lowNumberOfBytesUsed = memorySummaryByUserByEventName.lowNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> currentNumberOfBytesUsed = memorySummaryByUserByEventName.currentNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1028093+08:00", comments="Source field: memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED")
    public static final SqlColumn<Long> highNumberOfBytesUsed = memorySummaryByUserByEventName.highNumberOfBytesUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1018076+08:00", comments="Source Table: memory_summary_by_user_by_event_name")
    public static final class MemorySummaryByUserByEventName extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

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

        public MemorySummaryByUserByEventName() {
            super("memory_summary_by_user_by_event_name");
        }
    }
}