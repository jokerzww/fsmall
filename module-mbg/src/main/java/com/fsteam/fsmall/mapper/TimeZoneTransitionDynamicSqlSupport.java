package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TimeZoneTransitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    public static final TimeZoneTransition timeZoneTransition = new TimeZoneTransition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Time_zone_id")
    public static final SqlColumn<Integer> timeZoneId = timeZoneTransition.timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_time")
    public static final SqlColumn<Long> transitionTime = timeZoneTransition.transitionTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source field: time_zone_transition.Transition_type_id")
    public static final SqlColumn<Integer> transitionTypeId = timeZoneTransition.transitionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: time_zone_transition")
    public static final class TimeZoneTransition extends SqlTable {
        public final SqlColumn<Integer> timeZoneId = column("Time_zone_id", JDBCType.INTEGER);

        public final SqlColumn<Long> transitionTime = column("Transition_time", JDBCType.BIGINT);

        public final SqlColumn<Integer> transitionTypeId = column("Transition_type_id", JDBCType.INTEGER);

        public TimeZoneTransition() {
            super("time_zone_transition");
        }
    }
}