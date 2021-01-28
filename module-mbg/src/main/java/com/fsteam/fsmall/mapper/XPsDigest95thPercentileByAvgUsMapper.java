package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XPsDigest95thPercentileByAvgUsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XPsDigest95thPercentileByAvgUs;
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
public interface XPsDigest95thPercentileByAvgUsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    BasicColumn[] selectList = BasicColumn.columnList(avgUs, percentile);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XPsDigest95thPercentileByAvgUs> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XPsDigest95thPercentileByAvgUsResult")
    Optional<XPsDigest95thPercentileByAvgUs> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XPsDigest95thPercentileByAvgUsResult", value = {
        @Result(column="avg_us", property="avgUs", jdbcType=JdbcType.DECIMAL),
        @Result(column="percentile", property="percentile", jdbcType=JdbcType.DECIMAL)
    })
    List<XPsDigest95thPercentileByAvgUs> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XPsDigest95thPercentileByAvgUs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XPsDigest95thPercentileByAvgUs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default int insert(XPsDigest95thPercentileByAvgUs record) {
        return MyBatis3Utils.insert(this::insert, record, XPsDigest95thPercentileByAvgUs, c ->
            c.map(avgUs).toProperty("avgUs")
            .map(percentile).toProperty("percentile")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default int insertSelective(XPsDigest95thPercentileByAvgUs record) {
        return MyBatis3Utils.insert(this::insert, record, XPsDigest95thPercentileByAvgUs, c ->
            c.map(avgUs).toPropertyWhenPresent("avgUs", record::getAvgUs)
            .map(percentile).toPropertyWhenPresent("percentile", record::getPercentile)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default Optional<XPsDigest95thPercentileByAvgUs> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XPsDigest95thPercentileByAvgUs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default List<XPsDigest95thPercentileByAvgUs> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XPsDigest95thPercentileByAvgUs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default List<XPsDigest95thPercentileByAvgUs> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XPsDigest95thPercentileByAvgUs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XPsDigest95thPercentileByAvgUs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    static UpdateDSL<UpdateModel> updateAllColumns(XPsDigest95thPercentileByAvgUs record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(avgUs).equalTo(record::getAvgUs)
                .set(percentile).equalTo(record::getPercentile);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XPsDigest95thPercentileByAvgUs record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(avgUs).equalToWhenPresent(record::getAvgUs)
                .set(percentile).equalToWhenPresent(record::getPercentile);
    }
}