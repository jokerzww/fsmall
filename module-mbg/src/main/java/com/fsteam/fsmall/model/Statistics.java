package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class Statistics implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_CATALOG")
    private String tableCatalog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_SCHEMA")
    private String tableSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_NAME")
    private String tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.NON_UNIQUE")
    private Integer nonUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.INDEX_SCHEMA")
    private String indexSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.INDEX_NAME")
    private String indexName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.SEQ_IN_INDEX")
    private Integer seqInIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.COLUMN_NAME")
    private String columnName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.COLLATION")
    private String collation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.CARDINALITY")
    private Long cardinality;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.SUB_PART")
    private Long subPart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.NULLABLE")
    private String nullable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.INDEX_TYPE")
    private String indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.COMMENT")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.INDEX_COMMENT")
    private String indexComment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.IS_VISIBLE")
    private String isVisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.PACKED")
    private byte[] packed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.EXPRESSION")
    private String expression;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source Table: STATISTICS")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_CATALOG")
    public String getTableCatalog() {
        return tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_CATALOG")
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_SCHEMA")
    public String getTableSchema() {
        return tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_SCHEMA")
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.TABLE_NAME")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.NON_UNIQUE")
    public Integer getNonUnique() {
        return nonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.NON_UNIQUE")
    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.INDEX_SCHEMA")
    public String getIndexSchema() {
        return indexSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.INDEX_SCHEMA")
    public void setIndexSchema(String indexSchema) {
        this.indexSchema = indexSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.INDEX_NAME")
    public String getIndexName() {
        return indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.INDEX_NAME")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.SEQ_IN_INDEX")
    public Integer getSeqInIndex() {
        return seqInIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.SEQ_IN_INDEX")
    public void setSeqInIndex(Integer seqInIndex) {
        this.seqInIndex = seqInIndex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.COLUMN_NAME")
    public String getColumnName() {
        return columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4891602+08:00", comments="Source field: STATISTICS.COLUMN_NAME")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.COLLATION")
    public String getCollation() {
        return collation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.COLLATION")
    public void setCollation(String collation) {
        this.collation = collation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.CARDINALITY")
    public Long getCardinality() {
        return cardinality;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.CARDINALITY")
    public void setCardinality(Long cardinality) {
        this.cardinality = cardinality;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.SUB_PART")
    public Long getSubPart() {
        return subPart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.SUB_PART")
    public void setSubPart(Long subPart) {
        this.subPart = subPart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.NULLABLE")
    public String getNullable() {
        return nullable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.NULLABLE")
    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.INDEX_TYPE")
    public String getIndexType() {
        return indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.INDEX_TYPE")
    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.COMMENT")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.COMMENT")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.INDEX_COMMENT")
    public String getIndexComment() {
        return indexComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.INDEX_COMMENT")
    public void setIndexComment(String indexComment) {
        this.indexComment = indexComment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.IS_VISIBLE")
    public String getIsVisible() {
        return isVisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.IS_VISIBLE")
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.PACKED")
    public byte[] getPacked() {
        return packed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.PACKED")
    public void setPacked(byte[] packed) {
        this.packed = packed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.EXPRESSION")
    public String getExpression() {
        return expression;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source field: STATISTICS.EXPRESSION")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source Table: STATISTICS")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", nonUnique=").append(nonUnique);
        sb.append(", indexSchema=").append(indexSchema);
        sb.append(", indexName=").append(indexName);
        sb.append(", seqInIndex=").append(seqInIndex);
        sb.append(", columnName=").append(columnName);
        sb.append(", collation=").append(collation);
        sb.append(", cardinality=").append(cardinality);
        sb.append(", subPart=").append(subPart);
        sb.append(", nullable=").append(nullable);
        sb.append(", indexType=").append(indexType);
        sb.append(", comment=").append(comment);
        sb.append(", indexComment=").append(indexComment);
        sb.append(", isVisible=").append(isVisible);
        sb.append(", packed=").append(packed);
        sb.append(", expression=").append(expression);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source Table: STATISTICS")
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
        Statistics other = (Statistics) that;
        return (this.getTableCatalog() == null ? other.getTableCatalog() == null : this.getTableCatalog().equals(other.getTableCatalog()))
            && (this.getTableSchema() == null ? other.getTableSchema() == null : this.getTableSchema().equals(other.getTableSchema()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getNonUnique() == null ? other.getNonUnique() == null : this.getNonUnique().equals(other.getNonUnique()))
            && (this.getIndexSchema() == null ? other.getIndexSchema() == null : this.getIndexSchema().equals(other.getIndexSchema()))
            && (this.getIndexName() == null ? other.getIndexName() == null : this.getIndexName().equals(other.getIndexName()))
            && (this.getSeqInIndex() == null ? other.getSeqInIndex() == null : this.getSeqInIndex().equals(other.getSeqInIndex()))
            && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()))
            && (this.getCollation() == null ? other.getCollation() == null : this.getCollation().equals(other.getCollation()))
            && (this.getCardinality() == null ? other.getCardinality() == null : this.getCardinality().equals(other.getCardinality()))
            && (this.getSubPart() == null ? other.getSubPart() == null : this.getSubPart().equals(other.getSubPart()))
            && (this.getNullable() == null ? other.getNullable() == null : this.getNullable().equals(other.getNullable()))
            && (this.getIndexType() == null ? other.getIndexType() == null : this.getIndexType().equals(other.getIndexType()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getIndexComment() == null ? other.getIndexComment() == null : this.getIndexComment().equals(other.getIndexComment()))
            && (this.getIsVisible() == null ? other.getIsVisible() == null : this.getIsVisible().equals(other.getIsVisible()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4901617+08:00", comments="Source Table: STATISTICS")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTableCatalog() == null) ? 0 : getTableCatalog().hashCode());
        result = prime * result + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getNonUnique() == null) ? 0 : getNonUnique().hashCode());
        result = prime * result + ((getIndexSchema() == null) ? 0 : getIndexSchema().hashCode());
        result = prime * result + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        result = prime * result + ((getSeqInIndex() == null) ? 0 : getSeqInIndex().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        result = prime * result + ((getCollation() == null) ? 0 : getCollation().hashCode());
        result = prime * result + ((getCardinality() == null) ? 0 : getCardinality().hashCode());
        result = prime * result + ((getSubPart() == null) ? 0 : getSubPart().hashCode());
        result = prime * result + ((getNullable() == null) ? 0 : getNullable().hashCode());
        result = prime * result + ((getIndexType() == null) ? 0 : getIndexType().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getIndexComment() == null) ? 0 : getIndexComment().hashCode());
        result = prime * result + ((getIsVisible() == null) ? 0 : getIsVisible().hashCode());
        return result;
    }
}