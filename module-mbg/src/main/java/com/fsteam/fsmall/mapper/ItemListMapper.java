package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ItemListDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ItemList;
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
public interface ItemListMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8844604+08:00", comments="Source Table: item_list")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, itemName, itemNumber, price);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8774805+08:00", comments="Source Table: item_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8774805+08:00", comments="Source Table: item_list")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8774805+08:00", comments="Source Table: item_list")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ItemList> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8814681+08:00", comments="Source Table: item_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemListResult")
    Optional<ItemList> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8824661+08:00", comments="Source Table: item_list")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemListResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_number", property="itemNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL)
    })
    List<ItemList> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8824661+08:00", comments="Source Table: item_list")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8824661+08:00", comments="Source Table: item_list")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, itemList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8824661+08:00", comments="Source Table: item_list")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, itemList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8824661+08:00", comments="Source Table: item_list")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8824661+08:00", comments="Source Table: item_list")
    default int insert(ItemList record) {
        return MyBatis3Utils.insert(this::insert, record, itemList, c ->
            c.map(orderId).toProperty("orderId")
            .map(itemName).toProperty("itemName")
            .map(itemNumber).toProperty("itemNumber")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8844604+08:00", comments="Source Table: item_list")
    default int insertSelective(ItemList record) {
        return MyBatis3Utils.insert(this::insert, record, itemList, c ->
            c.map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(itemName).toPropertyWhenPresent("itemName", record::getItemName)
            .map(itemNumber).toPropertyWhenPresent("itemNumber", record::getItemNumber)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8844604+08:00", comments="Source Table: item_list")
    default Optional<ItemList> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, itemList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8844604+08:00", comments="Source Table: item_list")
    default List<ItemList> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, itemList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8844604+08:00", comments="Source Table: item_list")
    default List<ItemList> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, itemList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8844604+08:00", comments="Source Table: item_list")
    default Optional<ItemList> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8854574+08:00", comments="Source Table: item_list")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, itemList, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8854574+08:00", comments="Source Table: item_list")
    static UpdateDSL<UpdateModel> updateAllColumns(ItemList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderId).equalTo(record::getOrderId)
                .set(itemName).equalTo(record::getItemName)
                .set(itemNumber).equalTo(record::getItemNumber)
                .set(price).equalTo(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8854574+08:00", comments="Source Table: item_list")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ItemList record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderId).equalToWhenPresent(record::getOrderId)
                .set(itemName).equalToWhenPresent(record::getItemName)
                .set(itemNumber).equalToWhenPresent(record::getItemNumber)
                .set(price).equalToWhenPresent(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8854574+08:00", comments="Source Table: item_list")
    default int updateByPrimaryKey(ItemList record) {
        return update(c ->
            c.set(orderId).equalTo(record::getOrderId)
            .set(itemName).equalTo(record::getItemName)
            .set(itemNumber).equalTo(record::getItemNumber)
            .set(price).equalTo(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8894463+08:00", comments="Source Table: item_list")
    default int updateByPrimaryKeySelective(ItemList record) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(record::getOrderId)
            .set(itemName).equalToWhenPresent(record::getItemName)
            .set(itemNumber).equalToWhenPresent(record::getItemNumber)
            .set(price).equalToWhenPresent(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }
}