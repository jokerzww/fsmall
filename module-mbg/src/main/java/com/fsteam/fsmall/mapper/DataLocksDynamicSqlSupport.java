package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DataLocksDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
    public static final DataLocks dataLocks = new DataLocks();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_LOCK_ID")
    public static final SqlColumn<String> engineLockId = dataLocks.engineLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE")
    public static final SqlColumn<String> engine = dataLocks.engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.ENGINE_TRANSACTION_ID")
    public static final SqlColumn<Long> engineTransactionId = dataLocks.engineTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.THREAD_ID")
    public static final SqlColumn<Long> threadId = dataLocks.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.EVENT_ID")
    public static final SqlColumn<Long> eventId = dataLocks.eventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_SCHEMA")
    public static final SqlColumn<String> objectSchema = dataLocks.objectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_NAME")
    public static final SqlColumn<String> objectName = dataLocks.objectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.PARTITION_NAME")
    public static final SqlColumn<String> partitionName = dataLocks.partitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.SUBPARTITION_NAME")
    public static final SqlColumn<String> subpartitionName = dataLocks.subpartitionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.INDEX_NAME")
    public static final SqlColumn<String> indexName = dataLocks.indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = dataLocks.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_TYPE")
    public static final SqlColumn<String> lockType = dataLocks.lockType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_MODE")
    public static final SqlColumn<String> lockMode = dataLocks.lockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_STATUS")
    public static final SqlColumn<String> lockStatus = dataLocks.lockStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source field: data_locks.LOCK_DATA")
    public static final SqlColumn<String> lockData = dataLocks.lockData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5011712+08:00", comments="Source Table: data_locks")
    public static final class DataLocks extends SqlTable {
        public final SqlColumn<String> engineLockId = column("ENGINE_LOCK_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> engine = column("ENGINE", JDBCType.VARCHAR);

        public final SqlColumn<Long> engineTransactionId = column("ENGINE_TRANSACTION_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> eventId = column("EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> objectSchema = column("OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> objectName = column("OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> partitionName = column("PARTITION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> subpartitionName = column("SUBPARTITION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> indexName = column("INDEX_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> lockType = column("LOCK_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> lockMode = column("LOCK_MODE", JDBCType.VARCHAR);

        public final SqlColumn<String> lockStatus = column("LOCK_STATUS", JDBCType.VARCHAR);

        public final SqlColumn<String> lockData = column("LOCK_DATA", JDBCType.VARCHAR);

        public DataLocks() {
            super("data_locks");
        }
    }
}