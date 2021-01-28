package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SetupConsumersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SetupConsumers;
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
public interface SetupConsumersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    BasicColumn[] selectList = BasicColumn.columnList(name, enabled);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1178239+08:00", comments="Source Table: setup_consumers")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SetupConsumers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SetupConsumersResult")
    Optional<SetupConsumers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SetupConsumersResult", value = {
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ENABLED", property="enabled", jdbcType=JdbcType.CHAR)
    })
    List<SetupConsumers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, setupConsumers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, setupConsumers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int insert(SetupConsumers record) {
        return MyBatis3Utils.insert(this::insert, record, setupConsumers, c ->
            c.map(name).toProperty("name")
            .map(enabled).toProperty("enabled")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int insertSelective(SetupConsumers record) {
        return MyBatis3Utils.insert(this::insert, record, setupConsumers, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default Optional<SetupConsumers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, setupConsumers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default List<SetupConsumers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, setupConsumers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default List<SetupConsumers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, setupConsumers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default Optional<SetupConsumers> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, setupConsumers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    static UpdateDSL<UpdateModel> updateAllColumns(SetupConsumers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(enabled).equalTo(record::getEnabled);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SetupConsumers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(enabled).equalToWhenPresent(record::getEnabled);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int updateByPrimaryKey(SetupConsumers record) {
        return update(c ->
            c.set(enabled).equalTo(record::getEnabled)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1188247+08:00", comments="Source Table: setup_consumers")
    default int updateByPrimaryKeySelective(SetupConsumers record) {
        return update(c ->
            c.set(enabled).equalToWhenPresent(record::getEnabled)
            .where(name, isEqualTo(record::getName))
        );
    }
}