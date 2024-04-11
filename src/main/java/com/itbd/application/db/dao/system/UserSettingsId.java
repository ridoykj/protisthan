package com.itbd.application.db.dao.system;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Objects;

public class UserSettingsId implements Serializable {
    @Column(name = "tx_user")
    private String user;

    @Column(name = "tx_doc_type")
    private String docType;

    public UserSettingsId(String user, String docType) {
        this.user = user;
        this.docType = docType;
    }

    public UserSettingsId() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettingsId that = (UserSettingsId) o;
        return Objects.equals(user, that.user) && Objects.equals(docType, that.docType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, docType);
    }
}
