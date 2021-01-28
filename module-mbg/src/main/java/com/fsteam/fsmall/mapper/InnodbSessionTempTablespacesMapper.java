package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.InnodbSessionTempTablespacesDynamicSqlSupport.*;

import com.fsteam.fsmall.model.InnodbSessionTempTablespaces;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface InnodbSessionTempTablespacesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    BasicColumn[] selectList = BasicColumn.columnList(id, space, path, size, state, purpose);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<InnodbSessionTempTablespaces> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InnodbSessionTempTablespacesResult")
    Optional<InnodbSessionTempTablespaces> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InnodbSessionTempTablespacesResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="SIZE", property="size", jdbcType=JdbcType.BIGINT),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="PURPOSE", property="purpose", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbSessionTempTablespaces> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, innodbSessionTempTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, innodbSessionTempTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default int insert(InnodbSessionTempTablespaces record) {
        return MyBatis3Utils.insert(this::insert, record, innodbSessionTempTablespaces, c ->
            c.map(space).toProperty("space")
            .map(path).toProperty("path")
            .map(size).toProperty("size")
            .map(state).toProperty("state")
            .map(purpose).toProperty("purpose")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default int insertSelective(InnodbSessionTempTablespaces record) {
        return MyBatis3Utils.insert(this::insert, record, innodbSessionTempTablespaces, c ->
            c.map(space).toPropertyWhenPresent("space", record::getSpace)
            .map(path).toPropertyWhenPresent("path", record::getPath)
            .map(size).toPropertyWhenPresent("size", record::getSize)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(purpose).toPropertyWhenPresent("purpose", record::getPurpose)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default Optional<InnodbSessionTempTablespaces> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, innodbSessionTempTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default List<InnodbSessionTempTablespaces> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, innodbSessionTempTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default List<InnodbSessionTempTablespaces> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, innodbSessionTempTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, innodbSessionTempTablespaces, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    static UpdateDSL<UpdateModel> updateAllColumns(InnodbSessionTempTablespaces record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(space).equalTo(record::getSpace)
                .set(path).equalTo(record::getPath)
                .set(size).equalTo(record::getSize)
                .set(state).equalTo(record::getState)
                .set(purpose).equalTo(record::getPurpose);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3630463+08:00", comments="Source Table: INNODB_SESSION_TEMP_TABLESPACES")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InnodbSessionTempTablespaces record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(space).equalToWhenPresent(record::getSpace)
                .set(path).equalToWhenPresent(record::getPath)
                .set(size).equalToWhenPresent(record::getSize)
                .set(state).equalToWhenPresent(record::getState)
                .set(purpose).equalToWhenPresent(record::getPurpose);
    }
}