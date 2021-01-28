package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserSummaryByStagesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source Table: user_summary_by_stages")
    public static final UserSummaryByStages userSummaryByStages = new UserSummaryByStages();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source field: user_summary_by_stages.user")
    public static final SqlColumn<String> user = userSummaryByStages.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source field: user_summary_by_stages.event_name")
    public static final SqlColumn<String> eventName = userSummaryByStages.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source field: user_summary_by_stages.total")
    public static final SqlColumn<Long> total = userSummaryByStages.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source field: user_summary_by_stages.total_latency")
    public static final SqlColumn<String> totalLatency = userSummaryByStages.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source field: user_summary_by_stages.avg_latency")
    public static final SqlColumn<String> avgLatency = userSummaryByStages.avgLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.150852+08:00", comments="Source Table: user_summary_by_stages")
    public static final class UserSummaryByStages extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<String> avgLatency = column("avg_latency", JDBCType.VARCHAR);

        public UserSummaryByStages() {
            super("user_summary_by_stages");
        }
    }
}