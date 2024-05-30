package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.stock.item.ItemBarcodeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemBarcodeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String barcode,
        String barcodeType,
        String uom,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemBarcodeDto fromEntity(ItemBarcodeDao eItemBarcodeDao) {
        return new ItemBarcodeDto(
                eItemBarcodeDao.getName(),
                eItemBarcodeDao.getCreation(),
                eItemBarcodeDao.getModified(),
                eItemBarcodeDao.getModifiedBy(),
                eItemBarcodeDao.getOwner(),
                eItemBarcodeDao.getIsDocStatus(),
                eItemBarcodeDao.getIdx(),
                eItemBarcodeDao.getBarcode(),
                eItemBarcodeDao.getBarcodeType(),
                eItemBarcodeDao.getUom(),
                eItemBarcodeDao.getParent(),
                eItemBarcodeDao.getParentField(),
                eItemBarcodeDao.getParentType());
    }

    public static void fromDTO(ItemBarcodeDto vItemBarcodeDto, ItemBarcodeDao eItemBarcodeDao) {
        eItemBarcodeDao.setName(vItemBarcodeDto.name());
        eItemBarcodeDao.setCreation(vItemBarcodeDto.creation());
        eItemBarcodeDao.setModified(vItemBarcodeDto.modified());
        eItemBarcodeDao.setModifiedBy(vItemBarcodeDto.modifiedBy());
        eItemBarcodeDao.setOwner(vItemBarcodeDto.owner());
        eItemBarcodeDao.setIsDocStatus(vItemBarcodeDto.isDocStatus());
        eItemBarcodeDao.setIdx(vItemBarcodeDto.idx());
        eItemBarcodeDao.setBarcode(vItemBarcodeDto.barcode());
        eItemBarcodeDao.setBarcodeType(vItemBarcodeDto.barcodeType());
        eItemBarcodeDao.setUom(vItemBarcodeDto.uom());
        eItemBarcodeDao.setParent(vItemBarcodeDto.parent());
        eItemBarcodeDao.setParentField(vItemBarcodeDto.parentField());
        eItemBarcodeDao.setParentType(vItemBarcodeDto.parentType());
    }
}