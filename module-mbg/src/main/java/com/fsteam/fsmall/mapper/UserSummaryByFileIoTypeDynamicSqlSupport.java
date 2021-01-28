package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserSummaryByFileIoTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
    public static final UserSummaryByFileIoType userSummaryByFileIoType = new UserSummaryByFileIoType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.user")
    public static final SqlColumn<String> user = userSummaryByFileIoType.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.event_name")
    public static final SqlColumn<String> eventName = userSummaryByFileIoType.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.total")
    public static final SqlColumn<Long> total = userSummaryByFileIoType.total;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.latency")
    public static final SqlColumn<String> latency = userSummaryByFileIoType.latency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source field: user_summary_by_file_io_type.max_latency")
    public static final SqlColumn<String> maxLatency = userSummaryByFileIoType.maxLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
    public static final class UserSummaryByFileIoType extends SqlTable {
        public final SqlColumn<String> user = column("user", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("event_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> total = column("total", JDBCType.BIGINT);

        public final SqlColumn<String> latency = column("latency", JDBCType.VARCHAR);

        public final SqlColumn<String> maxLatency = column("max_latency", JDBCType.VARCHAR);

        public UserSummaryByFileIoType() {
            super("user_summary_by_file_io_type");
        }
    }
}