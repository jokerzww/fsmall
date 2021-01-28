package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemListTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1288322+08:00", comments="Source Table: item_list_tb")
    public static final ItemListTb itemListTb = new ItemListTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1288322+08:00", comments="Source field: item_list_tb.order_id")
    public static final SqlColumn<Integer> orderId = itemListTb.orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1288322+08:00", comments="Source field: item_list_tb.item_name")
    public static final SqlColumn<String> itemName = itemListTb.itemName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1288322+08:00", comments="Source field: item_list_tb.item_number")
    public static final SqlColumn<Integer> itemNumber = itemListTb.itemNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1288322+08:00", comments="Source field: item_list_tb.price")
    public static final SqlColumn<Long> price = itemListTb.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1288322+08:00", comments="Source Table: item_list_tb")
    public static final class ItemListTb extends SqlTable {
        public final SqlColumn<Integer> orderId = column("order_id", JDBCType.INTEGER);

        public final SqlColumn<String> itemName = column("item_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> itemNumber = column("item_number", JDBCType.INTEGER);

        public final SqlColumn<Long> price = column("price", JDBCType.DECIMAL);

        public ItemListTb() {
            super("item_list_tb");
        }
    }
}