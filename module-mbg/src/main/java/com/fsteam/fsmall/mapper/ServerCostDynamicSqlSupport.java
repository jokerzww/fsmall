package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ServerCostDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    public static final ServerCost serverCost = new ServerCost();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_name")
    public static final SqlColumn<String> costName = serverCost.costName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.cost_value")
    public static final SqlColumn<Float> costValue = serverCost.costValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.last_update")
    public static final SqlColumn<Date> lastUpdate = serverCost.lastUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.comment")
    public static final SqlColumn<String> comment = serverCost.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: server_cost.default_value")
    public static final SqlColumn<Float> defaultValue = serverCost.defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: server_cost")
    public static final class ServerCost extends SqlTable {
        public final SqlColumn<String> costName = column("cost_name", JDBCType.VARCHAR);

        public final SqlColumn<Float> costValue = column("cost_value", JDBCType.REAL);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public final SqlColumn<String> comment = column("comment", JDBCType.VARCHAR);

        public final SqlColumn<Float> defaultValue = column("default_value", JDBCType.REAL);

        public ServerCost() {
            super("server_cost");
        }
    }
}