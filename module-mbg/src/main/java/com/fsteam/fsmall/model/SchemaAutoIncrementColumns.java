package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class SchemaAutoIncrementColumns implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_schema")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_name")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_name")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_signed")
    private Integer isSigned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_unsigned")
    private Integer isUnsigned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.max_value")
    private Long maxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment")
    private Long autoIncrement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment_ratio")
    private BigDecimal autoIncrementRatio;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.data_type")
    private String dataType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_type")
    private String columnType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source Table: schema_auto_increment_columns")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_schema")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_schema")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_name")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.table_name")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_name")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_name")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_signed")
    public Integer getIsSigned() {
        return isSigned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_signed")
    public void setIsSigned(Integer isSigned) {
        this.isSigned = isSigned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_unsigned")
    public Integer getIsUnsigned() {
        return isUnsigned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.is_unsigned")
    public void setIsUnsigned(Integer isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.max_value")
    public Long getMaxValue() {
        return maxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.max_value")
    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment")
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment")
    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment_ratio")
    public BigDecimal getAutoIncrementRatio() {
        return autoIncrementRatio;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.auto_increment_ratio")
    public void setAutoIncrementRatio(BigDecimal autoIncrementRatio) {
        this.autoIncrementRatio = autoIncrementRatio;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.data_type")
    public String getDataType() {
        return dataType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.data_type")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_type")
    public String getColumnType() {
        return columnType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source field: schema_auto_increment_columns.column_type")
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source Table: schema_auto_increment_columns")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", isSigned=").append(isSigned);
        sb.append(", isUnsigned=").append(isUnsigned);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", autoIncrement=").append(autoIncrement);
        sb.append(", autoIncrementRatio=").append(autoIncrementRatio);
        sb.append(", dataType=").append(dataType);
        sb.append(", columnType=").append(columnType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source Table: schema_auto_increment_columns")
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
        SchemaAutoIncrementColumns other = (SchemaAutoIncrementColumns) that;
        return (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getIsSigned() == null ? other.getIsSigned() == null : this.getIsSigned().equals(other.getIsSigned()))
            && (this.getIsUnsigned() == null ? other.getIsUnsigned() == null : this.getIsUnsigned().equals(other.getIsUnsigned()))
            && (this.getMaxValue() == null ? other.getMaxValue() == null : this.getMaxValue().equals(other.getMaxValue()))
            && (this.getAutoIncrement() == null ? other.getAutoIncrement() == null : this.getAutoIncrement().equals(other.getAutoIncrement()))
            && (this.getAutoIncrementRatio() == null ? other.getAutoIncrementRatio() == null : this.getAutoIncrementRatio().equals(other.getAutoIncrementRatio()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.3750573+08:00", comments="Source Table: schema_auto_increment_columns")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getIsSigned() == null) ? 0 : getIsSigned().hashCode());
        result = prime * result + ((getIsUnsigned() == null) ? 0 : getIsUnsigned().hashCode());
        result = prime * result + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        result = prime * result + ((getAutoIncrement() == null) ? 0 : getAutoIncrement().hashCode());
        result = prime * result + ((getAutoIncrementRatio() == null) ? 0 : getAutoIncrementRatio().hashCode());
        return result;
    }
}