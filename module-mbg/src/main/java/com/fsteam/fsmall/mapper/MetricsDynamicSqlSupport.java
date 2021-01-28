package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MetricsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    public static final Metrics metrics = new Metrics();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_name")
    public static final SqlColumn<String> variableName = metrics.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Type")
    public static final SqlColumn<String> type = metrics.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Enabled")
    public static final SqlColumn<String> enabled = metrics.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source field: metrics.Variable_value")
    public static final SqlColumn<String> variableValue = metrics.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3810632+08:00", comments="Source Table: metrics")
    public static final class Metrics extends SqlTable {
        public final SqlColumn<String> variableName = column("Variable_name", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("Type", JDBCType.VARCHAR);

        public final SqlColumn<String> enabled = column("Enabled", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("Variable_value", JDBCType.LONGVARCHAR);

        public Metrics() {
            super("metrics");
        }
    }
}