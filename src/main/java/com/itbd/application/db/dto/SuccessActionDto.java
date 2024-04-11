package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SuccessActionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SuccessActionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String refDocType,
        String firstSuccessMessage,
        String message,
        String nextActions,
        Integer actionTimeout,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SuccessActionDto fromEntity(SuccessActionDao eSuccessActionDao) {
        return new SuccessActionDto(
                eSuccessActionDao.getName(),
                eSuccessActionDao.getCreation(),
                eSuccessActionDao.getModified(),
                eSuccessActionDao.getModifiedBy(),
                eSuccessActionDao.getOwner(),
                eSuccessActionDao.getIsDocStatus(),
                eSuccessActionDao.getIdx(),
                eSuccessActionDao.getRefDocType(),
                eSuccessActionDao.getFirstSuccessMessage(),
                eSuccessActionDao.getMessage(),
                eSuccessActionDao.getNextActions(),
                eSuccessActionDao.getActionTimeout(),
                eSuccessActionDao.getUserTags(),
                eSuccessActionDao.getComments(),
                eSuccessActionDao.getAssign(),
                eSuccessActionDao.getLikedBy());
    }

    public static void fromDTO(SuccessActionDto vSuccessActionDto, SuccessActionDao eSuccessActionDao) {
        eSuccessActionDao.setName(vSuccessActionDto.name());
        eSuccessActionDao.setCreation(vSuccessActionDto.creation());
        eSuccessActionDao.setModified(vSuccessActionDto.modified());
        eSuccessActionDao.setModifiedBy(vSuccessActionDto.modifiedBy());
        eSuccessActionDao.setOwner(vSuccessActionDto.owner());
        eSuccessActionDao.setIsDocStatus(vSuccessActionDto.isDocStatus());
        eSuccessActionDao.setIdx(vSuccessActionDto.idx());
        eSuccessActionDao.setRefDocType(vSuccessActionDto.refDocType());
        eSuccessActionDao.setFirstSuccessMessage(vSuccessActionDto.firstSuccessMessage());
        eSuccessActionDao.setMessage(vSuccessActionDto.message());
        eSuccessActionDao.setNextActions(vSuccessActionDto.nextActions());
        eSuccessActionDao.setActionTimeout(vSuccessActionDto.actionTimeout());
        eSuccessActionDao.setUserTags(vSuccessActionDto.userTags());
        eSuccessActionDao.setComments(vSuccessActionDto.comments());
        eSuccessActionDao.setAssign(vSuccessActionDto.assign());
        eSuccessActionDao.setLikedBy(vSuccessActionDto.likedBy());
    }
}