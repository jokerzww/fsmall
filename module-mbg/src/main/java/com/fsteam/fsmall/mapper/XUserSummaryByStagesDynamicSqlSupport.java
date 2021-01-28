package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XUserSummaryByStagesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1388406+08:00", comments="Source Table: x$user_summary_by_stages")
    public static final XUserSummaryByStages XUserSummaryByStages = new XUserSummaryByStages();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1398417+08:00", comments="Source field: x$user_summary_by_stages.user")
    public static final SqlColumn<String> user = XUserSummaryByStages.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1398417+08:00", comments="Source field: x$user_summary_by_stages.event_name")
    public static final SqlColumn<String> eventName = XUserSummaryByStages.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1398417+08:00", comments="Source field: x$user_summary_by_stages.total")
    public static final SqlColumn<Long> total = XUserSummaryByStages.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1398417+08:00", comments="Source field: x$user_summary_by_stages.total_latency")
    public static final SqlColumn<Long> totalLatency = XUserSummaryByStages.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1398417+08:00", comments="Source field: x$user_summary_by_stages.avg_latency")
    public static final SqlColumn<Long> avgLatency = XUserSummaryByStages.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1388406+08:00", comments="Source Table: x$user_summary_by_stages")
    public static final class XUserSummaryByStages extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

        public final SqlColumn<Long> avgLatency = column("avg_latency", JDBCType.BIGINT);

        public XUserSummaryByStages() {
            super("x$user_summary_by_stages");
        }
    }
}