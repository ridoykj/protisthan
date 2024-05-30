package com.itbd.application.db.dto;

import com.itbd.application.db.dao.email.UnhandledEmailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UnhandledEmailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailAccount,
        String uid,
        String reason,
        String messageId,
        String raw,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UnhandledEmailDto fromEntity(UnhandledEmailDao eUnhandledEmailDao) {
        return new UnhandledEmailDto(
                eUnhandledEmailDao.getName(),
                eUnhandledEmailDao.getCreation(),
                eUnhandledEmailDao.getModified(),
                eUnhandledEmailDao.getModifiedBy(),
                eUnhandledEmailDao.getOwner(),
                eUnhandledEmailDao.getIsDocStatus(),
                eUnhandledEmailDao.getIdx(),
                eUnhandledEmailDao.getEmailAccount(),
                eUnhandledEmailDao.getUid(),
                eUnhandledEmailDao.getReason(),
                eUnhandledEmailDao.getMessageId(),
                eUnhandledEmailDao.getRaw(),
                eUnhandledEmailDao.getUserTags(),
                eUnhandledEmailDao.getComments(),
                eUnhandledEmailDao.getAssign(),
                eUnhandledEmailDao.getLikedBy());
    }

    public static void fromDTO(UnhandledEmailDto vUnhandledEmailDto, UnhandledEmailDao eUnhandledEmailDao) {
        eUnhandledEmailDao.setName(vUnhandledEmailDto.name());
        eUnhandledEmailDao.setCreation(vUnhandledEmailDto.creation());
        eUnhandledEmailDao.setModified(vUnhandledEmailDto.modified());
        eUnhandledEmailDao.setModifiedBy(vUnhandledEmailDto.modifiedBy());
        eUnhandledEmailDao.setOwner(vUnhandledEmailDto.owner());
        eUnhandledEmailDao.setIsDocStatus(vUnhandledEmailDto.isDocStatus());
        eUnhandledEmailDao.setIdx(vUnhandledEmailDto.idx());
        eUnhandledEmailDao.setEmailAccount(vUnhandledEmailDto.emailAccount());
        eUnhandledEmailDao.setUid(vUnhandledEmailDto.uid());
        eUnhandledEmailDao.setReason(vUnhandledEmailDto.reason());
        eUnhandledEmailDao.setMessageId(vUnhandledEmailDto.messageId());
        eUnhandledEmailDao.setRaw(vUnhandledEmailDto.raw());
        eUnhandledEmailDao.setUserTags(vUnhandledEmailDto.userTags());
        eUnhandledEmailDao.setComments(vUnhandledEmailDto.comments());
        eUnhandledEmailDao.setAssign(vUnhandledEmailDto.assign());
        eUnhandledEmailDao.setLikedBy(vUnhandledEmailDto.likedBy());
    }
}