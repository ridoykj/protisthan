package com.itbd.application.db.dto.website.webhook;

import com.itbd.application.db.dao.integrations.webhook.WebhookDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebhookDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String webhookDocType,
        String webhookDocEvent,
        Boolean enabled,
        String condition,
        String requestUrl,
        Boolean isDynam,
        Integer timeout,
        String backgroundJobsQueue,
        String requestMethod,
        String requestStructure,
        Boolean enableSecurity,
        String webhookSecret,
        String webhookJson,
        String previewDocument,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebhookDto fromEntity(WebhookDao eWebhookDao) {
        return new WebhookDto(
                eWebhookDao.getName(),
                eWebhookDao.getCreation(),
                eWebhookDao.getModified(),
                eWebhookDao.getModifiedBy(),
                eWebhookDao.getOwner(),
                eWebhookDao.getIsDocStatus(),
                eWebhookDao.getIdx(),
                eWebhookDao.getWebhookDocType(),
                eWebhookDao.getWebhookDocEvent(),
                eWebhookDao.getEnabled(),
                eWebhookDao.getCondition(),
                eWebhookDao.getRequestUrl(),
                eWebhookDao.getIsDynam(),
                eWebhookDao.getTimeout(),
                eWebhookDao.getBackgroundJobsQueue(),
                eWebhookDao.getRequestMethod(),
                eWebhookDao.getRequestStructure(),
                eWebhookDao.getEnableSecurity(),
                eWebhookDao.getWebhookSecret(),
                eWebhookDao.getWebhookJson(),
                eWebhookDao.getPreviewDocument(),
                eWebhookDao.getUserTags(),
                eWebhookDao.getComments(),
                eWebhookDao.getAssign(),
                eWebhookDao.getLikedBy());
    }

    public static void fromDTO(WebhookDto vWebhookDto, WebhookDao eWebhookDao) {
        eWebhookDao.setName(vWebhookDto.name());
        eWebhookDao.setCreation(vWebhookDto.creation());
        eWebhookDao.setModified(vWebhookDto.modified());
        eWebhookDao.setModifiedBy(vWebhookDto.modifiedBy());
        eWebhookDao.setOwner(vWebhookDto.owner());
        eWebhookDao.setIsDocStatus(vWebhookDto.isDocStatus());
        eWebhookDao.setIdx(vWebhookDto.idx());
        eWebhookDao.setWebhookDocType(vWebhookDto.webhookDocType());
        eWebhookDao.setWebhookDocEvent(vWebhookDto.webhookDocEvent());
        eWebhookDao.setEnabled(vWebhookDto.enabled());
        eWebhookDao.setCondition(vWebhookDto.condition());
        eWebhookDao.setRequestUrl(vWebhookDto.requestUrl());
        eWebhookDao.setIsDynam(vWebhookDto.isDynam());
        eWebhookDao.setTimeout(vWebhookDto.timeout());
        eWebhookDao.setBackgroundJobsQueue(vWebhookDto.backgroundJobsQueue());
        eWebhookDao.setRequestMethod(vWebhookDto.requestMethod());
        eWebhookDao.setRequestStructure(vWebhookDto.requestStructure());
        eWebhookDao.setEnableSecurity(vWebhookDto.enableSecurity());
        eWebhookDao.setWebhookSecret(vWebhookDto.webhookSecret());
        eWebhookDao.setWebhookJson(vWebhookDto.webhookJson());
        eWebhookDao.setPreviewDocument(vWebhookDto.previewDocument());
        eWebhookDao.setUserTags(vWebhookDto.userTags());
        eWebhookDao.setComments(vWebhookDto.comments());
        eWebhookDao.setAssign(vWebhookDto.assign());
        eWebhookDao.setLikedBy(vWebhookDto.likedBy());
    }
}