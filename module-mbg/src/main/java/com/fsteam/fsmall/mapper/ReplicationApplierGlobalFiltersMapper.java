package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationApplierGlobalFiltersDynamicSqlSupport.*;

import com.fsteam.fsmall.model.ReplicationApplierGlobalFilters;
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
public interface ReplicationApplierGlobalFiltersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    BasicColumn[] selectList = BasicColumn.columnList(filterName, configuredBy, activeSince, filterRule);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationApplierGlobalFilters> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationApplierGlobalFiltersResult")
    Optional<ReplicationApplierGlobalFilters> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationApplierGlobalFiltersResult", value = {
        @Result(column="FILTER_NAME", property="filterName", jdbcType=JdbcType.CHAR),
        @Result(column="CONFIGURED_BY", property="configuredBy", jdbcType=JdbcType.CHAR),
        @Result(column="ACTIVE_SINCE", property="activeSince", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FILTER_RULE", property="filterRule", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ReplicationApplierGlobalFilters> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationApplierGlobalFilters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationApplierGlobalFilters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default int insert(ReplicationApplierGlobalFilters record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierGlobalFilters, c ->
            c.map(filterName).toProperty("filterName")
            .map(configuredBy).toProperty("configuredBy")
            .map(activeSince).toProperty("activeSince")
            .map(filterRule).toProperty("filterRule")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default int insertSelective(ReplicationApplierGlobalFilters record) {
        return MyBatis3Utils.insert(this::insert, record, replicationApplierGlobalFilters, c ->
            c.map(filterName).toPropertyWhenPresent("filterName", record::getFilterName)
            .map(configuredBy).toPropertyWhenPresent("configuredBy", record::getConfiguredBy)
            .map(activeSince).toPropertyWhenPresent("activeSince", record::getActiveSince)
            .map(filterRule).toPropertyWhenPresent("filterRule", record::getFilterRule)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default Optional<ReplicationApplierGlobalFilters> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationApplierGlobalFilters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default List<ReplicationApplierGlobalFilters> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationApplierGlobalFilters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default List<ReplicationApplierGlobalFilters> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationApplierGlobalFilters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationApplierGlobalFilters, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationApplierGlobalFilters record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(filterName).equalTo(record::getFilterName)
                .set(configuredBy).equalTo(record::getConfiguredBy)
                .set(activeSince).equalTo(record::getActiveSince)
                .set(filterRule).equalTo(record::getFilterRule);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1498513+08:00", comments="Source Table: replication_applier_global_filters")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationApplierGlobalFilters record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(filterName).equalToWhenPresent(record::getFilterName)
                .set(configuredBy).equalToWhenPresent(record::getConfiguredBy)
                .set(activeSince).equalToWhenPresent(record::getActiveSince)
                .set(filterRule).equalToWhenPresent(record::getFilterRule);
    }
}