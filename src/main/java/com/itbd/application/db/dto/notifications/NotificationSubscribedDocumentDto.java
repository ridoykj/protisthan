package com.itbd.application.db.dto.notifications;

import com.itbd.application.db.dao.notifications.NotificationSubscribedDocumentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NotificationSubscribedDocumentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String document,
        String parent,
        String parentField,
        String parentType
) {
    public static NotificationSubscribedDocumentDto fromEntity(NotificationSubscribedDocumentDao eNotificationSubscribedDocumentDao) {
        return new NotificationSubscribedDocumentDto(
                eNotificationSubscribedDocumentDao.getName(),
                eNotificationSubscribedDocumentDao.getCreation(),
                eNotificationSubscribedDocumentDao.getModified(),
                eNotificationSubscribedDocumentDao.getModifiedBy(),
                eNotificationSubscribedDocumentDao.getOwner(),
                eNotificationSubscribedDocumentDao.getIsDocStatus(),
                eNotificationSubscribedDocumentDao.getIdx(),
                eNotificationSubscribedDocumentDao.getDocument(),
                eNotificationSubscribedDocumentDao.getParent(),
                eNotificationSubscribedDocumentDao.getParentField(),
                eNotificationSubscribedDocumentDao.getParentType());
    }

    public static void fromDTO(NotificationSubscribedDocumentDto vNotificationSubscribedDocumentDto, NotificationSubscribedDocumentDao eNotificationSubscribedDocumentDao) {
        eNotificationSubscribedDocumentDao.setName(vNotificationSubscribedDocumentDto.name());
        eNotificationSubscribedDocumentDao.setCreation(vNotificationSubscribedDocumentDto.creation());
        eNotificationSubscribedDocumentDao.setModified(vNotificationSubscribedDocumentDto.modified());
        eNotificationSubscribedDocumentDao.setModifiedBy(vNotificationSubscribedDocumentDto.modifiedBy());
        eNotificationSubscribedDocumentDao.setOwner(vNotificationSubscribedDocumentDto.owner());
        eNotificationSubscribedDocumentDao.setIsDocStatus(vNotificationSubscribedDocumentDto.isDocStatus());
        eNotificationSubscribedDocumentDao.setIdx(vNotificationSubscribedDocumentDto.idx());
        eNotificationSubscribedDocumentDao.setDocument(vNotificationSubscribedDocumentDto.document());
        eNotificationSubscribedDocumentDao.setParent(vNotificationSubscribedDocumentDto.parent());
        eNotificationSubscribedDocumentDao.setParentField(vNotificationSubscribedDocumentDto.parentField());
        eNotificationSubscribedDocumentDao.setParentType(vNotificationSubscribedDocumentDto.parentType());
    }
}