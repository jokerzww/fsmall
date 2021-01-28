package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SocketInstancesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    public static final SocketInstances socketInstances = new SocketInstances();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = socketInstances.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.EVENT_NAME")
    public static final SqlColumn<String> eventName = socketInstances.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.THREAD_ID")
    public static final SqlColumn<Long> threadId = socketInstances.threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.SOCKET_ID")
    public static final SqlColumn<Integer> socketId = socketInstances.socketId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.IP")
    public static final SqlColumn<String> ip = socketInstances.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.PORT")
    public static final SqlColumn<Integer> port = socketInstances.port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source field: socket_instances.STATE")
    public static final SqlColumn<String> state = socketInstances.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3310165+08:00", comments="Source Table: socket_instances")
    public static final class SocketInstances extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> threadId = column("THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Integer> socketId = column("SOCKET_ID", JDBCType.INTEGER);

        public final SqlColumn<String> ip = column("IP", JDBCType.VARCHAR);

        public final SqlColumn<Integer> port = column("PORT", JDBCType.INTEGER);

        public final SqlColumn<String> state = column("STATE", JDBCType.CHAR);

        public SocketInstances() {
            super("socket_instances");
        }
    }
}