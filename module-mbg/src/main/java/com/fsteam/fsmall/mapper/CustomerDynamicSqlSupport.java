package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CustomerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5268912+08:00", comments="Source Table: customer")
    public static final Customer customer = new Customer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5278925+08:00", comments="Source field: customer.id")
    public static final SqlColumn<String> id = customer.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5278925+08:00", comments="Source field: customer.name")
    public static final SqlColumn<String> name = customer.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5278925+08:00", comments="Source field: customer.address")
    public static final SqlColumn<String> address = customer.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5278925+08:00", comments="Source field: customer.phone")
    public static final SqlColumn<String> phone = customer.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5278925+08:00", comments="Source Table: customer")
    public static final class Customer extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public Customer() {
            super("customer");
        }
    }
}