package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosItemGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PosItemGroupDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static PosItemGroupDto fromEntity(PosItemGroupDao ePosItemGroupDao) {
        return new PosItemGroupDto(
                ePosItemGroupDao.getName(),
                ePosItemGroupDao.getCreation(),
                ePosItemGroupDao.getModified(),
                ePosItemGroupDao.getModifiedBy(),
                ePosItemGroupDao.getOwner(),
                ePosItemGroupDao.getIsDocStatus(),
                ePosItemGroupDao.getIdx(),
                ePosItemGroupDao.getItemGroup(),
                ePosItemGroupDao.getParent(),
                ePosItemGroupDao.getParentField(),
                ePosItemGroupDao.getParentType());
    }

    public static void fromDTO(PosItemGroupDto vPosItemGroupDto, PosItemGroupDao ePosItemGroupDao) {
        ePosItemGroupDao.setName(vPosItemGroupDto.name());
        ePosItemGroupDao.setCreation(vPosItemGroupDto.creation());
        ePosItemGroupDao.setModified(vPosItemGroupDto.modified());
        ePosItemGroupDao.setModifiedBy(vPosItemGroupDto.modifiedBy());
        ePosItemGroupDao.setOwner(vPosItemGroupDto.owner());
        ePosItemGroupDao.setIsDocStatus(vPosItemGroupDto.isDocStatus());
        ePosItemGroupDao.setIdx(vPosItemGroupDto.idx());
        ePosItemGroupDao.setItemGroup(vPosItemGroupDto.itemGroup());
        ePosItemGroupDao.setParent(vPosItemGroupDto.parent());
        ePosItemGroupDao.setParentField(vPosItemGroupDto.parentField());
        ePosItemGroupDao.setParentType(vPosItemGroupDto.parentType());
    }
}