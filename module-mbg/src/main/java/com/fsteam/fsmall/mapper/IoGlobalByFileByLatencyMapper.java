package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.IoGlobalByFileByLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.IoGlobalByFileByLatency;
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
public interface IoGlobalByFileByLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    BasicColumn[] selectList = BasicColumn.columnList(file, total, totalLatency, countRead, readLatency, countWrite, writeLatency, countMisc, miscLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<IoGlobalByFileByLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("IoGlobalByFileByLatencyResult")
    Optional<IoGlobalByFileByLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="IoGlobalByFileByLatencyResult", value = {
        @Result(column="file", property="file", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_read", property="countRead", jdbcType=JdbcType.BIGINT),
        @Result(column="read_latency", property="readLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_write", property="countWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="write_latency", property="writeLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_misc", property="countMisc", jdbcType=JdbcType.BIGINT),
        @Result(column="misc_latency", property="miscLatency", jdbcType=JdbcType.VARCHAR)
    })
    List<IoGlobalByFileByLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ioGlobalByFileByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ioGlobalByFileByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default int insert(IoGlobalByFileByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, ioGlobalByFileByLatency, c ->
            c.map(file).toProperty("file")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(countRead).toProperty("countRead")
            .map(readLatency).toProperty("readLatency")
            .map(countWrite).toProperty("countWrite")
            .map(writeLatency).toProperty("writeLatency")
            .map(countMisc).toProperty("countMisc")
            .map(miscLatency).toProperty("miscLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default int insertSelective(IoGlobalByFileByLatency record) {
        return MyBatis3Utils.insert(this::insert, record, ioGlobalByFileByLatency, c ->
            c.map(file).toPropertyWhenPresent("file", record::getFile)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(readLatency).toPropertyWhenPresent("readLatency", record::getReadLatency)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(writeLatency).toPropertyWhenPresent("writeLatency", record::getWriteLatency)
            .map(countMisc).toPropertyWhenPresent("countMisc", record::getCountMisc)
            .map(miscLatency).toPropertyWhenPresent("miscLatency", record::getMiscLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default Optional<IoGlobalByFileByLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, ioGlobalByFileByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default List<IoGlobalByFileByLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, ioGlobalByFileByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default List<IoGlobalByFileByLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, ioGlobalByFileByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ioGlobalByFileByLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(IoGlobalByFileByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(file).equalTo(record::getFile)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(countRead).equalTo(record::getCountRead)
                .set(readLatency).equalTo(record::getReadLatency)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(writeLatency).equalTo(record::getWriteLatency)
                .set(countMisc).equalTo(record::getCountMisc)
                .set(miscLatency).equalTo(record::getMiscLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1828839+08:00", comments="Source Table: io_global_by_file_by_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(IoGlobalByFileByLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(file).equalToWhenPresent(record::getFile)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(readLatency).equalToWhenPresent(record::getReadLatency)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(writeLatency).equalToWhenPresent(record::getWriteLatency)
                .set(countMisc).equalToWhenPresent(record::getCountMisc)
                .set(miscLatency).equalToWhenPresent(record::getMiscLatency);
    }
}