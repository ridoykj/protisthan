package com.itbd.application.db.dto.newsletter;

import com.itbd.application.db.dao.newsletter.NewsletterAttachmentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NewsletterAttachmentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String attachment,
        String parent,
        String parentField,
        String parentType
) {
    public static NewsletterAttachmentDto fromEntity(NewsletterAttachmentDao eNewsletterAttachmentDao) {
        return new NewsletterAttachmentDto(
                eNewsletterAttachmentDao.getName(),
                eNewsletterAttachmentDao.getCreation(),
                eNewsletterAttachmentDao.getModified(),
                eNewsletterAttachmentDao.getModifiedBy(),
                eNewsletterAttachmentDao.getOwner(),
                eNewsletterAttachmentDao.getIsDocStatus(),
                eNewsletterAttachmentDao.getIdx(),
                eNewsletterAttachmentDao.getAttachment(),
                eNewsletterAttachmentDao.getParent(),
                eNewsletterAttachmentDao.getParentField(),
                eNewsletterAttachmentDao.getParentType());
    }

    public static void fromDTO(NewsletterAttachmentDto vNewsletterAttachmentDto, NewsletterAttachmentDao eNewsletterAttachmentDao) {
        eNewsletterAttachmentDao.setName(vNewsletterAttachmentDto.name());
        eNewsletterAttachmentDao.setCreation(vNewsletterAttachmentDto.creation());
        eNewsletterAttachmentDao.setModified(vNewsletterAttachmentDto.modified());
        eNewsletterAttachmentDao.setModifiedBy(vNewsletterAttachmentDto.modifiedBy());
        eNewsletterAttachmentDao.setOwner(vNewsletterAttachmentDto.owner());
        eNewsletterAttachmentDao.setIsDocStatus(vNewsletterAttachmentDto.isDocStatus());
        eNewsletterAttachmentDao.setIdx(vNewsletterAttachmentDto.idx());
        eNewsletterAttachmentDao.setAttachment(vNewsletterAttachmentDto.attachment());
        eNewsletterAttachmentDao.setParent(vNewsletterAttachmentDto.parent());
        eNewsletterAttachmentDao.setParentField(vNewsletterAttachmentDto.parentField());
        eNewsletterAttachmentDao.setParentType(vNewsletterAttachmentDto.parentType());
    }
}