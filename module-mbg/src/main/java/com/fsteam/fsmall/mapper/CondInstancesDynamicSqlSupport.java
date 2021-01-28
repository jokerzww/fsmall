package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CondInstancesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    public static final CondInstances condInstances = new CondInstances();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = condInstances.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source field: cond_instances.NAME")
    public static final SqlColumn<String> name = condInstances.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5502164+08:00", comments="Source Table: cond_instances")
    public static final class CondInstances extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public CondInstances() {
            super("cond_instances");
        }
    }
}