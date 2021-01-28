package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XHostSummaryByFileIoDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XHostSummaryByFileIo;
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
public interface XHostSummaryByFileIoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    BasicColumn[] selectList = BasicColumn.columnList(host, ios, ioLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XHostSummaryByFileIo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XHostSummaryByFileIoResult")
    Optional<XHostSummaryByFileIo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: x$host_summary_by_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XHostSummaryByFileIoResult", value = {
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="ios", property="ios", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_latency", property="ioLatency", jdbcType=JdbcType.DECIMAL)
    })
    List<XHostSummaryByFileIo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XHostSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XHostSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default int insert(XHostSummaryByFileIo record) {
        return MyBatis3Utils.insert(this::insert, record, XHostSummaryByFileIo, c ->
            c.map(host).toProperty("host")
            .map(ios).toProperty("ios")
            .map(ioLatency).toProperty("ioLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default int insertSelective(XHostSummaryByFileIo record) {
        return MyBatis3Utils.insert(this::insert, record, XHostSummaryByFileIo, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(ios).toPropertyWhenPresent("ios", record::getIos)
            .map(ioLatency).toPropertyWhenPresent("ioLatency", record::getIoLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default Optional<XHostSummaryByFileIo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XHostSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default List<XHostSummaryByFileIo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XHostSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default List<XHostSummaryByFileIo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XHostSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XHostSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    static UpdateDSL<UpdateModel> updateAllColumns(XHostSummaryByFileIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(ios).equalTo(record::getIos)
                .set(ioLatency).equalTo(record::getIoLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3500337+08:00", comments="Source Table: x$host_summary_by_file_io")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XHostSummaryByFileIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(ios).equalToWhenPresent(record::getIos)
                .set(ioLatency).equalToWhenPresent(record::getIoLatency);
    }
}