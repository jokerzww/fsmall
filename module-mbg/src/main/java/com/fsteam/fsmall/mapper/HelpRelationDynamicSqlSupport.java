package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HelpRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    public static final HelpRelation helpRelation = new HelpRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_keyword_id")
    public static final SqlColumn<Integer> helpKeywordId = helpRelation.helpKeywordId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: help_relation.help_topic_id")
    public static final SqlColumn<Integer> helpTopicId = helpRelation.helpTopicId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: help_relation")
    public static final class HelpRelation extends SqlTable {
        public final SqlColumn<Integer> helpKeywordId = column("help_keyword_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> helpTopicId = column("help_topic_id", JDBCType.INTEGER);

        public HelpRelation() {
            super("help_relation");
        }
    }
}