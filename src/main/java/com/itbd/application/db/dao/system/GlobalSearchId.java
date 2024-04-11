package com.itbd.application.db.dao.system;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Objects;

public class GlobalSearchId implements Serializable {

    @Column(name = "tx_doc_type")
    private String docType;

    @Column(name = "tx_name")
    private String name;

    public GlobalSearchId(String docType, String name) {
        this.docType = docType;
        this.name = name;
    }

    public GlobalSearchId() {
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlobalSearchId that = (GlobalSearchId) o;
        return Objects.equals(docType, that.docType) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docType, name);
    }
}
