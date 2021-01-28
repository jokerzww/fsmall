package com.fsteam.fsmall.model;

import java.io.Serializable;
import javax.annotation.Generated;

public class SessionSslStatus implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.thread_id")
    private Long threadId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_version")
    private String sslVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_cipher")
    private String sslCipher;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_sessions_reused")
    private String sslSessionsReused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.thread_id")
    public Long getThreadId() {
        return threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.thread_id")
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_version")
    public String getSslVersion() {
        return sslVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_version")
    public void setSslVersion(String sslVersion) {
        this.sslVersion = sslVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_cipher")
    public String getSslCipher() {
        return sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_cipher")
    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_sessions_reused")
    public String getSslSessionsReused() {
        return sslSessionsReused;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source field: session_ssl_status.ssl_sessions_reused")
    public void setSslSessionsReused(String sslSessionsReused) {
        this.sslSessionsReused = sslSessionsReused;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", sslVersion=").append(sslVersion);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslSessionsReused=").append(sslSessionsReused);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
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
        SessionSslStatus other = (SessionSslStatus) that;
        return (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getSslVersion() == null ? other.getSslVersion() == null : this.getSslVersion().equals(other.getSslVersion()))
            && (this.getSslCipher() == null ? other.getSslCipher() == null : this.getSslCipher().equals(other.getSslCipher()))
            && (this.getSslSessionsReused() == null ? other.getSslSessionsReused() == null : this.getSslSessionsReused().equals(other.getSslSessionsReused()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-29T00:44:41.4791526+08:00", comments="Source Table: session_ssl_status")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getSslVersion() == null) ? 0 : getSslVersion().hashCode());
        result = prime * result + ((getSslCipher() == null) ? 0 : getSslCipher().hashCode());
        result = prime * result + ((getSslSessionsReused() == null) ? 0 : getSslSessionsReused().hashCode());
        return result;
    }
}