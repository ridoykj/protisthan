package com.itbd.application.db.dto.website.webhook;

import com.itbd.application.db.dao.website.webhook.WebhookHeaderDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebhookHeaderDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String key,
        String value,
        String parent,
        String parentField,
        String parentType
) {
    public static WebhookHeaderDto fromEntity(WebhookHeaderDao eWebhookHeaderDao) {
        return new WebhookHeaderDto(
                eWebhookHeaderDao.getName(),
                eWebhookHeaderDao.getCreation(),
                eWebhookHeaderDao.getModified(),
                eWebhookHeaderDao.getModifiedBy(),
                eWebhookHeaderDao.getOwner(),
                eWebhookHeaderDao.getIsDocStatus(),
                eWebhookHeaderDao.getIdx(),
                eWebhookHeaderDao.getKey(),
                eWebhookHeaderDao.getValue(),
                eWebhookHeaderDao.getParent(),
                eWebhookHeaderDao.getParentField(),
                eWebhookHeaderDao.getParentType());
    }

    public static void fromDTO(WebhookHeaderDto vWebhookHeaderDto, WebhookHeaderDao eWebhookHeaderDao) {
        eWebhookHeaderDao.setName(vWebhookHeaderDto.name());
        eWebhookHeaderDao.setCreation(vWebhookHeaderDto.creation());
        eWebhookHeaderDao.setModified(vWebhookHeaderDto.modified());
        eWebhookHeaderDao.setModifiedBy(vWebhookHeaderDto.modifiedBy());
        eWebhookHeaderDao.setOwner(vWebhookHeaderDto.owner());
        eWebhookHeaderDao.setIsDocStatus(vWebhookHeaderDto.isDocStatus());
        eWebhookHeaderDao.setIdx(vWebhookHeaderDto.idx());
        eWebhookHeaderDao.setKey(vWebhookHeaderDto.key());
        eWebhookHeaderDao.setValue(vWebhookHeaderDto.value());
        eWebhookHeaderDao.setParent(vWebhookHeaderDto.parent());
        eWebhookHeaderDao.setParentField(vWebhookHeaderDto.parentField());
        eWebhookHeaderDao.setParentType(vWebhookHeaderDto.parentType());
    }
}