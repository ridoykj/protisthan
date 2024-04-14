package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AmendedDocumentNamingSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AmendedDocumentNamingSettingsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String action,
        String parent,
        String parentField,
        String parentType
) {
    public static AmendedDocumentNamingSettingsDto fromEntity(AmendedDocumentNamingSettingsDao eAmendedDocumentNamingSettingsDao) {
        return new AmendedDocumentNamingSettingsDto(
                eAmendedDocumentNamingSettingsDao.getName(),
                eAmendedDocumentNamingSettingsDao.getCreation(),
                eAmendedDocumentNamingSettingsDao.getModified(),
                eAmendedDocumentNamingSettingsDao.getModifiedBy(),
                eAmendedDocumentNamingSettingsDao.getOwner(),
                eAmendedDocumentNamingSettingsDao.getIsDocStatus(),
                eAmendedDocumentNamingSettingsDao.getIdx(),
                eAmendedDocumentNamingSettingsDao.getDocumentType(),
                eAmendedDocumentNamingSettingsDao.getAction(),
                eAmendedDocumentNamingSettingsDao.getParent(),
                eAmendedDocumentNamingSettingsDao.getParentField(),
                eAmendedDocumentNamingSettingsDao.getParentType());
    }

    public static void fromDTO(AmendedDocumentNamingSettingsDto vAmendedDocumentNamingSettingsDto, AmendedDocumentNamingSettingsDao eAmendedDocumentNamingSettingsDao) {
        eAmendedDocumentNamingSettingsDao.setName(vAmendedDocumentNamingSettingsDto.name());
        eAmendedDocumentNamingSettingsDao.setCreation(vAmendedDocumentNamingSettingsDto.creation());
        eAmendedDocumentNamingSettingsDao.setModified(vAmendedDocumentNamingSettingsDto.modified());
        eAmendedDocumentNamingSettingsDao.setModifiedBy(vAmendedDocumentNamingSettingsDto.modifiedBy());
        eAmendedDocumentNamingSettingsDao.setOwner(vAmendedDocumentNamingSettingsDto.owner());
        eAmendedDocumentNamingSettingsDao.setIsDocStatus(vAmendedDocumentNamingSettingsDto.isDocStatus());
        eAmendedDocumentNamingSettingsDao.setIdx(vAmendedDocumentNamingSettingsDto.idx());
        eAmendedDocumentNamingSettingsDao.setDocumentType(vAmendedDocumentNamingSettingsDto.documentType());
        eAmendedDocumentNamingSettingsDao.setAction(vAmendedDocumentNamingSettingsDto.action());
        eAmendedDocumentNamingSettingsDao.setParent(vAmendedDocumentNamingSettingsDto.parent());
        eAmendedDocumentNamingSettingsDao.setParentField(vAmendedDocumentNamingSettingsDto.parentField());
        eAmendedDocumentNamingSettingsDao.setParentType(vAmendedDocumentNamingSettingsDto.parentType());
    }
}