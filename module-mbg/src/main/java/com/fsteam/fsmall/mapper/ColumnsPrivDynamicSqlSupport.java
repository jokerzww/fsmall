package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ColumnsPrivDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1808799+08:00", comments="Source Table: columns_priv")
    public static final ColumnsPriv columnsPriv = new ColumnsPriv();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1808799+08:00", comments="Source field: columns_priv.Host")
    public static final SqlColumn<String> host = columnsPriv.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1808799+08:00", comments="Source field: columns_priv.Db")
    public static final SqlColumn<String> db = columnsPriv.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1808799+08:00", comments="Source field: columns_priv.User")
    public static final SqlColumn<String> user = columnsPriv.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source field: columns_priv.Table_name")
    public static final SqlColumn<String> tableName = columnsPriv.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source field: columns_priv.Column_name")
    public static final SqlColumn<String> columnName = columnsPriv.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source field: columns_priv.Timestamp")
    public static final SqlColumn<Date> timestamp = columnsPriv.timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.181882+08:00", comments="Source field: columns_priv.Column_priv")
    public static final SqlColumn<String> columnPriv = columnsPriv.columnPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1808799+08:00", comments="Source Table: columns_priv")
    public static final class ColumnsPriv extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> db = column("Db", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<String> tableName = column("Table_name", JDBCType.CHAR);

        public final SqlColumn<String> columnName = column("Column_name", JDBCType.CHAR);

        public final SqlColumn<Date> timestamp = column("Timestamp", JDBCType.TIMESTAMP);

        public final SqlColumn<String> columnPriv = column("Column_priv", JDBCType.CHAR);

        public ColumnsPriv() {
            super("columns_priv");
        }
    }
}