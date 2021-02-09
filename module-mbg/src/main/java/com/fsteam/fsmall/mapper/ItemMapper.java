package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Item;
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
public interface ItemMapper extends CommonInsertMapper<Item> {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9702314+08:00", comments="Source Table: item")
    BasicColumn[] selectList = BasicColumn.columnList(id, mallId, itemClassId, iconId, status, priority, name, description, saleVolume, price, unit);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9662421+08:00", comments="Source Table: item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9662421+08:00", comments="Source Table: item")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9662421+08:00", comments="Source Table: item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Item> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9682357+08:00", comments="Source Table: item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemResult")
    Optional<Item> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9682357+08:00", comments="Source Table: item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mall_id", property="mallId", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_class_id", property="itemClassId", jdbcType=JdbcType.INTEGER),
        @Result(column="icon_id", property="iconId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_volume", property="saleVolume", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR)
    })
    List<Item> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9682357+08:00", comments="Source Table: item")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9682357+08:00", comments="Source Table: item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9692338+08:00", comments="Source Table: item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9692338+08:00", comments="Source Table: item")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9692338+08:00", comments="Source Table: item")
    default int insert(Item record) {
        return MyBatis3Utils.insert(this::insert, record, item, c ->
            c.map(mallId).toProperty("mallId")
            .map(itemClassId).toProperty("itemClassId")
            .map(iconId).toProperty("iconId")
            .map(status).toProperty("status")
            .map(priority).toProperty("priority")
            .map(name).toProperty("name")
            .map(description).toProperty("description")
            .map(saleVolume).toProperty("saleVolume")
            .map(price).toProperty("price")
            .map(unit).toProperty("unit")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9692338+08:00", comments="Source Table: item")
    default int insertSelective(Item record) {
        return MyBatis3Utils.insert(this::insert, record, item, c ->
            c.map(mallId).toPropertyWhenPresent("mallId", record::getMallId)
            .map(itemClassId).toPropertyWhenPresent("itemClassId", record::getItemClassId)
            .map(iconId).toPropertyWhenPresent("iconId", record::getIconId)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(priority).toPropertyWhenPresent("priority", record::getPriority)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(saleVolume).toPropertyWhenPresent("saleVolume", record::getSaleVolume)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(unit).toPropertyWhenPresent("unit", record::getUnit)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9702314+08:00", comments="Source Table: item")
    default Optional<Item> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9702314+08:00", comments="Source Table: item")
    default List<Item> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9702314+08:00", comments="Source Table: item")
    default List<Item> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9712292+08:00", comments="Source Table: item")
    default Optional<Item> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9712292+08:00", comments="Source Table: item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, item, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9712292+08:00", comments="Source Table: item")
    static UpdateDSL<UpdateModel> updateAllColumns(Item record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalTo(record::getMallId)
                .set(itemClassId).equalTo(record::getItemClassId)
                .set(iconId).equalTo(record::getIconId)
                .set(status).equalTo(record::getStatus)
                .set(priority).equalTo(record::getPriority)
                .set(name).equalTo(record::getName)
                .set(description).equalTo(record::getDescription)
                .set(saleVolume).equalTo(record::getSaleVolume)
                .set(price).equalTo(record::getPrice)
                .set(unit).equalTo(record::getUnit);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9722259+08:00", comments="Source Table: item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Item record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalToWhenPresent(record::getMallId)
                .set(itemClassId).equalToWhenPresent(record::getItemClassId)
                .set(iconId).equalToWhenPresent(record::getIconId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(priority).equalToWhenPresent(record::getPriority)
                .set(name).equalToWhenPresent(record::getName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(saleVolume).equalToWhenPresent(record::getSaleVolume)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(unit).equalToWhenPresent(record::getUnit);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9722259+08:00", comments="Source Table: item")
    default int updateByPrimaryKey(Item record) {
        return update(c ->
            c.set(mallId).equalTo(record::getMallId)
            .set(itemClassId).equalTo(record::getItemClassId)
            .set(iconId).equalTo(record::getIconId)
            .set(status).equalTo(record::getStatus)
            .set(priority).equalTo(record::getPriority)
            .set(name).equalTo(record::getName)
            .set(description).equalTo(record::getDescription)
            .set(saleVolume).equalTo(record::getSaleVolume)
            .set(price).equalTo(record::getPrice)
            .set(unit).equalTo(record::getUnit)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9722259+08:00", comments="Source Table: item")
    default int updateByPrimaryKeySelective(Item record) {
        return update(c ->
            c.set(mallId).equalToWhenPresent(record::getMallId)
            .set(itemClassId).equalToWhenPresent(record::getItemClassId)
            .set(iconId).equalToWhenPresent(record::getIconId)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(priority).equalToWhenPresent(record::getPriority)
            .set(name).equalToWhenPresent(record::getName)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(saleVolume).equalToWhenPresent(record::getSaleVolume)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(unit).equalToWhenPresent(record::getUnit)
            .where(id, isEqualTo(record::getId))
        );
    }
}