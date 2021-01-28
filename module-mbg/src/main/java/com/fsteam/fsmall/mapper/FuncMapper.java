package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.FuncDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Func;
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
public interface FuncMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    BasicColumn[] selectList = BasicColumn.columnList(name, ret, dl, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Func> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FuncResult")
    Optional<Func> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FuncResult", value = {
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ret", property="ret", jdbcType=JdbcType.TINYINT),
        @Result(column="dl", property="dl", jdbcType=JdbcType.CHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.CHAR)
    })
    List<Func> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, func, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, func, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    default int insert(Func record) {
        return MyBatis3Utils.insert(this::insert, record, func, c ->
            c.map(name).toProperty("name")
            .map(ret).toProperty("ret")
            .map(dl).toProperty("dl")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1128187+08:00", comments="Source Table: func")
    default int insertSelective(Func record) {
        return MyBatis3Utils.insert(this::insert, record, func, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(ret).toPropertyWhenPresent("ret", record::getRet)
            .map(dl).toPropertyWhenPresent("dl", record::getDl)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default Optional<Func> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, func, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default List<Func> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, func, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default List<Func> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, func, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default Optional<Func> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, func, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    static UpdateDSL<UpdateModel> updateAllColumns(Func record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(ret).equalTo(record::getRet)
                .set(dl).equalTo(record::getDl)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Func record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(ret).equalToWhenPresent(record::getRet)
                .set(dl).equalToWhenPresent(record::getDl)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default int updateByPrimaryKey(Func record) {
        return update(c ->
            c.set(ret).equalTo(record::getRet)
            .set(dl).equalTo(record::getDl)
            .set(type).equalTo(record::getType)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1138191+08:00", comments="Source Table: func")
    default int updateByPrimaryKeySelective(Func record) {
        return update(c ->
            c.set(ret).equalToWhenPresent(record::getRet)
            .set(dl).equalToWhenPresent(record::getDl)
            .set(type).equalToWhenPresent(record::getType)
            .where(name, isEqualTo(record::getName))
        );
    }
}