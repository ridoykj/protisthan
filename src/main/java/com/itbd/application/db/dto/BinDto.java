package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BinDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BinDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String warehouse,
        BigDecimal actualQty,
        BigDecimal plannedQty,
        BigDecimal indentedQty,
        BigDecimal orderedQty,
        BigDecimal projectedQty,
        BigDecimal reservedQty,
        BigDecimal reservedQtyForProduction,
        BigDecimal reservedQtyForSubContract,
        BigDecimal reservedQtyForProductionPlan,
        BigDecimal reservedStock,
        String stockUom,
        BigDecimal valuationRate,
        BigDecimal stockValue,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BinDto fromEntity(BinDao eBinDao) {
        return new BinDto(
                eBinDao.getName(),
                eBinDao.getCreation(),
                eBinDao.getModified(),
                eBinDao.getModifiedBy(),
                eBinDao.getOwner(),
                eBinDao.getIsDocStatus(),
                eBinDao.getIdx(),
                eBinDao.getItemCode(),
                eBinDao.getWarehouse(),
                eBinDao.getActualQty(),
                eBinDao.getPlannedQty(),
                eBinDao.getIndentedQty(),
                eBinDao.getOrderedQty(),
                eBinDao.getProjectedQty(),
                eBinDao.getReservedQty(),
                eBinDao.getReservedQtyForProduction(),
                eBinDao.getReservedQtyForSubContract(),
                eBinDao.getReservedQtyForProductionPlan(),
                eBinDao.getReservedStock(),
                eBinDao.getStockUom(),
                eBinDao.getValuationRate(),
                eBinDao.getStockValue(),
                eBinDao.getUserTags(),
                eBinDao.getComments(),
                eBinDao.getAssign(),
                eBinDao.getLikedBy());
    }

    public static void fromDTO(BinDto vBinDto, BinDao eBinDao) {
        eBinDao.setName(vBinDto.name());
        eBinDao.setCreation(vBinDto.creation());
        eBinDao.setModified(vBinDto.modified());
        eBinDao.setModifiedBy(vBinDto.modifiedBy());
        eBinDao.setOwner(vBinDto.owner());
        eBinDao.setIsDocStatus(vBinDto.isDocStatus());
        eBinDao.setIdx(vBinDto.idx());
        eBinDao.setItemCode(vBinDto.itemCode());
        eBinDao.setWarehouse(vBinDto.warehouse());
        eBinDao.setActualQty(vBinDto.actualQty());
        eBinDao.setPlannedQty(vBinDto.plannedQty());
        eBinDao.setIndentedQty(vBinDto.indentedQty());
        eBinDao.setOrderedQty(vBinDto.orderedQty());
        eBinDao.setProjectedQty(vBinDto.projectedQty());
        eBinDao.setReservedQty(vBinDto.reservedQty());
        eBinDao.setReservedQtyForProduction(vBinDto.reservedQtyForProduction());
        eBinDao.setReservedQtyForSubContract(vBinDto.reservedQtyForSubContract());
        eBinDao.setReservedQtyForProductionPlan(vBinDto.reservedQtyForProductionPlan());
        eBinDao.setReservedStock(vBinDto.reservedStock());
        eBinDao.setStockUom(vBinDto.stockUom());
        eBinDao.setValuationRate(vBinDto.valuationRate());
        eBinDao.setStockValue(vBinDto.stockValue());
        eBinDao.setUserTags(vBinDto.userTags());
        eBinDao.setComments(vBinDto.comments());
        eBinDao.setAssign(vBinDto.assign());
        eBinDao.setLikedBy(vBinDto.likedBy());
    }
}