package com.itbd.application.db.dto.documents;

import com.itbd.application.db.dao.documents.DocumentFollowDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocumentFollowDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String refDocType,
        String refDocName,
        String user,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DocumentFollowDto fromEntity(DocumentFollowDao eDocumentFollowDao) {
        return new DocumentFollowDto(
                eDocumentFollowDao.getName(),
                eDocumentFollowDao.getCreation(),
                eDocumentFollowDao.getModified(),
                eDocumentFollowDao.getModifiedBy(),
                eDocumentFollowDao.getOwner(),
                eDocumentFollowDao.getIsDocStatus(),
                eDocumentFollowDao.getIdx(),
                eDocumentFollowDao.getRefDocType(),
                eDocumentFollowDao.getRefDocName(),
                eDocumentFollowDao.getUser(),
                eDocumentFollowDao.getUserTags(),
                eDocumentFollowDao.getComments(),
                eDocumentFollowDao.getAssign(),
                eDocumentFollowDao.getLikedBy());
    }

    public static void fromDTO(DocumentFollowDto vDocumentFollowDto, DocumentFollowDao eDocumentFollowDao) {
        eDocumentFollowDao.setName(vDocumentFollowDto.name());
        eDocumentFollowDao.setCreation(vDocumentFollowDto.creation());
        eDocumentFollowDao.setModified(vDocumentFollowDto.modified());
        eDocumentFollowDao.setModifiedBy(vDocumentFollowDto.modifiedBy());
        eDocumentFollowDao.setOwner(vDocumentFollowDto.owner());
        eDocumentFollowDao.setIsDocStatus(vDocumentFollowDto.isDocStatus());
        eDocumentFollowDao.setIdx(vDocumentFollowDto.idx());
        eDocumentFollowDao.setRefDocType(vDocumentFollowDto.refDocType());
        eDocumentFollowDao.setRefDocName(vDocumentFollowDto.refDocName());
        eDocumentFollowDao.setUser(vDocumentFollowDto.user());
        eDocumentFollowDao.setUserTags(vDocumentFollowDto.userTags());
        eDocumentFollowDao.setComments(vDocumentFollowDto.comments());
        eDocumentFollowDao.setAssign(vDocumentFollowDto.assign());
        eDocumentFollowDao.setLikedBy(vDocumentFollowDto.likedBy());
    }
}