package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.email.EmailQueueDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailQueueDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String sender,
        String showAsCc,
        String message,
        String status,
        String error,
        String messageId,
        String referenceDocType,
        String referenceName,
        String communication,
        LocalDateTime sendAfter,
        Integer priority,
        Boolean addUnsubscribeLink,
        String unsubscribeParam,
        String unsubscribeMethod,
        String exposeRecipients,
        String attachments,
        Integer retry,
        String emailAccount,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailQueueDto fromEntity(EmailQueueDao eEmailQueueDao) {
        return new EmailQueueDto(
                eEmailQueueDao.getName(),
                eEmailQueueDao.getCreation(),
                eEmailQueueDao.getModified(),
                eEmailQueueDao.getModifiedBy(),
                eEmailQueueDao.getOwner(),
                eEmailQueueDao.getIsDocStatus(),
                eEmailQueueDao.getIdx(),
                eEmailQueueDao.getSender(),
                eEmailQueueDao.getShowAsCc(),
                eEmailQueueDao.getMessage(),
                eEmailQueueDao.getStatus(),
                eEmailQueueDao.getError(),
                eEmailQueueDao.getMessageId(),
                eEmailQueueDao.getReferenceDocType(),
                eEmailQueueDao.getReferenceName(),
                eEmailQueueDao.getCommunication(),
                eEmailQueueDao.getSendAfter(),
                eEmailQueueDao.getPriority(),
                eEmailQueueDao.getAddUnsubscribeLink(),
                eEmailQueueDao.getUnsubscribeParam(),
                eEmailQueueDao.getUnsubscribeMethod(),
                eEmailQueueDao.getExposeRecipients(),
                eEmailQueueDao.getAttachments(),
                eEmailQueueDao.getRetry(),
                eEmailQueueDao.getEmailAccount(),
                eEmailQueueDao.getUserTags(),
                eEmailQueueDao.getComments(),
                eEmailQueueDao.getAssign(),
                eEmailQueueDao.getLikedBy());
    }

    public static void fromDTO(EmailQueueDto vEmailQueueDto, EmailQueueDao eEmailQueueDao) {
        eEmailQueueDao.setName(vEmailQueueDto.name());
        eEmailQueueDao.setCreation(vEmailQueueDto.creation());
        eEmailQueueDao.setModified(vEmailQueueDto.modified());
        eEmailQueueDao.setModifiedBy(vEmailQueueDto.modifiedBy());
        eEmailQueueDao.setOwner(vEmailQueueDto.owner());
        eEmailQueueDao.setIsDocStatus(vEmailQueueDto.isDocStatus());
        eEmailQueueDao.setIdx(vEmailQueueDto.idx());
        eEmailQueueDao.setSender(vEmailQueueDto.sender());
        eEmailQueueDao.setShowAsCc(vEmailQueueDto.showAsCc());
        eEmailQueueDao.setMessage(vEmailQueueDto.message());
        eEmailQueueDao.setStatus(vEmailQueueDto.status());
        eEmailQueueDao.setError(vEmailQueueDto.error());
        eEmailQueueDao.setMessageId(vEmailQueueDto.messageId());
        eEmailQueueDao.setReferenceDocType(vEmailQueueDto.referenceDocType());
        eEmailQueueDao.setReferenceName(vEmailQueueDto.referenceName());
        eEmailQueueDao.setCommunication(vEmailQueueDto.communication());
        eEmailQueueDao.setSendAfter(vEmailQueueDto.sendAfter());
        eEmailQueueDao.setPriority(vEmailQueueDto.priority());
        eEmailQueueDao.setAddUnsubscribeLink(vEmailQueueDto.addUnsubscribeLink());
        eEmailQueueDao.setUnsubscribeParam(vEmailQueueDto.unsubscribeParam());
        eEmailQueueDao.setUnsubscribeMethod(vEmailQueueDto.unsubscribeMethod());
        eEmailQueueDao.setExposeRecipients(vEmailQueueDto.exposeRecipients());
        eEmailQueueDao.setAttachments(vEmailQueueDto.attachments());
        eEmailQueueDao.setRetry(vEmailQueueDto.retry());
        eEmailQueueDao.setEmailAccount(vEmailQueueDto.emailAccount());
        eEmailQueueDao.setUserTags(vEmailQueueDto.userTags());
        eEmailQueueDao.setComments(vEmailQueueDto.comments());
        eEmailQueueDao.setAssign(vEmailQueueDto.assign());
        eEmailQueueDao.setLikedBy(vEmailQueueDto.likedBy());
    }
}