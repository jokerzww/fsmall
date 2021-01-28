package com.fsteam.fsmall.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class XPsDigest95thPercentileByAvgUsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    public static final XPsDigest95thPercentileByAvgUs XPsDigest95thPercentileByAvgUs = new XPsDigest95thPercentileByAvgUs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.avg_us")
    public static final SqlColumn<BigDecimal> avgUs = XPsDigest95thPercentileByAvgUs.avgUs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1968942+08:00", comments="Source field: x$ps_digest_95th_percentile_by_avg_us.percentile")
    public static final SqlColumn<BigDecimal> percentile = XPsDigest95thPercentileByAvgUs.percentile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1958933+08:00", comments="Source Table: x$ps_digest_95th_percentile_by_avg_us")
    public static final class XPsDigest95thPercentileByAvgUs extends SqlTable {
        public final SqlColumn<BigDecimal> avgUs = column("avg_us", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> percentile = column("percentile", JDBCType.DECIMAL);

        public XPsDigest95thPercentileByAvgUs() {
            super("x$ps_digest_95th_percentile_by_avg_us");
        }
    }
}