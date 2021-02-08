package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9290701+08:00", comments="Source Table: item_list")
    public static final ItemList itemList = new ItemList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9290701+08:00", comments="Source field: item_list.id")
    public static final SqlColumn<Integer> id = itemList.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9290701+08:00", comments="Source field: item_list.order_id")
    public static final SqlColumn<Integer> orderId = itemList.orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.930071+08:00", comments="Source field: item_list.item_name")
    public static final SqlColumn<String> itemName = itemList.itemName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.930071+08:00", comments="Source field: item_list.item_number")
    public static final SqlColumn<Integer> itemNumber = itemList.itemNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.930071+08:00", comments="Source field: item_list.price")
    public static final SqlColumn<BigDecimal> price = itemList.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9290701+08:00", comments="Source Table: item_list")
    public static final class ItemList extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderId = column("order_id", JDBCType.INTEGER);

        public final SqlColumn<String> itemName = column("item_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> itemNumber = column("item_number", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public ItemList() {
            super("item_list");
        }
    }
}