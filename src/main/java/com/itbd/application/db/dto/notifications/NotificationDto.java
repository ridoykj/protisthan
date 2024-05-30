package com.itbd.application.db.dto.notifications;

import com.itbd.application.db.dao.email.NotificationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NotificationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        String channel,
        String slackWebhookUrl,
        String subject,
        String documentType,
        Boolean isStandard,
        String module,
        String event,
        String method,
        String dateChanged,
        Integer daysInAdvance,
        String valueChanged,
        String sender,
        Boolean sendSystemNotification,
        String senderEmail,
        String condition,
        String setPropertyAfterAlert,
        String propertyValue,
        Boolean sendToAllAssignees,
        String message,
        Boolean attachPrint,
        String printFormat,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NotificationDto fromEntity(NotificationDao eNotificationDao) {
        return new NotificationDto(
                eNotificationDao.getName(),
                eNotificationDao.getCreation(),
                eNotificationDao.getModified(),
                eNotificationDao.getModifiedBy(),
                eNotificationDao.getOwner(),
                eNotificationDao.getIsDocStatus(),
                eNotificationDao.getIdx(),
                eNotificationDao.getEnabled(),
                eNotificationDao.getChannel(),
                eNotificationDao.getSlackWebhookUrl(),
                eNotificationDao.getSubject(),
                eNotificationDao.getDocumentType(),
                eNotificationDao.getIsStandard(),
                eNotificationDao.getModule(),
                eNotificationDao.getEvent(),
                eNotificationDao.getMethod(),
                eNotificationDao.getDateChanged(),
                eNotificationDao.getDaysInAdvance(),
                eNotificationDao.getValueChanged(),
                eNotificationDao.getSender(),
                eNotificationDao.getSendSystemNotification(),
                eNotificationDao.getSenderEmail(),
                eNotificationDao.getCondition(),
                eNotificationDao.getSetPropertyAfterAlert(),
                eNotificationDao.getPropertyValue(),
                eNotificationDao.getSendToAllAssignees(),
                eNotificationDao.getMessage(),
                eNotificationDao.getAttachPrint(),
                eNotificationDao.getPrintFormat(),
                eNotificationDao.getUserTags(),
                eNotificationDao.getComments(),
                eNotificationDao.getAssign(),
                eNotificationDao.getLikedBy());
    }

    public static void fromDTO(NotificationDto vNotificationDto, NotificationDao eNotificationDao) {
        eNotificationDao.setName(vNotificationDto.name());
        eNotificationDao.setCreation(vNotificationDto.creation());
        eNotificationDao.setModified(vNotificationDto.modified());
        eNotificationDao.setModifiedBy(vNotificationDto.modifiedBy());
        eNotificationDao.setOwner(vNotificationDto.owner());
        eNotificationDao.setIsDocStatus(vNotificationDto.isDocStatus());
        eNotificationDao.setIdx(vNotificationDto.idx());
        eNotificationDao.setEnabled(vNotificationDto.enabled());
        eNotificationDao.setChannel(vNotificationDto.channel());
        eNotificationDao.setSlackWebhookUrl(vNotificationDto.slackWebhookUrl());
        eNotificationDao.setSubject(vNotificationDto.subject());
        eNotificationDao.setDocumentType(vNotificationDto.documentType());
        eNotificationDao.setIsStandard(vNotificationDto.isStandard());
        eNotificationDao.setModule(vNotificationDto.module());
        eNotificationDao.setEvent(vNotificationDto.event());
        eNotificationDao.setMethod(vNotificationDto.method());
        eNotificationDao.setDateChanged(vNotificationDto.dateChanged());
        eNotificationDao.setDaysInAdvance(vNotificationDto.daysInAdvance());
        eNotificationDao.setValueChanged(vNotificationDto.valueChanged());
        eNotificationDao.setSender(vNotificationDto.sender());
        eNotificationDao.setSendSystemNotification(vNotificationDto.sendSystemNotification());
        eNotificationDao.setSenderEmail(vNotificationDto.senderEmail());
        eNotificationDao.setCondition(vNotificationDto.condition());
        eNotificationDao.setSetPropertyAfterAlert(vNotificationDto.setPropertyAfterAlert());
        eNotificationDao.setPropertyValue(vNotificationDto.propertyValue());
        eNotificationDao.setSendToAllAssignees(vNotificationDto.sendToAllAssignees());
        eNotificationDao.setMessage(vNotificationDto.message());
        eNotificationDao.setAttachPrint(vNotificationDto.attachPrint());
        eNotificationDao.setPrintFormat(vNotificationDto.printFormat());
        eNotificationDao.setUserTags(vNotificationDto.userTags());
        eNotificationDao.setComments(vNotificationDto.comments());
        eNotificationDao.setAssign(vNotificationDto.assign());
        eNotificationDao.setLikedBy(vNotificationDto.likedBy());
    }
}