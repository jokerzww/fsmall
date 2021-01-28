package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Generated;

public class Schemata implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.CATALOG_NAME")
    private String catalogName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.SCHEMA_NAME")
    private String schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_CHARACTER_SET_NAME")
    private String defaultCharacterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_COLLATION_NAME")
    private String defaultCollationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_ENCRYPTION")
    private String defaultEncryption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.SQL_PATH")
    private byte[] sqlPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source Table: SCHEMATA")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.CATALOG_NAME")
    public String getCatalogName() {
        return catalogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.CATALOG_NAME")
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.SCHEMA_NAME")
    public String getSchemaName() {
        return schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.SCHEMA_NAME")
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_CHARACTER_SET_NAME")
    public String getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_CHARACTER_SET_NAME")
    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_COLLATION_NAME")
    public String getDefaultCollationName() {
        return defaultCollationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_COLLATION_NAME")
    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_ENCRYPTION")
    public String getDefaultEncryption() {
        return defaultEncryption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.DEFAULT_ENCRYPTION")
    public void setDefaultEncryption(String defaultEncryption) {
        this.defaultEncryption = defaultEncryption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.SQL_PATH")
    public byte[] getSqlPath() {
        return sqlPath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source field: SCHEMATA.SQL_PATH")
    public void setSqlPath(byte[] sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source Table: SCHEMATA")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogName=").append(catalogName);
        sb.append(", schemaName=").append(schemaName);
        sb.append(", defaultCharacterSetName=").append(defaultCharacterSetName);
        sb.append(", defaultCollationName=").append(defaultCollationName);
        sb.append(", defaultEncryption=").append(defaultEncryption);
        sb.append(", sqlPath=").append(sqlPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source Table: SCHEMATA")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Schemata other = (Schemata) that;
        return (this.getCatalogName() == null ? other.getCatalogName() == null : this.getCatalogName().equals(other.getCatalogName()))
            && (this.getSchemaName() == null ? other.getSchemaName() == null : this.getSchemaName().equals(other.getSchemaName()))
            && (this.getDefaultCharacterSetName() == null ? other.getDefaultCharacterSetName() == null : this.getDefaultCharacterSetName().equals(other.getDefaultCharacterSetName()))
            && (this.getDefaultCollationName() == null ? other.getDefaultCollationName() == null : this.getDefaultCollationName().equals(other.getDefaultCollationName()))
            && (this.getDefaultEncryption() == null ? other.getDefaultEncryption() == null : this.getDefaultEncryption().equals(other.getDefaultEncryption()))
            && (Arrays.equals(this.getSqlPath(), other.getSqlPath()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3720549+08:00", comments="Source Table: SCHEMATA")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        result = prime * result + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        result = prime * result + ((getDefaultCharacterSetName() == null) ? 0 : getDefaultCharacterSetName().hashCode());
        result = prime * result + ((getDefaultCollationName() == null) ? 0 : getDefaultCollationName().hashCode());
        result = prime * result + ((getDefaultEncryption() == null) ? 0 : getDefaultEncryption().hashCode());
        result = prime * result + (Arrays.hashCode(getSqlPath()));
        return result;
    }
}