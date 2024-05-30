package com.itbd.application.db.dto.projects;

import com.itbd.application.db.dao.projects.project.ProjectTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProjectTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String projectType,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProjectTypeDto fromEntity(ProjectTypeDao eProjectTypeDao) {
        return new ProjectTypeDto(
                eProjectTypeDao.getName(),
                eProjectTypeDao.getCreation(),
                eProjectTypeDao.getModified(),
                eProjectTypeDao.getModifiedBy(),
                eProjectTypeDao.getOwner(),
                eProjectTypeDao.getIsDocStatus(),
                eProjectTypeDao.getIdx(),
                eProjectTypeDao.getProjectType(),
                eProjectTypeDao.getDescription(),
                eProjectTypeDao.getUserTags(),
                eProjectTypeDao.getComments(),
                eProjectTypeDao.getAssign(),
                eProjectTypeDao.getLikedBy());
    }

    public static void fromDTO(ProjectTypeDto vProjectTypeDto, ProjectTypeDao eProjectTypeDao) {
        eProjectTypeDao.setName(vProjectTypeDto.name());
        eProjectTypeDao.setCreation(vProjectTypeDto.creation());
        eProjectTypeDao.setModified(vProjectTypeDto.modified());
        eProjectTypeDao.setModifiedBy(vProjectTypeDto.modifiedBy());
        eProjectTypeDao.setOwner(vProjectTypeDto.owner());
        eProjectTypeDao.setIsDocStatus(vProjectTypeDto.isDocStatus());
        eProjectTypeDao.setIdx(vProjectTypeDto.idx());
        eProjectTypeDao.setProjectType(vProjectTypeDto.projectType());
        eProjectTypeDao.setDescription(vProjectTypeDto.description());
        eProjectTypeDao.setUserTags(vProjectTypeDto.userTags());
        eProjectTypeDao.setComments(vProjectTypeDto.comments());
        eProjectTypeDao.setAssign(vProjectTypeDto.assign());
        eProjectTypeDao.setLikedBy(vProjectTypeDto.likedBy());
    }
}