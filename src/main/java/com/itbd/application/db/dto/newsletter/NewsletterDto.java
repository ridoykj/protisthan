package com.itbd.application.db.dto.newsletter;

import com.itbd.application.db.dao.newsletter.NewsletterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NewsletterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDateTime emailSentAt,
        Integer totalRecipients,
        Integer totalViews,
        Boolean emailSent,
        String senderName,
        String senderEmail,
        String sendFrom,
        String subject,
        String contentType,
        String message,
        String messageMd,
        String messageHtml,
        String campaign,
        Boolean sendUnsubscribeLink,
        Boolean sendWebViewLink,
        Integer scheduledToSend,
        Boolean scheduleSending,
        LocalDateTime scheduleSend,
        Boolean published,
        String route,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NewsletterDto fromEntity(NewsletterDao eNewsletterDao) {
        return new NewsletterDto(
                eNewsletterDao.getName(),
                eNewsletterDao.getCreation(),
                eNewsletterDao.getModified(),
                eNewsletterDao.getModifiedBy(),
                eNewsletterDao.getOwner(),
                eNewsletterDao.getIsDocStatus(),
                eNewsletterDao.getIdx(),
                eNewsletterDao.getEmailSentAt(),
                eNewsletterDao.getTotalRecipients(),
                eNewsletterDao.getTotalViews(),
                eNewsletterDao.getEmailSent(),
                eNewsletterDao.getSenderName(),
                eNewsletterDao.getSenderEmail(),
                eNewsletterDao.getSendFrom(),
                eNewsletterDao.getSubject(),
                eNewsletterDao.getContentType(),
                eNewsletterDao.getMessage(),
                eNewsletterDao.getMessageMd(),
                eNewsletterDao.getMessageHtml(),
                eNewsletterDao.getCampaign(),
                eNewsletterDao.getSendUnsubscribeLink(),
                eNewsletterDao.getSendWebViewLink(),
                eNewsletterDao.getScheduledToSend(),
                eNewsletterDao.getScheduleSending(),
                eNewsletterDao.getScheduleSend(),
                eNewsletterDao.getPublished(),
                eNewsletterDao.getRoute(),
                eNewsletterDao.getUserTags(),
                eNewsletterDao.getComments(),
                eNewsletterDao.getAssign(),
                eNewsletterDao.getLikedBy());
    }

    public static void fromDTO(NewsletterDto vNewsletterDto, NewsletterDao eNewsletterDao) {
        eNewsletterDao.setName(vNewsletterDto.name());
        eNewsletterDao.setCreation(vNewsletterDto.creation());
        eNewsletterDao.setModified(vNewsletterDto.modified());
        eNewsletterDao.setModifiedBy(vNewsletterDto.modifiedBy());
        eNewsletterDao.setOwner(vNewsletterDto.owner());
        eNewsletterDao.setIsDocStatus(vNewsletterDto.isDocStatus());
        eNewsletterDao.setIdx(vNewsletterDto.idx());
        eNewsletterDao.setEmailSentAt(vNewsletterDto.emailSentAt());
        eNewsletterDao.setTotalRecipients(vNewsletterDto.totalRecipients());
        eNewsletterDao.setTotalViews(vNewsletterDto.totalViews());
        eNewsletterDao.setEmailSent(vNewsletterDto.emailSent());
        eNewsletterDao.setSenderName(vNewsletterDto.senderName());
        eNewsletterDao.setSenderEmail(vNewsletterDto.senderEmail());
        eNewsletterDao.setSendFrom(vNewsletterDto.sendFrom());
        eNewsletterDao.setSubject(vNewsletterDto.subject());
        eNewsletterDao.setContentType(vNewsletterDto.contentType());
        eNewsletterDao.setMessage(vNewsletterDto.message());
        eNewsletterDao.setMessageMd(vNewsletterDto.messageMd());
        eNewsletterDao.setMessageHtml(vNewsletterDto.messageHtml());
        eNewsletterDao.setCampaign(vNewsletterDto.campaign());
        eNewsletterDao.setSendUnsubscribeLink(vNewsletterDto.sendUnsubscribeLink());
        eNewsletterDao.setSendWebViewLink(vNewsletterDto.sendWebViewLink());
        eNewsletterDao.setScheduledToSend(vNewsletterDto.scheduledToSend());
        eNewsletterDao.setScheduleSending(vNewsletterDto.scheduleSending());
        eNewsletterDao.setScheduleSend(vNewsletterDto.scheduleSend());
        eNewsletterDao.setPublished(vNewsletterDto.published());
        eNewsletterDao.setRoute(vNewsletterDto.route());
        eNewsletterDao.setUserTags(vNewsletterDto.userTags());
        eNewsletterDao.setComments(vNewsletterDto.comments());
        eNewsletterDao.setAssign(vNewsletterDto.assign());
        eNewsletterDao.setLikedBy(vNewsletterDto.likedBy());
    }
}