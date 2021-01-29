package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.4972151+08:00", comments="Source Table: order_tb")
    public static final OrderTb orderTb = new OrderTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5041914+08:00", comments="Source field: order_tb.id")
    public static final SqlColumn<Integer> id = orderTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5051893+08:00", comments="Source field: order_tb.mall_id")
    public static final SqlColumn<String> mallId = orderTb.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5051893+08:00", comments="Source field: order_tb.customer_id")
    public static final SqlColumn<String> customerId = orderTb.customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5051893+08:00", comments="Source field: order_tb.mall_name")
    public static final SqlColumn<String> mallName = orderTb.mallName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5061862+08:00", comments="Source field: order_tb.price")
    public static final SqlColumn<Long> price = orderTb.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5061862+08:00", comments="Source field: order_tb.status")
    public static final SqlColumn<String> status = orderTb.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5071838+08:00", comments="Source field: order_tb.time")
    public static final SqlColumn<Date> time = orderTb.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5071838+08:00", comments="Source field: order_tb.customer_name")
    public static final SqlColumn<String> customerName = orderTb.customerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5071838+08:00", comments="Source field: order_tb.customer_addr")
    public static final SqlColumn<String> customerAddr = orderTb.customerAddr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5081805+08:00", comments="Source field: order_tb.customer_phone")
    public static final SqlColumn<String> customerPhone = orderTb.customerPhone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5091916+08:00", comments="Source field: order_tb.note")
    public static final SqlColumn<String> note = orderTb.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5041914+08:00", comments="Source Table: order_tb")
    public static final class OrderTb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<String> customerId = column("customer_id", JDBCType.VARCHAR);

        public final SqlColumn<String> mallName = column("mall_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> customerName = column("customer_name", JDBCType.VARCHAR);

        public final SqlColumn<String> customerAddr = column("customer_addr", JDBCType.VARCHAR);

        public final SqlColumn<String> customerPhone = column("customer_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public OrderTb() {
            super("order_tb");
        }
    }
}