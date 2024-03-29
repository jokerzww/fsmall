package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PictureDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.947087+08:00", comments="Source Table: picture")
    public static final Picture picture = new Picture();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9480882+08:00", comments="Source field: picture.id")
    public static final SqlColumn<Integer> id = picture.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9480882+08:00", comments="Source field: picture.item_id")
    public static final SqlColumn<Integer> itemId = picture.itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9480882+08:00", comments="Source field: picture.url")
    public static final SqlColumn<String> url = picture.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9480882+08:00", comments="Source field: picture.abs_path")
    public static final SqlColumn<String> absPath = picture.absPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9480882+08:00", comments="Source Table: picture")
    public static final class Picture extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> itemId = column("item_id", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> absPath = column("abs_path", JDBCType.VARCHAR);

        public Picture() {
            super("picture");
        }
    }
}