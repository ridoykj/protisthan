package com.itbd.application.db.dto.website.webhook;

import com.itbd.application.db.dao.integrations.webhook.WebhookRequestLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebhookRequestLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String webhook,
        String referenceDocument,
        String headers,
        String data,
        String user,
        String url,
        String response,
        String error,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WebhookRequestLogDto fromEntity(WebhookRequestLogDao eWebhookRequestLogDao) {
        return new WebhookRequestLogDto(
                eWebhookRequestLogDao.getName(),
                eWebhookRequestLogDao.getCreation(),
                eWebhookRequestLogDao.getModified(),
                eWebhookRequestLogDao.getModifiedBy(),
                eWebhookRequestLogDao.getOwner(),
                eWebhookRequestLogDao.getIsDocStatus(),
                eWebhookRequestLogDao.getIdx(),
                eWebhookRequestLogDao.getWebhook(),
                eWebhookRequestLogDao.getReferenceDocument(),
                eWebhookRequestLogDao.getHeaders(),
                eWebhookRequestLogDao.getData(),
                eWebhookRequestLogDao.getUser(),
                eWebhookRequestLogDao.getUrl(),
                eWebhookRequestLogDao.getResponse(),
                eWebhookRequestLogDao.getError(),
                eWebhookRequestLogDao.getUserTags(),
                eWebhookRequestLogDao.getComments(),
                eWebhookRequestLogDao.getAssign(),
                eWebhookRequestLogDao.getLikedBy());
    }

    public static void fromDTO(WebhookRequestLogDto vWebhookRequestLogDto, WebhookRequestLogDao eWebhookRequestLogDao) {
        eWebhookRequestLogDao.setName(vWebhookRequestLogDto.name());
        eWebhookRequestLogDao.setCreation(vWebhookRequestLogDto.creation());
        eWebhookRequestLogDao.setModified(vWebhookRequestLogDto.modified());
        eWebhookRequestLogDao.setModifiedBy(vWebhookRequestLogDto.modifiedBy());
        eWebhookRequestLogDao.setOwner(vWebhookRequestLogDto.owner());
        eWebhookRequestLogDao.setIsDocStatus(vWebhookRequestLogDto.isDocStatus());
        eWebhookRequestLogDao.setIdx(vWebhookRequestLogDto.idx());
        eWebhookRequestLogDao.setWebhook(vWebhookRequestLogDto.webhook());
        eWebhookRequestLogDao.setReferenceDocument(vWebhookRequestLogDto.referenceDocument());
        eWebhookRequestLogDao.setHeaders(vWebhookRequestLogDto.headers());
        eWebhookRequestLogDao.setData(vWebhookRequestLogDto.data());
        eWebhookRequestLogDao.setUser(vWebhookRequestLogDto.user());
        eWebhookRequestLogDao.setUrl(vWebhookRequestLogDto.url());
        eWebhookRequestLogDao.setResponse(vWebhookRequestLogDto.response());
        eWebhookRequestLogDao.setError(vWebhookRequestLogDto.error());
        eWebhookRequestLogDao.setUserTags(vWebhookRequestLogDto.userTags());
        eWebhookRequestLogDao.setComments(vWebhookRequestLogDto.comments());
        eWebhookRequestLogDao.setAssign(vWebhookRequestLogDto.assign());
        eWebhookRequestLogDao.setLikedBy(vWebhookRequestLogDto.likedBy());
    }
}