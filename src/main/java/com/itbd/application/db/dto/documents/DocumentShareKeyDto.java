package com.itbd.application.db.dto.documents;

import com.itbd.application.db.dao.documents.DocumentShareKeyDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DocumentShareKeyDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceDocType,
        String referenceDocName,
        String key,
        LocalDate expiresOn,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DocumentShareKeyDto fromEntity(DocumentShareKeyDao eDocumentShareKeyDao) {
        return new DocumentShareKeyDto(
                eDocumentShareKeyDao.getName(),
                eDocumentShareKeyDao.getCreation(),
                eDocumentShareKeyDao.getModified(),
                eDocumentShareKeyDao.getModifiedBy(),
                eDocumentShareKeyDao.getOwner(),
                eDocumentShareKeyDao.getIsDocStatus(),
                eDocumentShareKeyDao.getIdx(),
                eDocumentShareKeyDao.getReferenceDocType(),
                eDocumentShareKeyDao.getReferenceDocName(),
                eDocumentShareKeyDao.getKey(),
                eDocumentShareKeyDao.getExpiresOn(),
                eDocumentShareKeyDao.getUserTags(),
                eDocumentShareKeyDao.getComments(),
                eDocumentShareKeyDao.getAssign(),
                eDocumentShareKeyDao.getLikedBy());
    }

    public static void fromDTO(DocumentShareKeyDto vDocumentShareKeyDto, DocumentShareKeyDao eDocumentShareKeyDao) {
        eDocumentShareKeyDao.setName(vDocumentShareKeyDto.name());
        eDocumentShareKeyDao.setCreation(vDocumentShareKeyDto.creation());
        eDocumentShareKeyDao.setModified(vDocumentShareKeyDto.modified());
        eDocumentShareKeyDao.setModifiedBy(vDocumentShareKeyDto.modifiedBy());
        eDocumentShareKeyDao.setOwner(vDocumentShareKeyDto.owner());
        eDocumentShareKeyDao.setIsDocStatus(vDocumentShareKeyDto.isDocStatus());
        eDocumentShareKeyDao.setIdx(vDocumentShareKeyDto.idx());
        eDocumentShareKeyDao.setReferenceDocType(vDocumentShareKeyDto.referenceDocType());
        eDocumentShareKeyDao.setReferenceDocName(vDocumentShareKeyDto.referenceDocName());
        eDocumentShareKeyDao.setKey(vDocumentShareKeyDto.key());
        eDocumentShareKeyDao.setExpiresOn(vDocumentShareKeyDto.expiresOn());
        eDocumentShareKeyDao.setUserTags(vDocumentShareKeyDto.userTags());
        eDocumentShareKeyDao.setComments(vDocumentShareKeyDto.comments());
        eDocumentShareKeyDao.setAssign(vDocumentShareKeyDto.assign());
        eDocumentShareKeyDao.setLikedBy(vDocumentShareKeyDto.likedBy());
    }
}