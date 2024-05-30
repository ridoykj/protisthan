package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.projects.task.TaskDependsOnDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TaskDependsOnDto(
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
        String project,
        String parent,
        String parentField,
        String parentType
) {
    public static TaskDependsOnDto fromEntity(TaskDependsOnDao eTaskDependsOnDao) {
        return new TaskDependsOnDto(
                eTaskDependsOnDao.getName(),
                eTaskDependsOnDao.getCreation(),
                eTaskDependsOnDao.getModified(),
                eTaskDependsOnDao.getModifiedBy(),
                eTaskDependsOnDao.getOwner(),
                eTaskDependsOnDao.getIsDocStatus(),
                eTaskDependsOnDao.getIdx(),
                eTaskDependsOnDao.getTask(),
                eTaskDependsOnDao.getSubject(),
                eTaskDependsOnDao.getProject(),
                eTaskDependsOnDao.getParent(),
                eTaskDependsOnDao.getParentField(),
                eTaskDependsOnDao.getParentType());
    }

    public static void fromDTO(TaskDependsOnDto vTaskDependsOnDto, TaskDependsOnDao eTaskDependsOnDao) {
        eTaskDependsOnDao.setName(vTaskDependsOnDto.name());
        eTaskDependsOnDao.setCreation(vTaskDependsOnDto.creation());
        eTaskDependsOnDao.setModified(vTaskDependsOnDto.modified());
        eTaskDependsOnDao.setModifiedBy(vTaskDependsOnDto.modifiedBy());
        eTaskDependsOnDao.setOwner(vTaskDependsOnDto.owner());
        eTaskDependsOnDao.setIsDocStatus(vTaskDependsOnDto.isDocStatus());
        eTaskDependsOnDao.setIdx(vTaskDependsOnDto.idx());
        eTaskDependsOnDao.setTask(vTaskDependsOnDto.task());
        eTaskDependsOnDao.setSubject(vTaskDependsOnDto.subject());
        eTaskDependsOnDao.setProject(vTaskDependsOnDto.project());
        eTaskDependsOnDao.setParent(vTaskDependsOnDto.parent());
        eTaskDependsOnDao.setParentField(vTaskDependsOnDto.parentField());
        eTaskDependsOnDao.setParentType(vTaskDependsOnDto.parentType());
    }
}