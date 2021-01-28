package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PerformanceTimersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    public static final PerformanceTimers performanceTimers = new PerformanceTimers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_NAME")
    public static final SqlColumn<String> timerName = performanceTimers.timerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_FREQUENCY")
    public static final SqlColumn<Long> timerFrequency = performanceTimers.timerFrequency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_RESOLUTION")
    public static final SqlColumn<Long> timerResolution = performanceTimers.timerResolution;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source field: performance_timers.TIMER_OVERHEAD")
    public static final SqlColumn<Long> timerOverhead = performanceTimers.timerOverhead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4411168+08:00", comments="Source Table: performance_timers")
    public static final class PerformanceTimers extends SqlTable {
        public final SqlColumn<String> timerName = column("TIMER_NAME", JDBCType.CHAR);

        public final SqlColumn<Long> timerFrequency = column("TIMER_FREQUENCY", JDBCType.BIGINT);

        public final SqlColumn<Long> timerResolution = column("TIMER_RESOLUTION", JDBCType.BIGINT);

        public final SqlColumn<Long> timerOverhead = column("TIMER_OVERHEAD", JDBCType.BIGINT);

        public PerformanceTimers() {
            super("performance_timers");
        }
    }
}