package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingOrderItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SubcontractingOrderItemDto(
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
        String bom,
        Boolean includeExplodedItems,
        LocalDate scheduleDate,
        LocalDate expectedDeliveryDate,
        String description,
        String image,
        BigDecimal qty,
        BigDecimal receivedQty,
        BigDecimal returnedQty,
        String stockUom,
        BigDecimal conversionFactor,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal rmCostPerQty,
        BigDecimal serviceCostPerQty,
        BigDecimal additionalCostPerQty,
        String warehouse,
        String expenseAccount,
        String manufacturer,
        String manufacturerPartNo,
        String materialRequest,
        String materialRequestItem,
        String costCenter,
        String project,
        String purchaseOrderItem,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static SubcontractingOrderItemDto fromEntity(SubcontractingOrderItemDao eSubcontractingOrderItemDao) {
        return new SubcontractingOrderItemDto(
                eSubcontractingOrderItemDao.getName(),
                eSubcontractingOrderItemDao.getCreation(),
                eSubcontractingOrderItemDao.getModified(),
                eSubcontractingOrderItemDao.getModifiedBy(),
                eSubcontractingOrderItemDao.getOwner(),
                eSubcontractingOrderItemDao.getIsDocStatus(),
                eSubcontractingOrderItemDao.getIdx(),
                eSubcontractingOrderItemDao.getItemCode(),
                eSubcontractingOrderItemDao.getItemName(),
                eSubcontractingOrderItemDao.getBom(),
                eSubcontractingOrderItemDao.getIncludeExplodedItems(),
                eSubcontractingOrderItemDao.getScheduleDate(),
                eSubcontractingOrderItemDao.getExpectedDeliveryDate(),
                eSubcontractingOrderItemDao.getDescription(),
                eSubcontractingOrderItemDao.getImage(),
                eSubcontractingOrderItemDao.getQty(),
                eSubcontractingOrderItemDao.getReceivedQty(),
                eSubcontractingOrderItemDao.getReturnedQty(),
                eSubcontractingOrderItemDao.getStockUom(),
                eSubcontractingOrderItemDao.getConversionFactor(),
                eSubcontractingOrderItemDao.getRate(),
                eSubcontractingOrderItemDao.getAmount(),
                eSubcontractingOrderItemDao.getRmCostPerQty(),
                eSubcontractingOrderItemDao.getServiceCostPerQty(),
                eSubcontractingOrderItemDao.getAdditionalCostPerQty(),
                eSubcontractingOrderItemDao.getWarehouse(),
                eSubcontractingOrderItemDao.getExpenseAccount(),
                eSubcontractingOrderItemDao.getManufacturer(),
                eSubcontractingOrderItemDao.getManufacturerPartNo(),
                eSubcontractingOrderItemDao.getMaterialRequest(),
                eSubcontractingOrderItemDao.getMaterialRequestItem(),
                eSubcontractingOrderItemDao.getCostCenter(),
                eSubcontractingOrderItemDao.getProject(),
                eSubcontractingOrderItemDao.getPurchaseOrderItem(),
                eSubcontractingOrderItemDao.getPageBreak(),
                eSubcontractingOrderItemDao.getParent(),
                eSubcontractingOrderItemDao.getParentField(),
                eSubcontractingOrderItemDao.getParentType());
    }

    public static void fromDTO(SubcontractingOrderItemDto vSubcontractingOrderItemDto, SubcontractingOrderItemDao eSubcontractingOrderItemDao) {
        eSubcontractingOrderItemDao.setName(vSubcontractingOrderItemDto.name());
        eSubcontractingOrderItemDao.setCreation(vSubcontractingOrderItemDto.creation());
        eSubcontractingOrderItemDao.setModified(vSubcontractingOrderItemDto.modified());
        eSubcontractingOrderItemDao.setModifiedBy(vSubcontractingOrderItemDto.modifiedBy());
        eSubcontractingOrderItemDao.setOwner(vSubcontractingOrderItemDto.owner());
        eSubcontractingOrderItemDao.setIsDocStatus(vSubcontractingOrderItemDto.isDocStatus());
        eSubcontractingOrderItemDao.setIdx(vSubcontractingOrderItemDto.idx());
        eSubcontractingOrderItemDao.setItemCode(vSubcontractingOrderItemDto.itemCode());
        eSubcontractingOrderItemDao.setItemName(vSubcontractingOrderItemDto.itemName());
        eSubcontractingOrderItemDao.setBom(vSubcontractingOrderItemDto.bom());
        eSubcontractingOrderItemDao.setIncludeExplodedItems(vSubcontractingOrderItemDto.includeExplodedItems());
        eSubcontractingOrderItemDao.setScheduleDate(vSubcontractingOrderItemDto.scheduleDate());
        eSubcontractingOrderItemDao.setExpectedDeliveryDate(vSubcontractingOrderItemDto.expectedDeliveryDate());
        eSubcontractingOrderItemDao.setDescription(vSubcontractingOrderItemDto.description());
        eSubcontractingOrderItemDao.setImage(vSubcontractingOrderItemDto.image());
        eSubcontractingOrderItemDao.setQty(vSubcontractingOrderItemDto.qty());
        eSubcontractingOrderItemDao.setReceivedQty(vSubcontractingOrderItemDto.receivedQty());
        eSubcontractingOrderItemDao.setReturnedQty(vSubcontractingOrderItemDto.returnedQty());
        eSubcontractingOrderItemDao.setStockUom(vSubcontractingOrderItemDto.stockUom());
        eSubcontractingOrderItemDao.setConversionFactor(vSubcontractingOrderItemDto.conversionFactor());
        eSubcontractingOrderItemDao.setRate(vSubcontractingOrderItemDto.rate());
        eSubcontractingOrderItemDao.setAmount(vSubcontractingOrderItemDto.amount());
        eSubcontractingOrderItemDao.setRmCostPerQty(vSubcontractingOrderItemDto.rmCostPerQty());
        eSubcontractingOrderItemDao.setServiceCostPerQty(vSubcontractingOrderItemDto.serviceCostPerQty());
        eSubcontractingOrderItemDao.setAdditionalCostPerQty(vSubcontractingOrderItemDto.additionalCostPerQty());
        eSubcontractingOrderItemDao.setWarehouse(vSubcontractingOrderItemDto.warehouse());
        eSubcontractingOrderItemDao.setExpenseAccount(vSubcontractingOrderItemDto.expenseAccount());
        eSubcontractingOrderItemDao.setManufacturer(vSubcontractingOrderItemDto.manufacturer());
        eSubcontractingOrderItemDao.setManufacturerPartNo(vSubcontractingOrderItemDto.manufacturerPartNo());
        eSubcontractingOrderItemDao.setMaterialRequest(vSubcontractingOrderItemDto.materialRequest());
        eSubcontractingOrderItemDao.setMaterialRequestItem(vSubcontractingOrderItemDto.materialRequestItem());
        eSubcontractingOrderItemDao.setCostCenter(vSubcontractingOrderItemDto.costCenter());
        eSubcontractingOrderItemDao.setProject(vSubcontractingOrderItemDto.project());
        eSubcontractingOrderItemDao.setPurchaseOrderItem(vSubcontractingOrderItemDto.purchaseOrderItem());
        eSubcontractingOrderItemDao.setPageBreak(vSubcontractingOrderItemDto.pageBreak());
        eSubcontractingOrderItemDao.setParent(vSubcontractingOrderItemDto.parent());
        eSubcontractingOrderItemDao.setParentField(vSubcontractingOrderItemDto.parentField());
        eSubcontractingOrderItemDao.setParentType(vSubcontractingOrderItemDto.parentType());
    }
}