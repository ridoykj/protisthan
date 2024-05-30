package com.itbd.application.db.dto;

import com.itbd.application.db.dao.assets.LinkedLocationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LinkedLocationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String location,
        String parent,
        String parentField,
        String parentType
) {
    public static LinkedLocationDto fromEntity(LinkedLocationDao eLinkedLocationDao) {
        return new LinkedLocationDto(
                eLinkedLocationDao.getName(),
                eLinkedLocationDao.getCreation(),
                eLinkedLocationDao.getModified(),
                eLinkedLocationDao.getModifiedBy(),
                eLinkedLocationDao.getOwner(),
                eLinkedLocationDao.getIsDocStatus(),
                eLinkedLocationDao.getIdx(),
                eLinkedLocationDao.getLocation(),
                eLinkedLocationDao.getParent(),
                eLinkedLocationDao.getParentField(),
                eLinkedLocationDao.getParentType());
    }

    public static void fromDTO(LinkedLocationDto vLinkedLocationDto, LinkedLocationDao eLinkedLocationDao) {
        eLinkedLocationDao.setName(vLinkedLocationDto.name());
        eLinkedLocationDao.setCreation(vLinkedLocationDto.creation());
        eLinkedLocationDao.setModified(vLinkedLocationDto.modified());
        eLinkedLocationDao.setModifiedBy(vLinkedLocationDto.modifiedBy());
        eLinkedLocationDao.setOwner(vLinkedLocationDto.owner());
        eLinkedLocationDao.setIsDocStatus(vLinkedLocationDto.isDocStatus());
        eLinkedLocationDao.setIdx(vLinkedLocationDto.idx());
        eLinkedLocationDao.setLocation(vLinkedLocationDto.location());
        eLinkedLocationDao.setParent(vLinkedLocationDto.parent());
        eLinkedLocationDao.setParentField(vLinkedLocationDto.parentField());
        eLinkedLocationDao.setParentType(vLinkedLocationDto.parentType());
    }
}