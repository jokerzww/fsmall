package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ObjectsSummaryGlobalByTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source Table: objects_summary_global_by_type")
    public static final ObjectsSummaryGlobalByType objectsSummaryGlobalByType = new ObjectsSummaryGlobalByType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = objectsSummaryGlobalByType.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = objectsSummaryGlobalByType.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source field: objects_summary_global_by_type.OBJECT_NAME")
    public static final SqlColumn<String> objectName = objectsSummaryGlobalByType.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source field: objects_summary_global_by_type.COUNT_STAR")
    public static final SqlColumn<Long> countStar = objectsSummaryGlobalByType.countStar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source field: objects_summary_global_by_type.SUM_TIMER_WAIT")
    public static final SqlColumn<Long> sumTimerWait = objectsSummaryGlobalByType.sumTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source field: objects_summary_global_by_type.MIN_TIMER_WAIT")
    public static final SqlColumn<Long> minTimerWait = objectsSummaryGlobalByType.minTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source field: objects_summary_global_by_type.AVG_TIMER_WAIT")
    public static final SqlColumn<Long> avgTimerWait = objectsSummaryGlobalByType.avgTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3200061+08:00", comments="Source field: objects_summary_global_by_type.MAX_TIMER_WAIT")
    public static final SqlColumn<Long> maxTimerWait = objectsSummaryGlobalByType.maxTimerWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3190053+08:00", comments="Source Table: objects_summary_global_by_type")
    public static final class ObjectsSummaryGlobalByType extends SqlTable {
        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> countStar = column("COUNT_STAR", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerWait = column("SUM_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerWait = column("MIN_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerWait = column("AVG_TIMER_WAIT", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerWait = column("MAX_TIMER_WAIT", JDBCType.BIGINT);

        public ObjectsSummaryGlobalByType() {
            super("objects_summary_global_by_type");
        }
    }
}