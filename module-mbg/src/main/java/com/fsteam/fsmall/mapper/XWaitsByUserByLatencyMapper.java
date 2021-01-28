package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XWaitsByUserByLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XWaitsByUserByLatency;
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
public interface XWaitsByUserByLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    BasicColumn[] selectList = BasicColumn.columnList(user, event, total, totalLatency, avgLatency, maxLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XWaitsByUserByLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XWaitsByUserByLatencyResult")
    Optional<XWaitsByUserByLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2069042+08:00", comments="Source Table: x$waits_by_user_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XWaitsByUserByLatencyResult", value = {
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="event", property="event", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.BIGINT)
    })
    List<XWaitsByUserByLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XWaitsByUserByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XWaitsByUserByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default int insert(XWaitsByUserByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XWaitsByUserByLatency, c ->
            c.map(user).toProperty("user")
            .map(event).toProperty("event")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(maxLatency).toProperty("maxLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default int insertSelective(XWaitsByUserByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XWaitsByUserByLatency, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(event).toPropertyWhenPresent("event", record::getEvent)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default Optional<XWaitsByUserByLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XWaitsByUserByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default List<XWaitsByUserByLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XWaitsByUserByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default List<XWaitsByUserByLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XWaitsByUserByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XWaitsByUserByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(XWaitsByUserByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(event).equalTo(record::getEvent)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(maxLatency).equalTo(record::getMaxLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source Table: x$waits_by_user_by_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XWaitsByUserByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(event).equalToWhenPresent(record::getEvent)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency);
    }
}