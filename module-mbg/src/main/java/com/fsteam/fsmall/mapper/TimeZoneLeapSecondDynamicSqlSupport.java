package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TimeZoneLeapSecondDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    public static final TimeZoneLeapSecond timeZoneLeapSecond = new TimeZoneLeapSecond();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Transition_time")
    public static final SqlColumn<Long> transitionTime = timeZoneLeapSecond.transitionTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source field: time_zone_leap_second.Correction")
    public static final SqlColumn<Integer> correction = timeZoneLeapSecond.correction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1158234+08:00", comments="Source Table: time_zone_leap_second")
    public static final class TimeZoneLeapSecond extends SqlTable {
        public final SqlColumn<Long> transitionTime = column("Transition_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> correction = column("Correction", JDBCType.INTEGER);

        public TimeZoneLeapSecond() {
            super("time_zone_leap_second");
        }
    }
}