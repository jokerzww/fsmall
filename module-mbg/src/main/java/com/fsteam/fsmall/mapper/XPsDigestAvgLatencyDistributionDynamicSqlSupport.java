package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XPsDigestAvgLatencyDistributionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    public static final XPsDigestAvgLatencyDistribution XPsDigestAvgLatencyDistribution = new XPsDigestAvgLatencyDistribution();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.cnt")
    public static final SqlColumn<Long> cnt = XPsDigestAvgLatencyDistribution.cnt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source field: x$ps_digest_avg_latency_distribution.avg_us")
    public static final SqlColumn<BigDecimal> avgUs = XPsDigestAvgLatencyDistribution.avgUs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4461215+08:00", comments="Source Table: x$ps_digest_avg_latency_distribution")
    public static final class XPsDigestAvgLatencyDistribution extends SqlTable {
        public final SqlColumn<Long> cnt = column("cnt", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> avgUs = column("avg_us", JDBCType.DECIMAL);

        public XPsDigestAvgLatencyDistribution() {
            super("x$ps_digest_avg_latency_distribution");
        }
    }
}