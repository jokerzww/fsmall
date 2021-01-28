package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HelpKeywordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: help_keyword")
    public static final HelpKeyword helpKeyword = new HelpKeyword();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: help_keyword.help_keyword_id")
    public static final SqlColumn<Integer> helpKeywordId = helpKeyword.helpKeywordId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source field: help_keyword.name")
    public static final SqlColumn<String> name = helpKeyword.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2319259+08:00", comments="Source Table: help_keyword")
    public static final class HelpKeyword extends SqlTable {
        public final SqlColumn<Integer> helpKeywordId = column("help_keyword_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public HelpKeyword() {
            super("help_keyword");
        }
    }
}