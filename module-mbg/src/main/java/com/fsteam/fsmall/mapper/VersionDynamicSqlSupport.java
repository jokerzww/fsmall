package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VersionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    public static final Version version = new Version();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.sys_version")
    public static final SqlColumn<String> sysVersion = version.sysVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source field: version.mysql_version")
    public static final SqlColumn<String> mysqlVersion = version.mysqlVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    public static final class Version extends SqlTable {
        public final SqlColumn<String> sysVersion = column("sys_version", JDBCType.VARCHAR);

        public final SqlColumn<String> mysqlVersion = column("mysql_version", JDBCType.VARCHAR);

        public Version() {
            super("version");
        }
    }
}