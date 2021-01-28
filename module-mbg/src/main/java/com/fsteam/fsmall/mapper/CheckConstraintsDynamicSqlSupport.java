package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CheckConstraintsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    public static final CheckConstraints checkConstraints = new CheckConstraints();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_CATALOG")
    public static final SqlColumn<String> constraintCatalog = checkConstraints.constraintCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA")
    public static final SqlColumn<String> constraintSchema = checkConstraints.constraintSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CONSTRAINT_NAME")
    public static final SqlColumn<String> constraintName = checkConstraints.constraintName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source field: CHECK_CONSTRAINTS.CHECK_CLAUSE")
    public static final SqlColumn<String> checkClause = checkConstraints.checkClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2869761+08:00", comments="Source Table: CHECK_CONSTRAINTS")
    public static final class CheckConstraints extends SqlTable {
        public final SqlColumn<String> constraintCatalog = column("CONSTRAINT_CATALOG", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintSchema = column("CONSTRAINT_SCHEMA", JDBCType.VARCHAR);

        public final SqlColumn<String> constraintName = column("CONSTRAINT_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> checkClause = column("CHECK_CLAUSE", JDBCType.LONGVARCHAR);

        public CheckConstraints() {
            super("CHECK_CONSTRAINTS");
        }
    }
}