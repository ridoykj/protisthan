package com.itbd.application.db.dto.projects;

import com.itbd.application.db.dao.projects.project.ProjectTemplateTaskDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProjectTemplateTaskDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String task,
        String subject,
        String parent,
        String parentField,
        String parentType
) {
    public static ProjectTemplateTaskDto fromEntity(ProjectTemplateTaskDao eProjectTemplateTaskDao) {
        return new ProjectTemplateTaskDto(
                eProjectTemplateTaskDao.getName(),
                eProjectTemplateTaskDao.getCreation(),
                eProjectTemplateTaskDao.getModified(),
                eProjectTemplateTaskDao.getModifiedBy(),
                eProjectTemplateTaskDao.getOwner(),
                eProjectTemplateTaskDao.getIsDocStatus(),
                eProjectTemplateTaskDao.getIdx(),
                eProjectTemplateTaskDao.getTask(),
                eProjectTemplateTaskDao.getSubject(),
                eProjectTemplateTaskDao.getParent(),
                eProjectTemplateTaskDao.getParentField(),
                eProjectTemplateTaskDao.getParentType());
    }

    public static void fromDTO(ProjectTemplateTaskDto vProjectTemplateTaskDto, ProjectTemplateTaskDao eProjectTemplateTaskDao) {
        eProjectTemplateTaskDao.setName(vProjectTemplateTaskDto.name());
        eProjectTemplateTaskDao.setCreation(vProjectTemplateTaskDto.creation());
        eProjectTemplateTaskDao.setModified(vProjectTemplateTaskDto.modified());
        eProjectTemplateTaskDao.setModifiedBy(vProjectTemplateTaskDto.modifiedBy());
        eProjectTemplateTaskDao.setOwner(vProjectTemplateTaskDto.owner());
        eProjectTemplateTaskDao.setIsDocStatus(vProjectTemplateTaskDto.isDocStatus());
        eProjectTemplateTaskDao.setIdx(vProjectTemplateTaskDto.idx());
        eProjectTemplateTaskDao.setTask(vProjectTemplateTaskDto.task());
        eProjectTemplateTaskDao.setSubject(vProjectTemplateTaskDto.subject());
        eProjectTemplateTaskDao.setParent(vProjectTemplateTaskDto.parent());
        eProjectTemplateTaskDao.setParentField(vProjectTemplateTaskDto.parentField());
        eProjectTemplateTaskDao.setParentType(vProjectTemplateTaskDto.parentType());
    }
}