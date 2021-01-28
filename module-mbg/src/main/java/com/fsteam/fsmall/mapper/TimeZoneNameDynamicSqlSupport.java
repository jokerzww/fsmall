package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TimeZoneNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: time_zone_name")
    public static final TimeZoneName timeZoneName = new TimeZoneName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source field: time_zone_name.Name")
    public static final SqlColumn<String> name = timeZoneName.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source field: time_zone_name.Time_zone_id")
    public static final SqlColumn<Integer> timeZoneId = timeZoneName.timeZoneId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2009001+08:00", comments="Source Table: time_zone_name")
    public static final class TimeZoneName extends SqlTable {
        public final SqlColumn<String> name = column("Name", JDBCType.CHAR);

        public final SqlColumn<Integer> timeZoneId = column("Time_zone_id", JDBCType.INTEGER);

        public TimeZoneName() {
            super("time_zone_name");
        }
    }
}