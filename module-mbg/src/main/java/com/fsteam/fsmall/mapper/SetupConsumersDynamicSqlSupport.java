package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SetupConsumersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    public static final SetupConsumers setupConsumers = new SetupConsumers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.NAME")
    public static final SqlColumn<String> name = setupConsumers.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source field: setup_consumers.ENABLED")
    public static final SqlColumn<String> enabled = setupConsumers.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    public static final class SetupConsumers extends SqlTable {
        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> enabled = column("ENABLED", JDBCType.CHAR);

        public SetupConsumers() {
            super("setup_consumers");
        }
    }
}