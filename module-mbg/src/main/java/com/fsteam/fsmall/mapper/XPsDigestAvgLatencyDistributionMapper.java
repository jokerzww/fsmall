package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XPsDigestAvgLatencyDistributionDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XPsDigestAvgLatencyDistribution;
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
public interface XPsDigestAvgLatencyDistributionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    BasicColumn[] selectList = BasicColumn.columnList(cnt, avgUs);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XPsDigestAvgLatencyDistribution> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XPsDigestAvgLatencyDistributionResult")
    Optional<XPsDigestAvgLatencyDistribution> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XPsDigestAvgLatencyDistributionResult", value = {
        @Result(column="cnt", property="cnt", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_us", property="avgUs", jdbcType=JdbcType.DECIMAL)
    })
    List<XPsDigestAvgLatencyDistribution> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XPsDigestAvgLatencyDistribution, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XPsDigestAvgLatencyDistribution, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default int insert(XPsDigestAvgLatencyDistribution record) {
        return MyBatis3Utils.insert(this::insert, record, XPsDigestAvgLatencyDistribution, c ->
            c.map(cnt).toProperty("cnt")
            .map(avgUs).toProperty("avgUs")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default int insertSelective(XPsDigestAvgLatencyDistribution record) {
        return MyBatis3Utils.insert(this::insert, record, XPsDigestAvgLatencyDistribution, c ->
            c.map(cnt).toPropertyWhenPresent("cnt", record::getCnt)
            .map(avgUs).toPropertyWhenPresent("avgUs", record::getAvgUs)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default Optional<XPsDigestAvgLatencyDistribution> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XPsDigestAvgLatencyDistribution, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default List<XPsDigestAvgLatencyDistribution> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XPsDigestAvgLatencyDistribution, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default List<XPsDigestAvgLatencyDistribution> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XPsDigestAvgLatencyDistribution, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XPsDigestAvgLatencyDistribution, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    static UpdateDSL<UpdateModel> updateAllColumns(XPsDigestAvgLatencyDistribution record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(cnt).equalTo(record::getCnt)
                .set(avgUs).equalTo(record::getAvgUs);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XPsDigestAvgLatencyDistribution record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(cnt).equalToWhenPresent(record::getCnt)
                .set(avgUs).equalToWhenPresent(record::getAvgUs);
    }
}