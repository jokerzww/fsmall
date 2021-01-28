package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SetupObjectsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    public static final SetupObjects setupObjects = new SetupObjects();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = setupObjects.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = setupObjects.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.OBJECT_NAME")
    public static final SqlColumn<String> objectName = setupObjects.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.ENABLED")
    public static final SqlColumn<String> enabled = setupObjects.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source field: setup_objects.TIMED")
    public static final SqlColumn<String> timed = setupObjects.timed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2279247+08:00", comments="Source Table: setup_objects")
    public static final class SetupObjects extends SqlTable {
        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> enabled = column("ENABLED", JDBCType.CHAR);

        public final SqlColumn<String> timed = column("TIMED", JDBCType.CHAR);

        public SetupObjects() {
            super("setup_objects");
        }
    }
}