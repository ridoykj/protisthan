package com.itbd.application.db.dto.jobcards;

import com.itbd.application.db.dao.jobcards.JobCardItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobCardItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String sourceWarehouse,
        String uom,
        String itemGroup,
        String stockUom,
        String itemName,
        String description,
        BigDecimal requiredQty,
        BigDecimal transferredQty,
        Boolean allowAlternativeItem,
        String parent,
        String parentField,
        String parentType
) {
    public static JobCardItemDto fromEntity(JobCardItemDao eJobCardItemDao) {
        return new JobCardItemDto(
                eJobCardItemDao.getName(),
                eJobCardItemDao.getCreation(),
                eJobCardItemDao.getModified(),
                eJobCardItemDao.getModifiedBy(),
                eJobCardItemDao.getOwner(),
                eJobCardItemDao.getIsDocStatus(),
                eJobCardItemDao.getIdx(),
                eJobCardItemDao.getItemCode(),
                eJobCardItemDao.getSourceWarehouse(),
                eJobCardItemDao.getUom(),
                eJobCardItemDao.getItemGroup(),
                eJobCardItemDao.getStockUom(),
                eJobCardItemDao.getItemName(),
                eJobCardItemDao.getDescription(),
                eJobCardItemDao.getRequiredQty(),
                eJobCardItemDao.getTransferredQty(),
                eJobCardItemDao.getAllowAlternativeItem(),
                eJobCardItemDao.getParent(),
                eJobCardItemDao.getParentField(),
                eJobCardItemDao.getParentType());
    }

    public static void fromDTO(JobCardItemDto vJobCardItemDto, JobCardItemDao eJobCardItemDao) {
        eJobCardItemDao.setName(vJobCardItemDto.name());
        eJobCardItemDao.setCreation(vJobCardItemDto.creation());
        eJobCardItemDao.setModified(vJobCardItemDto.modified());
        eJobCardItemDao.setModifiedBy(vJobCardItemDto.modifiedBy());
        eJobCardItemDao.setOwner(vJobCardItemDto.owner());
        eJobCardItemDao.setIsDocStatus(vJobCardItemDto.isDocStatus());
        eJobCardItemDao.setIdx(vJobCardItemDto.idx());
        eJobCardItemDao.setItemCode(vJobCardItemDto.itemCode());
        eJobCardItemDao.setSourceWarehouse(vJobCardItemDto.sourceWarehouse());
        eJobCardItemDao.setUom(vJobCardItemDto.uom());
        eJobCardItemDao.setItemGroup(vJobCardItemDto.itemGroup());
        eJobCardItemDao.setStockUom(vJobCardItemDto.stockUom());
        eJobCardItemDao.setItemName(vJobCardItemDto.itemName());
        eJobCardItemDao.setDescription(vJobCardItemDto.description());
        eJobCardItemDao.setRequiredQty(vJobCardItemDto.requiredQty());
        eJobCardItemDao.setTransferredQty(vJobCardItemDto.transferredQty());
        eJobCardItemDao.setAllowAlternativeItem(vJobCardItemDto.allowAlternativeItem());
        eJobCardItemDao.setParent(vJobCardItemDto.parent());
        eJobCardItemDao.setParentField(vJobCardItemDto.parentField());
        eJobCardItemDao.setParentType(vJobCardItemDto.parentType());
    }
}