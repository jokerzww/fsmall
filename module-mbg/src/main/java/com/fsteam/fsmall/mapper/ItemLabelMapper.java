package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ItemLabelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ItemLabel;
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
public interface ItemLabelMapper extends CommonInsertMapper<ItemLabel> {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    BasicColumn[] selectList = BasicColumn.columnList(id, itemId, name, price);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.984194+08:00", comments="Source Table: item_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.984194+08:00", comments="Source Table: item_label")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.984194+08:00", comments="Source Table: item_label")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ItemLabel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.984194+08:00", comments="Source Table: item_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemLabelResult")
    Optional<ItemLabel> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemLabelResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL)
    })
    List<ItemLabel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, itemLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, itemLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default int insert(ItemLabel record) {
        return MyBatis3Utils.insert(this::insert, record, itemLabel, c ->
            c.map(itemId).toProperty("itemId")
            .map(name).toProperty("name")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default int insertSelective(ItemLabel record) {
        return MyBatis3Utils.insert(this::insert, record, itemLabel, c ->
            c.map(itemId).toPropertyWhenPresent("itemId", record::getItemId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default Optional<ItemLabel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, itemLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default List<ItemLabel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, itemLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default List<ItemLabel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, itemLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default Optional<ItemLabel> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.985191+08:00", comments="Source Table: item_label")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, itemLabel, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9861939+08:00", comments="Source Table: item_label")
    static UpdateDSL<UpdateModel> updateAllColumns(ItemLabel record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalTo(record::getItemId)
                .set(name).equalTo(record::getName)
                .set(price).equalTo(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9861939+08:00", comments="Source Table: item_label")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ItemLabel record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(itemId).equalToWhenPresent(record::getItemId)
                .set(name).equalToWhenPresent(record::getName)
                .set(price).equalToWhenPresent(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9861939+08:00", comments="Source Table: item_label")
    default int updateByPrimaryKey(ItemLabel record) {
        return update(c ->
            c.set(itemId).equalTo(record::getItemId)
            .set(name).equalTo(record::getName)
            .set(price).equalTo(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.9861939+08:00", comments="Source Table: item_label")
    default int updateByPrimaryKeySelective(ItemLabel record) {
        return update(c ->
            c.set(itemId).equalToWhenPresent(record::getItemId)
            .set(name).equalToWhenPresent(record::getName)
            .set(price).equalToWhenPresent(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }
}