package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XIoGlobalByFileByBytesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XIoGlobalByFileByBytes;
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
public interface XIoGlobalByFileByBytesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    BasicColumn[] selectList = BasicColumn.columnList(file, countRead, totalRead, avgRead, countWrite, totalWritten, avgWrite, total, writePct);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XIoGlobalByFileByBytes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XIoGlobalByFileByBytesResult")
    Optional<XIoGlobalByFileByBytes> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XIoGlobalByFileByBytesResult", value = {
        @Result(column="file", property="file", jdbcType=JdbcType.VARCHAR),
        @Result(column="count_read", property="countRead", jdbcType=JdbcType.BIGINT),
        @Result(column="total_read", property="totalRead", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_read", property="avgRead", jdbcType=JdbcType.DECIMAL),
        @Result(column="count_write", property="countWrite", jdbcType=JdbcType.BIGINT),
        @Result(column="total_written", property="totalWritten", jdbcType=JdbcType.BIGINT),
        @Result(column="avg_write", property="avgWrite", jdbcType=JdbcType.DECIMAL),
        @Result(column="total", property="total", jdbcType=JdbcType.BIGINT),
        @Result(column="write_pct", property="writePct", jdbcType=JdbcType.DECIMAL)
    })
    List<XIoGlobalByFileByBytes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XIoGlobalByFileByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XIoGlobalByFileByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default int insert(XIoGlobalByFileByBytes record) {
        return MyBatis3Utils.insert(this::insert, record, XIoGlobalByFileByBytes, c ->
            c.map(file).toProperty("file")
            .map(countRead).toProperty("countRead")
            .map(totalRead).toProperty("totalRead")
            .map(avgRead).toProperty("avgRead")
            .map(countWrite).toProperty("countWrite")
            .map(totalWritten).toProperty("totalWritten")
            .map(avgWrite).toProperty("avgWrite")
            .map(total).toProperty("total")
            .map(writePct).toProperty("writePct")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default int insertSelective(XIoGlobalByFileByBytes record) {
        return MyBatis3Utils.insert(this::insert, record, XIoGlobalByFileByBytes, c ->
            c.map(file).toPropertyWhenPresent("file", record::getFile)
            .map(countRead).toPropertyWhenPresent("countRead", record::getCountRead)
            .map(totalRead).toPropertyWhenPresent("totalRead", record::getTotalRead)
            .map(avgRead).toPropertyWhenPresent("avgRead", record::getAvgRead)
            .map(countWrite).toPropertyWhenPresent("countWrite", record::getCountWrite)
            .map(totalWritten).toPropertyWhenPresent("totalWritten", record::getTotalWritten)
            .map(avgWrite).toPropertyWhenPresent("avgWrite", record::getAvgWrite)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(writePct).toPropertyWhenPresent("writePct", record::getWritePct)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default Optional<XIoGlobalByFileByBytes> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XIoGlobalByFileByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default List<XIoGlobalByFileByBytes> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XIoGlobalByFileByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default List<XIoGlobalByFileByBytes> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XIoGlobalByFileByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XIoGlobalByFileByBytes, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    static UpdateDSL<UpdateModel> updateAllColumns(XIoGlobalByFileByBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(file).equalTo(record::getFile)
                .set(countRead).equalTo(record::getCountRead)
                .set(totalRead).equalTo(record::getTotalRead)
                .set(avgRead).equalTo(record::getAvgRead)
                .set(countWrite).equalTo(record::getCountWrite)
                .set(totalWritten).equalTo(record::getTotalWritten)
                .set(avgWrite).equalTo(record::getAvgWrite)
                .set(total).equalTo(record::getTotal)
                .set(writePct).equalTo(record::getWritePct);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1888887+08:00", comments="Source Table: x$io_global_by_file_by_bytes")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XIoGlobalByFileByBytes record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(file).equalToWhenPresent(record::getFile)
                .set(countRead).equalToWhenPresent(record::getCountRead)
                .set(totalRead).equalToWhenPresent(record::getTotalRead)
                .set(avgRead).equalToWhenPresent(record::getAvgRead)
                .set(countWrite).equalToWhenPresent(record::getCountWrite)
                .set(totalWritten).equalToWhenPresent(record::getTotalWritten)
                .set(avgWrite).equalToWhenPresent(record::getAvgWrite)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(writePct).equalToWhenPresent(record::getWritePct);
    }
}