package com.itbd.application.db.dto.projects;

import com.itbd.application.db.dao.projects.ProjectTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProjectTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String projectType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProjectTemplateDto fromEntity(ProjectTemplateDao eProjectTemplateDao) {
        return new ProjectTemplateDto(
                eProjectTemplateDao.getName(),
                eProjectTemplateDao.getCreation(),
                eProjectTemplateDao.getModified(),
                eProjectTemplateDao.getModifiedBy(),
                eProjectTemplateDao.getOwner(),
                eProjectTemplateDao.getIsDocStatus(),
                eProjectTemplateDao.getIdx(),
                eProjectTemplateDao.getProjectType(),
                eProjectTemplateDao.getUserTags(),
                eProjectTemplateDao.getComments(),
                eProjectTemplateDao.getAssign(),
                eProjectTemplateDao.getLikedBy());
    }

    public static void fromDTO(ProjectTemplateDto vProjectTemplateDto, ProjectTemplateDao eProjectTemplateDao) {
        eProjectTemplateDao.setName(vProjectTemplateDto.name());
        eProjectTemplateDao.setCreation(vProjectTemplateDto.creation());
        eProjectTemplateDao.setModified(vProjectTemplateDto.modified());
        eProjectTemplateDao.setModifiedBy(vProjectTemplateDto.modifiedBy());
        eProjectTemplateDao.setOwner(vProjectTemplateDto.owner());
        eProjectTemplateDao.setIsDocStatus(vProjectTemplateDto.isDocStatus());
        eProjectTemplateDao.setIdx(vProjectTemplateDto.idx());
        eProjectTemplateDao.setProjectType(vProjectTemplateDto.projectType());
        eProjectTemplateDao.setUserTags(vProjectTemplateDto.userTags());
        eProjectTemplateDao.setComments(vProjectTemplateDto.comments());
        eProjectTemplateDao.setAssign(vProjectTemplateDto.assign());
        eProjectTemplateDao.setLikedBy(vProjectTemplateDto.likedBy());
    }
}