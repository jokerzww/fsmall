package com.fsteam.fsmall.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SchemataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source Table: SCHEMATA")
    public static final Schemata schemata = new Schemata();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source field: SCHEMATA.CATALOG_NAME")
    public static final SqlColumn<String> catalogName = schemata.catalogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source field: SCHEMATA.SCHEMA_NAME")
    public static final SqlColumn<String> schemaName = schemata.schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source field: SCHEMATA.DEFAULT_CHARACTER_SET_NAME")
    public static final SqlColumn<String> defaultCharacterSetName = schemata.defaultCharacterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source field: SCHEMATA.DEFAULT_COLLATION_NAME")
    public static final SqlColumn<String> defaultCollationName = schemata.defaultCollationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source field: SCHEMATA.DEFAULT_ENCRYPTION")
    public static final SqlColumn<String> defaultEncryption = schemata.defaultEncryption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source field: SCHEMATA.SQL_PATH")
    public static final SqlColumn<byte[]> sqlPath = schemata.sqlPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3730567+08:00", comments="Source Table: SCHEMATA")
    public static final class Schemata extends SqlTable {
        public final SqlColumn<String> catalogName = column("CATALOG_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> schemaName = column("SCHEMA_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> defaultCharacterSetName = column("DEFAULT_CHARACTER_SET_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> defaultCollationName = column("DEFAULT_COLLATION_NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> defaultEncryption = column("DEFAULT_ENCRYPTION", JDBCType.CHAR);

        public final SqlColumn<byte[]> sqlPath = column("SQL_PATH", JDBCType.BINARY);

        public Schemata() {
            super("SCHEMATA");
        }
    }
}