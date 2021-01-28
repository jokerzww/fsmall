package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XMemoryGlobalTotalDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XMemoryGlobalTotal;
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
public interface XMemoryGlobalTotalMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    BasicColumn[] selectList = BasicColumn.columnList(totalAllocated);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XMemoryGlobalTotal> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XMemoryGlobalTotalResult")
    Optional<XMemoryGlobalTotal> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XMemoryGlobalTotalResult", value = {
        @Result(column="total_allocated", property="totalAllocated", jdbcType=JdbcType.DECIMAL)
    })
    List<XMemoryGlobalTotal> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XMemoryGlobalTotal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XMemoryGlobalTotal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default int insert(XMemoryGlobalTotal record) {
        return MyBatis3Utils.insert(this::insert, record, XMemoryGlobalTotal, c ->
            c.map(totalAllocated).toProperty("totalAllocated")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default int insertSelective(XMemoryGlobalTotal record) {
        return MyBatis3Utils.insert(this::insert, record, XMemoryGlobalTotal, c ->
            c.map(totalAllocated).toPropertyWhenPresent("totalAllocated", record::getTotalAllocated)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default Optional<XMemoryGlobalTotal> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XMemoryGlobalTotal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default List<XMemoryGlobalTotal> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XMemoryGlobalTotal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default List<XMemoryGlobalTotal> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XMemoryGlobalTotal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XMemoryGlobalTotal, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    static UpdateDSL<UpdateModel> updateAllColumns(XMemoryGlobalTotal record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(totalAllocated).equalTo(record::getTotalAllocated);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1278323+08:00", comments="Source Table: x$memory_global_total")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XMemoryGlobalTotal record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(totalAllocated).equalToWhenPresent(record::getTotalAllocated);
    }
}