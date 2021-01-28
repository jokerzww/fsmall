package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ItemClassTbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ItemClassTb;
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
public interface ItemClassTbMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    BasicColumn[] selectList = BasicColumn.columnList(id, mallId, name, priority);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ItemClassTb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemClassTbResult")
    Optional<ItemClassTb> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemClassTbResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mall_id", property="mallId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    List<ItemClassTb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, itemClassTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, itemClassTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int insert(ItemClassTb record) {
        return MyBatis3Utils.insert(this::insert, record, itemClassTb, c ->
            c.map(mallId).toProperty("mallId")
            .map(name).toProperty("name")
            .map(priority).toProperty("priority")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int insertSelective(ItemClassTb record) {
        return MyBatis3Utils.insert(this::insert, record, itemClassTb, c ->
            c.map(mallId).toPropertyWhenPresent("mallId", record::getMallId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(priority).toPropertyWhenPresent("priority", record::getPriority)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default Optional<ItemClassTb> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, itemClassTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default List<ItemClassTb> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, itemClassTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default List<ItemClassTb> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, itemClassTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default Optional<ItemClassTb> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, itemClassTb, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    static UpdateDSL<UpdateModel> updateAllColumns(ItemClassTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalTo(record::getMallId)
                .set(name).equalTo(record::getName)
                .set(priority).equalTo(record::getPriority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ItemClassTb record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalToWhenPresent(record::getMallId)
                .set(name).equalToWhenPresent(record::getName)
                .set(priority).equalToWhenPresent(record::getPriority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int updateByPrimaryKey(ItemClassTb record) {
        return update(c ->
            c.set(mallId).equalTo(record::getMallId)
            .set(name).equalTo(record::getName)
            .set(priority).equalTo(record::getPriority)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5151845+08:00", comments="Source Table: item_class_tb")
    default int updateByPrimaryKeySelective(ItemClassTb record) {
        return update(c ->
            c.set(mallId).equalToWhenPresent(record::getMallId)
            .set(name).equalToWhenPresent(record::getName)
            .set(priority).equalToWhenPresent(record::getPriority)
            .where(id, isEqualTo(record::getId))
        );
    }
}