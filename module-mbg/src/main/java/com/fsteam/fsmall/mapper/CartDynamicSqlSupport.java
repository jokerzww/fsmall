package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CartDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source Table: cart")
    public static final Cart cart = new Cart();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source field: cart.id")
    public static final SqlColumn<Integer> id = cart.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source field: cart.mall_id")
    public static final SqlColumn<String> mallId = cart.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source field: cart.customer_id")
    public static final SqlColumn<String> customerId = cart.customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5198849+08:00", comments="Source field: cart.item_id")
    public static final SqlColumn<Integer> itemId = cart.itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5198849+08:00", comments="Source field: cart.number")
    public static final SqlColumn<Integer> number = cart.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5188846+08:00", comments="Source Table: cart")
    public static final class Cart extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<String> customerId = column("customer_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> itemId = column("item_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> number = column("number", JDBCType.INTEGER);

        public Cart() {
            super("cart");
        }
    }
}