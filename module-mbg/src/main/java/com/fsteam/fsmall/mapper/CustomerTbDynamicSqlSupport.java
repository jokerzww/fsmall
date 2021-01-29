package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CustomerTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7046558+08:00", comments="Source Table: customer_tb")
    public static final CustomerTb customerTb = new CustomerTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.709642+08:00", comments="Source field: customer_tb.id")
    public static final SqlColumn<String> id = customerTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7106395+08:00", comments="Source field: customer_tb.name")
    public static final SqlColumn<String> name = customerTb.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7106395+08:00", comments="Source field: customer_tb.address")
    public static final SqlColumn<String> address = customerTb.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7106395+08:00", comments="Source field: customer_tb.phone")
    public static final SqlColumn<String> phone = customerTb.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7056541+08:00", comments="Source Table: customer_tb")
    public static final class CustomerTb extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public CustomerTb() {
            super("customer_tb");
        }
    }
}