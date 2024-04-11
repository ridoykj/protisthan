package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SocialLinkSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SocialLinkSettingsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String socialLinkType,
        String color,
        String backgroundColor,
        String parent,
        String parentField,
        String parentType
) {
    public static SocialLinkSettingsDto fromEntity(SocialLinkSettingsDao eSocialLinkSettingsDao) {
        return new SocialLinkSettingsDto(
                eSocialLinkSettingsDao.getName(),
                eSocialLinkSettingsDao.getCreation(),
                eSocialLinkSettingsDao.getModified(),
                eSocialLinkSettingsDao.getModifiedBy(),
                eSocialLinkSettingsDao.getOwner(),
                eSocialLinkSettingsDao.getIsDocStatus(),
                eSocialLinkSettingsDao.getIdx(),
                eSocialLinkSettingsDao.getSocialLinkType(),
                eSocialLinkSettingsDao.getColor(),
                eSocialLinkSettingsDao.getBackgroundColor(),
                eSocialLinkSettingsDao.getParent(),
                eSocialLinkSettingsDao.getParentField(),
                eSocialLinkSettingsDao.getParentType());
    }

    public static void fromDTO(SocialLinkSettingsDto vSocialLinkSettingsDto, SocialLinkSettingsDao eSocialLinkSettingsDao) {
        eSocialLinkSettingsDao.setName(vSocialLinkSettingsDto.name());
        eSocialLinkSettingsDao.setCreation(vSocialLinkSettingsDto.creation());
        eSocialLinkSettingsDao.setModified(vSocialLinkSettingsDto.modified());
        eSocialLinkSettingsDao.setModifiedBy(vSocialLinkSettingsDto.modifiedBy());
        eSocialLinkSettingsDao.setOwner(vSocialLinkSettingsDto.owner());
        eSocialLinkSettingsDao.setIsDocStatus(vSocialLinkSettingsDto.isDocStatus());
        eSocialLinkSettingsDao.setIdx(vSocialLinkSettingsDto.idx());
        eSocialLinkSettingsDao.setSocialLinkType(vSocialLinkSettingsDto.socialLinkType());
        eSocialLinkSettingsDao.setColor(vSocialLinkSettingsDto.color());
        eSocialLinkSettingsDao.setBackgroundColor(vSocialLinkSettingsDto.backgroundColor());
        eSocialLinkSettingsDao.setParent(vSocialLinkSettingsDto.parent());
        eSocialLinkSettingsDao.setParentField(vSocialLinkSettingsDto.parentField());
        eSocialLinkSettingsDao.setParentType(vSocialLinkSettingsDto.parentType());
    }
}