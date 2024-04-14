package com.itbd.application.db.dto.opportunity;

import com.itbd.application.db.dao.opportunity.OpportunityItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OpportunityItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        String uom,
        BigDecimal qty,
        String brand,
        String itemGroup,
        String description,
        String image,
        BigDecimal baseRate,
        BigDecimal baseAmount,
        BigDecimal rate,
        BigDecimal amount,
        String parent,
        String parentField,
        String parentType
) {
    public static OpportunityItemDto fromEntity(OpportunityItemDao eOpportunityItemDao) {
        return new OpportunityItemDto(
                eOpportunityItemDao.getName(),
                eOpportunityItemDao.getCreation(),
                eOpportunityItemDao.getModified(),
                eOpportunityItemDao.getModifiedBy(),
                eOpportunityItemDao.getOwner(),
                eOpportunityItemDao.getIsDocStatus(),
                eOpportunityItemDao.getIdx(),
                eOpportunityItemDao.getItemCode(),
                eOpportunityItemDao.getItemName(),
                eOpportunityItemDao.getUom(),
                eOpportunityItemDao.getQty(),
                eOpportunityItemDao.getBrand(),
                eOpportunityItemDao.getItemGroup(),
                eOpportunityItemDao.getDescription(),
                eOpportunityItemDao.getImage(),
                eOpportunityItemDao.getBaseRate(),
                eOpportunityItemDao.getBaseAmount(),
                eOpportunityItemDao.getRate(),
                eOpportunityItemDao.getAmount(),
                eOpportunityItemDao.getParent(),
                eOpportunityItemDao.getParentField(),
                eOpportunityItemDao.getParentType());
    }

    public static void fromDTO(OpportunityItemDto vOpportunityItemDto, OpportunityItemDao eOpportunityItemDao) {
        eOpportunityItemDao.setName(vOpportunityItemDto.name());
        eOpportunityItemDao.setCreation(vOpportunityItemDto.creation());
        eOpportunityItemDao.setModified(vOpportunityItemDto.modified());
        eOpportunityItemDao.setModifiedBy(vOpportunityItemDto.modifiedBy());
        eOpportunityItemDao.setOwner(vOpportunityItemDto.owner());
        eOpportunityItemDao.setIsDocStatus(vOpportunityItemDto.isDocStatus());
        eOpportunityItemDao.setIdx(vOpportunityItemDto.idx());
        eOpportunityItemDao.setItemCode(vOpportunityItemDto.itemCode());
        eOpportunityItemDao.setItemName(vOpportunityItemDto.itemName());
        eOpportunityItemDao.setUom(vOpportunityItemDto.uom());
        eOpportunityItemDao.setQty(vOpportunityItemDto.qty());
        eOpportunityItemDao.setBrand(vOpportunityItemDto.brand());
        eOpportunityItemDao.setItemGroup(vOpportunityItemDto.itemGroup());
        eOpportunityItemDao.setDescription(vOpportunityItemDto.description());
        eOpportunityItemDao.setImage(vOpportunityItemDto.image());
        eOpportunityItemDao.setBaseRate(vOpportunityItemDto.baseRate());
        eOpportunityItemDao.setBaseAmount(vOpportunityItemDto.baseAmount());
        eOpportunityItemDao.setRate(vOpportunityItemDto.rate());
        eOpportunityItemDao.setAmount(vOpportunityItemDto.amount());
        eOpportunityItemDao.setParent(vOpportunityItemDto.parent());
        eOpportunityItemDao.setParentField(vOpportunityItemDto.parentField());
        eOpportunityItemDao.setParentType(vOpportunityItemDto.parentType());
    }
}