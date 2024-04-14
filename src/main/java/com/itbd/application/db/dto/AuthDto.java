package com.itbd.application.db.dto;

import com.itbd.application.db.dao.system.AuthDao;
import jakarta.persistence.Id;

public record AuthDto(
        @Id
        String docType,
        String name,
        String fieldName,
        String password,
        Integer encrypted
) {
    public static AuthDto asDTO(AuthDao authDao) {
        return new AuthDto(
                authDao.getDocType(),
                authDao.getName(),
                authDao.getFieldName(),
                authDao.getPassword(),
                authDao.getEncrypted()
        );
    }

    public static void asEntity(AuthDto value, AuthDao data) {
        data.setDocType(value.docType());
        data.setName(value.name());
        data.setFieldName(value.fieldName());
        data.setPassword(value.password());
        data.setEncrypted(value.encrypted());
    }
}
