package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementsWithSortingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source Table: statements_with_sorting")
    public static final StatementsWithSorting statementsWithSorting = new StatementsWithSorting();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.db")
    public static final SqlColumn<String> db = statementsWithSorting.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.exec_count")
    public static final SqlColumn<Long> execCount = statementsWithSorting.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.total_latency")
    public static final SqlColumn<String> totalLatency = statementsWithSorting.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source field: statements_with_sorting.sort_merge_passes")
    public static final SqlColumn<Long> sortMergePasses = statementsWithSorting.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.avg_sort_merges")
    public static final SqlColumn<BigDecimal> avgSortMerges = statementsWithSorting.avgSortMerges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.sorts_using_scans")
    public static final SqlColumn<Long> sortsUsingScans = statementsWithSorting.sortsUsingScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.sort_using_range")
    public static final SqlColumn<Long> sortUsingRange = statementsWithSorting.sortUsingRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.rows_sorted")
    public static final SqlColumn<Long> rowsSorted = statementsWithSorting.rowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.avg_rows_sorted")
    public static final SqlColumn<BigDecimal> avgRowsSorted = statementsWithSorting.avgRowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.first_seen")
    public static final SqlColumn<Date> firstSeen = statementsWithSorting.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.last_seen")
    public static final SqlColumn<Date> lastSeen = statementsWithSorting.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.digest")
    public static final SqlColumn<String> digest = statementsWithSorting.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2169125+08:00", comments="Source field: statements_with_sorting.query")
    public static final SqlColumn<String> query = statementsWithSorting.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2159116+08:00", comments="Source Table: statements_with_sorting")
    public static final class StatementsWithSorting extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<String> totalLatency = column("total_latency", JDBCType.VARCHAR);

        public final SqlColumn<Long> sortMergePasses = column("sort_merge_passes", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgSortMerges = column("avg_sort_merges", JDBCType.DECIMAL);

        public final SqlColumn<Long> sortsUsingScans = column("sorts_using_scans", JDBCType.BIGINT);

        public final SqlColumn<Long> sortUsingRange = column("sort_using_range", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsSorted = column("rows_sorted", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgRowsSorted = column("avg_rows_sorted", JDBCType.DECIMAL);

        public final SqlColumn<Date> firstSeen = column("first_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastSeen = column("last_seen", JDBCType.TIMESTAMP);

        public final SqlColumn<String> digest = column("digest", JDBCType.VARCHAR);

        public final SqlColumn<String> query = column("query", JDBCType.LONGVARCHAR);

        public StatementsWithSorting() {
            super("statements_with_sorting");
        }
    }
}