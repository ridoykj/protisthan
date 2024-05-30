package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.accounts.SupplierItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SupplierItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplier,
        String parent,
        String parentField,
        String parentType
) {
    public static SupplierItemDto fromEntity(SupplierItemDao eSupplierItemDao) {
        return new SupplierItemDto(
                eSupplierItemDao.getName(),
                eSupplierItemDao.getCreation(),
                eSupplierItemDao.getModified(),
                eSupplierItemDao.getModifiedBy(),
                eSupplierItemDao.getOwner(),
                eSupplierItemDao.getIsDocStatus(),
                eSupplierItemDao.getIdx(),
                eSupplierItemDao.getSupplier(),
                eSupplierItemDao.getParent(),
                eSupplierItemDao.getParentField(),
                eSupplierItemDao.getParentType());
    }

    public static void fromDTO(SupplierItemDto vSupplierItemDto, SupplierItemDao eSupplierItemDao) {
        eSupplierItemDao.setName(vSupplierItemDto.name());
        eSupplierItemDao.setCreation(vSupplierItemDto.creation());
        eSupplierItemDao.setModified(vSupplierItemDto.modified());
        eSupplierItemDao.setModifiedBy(vSupplierItemDto.modifiedBy());
        eSupplierItemDao.setOwner(vSupplierItemDto.owner());
        eSupplierItemDao.setIsDocStatus(vSupplierItemDto.isDocStatus());
        eSupplierItemDao.setIdx(vSupplierItemDto.idx());
        eSupplierItemDao.setSupplier(vSupplierItemDto.supplier());
        eSupplierItemDao.setParent(vSupplierItemDto.parent());
        eSupplierItemDao.setParentField(vSupplierItemDto.parentField());
        eSupplierItemDao.setParentType(vSupplierItemDto.parentType());
    }
}