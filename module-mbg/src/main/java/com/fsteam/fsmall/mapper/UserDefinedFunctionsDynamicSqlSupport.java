package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDefinedFunctionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source Table: user_defined_functions")
    public static final UserDefinedFunctions userDefinedFunctions = new UserDefinedFunctions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source field: user_defined_functions.UDF_NAME")
    public static final SqlColumn<String> udfName = userDefinedFunctions.udfName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source field: user_defined_functions.UDF_RETURN_TYPE")
    public static final SqlColumn<String> udfReturnType = userDefinedFunctions.udfReturnType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source field: user_defined_functions.UDF_TYPE")
    public static final SqlColumn<String> udfType = userDefinedFunctions.udfType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source field: user_defined_functions.UDF_LIBRARY")
    public static final SqlColumn<String> udfLibrary = userDefinedFunctions.udfLibrary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source field: user_defined_functions.UDF_USAGE_COUNT")
    public static final SqlColumn<Long> udfUsageCount = userDefinedFunctions.udfUsageCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source Table: user_defined_functions")
    public static final class UserDefinedFunctions extends SqlTable {
        public final SqlColumn<String> udfName = column("UDF_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> udfReturnType = column("UDF_RETURN_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> udfType = column("UDF_TYPE", JDBCType.VARCHAR);

        public final SqlColumn<String> udfLibrary = column("UDF_LIBRARY", JDBCType.VARCHAR);

        public final SqlColumn<Long> udfUsageCount = column("UDF_USAGE_COUNT", JDBCType.BIGINT);

        public UserDefinedFunctions() {
            super("user_defined_functions");
        }
    }
}