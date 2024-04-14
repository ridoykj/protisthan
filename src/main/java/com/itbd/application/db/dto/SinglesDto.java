package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SinglesDao;
import jakarta.persistence.Id;

public record SinglesDto(
        @Id
        Long singlesId,
        String docType,
        String field,
        String value
) {
    public static SinglesDto fromEntity(SinglesDao eSinglesDao) {
        return new SinglesDto(
                eSinglesDao.getSinglesId(),
                eSinglesDao.getDocType(),
                eSinglesDao.getField(),
                eSinglesDao.getValue());
    }

    public static void fromDTO(SinglesDto vSinglesDto, SinglesDao eSinglesDao) {
        eSinglesDao.setSinglesId(vSinglesDto.singlesId());
        eSinglesDao.setDocType(vSinglesDto.docType());
        eSinglesDao.setField(vSinglesDto.field());
        eSinglesDao.setValue(vSinglesDto.value());
    }
}