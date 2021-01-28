package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TimeZoneDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    public static final TimeZone timeZone = new TimeZone();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Time_zone_id")
    public static final SqlColumn<Integer> timeZoneId = timeZone.timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source field: time_zone.Use_leap_seconds")
    public static final SqlColumn<String> useLeapSeconds = timeZone.useLeapSeconds;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4501248+08:00", comments="Source Table: time_zone")
    public static final class TimeZone extends SqlTable {
        public final SqlColumn<Integer> timeZoneId = column("Time_zone_id", JDBCType.INTEGER);

        public final SqlColumn<String> useLeapSeconds = column("Use_leap_seconds", JDBCType.CHAR);

        public TimeZone() {
            super("time_zone");
        }
    }
}