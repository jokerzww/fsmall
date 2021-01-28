package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HelpCategoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    public static final HelpCategory helpCategory = new HelpCategory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: help_category.help_category_id")
    public static final SqlColumn<Short> helpCategoryId = helpCategory.helpCategoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: help_category.name")
    public static final SqlColumn<String> name = helpCategory.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: help_category.parent_category_id")
    public static final SqlColumn<Short> parentCategoryId = helpCategory.parentCategoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: help_category.url")
    public static final SqlColumn<String> url = helpCategory.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: help_category")
    public static final class HelpCategory extends SqlTable {
        public final SqlColumn<Short> helpCategoryId = column("help_category_id", JDBCType.SMALLINT);

        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public final SqlColumn<Short> parentCategoryId = column("parent_category_id", JDBCType.SMALLINT);

        public final SqlColumn<String> url = column("url", JDBCType.LONGVARCHAR);

        public HelpCategory() {
            super("help_category");
        }
    }
}