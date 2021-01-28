package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class CharacterSets implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    private String characterSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    private String defaultCollateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    private Integer maxlen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source Table: CHARACTER_SETS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    public String getCharacterSetName() {
        return characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.CHARACTER_SET_NAME")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.DEFAULT_COLLATE_NAME")
    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    public Integer getMaxlen() {
        return maxlen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source field: CHARACTER_SETS.MAXLEN")
    public void setMaxlen(Integer maxlen) {
        this.maxlen = maxlen;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source Table: CHARACTER_SETS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", defaultCollateName=").append(defaultCollateName);
        sb.append(", description=").append(description);
        sb.append(", maxlen=").append(maxlen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source Table: CHARACTER_SETS")
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
        CharacterSets other = (CharacterSets) that;
        return (this.getCharacterSetName() == null ? other.getCharacterSetName() == null : this.getCharacterSetName().equals(other.getCharacterSetName()))
            && (this.getDefaultCollateName() == null ? other.getDefaultCollateName() == null : this.getDefaultCollateName().equals(other.getDefaultCollateName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getMaxlen() == null ? other.getMaxlen() == null : this.getMaxlen().equals(other.getMaxlen()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.2639548+08:00", comments="Source Table: CHARACTER_SETS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        result = prime * result + ((getDefaultCollateName() == null) ? 0 : getDefaultCollateName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getMaxlen() == null) ? 0 : getMaxlen().hashCode());
        return result;
    }
}