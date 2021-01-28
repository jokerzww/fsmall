package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TableHandlesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    public static final TableHandles tableHandles = new TableHandles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = tableHandles.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = tableHandles.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = tableHandles.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.OBJECT_NAME")
    public static final SqlColumn<String> objectName = tableHandles.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.OWNER_THREAD_ID")
    public static final SqlColumn<Long> ownerThreadId = tableHandles.ownerThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.OWNER_EVENT_ID")
    public static final SqlColumn<Long> ownerEventId = tableHandles.ownerEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.INTERNAL_LOCK")
    public static final SqlColumn<String> internalLock = tableHandles.internalLock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source field: table_handles.EXTERNAL_LOCK")
    public static final SqlColumn<String> externalLock = tableHandles.externalLock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4541284+08:00", comments="Source Table: table_handles")
    public static final class TableHandles extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerThreadId = column("OWNER_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> ownerEventId = column("OWNER_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> internalLock = column("INTERNAL_LOCK", JDBCType.VARCHAR);

        public final SqlColumn<String> externalLock = column("EXTERNAL_LOCK", JDBCType.VARCHAR);

        public TableHandles() {
            super("table_handles");
        }
    }
}