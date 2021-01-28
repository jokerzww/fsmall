package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationGroupMembersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    public static final ReplicationGroupMembers replicationGroupMembers = new ReplicationGroupMembers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationGroupMembers.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ID")
    public static final SqlColumn<String> memberId = replicationGroupMembers.memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_HOST")
    public static final SqlColumn<String> memberHost = replicationGroupMembers.memberHost;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_PORT")
    public static final SqlColumn<Integer> memberPort = replicationGroupMembers.memberPort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_STATE")
    public static final SqlColumn<String> memberState = replicationGroupMembers.memberState;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_ROLE")
    public static final SqlColumn<String> memberRole = replicationGroupMembers.memberRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source field: replication_group_members.MEMBER_VERSION")
    public static final SqlColumn<String> memberVersion = replicationGroupMembers.memberVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3069942+08:00", comments="Source Table: replication_group_members")
    public static final class ReplicationGroupMembers extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<String> memberId = column("MEMBER_ID", JDBCType.CHAR);

        public final SqlColumn<String> memberHost = column("MEMBER_HOST", JDBCType.CHAR);

        public final SqlColumn<Integer> memberPort = column("MEMBER_PORT", JDBCType.INTEGER);

        public final SqlColumn<String> memberState = column("MEMBER_STATE", JDBCType.CHAR);

        public final SqlColumn<String> memberRole = column("MEMBER_ROLE", JDBCType.CHAR);

        public final SqlColumn<String> memberVersion = column("MEMBER_VERSION", JDBCType.CHAR);

        public ReplicationGroupMembers() {
            super("replication_group_members");
        }
    }
}