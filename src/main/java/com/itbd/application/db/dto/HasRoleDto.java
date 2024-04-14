package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HasRoleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HasRoleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String role,
        String parent,
        String parentField,
        String parentType
) {
    public static HasRoleDto fromEntity(HasRoleDao eHasRoleDao) {
        return new HasRoleDto(
                eHasRoleDao.getName(),
                eHasRoleDao.getCreation(),
                eHasRoleDao.getModified(),
                eHasRoleDao.getModifiedBy(),
                eHasRoleDao.getOwner(),
                eHasRoleDao.getIsDocStatus(),
                eHasRoleDao.getIdx(),
                eHasRoleDao.getRole(),
                eHasRoleDao.getParent(),
                eHasRoleDao.getParentField(),
                eHasRoleDao.getParentType());
    }

    public static void fromDTO(HasRoleDto vHasRoleDto, HasRoleDao eHasRoleDao) {
        eHasRoleDao.setName(vHasRoleDto.name());
        eHasRoleDao.setCreation(vHasRoleDto.creation());
        eHasRoleDao.setModified(vHasRoleDto.modified());
        eHasRoleDao.setModifiedBy(vHasRoleDto.modifiedBy());
        eHasRoleDao.setOwner(vHasRoleDto.owner());
        eHasRoleDao.setIsDocStatus(vHasRoleDto.isDocStatus());
        eHasRoleDao.setIdx(vHasRoleDto.idx());
        eHasRoleDao.setRole(vHasRoleDto.role());
        eHasRoleDao.setParent(vHasRoleDto.parent());
        eHasRoleDao.setParentField(vHasRoleDto.parentField());
        eHasRoleDao.setParentType(vHasRoleDto.parentType());
    }
}