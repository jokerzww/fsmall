package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DataLockWaitsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source Table: data_lock_waits")
    public static final DataLockWaits dataLockWaits = new DataLockWaits();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.ENGINE")
    public static final SqlColumn<String> engine = dataLockWaits.engine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_LOCK_ID")
    public static final SqlColumn<String> requestingEngineLockId = dataLockWaits.requestingEngineLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID")
    public static final SqlColumn<Long> requestingEngineTransactionId = dataLockWaits.requestingEngineTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source field: data_lock_waits.REQUESTING_THREAD_ID")
    public static final SqlColumn<Long> requestingThreadId = dataLockWaits.requestingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.REQUESTING_EVENT_ID")
    public static final SqlColumn<Long> requestingEventId = dataLockWaits.requestingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> requestingObjectInstanceBegin = dataLockWaits.requestingObjectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_LOCK_ID")
    public static final SqlColumn<String> blockingEngineLockId = dataLockWaits.blockingEngineLockId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID")
    public static final SqlColumn<Long> blockingEngineTransactionId = dataLockWaits.blockingEngineTransactionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.BLOCKING_THREAD_ID")
    public static final SqlColumn<Long> blockingThreadId = dataLockWaits.blockingThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.BLOCKING_EVENT_ID")
    public static final SqlColumn<Long> blockingEventId = dataLockWaits.blockingEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1118187+08:00", comments="Source field: data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> blockingObjectInstanceBegin = dataLockWaits.blockingObjectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1108165+08:00", comments="Source Table: data_lock_waits")
    public static final class DataLockWaits extends SqlTable {
        public final SqlColumn<String> engine = column("ENGINE", JDBCType.VARCHAR);

        public final SqlColumn<String> requestingEngineLockId = column("REQUESTING_ENGINE_LOCK_ID", JDBCType.VARCHAR);

        public final SqlColumn<Long> requestingEngineTransactionId = column("REQUESTING_ENGINE_TRANSACTION_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> requestingThreadId = column("REQUESTING_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> requestingEventId = column("REQUESTING_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> requestingObjectInstanceBegin = column("REQUESTING_OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> blockingEngineLockId = column("BLOCKING_ENGINE_LOCK_ID", JDBCType.VARCHAR);

        public final SqlColumn<Long> blockingEngineTransactionId = column("BLOCKING_ENGINE_TRANSACTION_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingThreadId = column("BLOCKING_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingEventId = column("BLOCKING_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> blockingObjectInstanceBegin = column("BLOCKING_OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public DataLockWaits() {
            super("data_lock_waits");
        }
    }
}