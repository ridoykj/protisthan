package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PutawayRuleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PutawayRuleDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Integer disable,
        String itemCode,
        String itemName,
        String warehouse,
        Integer priority,
        String company,
        BigDecimal capacity,
        String uom,
        BigDecimal conversionFactor,
        String stockUom,
        BigDecimal stockCapacity,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PutawayRuleDto fromEntity(PutawayRuleDao ePutawayRuleDao) {
        return new PutawayRuleDto(
                ePutawayRuleDao.getName(),
                ePutawayRuleDao.getCreation(),
                ePutawayRuleDao.getModified(),
                ePutawayRuleDao.getModifiedBy(),
                ePutawayRuleDao.getOwner(),
                ePutawayRuleDao.getIsDocStatus(),
                ePutawayRuleDao.getIdx(),
                ePutawayRuleDao.getDisable(),
                ePutawayRuleDao.getItemCode(),
                ePutawayRuleDao.getItemName(),
                ePutawayRuleDao.getWarehouse(),
                ePutawayRuleDao.getPriority(),
                ePutawayRuleDao.getCompany(),
                ePutawayRuleDao.getCapacity(),
                ePutawayRuleDao.getUom(),
                ePutawayRuleDao.getConversionFactor(),
                ePutawayRuleDao.getStockUom(),
                ePutawayRuleDao.getStockCapacity(),
                ePutawayRuleDao.getUserTags(),
                ePutawayRuleDao.getComments(),
                ePutawayRuleDao.getAssign(),
                ePutawayRuleDao.getLikedBy());
    }

    public static void fromDTO(PutawayRuleDto vPutawayRuleDto, PutawayRuleDao ePutawayRuleDao) {
        ePutawayRuleDao.setName(vPutawayRuleDto.name());
        ePutawayRuleDao.setCreation(vPutawayRuleDto.creation());
        ePutawayRuleDao.setModified(vPutawayRuleDto.modified());
        ePutawayRuleDao.setModifiedBy(vPutawayRuleDto.modifiedBy());
        ePutawayRuleDao.setOwner(vPutawayRuleDto.owner());
        ePutawayRuleDao.setIsDocStatus(vPutawayRuleDto.isDocStatus());
        ePutawayRuleDao.setIdx(vPutawayRuleDto.idx());
        ePutawayRuleDao.setDisable(vPutawayRuleDto.disable());
        ePutawayRuleDao.setItemCode(vPutawayRuleDto.itemCode());
        ePutawayRuleDao.setItemName(vPutawayRuleDto.itemName());
        ePutawayRuleDao.setWarehouse(vPutawayRuleDto.warehouse());
        ePutawayRuleDao.setPriority(vPutawayRuleDto.priority());
        ePutawayRuleDao.setCompany(vPutawayRuleDto.company());
        ePutawayRuleDao.setCapacity(vPutawayRuleDto.capacity());
        ePutawayRuleDao.setUom(vPutawayRuleDto.uom());
        ePutawayRuleDao.setConversionFactor(vPutawayRuleDto.conversionFactor());
        ePutawayRuleDao.setStockUom(vPutawayRuleDto.stockUom());
        ePutawayRuleDao.setStockCapacity(vPutawayRuleDto.stockCapacity());
        ePutawayRuleDao.setUserTags(vPutawayRuleDto.userTags());
        ePutawayRuleDao.setComments(vPutawayRuleDto.comments());
        ePutawayRuleDao.setAssign(vPutawayRuleDto.assign());
        ePutawayRuleDao.setLikedBy(vPutawayRuleDto.likedBy());
    }
}