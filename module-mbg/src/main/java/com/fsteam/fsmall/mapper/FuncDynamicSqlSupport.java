package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FuncDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    public static final Func func = new Func();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.name")
    public static final SqlColumn<String> name = func.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.ret")
    public static final SqlColumn<Byte> ret = func.ret;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.dl")
    public static final SqlColumn<String> dl = func.dl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source field: func.type")
    public static final SqlColumn<String> type = func.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    public static final class Func extends SqlTable {
        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public final SqlColumn<Byte> ret = column("ret", JDBCType.TINYINT);

        public final SqlColumn<String> dl = column("dl", JDBCType.CHAR);

        public final SqlColumn<String> type = column("type", JDBCType.CHAR);

        public Func() {
            super("func");
        }
    }
}