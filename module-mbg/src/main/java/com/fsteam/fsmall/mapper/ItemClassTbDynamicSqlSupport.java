package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemClassTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7385643+08:00", comments="Source Table: item_class_tb")
    public static final ItemClassTb itemClassTb = new ItemClassTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7395629+08:00", comments="Source field: item_class_tb.id")
    public static final SqlColumn<Integer> id = itemClassTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7395629+08:00", comments="Source field: item_class_tb.mall_id")
    public static final SqlColumn<String> mallId = itemClassTb.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.741556+08:00", comments="Source field: item_class_tb.name")
    public static final SqlColumn<String> name = itemClassTb.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7425539+08:00", comments="Source field: item_class_tb.priority")
    public static final SqlColumn<Integer> priority = itemClassTb.priority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7385643+08:00", comments="Source Table: item_class_tb")
    public static final class ItemClassTb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> priority = column("priority", JDBCType.INTEGER);

        public ItemClassTb() {
            super("item_class_tb");
        }
    }
}