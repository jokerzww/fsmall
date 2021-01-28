package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class KeyringKeysDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    public static final KeyringKeys keyringKeys = new KeyringKeys();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_ID")
    public static final SqlColumn<String> keyId = keyringKeys.keyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.KEY_OWNER")
    public static final SqlColumn<String> keyOwner = keyringKeys.keyOwner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source field: keyring_keys.BACKEND_KEY_ID")
    public static final SqlColumn<String> backendKeyId = keyringKeys.backendKeyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1058109+08:00", comments="Source Table: keyring_keys")
    public static final class KeyringKeys extends SqlTable {
        public final SqlColumn<String> keyId = column("KEY_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> keyOwner = column("KEY_OWNER", JDBCType.VARCHAR);

        public final SqlColumn<String> backendKeyId = column("BACKEND_KEY_ID", JDBCType.VARCHAR);

        public KeyringKeys() {
            super("keyring_keys");
        }
    }
}