package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.XInnodbBufferStatsByTableDynamicSqlSupport.*;

import com.fsteam.fsmall.model.XInnodbBufferStatsByTable;
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
public interface XInnodbBufferStatsByTableMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    BasicColumn[] selectList = BasicColumn.columnList(allocated, data, pages, pagesHashed, pagesOld, rowsCached, objectSchema, objectName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<XInnodbBufferStatsByTable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("XInnodbBufferStatsByTableResult")
    Optional<XInnodbBufferStatsByTable> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="XInnodbBufferStatsByTableResult", value = {
        @Result(column="allocated", property="allocated", jdbcType=JdbcType.DECIMAL),
        @Result(column="data", property="data", jdbcType=JdbcType.DECIMAL),
        @Result(column="pages", property="pages", jdbcType=JdbcType.BIGINT),
        @Result(column="pages_hashed", property="pagesHashed", jdbcType=JdbcType.BIGINT),
        @Result(column="pages_old", property="pagesOld", jdbcType=JdbcType.BIGINT),
        @Result(column="rows_cached", property="rowsCached", jdbcType=JdbcType.DECIMAL),
        @Result(column="object_schema", property="objectSchema", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="object_name", property="objectName", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<XInnodbBufferStatsByTable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, XInnodbBufferStatsByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, XInnodbBufferStatsByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default int insert(XInnodbBufferStatsByTable record) {
        return MyBatis3Utils.insert(this::insert, record, XInnodbBufferStatsByTable, c ->
            c.map(allocated).toProperty("allocated")
            .map(data).toProperty("data")
            .map(pages).toProperty("pages")
            .map(pagesHashed).toProperty("pagesHashed")
            .map(pagesOld).toProperty("pagesOld")
            .map(rowsCached).toProperty("rowsCached")
            .map(objectSchema).toProperty("objectSchema")
            .map(objectName).toProperty("objectName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default int insertSelective(XInnodbBufferStatsByTable record) {
        return MyBatis3Utils.insert(this::insert, record, XInnodbBufferStatsByTable, c ->
            c.map(allocated).toPropertyWhenPresent("allocated", record::getAllocated)
            .map(data).toPropertyWhenPresent("data", record::getData)
            .map(pages).toPropertyWhenPresent("pages", record::getPages)
            .map(pagesHashed).toPropertyWhenPresent("pagesHashed", record::getPagesHashed)
            .map(pagesOld).toPropertyWhenPresent("pagesOld", record::getPagesOld)
            .map(rowsCached).toPropertyWhenPresent("rowsCached", record::getRowsCached)
            .map(objectSchema).toPropertyWhenPresent("objectSchema", record::getObjectSchema)
            .map(objectName).toPropertyWhenPresent("objectName", record::getObjectName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default Optional<XInnodbBufferStatsByTable> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, XInnodbBufferStatsByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default List<XInnodbBufferStatsByTable> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, XInnodbBufferStatsByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default List<XInnodbBufferStatsByTable> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, XInnodbBufferStatsByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, XInnodbBufferStatsByTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    static UpdateDSL<UpdateModel> updateAllColumns(XInnodbBufferStatsByTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(allocated).equalTo(record::getAllocated)
                .set(data).equalTo(record::getData)
                .set(pages).equalTo(record::getPages)
                .set(pagesHashed).equalTo(record::getPagesHashed)
                .set(pagesOld).equalTo(record::getPagesOld)
                .set(rowsCached).equalTo(record::getRowsCached)
                .set(objectSchema).equalTo(record::getObjectSchema)
                .set(objectName).equalTo(record::getObjectName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3830644+08:00", comments="Source Table: x$innodb_buffer_stats_by_table")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(XInnodbBufferStatsByTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(allocated).equalToWhenPresent(record::getAllocated)
                .set(data).equalToWhenPresent(record::getData)
                .set(pages).equalToWhenPresent(record::getPages)
                .set(pagesHashed).equalToWhenPresent(record::getPagesHashed)
                .set(pagesOld).equalToWhenPresent(record::getPagesOld)
                .set(rowsCached).equalToWhenPresent(record::getRowsCached)
                .set(objectSchema).equalToWhenPresent(record::getObjectSchema)
                .set(objectName).equalToWhenPresent(record::getObjectName);
    }
}