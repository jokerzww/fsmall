package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XHostSummaryByStagesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XHostSummaryByStages;
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
public interface XHostSummaryByStagesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    BasicColumn[] selectList = BasicColumn.columnList(host, eventName, total, totalLatency, avgLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XHostSummaryByStages> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XHostSummaryByStagesResult")
    Optional<XHostSummaryByStages> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XHostSummaryByStagesResult", value = {
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.BIGINT)
    })
    List<XHostSummaryByStages> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XHostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XHostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default int insert(XHostSummaryByStages record) {
        return MyBatis3Utils.insert(this::insert, record, XHostSummaryByStages, c ->
            c.map(host).toProperty("host")
            .map(eventName).toProperty("eventName")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(avgLatency).toProperty("avgLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default int insertSelective(XHostSummaryByStages record) {
        return MyBatis3Utils.insert(this::insert, record, XHostSummaryByStages, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default Optional<XHostSummaryByStages> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XHostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default List<XHostSummaryByStages> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XHostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default List<XHostSummaryByStages> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XHostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XHostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    static UpdateDSL<UpdateModel> updateAllColumns(XHostSummaryByStages record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(eventName).equalTo(record::getEventName)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(avgLatency).equalTo(record::getAvgLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5311987+08:00", comments="Source Table: x$host_summary_by_stages")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XHostSummaryByStages record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency);
    }
}