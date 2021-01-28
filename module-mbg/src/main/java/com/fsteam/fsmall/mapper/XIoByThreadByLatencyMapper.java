package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XIoByThreadByLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XIoByThreadByLatency;
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
public interface XIoByThreadByLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    BasicColumn[] selectList = BasicColumn.columnList(user, total, totalLatency, minLatency, avgLatency, maxLatency, threadId, processlistId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XIoByThreadByLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XIoByThreadByLatencyResult")
    Optional<XIoByThreadByLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XIoByThreadByLatencyResult", value = {
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.DECIMAL),
        @Result(column="min_latency", property="minLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="processlist_id", property="processlistId", jdbcType=JdbcType.BIGINT)
    })
    List<XIoByThreadByLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XIoByThreadByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XIoByThreadByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3320186+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default int insert(XIoByThreadByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XIoByThreadByLatency, c ->
            c.map(user).toProperty("user")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(minLatency).toProperty("minLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(maxLatency).toProperty("maxLatency")
            .map(threadId).toProperty("threadId")
            .map(processlistId).toProperty("processlistId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default int insertSelective(XIoByThreadByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XIoByThreadByLatency, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(minLatency).toPropertyWhenPresent("minLatency", record::getMinLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
            .map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(processlistId).toPropertyWhenPresent("processlistId", record::getProcesslistId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default Optional<XIoByThreadByLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XIoByThreadByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default List<XIoByThreadByLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XIoByThreadByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default List<XIoByThreadByLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XIoByThreadByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XIoByThreadByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(XIoByThreadByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(minLatency).equalTo(record::getMinLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(maxLatency).equalTo(record::getMaxLatency)
                .set(threadId).equalTo(record::getThreadId)
                .set(processlistId).equalTo(record::getProcesslistId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3330189+08:00", comments="Source Table: x$io_by_thread_by_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XIoByThreadByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(minLatency).equalToWhenPresent(record::getMinLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency)
                .set(threadId).equalToWhenPresent(record::getThreadId)
                .set(processlistId).equalToWhenPresent(record::getProcesslistId);
    }
}