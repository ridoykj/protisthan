package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SlackWebhookUrlDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SlackWebhookUrlDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String webhookName,
        String webhookUrl,
        Boolean showDocumentLink,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SlackWebhookUrlDto fromEntity(SlackWebhookUrlDao eSlackWebhookUrlDao) {
        return new SlackWebhookUrlDto(
                eSlackWebhookUrlDao.getName(),
                eSlackWebhookUrlDao.getCreation(),
                eSlackWebhookUrlDao.getModified(),
                eSlackWebhookUrlDao.getModifiedBy(),
                eSlackWebhookUrlDao.getOwner(),
                eSlackWebhookUrlDao.getIsDocStatus(),
                eSlackWebhookUrlDao.getIdx(),
                eSlackWebhookUrlDao.getWebhookName(),
                eSlackWebhookUrlDao.getWebhookUrl(),
                eSlackWebhookUrlDao.getShowDocumentLink(),
                eSlackWebhookUrlDao.getUserTags(),
                eSlackWebhookUrlDao.getComments(),
                eSlackWebhookUrlDao.getAssign(),
                eSlackWebhookUrlDao.getLikedBy());
    }

    public static void fromDTO(SlackWebhookUrlDto vSlackWebhookUrlDto, SlackWebhookUrlDao eSlackWebhookUrlDao) {
        eSlackWebhookUrlDao.setName(vSlackWebhookUrlDto.name());
        eSlackWebhookUrlDao.setCreation(vSlackWebhookUrlDto.creation());
        eSlackWebhookUrlDao.setModified(vSlackWebhookUrlDto.modified());
        eSlackWebhookUrlDao.setModifiedBy(vSlackWebhookUrlDto.modifiedBy());
        eSlackWebhookUrlDao.setOwner(vSlackWebhookUrlDto.owner());
        eSlackWebhookUrlDao.setIsDocStatus(vSlackWebhookUrlDto.isDocStatus());
        eSlackWebhookUrlDao.setIdx(vSlackWebhookUrlDto.idx());
        eSlackWebhookUrlDao.setWebhookName(vSlackWebhookUrlDto.webhookName());
        eSlackWebhookUrlDao.setWebhookUrl(vSlackWebhookUrlDto.webhookUrl());
        eSlackWebhookUrlDao.setShowDocumentLink(vSlackWebhookUrlDto.showDocumentLink());
        eSlackWebhookUrlDao.setUserTags(vSlackWebhookUrlDto.userTags());
        eSlackWebhookUrlDao.setComments(vSlackWebhookUrlDto.comments());
        eSlackWebhookUrlDao.setAssign(vSlackWebhookUrlDto.assign());
        eSlackWebhookUrlDao.setLikedBy(vSlackWebhookUrlDto.likedBy());
    }
}