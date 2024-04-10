package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String item,
        String company,
        String uom,
        BigDecimal quantity,
        Boolean isActive,
        Boolean isDefault,
        Boolean allowAlternativeItem,
        Boolean setRateOfSubAssemblyItemBasedOnBom,
        String project,
        String image,
        String rmCostAsPer,
        String buyingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        String currency,
        BigDecimal conversionRate,
        Boolean withOperations,
        String transferMaterialAgainst,
        String routing,
        Boolean fgBasedOperatingCost,
        BigDecimal operatingCostPerBomQuantity,
        BigDecimal processLossPercentage,
        BigDecimal processLossQty,
        BigDecimal operatingCost,
        BigDecimal rawMaterialCost,
        BigDecimal scrapMaterialCost,
        BigDecimal baseOperatingCost,
        BigDecimal baseRawMaterialCost,
        BigDecimal baseScrapMaterialCost,
        BigDecimal totalCost,
        BigDecimal baseTotalCost,
        String itemName,
        String description,
        Boolean hasVariants,
        Boolean inspectionRequired,
        String qualityInspectionTemplate,
        Boolean showInWebsite,
        String route,
        String websiteImage,
        String thumbnail,
        Boolean showItems,
        Boolean showOperations,
        String webLongDescription,
        String bomCreator,
        String bomCreatorItem,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BomDto fromEntity(BomDao eBomDao) {
        return new BomDto(
                eBomDao.getName(),
                eBomDao.getCreation(),
                eBomDao.getModified(),
                eBomDao.getModifiedBy(),
                eBomDao.getOwner(),
                eBomDao.getIsDocStatus(),
                eBomDao.getIdx(),
                eBomDao.getItem(),
                eBomDao.getCompany(),
                eBomDao.getUom(),
                eBomDao.getQuantity(),
                eBomDao.getIsActive(),
                eBomDao.getIsDefault(),
                eBomDao.getAllowAlternativeItem(),
                eBomDao.getSetRateOfSubAssemblyItemBasedOnBom(),
                eBomDao.getProject(),
                eBomDao.getImage(),
                eBomDao.getRmCostAsPer(),
                eBomDao.getBuyingPriceList(),
                eBomDao.getPriceListCurrency(),
                eBomDao.getPlcConversionRate(),
                eBomDao.getCurrency(),
                eBomDao.getConversionRate(),
                eBomDao.getWithOperations(),
                eBomDao.getTransferMaterialAgainst(),
                eBomDao.getRouting(),
                eBomDao.getFgBasedOperatingCost(),
                eBomDao.getOperatingCostPerBomQuantity(),
                eBomDao.getProcessLossPercentage(),
                eBomDao.getProcessLossQty(),
                eBomDao.getOperatingCost(),
                eBomDao.getRawMaterialCost(),
                eBomDao.getScrapMaterialCost(),
                eBomDao.getBaseOperatingCost(),
                eBomDao.getBaseRawMaterialCost(),
                eBomDao.getBaseScrapMaterialCost(),
                eBomDao.getTotalCost(),
                eBomDao.getBaseTotalCost(),
                eBomDao.getItemName(),
                eBomDao.getDescription(),
                eBomDao.getHasVariants(),
                eBomDao.getInspectionRequired(),
                eBomDao.getQualityInspectionTemplate(),
                eBomDao.getShowInWebsite(),
                eBomDao.getRoute(),
                eBomDao.getWebsiteImage(),
                eBomDao.getThumbnail(),
                eBomDao.getShowItems(),
                eBomDao.getShowOperations(),
                eBomDao.getWebLongDescription(),
                eBomDao.getBomCreator(),
                eBomDao.getBomCreatorItem(),
                eBomDao.getAmendedFrom(),
                eBomDao.getUserTags(),
                eBomDao.getComments(),
                eBomDao.getAssign(),
                eBomDao.getLikedBy());
    }

    public static void fromDTO(BomDto vBomDto, BomDao eBomDao) {
        eBomDao.setName(vBomDto.name());
        eBomDao.setCreation(vBomDto.creation());
        eBomDao.setModified(vBomDto.modified());
        eBomDao.setModifiedBy(vBomDto.modifiedBy());
        eBomDao.setOwner(vBomDto.owner());
        eBomDao.setIsDocStatus(vBomDto.isDocStatus());
        eBomDao.setIdx(vBomDto.idx());
        eBomDao.setItem(vBomDto.item());
        eBomDao.setCompany(vBomDto.company());
        eBomDao.setUom(vBomDto.uom());
        eBomDao.setQuantity(vBomDto.quantity());
        eBomDao.setIsActive(vBomDto.isActive());
        eBomDao.setIsDefault(vBomDto.isDefault());
        eBomDao.setAllowAlternativeItem(vBomDto.allowAlternativeItem());
        eBomDao.setSetRateOfSubAssemblyItemBasedOnBom(vBomDto.setRateOfSubAssemblyItemBasedOnBom());
        eBomDao.setProject(vBomDto.project());
        eBomDao.setImage(vBomDto.image());
        eBomDao.setRmCostAsPer(vBomDto.rmCostAsPer());
        eBomDao.setBuyingPriceList(vBomDto.buyingPriceList());
        eBomDao.setPriceListCurrency(vBomDto.priceListCurrency());
        eBomDao.setPlcConversionRate(vBomDto.plcConversionRate());
        eBomDao.setCurrency(vBomDto.currency());
        eBomDao.setConversionRate(vBomDto.conversionRate());
        eBomDao.setWithOperations(vBomDto.withOperations());
        eBomDao.setTransferMaterialAgainst(vBomDto.transferMaterialAgainst());
        eBomDao.setRouting(vBomDto.routing());
        eBomDao.setFgBasedOperatingCost(vBomDto.fgBasedOperatingCost());
        eBomDao.setOperatingCostPerBomQuantity(vBomDto.operatingCostPerBomQuantity());
        eBomDao.setProcessLossPercentage(vBomDto.processLossPercentage());
        eBomDao.setProcessLossQty(vBomDto.processLossQty());
        eBomDao.setOperatingCost(vBomDto.operatingCost());
        eBomDao.setRawMaterialCost(vBomDto.rawMaterialCost());
        eBomDao.setScrapMaterialCost(vBomDto.scrapMaterialCost());
        eBomDao.setBaseOperatingCost(vBomDto.baseOperatingCost());
        eBomDao.setBaseRawMaterialCost(vBomDto.baseRawMaterialCost());
        eBomDao.setBaseScrapMaterialCost(vBomDto.baseScrapMaterialCost());
        eBomDao.setTotalCost(vBomDto.totalCost());
        eBomDao.setBaseTotalCost(vBomDto.baseTotalCost());
        eBomDao.setItemName(vBomDto.itemName());
        eBomDao.setDescription(vBomDto.description());
        eBomDao.setHasVariants(vBomDto.hasVariants());
        eBomDao.setInspectionRequired(vBomDto.inspectionRequired());
        eBomDao.setQualityInspectionTemplate(vBomDto.qualityInspectionTemplate());
        eBomDao.setShowInWebsite(vBomDto.showInWebsite());
        eBomDao.setRoute(vBomDto.route());
        eBomDao.setWebsiteImage(vBomDto.websiteImage());
        eBomDao.setThumbnail(vBomDto.thumbnail());
        eBomDao.setShowItems(vBomDto.showItems());
        eBomDao.setShowOperations(vBomDto.showOperations());
        eBomDao.setWebLongDescription(vBomDto.webLongDescription());
        eBomDao.setBomCreator(vBomDto.bomCreator());
        eBomDao.setBomCreatorItem(vBomDto.bomCreatorItem());
        eBomDao.setAmendedFrom(vBomDto.amendedFrom());
        eBomDao.setUserTags(vBomDto.userTags());
        eBomDao.setComments(vBomDto.comments());
        eBomDao.setAssign(vBomDto.assign());
        eBomDao.setLikedBy(vBomDto.likedBy());
    }
}