package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source Table: order")
    public static final Order order = new Order();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source field: order.id")
    public static final SqlColumn<Integer> id = order.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5068732+08:00", comments="Source field: order.mall_id")
    public static final SqlColumn<String> mallId = order.mallId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5068732+08:00", comments="Source field: order.customer_id")
    public static final SqlColumn<String> customerId = order.customerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5068732+08:00", comments="Source field: order.mall_name")
    public static final SqlColumn<String> mallName = order.mallName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5068732+08:00", comments="Source field: order.price")
    public static final SqlColumn<BigDecimal> price = order.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5068732+08:00", comments="Source field: order.status")
    public static final SqlColumn<String> status = order.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5068732+08:00", comments="Source field: order.time")
    public static final SqlColumn<LocalDateTime> time = order.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5078743+08:00", comments="Source field: order.customer_name")
    public static final SqlColumn<String> customerName = order.customerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5078743+08:00", comments="Source field: order.customer_addr")
    public static final SqlColumn<String> customerAddr = order.customerAddr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5078743+08:00", comments="Source field: order.customer_phone")
    public static final SqlColumn<String> customerPhone = order.customerPhone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5078743+08:00", comments="Source field: order.note")
    public static final SqlColumn<String> note = order.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5058724+08:00", comments="Source Table: order")
    public static final class Order extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> mallId = column("mall_id", JDBCType.VARCHAR);

        public final SqlColumn<String> customerId = column("customer_id", JDBCType.VARCHAR);

        public final SqlColumn<String> mallName = column("mall_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> time = column("time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> customerName = column("customer_name", JDBCType.VARCHAR);

        public final SqlColumn<String> customerAddr = column("customer_addr", JDBCType.VARCHAR);

        public final SqlColumn<String> customerPhone = column("customer_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public Order() {
            super("order");
        }
    }
}