package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.LanguageDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LanguageDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        String languageCode,
        String languageName,
        String flag,
        String basedOn,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LanguageDto fromEntity(LanguageDao eLanguageDao) {
        return new LanguageDto(
                eLanguageDao.getName(),
                eLanguageDao.getCreation(),
                eLanguageDao.getModified(),
                eLanguageDao.getModifiedBy(),
                eLanguageDao.getOwner(),
                eLanguageDao.getIsDocStatus(),
                eLanguageDao.getIdx(),
                eLanguageDao.getEnabled(),
                eLanguageDao.getLanguageCode(),
                eLanguageDao.getLanguageName(),
                eLanguageDao.getFlag(),
                eLanguageDao.getBasedOn(),
                eLanguageDao.getUserTags(),
                eLanguageDao.getComments(),
                eLanguageDao.getAssign(),
                eLanguageDao.getLikedBy());
    }

    public static void fromDTO(LanguageDto vLanguageDto, LanguageDao eLanguageDao) {
        eLanguageDao.setName(vLanguageDto.name());
        eLanguageDao.setCreation(vLanguageDto.creation());
        eLanguageDao.setModified(vLanguageDto.modified());
        eLanguageDao.setModifiedBy(vLanguageDto.modifiedBy());
        eLanguageDao.setOwner(vLanguageDto.owner());
        eLanguageDao.setIsDocStatus(vLanguageDto.isDocStatus());
        eLanguageDao.setIdx(vLanguageDto.idx());
        eLanguageDao.setEnabled(vLanguageDto.enabled());
        eLanguageDao.setLanguageCode(vLanguageDto.languageCode());
        eLanguageDao.setLanguageName(vLanguageDto.languageName());
        eLanguageDao.setFlag(vLanguageDto.flag());
        eLanguageDao.setBasedOn(vLanguageDto.basedOn());
        eLanguageDao.setUserTags(vLanguageDto.userTags());
        eLanguageDao.setComments(vLanguageDto.comments());
        eLanguageDao.setAssign(vLanguageDto.assign());
        eLanguageDao.setLikedBy(vLanguageDto.likedBy());
    }
}