package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SlaveWorkerInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source Table: slave_worker_info")
    public static final SlaveWorkerInfo slaveWorkerInfo = new SlaveWorkerInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Channel_name")
    public static final SqlColumn<String> channelName = slaveWorkerInfo.channelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Id")
    public static final SqlColumn<Integer> id = slaveWorkerInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Relay_log_pos")
    public static final SqlColumn<Long> relayLogPos = slaveWorkerInfo.relayLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Master_log_pos")
    public static final SqlColumn<Long> masterLogPos = slaveWorkerInfo.masterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_pos")
    public static final SqlColumn<Long> checkpointRelayLogPos = slaveWorkerInfo.checkpointRelayLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_pos")
    public static final SqlColumn<Long> checkpointMasterLogPos = slaveWorkerInfo.checkpointMasterLogPos;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_seqno")
    public static final SqlColumn<Integer> checkpointSeqno = slaveWorkerInfo.checkpointSeqno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source field: slave_worker_info.Checkpoint_group_size")
    public static final SqlColumn<Integer> checkpointGroupSize = slaveWorkerInfo.checkpointGroupSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source field: slave_worker_info.Relay_log_name")
    public static final SqlColumn<String> relayLogName = slaveWorkerInfo.relayLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source field: slave_worker_info.Master_log_name")
    public static final SqlColumn<String> masterLogName = slaveWorkerInfo.masterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source field: slave_worker_info.Checkpoint_relay_log_name")
    public static final SqlColumn<String> checkpointRelayLogName = slaveWorkerInfo.checkpointRelayLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source field: slave_worker_info.Checkpoint_master_log_name")
    public static final SqlColumn<String> checkpointMasterLogName = slaveWorkerInfo.checkpointMasterLogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2789689+08:00", comments="Source field: slave_worker_info.Checkpoint_group_bitmap")
    public static final SqlColumn<byte[]> checkpointGroupBitmap = slaveWorkerInfo.checkpointGroupBitmap;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2779684+08:00", comments="Source Table: slave_worker_info")
    public static final class SlaveWorkerInfo extends SqlTable {
        public final SqlColumn<String> channelName = column("Channel_name", JDBCType.CHAR);

        public final SqlColumn<Integer> id = column("Id", JDBCType.INTEGER);

        public final SqlColumn<Long> relayLogPos = column("Relay_log_pos", JDBCType.BIGINT);

        public final SqlColumn<Long> masterLogPos = column("Master_log_pos", JDBCType.BIGINT);

        public final SqlColumn<Long> checkpointRelayLogPos = column("Checkpoint_relay_log_pos", JDBCType.BIGINT);

        public final SqlColumn<Long> checkpointMasterLogPos = column("Checkpoint_master_log_pos", JDBCType.BIGINT);

        public final SqlColumn<Integer> checkpointSeqno = column("Checkpoint_seqno", JDBCType.INTEGER);

        public final SqlColumn<Integer> checkpointGroupSize = column("Checkpoint_group_size", JDBCType.INTEGER);

        public final SqlColumn<String> relayLogName = column("Relay_log_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> masterLogName = column("Master_log_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> checkpointRelayLogName = column("Checkpoint_relay_log_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> checkpointMasterLogName = column("Checkpoint_master_log_name", JDBCType.LONGVARCHAR);

        public final SqlColumn<byte[]> checkpointGroupBitmap = column("Checkpoint_group_bitmap", JDBCType.LONGVARBINARY);

        public SlaveWorkerInfo() {
            super("slave_worker_info");
        }
    }
}