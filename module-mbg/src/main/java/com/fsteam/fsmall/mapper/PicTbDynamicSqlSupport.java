package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PicTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6348435+08:00", comments="Source Table: pic_tb")
    public static final PicTb picTb = new PicTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6358404+08:00", comments="Source field: pic_tb.id")
    public static final SqlColumn<Integer> id = picTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6368441+08:00", comments="Source field: pic_tb.item_id")
    public static final SqlColumn<Integer> itemId = picTb.itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6368441+08:00", comments="Source field: pic_tb.url")
    public static final SqlColumn<String> url = picTb.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.637835+08:00", comments="Source field: pic_tb.abs_path")
    public static final SqlColumn<String> absPath = picTb.absPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6348435+08:00", comments="Source Table: pic_tb")
    public static final class PicTb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> itemId = column("item_id", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> absPath = column("abs_path", JDBCType.VARCHAR);

        public PicTb() {
            super("pic_tb");
        }
    }
}