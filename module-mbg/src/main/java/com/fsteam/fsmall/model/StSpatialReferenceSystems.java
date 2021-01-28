package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class StSpatialReferenceSystems implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME")
    private String srsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID")
    private Integer srsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION")
    private String organization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID")
    private Integer organizationCoordsysId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION")
    private String definition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME")
    public String getSrsName() {
        return srsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME")
    public void setSrsName(String srsName) {
        this.srsName = srsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID")
    public Integer getSrsId() {
        return srsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID")
    public void setSrsId(Integer srsId) {
        this.srsId = srsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION")
    public String getOrganization() {
        return organization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID")
    public Integer getOrganizationCoordsysId() {
        return organizationCoordsysId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID")
    public void setOrganizationCoordsysId(Integer organizationCoordsysId) {
        this.organizationCoordsysId = organizationCoordsysId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION")
    public String getDefinition() {
        return definition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source field: ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4691424+08:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", srsName=").append(srsName);
        sb.append(", srsId=").append(srsId);
        sb.append(", organization=").append(organization);
        sb.append(", organizationCoordsysId=").append(organizationCoordsysId);
        sb.append(", definition=").append(definition);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
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
        StSpatialReferenceSystems other = (StSpatialReferenceSystems) that;
        return (this.getSrsName() == null ? other.getSrsName() == null : this.getSrsName().equals(other.getSrsName()))
            && (this.getSrsId() == null ? other.getSrsId() == null : this.getSrsId().equals(other.getSrsId()))
            && (this.getOrganization() == null ? other.getOrganization() == null : this.getOrganization().equals(other.getOrganization()))
            && (this.getOrganizationCoordsysId() == null ? other.getOrganizationCoordsysId() == null : this.getOrganizationCoordsysId().equals(other.getOrganizationCoordsysId()))
            && (this.getDefinition() == null ? other.getDefinition() == null : this.getDefinition().equals(other.getDefinition()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4701433+08:00", comments="Source Table: ST_SPATIAL_REFERENCE_SYSTEMS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSrsName() == null) ? 0 : getSrsName().hashCode());
        result = prime * result + ((getSrsId() == null) ? 0 : getSrsId().hashCode());
        result = prime * result + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        result = prime * result + ((getOrganizationCoordsysId() == null) ? 0 : getOrganizationCoordsysId().hashCode());
        result = prime * result + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}