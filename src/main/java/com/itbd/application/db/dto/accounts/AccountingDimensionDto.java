package com.itbd.application.db.dto.accounts;

import com.itbd.application.db.dao.accounts.AccountingDimensionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AccountingDimensionDto(
        @Id String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String label,
        String fieldName,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AccountingDimensionDto fromEntity(AccountingDimensionDao eAccountingDimensionDao) {
        return new AccountingDimensionDto(
                eAccountingDimensionDao.getName(),
                eAccountingDimensionDao.getCreation(),
                eAccountingDimensionDao.getModified(),
                eAccountingDimensionDao.getModifiedBy(),
                eAccountingDimensionDao.getOwner(),
                eAccountingDimensionDao.getIsDocStatus(),
                eAccountingDimensionDao.getIdx(),
                eAccountingDimensionDao.getDocumentType(),
                eAccountingDimensionDao.getLabel(),
                eAccountingDimensionDao.getFieldName(),
                eAccountingDimensionDao.getDisabled(),
                eAccountingDimensionDao.getUserTags(),
                eAccountingDimensionDao.getComments(),
                eAccountingDimensionDao.getAssign(),
                eAccountingDimensionDao.getLikedBy());
    }

    public static void fromDTO(AccountingDimensionDto vAccountingDimensionDto, AccountingDimensionDao eAccountingDimensionDao) {
        eAccountingDimensionDao.setName(vAccountingDimensionDto.name());
        eAccountingDimensionDao.setCreation(vAccountingDimensionDto.creation());
        eAccountingDimensionDao.setModified(vAccountingDimensionDto.modified());
        eAccountingDimensionDao.setModifiedBy(vAccountingDimensionDto.modifiedBy());
        eAccountingDimensionDao.setOwner(vAccountingDimensionDto.owner());
        eAccountingDimensionDao.setIsDocStatus(vAccountingDimensionDto.isDocStatus());
        eAccountingDimensionDao.setIdx(vAccountingDimensionDto.idx());
        eAccountingDimensionDao.setDocumentType(vAccountingDimensionDto.documentType());
        eAccountingDimensionDao.setLabel(vAccountingDimensionDto.label());
        eAccountingDimensionDao.setFieldName(vAccountingDimensionDto.fieldName());
        eAccountingDimensionDao.setDisabled(vAccountingDimensionDto.disabled());
        eAccountingDimensionDao.setUserTags(vAccountingDimensionDto.userTags());
        eAccountingDimensionDao.setComments(vAccountingDimensionDto.comments());
        eAccountingDimensionDao.setAssign(vAccountingDimensionDto.assign());
        eAccountingDimensionDao.setLikedBy(vAccountingDimensionDto.likedBy());
    }
}