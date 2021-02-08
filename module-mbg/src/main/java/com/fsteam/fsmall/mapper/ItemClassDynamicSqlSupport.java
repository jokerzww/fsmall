package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemClassDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9250661+08:00", comments="Source Table: item_class")
    public static final ItemClass itemClass = new ItemClass();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9250661+08:00", comments="Source field: item_class.id")
    public static final SqlColumn<Integer> id = itemClass.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9260681+08:00", comments="Source field: item_class.mall_id")
    public static final SqlColumn<String> mallId = itemClass.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9260681+08:00", comments="Source field: item_class.name")
    public static final SqlColumn<String> name = itemClass.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9260681+08:00", comments="Source field: item_class.priority")
    public static final SqlColumn<Integer> priority = itemClass.priority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9250661+08:00", comments="Source Table: item_class")
    public static final class ItemClass extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> priority = column("priority", JDBCType.INTEGER);

        public ItemClass() {
            super("item_class");
        }
    }
}