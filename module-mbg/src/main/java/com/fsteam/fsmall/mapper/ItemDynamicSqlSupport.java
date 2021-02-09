package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source Table: item")
    public static final Item item = new Item();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.id")
    public static final SqlColumn<Integer> id = item.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source field: item.mall_id")
    public static final SqlColumn<String> mallId = item.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.item_class_id")
    public static final SqlColumn<Integer> itemClassId = item.itemClassId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.icon_id")
    public static final SqlColumn<Integer> iconId = item.iconId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.status")
    public static final SqlColumn<Integer> status = item.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.priority")
    public static final SqlColumn<Integer> priority = item.priority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.name")
    public static final SqlColumn<String> name = item.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.description")
    public static final SqlColumn<String> description = item.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5238897+08:00", comments="Source field: item.sale_volume")
    public static final SqlColumn<Integer> saleVolume = item.saleVolume;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5248894+08:00", comments="Source field: item.price")
    public static final SqlColumn<BigDecimal> price = item.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5248894+08:00", comments="Source field: item.unit")
    public static final SqlColumn<String> unit = item.unit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5228883+08:00", comments="Source Table: item")
    public static final class Item extends SqlTable {
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

        public Item() {
            super("item");
        }
    }
}