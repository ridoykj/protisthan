package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemSupplierDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemSupplierDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplier,
        String supplierPartNo,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemSupplierDto fromEntity(ItemSupplierDao eItemSupplierDao) {
        return new ItemSupplierDto(
                eItemSupplierDao.getName(),
                eItemSupplierDao.getCreation(),
                eItemSupplierDao.getModified(),
                eItemSupplierDao.getModifiedBy(),
                eItemSupplierDao.getOwner(),
                eItemSupplierDao.getIsDocStatus(),
                eItemSupplierDao.getIdx(),
                eItemSupplierDao.getSupplier(),
                eItemSupplierDao.getSupplierPartNo(),
                eItemSupplierDao.getParent(),
                eItemSupplierDao.getParentField(),
                eItemSupplierDao.getParentType());
    }

    public static void fromDTO(ItemSupplierDto vItemSupplierDto, ItemSupplierDao eItemSupplierDao) {
        eItemSupplierDao.setName(vItemSupplierDto.name());
        eItemSupplierDao.setCreation(vItemSupplierDto.creation());
        eItemSupplierDao.setModified(vItemSupplierDto.modified());
        eItemSupplierDao.setModifiedBy(vItemSupplierDto.modifiedBy());
        eItemSupplierDao.setOwner(vItemSupplierDto.owner());
        eItemSupplierDao.setIsDocStatus(vItemSupplierDto.isDocStatus());
        eItemSupplierDao.setIdx(vItemSupplierDto.idx());
        eItemSupplierDao.setSupplier(vItemSupplierDto.supplier());
        eItemSupplierDao.setSupplierPartNo(vItemSupplierDto.supplierPartNo());
        eItemSupplierDao.setParent(vItemSupplierDto.parent());
        eItemSupplierDao.setParentField(vItemSupplierDto.parentField());
        eItemSupplierDao.setParentType(vItemSupplierDto.parentType());
    }
}