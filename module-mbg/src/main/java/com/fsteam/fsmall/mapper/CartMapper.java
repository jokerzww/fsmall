package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.CartDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Cart;
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
public interface CartMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    BasicColumn[] selectList = BasicColumn.columnList(id, mallId, customerId, itemId, number);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.933074+08:00", comments="Source Table: cart")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.933074+08:00", comments="Source Table: cart")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Cart> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CartResult")
    Optional<Cart> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CartResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mall_id", property="mallId", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER)
    })
    List<Cart> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cart, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cart, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default int insert(Cart record) {
        return MyBatis3Utils.insert(this::insert, record, cart, c ->
            c.map(mallId).toProperty("mallId")
            .map(customerId).toProperty("customerId")
            .map(itemId).toProperty("itemId")
            .map(number).toProperty("number")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default int insertSelective(Cart record) {
        return MyBatis3Utils.insert(this::insert, record, cart, c ->
            c.map(mallId).toPropertyWhenPresent("mallId", record::getMallId)
            .map(customerId).toPropertyWhenPresent("customerId", record::getCustomerId)
            .map(itemId).toPropertyWhenPresent("itemId", record::getItemId)
            .map(number).toPropertyWhenPresent("number", record::getNumber)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default Optional<Cart> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cart, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default List<Cart> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cart, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default List<Cart> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cart, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default Optional<Cart> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cart, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9340742+08:00", comments="Source Table: cart")
    static UpdateDSL<UpdateModel> updateAllColumns(Cart record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalTo(record::getMallId)
                .set(customerId).equalTo(record::getCustomerId)
                .set(itemId).equalTo(record::getItemId)
                .set(number).equalTo(record::getNumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9350756+08:00", comments="Source Table: cart")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Cart record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalToWhenPresent(record::getMallId)
                .set(customerId).equalToWhenPresent(record::getCustomerId)
                .set(itemId).equalToWhenPresent(record::getItemId)
                .set(number).equalToWhenPresent(record::getNumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9350756+08:00", comments="Source Table: cart")
    default int updateByPrimaryKey(Cart record) {
        return update(c ->
            c.set(mallId).equalTo(record::getMallId)
            .set(customerId).equalTo(record::getCustomerId)
            .set(itemId).equalTo(record::getItemId)
            .set(number).equalTo(record::getNumber)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-07T14:24:14.9350756+08:00", comments="Source Table: cart")
    default int updateByPrimaryKeySelective(Cart record) {
        return update(c ->
            c.set(mallId).equalToWhenPresent(record::getMallId)
            .set(customerId).equalToWhenPresent(record::getCustomerId)
            .set(itemId).equalToWhenPresent(record::getItemId)
            .set(number).equalToWhenPresent(record::getNumber)
            .where(id, isEqualTo(record::getId))
        );
    }
}