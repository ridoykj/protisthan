package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProductBundleItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductBundleItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        BigDecimal qty,
        String description,
        BigDecimal rate,
        String uom,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductBundleItemDto fromEntity(ProductBundleItemDao eProductBundleItemDao) {
        return new ProductBundleItemDto(
                eProductBundleItemDao.getName(),
                eProductBundleItemDao.getCreation(),
                eProductBundleItemDao.getModified(),
                eProductBundleItemDao.getModifiedBy(),
                eProductBundleItemDao.getOwner(),
                eProductBundleItemDao.getIsDocStatus(),
                eProductBundleItemDao.getIdx(),
                eProductBundleItemDao.getItemCode(),
                eProductBundleItemDao.getQty(),
                eProductBundleItemDao.getDescription(),
                eProductBundleItemDao.getRate(),
                eProductBundleItemDao.getUom(),
                eProductBundleItemDao.getParent(),
                eProductBundleItemDao.getParentField(),
                eProductBundleItemDao.getParentType());
    }

    public static void fromDTO(ProductBundleItemDto vProductBundleItemDto, ProductBundleItemDao eProductBundleItemDao) {
        eProductBundleItemDao.setName(vProductBundleItemDto.name());
        eProductBundleItemDao.setCreation(vProductBundleItemDto.creation());
        eProductBundleItemDao.setModified(vProductBundleItemDto.modified());
        eProductBundleItemDao.setModifiedBy(vProductBundleItemDto.modifiedBy());
        eProductBundleItemDao.setOwner(vProductBundleItemDto.owner());
        eProductBundleItemDao.setIsDocStatus(vProductBundleItemDto.isDocStatus());
        eProductBundleItemDao.setIdx(vProductBundleItemDto.idx());
        eProductBundleItemDao.setItemCode(vProductBundleItemDto.itemCode());
        eProductBundleItemDao.setQty(vProductBundleItemDto.qty());
        eProductBundleItemDao.setDescription(vProductBundleItemDto.description());
        eProductBundleItemDao.setRate(vProductBundleItemDto.rate());
        eProductBundleItemDao.setUom(vProductBundleItemDto.uom());
        eProductBundleItemDao.setParent(vProductBundleItemDto.parent());
        eProductBundleItemDao.setParentField(vProductBundleItemDto.parentField());
        eProductBundleItemDao.setParentType(vProductBundleItemDto.parentType());
    }
}