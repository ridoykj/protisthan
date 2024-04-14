package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetCapitalizationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record AssetCapitalizationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String company,
        String namingSeries,
        String entryType,
        String targetItemName,
        Boolean targetIsFixedAsset,
        Boolean targetHasBatchNo,
        Boolean targetHasSerialNo,
        String capitalizationMethod,
        String targetItemCode,
        String targetAssetLocation,
        String targetAsset,
        String targetAssetName,
        String targetWarehouse,
        BigDecimal targetQty,
        String targetStockUom,
        String targetBatchNo,
        String targetSerialNo,
        String financeBook,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        String amendedFrom,
        BigDecimal stockItemsTotal,
        BigDecimal assetItemsTotal,
        BigDecimal serviceItemsTotal,
        BigDecimal totalValue,
        BigDecimal targetIncomingRate,
        String costCenter,
        String targetFixedAssetAccount,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static AssetCapitalizationDto fromEntity(AssetCapitalizationDao eAssetCapitalizationDao) {
        return new AssetCapitalizationDto(
                eAssetCapitalizationDao.getName(),
                eAssetCapitalizationDao.getCreation(),
                eAssetCapitalizationDao.getModified(),
                eAssetCapitalizationDao.getModifiedBy(),
                eAssetCapitalizationDao.getOwner(),
                eAssetCapitalizationDao.getIsDocStatus(),
                eAssetCapitalizationDao.getIdx(),
                eAssetCapitalizationDao.getTitle(),
                eAssetCapitalizationDao.getCompany(),
                eAssetCapitalizationDao.getNamingSeries(),
                eAssetCapitalizationDao.getEntryType(),
                eAssetCapitalizationDao.getTargetItemName(),
                eAssetCapitalizationDao.getTargetIsFixedAsset(),
                eAssetCapitalizationDao.getTargetHasBatchNo(),
                eAssetCapitalizationDao.getTargetHasSerialNo(),
                eAssetCapitalizationDao.getCapitalizationMethod(),
                eAssetCapitalizationDao.getTargetItemCode(),
                eAssetCapitalizationDao.getTargetAssetLocation(),
                eAssetCapitalizationDao.getTargetAsset(),
                eAssetCapitalizationDao.getTargetAssetName(),
                eAssetCapitalizationDao.getTargetWarehouse(),
                eAssetCapitalizationDao.getTargetQty(),
                eAssetCapitalizationDao.getTargetStockUom(),
                eAssetCapitalizationDao.getTargetBatchNo(),
                eAssetCapitalizationDao.getTargetSerialNo(),
                eAssetCapitalizationDao.getFinanceBook(),
                eAssetCapitalizationDao.getPostingDate(),
                eAssetCapitalizationDao.getPostingTime(),
                eAssetCapitalizationDao.getSetPostingTime(),
                eAssetCapitalizationDao.getAmendedFrom(),
                eAssetCapitalizationDao.getStockItemsTotal(),
                eAssetCapitalizationDao.getAssetItemsTotal(),
                eAssetCapitalizationDao.getServiceItemsTotal(),
                eAssetCapitalizationDao.getTotalValue(),
                eAssetCapitalizationDao.getTargetIncomingRate(),
                eAssetCapitalizationDao.getCostCenter(),
                eAssetCapitalizationDao.getTargetFixedAssetAccount(),
                eAssetCapitalizationDao.getUserTags(),
                eAssetCapitalizationDao.getComments(),
                eAssetCapitalizationDao.getAssign(),
                eAssetCapitalizationDao.getLikedBy(),
                eAssetCapitalizationDao.getSeen());
    }

    public static void fromDTO(AssetCapitalizationDto vAssetCapitalizationDto, AssetCapitalizationDao eAssetCapitalizationDao) {
        eAssetCapitalizationDao.setName(vAssetCapitalizationDto.name());
        eAssetCapitalizationDao.setCreation(vAssetCapitalizationDto.creation());
        eAssetCapitalizationDao.setModified(vAssetCapitalizationDto.modified());
        eAssetCapitalizationDao.setModifiedBy(vAssetCapitalizationDto.modifiedBy());
        eAssetCapitalizationDao.setOwner(vAssetCapitalizationDto.owner());
        eAssetCapitalizationDao.setIsDocStatus(vAssetCapitalizationDto.isDocStatus());
        eAssetCapitalizationDao.setIdx(vAssetCapitalizationDto.idx());
        eAssetCapitalizationDao.setTitle(vAssetCapitalizationDto.title());
        eAssetCapitalizationDao.setCompany(vAssetCapitalizationDto.company());
        eAssetCapitalizationDao.setNamingSeries(vAssetCapitalizationDto.namingSeries());
        eAssetCapitalizationDao.setEntryType(vAssetCapitalizationDto.entryType());
        eAssetCapitalizationDao.setTargetItemName(vAssetCapitalizationDto.targetItemName());
        eAssetCapitalizationDao.setTargetIsFixedAsset(vAssetCapitalizationDto.targetIsFixedAsset());
        eAssetCapitalizationDao.setTargetHasBatchNo(vAssetCapitalizationDto.targetHasBatchNo());
        eAssetCapitalizationDao.setTargetHasSerialNo(vAssetCapitalizationDto.targetHasSerialNo());
        eAssetCapitalizationDao.setCapitalizationMethod(vAssetCapitalizationDto.capitalizationMethod());
        eAssetCapitalizationDao.setTargetItemCode(vAssetCapitalizationDto.targetItemCode());
        eAssetCapitalizationDao.setTargetAssetLocation(vAssetCapitalizationDto.targetAssetLocation());
        eAssetCapitalizationDao.setTargetAsset(vAssetCapitalizationDto.targetAsset());
        eAssetCapitalizationDao.setTargetAssetName(vAssetCapitalizationDto.targetAssetName());
        eAssetCapitalizationDao.setTargetWarehouse(vAssetCapitalizationDto.targetWarehouse());
        eAssetCapitalizationDao.setTargetQty(vAssetCapitalizationDto.targetQty());
        eAssetCapitalizationDao.setTargetStockUom(vAssetCapitalizationDto.targetStockUom());
        eAssetCapitalizationDao.setTargetBatchNo(vAssetCapitalizationDto.targetBatchNo());
        eAssetCapitalizationDao.setTargetSerialNo(vAssetCapitalizationDto.targetSerialNo());
        eAssetCapitalizationDao.setFinanceBook(vAssetCapitalizationDto.financeBook());
        eAssetCapitalizationDao.setPostingDate(vAssetCapitalizationDto.postingDate());
        eAssetCapitalizationDao.setPostingTime(vAssetCapitalizationDto.postingTime());
        eAssetCapitalizationDao.setSetPostingTime(vAssetCapitalizationDto.setPostingTime());
        eAssetCapitalizationDao.setAmendedFrom(vAssetCapitalizationDto.amendedFrom());
        eAssetCapitalizationDao.setStockItemsTotal(vAssetCapitalizationDto.stockItemsTotal());
        eAssetCapitalizationDao.setAssetItemsTotal(vAssetCapitalizationDto.assetItemsTotal());
        eAssetCapitalizationDao.setServiceItemsTotal(vAssetCapitalizationDto.serviceItemsTotal());
        eAssetCapitalizationDao.setTotalValue(vAssetCapitalizationDto.totalValue());
        eAssetCapitalizationDao.setTargetIncomingRate(vAssetCapitalizationDto.targetIncomingRate());
        eAssetCapitalizationDao.setCostCenter(vAssetCapitalizationDto.costCenter());
        eAssetCapitalizationDao.setTargetFixedAssetAccount(vAssetCapitalizationDto.targetFixedAssetAccount());
        eAssetCapitalizationDao.setUserTags(vAssetCapitalizationDto.userTags());
        eAssetCapitalizationDao.setComments(vAssetCapitalizationDto.comments());
        eAssetCapitalizationDao.setAssign(vAssetCapitalizationDto.assign());
        eAssetCapitalizationDao.setLikedBy(vAssetCapitalizationDto.likedBy());
        eAssetCapitalizationDao.setSeen(vAssetCapitalizationDto.seen());
    }
}