package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GlobalGrantsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: global_grants")
    public static final GlobalGrants globalGrants = new GlobalGrants();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source field: global_grants.USER")
    public static final SqlColumn<String> user = globalGrants.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source field: global_grants.HOST")
    public static final SqlColumn<String> host = globalGrants.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source field: global_grants.PRIV")
    public static final SqlColumn<String> priv = globalGrants.priv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.078786+08:00", comments="Source field: global_grants.WITH_GRANT_OPTION")
    public static final SqlColumn<String> withGrantOption = globalGrants.withGrantOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0777855+08:00", comments="Source Table: global_grants")
    public static final class GlobalGrants extends SqlTable {
        public final SqlColumn<String> user = column("USER", JDBCType.CHAR);

        public final SqlColumn<String> host = column("HOST", JDBCType.CHAR);

        public final SqlColumn<String> priv = column("PRIV", JDBCType.CHAR);

        public final SqlColumn<String> withGrantOption = column("WITH_GRANT_OPTION", JDBCType.CHAR);

        public GlobalGrants() {
            super("global_grants");
        }
    }
}