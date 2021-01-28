package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SetupActorsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    public static final SetupActors setupActors = new SetupActors();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HOST")
    public static final SqlColumn<String> host = setupActors.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.USER")
    public static final SqlColumn<String> user = setupActors.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ROLE")
    public static final SqlColumn<String> role = setupActors.role;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.ENABLED")
    public static final SqlColumn<String> enabled = setupActors.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source field: setup_actors.HISTORY")
    public static final SqlColumn<String> history = setupActors.history;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2239187+08:00", comments="Source Table: setup_actors")
    public static final class SetupActors extends SqlTable {
        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> role = column("ROLE", JDBCType.CHAR);

        public final SqlColumn<String> enabled = column("ENABLED", JDBCType.CHAR);

        public final SqlColumn<String> history = column("HISTORY", JDBCType.CHAR);

        public SetupActors() {
            super("setup_actors");
        }
    }
}