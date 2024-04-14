package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.emails.EmailFlagQueueDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailFlagQueueDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isCompleted,
        String communication,
        String action,
        String emailAccount,
        String uid,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailFlagQueueDto fromEntity(EmailFlagQueueDao eEmailFlagQueueDao) {
        return new EmailFlagQueueDto(
                eEmailFlagQueueDao.getName(),
                eEmailFlagQueueDao.getCreation(),
                eEmailFlagQueueDao.getModified(),
                eEmailFlagQueueDao.getModifiedBy(),
                eEmailFlagQueueDao.getOwner(),
                eEmailFlagQueueDao.getIsDocStatus(),
                eEmailFlagQueueDao.getIdx(),
                eEmailFlagQueueDao.getIsCompleted(),
                eEmailFlagQueueDao.getCommunication(),
                eEmailFlagQueueDao.getAction(),
                eEmailFlagQueueDao.getEmailAccount(),
                eEmailFlagQueueDao.getUid(),
                eEmailFlagQueueDao.getUserTags(),
                eEmailFlagQueueDao.getComments(),
                eEmailFlagQueueDao.getAssign(),
                eEmailFlagQueueDao.getLikedBy());
    }

    public static void fromDTO(EmailFlagQueueDto vEmailFlagQueueDto, EmailFlagQueueDao eEmailFlagQueueDao) {
        eEmailFlagQueueDao.setName(vEmailFlagQueueDto.name());
        eEmailFlagQueueDao.setCreation(vEmailFlagQueueDto.creation());
        eEmailFlagQueueDao.setModified(vEmailFlagQueueDto.modified());
        eEmailFlagQueueDao.setModifiedBy(vEmailFlagQueueDto.modifiedBy());
        eEmailFlagQueueDao.setOwner(vEmailFlagQueueDto.owner());
        eEmailFlagQueueDao.setIsDocStatus(vEmailFlagQueueDto.isDocStatus());
        eEmailFlagQueueDao.setIdx(vEmailFlagQueueDto.idx());
        eEmailFlagQueueDao.setIsCompleted(vEmailFlagQueueDto.isCompleted());
        eEmailFlagQueueDao.setCommunication(vEmailFlagQueueDto.communication());
        eEmailFlagQueueDao.setAction(vEmailFlagQueueDto.action());
        eEmailFlagQueueDao.setEmailAccount(vEmailFlagQueueDto.emailAccount());
        eEmailFlagQueueDao.setUid(vEmailFlagQueueDto.uid());
        eEmailFlagQueueDao.setUserTags(vEmailFlagQueueDto.userTags());
        eEmailFlagQueueDao.setComments(vEmailFlagQueueDto.comments());
        eEmailFlagQueueDao.setAssign(vEmailFlagQueueDto.assign());
        eEmailFlagQueueDao.setLikedBy(vEmailFlagQueueDto.likedBy());
    }
}