package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.UserSummaryByFileIoTypeDynamicSqlSupport.*;

import com.fsteam.fsmall.model.UserSummaryByFileIoType;
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
public interface UserSummaryByFileIoTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    BasicColumn[] selectList = BasicColumn.columnList(user, eventName, total, latency, maxLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3590417+08:00", comments="Source Table: user_summary_by_file_io_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserSummaryByFileIoType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserSummaryByFileIoTypeResult")
    Optional<UserSummaryByFileIoType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserSummaryByFileIoTypeResult", value = {
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="latency", property="latency", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.VARCHAR)
    })
    List<UserSummaryByFileIoType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default int insert(UserSummaryByFileIoType record) {
        return MyBatis3Utils.insert(this::insert, record, userSummaryByFileIoType, c ->
            c.map(user).toProperty("user")
            .map(eventName).toProperty("eventName")
            .map(total).toProperty("total")
            .map(latency).toProperty("latency")
            .map(maxLatency).toProperty("maxLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default int insertSelective(UserSummaryByFileIoType record) {
        return MyBatis3Utils.insert(this::insert, record, userSummaryByFileIoType, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(latency).toPropertyWhenPresent("latency", record::getLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default Optional<UserSummaryByFileIoType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default List<UserSummaryByFileIoType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default List<UserSummaryByFileIoType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    static UpdateDSL<UpdateModel> updateAllColumns(UserSummaryByFileIoType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(eventName).equalTo(record::getEventName)
                .set(total).equalTo(record::getTotal)
                .set(latency).equalTo(record::getLatency)
                .set(maxLatency).equalTo(record::getMaxLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3600434+08:00", comments="Source Table: user_summary_by_file_io_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserSummaryByFileIoType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(latency).equalToWhenPresent(record::getLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency);
    }
}