package com.fsteam.fsmall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class XStatementsWithErrorsOrWarnings implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.db")
    private String db;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.exec_count")
    private Long execCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.errors")
    private Long errors;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.error_pct")
    private BigDecimal errorPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.warnings")
    private Long warnings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.warning_pct")
    private BigDecimal warningPct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.first_seen")
    private Date firstSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.last_seen")
    private Date lastSeen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.digest")
    private String digest;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.query")
    private String query;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source Table: x$statements_with_errors_or_warnings")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.db")
    public String getDb() {
        return db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.db")
    public void setDb(String db) {
        this.db = db;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.exec_count")
    public Long getExecCount() {
        return execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.exec_count")
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.errors")
    public Long getErrors() {
        return errors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0437544+08:00", comments="Source field: x$statements_with_errors_or_warnings.errors")
    public void setErrors(Long errors) {
        this.errors = errors;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.error_pct")
    public BigDecimal getErrorPct() {
        return errorPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.error_pct")
    public void setErrorPct(BigDecimal errorPct) {
        this.errorPct = errorPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.warnings")
    public Long getWarnings() {
        return warnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.warnings")
    public void setWarnings(Long warnings) {
        this.warnings = warnings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.warning_pct")
    public BigDecimal getWarningPct() {
        return warningPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.warning_pct")
    public void setWarningPct(BigDecimal warningPct) {
        this.warningPct = warningPct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.first_seen")
    public Date getFirstSeen() {
        return firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.first_seen")
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.last_seen")
    public Date getLastSeen() {
        return lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.last_seen")
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.digest")
    public String getDigest() {
        return digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.query")
    public String getQuery() {
        return query;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source field: x$statements_with_errors_or_warnings.query")
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source Table: x$statements_with_errors_or_warnings")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", execCount=").append(execCount);
        sb.append(", errors=").append(errors);
        sb.append(", errorPct=").append(errorPct);
        sb.append(", warnings=").append(warnings);
        sb.append(", warningPct=").append(warningPct);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", digest=").append(digest);
        sb.append(", query=").append(query);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source Table: x$statements_with_errors_or_warnings")
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
        XStatementsWithErrorsOrWarnings other = (XStatementsWithErrorsOrWarnings) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getExecCount() == null ? other.getExecCount() == null : this.getExecCount().equals(other.getExecCount()))
            && (this.getErrors() == null ? other.getErrors() == null : this.getErrors().equals(other.getErrors()))
            && (this.getErrorPct() == null ? other.getErrorPct() == null : this.getErrorPct().equals(other.getErrorPct()))
            && (this.getWarnings() == null ? other.getWarnings() == null : this.getWarnings().equals(other.getWarnings()))
            && (this.getWarningPct() == null ? other.getWarningPct() == null : this.getWarningPct().equals(other.getWarningPct()))
            && (this.getFirstSeen() == null ? other.getFirstSeen() == null : this.getFirstSeen().equals(other.getFirstSeen()))
            && (this.getLastSeen() == null ? other.getLastSeen() == null : this.getLastSeen().equals(other.getLastSeen()))
            && (this.getDigest() == null ? other.getDigest() == null : this.getDigest().equals(other.getDigest()))
            && (this.getQuery() == null ? other.getQuery() == null : this.getQuery().equals(other.getQuery()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.0447554+08:00", comments="Source Table: x$statements_with_errors_or_warnings")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getExecCount() == null) ? 0 : getExecCount().hashCode());
        result = prime * result + ((getErrors() == null) ? 0 : getErrors().hashCode());
        result = prime * result + ((getErrorPct() == null) ? 0 : getErrorPct().hashCode());
        result = prime * result + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        result = prime * result + ((getWarningPct() == null) ? 0 : getWarningPct().hashCode());
        result = prime * result + ((getFirstSeen() == null) ? 0 : getFirstSeen().hashCode());
        result = prime * result + ((getLastSeen() == null) ? 0 : getLastSeen().hashCode());
        result = prime * result + ((getDigest() == null) ? 0 : getDigest().hashCode());
        result = prime * result + ((getQuery() == null) ? 0 : getQuery().hashCode());
        return result;
    }
}