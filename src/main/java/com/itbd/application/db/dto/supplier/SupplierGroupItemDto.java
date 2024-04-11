package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierGroupItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SupplierGroupItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplierGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static SupplierGroupItemDto fromEntity(SupplierGroupItemDao eSupplierGroupItemDao) {
        return new SupplierGroupItemDto(
                eSupplierGroupItemDao.getName(),
                eSupplierGroupItemDao.getCreation(),
                eSupplierGroupItemDao.getModified(),
                eSupplierGroupItemDao.getModifiedBy(),
                eSupplierGroupItemDao.getOwner(),
                eSupplierGroupItemDao.getIsDocStatus(),
                eSupplierGroupItemDao.getIdx(),
                eSupplierGroupItemDao.getSupplierGroup(),
                eSupplierGroupItemDao.getParent(),
                eSupplierGroupItemDao.getParentField(),
                eSupplierGroupItemDao.getParentType());
    }

    public static void fromDTO(SupplierGroupItemDto vSupplierGroupItemDto, SupplierGroupItemDao eSupplierGroupItemDao) {
        eSupplierGroupItemDao.setName(vSupplierGroupItemDto.name());
        eSupplierGroupItemDao.setCreation(vSupplierGroupItemDto.creation());
        eSupplierGroupItemDao.setModified(vSupplierGroupItemDto.modified());
        eSupplierGroupItemDao.setModifiedBy(vSupplierGroupItemDto.modifiedBy());
        eSupplierGroupItemDao.setOwner(vSupplierGroupItemDto.owner());
        eSupplierGroupItemDao.setIsDocStatus(vSupplierGroupItemDto.isDocStatus());
        eSupplierGroupItemDao.setIdx(vSupplierGroupItemDto.idx());
        eSupplierGroupItemDao.setSupplierGroup(vSupplierGroupItemDto.supplierGroup());
        eSupplierGroupItemDao.setParent(vSupplierGroupItemDto.parent());
        eSupplierGroupItemDao.setParentField(vSupplierGroupItemDto.parentField());
        eSupplierGroupItemDao.setParentType(vSupplierGroupItemDto.parentType());
    }
}