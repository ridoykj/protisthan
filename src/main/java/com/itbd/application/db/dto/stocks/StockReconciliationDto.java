package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stocks.StockReconciliationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record StockReconciliationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        String purpose,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        String setWarehouse,
        String scanBarcode,
        Boolean scanMode,
        String expenseAccount,
        BigDecimal differenceAmount,
        String amendedFrom,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static StockReconciliationDto fromEntity(StockReconciliationDao eStockReconciliationDao) {
        return new StockReconciliationDto(
                eStockReconciliationDao.getName(),
                eStockReconciliationDao.getCreation(),
                eStockReconciliationDao.getModified(),
                eStockReconciliationDao.getModifiedBy(),
                eStockReconciliationDao.getOwner(),
                eStockReconciliationDao.getIsDocStatus(),
                eStockReconciliationDao.getIdx(),
                eStockReconciliationDao.getNamingSeries(),
                eStockReconciliationDao.getCompany(),
                eStockReconciliationDao.getPurpose(),
                eStockReconciliationDao.getPostingDate(),
                eStockReconciliationDao.getPostingTime(),
                eStockReconciliationDao.getSetPostingTime(),
                eStockReconciliationDao.getSetWarehouse(),
                eStockReconciliationDao.getScanBarcode(),
                eStockReconciliationDao.getScanMode(),
                eStockReconciliationDao.getExpenseAccount(),
                eStockReconciliationDao.getDifferenceAmount(),
                eStockReconciliationDao.getAmendedFrom(),
                eStockReconciliationDao.getCostCenter(),
                eStockReconciliationDao.getUserTags(),
                eStockReconciliationDao.getComments(),
                eStockReconciliationDao.getAssign(),
                eStockReconciliationDao.getLikedBy());
    }

    public static void fromDTO(StockReconciliationDto vStockReconciliationDto, StockReconciliationDao eStockReconciliationDao) {
        eStockReconciliationDao.setName(vStockReconciliationDto.name());
        eStockReconciliationDao.setCreation(vStockReconciliationDto.creation());
        eStockReconciliationDao.setModified(vStockReconciliationDto.modified());
        eStockReconciliationDao.setModifiedBy(vStockReconciliationDto.modifiedBy());
        eStockReconciliationDao.setOwner(vStockReconciliationDto.owner());
        eStockReconciliationDao.setIsDocStatus(vStockReconciliationDto.isDocStatus());
        eStockReconciliationDao.setIdx(vStockReconciliationDto.idx());
        eStockReconciliationDao.setNamingSeries(vStockReconciliationDto.namingSeries());
        eStockReconciliationDao.setCompany(vStockReconciliationDto.company());
        eStockReconciliationDao.setPurpose(vStockReconciliationDto.purpose());
        eStockReconciliationDao.setPostingDate(vStockReconciliationDto.postingDate());
        eStockReconciliationDao.setPostingTime(vStockReconciliationDto.postingTime());
        eStockReconciliationDao.setSetPostingTime(vStockReconciliationDto.setPostingTime());
        eStockReconciliationDao.setSetWarehouse(vStockReconciliationDto.setWarehouse());
        eStockReconciliationDao.setScanBarcode(vStockReconciliationDto.scanBarcode());
        eStockReconciliationDao.setScanMode(vStockReconciliationDto.scanMode());
        eStockReconciliationDao.setExpenseAccount(vStockReconciliationDto.expenseAccount());
        eStockReconciliationDao.setDifferenceAmount(vStockReconciliationDto.differenceAmount());
        eStockReconciliationDao.setAmendedFrom(vStockReconciliationDto.amendedFrom());
        eStockReconciliationDao.setCostCenter(vStockReconciliationDto.costCenter());
        eStockReconciliationDao.setUserTags(vStockReconciliationDto.userTags());
        eStockReconciliationDao.setComments(vStockReconciliationDto.comments());
        eStockReconciliationDao.setAssign(vStockReconciliationDto.assign());
        eStockReconciliationDao.setLikedBy(vStockReconciliationDto.likedBy());
    }
}