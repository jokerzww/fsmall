package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XIoGlobalByWaitByLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XIoGlobalByWaitByLatency;
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
public interface XIoGlobalByWaitByLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    BasicColumn[] selectList = BasicColumn.columnList(eventName, total, totalLatency, avgLatency, maxLatency, readLatency, writeLatency, miscLatency, countRead, totalRead, avgRead, countWrite, totalWritten, avgWritten);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XIoGlobalByWaitByLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XIoGlobalByWaitByLatencyResult")
    Optional<XIoGlobalByWaitByLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XIoGlobalByWaitByLatencyResult", value = {
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="read_latency", property="readLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="write_latency", property="writeLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="misc_latency", property="miscLatency", jdbcType=JdbcType.BIGINT),
        @Result(column="count_read", property="countRead", jdbcType=JdbcType.BIGINT),
        @Result(column="total_read", property="totalRead", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_read", property="avgRead", jdbcType=JdbcType.DECIMAL),
        @Result(column="count_write", property="countWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="total_written", property="totalWritten", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_written", property="avgWritten", jdbcType=JdbcType.DECIMAL)
    })
    List<XIoGlobalByWaitByLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XIoGlobalByWaitByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XIoGlobalByWaitByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default int insert(XIoGlobalByWaitByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XIoGlobalByWaitByLatency, c ->
            c.map(eventName).toProperty("eventName")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(maxLatency).toProperty("maxLatency")
            .map(readLatency).toProperty("readLatency")
            .map(writeLatency).toProperty("writeLatency")
            .map(miscLatency).toProperty("miscLatency")
            .map(countRead).toProperty("countRead")
            .map(totalRead).toProperty("totalRead")
            .map(avgRead).toProperty("avgRead")
            .map(countWrite).toProperty("countWrite")
            .map(totalWritten).toProperty("totalWritten")
            .map(avgWritten).toProperty("avgWritten")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default int insertSelective(XIoGlobalByWaitByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, XIoGlobalByWaitByLatency, c ->
            c.map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
            .map(readLatency).toPropertyWhenPresent("readLatency", record::getReadLatency)
            .map(writeLatency).toPropertyWhenPresent("writeLatency", record::getWriteLatency)
            .map(miscLatency).toPropertyWhenPresent("miscLatency", record::getMiscLatency)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(totalRead).toPropertyWhenPresent("totalRead", record::getTotalRead)
            .map(avgRead).toPropertyWhenPresent("avgRead", record::getAvgRead)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(totalWritten).toPropertyWhenPresent("totalWritten", record::getTotalWritten)
            .map(avgWritten).toPropertyWhenPresent("avgWritten", record::getAvgWritten)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default Optional<XIoGlobalByWaitByLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XIoGlobalByWaitByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default List<XIoGlobalByWaitByLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XIoGlobalByWaitByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default List<XIoGlobalByWaitByLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XIoGlobalByWaitByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XIoGlobalByWaitByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(XIoGlobalByWaitByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalTo(record::getEventName)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(maxLatency).equalTo(record::getMaxLatency)
                .set(readLatency).equalTo(record::getReadLatency)
                .set(writeLatency).equalTo(record::getWriteLatency)
                .set(miscLatency).equalTo(record::getMiscLatency)
                .set(countRead).equalTo(record::getCountRead)
                .set(totalRead).equalTo(record::getTotalRead)
                .set(avgRead).equalTo(record::getAvgRead)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(totalWritten).equalTo(record::getTotalWritten)
                .set(avgWritten).equalTo(record::getAvgWritten);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2559477+08:00", comments="Source Table: x$io_global_by_wait_by_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XIoGlobalByWaitByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalToWhenPresent(record::getEventName)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency)
                .set(readLatency).equalToWhenPresent(record::getReadLatency)
                .set(writeLatency).equalToWhenPresent(record::getWriteLatency)
                .set(miscLatency).equalToWhenPresent(record::getMiscLatency)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(totalRead).equalToWhenPresent(record::getTotalRead)
                .set(avgRead).equalToWhenPresent(record::getAvgRead)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(totalWritten).equalToWhenPresent(record::getTotalWritten)
                .set(avgWritten).equalToWhenPresent(record::getAvgWritten);
    }
}