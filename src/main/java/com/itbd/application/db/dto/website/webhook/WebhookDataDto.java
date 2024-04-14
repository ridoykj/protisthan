package com.itbd.application.db.dto.website.webhook;

import com.itbd.application.db.dao.website.webhook.WebhookDataDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebhookDataDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String key,
        String parent,
        String parentField,
        String parentType
) {
    public static WebhookDataDto fromEntity(WebhookDataDao eWebhookDataDao) {
        return new WebhookDataDto(
                eWebhookDataDao.getName(),
                eWebhookDataDao.getCreation(),
                eWebhookDataDao.getModified(),
                eWebhookDataDao.getModifiedBy(),
                eWebhookDataDao.getOwner(),
                eWebhookDataDao.getIsDocStatus(),
                eWebhookDataDao.getIdx(),
                eWebhookDataDao.getFieldName(),
                eWebhookDataDao.getKey(),
                eWebhookDataDao.getParent(),
                eWebhookDataDao.getParentField(),
                eWebhookDataDao.getParentType());
    }

    public static void fromDTO(WebhookDataDto vWebhookDataDto, WebhookDataDao eWebhookDataDao) {
        eWebhookDataDao.setName(vWebhookDataDto.name());
        eWebhookDataDao.setCreation(vWebhookDataDto.creation());
        eWebhookDataDao.setModified(vWebhookDataDto.modified());
        eWebhookDataDao.setModifiedBy(vWebhookDataDto.modifiedBy());
        eWebhookDataDao.setOwner(vWebhookDataDto.owner());
        eWebhookDataDao.setIsDocStatus(vWebhookDataDto.isDocStatus());
        eWebhookDataDao.setIdx(vWebhookDataDto.idx());
        eWebhookDataDao.setFieldName(vWebhookDataDto.fieldName());
        eWebhookDataDao.setKey(vWebhookDataDto.key());
        eWebhookDataDao.setParent(vWebhookDataDto.parent());
        eWebhookDataDao.setParentField(vWebhookDataDto.parentField());
        eWebhookDataDao.setParentType(vWebhookDataDto.parentType());
    }
}