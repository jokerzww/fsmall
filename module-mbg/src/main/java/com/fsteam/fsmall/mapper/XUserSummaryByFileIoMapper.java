package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XUserSummaryByFileIoDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XUserSummaryByFileIo;
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
public interface XUserSummaryByFileIoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    BasicColumn[] selectList = BasicColumn.columnList(user, ios, ioLatency);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XUserSummaryByFileIo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XUserSummaryByFileIoResult")
    Optional<XUserSummaryByFileIo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XUserSummaryByFileIoResult", value = {
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="ios", property="ios", jdbcType=JdbcType.DECIMAL),
        @Result(column="io_latency", property="ioLatency", jdbcType=JdbcType.DECIMAL)
    })
    List<XUserSummaryByFileIo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XUserSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XUserSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default int insert(XUserSummaryByFileIo record) {
        return MyBatis3Utils.insert(this::insert, record, XUserSummaryByFileIo, c ->
            c.map(user).toProperty("user")
            .map(ios).toProperty("ios")
            .map(ioLatency).toProperty("ioLatency")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default int insertSelective(XUserSummaryByFileIo record) {
        return MyBatis3Utils.insert(this::insert, record, XUserSummaryByFileIo, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(ios).toPropertyWhenPresent("ios", record::getIos)
            .map(ioLatency).toPropertyWhenPresent("ioLatency", record::getIoLatency)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default Optional<XUserSummaryByFileIo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XUserSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default List<XUserSummaryByFileIo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XUserSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default List<XUserSummaryByFileIo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XUserSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XUserSummaryByFileIo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    static UpdateDSL<UpdateModel> updateAllColumns(XUserSummaryByFileIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(ios).equalTo(record::getIos)
                .set(ioLatency).equalTo(record::getIoLatency);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3370213+08:00", comments="Source Table: x$user_summary_by_file_io")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XUserSummaryByFileIo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(ios).equalToWhenPresent(record::getIos)
                .set(ioLatency).equalToWhenPresent(record::getIoLatency);
    }
}