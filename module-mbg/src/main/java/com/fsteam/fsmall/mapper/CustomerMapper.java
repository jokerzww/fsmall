package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.CustomerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Customer;
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
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface CustomerMapper extends CommonInsertMapper<Customer> {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, address, phone);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9792081+08:00", comments="Source Table: customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9792081+08:00", comments="Source Table: customer")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9792081+08:00", comments="Source Table: customer")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=String.class)
    int insert(InsertStatementProvider<Customer> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9792081+08:00", comments="Source Table: customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CustomerResult")
    Optional<Customer> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9792081+08:00", comments="Source Table: customer")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CustomerResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR)
    })
    List<Customer> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    default int insert(Customer record) {
        return MyBatis3Utils.insert(this::insert, record, customer, c ->
            c.map(name).toProperty("name")
            .map(address).toProperty("address")
            .map(phone).toProperty("phone")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9802053+08:00", comments="Source Table: customer")
    default int insertSelective(Customer record) {
        return MyBatis3Utils.insert(this::insert, record, customer, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default Optional<Customer> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default List<Customer> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default List<Customer> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default Optional<Customer> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, customer, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    static UpdateDSL<UpdateModel> updateAllColumns(Customer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(address).equalTo(record::getAddress)
                .set(phone).equalTo(record::getPhone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Customer record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(phone).equalToWhenPresent(record::getPhone);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default int updateByPrimaryKey(Customer record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(address).equalTo(record::getAddress)
            .set(phone).equalTo(record::getPhone)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9812022+08:00", comments="Source Table: customer")
    default int updateByPrimaryKeySelective(Customer record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(phone).equalToWhenPresent(record::getPhone)
            .where(id, isEqualTo(record::getId))
        );
    }
}