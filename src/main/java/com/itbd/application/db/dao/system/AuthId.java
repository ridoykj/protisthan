package com.itbd.application.db.dao.system;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Objects;


public class AuthId implements Serializable {
    @Column(name = "tx_doc_type")
    private String docType;
    @Column(name = "tx_name")
    private String name;
    @Column(name = "tx_field_name")
    private String fieldName;

    public AuthId(String docType, String name, String fieldName) {
        this.docType = docType;
        this.name = name;
        this.fieldName = fieldName;
    }

    public AuthId() {
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

    public String getFieldname() {
        return fieldName;
    }

    public void setFieldname(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthId authId = (AuthId) o;
        return Objects.equals(docType, authId.docType) && Objects.equals(name, authId.name) && Objects.equals(fieldName, authId.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docType, name, fieldName);
    }
}
