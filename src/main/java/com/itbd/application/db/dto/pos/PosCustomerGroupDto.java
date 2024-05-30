package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.accounts.pos.PosCustomerGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PosCustomerGroupDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customerGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static PosCustomerGroupDto fromEntity(PosCustomerGroupDao ePosCustomerGroupDao) {
        return new PosCustomerGroupDto(
                ePosCustomerGroupDao.getName(),
                ePosCustomerGroupDao.getCreation(),
                ePosCustomerGroupDao.getModified(),
                ePosCustomerGroupDao.getModifiedBy(),
                ePosCustomerGroupDao.getOwner(),
                ePosCustomerGroupDao.getIsDocStatus(),
                ePosCustomerGroupDao.getIdx(),
                ePosCustomerGroupDao.getCustomerGroup(),
                ePosCustomerGroupDao.getParent(),
                ePosCustomerGroupDao.getParentField(),
                ePosCustomerGroupDao.getParentType());
    }

    public static void fromDTO(PosCustomerGroupDto vPosCustomerGroupDto, PosCustomerGroupDao ePosCustomerGroupDao) {
        ePosCustomerGroupDao.setName(vPosCustomerGroupDto.name());
        ePosCustomerGroupDao.setCreation(vPosCustomerGroupDto.creation());
        ePosCustomerGroupDao.setModified(vPosCustomerGroupDto.modified());
        ePosCustomerGroupDao.setModifiedBy(vPosCustomerGroupDto.modifiedBy());
        ePosCustomerGroupDao.setOwner(vPosCustomerGroupDto.owner());
        ePosCustomerGroupDao.setIsDocStatus(vPosCustomerGroupDto.isDocStatus());
        ePosCustomerGroupDao.setIdx(vPosCustomerGroupDto.idx());
        ePosCustomerGroupDao.setCustomerGroup(vPosCustomerGroupDto.customerGroup());
        ePosCustomerGroupDao.setParent(vPosCustomerGroupDto.parent());
        ePosCustomerGroupDao.setParentField(vPosCustomerGroupDto.parentField());
        ePosCustomerGroupDao.setParentType(vPosCustomerGroupDto.parentType());
    }
}