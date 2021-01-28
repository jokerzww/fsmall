package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.VersionDynamicSqlSupport.*;

import com.fsteam.fsmall.model.Version;
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
public interface VersionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    BasicColumn[] selectList = BasicColumn.columnList(sysVersion, mysqlVersion);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Version> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VersionResult")
    Optional<Version> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VersionResult", value = {
        @Result(column="sys_version", property="sysVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="mysql_version", property="mysqlVersion", jdbcType=JdbcType.VARCHAR)
    })
    List<Version> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, version, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, version, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default int insert(Version record) {
        return MyBatis3Utils.insert(this::insert, record, version, c ->
            c.map(sysVersion).toProperty("sysVersion")
            .map(mysqlVersion).toProperty("mysqlVersion")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default int insertSelective(Version record) {
        return MyBatis3Utils.insert(this::insert, record, version, c ->
            c.map(sysVersion).toPropertyWhenPresent("sysVersion", record::getSysVersion)
            .map(mysqlVersion).toPropertyWhenPresent("mysqlVersion", record::getMysqlVersion)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default Optional<Version> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, version, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default List<Version> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, version, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default List<Version> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, version, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, version, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    static UpdateDSL<UpdateModel> updateAllColumns(Version record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sysVersion).equalTo(record::getSysVersion)
                .set(mysqlVersion).equalTo(record::getMysqlVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4281048+08:00", comments="Source Table: version")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Version record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sysVersion).equalToWhenPresent(record::getSysVersion)
                .set(mysqlVersion).equalToWhenPresent(record::getMysqlVersion);
    }
}