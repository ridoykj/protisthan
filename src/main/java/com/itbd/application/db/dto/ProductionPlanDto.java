package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProductionPlanDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProductionPlanDto(
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
        String getItemsFrom,
        LocalDate postingDate,
        String itemCode,
        String customer,
        String warehouse,
        String project,
        String salesOrderStatus,
        LocalDate fromDate,
        LocalDate toDate,
        LocalDate fromDeliveryDate,
        LocalDate toDeliveryDate,
        Boolean combineItems,
        Boolean combineSubItems,
        String subAssemblyWarehouse,
        Boolean skipAvailableSubAssemblyItem,
        Boolean includeNonStockItems,
        Boolean includeSubcontractedItems,
        Boolean considerMinimumOrderQty,
        Boolean includeSafetyStock,
        Boolean ignoreExistingOrderedQty,
        String forWarehouse,
        BigDecimal totalPlannedQty,
        BigDecimal totalProducedQty,
        String status,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProductionPlanDto fromEntity(ProductionPlanDao eProductionPlanDao) {
        return new ProductionPlanDto(
                eProductionPlanDao.getName(),
                eProductionPlanDao.getCreation(),
                eProductionPlanDao.getModified(),
                eProductionPlanDao.getModifiedBy(),
                eProductionPlanDao.getOwner(),
                eProductionPlanDao.getIsDocStatus(),
                eProductionPlanDao.getIdx(),
                eProductionPlanDao.getNamingSeries(),
                eProductionPlanDao.getCompany(),
                eProductionPlanDao.getGetItemsFrom(),
                eProductionPlanDao.getPostingDate(),
                eProductionPlanDao.getItemCode(),
                eProductionPlanDao.getCustomer(),
                eProductionPlanDao.getWarehouse(),
                eProductionPlanDao.getProject(),
                eProductionPlanDao.getSalesOrderStatus(),
                eProductionPlanDao.getFromDate(),
                eProductionPlanDao.getToDate(),
                eProductionPlanDao.getFromDeliveryDate(),
                eProductionPlanDao.getToDeliveryDate(),
                eProductionPlanDao.getCombineItems(),
                eProductionPlanDao.getCombineSubItems(),
                eProductionPlanDao.getSubAssemblyWarehouse(),
                eProductionPlanDao.getSkipAvailableSubAssemblyItem(),
                eProductionPlanDao.getIncludeNonStockItems(),
                eProductionPlanDao.getIncludeSubcontractedItems(),
                eProductionPlanDao.getConsiderMinimumOrderQty(),
                eProductionPlanDao.getIncludeSafetyStock(),
                eProductionPlanDao.getIgnoreExistingOrderedQty(),
                eProductionPlanDao.getForWarehouse(),
                eProductionPlanDao.getTotalPlannedQty(),
                eProductionPlanDao.getTotalProducedQty(),
                eProductionPlanDao.getStatus(),
                eProductionPlanDao.getAmendedFrom(),
                eProductionPlanDao.getUserTags(),
                eProductionPlanDao.getComments(),
                eProductionPlanDao.getAssign(),
                eProductionPlanDao.getLikedBy());
    }

    public static void fromDTO(ProductionPlanDto vProductionPlanDto, ProductionPlanDao eProductionPlanDao) {
        eProductionPlanDao.setName(vProductionPlanDto.name());
        eProductionPlanDao.setCreation(vProductionPlanDto.creation());
        eProductionPlanDao.setModified(vProductionPlanDto.modified());
        eProductionPlanDao.setModifiedBy(vProductionPlanDto.modifiedBy());
        eProductionPlanDao.setOwner(vProductionPlanDto.owner());
        eProductionPlanDao.setIsDocStatus(vProductionPlanDto.isDocStatus());
        eProductionPlanDao.setIdx(vProductionPlanDto.idx());
        eProductionPlanDao.setNamingSeries(vProductionPlanDto.namingSeries());
        eProductionPlanDao.setCompany(vProductionPlanDto.company());
        eProductionPlanDao.setGetItemsFrom(vProductionPlanDto.getItemsFrom());
        eProductionPlanDao.setPostingDate(vProductionPlanDto.postingDate());
        eProductionPlanDao.setItemCode(vProductionPlanDto.itemCode());
        eProductionPlanDao.setCustomer(vProductionPlanDto.customer());
        eProductionPlanDao.setWarehouse(vProductionPlanDto.warehouse());
        eProductionPlanDao.setProject(vProductionPlanDto.project());
        eProductionPlanDao.setSalesOrderStatus(vProductionPlanDto.salesOrderStatus());
        eProductionPlanDao.setFromDate(vProductionPlanDto.fromDate());
        eProductionPlanDao.setToDate(vProductionPlanDto.toDate());
        eProductionPlanDao.setFromDeliveryDate(vProductionPlanDto.fromDeliveryDate());
        eProductionPlanDao.setToDeliveryDate(vProductionPlanDto.toDeliveryDate());
        eProductionPlanDao.setCombineItems(vProductionPlanDto.combineItems());
        eProductionPlanDao.setCombineSubItems(vProductionPlanDto.combineSubItems());
        eProductionPlanDao.setSubAssemblyWarehouse(vProductionPlanDto.subAssemblyWarehouse());
        eProductionPlanDao.setSkipAvailableSubAssemblyItem(vProductionPlanDto.skipAvailableSubAssemblyItem());
        eProductionPlanDao.setIncludeNonStockItems(vProductionPlanDto.includeNonStockItems());
        eProductionPlanDao.setIncludeSubcontractedItems(vProductionPlanDto.includeSubcontractedItems());
        eProductionPlanDao.setConsiderMinimumOrderQty(vProductionPlanDto.considerMinimumOrderQty());
        eProductionPlanDao.setIncludeSafetyStock(vProductionPlanDto.includeSafetyStock());
        eProductionPlanDao.setIgnoreExistingOrderedQty(vProductionPlanDto.ignoreExistingOrderedQty());
        eProductionPlanDao.setForWarehouse(vProductionPlanDto.forWarehouse());
        eProductionPlanDao.setTotalPlannedQty(vProductionPlanDto.totalPlannedQty());
        eProductionPlanDao.setTotalProducedQty(vProductionPlanDto.totalProducedQty());
        eProductionPlanDao.setStatus(vProductionPlanDto.status());
        eProductionPlanDao.setAmendedFrom(vProductionPlanDto.amendedFrom());
        eProductionPlanDao.setUserTags(vProductionPlanDto.userTags());
        eProductionPlanDao.setComments(vProductionPlanDto.comments());
        eProductionPlanDao.setAssign(vProductionPlanDto.assign());
        eProductionPlanDao.setLikedBy(vProductionPlanDto.likedBy());
    }
}