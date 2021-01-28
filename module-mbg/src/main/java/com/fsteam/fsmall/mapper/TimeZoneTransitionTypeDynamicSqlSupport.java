package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TimeZoneTransitionTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    public static final TimeZoneTransitionType timeZoneTransitionType = new TimeZoneTransitionType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source field: time_zone_transition_type.Time_zone_id")
    public static final SqlColumn<Integer> timeZoneId = timeZoneTransitionType.timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source field: time_zone_transition_type.Transition_type_id")
    public static final SqlColumn<Integer> transitionTypeId = timeZoneTransitionType.transitionTypeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source field: time_zone_transition_type.Offset")
    public static final SqlColumn<Integer> offset = timeZoneTransitionType.offset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source field: time_zone_transition_type.Is_DST")
    public static final SqlColumn<Byte> isDst = timeZoneTransitionType.isDst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source field: time_zone_transition_type.Abbreviation")
    public static final SqlColumn<String> abbreviation = timeZoneTransitionType.abbreviation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4261042+08:00", comments="Source Table: time_zone_transition_type")
    public static final class TimeZoneTransitionType extends SqlTable {
        public final SqlColumn<Integer> timeZoneId = column("Time_zone_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> transitionTypeId = column("Transition_type_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> offset = column("Offset", JDBCType.INTEGER);

        public final SqlColumn<Byte> isDst = column("Is_DST", JDBCType.TINYINT);

        public final SqlColumn<String> abbreviation = column("Abbreviation", JDBCType.CHAR);

        public TimeZoneTransitionType() {
            super("time_zone_transition_type");
        }
    }
}