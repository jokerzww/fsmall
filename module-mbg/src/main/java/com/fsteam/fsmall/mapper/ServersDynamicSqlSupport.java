package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ServersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    public static final Servers servers = new Servers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Server_name")
    public static final SqlColumn<String> serverName = servers.serverName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Host")
    public static final SqlColumn<String> host = servers.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Db")
    public static final SqlColumn<String> db = servers.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Username")
    public static final SqlColumn<String> username = servers.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Password")
    public static final SqlColumn<String> password = servers.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Port")
    public static final SqlColumn<Integer> port = servers.port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Socket")
    public static final SqlColumn<String> socket = servers.socket;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Wrapper")
    public static final SqlColumn<String> wrapper = servers.wrapper;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source field: servers.Owner")
    public static final SqlColumn<String> owner = servers.owner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    public static final class Servers extends SqlTable {
        public final SqlColumn<String> serverName = column("Server_name", JDBCType.CHAR);

        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> db = column("Db", JDBCType.CHAR);

        public final SqlColumn<String> username = column("Username", JDBCType.CHAR);

        public final SqlColumn<String> password = column("Password", JDBCType.CHAR);

        public final SqlColumn<Integer> port = column("Port", JDBCType.INTEGER);

        public final SqlColumn<String> socket = column("Socket", JDBCType.CHAR);

        public final SqlColumn<String> wrapper = column("Wrapper", JDBCType.CHAR);

        public final SqlColumn<String> owner = column("Owner", JDBCType.CHAR);

        public Servers() {
            super("servers");
        }
    }
}