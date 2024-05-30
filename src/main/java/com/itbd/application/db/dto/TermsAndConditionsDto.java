package com.itbd.application.db.dto;

import com.itbd.application.db.dao.setup.TermsAndConditionsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TermsAndConditionsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Boolean disabled,
        Boolean selling,
        Boolean buying,
        String terms,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TermsAndConditionsDto fromEntity(TermsAndConditionsDao eTermsAndConditionsDao) {
        return new TermsAndConditionsDto(
                eTermsAndConditionsDao.getName(),
                eTermsAndConditionsDao.getCreation(),
                eTermsAndConditionsDao.getModified(),
                eTermsAndConditionsDao.getModifiedBy(),
                eTermsAndConditionsDao.getOwner(),
                eTermsAndConditionsDao.getIsDocStatus(),
                eTermsAndConditionsDao.getIdx(),
                eTermsAndConditionsDao.getTitle(),
                eTermsAndConditionsDao.getDisabled(),
                eTermsAndConditionsDao.getSelling(),
                eTermsAndConditionsDao.getBuying(),
                eTermsAndConditionsDao.getTerms(),
                eTermsAndConditionsDao.getUserTags(),
                eTermsAndConditionsDao.getComments(),
                eTermsAndConditionsDao.getAssign(),
                eTermsAndConditionsDao.getLikedBy());
    }

    public static void fromDTO(TermsAndConditionsDto vTermsAndConditionsDto, TermsAndConditionsDao eTermsAndConditionsDao) {
        eTermsAndConditionsDao.setName(vTermsAndConditionsDto.name());
        eTermsAndConditionsDao.setCreation(vTermsAndConditionsDto.creation());
        eTermsAndConditionsDao.setModified(vTermsAndConditionsDto.modified());
        eTermsAndConditionsDao.setModifiedBy(vTermsAndConditionsDto.modifiedBy());
        eTermsAndConditionsDao.setOwner(vTermsAndConditionsDto.owner());
        eTermsAndConditionsDao.setIsDocStatus(vTermsAndConditionsDto.isDocStatus());
        eTermsAndConditionsDao.setIdx(vTermsAndConditionsDto.idx());
        eTermsAndConditionsDao.setTitle(vTermsAndConditionsDto.title());
        eTermsAndConditionsDao.setDisabled(vTermsAndConditionsDto.disabled());
        eTermsAndConditionsDao.setSelling(vTermsAndConditionsDto.selling());
        eTermsAndConditionsDao.setBuying(vTermsAndConditionsDto.buying());
        eTermsAndConditionsDao.setTerms(vTermsAndConditionsDto.terms());
        eTermsAndConditionsDao.setUserTags(vTermsAndConditionsDto.userTags());
        eTermsAndConditionsDao.setComments(vTermsAndConditionsDto.comments());
        eTermsAndConditionsDao.setAssign(vTermsAndConditionsDto.assign());
        eTermsAndConditionsDao.setLikedBy(vTermsAndConditionsDto.likedBy());
    }
}