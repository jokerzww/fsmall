package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source Table: db")
    public static final Db db = new Db();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Host")
    public static final SqlColumn<String> host = db.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.User")
    public static final SqlColumn<String> user = db.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Select_priv")
    public static final SqlColumn<String> selectPriv = db.selectPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Insert_priv")
    public static final SqlColumn<String> insertPriv = db.insertPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Update_priv")
    public static final SqlColumn<String> updatePriv = db.updatePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Delete_priv")
    public static final SqlColumn<String> deletePriv = db.deletePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Create_priv")
    public static final SqlColumn<String> createPriv = db.createPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Drop_priv")
    public static final SqlColumn<String> dropPriv = db.dropPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.Grant_priv")
    public static final SqlColumn<String> grantPriv = db.grantPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source field: db.References_priv")
    public static final SqlColumn<String> referencesPriv = db.referencesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Index_priv")
    public static final SqlColumn<String> indexPriv = db.indexPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Alter_priv")
    public static final SqlColumn<String> alterPriv = db.alterPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Create_tmp_table_priv")
    public static final SqlColumn<String> createTmpTablePriv = db.createTmpTablePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Lock_tables_priv")
    public static final SqlColumn<String> lockTablesPriv = db.lockTablesPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Create_view_priv")
    public static final SqlColumn<String> createViewPriv = db.createViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Show_view_priv")
    public static final SqlColumn<String> showViewPriv = db.showViewPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Create_routine_priv")
    public static final SqlColumn<String> createRoutinePriv = db.createRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Alter_routine_priv")
    public static final SqlColumn<String> alterRoutinePriv = db.alterRoutinePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Execute_priv")
    public static final SqlColumn<String> executePriv = db.executePriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Event_priv")
    public static final SqlColumn<String> eventPriv = db.eventPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3650479+08:00", comments="Source field: db.Trigger_priv")
    public static final SqlColumn<String> triggerPriv = db.triggerPriv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3640476+08:00", comments="Source Table: db")
    public static final class Db extends SqlTable {
        public final SqlColumn<String> host = column("Host", JDBCType.CHAR);

        public final SqlColumn<String> db = column("Db", JDBCType.CHAR);

        public final SqlColumn<String> user = column("User", JDBCType.CHAR);

        public final SqlColumn<String> selectPriv = column("Select_priv", JDBCType.CHAR);

        public final SqlColumn<String> insertPriv = column("Insert_priv", JDBCType.CHAR);

        public final SqlColumn<String> updatePriv = column("Update_priv", JDBCType.CHAR);

        public final SqlColumn<String> deletePriv = column("Delete_priv", JDBCType.CHAR);

        public final SqlColumn<String> createPriv = column("Create_priv", JDBCType.CHAR);

        public final SqlColumn<String> dropPriv = column("Drop_priv", JDBCType.CHAR);

        public final SqlColumn<String> grantPriv = column("Grant_priv", JDBCType.CHAR);

        public final SqlColumn<String> referencesPriv = column("References_priv", JDBCType.CHAR);

        public final SqlColumn<String> indexPriv = column("Index_priv", JDBCType.CHAR);

        public final SqlColumn<String> alterPriv = column("Alter_priv", JDBCType.CHAR);

        public final SqlColumn<String> createTmpTablePriv = column("Create_tmp_table_priv", JDBCType.CHAR);

        public final SqlColumn<String> lockTablesPriv = column("Lock_tables_priv", JDBCType.CHAR);

        public final SqlColumn<String> createViewPriv = column("Create_view_priv", JDBCType.CHAR);

        public final SqlColumn<String> showViewPriv = column("Show_view_priv", JDBCType.CHAR);

        public final SqlColumn<String> createRoutinePriv = column("Create_routine_priv", JDBCType.CHAR);

        public final SqlColumn<String> alterRoutinePriv = column("Alter_routine_priv", JDBCType.CHAR);

        public final SqlColumn<String> executePriv = column("Execute_priv", JDBCType.CHAR);

        public final SqlColumn<String> eventPriv = column("Event_priv", JDBCType.CHAR);

        public final SqlColumn<String> triggerPriv = column("Trigger_priv", JDBCType.CHAR);

        public Db() {
            super("db");
        }
    }
}