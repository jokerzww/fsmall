package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class StUnitsOfMeasure implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    private String unitName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    private String unitType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    private Double conversionFactor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    public String getUnitName() {
        return unitName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_NAME")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    public String getUnitType() {
        return unitType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.UNIT_TYPE")
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    public Double getConversionFactor() {
        return conversionFactor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.CONVERSION_FACTOR")
    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source field: ST_UNITS_OF_MEASURE.DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", unitName=").append(unitName);
        sb.append(", unitType=").append(unitType);
        sb.append(", conversionFactor=").append(conversionFactor);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: ST_UNITS_OF_MEASURE")
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
        StUnitsOfMeasure other = (StUnitsOfMeasure) that;
        return (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()))
            && (this.getUnitType() == null ? other.getUnitType() == null : this.getUnitType().equals(other.getUnitType()))
            && (this.getConversionFactor() == null ? other.getConversionFactor() == null : this.getConversionFactor().equals(other.getConversionFactor()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.1848853+08:00", comments="Source Table: ST_UNITS_OF_MEASURE")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUnitName() == null) ? 0 : getUnitName().hashCode());
        result = prime * result + ((getUnitType() == null) ? 0 : getUnitType().hashCode());
        result = prime * result + ((getConversionFactor() == null) ? 0 : getConversionFactor().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}