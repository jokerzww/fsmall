package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LogStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    public static final LogStatus logStatus = new LogStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.SERVER_UUID")
    public static final SqlColumn<String> serverUuid = logStatus.serverUuid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.LOCAL")
    public static final SqlColumn<String> local = logStatus.local;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.REPLICATION")
    public static final SqlColumn<String> replication = logStatus.replication;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source field: log_status.STORAGE_ENGINES")
    public static final SqlColumn<String> storageEngines = logStatus.storageEngines;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.163864+08:00", comments="Source Table: log_status")
    public static final class LogStatus extends SqlTable {
        public final SqlColumn<String> serverUuid = column("SERVER_UUID", JDBCType.CHAR);

        public final SqlColumn<String> local = column("LOCAL", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> replication = column("REPLICATION", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> storageEngines = column("STORAGE_ENGINES", JDBCType.LONGVARCHAR);

        public LogStatus() {
            super("log_status");
        }
    }
}