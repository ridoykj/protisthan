package com.itbd.application.db.dto.transactions;

import com.itbd.application.db.dao.transactions.TranslationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TranslationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean contributed,
        String language,
        String sourceText,
        String context,
        String translatedText,
        String contributionStatus,
        String contributionDocName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TranslationDto fromEntity(TranslationDao eTranslationDao) {
        return new TranslationDto(
                eTranslationDao.getName(),
                eTranslationDao.getCreation(),
                eTranslationDao.getModified(),
                eTranslationDao.getModifiedBy(),
                eTranslationDao.getOwner(),
                eTranslationDao.getIsDocStatus(),
                eTranslationDao.getIdx(),
                eTranslationDao.getContributed(),
                eTranslationDao.getLanguage(),
                eTranslationDao.getSourceText(),
                eTranslationDao.getContext(),
                eTranslationDao.getTranslatedText(),
                eTranslationDao.getContributionStatus(),
                eTranslationDao.getContributionDocName(),
                eTranslationDao.getUserTags(),
                eTranslationDao.getComments(),
                eTranslationDao.getAssign(),
                eTranslationDao.getLikedBy());
    }

    public static void fromDTO(TranslationDto vTranslationDto, TranslationDao eTranslationDao) {
        eTranslationDao.setName(vTranslationDto.name());
        eTranslationDao.setCreation(vTranslationDto.creation());
        eTranslationDao.setModified(vTranslationDto.modified());
        eTranslationDao.setModifiedBy(vTranslationDto.modifiedBy());
        eTranslationDao.setOwner(vTranslationDto.owner());
        eTranslationDao.setIsDocStatus(vTranslationDto.isDocStatus());
        eTranslationDao.setIdx(vTranslationDto.idx());
        eTranslationDao.setContributed(vTranslationDto.contributed());
        eTranslationDao.setLanguage(vTranslationDto.language());
        eTranslationDao.setSourceText(vTranslationDto.sourceText());
        eTranslationDao.setContext(vTranslationDto.context());
        eTranslationDao.setTranslatedText(vTranslationDto.translatedText());
        eTranslationDao.setContributionStatus(vTranslationDto.contributionStatus());
        eTranslationDao.setContributionDocName(vTranslationDto.contributionDocName());
        eTranslationDao.setUserTags(vTranslationDto.userTags());
        eTranslationDao.setComments(vTranslationDto.comments());
        eTranslationDao.setAssign(vTranslationDto.assign());
        eTranslationDao.setLikedBy(vTranslationDto.likedBy());
    }
}