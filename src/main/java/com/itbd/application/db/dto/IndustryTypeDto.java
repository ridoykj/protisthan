package com.itbd.application.db.dto;

import com.itbd.application.db.dao.selling.IndustryTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record IndustryTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String industry,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static IndustryTypeDto fromEntity(IndustryTypeDao eIndustryTypeDao) {
        return new IndustryTypeDto(
                eIndustryTypeDao.getName(),
                eIndustryTypeDao.getCreation(),
                eIndustryTypeDao.getModified(),
                eIndustryTypeDao.getModifiedBy(),
                eIndustryTypeDao.getOwner(),
                eIndustryTypeDao.getIsDocStatus(),
                eIndustryTypeDao.getIdx(),
                eIndustryTypeDao.getIndustry(),
                eIndustryTypeDao.getUserTags(),
                eIndustryTypeDao.getComments(),
                eIndustryTypeDao.getAssign(),
                eIndustryTypeDao.getLikedBy());
    }

    public static void fromDTO(IndustryTypeDto vIndustryTypeDto, IndustryTypeDao eIndustryTypeDao) {
        eIndustryTypeDao.setName(vIndustryTypeDto.name());
        eIndustryTypeDao.setCreation(vIndustryTypeDto.creation());
        eIndustryTypeDao.setModified(vIndustryTypeDto.modified());
        eIndustryTypeDao.setModifiedBy(vIndustryTypeDto.modifiedBy());
        eIndustryTypeDao.setOwner(vIndustryTypeDto.owner());
        eIndustryTypeDao.setIsDocStatus(vIndustryTypeDto.isDocStatus());
        eIndustryTypeDao.setIdx(vIndustryTypeDto.idx());
        eIndustryTypeDao.setIndustry(vIndustryTypeDto.industry());
        eIndustryTypeDao.setUserTags(vIndustryTypeDto.userTags());
        eIndustryTypeDao.setComments(vIndustryTypeDto.comments());
        eIndustryTypeDao.setAssign(vIndustryTypeDto.assign());
        eIndustryTypeDao.setLikedBy(vIndustryTypeDto.likedBy());
    }
}