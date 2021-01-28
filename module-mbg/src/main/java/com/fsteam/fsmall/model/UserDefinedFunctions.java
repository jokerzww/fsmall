package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class UserDefinedFunctions implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_NAME")
    private String udfName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_RETURN_TYPE")
    private String udfReturnType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_TYPE")
    private String udfType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_LIBRARY")
    private String udfLibrary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_USAGE_COUNT")
    private Long udfUsageCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: user_defined_functions")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_NAME")
    public String getUdfName() {
        return udfName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_NAME")
    public void setUdfName(String udfName) {
        this.udfName = udfName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_RETURN_TYPE")
    public String getUdfReturnType() {
        return udfReturnType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_RETURN_TYPE")
    public void setUdfReturnType(String udfReturnType) {
        this.udfReturnType = udfReturnType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_TYPE")
    public String getUdfType() {
        return udfType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_TYPE")
    public void setUdfType(String udfType) {
        this.udfType = udfType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_LIBRARY")
    public String getUdfLibrary() {
        return udfLibrary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_LIBRARY")
    public void setUdfLibrary(String udfLibrary) {
        this.udfLibrary = udfLibrary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_USAGE_COUNT")
    public Long getUdfUsageCount() {
        return udfUsageCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source field: user_defined_functions.UDF_USAGE_COUNT")
    public void setUdfUsageCount(Long udfUsageCount) {
        this.udfUsageCount = udfUsageCount;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: user_defined_functions")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", udfName=").append(udfName);
        sb.append(", udfReturnType=").append(udfReturnType);
        sb.append(", udfType=").append(udfType);
        sb.append(", udfLibrary=").append(udfLibrary);
        sb.append(", udfUsageCount=").append(udfUsageCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4421173+08:00", comments="Source Table: user_defined_functions")
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
        UserDefinedFunctions other = (UserDefinedFunctions) that;
        return (this.getUdfName() == null ? other.getUdfName() == null : this.getUdfName().equals(other.getUdfName()))
            && (this.getUdfReturnType() == null ? other.getUdfReturnType() == null : this.getUdfReturnType().equals(other.getUdfReturnType()))
            && (this.getUdfType() == null ? other.getUdfType() == null : this.getUdfType().equals(other.getUdfType()))
            && (this.getUdfLibrary() == null ? other.getUdfLibrary() == null : this.getUdfLibrary().equals(other.getUdfLibrary()))
            && (this.getUdfUsageCount() == null ? other.getUdfUsageCount() == null : this.getUdfUsageCount().equals(other.getUdfUsageCount()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4431185+08:00", comments="Source Table: user_defined_functions")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUdfName() == null) ? 0 : getUdfName().hashCode());
        result = prime * result + ((getUdfReturnType() == null) ? 0 : getUdfReturnType().hashCode());
        result = prime * result + ((getUdfType() == null) ? 0 : getUdfType().hashCode());
        result = prime * result + ((getUdfLibrary() == null) ? 0 : getUdfLibrary().hashCode());
        result = prime * result + ((getUdfUsageCount() == null) ? 0 : getUdfUsageCount().hashCode());
        return result;
    }
}