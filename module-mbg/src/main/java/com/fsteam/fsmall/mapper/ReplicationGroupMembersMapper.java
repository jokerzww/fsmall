package com.fsteam.fsmall.mapper;

import static com.fsteam.fsmall.mapper.ReplicationGroupMembersDynamicSqlSupport.*;

import com.fsteam.fsmall.model.ReplicationGroupMembers;
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
public interface ReplicationGroupMembersMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    BasicColumn[] selectList = BasicColumn.columnList(channelName, memberId, memberHost, memberPort, memberState, memberRole, memberVersion);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ReplicationGroupMembers> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReplicationGroupMembersResult")
    Optional<ReplicationGroupMembers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ReplicationGroupMembersResult", value = {
        @Result(column="CHANNEL_NAME", property="channelName", jdbcType=JdbcType.CHAR),
        @Result(column="MEMBER_ID", property="memberId", jdbcType=JdbcType.CHAR),
        @Result(column="MEMBER_HOST", property="memberHost", jdbcType=JdbcType.CHAR),
        @Result(column="MEMBER_PORT", property="memberPort", jdbcType=JdbcType.INTEGER),
        @Result(column="MEMBER_STATE", property="memberState", jdbcType=JdbcType.CHAR),
        @Result(column="MEMBER_ROLE", property="memberRole", jdbcType=JdbcType.CHAR),
        @Result(column="MEMBER_VERSION", property="memberVersion", jdbcType=JdbcType.CHAR)
    })
    List<ReplicationGroupMembers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, replicationGroupMembers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, replicationGroupMembers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default int insert(ReplicationGroupMembers record) {
        return MyBatis3Utils.insert(this::insert, record, replicationGroupMembers, c ->
            c.map(channelName).toProperty("channelName")
            .map(memberId).toProperty("memberId")
            .map(memberHost).toProperty("memberHost")
            .map(memberPort).toProperty("memberPort")
            .map(memberState).toProperty("memberState")
            .map(memberRole).toProperty("memberRole")
            .map(memberVersion).toProperty("memberVersion")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default int insertSelective(ReplicationGroupMembers record) {
        return MyBatis3Utils.insert(this::insert, record, replicationGroupMembers, c ->
            c.map(channelName).toPropertyWhenPresent("channelName", record::getChannelName)
            .map(memberId).toPropertyWhenPresent("memberId", record::getMemberId)
            .map(memberHost).toPropertyWhenPresent("memberHost", record::getMemberHost)
            .map(memberPort).toPropertyWhenPresent("memberPort", record::getMemberPort)
            .map(memberState).toPropertyWhenPresent("memberState", record::getMemberState)
            .map(memberRole).toPropertyWhenPresent("memberRole", record::getMemberRole)
            .map(memberVersion).toPropertyWhenPresent("memberVersion", record::getMemberVersion)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default Optional<ReplicationGroupMembers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, replicationGroupMembers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default List<ReplicationGroupMembers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, replicationGroupMembers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default List<ReplicationGroupMembers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, replicationGroupMembers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, replicationGroupMembers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    static UpdateDSL<UpdateModel> updateAllColumns(ReplicationGroupMembers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalTo(record::getChannelName)
                .set(memberId).equalTo(record::getMemberId)
                .set(memberHost).equalTo(record::getMemberHost)
                .set(memberPort).equalTo(record::getMemberPort)
                .set(memberState).equalTo(record::getMemberState)
                .set(memberRole).equalTo(record::getMemberRole)
                .set(memberVersion).equalTo(record::getMemberVersion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3079964+08:00", comments="Source Table: replication_group_members")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ReplicationGroupMembers record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(channelName).equalToWhenPresent(record::getChannelName)
                .set(memberId).equalToWhenPresent(record::getMemberId)
                .set(memberHost).equalToWhenPresent(record::getMemberHost)
                .set(memberPort).equalToWhenPresent(record::getMemberPort)
                .set(memberState).equalToWhenPresent(record::getMemberState)
                .set(memberRole).equalToWhenPresent(record::getMemberRole)
                .set(memberVersion).equalToWhenPresent(record::getMemberVersion);
    }
}