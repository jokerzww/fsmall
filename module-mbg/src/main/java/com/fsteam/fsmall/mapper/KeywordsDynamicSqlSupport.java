package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class KeywordsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: KEYWORDS")
    public static final Keywords keywords = new Keywords();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.WORD")
    public static final SqlColumn<String> word = keywords.word;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source field: KEYWORDS.RESERVED")
    public static final SqlColumn<Integer> reserved = keywords.reserved;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2629541+08:00", comments="Source Table: KEYWORDS")
    public static final class Keywords extends SqlTable {
        public final SqlColumn<String> word = column("WORD", JDBCType.VARCHAR);

        public final SqlColumn<Integer> reserved = column("RESERVED", JDBCType.INTEGER);

        public Keywords() {
            super("KEYWORDS");
        }
    }
}