package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MallTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7525281+08:00", comments="Source Table: mall_tb")
    public static final MallTb mallTb = new MallTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7565182+08:00", comments="Source field: mall_tb.id")
    public static final SqlColumn<String> id = mallTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7565182+08:00", comments="Source field: mall_tb.name")
    public static final SqlColumn<String> name = mallTb.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7565182+08:00", comments="Source field: mall_tb.description")
    public static final SqlColumn<String> description = mallTb.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7575151+08:00", comments="Source field: mall_tb.phone")
    public static final SqlColumn<String> phone = mallTb.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7605066+08:00", comments="Source field: mall_tb.address")
    public static final SqlColumn<String> address = mallTb.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7615045+08:00", comments="Source field: mall_tb.icon_id")
    public static final SqlColumn<Integer> iconId = mallTb.iconId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7615045+08:00", comments="Source field: mall_tb.status")
    public static final SqlColumn<Integer> status = mallTb.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.7565182+08:00", comments="Source Table: mall_tb")
    public static final class MallTb extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> iconId = column("icon_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public MallTb() {
            super("mall_tb");
        }
    }
}