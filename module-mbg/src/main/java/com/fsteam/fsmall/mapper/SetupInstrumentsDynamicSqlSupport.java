package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SetupInstrumentsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    public static final SetupInstruments setupInstruments = new SetupInstruments();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.NAME")
    public static final SqlColumn<String> name = setupInstruments.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.ENABLED")
    public static final SqlColumn<String> enabled = setupInstruments.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.TIMED")
    public static final SqlColumn<String> timed = setupInstruments.timed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.PROPERTIES")
    public static final SqlColumn<String> properties = setupInstruments.properties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.VOLATILITY")
    public static final SqlColumn<Integer> volatility = setupInstruments.volatility;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source field: setup_instruments.DOCUMENTATION")
    public static final SqlColumn<String> documentation = setupInstruments.documentation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2229176+08:00", comments="Source Table: setup_instruments")
    public static final class SetupInstruments extends SqlTable {
        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> enabled = column("ENABLED", JDBCType.CHAR);

        public final SqlColumn<String> timed = column("TIMED", JDBCType.CHAR);

        public final SqlColumn<String> properties = column("PROPERTIES", JDBCType.CHAR);

        public final SqlColumn<Integer> volatility = column("VOLATILITY", JDBCType.INTEGER);

        public final SqlColumn<String> documentation = column("DOCUMENTATION", JDBCType.LONGVARCHAR);

        public SetupInstruments() {
            super("setup_instruments");
        }
    }
}