package com.itbd.application.db.dto.newsletter;

import com.itbd.application.db.dao.newsletter.NewsletterEmailGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NewsletterEmailGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailGroup,
        String totalSubscribers,
        String parent,
        String parentField,
        String parentType
) {
    public static NewsletterEmailGroupDto fromEntity(NewsletterEmailGroupDao eNewsletterEmailGroupDao) {
        return new NewsletterEmailGroupDto(
                eNewsletterEmailGroupDao.getName(),
                eNewsletterEmailGroupDao.getCreation(),
                eNewsletterEmailGroupDao.getModified(),
                eNewsletterEmailGroupDao.getModifiedBy(),
                eNewsletterEmailGroupDao.getOwner(),
                eNewsletterEmailGroupDao.getIsDocStatus(),
                eNewsletterEmailGroupDao.getIdx(),
                eNewsletterEmailGroupDao.getEmailGroup(),
                eNewsletterEmailGroupDao.getTotalSubscribers(),
                eNewsletterEmailGroupDao.getParent(),
                eNewsletterEmailGroupDao.getParentField(),
                eNewsletterEmailGroupDao.getParentType());
    }

    public static void fromDTO(NewsletterEmailGroupDto vNewsletterEmailGroupDto, NewsletterEmailGroupDao eNewsletterEmailGroupDao) {
        eNewsletterEmailGroupDao.setName(vNewsletterEmailGroupDto.name());
        eNewsletterEmailGroupDao.setCreation(vNewsletterEmailGroupDto.creation());
        eNewsletterEmailGroupDao.setModified(vNewsletterEmailGroupDto.modified());
        eNewsletterEmailGroupDao.setModifiedBy(vNewsletterEmailGroupDto.modifiedBy());
        eNewsletterEmailGroupDao.setOwner(vNewsletterEmailGroupDto.owner());
        eNewsletterEmailGroupDao.setIsDocStatus(vNewsletterEmailGroupDto.isDocStatus());
        eNewsletterEmailGroupDao.setIdx(vNewsletterEmailGroupDto.idx());
        eNewsletterEmailGroupDao.setEmailGroup(vNewsletterEmailGroupDto.emailGroup());
        eNewsletterEmailGroupDao.setTotalSubscribers(vNewsletterEmailGroupDto.totalSubscribers());
        eNewsletterEmailGroupDao.setParent(vNewsletterEmailGroupDto.parent());
        eNewsletterEmailGroupDao.setParentField(vNewsletterEmailGroupDto.parentField());
        eNewsletterEmailGroupDao.setParentType(vNewsletterEmailGroupDto.parentType());
    }
}