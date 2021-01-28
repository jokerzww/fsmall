package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SessionConnectAttrsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    public static final SessionConnectAttrs sessionConnectAttrs = new SessionConnectAttrs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.PROCESSLIST_ID")
    public static final SqlColumn<Long> processlistId = sessionConnectAttrs.processlistId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_NAME")
    public static final SqlColumn<String> attrName = sessionConnectAttrs.attrName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ATTR_VALUE")
    public static final SqlColumn<String> attrValue = sessionConnectAttrs.attrValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source field: session_connect_attrs.ORDINAL_POSITION")
    public static final SqlColumn<Integer> ordinalPosition = sessionConnectAttrs.ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    public static final class SessionConnectAttrs extends SqlTable {
        public final SqlColumn<Long> processlistId = column("PROCESSLIST_ID", JDBCType.BIGINT);

        public final SqlColumn<String> attrName = column("ATTR_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> attrValue = column("ATTR_VALUE", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ordinalPosition = column("ORDINAL_POSITION", JDBCType.INTEGER);

        public SessionConnectAttrs() {
            super("session_connect_attrs");
        }
    }
}