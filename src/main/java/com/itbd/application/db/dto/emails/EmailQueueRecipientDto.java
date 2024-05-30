package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.email.EmailQueueRecipientDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailQueueRecipientDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String recipient,
        String status,
        String error,
        String parent,
        String parentField,
        String parentType
) {
    public static EmailQueueRecipientDto fromEntity(EmailQueueRecipientDao eEmailQueueRecipientDao) {
        return new EmailQueueRecipientDto(
                eEmailQueueRecipientDao.getName(),
                eEmailQueueRecipientDao.getCreation(),
                eEmailQueueRecipientDao.getModified(),
                eEmailQueueRecipientDao.getModifiedBy(),
                eEmailQueueRecipientDao.getOwner(),
                eEmailQueueRecipientDao.getIsDocStatus(),
                eEmailQueueRecipientDao.getIdx(),
                eEmailQueueRecipientDao.getRecipient(),
                eEmailQueueRecipientDao.getStatus(),
                eEmailQueueRecipientDao.getError(),
                eEmailQueueRecipientDao.getParent(),
                eEmailQueueRecipientDao.getParentField(),
                eEmailQueueRecipientDao.getParentType());
    }

    public static void fromDTO(EmailQueueRecipientDto vEmailQueueRecipientDto, EmailQueueRecipientDao eEmailQueueRecipientDao) {
        eEmailQueueRecipientDao.setName(vEmailQueueRecipientDto.name());
        eEmailQueueRecipientDao.setCreation(vEmailQueueRecipientDto.creation());
        eEmailQueueRecipientDao.setModified(vEmailQueueRecipientDto.modified());
        eEmailQueueRecipientDao.setModifiedBy(vEmailQueueRecipientDto.modifiedBy());
        eEmailQueueRecipientDao.setOwner(vEmailQueueRecipientDto.owner());
        eEmailQueueRecipientDao.setIsDocStatus(vEmailQueueRecipientDto.isDocStatus());
        eEmailQueueRecipientDao.setIdx(vEmailQueueRecipientDto.idx());
        eEmailQueueRecipientDao.setRecipient(vEmailQueueRecipientDto.recipient());
        eEmailQueueRecipientDao.setStatus(vEmailQueueRecipientDto.status());
        eEmailQueueRecipientDao.setError(vEmailQueueRecipientDto.error());
        eEmailQueueRecipientDao.setParent(vEmailQueueRecipientDto.parent());
        eEmailQueueRecipientDao.setParentField(vEmailQueueRecipientDto.parentField());
        eEmailQueueRecipientDao.setParentType(vEmailQueueRecipientDto.parentType());
    }
}