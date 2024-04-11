package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ClosedDocumentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ClosedDocumentDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        Boolean closed,
        String parent,
        String parentField,
        String parentType
) {
    public static ClosedDocumentDto fromEntity(ClosedDocumentDao eClosedDocumentDao) {
        return new ClosedDocumentDto(
                eClosedDocumentDao.getName(),
                eClosedDocumentDao.getCreation(),
                eClosedDocumentDao.getModified(),
                eClosedDocumentDao.getModifiedBy(),
                eClosedDocumentDao.getOwner(),
                eClosedDocumentDao.getIsDocStatus(),
                eClosedDocumentDao.getIdx(),
                eClosedDocumentDao.getDocumentType(),
                eClosedDocumentDao.getClosed(),
                eClosedDocumentDao.getParent(),
                eClosedDocumentDao.getParentField(),
                eClosedDocumentDao.getParentType());
    }

    public static void fromDTO(ClosedDocumentDto vClosedDocumentDto, ClosedDocumentDao eClosedDocumentDao) {
        eClosedDocumentDao.setName(vClosedDocumentDto.name());
        eClosedDocumentDao.setCreation(vClosedDocumentDto.creation());
        eClosedDocumentDao.setModified(vClosedDocumentDto.modified());
        eClosedDocumentDao.setModifiedBy(vClosedDocumentDto.modifiedBy());
        eClosedDocumentDao.setOwner(vClosedDocumentDto.owner());
        eClosedDocumentDao.setIsDocStatus(vClosedDocumentDto.isDocStatus());
        eClosedDocumentDao.setIdx(vClosedDocumentDto.idx());
        eClosedDocumentDao.setDocumentType(vClosedDocumentDto.documentType());
        eClosedDocumentDao.setClosed(vClosedDocumentDto.closed());
        eClosedDocumentDao.setParent(vClosedDocumentDto.parent());
        eClosedDocumentDao.setParentField(vClosedDocumentDto.parentField());
        eClosedDocumentDao.setParentType(vClosedDocumentDto.parentType());
    }
}