package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.HostsDynamicSqlSupport.*;

import com.fsteam.fsmall.model.Hosts;
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
public interface HostsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    BasicColumn[] selectList = BasicColumn.columnList(host, currentConnections, totalConnections);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Hosts> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HostsResult")
    Optional<Hosts> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HostsResult", value = {
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="CURRENT_CONNECTIONS", property="currentConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="TOTAL_CONNECTIONS", property="totalConnections", jdbcType=JdbcType.BIGINT)
    })
    List<Hosts> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hosts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hosts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.106812+08:00", comments="Source Table: hosts")
    default int insert(Hosts record) {
        return MyBatis3Utils.insert(this::insert, record, hosts, c ->
            c.map(host).toProperty("host")
            .map(currentConnections).toProperty("currentConnections")
            .map(totalConnections).toProperty("totalConnections")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    default int insertSelective(Hosts record) {
        return MyBatis3Utils.insert(this::insert, record, hosts, c ->
            c.map(host).toPropertyWhenPresent("host", record::getHost)
            .map(currentConnections).toPropertyWhenPresent("currentConnections", record::getCurrentConnections)
            .map(totalConnections).toPropertyWhenPresent("totalConnections", record::getTotalConnections)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    default Optional<Hosts> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hosts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    default List<Hosts> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hosts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    default List<Hosts> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hosts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hosts, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    static UpdateDSL<UpdateModel> updateAllColumns(Hosts record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalTo(record::getHost)
                .set(currentConnections).equalTo(record::getCurrentConnections)
                .set(totalConnections).equalTo(record::getTotalConnections);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1078138+08:00", comments="Source Table: hosts")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Hosts record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(host).equalToWhenPresent(record::getHost)
                .set(currentConnections).equalToWhenPresent(record::getCurrentConnections)
                .set(totalConnections).equalToWhenPresent(record::getTotalConnections);
    }
}