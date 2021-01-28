package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MutexInstancesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    public static final MutexInstances mutexInstances = new MutexInstances();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source field: mutex_instances.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = mutexInstances.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source field: mutex_instances.NAME")
    public static final SqlColumn<String> name = mutexInstances.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source field: mutex_instances.LOCKED_BY_THREAD_ID")
    public static final SqlColumn<Long> lockedByThreadId = mutexInstances.lockedByThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.119825+08:00", comments="Source Table: mutex_instances")
    public static final class MutexInstances extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> lockedByThreadId = column("LOCKED_BY_THREAD_ID", JDBCType.BIGINT);

        public MutexInstances() {
            super("mutex_instances");
        }
    }
}