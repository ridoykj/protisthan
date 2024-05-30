package com.itbd.application.db.dto.notifications;

import com.itbd.application.db.dao.email.NotificationRecipientDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NotificationRecipientDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String receiverByDocumentField,
        String receiverByRole,
        String cc,
        String bcc,
        String condition,
        String parent,
        String parentField,
        String parentType
) {
    public static NotificationRecipientDto fromEntity(NotificationRecipientDao eNotificationRecipientDao) {
        return new NotificationRecipientDto(
                eNotificationRecipientDao.getName(),
                eNotificationRecipientDao.getCreation(),
                eNotificationRecipientDao.getModified(),
                eNotificationRecipientDao.getModifiedBy(),
                eNotificationRecipientDao.getOwner(),
                eNotificationRecipientDao.getIsDocStatus(),
                eNotificationRecipientDao.getIdx(),
                eNotificationRecipientDao.getReceiverByDocumentField(),
                eNotificationRecipientDao.getReceiverByRole(),
                eNotificationRecipientDao.getCc(),
                eNotificationRecipientDao.getBcc(),
                eNotificationRecipientDao.getCondition(),
                eNotificationRecipientDao.getParent(),
                eNotificationRecipientDao.getParentField(),
                eNotificationRecipientDao.getParentType());
    }

    public static void fromDTO(NotificationRecipientDto vNotificationRecipientDto, NotificationRecipientDao eNotificationRecipientDao) {
        eNotificationRecipientDao.setName(vNotificationRecipientDto.name());
        eNotificationRecipientDao.setCreation(vNotificationRecipientDto.creation());
        eNotificationRecipientDao.setModified(vNotificationRecipientDto.modified());
        eNotificationRecipientDao.setModifiedBy(vNotificationRecipientDto.modifiedBy());
        eNotificationRecipientDao.setOwner(vNotificationRecipientDto.owner());
        eNotificationRecipientDao.setIsDocStatus(vNotificationRecipientDto.isDocStatus());
        eNotificationRecipientDao.setIdx(vNotificationRecipientDto.idx());
        eNotificationRecipientDao.setReceiverByDocumentField(vNotificationRecipientDto.receiverByDocumentField());
        eNotificationRecipientDao.setReceiverByRole(vNotificationRecipientDto.receiverByRole());
        eNotificationRecipientDao.setCc(vNotificationRecipientDto.cc());
        eNotificationRecipientDao.setBcc(vNotificationRecipientDto.bcc());
        eNotificationRecipientDao.setCondition(vNotificationRecipientDto.condition());
        eNotificationRecipientDao.setParent(vNotificationRecipientDto.parent());
        eNotificationRecipientDao.setParentField(vNotificationRecipientDto.parentField());
        eNotificationRecipientDao.setParentType(vNotificationRecipientDto.parentType());
    }
}