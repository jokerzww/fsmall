package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InnodbForeignDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: INNODB_FOREIGN")
    public static final InnodbForeign innodbForeign = new InnodbForeign();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.ID")
    public static final SqlColumn<String> id = innodbForeign.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.FOR_NAME")
    public static final SqlColumn<String> forName = innodbForeign.forName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.REF_NAME")
    public static final SqlColumn<String> refName = innodbForeign.refName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.N_COLS")
    public static final SqlColumn<Long> nCols = innodbForeign.nCols;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source field: INNODB_FOREIGN.TYPE")
    public static final SqlColumn<Long> type = innodbForeign.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2449375+08:00", comments="Source Table: INNODB_FOREIGN")
    public static final class InnodbForeign extends SqlTable {
        public final SqlColumn<String> id = column("ID", JDBCType.VARCHAR);

        public final SqlColumn<String> forName = column("FOR_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> refName = column("REF_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> nCols = column("N_COLS", JDBCType.BIGINT);

        public final SqlColumn<Long> type = column("TYPE", JDBCType.BIGINT);

        public InnodbForeign() {
            super("INNODB_FOREIGN");
        }
    }
}