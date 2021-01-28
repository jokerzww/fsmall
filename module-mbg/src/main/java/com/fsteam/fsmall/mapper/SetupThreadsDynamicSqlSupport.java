package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SetupThreadsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    public static final SetupThreads setupThreads = new SetupThreads();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source field: setup_threads.NAME")
    public static final SqlColumn<String> name = setupThreads.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source field: setup_threads.ENABLED")
    public static final SqlColumn<String> enabled = setupThreads.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source field: setup_threads.HISTORY")
    public static final SqlColumn<String> history = setupThreads.history;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source field: setup_threads.PROPERTIES")
    public static final SqlColumn<String> properties = setupThreads.properties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source field: setup_threads.VOLATILITY")
    public static final SqlColumn<Integer> volatility = setupThreads.volatility;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source field: setup_threads.DOCUMENTATION")
    public static final SqlColumn<String> documentation = setupThreads.documentation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3840649+08:00", comments="Source Table: setup_threads")
    public static final class SetupThreads extends SqlTable {
        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> enabled = column("ENABLED", JDBCType.CHAR);

        public final SqlColumn<String> history = column("HISTORY", JDBCType.CHAR);

        public final SqlColumn<String> properties = column("PROPERTIES", JDBCType.CHAR);

        public final SqlColumn<Integer> volatility = column("VOLATILITY", JDBCType.INTEGER);

        public final SqlColumn<String> documentation = column("DOCUMENTATION", JDBCType.LONGVARCHAR);

        public SetupThreads() {
            super("setup_threads");
        }
    }
}