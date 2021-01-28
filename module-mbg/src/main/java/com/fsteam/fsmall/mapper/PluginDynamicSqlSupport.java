package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PluginDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: plugin")
    public static final Plugin plugin = new Plugin();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source field: plugin.name")
    public static final SqlColumn<String> name = plugin.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source field: plugin.dl")
    public static final SqlColumn<String> dl = plugin.dl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1838844+08:00", comments="Source Table: plugin")
    public static final class Plugin extends SqlTable {
        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> dl = column("dl", JDBCType.VARCHAR);

        public Plugin() {
            super("plugin");
        }
    }
}