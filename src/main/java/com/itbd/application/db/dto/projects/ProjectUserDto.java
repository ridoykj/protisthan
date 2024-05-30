package com.itbd.application.db.dto.projects;

import com.itbd.application.db.dao.projects.project.ProjectUserDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProjectUserDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String email,
        String image,
        String fullName,
        Boolean welcomeEmailSent,
        Boolean viewAttachments,
        String projectStatus,
        String parent,
        String parentField,
        String parentType
) {
    public static ProjectUserDto fromEntity(ProjectUserDao eProjectUserDao) {
        return new ProjectUserDto(
                eProjectUserDao.getName(),
                eProjectUserDao.getCreation(),
                eProjectUserDao.getModified(),
                eProjectUserDao.getModifiedBy(),
                eProjectUserDao.getOwner(),
                eProjectUserDao.getIsDocStatus(),
                eProjectUserDao.getIdx(),
                eProjectUserDao.getUser(),
                eProjectUserDao.getEmail(),
                eProjectUserDao.getImage(),
                eProjectUserDao.getFullName(),
                eProjectUserDao.getWelcomeEmailSent(),
                eProjectUserDao.getViewAttachments(),
                eProjectUserDao.getProjectStatus(),
                eProjectUserDao.getParent(),
                eProjectUserDao.getParentField(),
                eProjectUserDao.getParentType());
    }

    public static void fromDTO(ProjectUserDto vProjectUserDto, ProjectUserDao eProjectUserDao) {
        eProjectUserDao.setName(vProjectUserDto.name());
        eProjectUserDao.setCreation(vProjectUserDto.creation());
        eProjectUserDao.setModified(vProjectUserDto.modified());
        eProjectUserDao.setModifiedBy(vProjectUserDto.modifiedBy());
        eProjectUserDao.setOwner(vProjectUserDto.owner());
        eProjectUserDao.setIsDocStatus(vProjectUserDto.isDocStatus());
        eProjectUserDao.setIdx(vProjectUserDto.idx());
        eProjectUserDao.setUser(vProjectUserDto.user());
        eProjectUserDao.setEmail(vProjectUserDto.email());
        eProjectUserDao.setImage(vProjectUserDto.image());
        eProjectUserDao.setFullName(vProjectUserDto.fullName());
        eProjectUserDao.setWelcomeEmailSent(vProjectUserDto.welcomeEmailSent());
        eProjectUserDao.setViewAttachments(vProjectUserDto.viewAttachments());
        eProjectUserDao.setProjectStatus(vProjectUserDto.projectStatus());
        eProjectUserDao.setParent(vProjectUserDto.parent());
        eProjectUserDao.setParentField(vProjectUserDto.parentField());
        eProjectUserDao.setParentType(vProjectUserDto.parentType());
    }
}