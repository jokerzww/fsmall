package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProxiesPrivDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    public static final ProxiesPriv proxiesPriv = new ProxiesPriv();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.Host")
    public static final SqlColumn<String> host = proxiesPriv.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.User")
    public static final SqlColumn<String> user = proxiesPriv.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.Proxied_host")
    public static final SqlColumn<String> proxiedHost = proxiesPriv.proxiedHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.Proxied_user")
    public static final SqlColumn<String> proxiedUser = proxiesPriv.proxiedUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.With_grant")
    public static final SqlColumn<Boolean> withGrant = proxiesPriv.withGrant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.Grantor")
    public static final SqlColumn<String> grantor = proxiesPriv.grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source field: proxies_priv.Timestamp")
    public static final SqlColumn<Date> timestamp = proxiesPriv.timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5321997+08:00", comments="Source Table: proxies_priv")
    public static final class ProxiesPriv extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<String> proxiedHost = column("Proxied_host", JDBCType.CHAR);

        public final SqlColumn<String> proxiedUser = column("Proxied_user", JDBCType.CHAR);

        public final SqlColumn<Boolean> withGrant = column("With_grant", JDBCType.BIT);

        public final SqlColumn<String> grantor = column("Grantor", JDBCType.VARCHAR);

        public final SqlColumn<Date> timestamp = column("Timestamp", JDBCType.TIMESTAMP);

        public ProxiesPriv() {
            super("proxies_priv");
        }
    }
}