package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MallDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4798494+08:00", comments="Source Table: mall")
    public static final Mall mall = new Mall();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4828516+08:00", comments="Source field: mall.id")
    public static final SqlColumn<String> id = mall.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4838525+08:00", comments="Source field: mall.name")
    public static final SqlColumn<String> name = mall.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4838525+08:00", comments="Source field: mall.description")
    public static final SqlColumn<String> description = mall.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4838525+08:00", comments="Source field: mall.phone")
    public static final SqlColumn<String> phone = mall.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4838525+08:00", comments="Source field: mall.address")
    public static final SqlColumn<String> address = mall.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4848538+08:00", comments="Source field: mall.icon_id")
    public static final SqlColumn<Integer> iconId = mall.iconId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4848538+08:00", comments="Source field: mall.status")
    public static final SqlColumn<Integer> status = mall.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4818506+08:00", comments="Source Table: mall")
    public static final class Mall extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> iconId = column("icon_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public Mall() {
            super("mall");
        }
    }
}