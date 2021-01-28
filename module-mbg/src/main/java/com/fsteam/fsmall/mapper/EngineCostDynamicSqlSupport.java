package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EngineCostDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source Table: engine_cost")
    public static final EngineCost engineCost = new EngineCost();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.cost_name")
    public static final SqlColumn<String> costName = engineCost.costName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.engine_name")
    public static final SqlColumn<String> engineName = engineCost.engineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.device_type")
    public static final SqlColumn<Integer> deviceType = engineCost.deviceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.cost_value")
    public static final SqlColumn<Float> costValue = engineCost.costValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.last_update")
    public static final SqlColumn<Date> lastUpdate = engineCost.lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.comment")
    public static final SqlColumn<String> comment = engineCost.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source field: engine_cost.default_value")
    public static final SqlColumn<Float> defaultValue = engineCost.defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4761497+08:00", comments="Source Table: engine_cost")
    public static final class EngineCost extends SqlTable {
        public final SqlColumn<String> costName = column("cost_name", JDBCType.VARCHAR);

        public final SqlColumn<String> engineName = column("engine_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> deviceType = column("device_type", JDBCType.INTEGER);

        public final SqlColumn<Float> costValue = column("cost_value", JDBCType.REAL);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public final SqlColumn<String> comment = column("comment", JDBCType.VARCHAR);

        public final SqlColumn<Float> defaultValue = column("default_value", JDBCType.REAL);

        public EngineCost() {
            super("engine_cost");
        }
    }
}