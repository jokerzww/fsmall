package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MetadataLocksDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source Table: metadata_locks")
    public static final MetadataLocks metadataLocks = new MetadataLocks();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = metadataLocks.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_TYPE")
    public static final SqlColumn<String> objectType = metadataLocks.objectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = metadataLocks.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OBJECT_NAME")
    public static final SqlColumn<String> objectName = metadataLocks.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.COLUMN_NAME")
    public static final SqlColumn<String> columnName = metadataLocks.columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_TYPE")
    public static final SqlColumn<String> lockType = metadataLocks.lockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_DURATION")
    public static final SqlColumn<String> lockDuration = metadataLocks.lockDuration;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.LOCK_STATUS")
    public static final SqlColumn<String> lockStatus = metadataLocks.lockStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.SOURCE")
    public static final SqlColumn<String> source = metadataLocks.source;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source field: metadata_locks.OWNER_THREAD_ID")
    public static final SqlColumn<Long> ownerThreadId = metadataLocks.ownerThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5231916+08:00", comments="Source field: metadata_locks.OWNER_EVENT_ID")
    public static final SqlColumn<Long> ownerEventId = metadataLocks.ownerEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.522191+08:00", comments="Source Table: metadata_locks")
    public static final class MetadataLocks extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> objectType = column("OBJECT_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> columnName = column("COLUMN_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> lockType = column("LOCK_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> lockDuration = column("LOCK_DURATION", JDBCType.VARCHAR);

        public final SqlColumn<String> lockStatus = column("LOCK_STATUS", JDBCType.VARCHAR);

        public final SqlColumn<String> source = column("SOURCE", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerThreadId = column("OWNER_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> ownerEventId = column("OWNER_EVENT_ID", JDBCType.BIGINT);

        public MetadataLocks() {
            super("metadata_locks");
        }
    }
}