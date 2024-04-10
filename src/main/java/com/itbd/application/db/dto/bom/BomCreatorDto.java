package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomCreatorDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomCreatorDto(
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
        String itemGroup,
        BigDecimal qty,
        String project,
        String uom,
        String rmCostAsPer,
        Boolean setRateBasedOnWarehouse,
        String buyingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        String currency,
        BigDecimal conversionRate,
        String defaultWarehouse,
        String company,
        BigDecimal rawMaterialCost,
        String remarks,
        String status,
        String errorLog,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BomCreatorDto fromEntity(BomCreatorDao eBomCreatorDao) {
        return new BomCreatorDto(
                eBomCreatorDao.getName(),
                eBomCreatorDao.getCreation(),
                eBomCreatorDao.getModified(),
                eBomCreatorDao.getModifiedBy(),
                eBomCreatorDao.getOwner(),
                eBomCreatorDao.getIsDocStatus(),
                eBomCreatorDao.getIdx(),
                eBomCreatorDao.getItemCode(),
                eBomCreatorDao.getItemName(),
                eBomCreatorDao.getItemGroup(),
                eBomCreatorDao.getQty(),
                eBomCreatorDao.getProject(),
                eBomCreatorDao.getUom(),
                eBomCreatorDao.getRmCostAsPer(),
                eBomCreatorDao.getSetRateBasedOnWarehouse(),
                eBomCreatorDao.getBuyingPriceList(),
                eBomCreatorDao.getPriceListCurrency(),
                eBomCreatorDao.getPlcConversionRate(),
                eBomCreatorDao.getCurrency(),
                eBomCreatorDao.getConversionRate(),
                eBomCreatorDao.getDefaultWarehouse(),
                eBomCreatorDao.getCompany(),
                eBomCreatorDao.getRawMaterialCost(),
                eBomCreatorDao.getRemarks(),
                eBomCreatorDao.getStatus(),
                eBomCreatorDao.getErrorLog(),
                eBomCreatorDao.getAmendedFrom(),
                eBomCreatorDao.getUserTags(),
                eBomCreatorDao.getComments(),
                eBomCreatorDao.getAssign(),
                eBomCreatorDao.getLikedBy());
    }

    public static void fromDTO(BomCreatorDto vBomCreatorDto, BomCreatorDao eBomCreatorDao) {
        eBomCreatorDao.setName(vBomCreatorDto.name());
        eBomCreatorDao.setCreation(vBomCreatorDto.creation());
        eBomCreatorDao.setModified(vBomCreatorDto.modified());
        eBomCreatorDao.setModifiedBy(vBomCreatorDto.modifiedBy());
        eBomCreatorDao.setOwner(vBomCreatorDto.owner());
        eBomCreatorDao.setIsDocStatus(vBomCreatorDto.isDocStatus());
        eBomCreatorDao.setIdx(vBomCreatorDto.idx());
        eBomCreatorDao.setItemCode(vBomCreatorDto.itemCode());
        eBomCreatorDao.setItemName(vBomCreatorDto.itemName());
        eBomCreatorDao.setItemGroup(vBomCreatorDto.itemGroup());
        eBomCreatorDao.setQty(vBomCreatorDto.qty());
        eBomCreatorDao.setProject(vBomCreatorDto.project());
        eBomCreatorDao.setUom(vBomCreatorDto.uom());
        eBomCreatorDao.setRmCostAsPer(vBomCreatorDto.rmCostAsPer());
        eBomCreatorDao.setSetRateBasedOnWarehouse(vBomCreatorDto.setRateBasedOnWarehouse());
        eBomCreatorDao.setBuyingPriceList(vBomCreatorDto.buyingPriceList());
        eBomCreatorDao.setPriceListCurrency(vBomCreatorDto.priceListCurrency());
        eBomCreatorDao.setPlcConversionRate(vBomCreatorDto.plcConversionRate());
        eBomCreatorDao.setCurrency(vBomCreatorDto.currency());
        eBomCreatorDao.setConversionRate(vBomCreatorDto.conversionRate());
        eBomCreatorDao.setDefaultWarehouse(vBomCreatorDto.defaultWarehouse());
        eBomCreatorDao.setCompany(vBomCreatorDto.company());
        eBomCreatorDao.setRawMaterialCost(vBomCreatorDto.rawMaterialCost());
        eBomCreatorDao.setRemarks(vBomCreatorDto.remarks());
        eBomCreatorDao.setStatus(vBomCreatorDto.status());
        eBomCreatorDao.setErrorLog(vBomCreatorDto.errorLog());
        eBomCreatorDao.setAmendedFrom(vBomCreatorDto.amendedFrom());
        eBomCreatorDao.setUserTags(vBomCreatorDto.userTags());
        eBomCreatorDao.setComments(vBomCreatorDto.comments());
        eBomCreatorDao.setAssign(vBomCreatorDto.assign());
        eBomCreatorDao.setLikedBy(vBomCreatorDto.likedBy());
    }
}