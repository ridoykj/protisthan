package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DependentTaskDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DependentTaskDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String task,
        String parent,
        String parentField,
        String parentType
) {
    public static DependentTaskDto fromEntity(DependentTaskDao eDependentTaskDao) {
        return new DependentTaskDto(
                eDependentTaskDao.getName(),
                eDependentTaskDao.getCreation(),
                eDependentTaskDao.getModified(),
                eDependentTaskDao.getModifiedBy(),
                eDependentTaskDao.getOwner(),
                eDependentTaskDao.getIsDocStatus(),
                eDependentTaskDao.getIdx(),
                eDependentTaskDao.getTask(),
                eDependentTaskDao.getParent(),
                eDependentTaskDao.getParentField(),
                eDependentTaskDao.getParentType());
    }

    public static void fromDTO(DependentTaskDto vDependentTaskDto, DependentTaskDao eDependentTaskDao) {
        eDependentTaskDao.setName(vDependentTaskDto.name());
        eDependentTaskDao.setCreation(vDependentTaskDto.creation());
        eDependentTaskDao.setModified(vDependentTaskDto.modified());
        eDependentTaskDao.setModifiedBy(vDependentTaskDto.modifiedBy());
        eDependentTaskDao.setOwner(vDependentTaskDto.owner());
        eDependentTaskDao.setIsDocStatus(vDependentTaskDto.isDocStatus());
        eDependentTaskDao.setIdx(vDependentTaskDto.idx());
        eDependentTaskDao.setTask(vDependentTaskDto.task());
        eDependentTaskDao.setParent(vDependentTaskDto.parent());
        eDependentTaskDao.setParentField(vDependentTaskDto.parentField());
        eDependentTaskDao.setParentType(vDependentTaskDto.parentType());
    }
}