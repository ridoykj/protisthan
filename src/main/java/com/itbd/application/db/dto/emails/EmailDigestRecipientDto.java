package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.setup.email.EmailDigestRecipientDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailDigestRecipientDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String recipient,
        String parent,
        String parentField,
        String parentType
) {
    public static EmailDigestRecipientDto fromEntity(EmailDigestRecipientDao eEmailDigestRecipientDao) {
        return new EmailDigestRecipientDto(
                eEmailDigestRecipientDao.getName(),
                eEmailDigestRecipientDao.getCreation(),
                eEmailDigestRecipientDao.getModified(),
                eEmailDigestRecipientDao.getModifiedBy(),
                eEmailDigestRecipientDao.getOwner(),
                eEmailDigestRecipientDao.getIsDocStatus(),
                eEmailDigestRecipientDao.getIdx(),
                eEmailDigestRecipientDao.getRecipient(),
                eEmailDigestRecipientDao.getParent(),
                eEmailDigestRecipientDao.getParentField(),
                eEmailDigestRecipientDao.getParentType());
    }

    public static void fromDTO(EmailDigestRecipientDto vEmailDigestRecipientDto, EmailDigestRecipientDao eEmailDigestRecipientDao) {
        eEmailDigestRecipientDao.setName(vEmailDigestRecipientDto.name());
        eEmailDigestRecipientDao.setCreation(vEmailDigestRecipientDto.creation());
        eEmailDigestRecipientDao.setModified(vEmailDigestRecipientDto.modified());
        eEmailDigestRecipientDao.setModifiedBy(vEmailDigestRecipientDto.modifiedBy());
        eEmailDigestRecipientDao.setOwner(vEmailDigestRecipientDto.owner());
        eEmailDigestRecipientDao.setIsDocStatus(vEmailDigestRecipientDto.isDocStatus());
        eEmailDigestRecipientDao.setIdx(vEmailDigestRecipientDto.idx());
        eEmailDigestRecipientDao.setRecipient(vEmailDigestRecipientDto.recipient());
        eEmailDigestRecipientDao.setParent(vEmailDigestRecipientDto.parent());
        eEmailDigestRecipientDao.setParentField(vEmailDigestRecipientDto.parentField());
        eEmailDigestRecipientDao.setParentType(vEmailDigestRecipientDto.parentType());
    }
}