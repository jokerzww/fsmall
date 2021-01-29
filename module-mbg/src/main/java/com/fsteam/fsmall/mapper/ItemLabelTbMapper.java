package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ItemLabelTbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ItemLabelTb;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ItemLabelTbMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    BasicColumn[] selectList = BasicColumn.columnList(id, itemId, name, price);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source Table: item_label_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source Table: item_label_tb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source Table: item_label_tb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ItemLabelTb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2499723+08:00", comments="Source Table: item_label_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemLabelTbResult")
    Optional<ItemLabelTb> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemLabelTbResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL)
    })
    List<ItemLabelTb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, itemLabelTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, itemLabelTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default int insert(ItemLabelTb record) {
        return MyBatis3Utils.insert(this::insert, record, itemLabelTb, c ->
            c.map(itemId).toProperty("itemId")
            .map(name).toProperty("name")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default int insertSelective(ItemLabelTb record) {
        return MyBatis3Utils.insert(this::insert, record, itemLabelTb, c ->
            c.map(itemId).toPropertyWhenPresent("itemId", record::getItemId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default Optional<ItemLabelTb> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, itemLabelTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default List<ItemLabelTb> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, itemLabelTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.250969+08:00", comments="Source Table: item_label_tb")
    default List<ItemLabelTb> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, itemLabelTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2519664+08:00", comments="Source Table: item_label_tb")
    default Optional<ItemLabelTb> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2519664+08:00", comments="Source Table: item_label_tb")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, itemLabelTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2519664+08:00", comments="Source Table: item_label_tb")
    static UpdateDSL<UpdateModel> updateAllColumns(ItemLabelTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalTo(record::getItemId)
                .set(name).equalTo(record::getName)
                .set(price).equalTo(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2519664+08:00", comments="Source Table: item_label_tb")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ItemLabelTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalToWhenPresent(record::getItemId)
                .set(name).equalToWhenPresent(record::getName)
                .set(price).equalToWhenPresent(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2519664+08:00", comments="Source Table: item_label_tb")
    default int updateByPrimaryKey(ItemLabelTb record) {
        return update(c ->
            c.set(itemId).equalTo(record::getItemId)
            .set(name).equalTo(record::getName)
            .set(price).equalTo(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T14:04:01.2529635+08:00", comments="Source Table: item_label_tb")
    default int updateByPrimaryKeySelective(ItemLabelTb record) {
        return update(c ->
            c.set(itemId).equalToWhenPresent(record::getItemId)
            .set(name).equalToWhenPresent(record::getName)
            .set(price).equalToWhenPresent(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }
}