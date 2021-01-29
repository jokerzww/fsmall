package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.OrderTbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.OrderTb;
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
public interface OrderTbMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5710132+08:00", comments="Source Table: order_tb")
    BasicColumn[] selectList = BasicColumn.columnList(id, mallId, customerId, mallName, price, status, time, customerName, customerAddr, customerPhone, note);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5111728+08:00", comments="Source Table: order_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.513168+08:00", comments="Source Table: order_tb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5141656+08:00", comments="Source Table: order_tb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<OrderTb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5181585+08:00", comments="Source Table: order_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderTbResult")
    Optional<OrderTb> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5191518+08:00", comments="Source Table: order_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderTbResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mall_id", property="mallId", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mall_name", property="mallName", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="customer_name", property="customerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_addr", property="customerAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_phone", property="customerPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<OrderTb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5211467+08:00", comments="Source Table: order_tb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5221444+08:00", comments="Source Table: order_tb")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5231422+08:00", comments="Source Table: order_tb")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5271331+08:00", comments="Source Table: order_tb")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.530122+08:00", comments="Source Table: order_tb")
    default int insert(OrderTb record) {
        return MyBatis3Utils.insert(this::insert, record, orderTb, c ->
            c.map(mallId).toProperty("mallId")
            .map(customerId).toProperty("customerId")
            .map(mallName).toProperty("mallName")
            .map(price).toProperty("price")
            .map(status).toProperty("status")
            .map(time).toProperty("time")
            .map(customerName).toProperty("customerName")
            .map(customerAddr).toProperty("customerAddr")
            .map(customerPhone).toProperty("customerPhone")
            .map(note).toProperty("note")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.538103+08:00", comments="Source Table: order_tb")
    default int insertSelective(OrderTb record) {
        return MyBatis3Utils.insert(this::insert, record, orderTb, c ->
            c.map(mallId).toPropertyWhenPresent("mallId", record::getMallId)
            .map(customerId).toPropertyWhenPresent("customerId", record::getCustomerId)
            .map(mallName).toPropertyWhenPresent("mallName", record::getMallName)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(time).toPropertyWhenPresent("time", record::getTime)
            .map(customerName).toPropertyWhenPresent("customerName", record::getCustomerName)
            .map(customerAddr).toPropertyWhenPresent("customerAddr", record::getCustomerAddr)
            .map(customerPhone).toPropertyWhenPresent("customerPhone", record::getCustomerPhone)
            .map(note).toPropertyWhenPresent("note", record::getNote)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5720109+08:00", comments="Source Table: order_tb")
    default Optional<OrderTb> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.576999+08:00", comments="Source Table: order_tb")
    default List<OrderTb> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5789921+08:00", comments="Source Table: order_tb")
    default List<OrderTb> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5819846+08:00", comments="Source Table: order_tb")
    default Optional<OrderTb> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.5889651+08:00", comments="Source Table: order_tb")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.596944+08:00", comments="Source Table: order_tb")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalTo(record::getMallId)
                .set(customerId).equalTo(record::getCustomerId)
                .set(mallName).equalTo(record::getMallName)
                .set(price).equalTo(record::getPrice)
                .set(status).equalTo(record::getStatus)
                .set(time).equalTo(record::getTime)
                .set(customerName).equalTo(record::getCustomerName)
                .set(customerAddr).equalTo(record::getCustomerAddr)
                .set(customerPhone).equalTo(record::getCustomerPhone)
                .set(note).equalTo(record::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6069171+08:00", comments="Source Table: order_tb")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalToWhenPresent(record::getMallId)
                .set(customerId).equalToWhenPresent(record::getCustomerId)
                .set(mallName).equalToWhenPresent(record::getMallName)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(time).equalToWhenPresent(record::getTime)
                .set(customerName).equalToWhenPresent(record::getCustomerName)
                .set(customerAddr).equalToWhenPresent(record::getCustomerAddr)
                .set(customerPhone).equalToWhenPresent(record::getCustomerPhone)
                .set(note).equalToWhenPresent(record::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6138998+08:00", comments="Source Table: order_tb")
    default int updateByPrimaryKey(OrderTb record) {
        return update(c ->
            c.set(mallId).equalTo(record::getMallId)
            .set(customerId).equalTo(record::getCustomerId)
            .set(mallName).equalTo(record::getMallName)
            .set(price).equalTo(record::getPrice)
            .set(status).equalTo(record::getStatus)
            .set(time).equalTo(record::getTime)
            .set(customerName).equalTo(record::getCustomerName)
            .set(customerAddr).equalTo(record::getCustomerAddr)
            .set(customerPhone).equalTo(record::getCustomerPhone)
            .set(note).equalTo(record::getNote)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T13:53:22.6158972+08:00", comments="Source Table: order_tb")
    default int updateByPrimaryKeySelective(OrderTb record) {
        return update(c ->
            c.set(mallId).equalToWhenPresent(record::getMallId)
            .set(customerId).equalToWhenPresent(record::getCustomerId)
            .set(mallName).equalToWhenPresent(record::getMallName)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(time).equalToWhenPresent(record::getTime)
            .set(customerName).equalToWhenPresent(record::getCustomerName)
            .set(customerAddr).equalToWhenPresent(record::getCustomerAddr)
            .set(customerPhone).equalToWhenPresent(record::getCustomerPhone)
            .set(note).equalToWhenPresent(record::getNote)
            .where(id, isEqualTo(record::getId))
        );
    }
}