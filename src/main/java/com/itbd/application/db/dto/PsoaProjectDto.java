package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.PsoaProjectDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PsoaProjectDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String projectName,
        String parent,
        String parentField,
        String parentType
) {
    public static PsoaProjectDto fromEntity(PsoaProjectDao ePsoaProjectDao) {
        return new PsoaProjectDto(
                ePsoaProjectDao.getName(),
                ePsoaProjectDao.getCreation(),
                ePsoaProjectDao.getModified(),
                ePsoaProjectDao.getModifiedBy(),
                ePsoaProjectDao.getOwner(),
                ePsoaProjectDao.getIsDocStatus(),
                ePsoaProjectDao.getIdx(),
                ePsoaProjectDao.getProjectName(),
                ePsoaProjectDao.getParent(),
                ePsoaProjectDao.getParentField(),
                ePsoaProjectDao.getParentType());
    }

    public static void fromDTO(PsoaProjectDto vPsoaProjectDto, PsoaProjectDao ePsoaProjectDao) {
        ePsoaProjectDao.setName(vPsoaProjectDto.name());
        ePsoaProjectDao.setCreation(vPsoaProjectDto.creation());
        ePsoaProjectDao.setModified(vPsoaProjectDto.modified());
        ePsoaProjectDao.setModifiedBy(vPsoaProjectDto.modifiedBy());
        ePsoaProjectDao.setOwner(vPsoaProjectDto.owner());
        ePsoaProjectDao.setIsDocStatus(vPsoaProjectDto.isDocStatus());
        ePsoaProjectDao.setIdx(vPsoaProjectDto.idx());
        ePsoaProjectDao.setProjectName(vPsoaProjectDto.projectName());
        ePsoaProjectDao.setParent(vPsoaProjectDto.parent());
        ePsoaProjectDao.setParentField(vPsoaProjectDto.parentField());
        ePsoaProjectDao.setParentType(vPsoaProjectDto.parentType());
    }
}