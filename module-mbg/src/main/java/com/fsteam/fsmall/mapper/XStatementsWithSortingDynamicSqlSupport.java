package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XStatementsWithSortingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source Table: x$statements_with_sorting")
    public static final XStatementsWithSorting XStatementsWithSorting = new XStatementsWithSorting();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source field: x$statements_with_sorting.db")
    public static final SqlColumn<String> db = XStatementsWithSorting.db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source field: x$statements_with_sorting.exec_count")
    public static final SqlColumn<Long> execCount = XStatementsWithSorting.execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source field: x$statements_with_sorting.total_latency")
    public static final SqlColumn<Long> totalLatency = XStatementsWithSorting.totalLatency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source field: x$statements_with_sorting.sort_merge_passes")
    public static final SqlColumn<Long> sortMergePasses = XStatementsWithSorting.sortMergePasses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source field: x$statements_with_sorting.avg_sort_merges")
    public static final SqlColumn<BigDecimal> avgSortMerges = XStatementsWithSorting.avgSortMerges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.sorts_using_scans")
    public static final SqlColumn<Long> sortsUsingScans = XStatementsWithSorting.sortsUsingScans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.sort_using_range")
    public static final SqlColumn<Long> sortUsingRange = XStatementsWithSorting.sortUsingRange;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.rows_sorted")
    public static final SqlColumn<Long> rowsSorted = XStatementsWithSorting.rowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.avg_rows_sorted")
    public static final SqlColumn<BigDecimal> avgRowsSorted = XStatementsWithSorting.avgRowsSorted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.first_seen")
    public static final SqlColumn<Date> firstSeen = XStatementsWithSorting.firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.last_seen")
    public static final SqlColumn<Date> lastSeen = XStatementsWithSorting.lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.digest")
    public static final SqlColumn<String> digest = XStatementsWithSorting.digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1218253+08:00", comments="Source field: x$statements_with_sorting.query")
    public static final SqlColumn<String> query = XStatementsWithSorting.query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1208244+08:00", comments="Source Table: x$statements_with_sorting")
    public static final class XStatementsWithSorting extends SqlTable {
        public final SqlColumn<String> db = column("db", JDBCType.VARCHAR);

        public final SqlColumn<Long> execCount = column("exec_count", JDBCType.BIGINT);

        public final SqlColumn<Long> totalLatency = column("total_latency", JDBCType.BIGINT);

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

        public XStatementsWithSorting() {
            super("x$statements_with_sorting");
        }
    }
}