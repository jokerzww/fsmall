package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PreparedStatementsInstancesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source Table: prepared_statements_instances")
    public static final PreparedStatementsInstances preparedStatementsInstances = new PreparedStatementsInstances();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.OBJECT_INSTANCE_BEGIN")
    public static final SqlColumn<Long> objectInstanceBegin = preparedStatementsInstances.objectInstanceBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.STATEMENT_ID")
    public static final SqlColumn<Long> statementId = preparedStatementsInstances.statementId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.STATEMENT_NAME")
    public static final SqlColumn<String> statementName = preparedStatementsInstances.statementName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.OWNER_THREAD_ID")
    public static final SqlColumn<Long> ownerThreadId = preparedStatementsInstances.ownerThreadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.OWNER_EVENT_ID")
    public static final SqlColumn<Long> ownerEventId = preparedStatementsInstances.ownerEventId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.OWNER_OBJECT_TYPE")
    public static final SqlColumn<String> ownerObjectType = preparedStatementsInstances.ownerObjectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.OWNER_OBJECT_SCHEMA")
    public static final SqlColumn<String> ownerObjectSchema = preparedStatementsInstances.ownerObjectSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.OWNER_OBJECT_NAME")
    public static final SqlColumn<String> ownerObjectName = preparedStatementsInstances.ownerObjectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.TIMER_PREPARE")
    public static final SqlColumn<Long> timerPrepare = preparedStatementsInstances.timerPrepare;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.COUNT_REPREPARE")
    public static final SqlColumn<Long> countReprepare = preparedStatementsInstances.countReprepare;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.COUNT_EXECUTE")
    public static final SqlColumn<Long> countExecute = preparedStatementsInstances.countExecute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.SUM_TIMER_EXECUTE")
    public static final SqlColumn<Long> sumTimerExecute = preparedStatementsInstances.sumTimerExecute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source field: prepared_statements_instances.MIN_TIMER_EXECUTE")
    public static final SqlColumn<Long> minTimerExecute = preparedStatementsInstances.minTimerExecute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.AVG_TIMER_EXECUTE")
    public static final SqlColumn<Long> avgTimerExecute = preparedStatementsInstances.avgTimerExecute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.MAX_TIMER_EXECUTE")
    public static final SqlColumn<Long> maxTimerExecute = preparedStatementsInstances.maxTimerExecute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_LOCK_TIME")
    public static final SqlColumn<Long> sumLockTime = preparedStatementsInstances.sumLockTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_ERRORS")
    public static final SqlColumn<Long> sumErrors = preparedStatementsInstances.sumErrors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_WARNINGS")
    public static final SqlColumn<Long> sumWarnings = preparedStatementsInstances.sumWarnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_ROWS_AFFECTED")
    public static final SqlColumn<Long> sumRowsAffected = preparedStatementsInstances.sumRowsAffected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_ROWS_SENT")
    public static final SqlColumn<Long> sumRowsSent = preparedStatementsInstances.sumRowsSent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_ROWS_EXAMINED")
    public static final SqlColumn<Long> sumRowsExamined = preparedStatementsInstances.sumRowsExamined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES")
    public static final SqlColumn<Long> sumCreatedTmpDiskTables = preparedStatementsInstances.sumCreatedTmpDiskTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_CREATED_TMP_TABLES")
    public static final SqlColumn<Long> sumCreatedTmpTables = preparedStatementsInstances.sumCreatedTmpTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_SELECT_FULL_JOIN")
    public static final SqlColumn<Long> sumSelectFullJoin = preparedStatementsInstances.sumSelectFullJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN")
    public static final SqlColumn<Long> sumSelectFullRangeJoin = preparedStatementsInstances.sumSelectFullRangeJoin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3910709+08:00", comments="Source field: prepared_statements_instances.SUM_SELECT_RANGE")
    public static final SqlColumn<Long> sumSelectRange = preparedStatementsInstances.sumSelectRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_SELECT_RANGE_CHECK")
    public static final SqlColumn<Long> sumSelectRangeCheck = preparedStatementsInstances.sumSelectRangeCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_SELECT_SCAN")
    public static final SqlColumn<Long> sumSelectScan = preparedStatementsInstances.sumSelectScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_SORT_MERGE_PASSES")
    public static final SqlColumn<Long> sumSortMergePasses = preparedStatementsInstances.sumSortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_SORT_RANGE")
    public static final SqlColumn<Long> sumSortRange = preparedStatementsInstances.sumSortRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_SORT_ROWS")
    public static final SqlColumn<Long> sumSortRows = preparedStatementsInstances.sumSortRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_SORT_SCAN")
    public static final SqlColumn<Long> sumSortScan = preparedStatementsInstances.sumSortScan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_NO_INDEX_USED")
    public static final SqlColumn<Long> sumNoIndexUsed = preparedStatementsInstances.sumNoIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SUM_NO_GOOD_INDEX_USED")
    public static final SqlColumn<Long> sumNoGoodIndexUsed = preparedStatementsInstances.sumNoGoodIndexUsed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3920721+08:00", comments="Source field: prepared_statements_instances.SQL_TEXT")
    public static final SqlColumn<String> sqlText = preparedStatementsInstances.sqlText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3900701+08:00", comments="Source Table: prepared_statements_instances")
    public static final class PreparedStatementsInstances extends SqlTable {
        public final SqlColumn<Long> objectInstanceBegin = column("OBJECT_INSTANCE_BEGIN", JDBCType.BIGINT);

        public final SqlColumn<Long> statementId = column("STATEMENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> statementName = column("STATEMENT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerThreadId = column("OWNER_THREAD_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> ownerEventId = column("OWNER_EVENT_ID", JDBCType.BIGINT);

        public final SqlColumn<String> ownerObjectType = column("OWNER_OBJECT_TYPE", JDBCType.CHAR);

        public final SqlColumn<String> ownerObjectSchema = column("OWNER_OBJECT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> ownerObjectName = column("OWNER_OBJECT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<Long> timerPrepare = column("TIMER_PREPARE", JDBCType.BIGINT);

        public final SqlColumn<Long> countReprepare = column("COUNT_REPREPARE", JDBCType.BIGINT);

        public final SqlColumn<Long> countExecute = column("COUNT_EXECUTE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumTimerExecute = column("SUM_TIMER_EXECUTE", JDBCType.BIGINT);

        public final SqlColumn<Long> minTimerExecute = column("MIN_TIMER_EXECUTE", JDBCType.BIGINT);

        public final SqlColumn<Long> avgTimerExecute = column("AVG_TIMER_EXECUTE", JDBCType.BIGINT);

        public final SqlColumn<Long> maxTimerExecute = column("MAX_TIMER_EXECUTE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumLockTime = column("SUM_LOCK_TIME", JDBCType.BIGINT);

        public final SqlColumn<Long> sumErrors = column("SUM_ERRORS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumWarnings = column("SUM_WARNINGS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumRowsAffected = column("SUM_ROWS_AFFECTED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumRowsSent = column("SUM_ROWS_SENT", JDBCType.BIGINT);

        public final SqlColumn<Long> sumRowsExamined = column("SUM_ROWS_EXAMINED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumCreatedTmpDiskTables = column("SUM_CREATED_TMP_DISK_TABLES", JDBCType.BIGINT);

        public final SqlColumn<Long> sumCreatedTmpTables = column("SUM_CREATED_TMP_TABLES", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectFullJoin = column("SUM_SELECT_FULL_JOIN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectFullRangeJoin = column("SUM_SELECT_FULL_RANGE_JOIN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectRange = column("SUM_SELECT_RANGE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectRangeCheck = column("SUM_SELECT_RANGE_CHECK", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSelectScan = column("SUM_SELECT_SCAN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortMergePasses = column("SUM_SORT_MERGE_PASSES", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortRange = column("SUM_SORT_RANGE", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortRows = column("SUM_SORT_ROWS", JDBCType.BIGINT);

        public final SqlColumn<Long> sumSortScan = column("SUM_SORT_SCAN", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNoIndexUsed = column("SUM_NO_INDEX_USED", JDBCType.BIGINT);

        public final SqlColumn<Long> sumNoGoodIndexUsed = column("SUM_NO_GOOD_INDEX_USED", JDBCType.BIGINT);

        public final SqlColumn<String> sqlText = column("SQL_TEXT", JDBCType.LONGVARCHAR);

        public PreparedStatementsInstances() {
            super("prepared_statements_instances");
        }
    }
}