package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HelpTopicDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    public static final HelpTopic helpTopic = new HelpTopic();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_topic_id")
    public static final SqlColumn<Integer> helpTopicId = helpTopic.helpTopicId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.name")
    public static final SqlColumn<String> name = helpTopic.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.help_category_id")
    public static final SqlColumn<Short> helpCategoryId = helpTopic.helpCategoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.description")
    public static final SqlColumn<String> description = helpTopic.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.example")
    public static final SqlColumn<String> example = helpTopic.example;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source field: help_topic.url")
    public static final SqlColumn<String> url = helpTopic.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1518528+08:00", comments="Source Table: help_topic")
    public static final class HelpTopic extends SqlTable {
        public final SqlColumn<Integer> helpTopicId = column("help_topic_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public final SqlColumn<Short> helpCategoryId = column("help_category_id", JDBCType.SMALLINT);

        public final SqlColumn<String> description = column("description", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> example = column("example", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.LONGVARCHAR);

        public HelpTopic() {
            super("help_topic");
        }
    }
}