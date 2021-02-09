package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.MallDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Mall;
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
public interface MallMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4958634+08:00", comments="Source Table: mall")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, description, phone, address, iconId, status);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4858551+08:00", comments="Source Table: mall")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4868562+08:00", comments="Source Table: mall")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4868562+08:00", comments="Source Table: mall")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=String.class)
    int insert(InsertStatementProvider<Mall> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.488857+08:00", comments="Source Table: mall")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MallResult")
    Optional<Mall> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4898585+08:00", comments="Source Table: mall")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MallResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon_id", property="iconId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<Mall> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4908598+08:00", comments="Source Table: mall")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4908598+08:00", comments="Source Table: mall")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mall, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4908598+08:00", comments="Source Table: mall")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mall, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4918597+08:00", comments="Source Table: mall")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4928609+08:00", comments="Source Table: mall")
    default int insert(Mall record) {
        return MyBatis3Utils.insert(this::insert, record, mall, c ->
            c.map(name).toProperty("name")
            .map(description).toProperty("description")
            .map(phone).toProperty("phone")
            .map(address).toProperty("address")
            .map(iconId).toProperty("iconId")
            .map(status).toProperty("status")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4948635+08:00", comments="Source Table: mall")
    default int insertSelective(Mall record) {
        return MyBatis3Utils.insert(this::insert, record, mall, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(iconId).toPropertyWhenPresent("iconId", record::getIconId)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4968646+08:00", comments="Source Table: mall")
    default Optional<Mall> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mall, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4978653+08:00", comments="Source Table: mall")
    default List<Mall> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mall, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4978653+08:00", comments="Source Table: mall")
    default List<Mall> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mall, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4988661+08:00", comments="Source Table: mall")
    default Optional<Mall> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4988661+08:00", comments="Source Table: mall")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mall, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4998669+08:00", comments="Source Table: mall")
    static UpdateDSL<UpdateModel> updateAllColumns(Mall record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(description).equalTo(record::getDescription)
                .set(phone).equalTo(record::getPhone)
                .set(address).equalTo(record::getAddress)
                .set(iconId).equalTo(record::getIconId)
                .set(status).equalTo(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.4998669+08:00", comments="Source Table: mall")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Mall record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(iconId).equalToWhenPresent(record::getIconId)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5018698+08:00", comments="Source Table: mall")
    default int updateByPrimaryKey(Mall record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(description).equalTo(record::getDescription)
            .set(phone).equalTo(record::getPhone)
            .set(address).equalTo(record::getAddress)
            .set(iconId).equalTo(record::getIconId)
            .set(status).equalTo(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-09T15:00:48.5018698+08:00", comments="Source Table: mall")
    default int updateByPrimaryKeySelective(Mall record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(iconId).equalToWhenPresent(record::getIconId)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }
}