package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemaObjectOverviewDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    public static final SchemaObjectOverview schemaObjectOverview = new SchemaObjectOverview();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: schema_object_overview.db")
    public static final SqlColumn<String> db = schemaObjectOverview.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: schema_object_overview.object_type")
    public static final SqlColumn<String> objectType = schemaObjectOverview.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source field: schema_object_overview.count")
    public static final SqlColumn<Long> count = schemaObjectOverview.count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.199898+08:00", comments="Source Table: schema_object_overview")
    public static final class SchemaObjectOverview extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<String> objectType = column("object_type", JDBCType.VARCHAR);

        public final SqlColumn<Long> count = column("count", JDBCType.BIGINT);

        public SchemaObjectOverview() {
            super("schema_object_overview");
        }
    }
}