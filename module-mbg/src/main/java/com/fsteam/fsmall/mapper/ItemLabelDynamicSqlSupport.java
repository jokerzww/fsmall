package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemLabelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9821995+08:00", comments="Source Table: item_label")
    public static final ItemLabel itemLabel = new ItemLabel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9831978+08:00", comments="Source field: item_label.id")
    public static final SqlColumn<Integer> id = itemLabel.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9831978+08:00", comments="Source field: item_label.item_id")
    public static final SqlColumn<Integer> itemId = itemLabel.itemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9831978+08:00", comments="Source field: item_label.name")
    public static final SqlColumn<String> name = itemLabel.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.984194+08:00", comments="Source field: item_label.price")
    public static final SqlColumn<BigDecimal> price = itemLabel.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9821995+08:00", comments="Source Table: item_label")
    public static final class ItemLabel extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> itemId = column("item_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public ItemLabel() {
            super("item_label");
        }
    }
}