package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ServersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.fsteam.fsmall.model.Servers;
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
public interface ServersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    BasicColumn[] selectList = BasicColumn.columnList(serverName, host, db, username, password, port, socket, wrapper, owner);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Servers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.176877+08:00", comments="Source Table: servers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ServersResult")
    Optional<Servers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ServersResult", value = {
        @Result(column="Server_name", property="serverName", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="Db", property="db", jdbcType=JdbcType.CHAR),
        @Result(column="Username", property="username", jdbcType=JdbcType.CHAR),
        @Result(column="Password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="Port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="Socket", property="socket", jdbcType=JdbcType.CHAR),
        @Result(column="Wrapper", property="wrapper", jdbcType=JdbcType.CHAR),
        @Result(column="Owner", property="owner", jdbcType=JdbcType.CHAR)
    })
    List<Servers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, servers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, servers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int deleteByPrimaryKey(String serverName_) {
        return delete(c -> 
            c.where(serverName, isEqualTo(serverName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int insert(Servers record) {
        return MyBatis3Utils.insert(this::insert, record, servers, c ->
            c.map(serverName).toProperty("serverName")
            .map(host).toProperty("host")
            .map(db).toProperty("db")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(port).toProperty("port")
            .map(socket).toProperty("socket")
            .map(wrapper).toProperty("wrapper")
            .map(owner).toProperty("owner")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int insertSelective(Servers record) {
        return MyBatis3Utils.insert(this::insert, record, servers, c ->
            c.map(serverName).toPropertyWhenPresent("serverName", record::getServerName)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(db).toPropertyWhenPresent("db", record::getDb)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(port).toPropertyWhenPresent("port", record::getPort)
            .map(socket).toPropertyWhenPresent("socket", record::getSocket)
            .map(wrapper).toPropertyWhenPresent("wrapper", record::getWrapper)
            .map(owner).toPropertyWhenPresent("owner", record::getOwner)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default Optional<Servers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, servers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default List<Servers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, servers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default List<Servers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, servers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default Optional<Servers> selectByPrimaryKey(String serverName_) {
        return selectOne(c ->
            c.where(serverName, isEqualTo(serverName_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, servers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    static UpdateDSL<UpdateModel> updateAllColumns(Servers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(serverName).equalTo(record::getServerName)
                .set(host).equalTo(record::getHost)
                .set(db).equalTo(record::getDb)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(port).equalTo(record::getPort)
                .set(socket).equalTo(record::getSocket)
                .set(wrapper).equalTo(record::getWrapper)
                .set(owner).equalTo(record::getOwner);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Servers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(serverName).equalToWhenPresent(record::getServerName)
                .set(host).equalToWhenPresent(record::getHost)
                .set(db).equalToWhenPresent(record::getDb)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(port).equalToWhenPresent(record::getPort)
                .set(socket).equalToWhenPresent(record::getSocket)
                .set(wrapper).equalToWhenPresent(record::getWrapper)
                .set(owner).equalToWhenPresent(record::getOwner);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int updateByPrimaryKey(Servers record) {
        return update(c ->
            c.set(host).equalTo(record::getHost)
            .set(db).equalTo(record::getDb)
            .set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .set(port).equalTo(record::getPort)
            .set(socket).equalTo(record::getSocket)
            .set(wrapper).equalTo(record::getWrapper)
            .set(owner).equalTo(record::getOwner)
            .where(serverName, isEqualTo(record::getServerName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1778772+08:00", comments="Source Table: servers")
    default int updateByPrimaryKeySelective(Servers record) {
        return update(c ->
            c.set(host).equalToWhenPresent(record::getHost)
            .set(db).equalToWhenPresent(record::getDb)
            .set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(port).equalToWhenPresent(record::getPort)
            .set(socket).equalToWhenPresent(record::getSocket)
            .set(wrapper).equalToWhenPresent(record::getWrapper)
            .set(owner).equalToWhenPresent(record::getOwner)
            .where(serverName, isEqualTo(record::getServerName))
        );
    }
}