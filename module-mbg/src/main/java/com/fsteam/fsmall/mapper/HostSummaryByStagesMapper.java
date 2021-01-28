package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HostSummaryByStagesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.HostSummaryByStages;
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
public interface HostSummaryByStagesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    BasicColumn[] selectList = BasicColumn.columnList(host, eventName, total, totalLatency, avgLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HostSummaryByStages> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HostSummaryByStagesResult")
    Optional<HostSummaryByStages> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HostSummaryByStagesResult", value = {
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.VARCHAR)
    })
    List<HostSummaryByStages> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    default int insert(HostSummaryByStages record) {
        return MyBatis3Utils.insert(this::insert, record, hostSummaryByStages, c ->
            c.map(host).toProperty("host")
            .map(eventName).toProperty("eventName")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(avgLatency).toProperty("avgLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2969849+08:00", comments="Source Table: host_summary_by_stages")
    default int insertSelective(HostSummaryByStages record) {
        return MyBatis3Utils.insert(this::insert, record, hostSummaryByStages, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    default Optional<HostSummaryByStages> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    default List<HostSummaryByStages> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    default List<HostSummaryByStages> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hostSummaryByStages, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    static UpdateDSL<UpdateModel> updateAllColumns(HostSummaryByStages record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(eventName).equalTo(record::getEventName)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(avgLatency).equalTo(record::getAvgLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2979877+08:00", comments="Source Table: host_summary_by_stages")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HostSummaryByStages record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency);
    }
}