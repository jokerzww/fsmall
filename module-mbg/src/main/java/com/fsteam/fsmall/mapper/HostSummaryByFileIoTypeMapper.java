package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HostSummaryByFileIoTypeDynamicSqlSupport.*;

import com.fsteam.fsmall.model.HostSummaryByFileIoType;
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
public interface HostSummaryByFileIoTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    BasicColumn[] selectList = BasicColumn.columnList(host, eventName, total, totalLatency, maxLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HostSummaryByFileIoType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HostSummaryByFileIoTypeResult")
    Optional<HostSummaryByFileIoType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HostSummaryByFileIoTypeResult", value = {
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_name", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.VARCHAR)
    })
    List<HostSummaryByFileIoType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hostSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hostSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default int insert(HostSummaryByFileIoType record) {
        return MyBatis3Utils.insert(this::insert, record, hostSummaryByFileIoType, c ->
            c.map(host).toProperty("host")
            .map(eventName).toProperty("eventName")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(maxLatency).toProperty("maxLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default int insertSelective(HostSummaryByFileIoType record) {
        return MyBatis3Utils.insert(this::insert, record, hostSummaryByFileIoType, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(eventName).toPropertyWhenPresent("eventName", record::getEventName)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default Optional<HostSummaryByFileIoType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hostSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default List<HostSummaryByFileIoType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hostSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default List<HostSummaryByFileIoType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hostSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hostSummaryByFileIoType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    static UpdateDSL<UpdateModel> updateAllColumns(HostSummaryByFileIoType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(eventName).equalTo(record::getEventName)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(maxLatency).equalTo(record::getMaxLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4150929+08:00", comments="Source Table: host_summary_by_file_io_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HostSummaryByFileIoType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(eventName).equalToWhenPresent(record::getEventName)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency);
    }
}