package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.email.EmailGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Integer totalSubscribers,
        String confirmationEmailTemplate,
        String welcomeEmailTemplate,
        String welcomeUrl,
        Boolean addQueryParameters,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailGroupDto fromEntity(EmailGroupDao eEmailGroupDao) {
        return new EmailGroupDto(
                eEmailGroupDao.getName(),
                eEmailGroupDao.getCreation(),
                eEmailGroupDao.getModified(),
                eEmailGroupDao.getModifiedBy(),
                eEmailGroupDao.getOwner(),
                eEmailGroupDao.getIsDocStatus(),
                eEmailGroupDao.getIdx(),
                eEmailGroupDao.getTitle(),
                eEmailGroupDao.getTotalSubscribers(),
                eEmailGroupDao.getConfirmationEmailTemplate(),
                eEmailGroupDao.getWelcomeEmailTemplate(),
                eEmailGroupDao.getWelcomeUrl(),
                eEmailGroupDao.getAddQueryParameters(),
                eEmailGroupDao.getUserTags(),
                eEmailGroupDao.getComments(),
                eEmailGroupDao.getAssign(),
                eEmailGroupDao.getLikedBy());
    }

    public static void fromDTO(EmailGroupDto vEmailGroupDto, EmailGroupDao eEmailGroupDao) {
        eEmailGroupDao.setName(vEmailGroupDto.name());
        eEmailGroupDao.setCreation(vEmailGroupDto.creation());
        eEmailGroupDao.setModified(vEmailGroupDto.modified());
        eEmailGroupDao.setModifiedBy(vEmailGroupDto.modifiedBy());
        eEmailGroupDao.setOwner(vEmailGroupDto.owner());
        eEmailGroupDao.setIsDocStatus(vEmailGroupDto.isDocStatus());
        eEmailGroupDao.setIdx(vEmailGroupDto.idx());
        eEmailGroupDao.setTitle(vEmailGroupDto.title());
        eEmailGroupDao.setTotalSubscribers(vEmailGroupDto.totalSubscribers());
        eEmailGroupDao.setConfirmationEmailTemplate(vEmailGroupDto.confirmationEmailTemplate());
        eEmailGroupDao.setWelcomeEmailTemplate(vEmailGroupDto.welcomeEmailTemplate());
        eEmailGroupDao.setWelcomeUrl(vEmailGroupDto.welcomeUrl());
        eEmailGroupDao.setAddQueryParameters(vEmailGroupDto.addQueryParameters());
        eEmailGroupDao.setUserTags(vEmailGroupDto.userTags());
        eEmailGroupDao.setComments(vEmailGroupDto.comments());
        eEmailGroupDao.setAssign(vEmailGroupDto.assign());
        eEmailGroupDao.setLikedBy(vEmailGroupDto.likedBy());
    }
}