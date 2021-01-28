package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.LatestFileIoDynamicSqlSupport.*;

import com.fsteam.fsmall.model.LatestFileIo;
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
public interface LatestFileIoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    BasicColumn[] selectList = BasicColumn.columnList(thread, file, latency, operation, requested);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LatestFileIo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LatestFileIoResult")
    Optional<LatestFileIo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LatestFileIoResult", value = {
        @Result(column="thread", property="thread", jdbcType=JdbcType.VARCHAR),
        @Result(column="file", property="file", jdbcType=JdbcType.VARCHAR),
        @Result(column="latency", property="latency", jdbcType=JdbcType.VARCHAR),
        @Result(column="operation", property="operation", jdbcType=JdbcType.VARCHAR),
        @Result(column="requested", property="requested", jdbcType=JdbcType.VARCHAR)
    })
    List<LatestFileIo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, latestFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, latestFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default int insert(LatestFileIo record) {
        return MyBatis3Utils.insert(this::insert, record, latestFileIo, c ->
            c.map(thread).toProperty("thread")
            .map(file).toProperty("file")
            .map(latency).toProperty("latency")
            .map(operation).toProperty("operation")
            .map(requested).toProperty("requested")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default int insertSelective(LatestFileIo record) {
        return MyBatis3Utils.insert(this::insert, record, latestFileIo, c ->
            c.map(thread).toPropertyWhenPresent("thread", record::getThread)
            .map(file).toPropertyWhenPresent("file", record::getFile)
            .map(latency).toPropertyWhenPresent("latency", record::getLatency)
            .map(operation).toPropertyWhenPresent("operation", record::getOperation)
            .map(requested).toPropertyWhenPresent("requested", record::getRequested)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default Optional<LatestFileIo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, latestFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default List<LatestFileIo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, latestFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default List<LatestFileIo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, latestFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, latestFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    static UpdateDSL<UpdateModel> updateAllColumns(LatestFileIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(thread).equalTo(record::getThread)
                .set(file).equalTo(record::getFile)
                .set(latency).equalTo(record::getLatency)
                .set(operation).equalTo(record::getOperation)
                .set(requested).equalTo(record::getRequested);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4160935+08:00", comments="Source Table: latest_file_io")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LatestFileIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(thread).equalToWhenPresent(record::getThread)
                .set(file).equalToWhenPresent(record::getFile)
                .set(latency).equalToWhenPresent(record::getLatency)
                .set(operation).equalToWhenPresent(record::getOperation)
                .set(requested).equalToWhenPresent(record::getRequested);
    }
}