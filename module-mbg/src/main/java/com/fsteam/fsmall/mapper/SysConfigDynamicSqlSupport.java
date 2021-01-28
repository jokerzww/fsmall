package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SysConfigDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    public static final SysConfig sysConfig = new SysConfig();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.variable")
    public static final SqlColumn<String> variable = sysConfig.variable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.value")
    public static final SqlColumn<String> value = sysConfig.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_time")
    public static final SqlColumn<Date> setTime = sysConfig.setTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source field: sys_config.set_by")
    public static final SqlColumn<String> setBy = sysConfig.setBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.427104+08:00", comments="Source Table: sys_config")
    public static final class SysConfig extends SqlTable {
        public final SqlColumn<String> variable = column("variable", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<Date> setTime = column("set_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> setBy = column("set_by", JDBCType.VARCHAR);

        public SysConfig() {
            super("sys_config");
        }
    }
}