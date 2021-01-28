package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReplicationGroupMemberStatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source Table: replication_group_member_stats")
    public static final ReplicationGroupMemberStats replicationGroupMemberStats = new ReplicationGroupMemberStats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source field: replication_group_member_stats.CHANNEL_NAME")
    public static final SqlColumn<String> channelName = replicationGroupMemberStats.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.VIEW_ID")
    public static final SqlColumn<String> viewId = replicationGroupMemberStats.viewId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.MEMBER_ID")
    public static final SqlColumn<String> memberId = replicationGroupMemberStats.memberId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE")
    public static final SqlColumn<Long> countTransactionsInQueue = replicationGroupMemberStats.countTransactionsInQueue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED")
    public static final SqlColumn<Long> countTransactionsChecked = replicationGroupMemberStats.countTransactionsChecked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_CONFLICTS_DETECTED")
    public static final SqlColumn<Long> countConflictsDetected = replicationGroupMemberStats.countConflictsDetected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING")
    public static final SqlColumn<Long> countTransactionsRowsValidating = replicationGroupMemberStats.countTransactionsRowsValidating;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE")
    public static final SqlColumn<Long> countTransactionsRemoteInApplierQueue = replicationGroupMemberStats.countTransactionsRemoteInApplierQueue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED")
    public static final SqlColumn<Long> countTransactionsRemoteApplied = replicationGroupMemberStats.countTransactionsRemoteApplied;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED")
    public static final SqlColumn<Long> countTransactionsLocalProposed = replicationGroupMemberStats.countTransactionsLocalProposed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK")
    public static final SqlColumn<Long> countTransactionsLocalRollback = replicationGroupMemberStats.countTransactionsLocalRollback;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS")
    public static final SqlColumn<String> transactionsCommittedAllMembers = replicationGroupMemberStats.transactionsCommittedAllMembers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1988967+08:00", comments="Source field: replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION")
    public static final SqlColumn<String> lastConflictFreeTransaction = replicationGroupMemberStats.lastConflictFreeTransaction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1978966+08:00", comments="Source Table: replication_group_member_stats")
    public static final class ReplicationGroupMemberStats extends SqlTable {
        public final SqlColumn<String> channelName = column("CHANNEL_NAME", JDBCType.CHAR);

        public final SqlColumn<String> viewId = column("VIEW_ID", JDBCType.CHAR);

        public final SqlColumn<String> memberId = column("MEMBER_ID", JDBCType.CHAR);

        public final SqlColumn<Long> countTransactionsInQueue = column("COUNT_TRANSACTIONS_IN_QUEUE", JDBCType.BIGINT);

        public final SqlColumn<Long> countTransactionsChecked = column("COUNT_TRANSACTIONS_CHECKED", JDBCType.BIGINT);

        public final SqlColumn<Long> countConflictsDetected = column("COUNT_CONFLICTS_DETECTED", JDBCType.BIGINT);

        public final SqlColumn<Long> countTransactionsRowsValidating = column("COUNT_TRANSACTIONS_ROWS_VALIDATING", JDBCType.BIGINT);

        public final SqlColumn<Long> countTransactionsRemoteInApplierQueue = column("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE", JDBCType.BIGINT);

        public final SqlColumn<Long> countTransactionsRemoteApplied = column("COUNT_TRANSACTIONS_REMOTE_APPLIED", JDBCType.BIGINT);

        public final SqlColumn<Long> countTransactionsLocalProposed = column("COUNT_TRANSACTIONS_LOCAL_PROPOSED", JDBCType.BIGINT);

        public final SqlColumn<Long> countTransactionsLocalRollback = column("COUNT_TRANSACTIONS_LOCAL_ROLLBACK", JDBCType.BIGINT);

        public final SqlColumn<String> transactionsCommittedAllMembers = column("TRANSACTIONS_COMMITTED_ALL_MEMBERS", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> lastConflictFreeTransaction = column("LAST_CONFLICT_FREE_TRANSACTION", JDBCType.LONGVARCHAR);

        public ReplicationGroupMemberStats() {
            super("replication_group_member_stats");
        }
    }
}