package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GtidExecutedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    public static final GtidExecuted gtidExecuted = new GtidExecuted();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: gtid_executed.source_uuid")
    public static final SqlColumn<String> sourceUuid = gtidExecuted.sourceUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: gtid_executed.interval_start")
    public static final SqlColumn<Long> intervalStart = gtidExecuted.intervalStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source field: gtid_executed.interval_end")
    public static final SqlColumn<Long> intervalEnd = gtidExecuted.intervalEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3300154+08:00", comments="Source Table: gtid_executed")
    public static final class GtidExecuted extends SqlTable {
        public final SqlColumn<String> sourceUuid = column("source_uuid", JDBCType.CHAR);

        public final SqlColumn<Long> intervalStart = column("interval_start", JDBCType.BIGINT);

        public final SqlColumn<Long> intervalEnd = column("interval_end", JDBCType.BIGINT);

        public GtidExecuted() {
            super("gtid_executed");
        }
    }
}