package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.CartTbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.CartTb;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
public interface CartTbMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    BasicColumn[] selectList = BasicColumn.columnList(mallId, customerId, itemId, number);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CartTb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CartTbResult")
    Optional<CartTb> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CartTbResult", value = {
        @Result(column="mall_id", property="mallId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER)
    })
    List<CartTb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cartTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cartTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int deleteByPrimaryKey(String mallId_, String customerId_) {
        return delete(c -> 
            c.where(mallId, isEqualTo(mallId_))
            .and(customerId, isEqualTo(customerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int insert(CartTb record) {
        return MyBatis3Utils.insert(this::insert, record, cartTb, c ->
            c.map(mallId).toProperty("mallId")
            .map(customerId).toProperty("customerId")
            .map(itemId).toProperty("itemId")
            .map(number).toProperty("number")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int insertSelective(CartTb record) {
        return MyBatis3Utils.insert(this::insert, record, cartTb, c ->
            c.map(mallId).toPropertyWhenPresent("mallId", record::getMallId)
            .map(customerId).toPropertyWhenPresent("customerId", record::getCustomerId)
            .map(itemId).toPropertyWhenPresent("itemId", record::getItemId)
            .map(number).toPropertyWhenPresent("number", record::getNumber)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default Optional<CartTb> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cartTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default List<CartTb> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cartTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default List<CartTb> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cartTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default Optional<CartTb> selectByPrimaryKey(String mallId_, String customerId_) {
        return selectOne(c ->
            c.where(mallId, isEqualTo(mallId_))
            .and(customerId, isEqualTo(customerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cartTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    static UpdateDSL<UpdateModel> updateAllColumns(CartTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalTo(record::getMallId)
                .set(customerId).equalTo(record::getCustomerId)
                .set(itemId).equalTo(record::getItemId)
                .set(number).equalTo(record::getNumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CartTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalToWhenPresent(record::getMallId)
                .set(customerId).equalToWhenPresent(record::getCustomerId)
                .set(itemId).equalToWhenPresent(record::getItemId)
                .set(number).equalToWhenPresent(record::getNumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int updateByPrimaryKey(CartTb record) {
        return update(c ->
            c.set(itemId).equalTo(record::getItemId)
            .set(number).equalTo(record::getNumber)
            .where(mallId, isEqualTo(record::getMallId))
            .and(customerId, isEqualTo(record::getCustomerId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4481229+08:00", comments="Source Table: cart_tb")
    default int updateByPrimaryKeySelective(CartTb record) {
        return update(c ->
            c.set(itemId).equalToWhenPresent(record::getItemId)
            .set(number).equalToWhenPresent(record::getNumber)
            .where(mallId, isEqualTo(record::getMallId))
            .and(customerId, isEqualTo(record::getCustomerId))
        );
    }
}