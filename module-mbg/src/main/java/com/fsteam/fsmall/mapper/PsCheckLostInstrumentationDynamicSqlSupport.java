package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PsCheckLostInstrumentationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    public static final PsCheckLostInstrumentation psCheckLostInstrumentation = new PsCheckLostInstrumentation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source field: ps_check_lost_instrumentation.variable_name")
    public static final SqlColumn<String> variableName = psCheckLostInstrumentation.variableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source field: ps_check_lost_instrumentation.variable_value")
    public static final SqlColumn<String> variableValue = psCheckLostInstrumentation.variableValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: ps_check_lost_instrumentation")
    public static final class PsCheckLostInstrumentation extends SqlTable {
        public final SqlColumn<String> variableName = column("variable_name", JDBCType.VARCHAR);

        public final SqlColumn<String> variableValue = column("variable_value", JDBCType.VARCHAR);

        public PsCheckLostInstrumentation() {
            super("ps_check_lost_instrumentation");
        }
    }
}