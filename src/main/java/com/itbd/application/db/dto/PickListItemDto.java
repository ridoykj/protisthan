package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PickListItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PickListItemDto(
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
        String description,
        String itemGroup,
        String warehouse,
        BigDecimal qty,
        BigDecimal stockQty,
        BigDecimal pickedQty,
        BigDecimal stockReservedQty,
        String uom,
        BigDecimal conversionFactor,
        String stockUom,
        String serialAndBatchBundle,
        Boolean useSerialBatchFields,
        String serialNo,
        String batchNo,
        String salesOrder,
        String salesOrderItem,
        String productBundleItem,
        String materialRequest,
        String materialRequestItem,
        String parent,
        String parentField,
        String parentType
) {
    public static PickListItemDto fromEntity(PickListItemDao ePickListItemDao) {
        return new PickListItemDto(
                ePickListItemDao.getName(),
                ePickListItemDao.getCreation(),
                ePickListItemDao.getModified(),
                ePickListItemDao.getModifiedBy(),
                ePickListItemDao.getOwner(),
                ePickListItemDao.getIsDocStatus(),
                ePickListItemDao.getIdx(),
                ePickListItemDao.getItemCode(),
                ePickListItemDao.getItemName(),
                ePickListItemDao.getDescription(),
                ePickListItemDao.getItemGroup(),
                ePickListItemDao.getWarehouse(),
                ePickListItemDao.getQty(),
                ePickListItemDao.getStockQty(),
                ePickListItemDao.getPickedQty(),
                ePickListItemDao.getStockReservedQty(),
                ePickListItemDao.getUom(),
                ePickListItemDao.getConversionFactor(),
                ePickListItemDao.getStockUom(),
                ePickListItemDao.getSerialAndBatchBundle(),
                ePickListItemDao.getUseSerialBatchFields(),
                ePickListItemDao.getSerialNo(),
                ePickListItemDao.getBatchNo(),
                ePickListItemDao.getSalesOrder(),
                ePickListItemDao.getSalesOrderItem(),
                ePickListItemDao.getProductBundleItem(),
                ePickListItemDao.getMaterialRequest(),
                ePickListItemDao.getMaterialRequestItem(),
                ePickListItemDao.getParent(),
                ePickListItemDao.getParentField(),
                ePickListItemDao.getParentType());
    }

    public static void fromDTO(PickListItemDto vPickListItemDto, PickListItemDao ePickListItemDao) {
        ePickListItemDao.setName(vPickListItemDto.name());
        ePickListItemDao.setCreation(vPickListItemDto.creation());
        ePickListItemDao.setModified(vPickListItemDto.modified());
        ePickListItemDao.setModifiedBy(vPickListItemDto.modifiedBy());
        ePickListItemDao.setOwner(vPickListItemDto.owner());
        ePickListItemDao.setIsDocStatus(vPickListItemDto.isDocStatus());
        ePickListItemDao.setIdx(vPickListItemDto.idx());
        ePickListItemDao.setItemCode(vPickListItemDto.itemCode());
        ePickListItemDao.setItemName(vPickListItemDto.itemName());
        ePickListItemDao.setDescription(vPickListItemDto.description());
        ePickListItemDao.setItemGroup(vPickListItemDto.itemGroup());
        ePickListItemDao.setWarehouse(vPickListItemDto.warehouse());
        ePickListItemDao.setQty(vPickListItemDto.qty());
        ePickListItemDao.setStockQty(vPickListItemDto.stockQty());
        ePickListItemDao.setPickedQty(vPickListItemDto.pickedQty());
        ePickListItemDao.setStockReservedQty(vPickListItemDto.stockReservedQty());
        ePickListItemDao.setUom(vPickListItemDto.uom());
        ePickListItemDao.setConversionFactor(vPickListItemDto.conversionFactor());
        ePickListItemDao.setStockUom(vPickListItemDto.stockUom());
        ePickListItemDao.setSerialAndBatchBundle(vPickListItemDto.serialAndBatchBundle());
        ePickListItemDao.setUseSerialBatchFields(vPickListItemDto.useSerialBatchFields());
        ePickListItemDao.setSerialNo(vPickListItemDto.serialNo());
        ePickListItemDao.setBatchNo(vPickListItemDto.batchNo());
        ePickListItemDao.setSalesOrder(vPickListItemDto.salesOrder());
        ePickListItemDao.setSalesOrderItem(vPickListItemDto.salesOrderItem());
        ePickListItemDao.setProductBundleItem(vPickListItemDto.productBundleItem());
        ePickListItemDao.setMaterialRequest(vPickListItemDto.materialRequest());
        ePickListItemDao.setMaterialRequestItem(vPickListItemDto.materialRequestItem());
        ePickListItemDao.setParent(vPickListItemDto.parent());
        ePickListItemDao.setParentField(vPickListItemDto.parentField());
        ePickListItemDao.setParentType(vPickListItemDto.parentType());
    }
}