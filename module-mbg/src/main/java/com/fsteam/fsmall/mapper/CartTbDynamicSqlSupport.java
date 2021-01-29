package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CartTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6767308+08:00", comments="Source Table: cart_tb")
    public static final CartTb cartTb = new CartTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6847097+08:00", comments="Source field: cart_tb.id")
    public static final SqlColumn<Integer> id = cartTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6847097+08:00", comments="Source field: cart_tb.mall_id")
    public static final SqlColumn<String> mallId = cartTb.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6857071+08:00", comments="Source field: cart_tb.customer_id")
    public static final SqlColumn<String> customerId = cartTb.customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6857071+08:00", comments="Source field: cart_tb.item_id")
    public static final SqlColumn<Integer> itemId = cartTb.itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6857071+08:00", comments="Source field: cart_tb.number")
    public static final SqlColumn<Integer> number = cartTb.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6807282+08:00", comments="Source Table: cart_tb")
    public static final class CartTb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<String> customerId = column("customer_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> itemId = column("item_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> number = column("number", JDBCType.INTEGER);

        public CartTb() {
            super("cart_tb");
        }
    }
}