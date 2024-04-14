package com.itbd.application.db.dto.issues;

import com.itbd.application.db.dao.issues.IssuePriorityDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record IssuePriorityDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static IssuePriorityDto fromEntity(IssuePriorityDao eIssuePriorityDao) {
        return new IssuePriorityDto(
                eIssuePriorityDao.getName(),
                eIssuePriorityDao.getCreation(),
                eIssuePriorityDao.getModified(),
                eIssuePriorityDao.getModifiedBy(),
                eIssuePriorityDao.getOwner(),
                eIssuePriorityDao.getIsDocStatus(),
                eIssuePriorityDao.getIdx(),
                eIssuePriorityDao.getDescription(),
                eIssuePriorityDao.getUserTags(),
                eIssuePriorityDao.getComments(),
                eIssuePriorityDao.getAssign(),
                eIssuePriorityDao.getLikedBy());
    }

    public static void fromDTO(IssuePriorityDto vIssuePriorityDto, IssuePriorityDao eIssuePriorityDao) {
        eIssuePriorityDao.setName(vIssuePriorityDto.name());
        eIssuePriorityDao.setCreation(vIssuePriorityDto.creation());
        eIssuePriorityDao.setModified(vIssuePriorityDto.modified());
        eIssuePriorityDao.setModifiedBy(vIssuePriorityDto.modifiedBy());
        eIssuePriorityDao.setOwner(vIssuePriorityDto.owner());
        eIssuePriorityDao.setIsDocStatus(vIssuePriorityDto.isDocStatus());
        eIssuePriorityDao.setIdx(vIssuePriorityDto.idx());
        eIssuePriorityDao.setDescription(vIssuePriorityDto.description());
        eIssuePriorityDao.setUserTags(vIssuePriorityDto.userTags());
        eIssuePriorityDao.setComments(vIssuePriorityDto.comments());
        eIssuePriorityDao.setAssign(vIssuePriorityDto.assign());
        eIssuePriorityDao.setLikedBy(vIssuePriorityDto.likedBy());
    }
}