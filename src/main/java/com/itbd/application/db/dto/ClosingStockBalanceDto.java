package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ClosingStockBalanceDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ClosingStockBalanceDto(
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
        String status,
        LocalDate fromDate,
        LocalDate toDate,
        String itemCode,
        String itemGroup,
        String includeUom,
        String warehouse,
        String warehouseType,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ClosingStockBalanceDto fromEntity(ClosingStockBalanceDao eClosingStockBalanceDao) {
        return new ClosingStockBalanceDto(
                eClosingStockBalanceDao.getName(),
                eClosingStockBalanceDao.getCreation(),
                eClosingStockBalanceDao.getModified(),
                eClosingStockBalanceDao.getModifiedBy(),
                eClosingStockBalanceDao.getOwner(),
                eClosingStockBalanceDao.getIsDocStatus(),
                eClosingStockBalanceDao.getIdx(),
                eClosingStockBalanceDao.getNamingSeries(),
                eClosingStockBalanceDao.getCompany(),
                eClosingStockBalanceDao.getStatus(),
                eClosingStockBalanceDao.getFromDate(),
                eClosingStockBalanceDao.getToDate(),
                eClosingStockBalanceDao.getItemCode(),
                eClosingStockBalanceDao.getItemGroup(),
                eClosingStockBalanceDao.getIncludeUom(),
                eClosingStockBalanceDao.getWarehouse(),
                eClosingStockBalanceDao.getWarehouseType(),
                eClosingStockBalanceDao.getAmendedFrom(),
                eClosingStockBalanceDao.getUserTags(),
                eClosingStockBalanceDao.getComments(),
                eClosingStockBalanceDao.getAssign(),
                eClosingStockBalanceDao.getLikedBy());
    }

    public static void fromDTO(ClosingStockBalanceDto vClosingStockBalanceDto, ClosingStockBalanceDao eClosingStockBalanceDao) {
        eClosingStockBalanceDao.setName(vClosingStockBalanceDto.name());
        eClosingStockBalanceDao.setCreation(vClosingStockBalanceDto.creation());
        eClosingStockBalanceDao.setModified(vClosingStockBalanceDto.modified());
        eClosingStockBalanceDao.setModifiedBy(vClosingStockBalanceDto.modifiedBy());
        eClosingStockBalanceDao.setOwner(vClosingStockBalanceDto.owner());
        eClosingStockBalanceDao.setIsDocStatus(vClosingStockBalanceDto.isDocStatus());
        eClosingStockBalanceDao.setIdx(vClosingStockBalanceDto.idx());
        eClosingStockBalanceDao.setNamingSeries(vClosingStockBalanceDto.namingSeries());
        eClosingStockBalanceDao.setCompany(vClosingStockBalanceDto.company());
        eClosingStockBalanceDao.setStatus(vClosingStockBalanceDto.status());
        eClosingStockBalanceDao.setFromDate(vClosingStockBalanceDto.fromDate());
        eClosingStockBalanceDao.setToDate(vClosingStockBalanceDto.toDate());
        eClosingStockBalanceDao.setItemCode(vClosingStockBalanceDto.itemCode());
        eClosingStockBalanceDao.setItemGroup(vClosingStockBalanceDto.itemGroup());
        eClosingStockBalanceDao.setIncludeUom(vClosingStockBalanceDto.includeUom());
        eClosingStockBalanceDao.setWarehouse(vClosingStockBalanceDto.warehouse());
        eClosingStockBalanceDao.setWarehouseType(vClosingStockBalanceDto.warehouseType());
        eClosingStockBalanceDao.setAmendedFrom(vClosingStockBalanceDto.amendedFrom());
        eClosingStockBalanceDao.setUserTags(vClosingStockBalanceDto.userTags());
        eClosingStockBalanceDao.setComments(vClosingStockBalanceDto.comments());
        eClosingStockBalanceDao.setAssign(vClosingStockBalanceDto.assign());
        eClosingStockBalanceDao.setLikedBy(vClosingStockBalanceDto.likedBy());
    }
}