package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Columns implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.COLUMN_NAME")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.ORDINAL_POSITION")
    private Integer ordinalPosition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.IS_NULLABLE")
    private String isNullable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.CHARACTER_MAXIMUM_LENGTH")
    private Long characterMaximumLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.CHARACTER_OCTET_LENGTH")
    private Long characterOctetLength;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.NUMERIC_PRECISION")
    private Long numericPrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.NUMERIC_SCALE")
    private Long numericScale;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.DATETIME_PRECISION")
    private Integer datetimePrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.CHARACTER_SET_NAME")
    private String characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLLATION_NAME")
    private String collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_KEY")
    private String columnKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.EXTRA")
    private String extra;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.PRIVILEGES")
    private String privileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.SRS_ID")
    private Integer srsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_DEFAULT")
    private String columnDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.DATA_TYPE")
    private String dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_TYPE")
    private String columnType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_COMMENT")
    private String columnComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.GENERATION_EXPRESSION")
    private String generationExpression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source Table: COLUMNS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.COLUMN_NAME")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.ORDINAL_POSITION")
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.ORDINAL_POSITION")
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.IS_NULLABLE")
    public String getIsNullable() {
        return isNullable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.IS_NULLABLE")
    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.CHARACTER_MAXIMUM_LENGTH")
    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.135838+08:00", comments="Source field: COLUMNS.CHARACTER_MAXIMUM_LENGTH")
    public void setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.CHARACTER_OCTET_LENGTH")
    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.CHARACTER_OCTET_LENGTH")
    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.NUMERIC_PRECISION")
    public Long getNumericPrecision() {
        return numericPrecision;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.NUMERIC_PRECISION")
    public void setNumericPrecision(Long numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.NUMERIC_SCALE")
    public Long getNumericScale() {
        return numericScale;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.NUMERIC_SCALE")
    public void setNumericScale(Long numericScale) {
        this.numericScale = numericScale;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.DATETIME_PRECISION")
    public Integer getDatetimePrecision() {
        return datetimePrecision;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.DATETIME_PRECISION")
    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.CHARACTER_SET_NAME")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLLATION_NAME")
    public String getCollationName() {
        return collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLLATION_NAME")
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_KEY")
    public String getColumnKey() {
        return columnKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_KEY")
    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.EXTRA")
    public String getExtra() {
        return extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.EXTRA")
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.PRIVILEGES")
    public String getPrivileges() {
        return privileges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.PRIVILEGES")
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.SRS_ID")
    public Integer getSrsId() {
        return srsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.SRS_ID")
    public void setSrsId(Integer srsId) {
        this.srsId = srsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_DEFAULT")
    public String getColumnDefault() {
        return columnDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_DEFAULT")
    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.DATA_TYPE")
    public String getDataType() {
        return dataType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.DATA_TYPE")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_TYPE")
    public String getColumnType() {
        return columnType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_TYPE")
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_COMMENT")
    public String getColumnComment() {
        return columnComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.COLUMN_COMMENT")
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.GENERATION_EXPRESSION")
    public String getGenerationExpression() {
        return generationExpression;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source field: COLUMNS.GENERATION_EXPRESSION")
    public void setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source Table: COLUMNS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", ordinalPosition=").append(ordinalPosition);
        sb.append(", isNullable=").append(isNullable);
        sb.append(", characterMaximumLength=").append(characterMaximumLength);
        sb.append(", characterOctetLength=").append(characterOctetLength);
        sb.append(", numericPrecision=").append(numericPrecision);
        sb.append(", numericScale=").append(numericScale);
        sb.append(", datetimePrecision=").append(datetimePrecision);
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", collationName=").append(collationName);
        sb.append(", columnKey=").append(columnKey);
        sb.append(", extra=").append(extra);
        sb.append(", privileges=").append(privileges);
        sb.append(", srsId=").append(srsId);
        sb.append(", columnDefault=").append(columnDefault);
        sb.append(", dataType=").append(dataType);
        sb.append(", columnType=").append(columnType);
        sb.append(", columnComment=").append(columnComment);
        sb.append(", generationExpression=").append(generationExpression);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source Table: COLUMNS")
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
        Columns other = (Columns) that;
        return (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getOrdinalPosition() == null ? other.getOrdinalPosition() == null : this.getOrdinalPosition().equals(other.getOrdinalPosition()))
            && (this.getIsNullable() == null ? other.getIsNullable() == null : this.getIsNullable().equals(other.getIsNullable()))
            && (this.getCharacterMaximumLength() == null ? other.getCharacterMaximumLength() == null : this.getCharacterMaximumLength().equals(other.getCharacterMaximumLength()))
            && (this.getCharacterOctetLength() == null ? other.getCharacterOctetLength() == null : this.getCharacterOctetLength().equals(other.getCharacterOctetLength()))
            && (this.getNumericPrecision() == null ? other.getNumericPrecision() == null : this.getNumericPrecision().equals(other.getNumericPrecision()))
            && (this.getNumericScale() == null ? other.getNumericScale() == null : this.getNumericScale().equals(other.getNumericScale()))
            && (this.getDatetimePrecision() == null ? other.getDatetimePrecision() == null : this.getDatetimePrecision().equals(other.getDatetimePrecision()))
            && (this.getCharacterSetName() == null ? other.getCharacterSetName() == null : this.getCharacterSetName().equals(other.getCharacterSetName()))
            && (this.getCollationName() == null ? other.getCollationName() == null : this.getCollationName().equals(other.getCollationName()))
            && (this.getColumnKey() == null ? other.getColumnKey() == null : this.getColumnKey().equals(other.getColumnKey()))
            && (this.getExtra() == null ? other.getExtra() == null : this.getExtra().equals(other.getExtra()))
            && (this.getPrivileges() == null ? other.getPrivileges() == null : this.getPrivileges().equals(other.getPrivileges()))
            && (this.getSrsId() == null ? other.getSrsId() == null : this.getSrsId().equals(other.getSrsId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1368387+08:00", comments="Source Table: COLUMNS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getOrdinalPosition() == null) ? 0 : getOrdinalPosition().hashCode());
        result = prime * result + ((getIsNullable() == null) ? 0 : getIsNullable().hashCode());
        result = prime * result + ((getCharacterMaximumLength() == null) ? 0 : getCharacterMaximumLength().hashCode());
        result = prime * result + ((getCharacterOctetLength() == null) ? 0 : getCharacterOctetLength().hashCode());
        result = prime * result + ((getNumericPrecision() == null) ? 0 : getNumericPrecision().hashCode());
        result = prime * result + ((getNumericScale() == null) ? 0 : getNumericScale().hashCode());
        result = prime * result + ((getDatetimePrecision() == null) ? 0 : getDatetimePrecision().hashCode());
        result = prime * result + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        result = prime * result + ((getCollationName() == null) ? 0 : getCollationName().hashCode());
        result = prime * result + ((getColumnKey() == null) ? 0 : getColumnKey().hashCode());
        result = prime * result + ((getExtra() == null) ? 0 : getExtra().hashCode());
        result = prime * result + ((getPrivileges() == null) ? 0 : getPrivileges().hashCode());
        result = prime * result + ((getSrsId() == null) ? 0 : getSrsId().hashCode());
        return result;
    }
}