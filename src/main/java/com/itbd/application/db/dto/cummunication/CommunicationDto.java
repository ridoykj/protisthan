package com.itbd.application.db.dto.cummunication;

import com.itbd.application.db.dao.cummunication.CommunicationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CommunicationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        String communicationMedium,
        String sender,
        String recipients,
        String cc,
        String bcc,
        String phoneNo,
        String deliveryStatus,
        String content,
        String textContent,
        String communicationType,
        String commentType,
        String status,
        String sentOrReceived,
        LocalDateTime communicationDate,
        Boolean readReceipt,
        LocalDateTime sendAfter,
        String senderFullName,
        Boolean readByRecipient,
        LocalDateTime readByRecipientOn,
        String referenceDocType,
        String referenceName,
        String referenceOwner,
        String emailAccount,
        String inReplyTo,
        String user,
        String emailTemplate,
        Boolean unreadNotificationSent,
        Boolean seen,
        String userTags,
        String messageId,
        Integer uid,
        String imapFolder,
        String emailStatus,
        Boolean hasAttachment,
        Integer rating,
        String feedbackRequest,
        String comments,
        String assign,
        String likedBy,
        String _seen
) {
    public static CommunicationDto fromEntity(CommunicationDao eCommunicationDao) {
        return new CommunicationDto(
                eCommunicationDao.getName(),
                eCommunicationDao.getCreation(),
                eCommunicationDao.getModified(),
                eCommunicationDao.getModifiedBy(),
                eCommunicationDao.getOwner(),
                eCommunicationDao.getIsDocStatus(),
                eCommunicationDao.getIdx(),
                eCommunicationDao.getSubject(),
                eCommunicationDao.getCommunicationMedium(),
                eCommunicationDao.getSender(),
                eCommunicationDao.getRecipients(),
                eCommunicationDao.getCc(),
                eCommunicationDao.getBcc(),
                eCommunicationDao.getPhoneNo(),
                eCommunicationDao.getDeliveryStatus(),
                eCommunicationDao.getContent(),
                eCommunicationDao.getTextContent(),
                eCommunicationDao.getCommunicationType(),
                eCommunicationDao.getCommentType(),
                eCommunicationDao.getStatus(),
                eCommunicationDao.getSentOrReceived(),
                eCommunicationDao.getCommunicationDate(),
                eCommunicationDao.getReadReceipt(),
                eCommunicationDao.getSendAfter(),
                eCommunicationDao.getSenderFullName(),
                eCommunicationDao.getReadByRecipient(),
                eCommunicationDao.getReadByRecipientOn(),
                eCommunicationDao.getReferenceDocType(),
                eCommunicationDao.getReferenceName(),
                eCommunicationDao.getReferenceOwner(),
                eCommunicationDao.getEmailAccount(),
                eCommunicationDao.getInReplyTo(),
                eCommunicationDao.getUser(),
                eCommunicationDao.getEmailTemplate(),
                eCommunicationDao.getUnreadNotificationSent(),
                eCommunicationDao.getSeen(),
                eCommunicationDao.getUserTags(),
                eCommunicationDao.getMessageId(),
                eCommunicationDao.getUid(),
                eCommunicationDao.getImapFolder(),
                eCommunicationDao.getEmailStatus(),
                eCommunicationDao.getHasAttachment(),
                eCommunicationDao.getRating(),
                eCommunicationDao.getFeedbackRequest(),
                eCommunicationDao.getComments(),
                eCommunicationDao.getAssign(),
                eCommunicationDao.getLikedBy(),
                eCommunicationDao.get_seen());
    }

    public static void fromDTO(CommunicationDto vCommunicationDto, CommunicationDao eCommunicationDao) {
        eCommunicationDao.setName(vCommunicationDto.name());
        eCommunicationDao.setCreation(vCommunicationDto.creation());
        eCommunicationDao.setModified(vCommunicationDto.modified());
        eCommunicationDao.setModifiedBy(vCommunicationDto.modifiedBy());
        eCommunicationDao.setOwner(vCommunicationDto.owner());
        eCommunicationDao.setIsDocStatus(vCommunicationDto.isDocStatus());
        eCommunicationDao.setIdx(vCommunicationDto.idx());
        eCommunicationDao.setSubject(vCommunicationDto.subject());
        eCommunicationDao.setCommunicationMedium(vCommunicationDto.communicationMedium());
        eCommunicationDao.setSender(vCommunicationDto.sender());
        eCommunicationDao.setRecipients(vCommunicationDto.recipients());
        eCommunicationDao.setCc(vCommunicationDto.cc());
        eCommunicationDao.setBcc(vCommunicationDto.bcc());
        eCommunicationDao.setPhoneNo(vCommunicationDto.phoneNo());
        eCommunicationDao.setDeliveryStatus(vCommunicationDto.deliveryStatus());
        eCommunicationDao.setContent(vCommunicationDto.content());
        eCommunicationDao.setTextContent(vCommunicationDto.textContent());
        eCommunicationDao.setCommunicationType(vCommunicationDto.communicationType());
        eCommunicationDao.setCommentType(vCommunicationDto.commentType());
        eCommunicationDao.setStatus(vCommunicationDto.status());
        eCommunicationDao.setSentOrReceived(vCommunicationDto.sentOrReceived());
        eCommunicationDao.setCommunicationDate(vCommunicationDto.communicationDate());
        eCommunicationDao.setReadReceipt(vCommunicationDto.readReceipt());
        eCommunicationDao.setSendAfter(vCommunicationDto.sendAfter());
        eCommunicationDao.setSenderFullName(vCommunicationDto.senderFullName());
        eCommunicationDao.setReadByRecipient(vCommunicationDto.readByRecipient());
        eCommunicationDao.setReadByRecipientOn(vCommunicationDto.readByRecipientOn());
        eCommunicationDao.setReferenceDocType(vCommunicationDto.referenceDocType());
        eCommunicationDao.setReferenceName(vCommunicationDto.referenceName());
        eCommunicationDao.setReferenceOwner(vCommunicationDto.referenceOwner());
        eCommunicationDao.setEmailAccount(vCommunicationDto.emailAccount());
        eCommunicationDao.setInReplyTo(vCommunicationDto.inReplyTo());
        eCommunicationDao.setUser(vCommunicationDto.user());
        eCommunicationDao.setEmailTemplate(vCommunicationDto.emailTemplate());
        eCommunicationDao.setUnreadNotificationSent(vCommunicationDto.unreadNotificationSent());
        eCommunicationDao.setSeen(vCommunicationDto.seen());
        eCommunicationDao.setUserTags(vCommunicationDto.userTags());
        eCommunicationDao.setMessageId(vCommunicationDto.messageId());
        eCommunicationDao.setUid(vCommunicationDto.uid());
        eCommunicationDao.setImapFolder(vCommunicationDto.imapFolder());
        eCommunicationDao.setEmailStatus(vCommunicationDto.emailStatus());
        eCommunicationDao.setHasAttachment(vCommunicationDto.hasAttachment());
        eCommunicationDao.setRating(vCommunicationDto.rating());
        eCommunicationDao.setFeedbackRequest(vCommunicationDto.feedbackRequest());
        eCommunicationDao.setComments(vCommunicationDto.comments());
        eCommunicationDao.setAssign(vCommunicationDto.assign());
        eCommunicationDao.setLikedBy(vCommunicationDto.likedBy());
        eCommunicationDao.set_seen(vCommunicationDto._seen());
    }
}