package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SocketSummaryByEventNameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SocketSummaryByEventName;
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
public interface SocketSummaryByEventNameMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    BasicColumn[] selectList = BasicColumn.columnList(eventName, countStar, sumTimerWait, minTimerWait, avgTimerWait, maxTimerWait, countRead, sumTimerRead, minTimerRead, avgTimerRead, maxTimerRead, sumNumberOfBytesRead, countWrite, sumTimerWrite, minTimerWrite, avgTimerWrite, maxTimerWrite, sumNumberOfBytesWrite, countMisc, sumTimerMisc, minTimerMisc, avgTimerMisc, maxTimerMisc);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SocketSummaryByEventName> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SocketSummaryByEventNameResult")
    Optional<SocketSummaryByEventName> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SocketSummaryByEventNameResult", value = {
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COUNT_STAR", property="countStar", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WAIT", property="sumTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WAIT", property="minTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WAIT", property="avgTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WAIT", property="maxTimerWait", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_READ", property="countRead", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_READ", property="sumTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_READ", property="minTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_READ", property="avgTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_READ", property="maxTimerRead", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NUMBER_OF_BYTES_READ", property="sumNumberOfBytesRead", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_WRITE", property="countWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_WRITE", property="sumTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_WRITE", property="minTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_WRITE", property="avgTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_WRITE", property="maxTimerWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_NUMBER_OF_BYTES_WRITE", property="sumNumberOfBytesWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="COUNT_MISC", property="countMisc", jdbcType=JdbcType.BIGINT),
        @Result(column="SUM_TIMER_MISC", property="sumTimerMisc", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_TIMER_MISC", property="minTimerMisc", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_TIMER_MISC", property="avgTimerMisc", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_TIMER_MISC", property="maxTimerMisc", jdbcType=JdbcType.BIGINT)
    })
    List<SocketSummaryByEventName> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, socketSummaryByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, socketSummaryByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default int deleteByPrimaryKey(String eventName_) {
        return delete(c -> 
            c.where(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default int insert(SocketSummaryByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, socketSummaryByEventName, c ->
            c.map(eventName).toProperty("eventName")
            .map(countStar).toProperty("countStar")
            .map(sumTimerWait).toProperty("sumTimerWait")
            .map(minTimerWait).toProperty("minTimerWait")
            .map(avgTimerWait).toProperty("avgTimerWait")
            .map(maxTimerWait).toProperty("maxTimerWait")
            .map(countRead).toProperty("countRead")
            .map(sumTimerRead).toProperty("sumTimerRead")
            .map(minTimerRead).toProperty("minTimerRead")
            .map(avgTimerRead).toProperty("avgTimerRead")
            .map(maxTimerRead).toProperty("maxTimerRead")
            .map(sumNumberOfBytesRead).toProperty("sumNumberOfBytesRead")
            .map(countWrite).toProperty("countWrite")
            .map(sumTimerWrite).toProperty("sumTimerWrite")
            .map(minTimerWrite).toProperty("minTimerWrite")
            .map(avgTimerWrite).toProperty("avgTimerWrite")
            .map(maxTimerWrite).toProperty("maxTimerWrite")
            .map(sumNumberOfBytesWrite).toProperty("sumNumberOfBytesWrite")
            .map(countMisc).toProperty("countMisc")
            .map(sumTimerMisc).toProperty("sumTimerMisc")
            .map(minTimerMisc).toProperty("minTimerMisc")
            .map(avgTimerMisc).toProperty("avgTimerMisc")
            .map(maxTimerMisc).toProperty("maxTimerMisc")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default int insertSelective(SocketSummaryByEventName record) {
        return MyBatis3Utils.insert(this::insert, record, socketSummaryByEventName, c ->
            c.map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(countStar).toPropertyWhenPresent("countStar", record::getCountStar)
            .map(sumTimerWait).toPropertyWhenPresent("sumTimerWait", record::getSumTimerWait)
            .map(minTimerWait).toPropertyWhenPresent("minTimerWait", record::getMinTimerWait)
            .map(avgTimerWait).toPropertyWhenPresent("avgTimerWait", record::getAvgTimerWait)
            .map(maxTimerWait).toPropertyWhenPresent("maxTimerWait", record::getMaxTimerWait)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(sumTimerRead).toPropertyWhenPresent("sumTimerRead", record::getSumTimerRead)
            .map(minTimerRead).toPropertyWhenPresent("minTimerRead", record::getMinTimerRead)
            .map(avgTimerRead).toPropertyWhenPresent("avgTimerRead", record::getAvgTimerRead)
            .map(maxTimerRead).toPropertyWhenPresent("maxTimerRead", record::getMaxTimerRead)
            .map(sumNumberOfBytesRead).toPropertyWhenPresent("sumNumberOfBytesRead", record::getSumNumberOfBytesRead)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(sumTimerWrite).toPropertyWhenPresent("sumTimerWrite", record::getSumTimerWrite)
            .map(minTimerWrite).toPropertyWhenPresent("minTimerWrite", record::getMinTimerWrite)
            .map(avgTimerWrite).toPropertyWhenPresent("avgTimerWrite", record::getAvgTimerWrite)
            .map(maxTimerWrite).toPropertyWhenPresent("maxTimerWrite", record::getMaxTimerWrite)
            .map(sumNumberOfBytesWrite).toPropertyWhenPresent("sumNumberOfBytesWrite", record::getSumNumberOfBytesWrite)
            .map(countMisc).toPropertyWhenPresent("countMisc", record::getCountMisc)
            .map(sumTimerMisc).toPropertyWhenPresent("sumTimerMisc", record::getSumTimerMisc)
            .map(minTimerMisc).toPropertyWhenPresent("minTimerMisc", record::getMinTimerMisc)
            .map(avgTimerMisc).toPropertyWhenPresent("avgTimerMisc", record::getAvgTimerMisc)
            .map(maxTimerMisc).toPropertyWhenPresent("maxTimerMisc", record::getMaxTimerMisc)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default Optional<SocketSummaryByEventName> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, socketSummaryByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2919807+08:00", comments="Source Table: socket_summary_by_event_name")
    default List<SocketSummaryByEventName> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, socketSummaryByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    default List<SocketSummaryByEventName> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, socketSummaryByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    default Optional<SocketSummaryByEventName> selectByPrimaryKey(String eventName_) {
        return selectOne(c ->
            c.where(eventName, isEqualTo(eventName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, socketSummaryByEventName, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    static UpdateDSL<UpdateModel> updateAllColumns(SocketSummaryByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalTo(record::getEventName)
                .set(countStar).equalTo(record::getCountStar)
                .set(sumTimerWait).equalTo(record::getSumTimerWait)
                .set(minTimerWait).equalTo(record::getMinTimerWait)
                .set(avgTimerWait).equalTo(record::getAvgTimerWait)
                .set(maxTimerWait).equalTo(record::getMaxTimerWait)
                .set(countRead).equalTo(record::getCountRead)
                .set(sumTimerRead).equalTo(record::getSumTimerRead)
                .set(minTimerRead).equalTo(record::getMinTimerRead)
                .set(avgTimerRead).equalTo(record::getAvgTimerRead)
                .set(maxTimerRead).equalTo(record::getMaxTimerRead)
                .set(sumNumberOfBytesRead).equalTo(record::getSumNumberOfBytesRead)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(sumTimerWrite).equalTo(record::getSumTimerWrite)
                .set(minTimerWrite).equalTo(record::getMinTimerWrite)
                .set(avgTimerWrite).equalTo(record::getAvgTimerWrite)
                .set(maxTimerWrite).equalTo(record::getMaxTimerWrite)
                .set(sumNumberOfBytesWrite).equalTo(record::getSumNumberOfBytesWrite)
                .set(countMisc).equalTo(record::getCountMisc)
                .set(sumTimerMisc).equalTo(record::getSumTimerMisc)
                .set(minTimerMisc).equalTo(record::getMinTimerMisc)
                .set(avgTimerMisc).equalTo(record::getAvgTimerMisc)
                .set(maxTimerMisc).equalTo(record::getMaxTimerMisc);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SocketSummaryByEventName record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eventName).equalToWhenPresent(record::getEventName)
                .set(countStar).equalToWhenPresent(record::getCountStar)
                .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
                .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
                .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
                .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(sumTimerRead).equalToWhenPresent(record::getSumTimerRead)
                .set(minTimerRead).equalToWhenPresent(record::getMinTimerRead)
                .set(avgTimerRead).equalToWhenPresent(record::getAvgTimerRead)
                .set(maxTimerRead).equalToWhenPresent(record::getMaxTimerRead)
                .set(sumNumberOfBytesRead).equalToWhenPresent(record::getSumNumberOfBytesRead)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(sumTimerWrite).equalToWhenPresent(record::getSumTimerWrite)
                .set(minTimerWrite).equalToWhenPresent(record::getMinTimerWrite)
                .set(avgTimerWrite).equalToWhenPresent(record::getAvgTimerWrite)
                .set(maxTimerWrite).equalToWhenPresent(record::getMaxTimerWrite)
                .set(sumNumberOfBytesWrite).equalToWhenPresent(record::getSumNumberOfBytesWrite)
                .set(countMisc).equalToWhenPresent(record::getCountMisc)
                .set(sumTimerMisc).equalToWhenPresent(record::getSumTimerMisc)
                .set(minTimerMisc).equalToWhenPresent(record::getMinTimerMisc)
                .set(avgTimerMisc).equalToWhenPresent(record::getAvgTimerMisc)
                .set(maxTimerMisc).equalToWhenPresent(record::getMaxTimerMisc);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    default int updateByPrimaryKey(SocketSummaryByEventName record) {
        return update(c ->
            c.set(countStar).equalTo(record::getCountStar)
            .set(sumTimerWait).equalTo(record::getSumTimerWait)
            .set(minTimerWait).equalTo(record::getMinTimerWait)
            .set(avgTimerWait).equalTo(record::getAvgTimerWait)
            .set(maxTimerWait).equalTo(record::getMaxTimerWait)
            .set(countRead).equalTo(record::getCountRead)
            .set(sumTimerRead).equalTo(record::getSumTimerRead)
            .set(minTimerRead).equalTo(record::getMinTimerRead)
            .set(avgTimerRead).equalTo(record::getAvgTimerRead)
            .set(maxTimerRead).equalTo(record::getMaxTimerRead)
            .set(sumNumberOfBytesRead).equalTo(record::getSumNumberOfBytesRead)
            .set(countWrite).equalTo(record::getCountWrite)
            .set(sumTimerWrite).equalTo(record::getSumTimerWrite)
            .set(minTimerWrite).equalTo(record::getMinTimerWrite)
            .set(avgTimerWrite).equalTo(record::getAvgTimerWrite)
            .set(maxTimerWrite).equalTo(record::getMaxTimerWrite)
            .set(sumNumberOfBytesWrite).equalTo(record::getSumNumberOfBytesWrite)
            .set(countMisc).equalTo(record::getCountMisc)
            .set(sumTimerMisc).equalTo(record::getSumTimerMisc)
            .set(minTimerMisc).equalTo(record::getMinTimerMisc)
            .set(avgTimerMisc).equalTo(record::getAvgTimerMisc)
            .set(maxTimerMisc).equalTo(record::getMaxTimerMisc)
            .where(eventName, isEqualTo(record::getEventName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2929815+08:00", comments="Source Table: socket_summary_by_event_name")
    default int updateByPrimaryKeySelective(SocketSummaryByEventName record) {
        return update(c ->
            c.set(countStar).equalToWhenPresent(record::getCountStar)
            .set(sumTimerWait).equalToWhenPresent(record::getSumTimerWait)
            .set(minTimerWait).equalToWhenPresent(record::getMinTimerWait)
            .set(avgTimerWait).equalToWhenPresent(record::getAvgTimerWait)
            .set(maxTimerWait).equalToWhenPresent(record::getMaxTimerWait)
            .set(countRead).equalToWhenPresent(record::getCountRead)
            .set(sumTimerRead).equalToWhenPresent(record::getSumTimerRead)
            .set(minTimerRead).equalToWhenPresent(record::getMinTimerRead)
            .set(avgTimerRead).equalToWhenPresent(record::getAvgTimerRead)
            .set(maxTimerRead).equalToWhenPresent(record::getMaxTimerRead)
            .set(sumNumberOfBytesRead).equalToWhenPresent(record::getSumNumberOfBytesRead)
            .set(countWrite).equalToWhenPresent(record::getCountWrite)
            .set(sumTimerWrite).equalToWhenPresent(record::getSumTimerWrite)
            .set(minTimerWrite).equalToWhenPresent(record::getMinTimerWrite)
            .set(avgTimerWrite).equalToWhenPresent(record::getAvgTimerWrite)
            .set(maxTimerWrite).equalToWhenPresent(record::getMaxTimerWrite)
            .set(sumNumberOfBytesWrite).equalToWhenPresent(record::getSumNumberOfBytesWrite)
            .set(countMisc).equalToWhenPresent(record::getCountMisc)
            .set(sumTimerMisc).equalToWhenPresent(record::getSumTimerMisc)
            .set(minTimerMisc).equalToWhenPresent(record::getMinTimerMisc)
            .set(avgTimerMisc).equalToWhenPresent(record::getAvgTimerMisc)
            .set(maxTimerMisc).equalToWhenPresent(record::getMaxTimerMisc)
            .where(eventName, isEqualTo(record::getEventName))
        );
    }
}