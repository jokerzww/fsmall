package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SessionSslStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    public static final SessionSslStatus sessionSslStatus = new SessionSslStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.thread_id")
    public static final SqlColumn<Long> threadId = sessionSslStatus.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_version")
    public static final SqlColumn<String> sslVersion = sessionSslStatus.sslVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_cipher")
    public static final SqlColumn<String> sslCipher = sessionSslStatus.sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_sessions_reused")
    public static final SqlColumn<String> sslSessionsReused = sessionSslStatus.sslSessionsReused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    public static final class SessionSslStatus extends SqlTable {
        public final SqlColumn<Long> threadId = column("thread_id", JDBCType.BIGINT);

        public final SqlColumn<String> sslVersion = column("ssl_version", JDBCType.VARCHAR);

        public final SqlColumn<String> sslCipher = column("ssl_cipher", JDBCType.VARCHAR);

        public final SqlColumn<String> sslSessionsReused = column("ssl_sessions_reused", JDBCType.VARCHAR);

        public SessionSslStatus() {
            super("session_ssl_status");
        }
    }
}