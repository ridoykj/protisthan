package com.itbd.application.db.dto.jobcards;

import com.itbd.application.db.dao.jobcards.JobCardScrapItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobCardScrapItemDto(
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
        String description,
        BigDecimal stockQty,
        String stockUom,
        String parent,
        String parentField,
        String parentType
) {
    public static JobCardScrapItemDto fromEntity(JobCardScrapItemDao eJobCardScrapItemDao) {
        return new JobCardScrapItemDto(
                eJobCardScrapItemDao.getName(),
                eJobCardScrapItemDao.getCreation(),
                eJobCardScrapItemDao.getModified(),
                eJobCardScrapItemDao.getModifiedBy(),
                eJobCardScrapItemDao.getOwner(),
                eJobCardScrapItemDao.getIsDocStatus(),
                eJobCardScrapItemDao.getIdx(),
                eJobCardScrapItemDao.getItemCode(),
                eJobCardScrapItemDao.getItemName(),
                eJobCardScrapItemDao.getDescription(),
                eJobCardScrapItemDao.getStockQty(),
                eJobCardScrapItemDao.getStockUom(),
                eJobCardScrapItemDao.getParent(),
                eJobCardScrapItemDao.getParentField(),
                eJobCardScrapItemDao.getParentType());
    }

    public static void fromDTO(JobCardScrapItemDto vJobCardScrapItemDto, JobCardScrapItemDao eJobCardScrapItemDao) {
        eJobCardScrapItemDao.setName(vJobCardScrapItemDto.name());
        eJobCardScrapItemDao.setCreation(vJobCardScrapItemDto.creation());
        eJobCardScrapItemDao.setModified(vJobCardScrapItemDto.modified());
        eJobCardScrapItemDao.setModifiedBy(vJobCardScrapItemDto.modifiedBy());
        eJobCardScrapItemDao.setOwner(vJobCardScrapItemDto.owner());
        eJobCardScrapItemDao.setIsDocStatus(vJobCardScrapItemDto.isDocStatus());
        eJobCardScrapItemDao.setIdx(vJobCardScrapItemDto.idx());
        eJobCardScrapItemDao.setItemCode(vJobCardScrapItemDto.itemCode());
        eJobCardScrapItemDao.setItemName(vJobCardScrapItemDto.itemName());
        eJobCardScrapItemDao.setDescription(vJobCardScrapItemDto.description());
        eJobCardScrapItemDao.setStockQty(vJobCardScrapItemDto.stockQty());
        eJobCardScrapItemDao.setStockUom(vJobCardScrapItemDto.stockUom());
        eJobCardScrapItemDao.setParent(vJobCardScrapItemDto.parent());
        eJobCardScrapItemDao.setParentField(vJobCardScrapItemDto.parentField());
        eJobCardScrapItemDao.setParentType(vJobCardScrapItemDto.parentType());
    }
}