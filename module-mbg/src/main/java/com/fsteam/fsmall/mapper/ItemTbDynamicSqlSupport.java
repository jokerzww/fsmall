package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2399978+08:00", comments="Source Table: item_tb")
    public static final ItemTb itemTb = new ItemTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2399978+08:00", comments="Source field: item_tb.id")
    public static final SqlColumn<Integer> id = itemTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.mall_id")
    public static final SqlColumn<String> mallId = itemTb.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.item_class_id")
    public static final SqlColumn<Integer> itemClassId = itemTb.itemClassId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.icon_id")
    public static final SqlColumn<Integer> iconId = itemTb.iconId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.status")
    public static final SqlColumn<Integer> status = itemTb.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.priority")
    public static final SqlColumn<Integer> priority = itemTb.priority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.name")
    public static final SqlColumn<String> name = itemTb.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2409955+08:00", comments="Source field: item_tb.description")
    public static final SqlColumn<String> description = itemTb.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2419927+08:00", comments="Source field: item_tb.sale_volume")
    public static final SqlColumn<Integer> saleVolume = itemTb.saleVolume;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2419927+08:00", comments="Source field: item_tb.price")
    public static final SqlColumn<BigDecimal> price = itemTb.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2419927+08:00", comments="Source field: item_tb.unit")
    public static final SqlColumn<String> unit = itemTb.unit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2399978+08:00", comments="Source Table: item_tb")
    public static final class ItemTb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> itemClassId = column("item_class_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> iconId = column("icon_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> priority = column("priority", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Integer> saleVolume = column("sale_volume", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<String> unit = column("unit", JDBCType.VARCHAR);

        public ItemTb() {
            super("item_tb");
        }
    }
}