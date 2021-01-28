package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.CheckConstraintsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.CheckConstraints;
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
public interface CheckConstraintsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    BasicColumn[] selectList = BasicColumn.columnList(constraintCatalog, constraintSchema, constraintName, checkClause);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<CheckConstraints> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CheckConstraintsResult")
    Optional<CheckConstraints> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CheckConstraintsResult", value = {
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_CLAUSE", property="checkClause", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CheckConstraints> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, checkConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, checkConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default int insert(CheckConstraints record) {
        return MyBatis3Utils.insert(this::insert, record, checkConstraints, c ->
            c.map(constraintCatalog).toProperty("constraintCatalog")
            .map(constraintSchema).toProperty("constraintSchema")
            .map(constraintName).toProperty("constraintName")
            .map(checkClause).toProperty("checkClause")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default int insertSelective(CheckConstraints record) {
        return MyBatis3Utils.insert(this::insert, record, checkConstraints, c ->
            c.map(constraintCatalog).toPropertyWhenPresent("constraintCatalog", record::getConstraintCatalog)
            .map(constraintSchema).toPropertyWhenPresent("constraintSchema", record::getConstraintSchema)
            .map(constraintName).toPropertyWhenPresent("constraintName", record::getConstraintName)
            .map(checkClause).toPropertyWhenPresent("checkClause", record::getCheckClause)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default Optional<CheckConstraints> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, checkConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default List<CheckConstraints> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, checkConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default List<CheckConstraints> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, checkConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, checkConstraints, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    static UpdateDSL<UpdateModel> updateAllColumns(CheckConstraints record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalTo(record::getConstraintCatalog)
                .set(constraintSchema).equalTo(record::getConstraintSchema)
                .set(constraintName).equalTo(record::getConstraintName)
                .set(checkClause).equalTo(record::getCheckClause);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.287979+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CheckConstraints record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(constraintCatalog).equalToWhenPresent(record::getConstraintCatalog)
                .set(constraintSchema).equalToWhenPresent(record::getConstraintSchema)
                .set(constraintName).equalToWhenPresent(record::getConstraintName)
                .set(checkClause).equalToWhenPresent(record::getCheckClause);
    }
}