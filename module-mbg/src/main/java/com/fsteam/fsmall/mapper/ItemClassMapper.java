package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ItemClassDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.ItemClass;
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
public interface ItemClassMapper extends CommonInsertMapper<ItemClass> {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8525463+08:00", comments="Source Table: item_class")
    BasicColumn[] selectList = BasicColumn.columnList(id, mallId, name, priority);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8286092+08:00", comments="Source Table: item_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8286092+08:00", comments="Source Table: item_class")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8316016+08:00", comments="Source Table: item_class")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ItemClass> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8316016+08:00", comments="Source Table: item_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ItemClassResult")
    Optional<ItemClass> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8316016+08:00", comments="Source Table: item_class")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ItemClassResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mall_id", property="mallId", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    List<ItemClass> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8485603+08:00", comments="Source Table: item_class")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8505518+08:00", comments="Source Table: item_class")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, itemClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8515485+08:00", comments="Source Table: item_class")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, itemClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8515485+08:00", comments="Source Table: item_class")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8515485+08:00", comments="Source Table: item_class")
    default int insert(ItemClass record) {
        return MyBatis3Utils.insert(this::insert, record, itemClass, c ->
            c.map(mallId).toProperty("mallId")
            .map(name).toProperty("name")
            .map(priority).toProperty("priority")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8515485+08:00", comments="Source Table: item_class")
    default int insertSelective(ItemClass record) {
        return MyBatis3Utils.insert(this::insert, record, itemClass, c ->
            c.map(mallId).toPropertyWhenPresent("mallId", record::getMallId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(priority).toPropertyWhenPresent("priority", record::getPriority)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8535431+08:00", comments="Source Table: item_class")
    default Optional<ItemClass> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, itemClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8535431+08:00", comments="Source Table: item_class")
    default List<ItemClass> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, itemClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8535431+08:00", comments="Source Table: item_class")
    default List<ItemClass> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, itemClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8535431+08:00", comments="Source Table: item_class")
    default Optional<ItemClass> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8545401+08:00", comments="Source Table: item_class")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, itemClass, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8545401+08:00", comments="Source Table: item_class")
    static UpdateDSL<UpdateModel> updateAllColumns(ItemClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalTo(record::getMallId)
                .set(name).equalTo(record::getName)
                .set(priority).equalTo(record::getPriority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8545401+08:00", comments="Source Table: item_class")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ItemClass record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(mallId).equalToWhenPresent(record::getMallId)
                .set(name).equalToWhenPresent(record::getName)
                .set(priority).equalToWhenPresent(record::getPriority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8555371+08:00", comments="Source Table: item_class")
    default int updateByPrimaryKey(ItemClass record) {
        return update(c ->
            c.set(mallId).equalTo(record::getMallId)
            .set(name).equalTo(record::getName)
            .set(priority).equalTo(record::getPriority)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-02-08T15:57:18.8565348+08:00", comments="Source Table: item_class")
    default int updateByPrimaryKeySelective(ItemClass record) {
        return update(c ->
            c.set(mallId).equalToWhenPresent(record::getMallId)
            .set(name).equalToWhenPresent(record::getName)
            .set(priority).equalToWhenPresent(record::getPriority)
            .where(id, isEqualTo(record::getId))
        );
    }
}