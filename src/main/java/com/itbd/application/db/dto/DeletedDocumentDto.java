package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DeletedDocumentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DeletedDocumentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String deletedName,
        String deletedDocType,
        Boolean restored,
        String newName,
        String data,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DeletedDocumentDto fromEntity(DeletedDocumentDao eDeletedDocumentDao) {
        return new DeletedDocumentDto(
                eDeletedDocumentDao.getName(),
                eDeletedDocumentDao.getCreation(),
                eDeletedDocumentDao.getModified(),
                eDeletedDocumentDao.getModifiedBy(),
                eDeletedDocumentDao.getOwner(),
                eDeletedDocumentDao.getIsDocStatus(),
                eDeletedDocumentDao.getIdx(),
                eDeletedDocumentDao.getDeletedName(),
                eDeletedDocumentDao.getDeletedDocType(),
                eDeletedDocumentDao.getRestored(),
                eDeletedDocumentDao.getNewName(),
                eDeletedDocumentDao.getData(),
                eDeletedDocumentDao.getUserTags(),
                eDeletedDocumentDao.getComments(),
                eDeletedDocumentDao.getAssign(),
                eDeletedDocumentDao.getLikedBy());
    }

    public static void fromDTO(DeletedDocumentDto vDeletedDocumentDto, DeletedDocumentDao eDeletedDocumentDao) {
        eDeletedDocumentDao.setName(vDeletedDocumentDto.name());
        eDeletedDocumentDao.setCreation(vDeletedDocumentDto.creation());
        eDeletedDocumentDao.setModified(vDeletedDocumentDto.modified());
        eDeletedDocumentDao.setModifiedBy(vDeletedDocumentDto.modifiedBy());
        eDeletedDocumentDao.setOwner(vDeletedDocumentDto.owner());
        eDeletedDocumentDao.setIsDocStatus(vDeletedDocumentDto.isDocStatus());
        eDeletedDocumentDao.setIdx(vDeletedDocumentDto.idx());
        eDeletedDocumentDao.setDeletedName(vDeletedDocumentDto.deletedName());
        eDeletedDocumentDao.setDeletedDocType(vDeletedDocumentDto.deletedDocType());
        eDeletedDocumentDao.setRestored(vDeletedDocumentDto.restored());
        eDeletedDocumentDao.setNewName(vDeletedDocumentDto.newName());
        eDeletedDocumentDao.setData(vDeletedDocumentDto.data());
        eDeletedDocumentDao.setUserTags(vDeletedDocumentDto.userTags());
        eDeletedDocumentDao.setComments(vDeletedDocumentDto.comments());
        eDeletedDocumentDao.setAssign(vDeletedDocumentDto.assign());
        eDeletedDocumentDao.setLikedBy(vDeletedDocumentDto.likedBy());
    }
}