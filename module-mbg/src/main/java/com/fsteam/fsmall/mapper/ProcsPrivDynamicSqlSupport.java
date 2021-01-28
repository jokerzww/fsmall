package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProcsPrivDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    public static final ProcsPriv procsPriv = new ProcsPriv();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Host")
    public static final SqlColumn<String> host = procsPriv.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Db")
    public static final SqlColumn<String> db = procsPriv.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.User")
    public static final SqlColumn<String> user = procsPriv.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_name")
    public static final SqlColumn<String> routineName = procsPriv.routineName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Routine_type")
    public static final SqlColumn<String> routineType = procsPriv.routineType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Grantor")
    public static final SqlColumn<String> grantor = procsPriv.grantor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Proc_priv")
    public static final SqlColumn<String> procPriv = procsPriv.procPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source field: procs_priv.Timestamp")
    public static final SqlColumn<Date> timestamp = procsPriv.timestamp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5171861+08:00", comments="Source Table: procs_priv")
    public static final class ProcsPriv extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> db = column("Db", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<String> routineName = column("Routine_name", JDBCType.CHAR);

        public final SqlColumn<String> routineType = column("Routine_type", JDBCType.CHAR);

        public final SqlColumn<String> grantor = column("Grantor", JDBCType.VARCHAR);

        public final SqlColumn<String> procPriv = column("Proc_priv", JDBCType.CHAR);

        public final SqlColumn<Date> timestamp = column("Timestamp", JDBCType.TIMESTAMP);

        public ProcsPriv() {
            super("procs_priv");
        }
    }
}