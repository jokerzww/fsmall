package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbFtBeingDeletedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1458474+08:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    public static final InnodbFtBeingDeleted innodbFtBeingDeleted = new InnodbFtBeingDeleted();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1458474+08:00", comments="Source field: INNODB_FT_BEING_DELETED.DOC_ID")
    public static final SqlColumn<Long> docId = innodbFtBeingDeleted.docId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1458474+08:00", comments="Source Table: INNODB_FT_BEING_DELETED")
    public static final class InnodbFtBeingDeleted extends SqlTable {
        public final SqlColumn<Long> docId = column("DOC_ID", JDBCType.BIGINT);

        public InnodbFtBeingDeleted() {
            super("INNODB_FT_BEING_DELETED");
        }
    }
}