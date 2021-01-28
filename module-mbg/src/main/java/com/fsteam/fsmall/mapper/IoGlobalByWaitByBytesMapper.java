package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.IoGlobalByWaitByBytesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.IoGlobalByWaitByBytes;
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
public interface IoGlobalByWaitByBytesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    BasicColumn[] selectList = BasicColumn.columnList(eventName, total, totalLatency, minLatency, avgLatency, maxLatency, countRead, totalRead, avgRead, countWrite, totalWritten, avgWritten, totalRequested);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<IoGlobalByWaitByBytes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("IoGlobalByWaitByBytesResult")
    Optional<IoGlobalByWaitByBytes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="IoGlobalByWaitByBytesResult", value = {
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="min_latency", property="minLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="avg_latency", property="avgLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_read", property="countRead", jdbcType=JdbcType.BIGINT),
        @Result(column="total_read", property="totalRead", jdbcType=JdbcType.VARCHAR),
        @Result(column="avg_read", property="avgRead", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_write", property="countWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="total_written", property="totalWritten", jdbcType=JdbcType.VARCHAR),
        @Result(column="avg_written", property="avgWritten", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_requested", property="totalRequested", jdbcType=JdbcType.VARCHAR)
    })
    List<IoGlobalByWaitByBytes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ioGlobalByWaitByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ioGlobalByWaitByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default int insert(IoGlobalByWaitByBytes record) {
        return MyBatis3Utils.insert(this::insert, record, ioGlobalByWaitByBytes, c ->
            c.map(eventName).toProperty("eventName")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(minLatency).toProperty("minLatency")
            .map(avgLatency).toProperty("avgLatency")
            .map(maxLatency).toProperty("maxLatency")
            .map(countRead).toProperty("countRead")
            .map(totalRead).toProperty("totalRead")
            .map(avgRead).toProperty("avgRead")
            .map(countWrite).toProperty("countWrite")
            .map(totalWritten).toProperty("totalWritten")
            .map(avgWritten).toProperty("avgWritten")
            .map(totalRequested).toProperty("totalRequested")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default int insertSelective(IoGlobalByWaitByBytes record) {
        return MyBatis3Utils.insert(this::insert, record, ioGlobalByWaitByBytes, c ->
            c.map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(minLatency).toPropertyWhenPresent("minLatency", record::getMinLatency)
            .map(avgLatency).toPropertyWhenPresent("avgLatency", record::getAvgLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(totalRead).toPropertyWhenPresent("totalRead", record::getTotalRead)
            .map(avgRead).toPropertyWhenPresent("avgRead", record::getAvgRead)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(totalWritten).toPropertyWhenPresent("totalWritten", record::getTotalWritten)
            .map(avgWritten).toPropertyWhenPresent("avgWritten", record::getAvgWritten)
            .map(totalRequested).toPropertyWhenPresent("totalRequested", record::getTotalRequested)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default Optional<IoGlobalByWaitByBytes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ioGlobalByWaitByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default List<IoGlobalByWaitByBytes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ioGlobalByWaitByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default List<IoGlobalByWaitByBytes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ioGlobalByWaitByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ioGlobalByWaitByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    static UpdateDSL<UpdateModel> updateAllColumns(IoGlobalByWaitByBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalTo(record::getEventName)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(minLatency).equalTo(record::getMinLatency)
                .set(avgLatency).equalTo(record::getAvgLatency)
                .set(maxLatency).equalTo(record::getMaxLatency)
                .set(countRead).equalTo(record::getCountRead)
                .set(totalRead).equalTo(record::getTotalRead)
                .set(avgRead).equalTo(record::getAvgRead)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(totalWritten).equalTo(record::getTotalWritten)
                .set(avgWritten).equalTo(record::getAvgWritten)
                .set(totalRequested).equalTo(record::getTotalRequested);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5101814+08:00", comments="Source Table: io_global_by_wait_by_bytes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(IoGlobalByWaitByBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalToWhenPresent(record::getEventName)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(minLatency).equalToWhenPresent(record::getMinLatency)
                .set(avgLatency).equalToWhenPresent(record::getAvgLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(totalRead).equalToWhenPresent(record::getTotalRead)
                .set(avgRead).equalToWhenPresent(record::getAvgRead)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(totalWritten).equalToWhenPresent(record::getTotalWritten)
                .set(avgWritten).equalToWhenPresent(record::getAvgWritten)
                .set(totalRequested).equalToWhenPresent(record::getTotalRequested);
    }
}