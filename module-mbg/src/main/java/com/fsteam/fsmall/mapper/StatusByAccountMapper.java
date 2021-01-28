package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.StatusByAccountDynamicSqlSupport.*;

import com.fsteam.fsmall.model.StatusByAccount;
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
public interface StatusByAccountMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    BasicColumn[] selectList = BasicColumn.columnList(user, host, variableName, variableValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StatusByAccount> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatusByAccountResult")
    Optional<StatusByAccount> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatusByAccountResult", value = {
        @Result(column="USER", property="user", jdbcType=JdbcType.CHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.CHAR),
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<StatusByAccount> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statusByAccount, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statusByAccount, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default int insert(StatusByAccount record) {
        return MyBatis3Utils.insert(this::insert, record, statusByAccount, c ->
            c.map(user).toProperty("user")
            .map(host).toProperty("host")
            .map(variableName).toProperty("variableName")
            .map(variableValue).toProperty("variableValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default int insertSelective(StatusByAccount record) {
        return MyBatis3Utils.insert(this::insert, record, statusByAccount, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(variableName).toPropertyWhenPresent("variableName", record::getVariableName)
            .map(variableValue).toPropertyWhenPresent("variableValue", record::getVariableValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default Optional<StatusByAccount> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statusByAccount, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default List<StatusByAccount> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statusByAccount, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default List<StatusByAccount> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statusByAccount, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statusByAccount, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    static UpdateDSL<UpdateModel> updateAllColumns(StatusByAccount record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(host).equalTo(record::getHost)
                .set(variableName).equalTo(record::getVariableName)
                .set(variableValue).equalTo(record::getVariableValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2349301+08:00", comments="Source Table: status_by_account")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StatusByAccount record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(host).equalToWhenPresent(record::getHost)
                .set(variableName).equalToWhenPresent(record::getVariableName)
                .set(variableValue).equalToWhenPresent(record::getVariableValue);
    }
}