package com.itbd.application.db.dto.materials;

import com.itbd.application.db.dao.stock.MaterialRequestItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record MaterialRequestItemDto(
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
        LocalDate scheduleDate,
        String description,
        String itemGroup,
        String brand,
        String image,
        BigDecimal qty,
        String stockUom,
        String fromWarehouse,
        String warehouse,
        String uom,
        BigDecimal conversionFactor,
        BigDecimal stockQty,
        BigDecimal minOrderQty,
        BigDecimal projectedQty,
        BigDecimal actualQty,
        BigDecimal orderedQty,
        BigDecimal receivedQty,
        BigDecimal rate,
        BigDecimal priceListRate,
        BigDecimal amount,
        String expenseAccount,
        String wipCompositeAsset,
        String manufacturer,
        String manufacturerPartNo,
        String bomNo,
        String project,
        String costCenter,
        LocalDate leadTimeDate,
        String salesOrder,
        String salesOrderItem,
        String productionPlan,
        String materialRequestPlanItem,
        String jobCardItem,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static MaterialRequestItemDto fromEntity(MaterialRequestItemDao eMaterialRequestItemDao) {
        return new MaterialRequestItemDto(
                eMaterialRequestItemDao.getName(),
                eMaterialRequestItemDao.getCreation(),
                eMaterialRequestItemDao.getModified(),
                eMaterialRequestItemDao.getModifiedBy(),
                eMaterialRequestItemDao.getOwner(),
                eMaterialRequestItemDao.getIsDocStatus(),
                eMaterialRequestItemDao.getIdx(),
                eMaterialRequestItemDao.getItemCode(),
                eMaterialRequestItemDao.getItemName(),
                eMaterialRequestItemDao.getScheduleDate(),
                eMaterialRequestItemDao.getDescription(),
                eMaterialRequestItemDao.getItemGroup(),
                eMaterialRequestItemDao.getBrand(),
                eMaterialRequestItemDao.getImage(),
                eMaterialRequestItemDao.getQty(),
                eMaterialRequestItemDao.getStockUom(),
                eMaterialRequestItemDao.getFromWarehouse(),
                eMaterialRequestItemDao.getWarehouse(),
                eMaterialRequestItemDao.getUom(),
                eMaterialRequestItemDao.getConversionFactor(),
                eMaterialRequestItemDao.getStockQty(),
                eMaterialRequestItemDao.getMinOrderQty(),
                eMaterialRequestItemDao.getProjectedQty(),
                eMaterialRequestItemDao.getActualQty(),
                eMaterialRequestItemDao.getOrderedQty(),
                eMaterialRequestItemDao.getReceivedQty(),
                eMaterialRequestItemDao.getRate(),
                eMaterialRequestItemDao.getPriceListRate(),
                eMaterialRequestItemDao.getAmount(),
                eMaterialRequestItemDao.getExpenseAccount(),
                eMaterialRequestItemDao.getWipCompositeAsset(),
                eMaterialRequestItemDao.getManufacturer(),
                eMaterialRequestItemDao.getManufacturerPartNo(),
                eMaterialRequestItemDao.getBomNo(),
                eMaterialRequestItemDao.getProject(),
                eMaterialRequestItemDao.getCostCenter(),
                eMaterialRequestItemDao.getLeadTimeDate(),
                eMaterialRequestItemDao.getSalesOrder(),
                eMaterialRequestItemDao.getSalesOrderItem(),
                eMaterialRequestItemDao.getProductionPlan(),
                eMaterialRequestItemDao.getMaterialRequestPlanItem(),
                eMaterialRequestItemDao.getJobCardItem(),
                eMaterialRequestItemDao.getPageBreak(),
                eMaterialRequestItemDao.getParent(),
                eMaterialRequestItemDao.getParentField(),
                eMaterialRequestItemDao.getParentType());
    }

    public static void fromDTO(MaterialRequestItemDto vMaterialRequestItemDto, MaterialRequestItemDao eMaterialRequestItemDao) {
        eMaterialRequestItemDao.setName(vMaterialRequestItemDto.name());
        eMaterialRequestItemDao.setCreation(vMaterialRequestItemDto.creation());
        eMaterialRequestItemDao.setModified(vMaterialRequestItemDto.modified());
        eMaterialRequestItemDao.setModifiedBy(vMaterialRequestItemDto.modifiedBy());
        eMaterialRequestItemDao.setOwner(vMaterialRequestItemDto.owner());
        eMaterialRequestItemDao.setIsDocStatus(vMaterialRequestItemDto.isDocStatus());
        eMaterialRequestItemDao.setIdx(vMaterialRequestItemDto.idx());
        eMaterialRequestItemDao.setItemCode(vMaterialRequestItemDto.itemCode());
        eMaterialRequestItemDao.setItemName(vMaterialRequestItemDto.itemName());
        eMaterialRequestItemDao.setScheduleDate(vMaterialRequestItemDto.scheduleDate());
        eMaterialRequestItemDao.setDescription(vMaterialRequestItemDto.description());
        eMaterialRequestItemDao.setItemGroup(vMaterialRequestItemDto.itemGroup());
        eMaterialRequestItemDao.setBrand(vMaterialRequestItemDto.brand());
        eMaterialRequestItemDao.setImage(vMaterialRequestItemDto.image());
        eMaterialRequestItemDao.setQty(vMaterialRequestItemDto.qty());
        eMaterialRequestItemDao.setStockUom(vMaterialRequestItemDto.stockUom());
        eMaterialRequestItemDao.setFromWarehouse(vMaterialRequestItemDto.fromWarehouse());
        eMaterialRequestItemDao.setWarehouse(vMaterialRequestItemDto.warehouse());
        eMaterialRequestItemDao.setUom(vMaterialRequestItemDto.uom());
        eMaterialRequestItemDao.setConversionFactor(vMaterialRequestItemDto.conversionFactor());
        eMaterialRequestItemDao.setStockQty(vMaterialRequestItemDto.stockQty());
        eMaterialRequestItemDao.setMinOrderQty(vMaterialRequestItemDto.minOrderQty());
        eMaterialRequestItemDao.setProjectedQty(vMaterialRequestItemDto.projectedQty());
        eMaterialRequestItemDao.setActualQty(vMaterialRequestItemDto.actualQty());
        eMaterialRequestItemDao.setOrderedQty(vMaterialRequestItemDto.orderedQty());
        eMaterialRequestItemDao.setReceivedQty(vMaterialRequestItemDto.receivedQty());
        eMaterialRequestItemDao.setRate(vMaterialRequestItemDto.rate());
        eMaterialRequestItemDao.setPriceListRate(vMaterialRequestItemDto.priceListRate());
        eMaterialRequestItemDao.setAmount(vMaterialRequestItemDto.amount());
        eMaterialRequestItemDao.setExpenseAccount(vMaterialRequestItemDto.expenseAccount());
        eMaterialRequestItemDao.setWipCompositeAsset(vMaterialRequestItemDto.wipCompositeAsset());
        eMaterialRequestItemDao.setManufacturer(vMaterialRequestItemDto.manufacturer());
        eMaterialRequestItemDao.setManufacturerPartNo(vMaterialRequestItemDto.manufacturerPartNo());
        eMaterialRequestItemDao.setBomNo(vMaterialRequestItemDto.bomNo());
        eMaterialRequestItemDao.setProject(vMaterialRequestItemDto.project());
        eMaterialRequestItemDao.setCostCenter(vMaterialRequestItemDto.costCenter());
        eMaterialRequestItemDao.setLeadTimeDate(vMaterialRequestItemDto.leadTimeDate());
        eMaterialRequestItemDao.setSalesOrder(vMaterialRequestItemDto.salesOrder());
        eMaterialRequestItemDao.setSalesOrderItem(vMaterialRequestItemDto.salesOrderItem());
        eMaterialRequestItemDao.setProductionPlan(vMaterialRequestItemDto.productionPlan());
        eMaterialRequestItemDao.setMaterialRequestPlanItem(vMaterialRequestItemDto.materialRequestPlanItem());
        eMaterialRequestItemDao.setJobCardItem(vMaterialRequestItemDto.jobCardItem());
        eMaterialRequestItemDao.setPageBreak(vMaterialRequestItemDto.pageBreak());
        eMaterialRequestItemDao.setParent(vMaterialRequestItemDto.parent());
        eMaterialRequestItemDao.setParentField(vMaterialRequestItemDto.parentField());
        eMaterialRequestItemDao.setParentType(vMaterialRequestItemDto.parentType());
    }
}