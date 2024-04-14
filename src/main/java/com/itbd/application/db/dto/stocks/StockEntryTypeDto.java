package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stocks.StockEntryTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record StockEntryTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String purpose,
        Boolean addToTransit,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static StockEntryTypeDto fromEntity(StockEntryTypeDao eStockEntryTypeDao) {
        return new StockEntryTypeDto(
                eStockEntryTypeDao.getName(),
                eStockEntryTypeDao.getCreation(),
                eStockEntryTypeDao.getModified(),
                eStockEntryTypeDao.getModifiedBy(),
                eStockEntryTypeDao.getOwner(),
                eStockEntryTypeDao.getIsDocStatus(),
                eStockEntryTypeDao.getIdx(),
                eStockEntryTypeDao.getPurpose(),
                eStockEntryTypeDao.getAddToTransit(),
                eStockEntryTypeDao.getUserTags(),
                eStockEntryTypeDao.getComments(),
                eStockEntryTypeDao.getAssign(),
                eStockEntryTypeDao.getLikedBy());
    }

    public static void fromDTO(StockEntryTypeDto vStockEntryTypeDto, StockEntryTypeDao eStockEntryTypeDao) {
        eStockEntryTypeDao.setName(vStockEntryTypeDto.name());
        eStockEntryTypeDao.setCreation(vStockEntryTypeDto.creation());
        eStockEntryTypeDao.setModified(vStockEntryTypeDto.modified());
        eStockEntryTypeDao.setModifiedBy(vStockEntryTypeDto.modifiedBy());
        eStockEntryTypeDao.setOwner(vStockEntryTypeDto.owner());
        eStockEntryTypeDao.setIsDocStatus(vStockEntryTypeDto.isDocStatus());
        eStockEntryTypeDao.setIdx(vStockEntryTypeDto.idx());
        eStockEntryTypeDao.setPurpose(vStockEntryTypeDto.purpose());
        eStockEntryTypeDao.setAddToTransit(vStockEntryTypeDto.addToTransit());
        eStockEntryTypeDao.setUserTags(vStockEntryTypeDto.userTags());
        eStockEntryTypeDao.setComments(vStockEntryTypeDto.comments());
        eStockEntryTypeDao.setAssign(vStockEntryTypeDto.assign());
        eStockEntryTypeDao.setLikedBy(vStockEntryTypeDto.likedBy());
    }
}