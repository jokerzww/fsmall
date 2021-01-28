package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RwlockInstancesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    public static final RwlockInstances rwlockInstances = new RwlockInstances();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = rwlockInstances.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.NAME")
    public static final SqlColumn<String> name = rwlockInstances.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.WRITE_LOCKED_BY_THREAD_ID")
    public static final SqlColumn<Long> writeLockedByThreadId = rwlockInstances.writeLockedByThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source field: rwlock_instances.READ_LOCKED_BY_COUNT")
    public static final SqlColumn<Integer> readLockedByCount = rwlockInstances.readLockedByCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2759662+08:00", comments="Source Table: rwlock_instances")
    public static final class RwlockInstances extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> writeLockedByThreadId = column("WRITE_LOCKED_BY_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Integer> readLockedByCount = column("READ_LOCKED_BY_COUNT", JDBCType.INTEGER);

        public RwlockInstances() {
            super("rwlock_instances");
        }
    }
}