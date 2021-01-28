package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.InnodbCmpDynamicSqlSupport.*;

import com.fsteam.fsmall.model.InnodbCmp;
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
public interface InnodbCmpMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    BasicColumn[] selectList = BasicColumn.columnList(pageSize, compressOps, compressOpsOk, compressTime, uncompressOps, uncompressTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<InnodbCmp> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbCmpResult")
    Optional<InnodbCmp> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbCmpResult", value = {
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmp> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbCmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbCmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default int insert(InnodbCmp record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCmp, c ->
            c.map(pageSize).toProperty("pageSize")
            .map(compressOps).toProperty("compressOps")
            .map(compressOpsOk).toProperty("compressOpsOk")
            .map(compressTime).toProperty("compressTime")
            .map(uncompressOps).toProperty("uncompressOps")
            .map(uncompressTime).toProperty("uncompressTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default int insertSelective(InnodbCmp record) {
        return MyBatis3Utils.insert(this::insert, record, innodbCmp, c ->
            c.map(pageSize).toPropertyWhenPresent("pageSize", record::getPageSize)
            .map(compressOps).toPropertyWhenPresent("compressOps", record::getCompressOps)
            .map(compressOpsOk).toPropertyWhenPresent("compressOpsOk", record::getCompressOpsOk)
            .map(compressTime).toPropertyWhenPresent("compressTime", record::getCompressTime)
            .map(uncompressOps).toPropertyWhenPresent("uncompressOps", record::getUncompressOps)
            .map(uncompressTime).toPropertyWhenPresent("uncompressTime", record::getUncompressTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default Optional<InnodbCmp> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbCmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default List<InnodbCmp> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbCmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default List<InnodbCmp> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbCmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbCmp, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbCmp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pageSize).equalTo(record::getPageSize)
                .set(compressOps).equalTo(record::getCompressOps)
                .set(compressOpsOk).equalTo(record::getCompressOpsOk)
                .set(compressTime).equalTo(record::getCompressTime)
                .set(uncompressOps).equalTo(record::getUncompressOps)
                .set(uncompressTime).equalTo(record::getUncompressTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4441195+08:00", comments="Source Table: INNODB_CMP")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbCmp record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(pageSize).equalToWhenPresent(record::getPageSize)
                .set(compressOps).equalToWhenPresent(record::getCompressOps)
                .set(compressOpsOk).equalToWhenPresent(record::getCompressOpsOk)
                .set(compressTime).equalToWhenPresent(record::getCompressTime)
                .set(uncompressOps).equalToWhenPresent(record::getUncompressOps)
                .set(uncompressTime).equalToWhenPresent(record::getUncompressTime);
    }
}