package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SessionAccountConnectAttrsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: session_account_connect_attrs")
    public static final SessionAccountConnectAttrs sessionAccountConnectAttrs = new SessionAccountConnectAttrs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source field: session_account_connect_attrs.PROCESSLIST_ID")
    public static final SqlColumn<Long> processlistId = sessionAccountConnectAttrs.processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3240098+08:00", comments="Source field: session_account_connect_attrs.ATTR_NAME")
    public static final SqlColumn<String> attrName = sessionAccountConnectAttrs.attrName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3240098+08:00", comments="Source field: session_account_connect_attrs.ATTR_VALUE")
    public static final SqlColumn<String> attrValue = sessionAccountConnectAttrs.attrValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3240098+08:00", comments="Source field: session_account_connect_attrs.ORDINAL_POSITION")
    public static final SqlColumn<Integer> ordinalPosition = sessionAccountConnectAttrs.ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3230089+08:00", comments="Source Table: session_account_connect_attrs")
    public static final class SessionAccountConnectAttrs extends SqlTable {
        public final SqlColumn<Long> processlistId = column("PROCESSLIST_ID", JDBCType.BIGINT);

        public final SqlColumn<String> attrName = column("ATTR_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> attrValue = column("ATTR_VALUE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ordinalPosition = column("ORDINAL_POSITION", JDBCType.INTEGER);

        public SessionAccountConnectAttrs() {
            super("session_account_connect_attrs");
        }
    }
}