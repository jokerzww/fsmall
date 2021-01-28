package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Collations implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: COLLATIONS.COLLATION_NAME")
    private String collationName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.CHARACTER_SET_NAME")
    private String characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.ID")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.IS_DEFAULT")
    private String isDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.IS_COMPILED")
    private String isCompiled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.SORTLEN")
    private Integer sortlen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.PAD_ATTRIBUTE")
    private String padAttribute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source Table: COLLATIONS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.207906+08:00", comments="Source field: COLLATIONS.COLLATION_NAME")
    public String getCollationName() {
        return collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.COLLATION_NAME")
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.CHARACTER_SET_NAME")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.ID")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.ID")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.IS_DEFAULT")
    public String getIsDefault() {
        return isDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.IS_DEFAULT")
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.IS_COMPILED")
    public String getIsCompiled() {
        return isCompiled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.IS_COMPILED")
    public void setIsCompiled(String isCompiled) {
        this.isCompiled = isCompiled;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.SORTLEN")
    public Integer getSortlen() {
        return sortlen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.SORTLEN")
    public void setSortlen(Integer sortlen) {
        this.sortlen = sortlen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.PAD_ATTRIBUTE")
    public String getPadAttribute() {
        return padAttribute;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source field: COLLATIONS.PAD_ATTRIBUTE")
    public void setPadAttribute(String padAttribute) {
        this.padAttribute = padAttribute;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source Table: COLLATIONS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collationName=").append(collationName);
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", id=").append(id);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", isCompiled=").append(isCompiled);
        sb.append(", sortlen=").append(sortlen);
        sb.append(", padAttribute=").append(padAttribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source Table: COLLATIONS")
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
        Collations other = (Collations) that;
        return (this.getCollationName() == null ? other.getCollationName() == null : this.getCollationName().equals(other.getCollationName()))
            && (this.getCharacterSetName() == null ? other.getCharacterSetName() == null : this.getCharacterSetName().equals(other.getCharacterSetName()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getIsCompiled() == null ? other.getIsCompiled() == null : this.getIsCompiled().equals(other.getIsCompiled()))
            && (this.getSortlen() == null ? other.getSortlen() == null : this.getSortlen().equals(other.getSortlen()))
            && (this.getPadAttribute() == null ? other.getPadAttribute() == null : this.getPadAttribute().equals(other.getPadAttribute()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.208906+08:00", comments="Source Table: COLLATIONS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollationName() == null) ? 0 : getCollationName().hashCode());
        result = prime * result + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getIsCompiled() == null) ? 0 : getIsCompiled().hashCode());
        result = prime * result + ((getSortlen() == null) ? 0 : getSortlen().hashCode());
        result = prime * result + ((getPadAttribute() == null) ? 0 : getPadAttribute().hashCode());
        return result;
    }
}