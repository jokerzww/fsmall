package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemLabelTbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2489746+08:00", comments="Source Table: item_label_tb")
    public static final ItemLabelTb itemLabelTb = new ItemLabelTb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2489746+08:00", comments="Source field: item_label_tb.id")
    public static final SqlColumn<Integer> id = itemLabelTb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source field: item_label_tb.item_id")
    public static final SqlColumn<Integer> itemId = itemLabelTb.itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source field: item_label_tb.name")
    public static final SqlColumn<String> name = itemLabelTb.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source field: item_label_tb.price")
    public static final SqlColumn<BigDecimal> price = itemLabelTb.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2489746+08:00", comments="Source Table: item_label_tb")
    public static final class ItemLabelTb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> itemId = column("item_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public ItemLabelTb() {
            super("item_label_tb");
        }
    }
}