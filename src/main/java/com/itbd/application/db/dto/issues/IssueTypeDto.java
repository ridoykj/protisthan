package com.itbd.application.db.dto.issues;

import com.itbd.application.db.dao.issues.IssueTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record IssueTypeDto(
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
    public static IssueTypeDto fromEntity(IssueTypeDao eIssueTypeDao) {
        return new IssueTypeDto(
                eIssueTypeDao.getName(),
                eIssueTypeDao.getCreation(),
                eIssueTypeDao.getModified(),
                eIssueTypeDao.getModifiedBy(),
                eIssueTypeDao.getOwner(),
                eIssueTypeDao.getIsDocStatus(),
                eIssueTypeDao.getIdx(),
                eIssueTypeDao.getDescription(),
                eIssueTypeDao.getUserTags(),
                eIssueTypeDao.getComments(),
                eIssueTypeDao.getAssign(),
                eIssueTypeDao.getLikedBy());
    }

    public static void fromDTO(IssueTypeDto vIssueTypeDto, IssueTypeDao eIssueTypeDao) {
        eIssueTypeDao.setName(vIssueTypeDto.name());
        eIssueTypeDao.setCreation(vIssueTypeDto.creation());
        eIssueTypeDao.setModified(vIssueTypeDto.modified());
        eIssueTypeDao.setModifiedBy(vIssueTypeDto.modifiedBy());
        eIssueTypeDao.setOwner(vIssueTypeDto.owner());
        eIssueTypeDao.setIsDocStatus(vIssueTypeDto.isDocStatus());
        eIssueTypeDao.setIdx(vIssueTypeDto.idx());
        eIssueTypeDao.setDescription(vIssueTypeDto.description());
        eIssueTypeDao.setUserTags(vIssueTypeDto.userTags());
        eIssueTypeDao.setComments(vIssueTypeDto.comments());
        eIssueTypeDao.setAssign(vIssueTypeDto.assign());
        eIssueTypeDao.setLikedBy(vIssueTypeDto.likedBy());
    }
}