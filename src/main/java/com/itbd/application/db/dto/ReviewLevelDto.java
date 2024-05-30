package com.itbd.application.db.dto;

import com.itbd.application.db.dao.social.ReviewLevelDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ReviewLevelDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String levelName,
        String role,
        Integer reviewPoints,
        String parent,
        String parentField,
        String parentType
) {
    public static ReviewLevelDto fromEntity(ReviewLevelDao eReviewLevelDao) {
        return new ReviewLevelDto(
                eReviewLevelDao.getName(),
                eReviewLevelDao.getCreation(),
                eReviewLevelDao.getModified(),
                eReviewLevelDao.getModifiedBy(),
                eReviewLevelDao.getOwner(),
                eReviewLevelDao.getIsDocStatus(),
                eReviewLevelDao.getIdx(),
                eReviewLevelDao.getLevelName(),
                eReviewLevelDao.getRole(),
                eReviewLevelDao.getReviewPoints(),
                eReviewLevelDao.getParent(),
                eReviewLevelDao.getParentField(),
                eReviewLevelDao.getParentType());
    }

    public static void fromDTO(ReviewLevelDto vReviewLevelDto, ReviewLevelDao eReviewLevelDao) {
        eReviewLevelDao.setName(vReviewLevelDto.name());
        eReviewLevelDao.setCreation(vReviewLevelDto.creation());
        eReviewLevelDao.setModified(vReviewLevelDto.modified());
        eReviewLevelDao.setModifiedBy(vReviewLevelDto.modifiedBy());
        eReviewLevelDao.setOwner(vReviewLevelDto.owner());
        eReviewLevelDao.setIsDocStatus(vReviewLevelDto.isDocStatus());
        eReviewLevelDao.setIdx(vReviewLevelDto.idx());
        eReviewLevelDao.setLevelName(vReviewLevelDto.levelName());
        eReviewLevelDao.setRole(vReviewLevelDto.role());
        eReviewLevelDao.setReviewPoints(vReviewLevelDto.reviewPoints());
        eReviewLevelDao.setParent(vReviewLevelDto.parent());
        eReviewLevelDao.setParentField(vReviewLevelDto.parentField());
        eReviewLevelDao.setParentType(vReviewLevelDto.parentType());
    }
}