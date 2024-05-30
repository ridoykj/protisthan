package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.stock.item.ItemTaxDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ItemTaxDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemTaxTemplate,
        String taxCategory,
        LocalDate validFrom,
        BigDecimal minimumNetRate,
        BigDecimal maximumNetRate,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemTaxDto fromEntity(ItemTaxDao eItemTaxDao) {
        return new ItemTaxDto(
                eItemTaxDao.getName(),
                eItemTaxDao.getCreation(),
                eItemTaxDao.getModified(),
                eItemTaxDao.getModifiedBy(),
                eItemTaxDao.getOwner(),
                eItemTaxDao.getIsDocStatus(),
                eItemTaxDao.getIdx(),
                eItemTaxDao.getItemTaxTemplate(),
                eItemTaxDao.getTaxCategory(),
                eItemTaxDao.getValidFrom(),
                eItemTaxDao.getMinimumNetRate(),
                eItemTaxDao.getMaximumNetRate(),
                eItemTaxDao.getParent(),
                eItemTaxDao.getParentField(),
                eItemTaxDao.getParentType());
    }

    public static void fromDTO(ItemTaxDto vItemTaxDto, ItemTaxDao eItemTaxDao) {
        eItemTaxDao.setName(vItemTaxDto.name());
        eItemTaxDao.setCreation(vItemTaxDto.creation());
        eItemTaxDao.setModified(vItemTaxDto.modified());
        eItemTaxDao.setModifiedBy(vItemTaxDto.modifiedBy());
        eItemTaxDao.setOwner(vItemTaxDto.owner());
        eItemTaxDao.setIsDocStatus(vItemTaxDto.isDocStatus());
        eItemTaxDao.setIdx(vItemTaxDto.idx());
        eItemTaxDao.setItemTaxTemplate(vItemTaxDto.itemTaxTemplate());
        eItemTaxDao.setTaxCategory(vItemTaxDto.taxCategory());
        eItemTaxDao.setValidFrom(vItemTaxDto.validFrom());
        eItemTaxDao.setMinimumNetRate(vItemTaxDto.minimumNetRate());
        eItemTaxDao.setMaximumNetRate(vItemTaxDto.maximumNetRate());
        eItemTaxDao.setParent(vItemTaxDto.parent());
        eItemTaxDao.setParentField(vItemTaxDto.parentField());
        eItemTaxDao.setParentType(vItemTaxDto.parentType());
    }
}