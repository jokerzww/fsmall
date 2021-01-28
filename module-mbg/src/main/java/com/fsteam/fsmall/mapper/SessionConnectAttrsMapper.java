package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SessionConnectAttrsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.SessionConnectAttrs;
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
public interface SessionConnectAttrsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    BasicColumn[] selectList = BasicColumn.columnList(processlistId, attrName, attrValue, ordinalPosition);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SessionConnectAttrs> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3480316+08:00", comments="Source Table: session_connect_attrs")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SessionConnectAttrsResult")
    Optional<SessionConnectAttrs> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SessionConnectAttrsResult", value = {
        @Result(column="PROCESSLIST_ID", property="processlistId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ATTR_NAME", property="attrName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ATTR_VALUE", property="attrValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER)
    })
    List<SessionConnectAttrs> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sessionConnectAttrs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sessionConnectAttrs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int deleteByPrimaryKey(Long processlistId_, String attrName_) {
        return delete(c -> 
            c.where(processlistId, isEqualTo(processlistId_))
            .and(attrName, isEqualTo(attrName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int insert(SessionConnectAttrs record) {
        return MyBatis3Utils.insert(this::insert, record, sessionConnectAttrs, c ->
            c.map(processlistId).toProperty("processlistId")
            .map(attrName).toProperty("attrName")
            .map(attrValue).toProperty("attrValue")
            .map(ordinalPosition).toProperty("ordinalPosition")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int insertSelective(SessionConnectAttrs record) {
        return MyBatis3Utils.insert(this::insert, record, sessionConnectAttrs, c ->
            c.map(processlistId).toPropertyWhenPresent("processlistId", record::getProcesslistId)
            .map(attrName).toPropertyWhenPresent("attrName", record::getAttrName)
            .map(attrValue).toPropertyWhenPresent("attrValue", record::getAttrValue)
            .map(ordinalPosition).toPropertyWhenPresent("ordinalPosition", record::getOrdinalPosition)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default Optional<SessionConnectAttrs> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sessionConnectAttrs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default List<SessionConnectAttrs> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sessionConnectAttrs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default List<SessionConnectAttrs> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sessionConnectAttrs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default Optional<SessionConnectAttrs> selectByPrimaryKey(Long processlistId_, String attrName_) {
        return selectOne(c ->
            c.where(processlistId, isEqualTo(processlistId_))
            .and(attrName, isEqualTo(attrName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sessionConnectAttrs, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    static UpdateDSL<UpdateModel> updateAllColumns(SessionConnectAttrs record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(processlistId).equalTo(record::getProcesslistId)
                .set(attrName).equalTo(record::getAttrName)
                .set(attrValue).equalTo(record::getAttrValue)
                .set(ordinalPosition).equalTo(record::getOrdinalPosition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SessionConnectAttrs record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(processlistId).equalToWhenPresent(record::getProcesslistId)
                .set(attrName).equalToWhenPresent(record::getAttrName)
                .set(attrValue).equalToWhenPresent(record::getAttrValue)
                .set(ordinalPosition).equalToWhenPresent(record::getOrdinalPosition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int updateByPrimaryKey(SessionConnectAttrs record) {
        return update(c ->
            c.set(attrValue).equalTo(record::getAttrValue)
            .set(ordinalPosition).equalTo(record::getOrdinalPosition)
            .where(processlistId, isEqualTo(record::getProcesslistId))
            .and(attrName, isEqualTo(record::getAttrName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3490329+08:00", comments="Source Table: session_connect_attrs")
    default int updateByPrimaryKeySelective(SessionConnectAttrs record) {
        return update(c ->
            c.set(attrValue).equalToWhenPresent(record::getAttrValue)
            .set(ordinalPosition).equalToWhenPresent(record::getOrdinalPosition)
            .where(processlistId, isEqualTo(record::getProcesslistId))
            .and(attrName, isEqualTo(record::getAttrName))
        );
    }
}