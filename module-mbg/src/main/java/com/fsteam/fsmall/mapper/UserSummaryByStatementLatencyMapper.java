package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.UserSummaryByStatementLatencyDynamicSqlSupport.*;

import com.fsteam.fsmall.model.UserSummaryByStatementLatency;
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
public interface UserSummaryByStatementLatencyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    BasicColumn[] selectList = BasicColumn.columnList(user, total, totalLatency, maxLatency, lockLatency, rowsSent, rowsExamined, rowsAffected, fullScans);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserSummaryByStatementLatency> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserSummaryByStatementLatencyResult")
    Optional<UserSummaryByStatementLatency> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserSummaryByStatementLatencyResult", value = {
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="total", property="total", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_latency", property="totalLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_latency", property="maxLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_latency", property="lockLatency", jdbcType=JdbcType.VARCHAR),
        @Result(column="rows_sent", property="rowsSent", jdbcType=JdbcType.DECIMAL),
        @Result(column="rows_examined", property="rowsExamined", jdbcType=JdbcType.DECIMAL),
        @Result(column="rows_affected", property="rowsAffected", jdbcType=JdbcType.DECIMAL),
        @Result(column="full_scans", property="fullScans", jdbcType=JdbcType.DECIMAL)
    })
    List<UserSummaryByStatementLatency> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userSummaryByStatementLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userSummaryByStatementLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default int insert(UserSummaryByStatementLatency record) {
        return MyBatis3Utils.insert(this::insert, record, userSummaryByStatementLatency, c ->
            c.map(user).toProperty("user")
            .map(total).toProperty("total")
            .map(totalLatency).toProperty("totalLatency")
            .map(maxLatency).toProperty("maxLatency")
            .map(lockLatency).toProperty("lockLatency")
            .map(rowsSent).toProperty("rowsSent")
            .map(rowsExamined).toProperty("rowsExamined")
            .map(rowsAffected).toProperty("rowsAffected")
            .map(fullScans).toProperty("fullScans")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default int insertSelective(UserSummaryByStatementLatency record) {
        return MyBatis3Utils.insert(this::insert, record, userSummaryByStatementLatency, c ->
            c.map(user).toPropertyWhenPresent("user", record::getUser)
            .map(total).toPropertyWhenPresent("total", record::getTotal)
            .map(totalLatency).toPropertyWhenPresent("totalLatency", record::getTotalLatency)
            .map(maxLatency).toPropertyWhenPresent("maxLatency", record::getMaxLatency)
            .map(lockLatency).toPropertyWhenPresent("lockLatency", record::getLockLatency)
            .map(rowsSent).toPropertyWhenPresent("rowsSent", record::getRowsSent)
            .map(rowsExamined).toPropertyWhenPresent("rowsExamined", record::getRowsExamined)
            .map(rowsAffected).toPropertyWhenPresent("rowsAffected", record::getRowsAffected)
            .map(fullScans).toPropertyWhenPresent("fullScans", record::getFullScans)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default Optional<UserSummaryByStatementLatency> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userSummaryByStatementLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default List<UserSummaryByStatementLatency> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userSummaryByStatementLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default List<UserSummaryByStatementLatency> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userSummaryByStatementLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userSummaryByStatementLatency, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    static UpdateDSL<UpdateModel> updateAllColumns(UserSummaryByStatementLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalTo(record::getUser)
                .set(total).equalTo(record::getTotal)
                .set(totalLatency).equalTo(record::getTotalLatency)
                .set(maxLatency).equalTo(record::getMaxLatency)
                .set(lockLatency).equalTo(record::getLockLatency)
                .set(rowsSent).equalTo(record::getRowsSent)
                .set(rowsExamined).equalTo(record::getRowsExamined)
                .set(rowsAffected).equalTo(record::getRowsAffected)
                .set(fullScans).equalTo(record::getFullScans);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.5452125+08:00", comments="Source Table: user_summary_by_statement_latency")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserSummaryByStatementLatency record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(user).equalToWhenPresent(record::getUser)
                .set(total).equalToWhenPresent(record::getTotal)
                .set(totalLatency).equalToWhenPresent(record::getTotalLatency)
                .set(maxLatency).equalToWhenPresent(record::getMaxLatency)
                .set(lockLatency).equalToWhenPresent(record::getLockLatency)
                .set(rowsSent).equalToWhenPresent(record::getRowsSent)
                .set(rowsExamined).equalToWhenPresent(record::getRowsExamined)
                .set(rowsAffected).equalToWhenPresent(record::getRowsAffected)
                .set(fullScans).equalToWhenPresent(record::getFullScans);
    }
}