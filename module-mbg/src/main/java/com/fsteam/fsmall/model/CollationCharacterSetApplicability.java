package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class CollationCharacterSetApplicability implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    private String collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    private String characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    public String getCollationName() {
        return collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME")
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source field: COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collationName=").append(collationName);
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
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
        CollationCharacterSetApplicability other = (CollationCharacterSetApplicability) that;
        return (this.getCollationName() == null ? other.getCollationName() == null : this.getCollationName().equals(other.getCollationName()))
            && (this.getCharacterSetName() == null ? other.getCharacterSetName() == null : this.getCharacterSetName().equals(other.getCharacterSetName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2749658+08:00", comments="Source Table: COLLATION_CHARACTER_SET_APPLICABILITY")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollationName() == null) ? 0 : getCollationName().hashCode());
        result = prime * result + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        return result;
    }
}