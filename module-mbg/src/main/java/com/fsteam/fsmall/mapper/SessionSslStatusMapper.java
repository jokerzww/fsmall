package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.SessionSslStatusDynamicSqlSupport.*;

import com.fsteam.fsmall.model.SessionSslStatus;
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
public interface SessionSslStatusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    BasicColumn[] selectList = BasicColumn.columnList(threadId, sslVersion, sslCipher, sslSessionsReused);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SessionSslStatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SessionSslStatusResult")
    Optional<SessionSslStatus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SessionSslStatusResult", value = {
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="ssl_version", property="sslVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="ssl_cipher", property="sslCipher", jdbcType=JdbcType.VARCHAR),
        @Result(column="ssl_sessions_reused", property="sslSessionsReused", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionSslStatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sessionSslStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sessionSslStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    default int insert(SessionSslStatus record) {
        return MyBatis3Utils.insert(this::insert, record, sessionSslStatus, c ->
            c.map(threadId).toProperty("threadId")
            .map(sslVersion).toProperty("sslVersion")
            .map(sslCipher).toProperty("sslCipher")
            .map(sslSessionsReused).toProperty("sslSessionsReused")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    default int insertSelective(SessionSslStatus record) {
        return MyBatis3Utils.insert(this::insert, record, sessionSslStatus, c ->
            c.map(threadId).toPropertyWhenPresent("threadId", record::getThreadId)
            .map(sslVersion).toPropertyWhenPresent("sslVersion", record::getSslVersion)
            .map(sslCipher).toPropertyWhenPresent("sslCipher", record::getSslCipher)
            .map(sslSessionsReused).toPropertyWhenPresent("sslSessionsReused", record::getSslSessionsReused)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    default Optional<SessionSslStatus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sessionSslStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    default List<SessionSslStatus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sessionSslStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: session_ssl_status")
    default List<SessionSslStatus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sessionSslStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: session_ssl_status")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sessionSslStatus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: session_ssl_status")
    static UpdateDSL<UpdateModel> updateAllColumns(SessionSslStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalTo(record::getThreadId)
                .set(sslVersion).equalTo(record::getSslVersion)
                .set(sslCipher).equalTo(record::getSslCipher)
                .set(sslSessionsReused).equalTo(record::getSslSessionsReused);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4801535+08:00", comments="Source Table: session_ssl_status")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SessionSslStatus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(threadId).equalToWhenPresent(record::getThreadId)
                .set(sslVersion).equalToWhenPresent(record::getSslVersion)
                .set(sslCipher).equalToWhenPresent(record::getSslCipher)
                .set(sslSessionsReused).equalToWhenPresent(record::getSslSessionsReused);
    }
}