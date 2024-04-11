package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemTaxTemplateDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ItemTaxTemplateDetailDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String taxType,
        BigDecimal taxRate,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemTaxTemplateDetailDto fromEntity(ItemTaxTemplateDetailDao eItemTaxTemplateDetailDao) {
        return new ItemTaxTemplateDetailDto(
                eItemTaxTemplateDetailDao.getName(),
                eItemTaxTemplateDetailDao.getCreation(),
                eItemTaxTemplateDetailDao.getModified(),
                eItemTaxTemplateDetailDao.getModifiedBy(),
                eItemTaxTemplateDetailDao.getOwner(),
                eItemTaxTemplateDetailDao.getIsDocStatus(),
                eItemTaxTemplateDetailDao.getIdx(),
                eItemTaxTemplateDetailDao.getTaxType(),
                eItemTaxTemplateDetailDao.getTaxRate(),
                eItemTaxTemplateDetailDao.getParent(),
                eItemTaxTemplateDetailDao.getParentField(),
                eItemTaxTemplateDetailDao.getParentType());
    }

    public static void fromDTO(ItemTaxTemplateDetailDto vItemTaxTemplateDetailDto, ItemTaxTemplateDetailDao eItemTaxTemplateDetailDao) {
        eItemTaxTemplateDetailDao.setName(vItemTaxTemplateDetailDto.name());
        eItemTaxTemplateDetailDao.setCreation(vItemTaxTemplateDetailDto.creation());
        eItemTaxTemplateDetailDao.setModified(vItemTaxTemplateDetailDto.modified());
        eItemTaxTemplateDetailDao.setModifiedBy(vItemTaxTemplateDetailDto.modifiedBy());
        eItemTaxTemplateDetailDao.setOwner(vItemTaxTemplateDetailDto.owner());
        eItemTaxTemplateDetailDao.setIsDocStatus(vItemTaxTemplateDetailDto.isDocStatus());
        eItemTaxTemplateDetailDao.setIdx(vItemTaxTemplateDetailDto.idx());
        eItemTaxTemplateDetailDao.setTaxType(vItemTaxTemplateDetailDto.taxType());
        eItemTaxTemplateDetailDao.setTaxRate(vItemTaxTemplateDetailDto.taxRate());
        eItemTaxTemplateDetailDao.setParent(vItemTaxTemplateDetailDto.parent());
        eItemTaxTemplateDetailDao.setParentField(vItemTaxTemplateDetailDto.parentField());
        eItemTaxTemplateDetailDao.setParentType(vItemTaxTemplateDetailDto.parentType());
    }
}