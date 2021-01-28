package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileInstancesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source Table: file_instances")
    public static final FileInstances fileInstances = new FileInstances();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: file_instances.FILE_NAME")
    public static final SqlColumn<String> fileName = fileInstances.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: file_instances.EVENT_NAME")
    public static final SqlColumn<String> eventName = fileInstances.eventName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5271952+08:00", comments="Source field: file_instances.OPEN_COUNT")
    public static final SqlColumn<Integer> openCount = fileInstances.openCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5261943+08:00", comments="Source Table: file_instances")
    public static final class FileInstances extends SqlTable {
        public final SqlColumn<String> fileName = column("FILE_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> eventName = column("EVENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Integer> openCount = column("OPEN_COUNT", JDBCType.INTEGER);

        public FileInstances() {
            super("file_instances");
        }
    }
}