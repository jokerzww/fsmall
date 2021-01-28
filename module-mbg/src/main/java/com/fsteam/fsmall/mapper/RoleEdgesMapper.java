package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.RoleEdgesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.RoleEdges;
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
public interface RoleEdgesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    BasicColumn[] selectList = BasicColumn.columnList(fromHost, fromUser, toHost, toUser, withAdminOption);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RoleEdges> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleEdgesResult")
    Optional<RoleEdges> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleEdgesResult", value = {
        @Result(column="FROM_HOST", property="fromHost", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="FROM_USER", property="fromUser", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="TO_HOST", property="toHost", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="TO_USER", property="toUser", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="WITH_ADMIN_OPTION", property="withAdminOption", jdbcType=JdbcType.CHAR)
    })
    List<RoleEdges> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4991701+08:00", comments="Source Table: role_edges")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, roleEdges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, roleEdges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int deleteByPrimaryKey(String fromHost_, String fromUser_, String toHost_, String toUser_) {
        return delete(c -> 
            c.where(fromHost, isEqualTo(fromHost_))
            .and(fromUser, isEqualTo(fromUser_))
            .and(toHost, isEqualTo(toHost_))
            .and(toUser, isEqualTo(toUser_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int insert(RoleEdges record) {
        return MyBatis3Utils.insert(this::insert, record, roleEdges, c ->
            c.map(fromHost).toProperty("fromHost")
            .map(fromUser).toProperty("fromUser")
            .map(toHost).toProperty("toHost")
            .map(toUser).toProperty("toUser")
            .map(withAdminOption).toProperty("withAdminOption")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int insertSelective(RoleEdges record) {
        return MyBatis3Utils.insert(this::insert, record, roleEdges, c ->
            c.map(fromHost).toPropertyWhenPresent("fromHost", record::getFromHost)
            .map(fromUser).toPropertyWhenPresent("fromUser", record::getFromUser)
            .map(toHost).toPropertyWhenPresent("toHost", record::getToHost)
            .map(toUser).toPropertyWhenPresent("toUser", record::getToUser)
            .map(withAdminOption).toPropertyWhenPresent("withAdminOption", record::getWithAdminOption)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default Optional<RoleEdges> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, roleEdges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default List<RoleEdges> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, roleEdges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default List<RoleEdges> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, roleEdges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default Optional<RoleEdges> selectByPrimaryKey(String fromHost_, String fromUser_, String toHost_, String toUser_) {
        return selectOne(c ->
            c.where(fromHost, isEqualTo(fromHost_))
            .and(fromUser, isEqualTo(fromUser_))
            .and(toHost, isEqualTo(toHost_))
            .and(toUser, isEqualTo(toUser_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, roleEdges, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    static UpdateDSL<UpdateModel> updateAllColumns(RoleEdges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fromHost).equalTo(record::getFromHost)
                .set(fromUser).equalTo(record::getFromUser)
                .set(toHost).equalTo(record::getToHost)
                .set(toUser).equalTo(record::getToUser)
                .set(withAdminOption).equalTo(record::getWithAdminOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RoleEdges record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fromHost).equalToWhenPresent(record::getFromHost)
                .set(fromUser).equalToWhenPresent(record::getFromUser)
                .set(toHost).equalToWhenPresent(record::getToHost)
                .set(toUser).equalToWhenPresent(record::getToUser)
                .set(withAdminOption).equalToWhenPresent(record::getWithAdminOption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int updateByPrimaryKey(RoleEdges record) {
        return update(c ->
            c.set(withAdminOption).equalTo(record::getWithAdminOption)
            .where(fromHost, isEqualTo(record::getFromHost))
            .and(fromUser, isEqualTo(record::getFromUser))
            .and(toHost, isEqualTo(record::getToHost))
            .and(toUser, isEqualTo(record::getToUser))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5001704+08:00", comments="Source Table: role_edges")
    default int updateByPrimaryKeySelective(RoleEdges record) {
        return update(c ->
            c.set(withAdminOption).equalToWhenPresent(record::getWithAdminOption)
            .where(fromHost, isEqualTo(record::getFromHost))
            .and(fromUser, isEqualTo(record::getFromUser))
            .and(toHost, isEqualTo(record::getToHost))
            .and(toUser, isEqualTo(record::getToUser))
        );
    }
}