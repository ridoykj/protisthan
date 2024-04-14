package com.itbd.application.db.dto.notifications;

import com.itbd.application.db.dao.notifications.NotificationLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NotificationLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        String forUser,
        String type,
        String emailContent,
        String documentType,
        Boolean read,
        String documentName,
        String attachedFile,
        String fromUser,
        String link,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static NotificationLogDto fromEntity(NotificationLogDao eNotificationLogDao) {
        return new NotificationLogDto(
                eNotificationLogDao.getName(),
                eNotificationLogDao.getCreation(),
                eNotificationLogDao.getModified(),
                eNotificationLogDao.getModifiedBy(),
                eNotificationLogDao.getOwner(),
                eNotificationLogDao.getIsDocStatus(),
                eNotificationLogDao.getIdx(),
                eNotificationLogDao.getSubject(),
                eNotificationLogDao.getForUser(),
                eNotificationLogDao.getType(),
                eNotificationLogDao.getEmailContent(),
                eNotificationLogDao.getDocumentType(),
                eNotificationLogDao.getRead(),
                eNotificationLogDao.getDocumentName(),
                eNotificationLogDao.getAttachedFile(),
                eNotificationLogDao.getFromUser(),
                eNotificationLogDao.getLink(),
                eNotificationLogDao.getUserTags(),
                eNotificationLogDao.getComments(),
                eNotificationLogDao.getAssign(),
                eNotificationLogDao.getLikedBy(),
                eNotificationLogDao.getSeen());
    }

    public static void fromDTO(NotificationLogDto vNotificationLogDto, NotificationLogDao eNotificationLogDao) {
        eNotificationLogDao.setName(vNotificationLogDto.name());
        eNotificationLogDao.setCreation(vNotificationLogDto.creation());
        eNotificationLogDao.setModified(vNotificationLogDto.modified());
        eNotificationLogDao.setModifiedBy(vNotificationLogDto.modifiedBy());
        eNotificationLogDao.setOwner(vNotificationLogDto.owner());
        eNotificationLogDao.setIsDocStatus(vNotificationLogDto.isDocStatus());
        eNotificationLogDao.setIdx(vNotificationLogDto.idx());
        eNotificationLogDao.setSubject(vNotificationLogDto.subject());
        eNotificationLogDao.setForUser(vNotificationLogDto.forUser());
        eNotificationLogDao.setType(vNotificationLogDto.type());
        eNotificationLogDao.setEmailContent(vNotificationLogDto.emailContent());
        eNotificationLogDao.setDocumentType(vNotificationLogDto.documentType());
        eNotificationLogDao.setRead(vNotificationLogDto.read());
        eNotificationLogDao.setDocumentName(vNotificationLogDto.documentName());
        eNotificationLogDao.setAttachedFile(vNotificationLogDto.attachedFile());
        eNotificationLogDao.setFromUser(vNotificationLogDto.fromUser());
        eNotificationLogDao.setLink(vNotificationLogDto.link());
        eNotificationLogDao.setUserTags(vNotificationLogDto.userTags());
        eNotificationLogDao.setComments(vNotificationLogDto.comments());
        eNotificationLogDao.setAssign(vNotificationLogDto.assign());
        eNotificationLogDao.setLikedBy(vNotificationLogDto.likedBy());
        eNotificationLogDao.setSeen(vNotificationLogDto.seen());
    }
}