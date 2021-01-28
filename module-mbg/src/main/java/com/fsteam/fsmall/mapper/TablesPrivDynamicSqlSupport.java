package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TablesPrivDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    public static final TablesPriv tablesPriv = new TablesPriv();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Host")
    public static final SqlColumn<String> host = tablesPriv.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Db")
    public static final SqlColumn<String> db = tablesPriv.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.User")
    public static final SqlColumn<String> user = tablesPriv.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Table_name")
    public static final SqlColumn<String> tableName = tablesPriv.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Grantor")
    public static final SqlColumn<String> grantor = tablesPriv.grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Timestamp")
    public static final SqlColumn<Date> timestamp = tablesPriv.timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Table_priv")
    public static final SqlColumn<String> tablePriv = tablesPriv.tablePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source field: tables_priv.Column_priv")
    public static final SqlColumn<String> columnPriv = tablesPriv.columnPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5301978+08:00", comments="Source Table: tables_priv")
    public static final class TablesPriv extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> db = column("Db", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<String> tableName = column("Table_name", JDBCType.CHAR);

        public final SqlColumn<String> grantor = column("Grantor", JDBCType.VARCHAR);

        public final SqlColumn<Date> timestamp = column("Timestamp", JDBCType.TIMESTAMP);

        public final SqlColumn<String> tablePriv = column("Table_priv", JDBCType.CHAR);

        public final SqlColumn<String> columnPriv = column("Column_priv", JDBCType.CHAR);

        public TablesPriv() {
            super("tables_priv");
        }
    }
}