package com.itbd.application.db.dto.system;

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
    public static AuthDto fromEntity(AuthDao eAuthDao) {
        return new AuthDto(
                eAuthDao.getDocType(),
                eAuthDao.getName(),
                eAuthDao.getFieldName(),
                eAuthDao.getPassword(),
                eAuthDao.getEncrypted());
    }

    public static void fromDTO(AuthDto vAuthDto, AuthDao eAuthDao) {
        eAuthDao.setDocType(vAuthDto.docType());
        eAuthDao.setName(vAuthDto.name());
        eAuthDao.setFieldName(vAuthDto.fieldName());
        eAuthDao.setPassword(vAuthDto.password());
        eAuthDao.setEncrypted(vAuthDto.encrypted());
    }
}