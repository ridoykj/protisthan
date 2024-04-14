package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PackedItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PackedItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parentItem,
        String itemCode,
        String itemName,
        String description,
        String warehouse,
        String targetWarehouse,
        BigDecimal conversionFactor,
        BigDecimal qty,
        BigDecimal rate,
        String uom,
        Boolean useSerialBatchFields,
        String serialAndBatchBundle,
        String serialNo,
        String batchNo,
        BigDecimal actualBatchQty,
        BigDecimal actualQty,
        BigDecimal projectedQty,
        BigDecimal orderedQty,
        BigDecimal packedQty,
        BigDecimal incomingRate,
        BigDecimal pickedQty,
        Boolean pageBreak,
        String prevDocumentDocType,
        String parentDetailDocName,
        String parent,
        String parentField,
        String parentType
) {
    public static PackedItemDto fromEntity(PackedItemDao ePackedItemDao) {
        return new PackedItemDto(
                ePackedItemDao.getName(),
                ePackedItemDao.getCreation(),
                ePackedItemDao.getModified(),
                ePackedItemDao.getModifiedBy(),
                ePackedItemDao.getOwner(),
                ePackedItemDao.getIsDocStatus(),
                ePackedItemDao.getIdx(),
                ePackedItemDao.getParentItem(),
                ePackedItemDao.getItemCode(),
                ePackedItemDao.getItemName(),
                ePackedItemDao.getDescription(),
                ePackedItemDao.getWarehouse(),
                ePackedItemDao.getTargetWarehouse(),
                ePackedItemDao.getConversionFactor(),
                ePackedItemDao.getQty(),
                ePackedItemDao.getRate(),
                ePackedItemDao.getUom(),
                ePackedItemDao.getUseSerialBatchFields(),
                ePackedItemDao.getSerialAndBatchBundle(),
                ePackedItemDao.getSerialNo(),
                ePackedItemDao.getBatchNo(),
                ePackedItemDao.getActualBatchQty(),
                ePackedItemDao.getActualQty(),
                ePackedItemDao.getProjectedQty(),
                ePackedItemDao.getOrderedQty(),
                ePackedItemDao.getPackedQty(),
                ePackedItemDao.getIncomingRate(),
                ePackedItemDao.getPickedQty(),
                ePackedItemDao.getPageBreak(),
                ePackedItemDao.getPrevDocumentDocType(),
                ePackedItemDao.getParentDetailDocName(),
                ePackedItemDao.getParent(),
                ePackedItemDao.getParentField(),
                ePackedItemDao.getParentType());
    }

    public static void fromDTO(PackedItemDto vPackedItemDto, PackedItemDao ePackedItemDao) {
        ePackedItemDao.setName(vPackedItemDto.name());
        ePackedItemDao.setCreation(vPackedItemDto.creation());
        ePackedItemDao.setModified(vPackedItemDto.modified());
        ePackedItemDao.setModifiedBy(vPackedItemDto.modifiedBy());
        ePackedItemDao.setOwner(vPackedItemDto.owner());
        ePackedItemDao.setIsDocStatus(vPackedItemDto.isDocStatus());
        ePackedItemDao.setIdx(vPackedItemDto.idx());
        ePackedItemDao.setParentItem(vPackedItemDto.parentItem());
        ePackedItemDao.setItemCode(vPackedItemDto.itemCode());
        ePackedItemDao.setItemName(vPackedItemDto.itemName());
        ePackedItemDao.setDescription(vPackedItemDto.description());
        ePackedItemDao.setWarehouse(vPackedItemDto.warehouse());
        ePackedItemDao.setTargetWarehouse(vPackedItemDto.targetWarehouse());
        ePackedItemDao.setConversionFactor(vPackedItemDto.conversionFactor());
        ePackedItemDao.setQty(vPackedItemDto.qty());
        ePackedItemDao.setRate(vPackedItemDto.rate());
        ePackedItemDao.setUom(vPackedItemDto.uom());
        ePackedItemDao.setUseSerialBatchFields(vPackedItemDto.useSerialBatchFields());
        ePackedItemDao.setSerialAndBatchBundle(vPackedItemDto.serialAndBatchBundle());
        ePackedItemDao.setSerialNo(vPackedItemDto.serialNo());
        ePackedItemDao.setBatchNo(vPackedItemDto.batchNo());
        ePackedItemDao.setActualBatchQty(vPackedItemDto.actualBatchQty());
        ePackedItemDao.setActualQty(vPackedItemDto.actualQty());
        ePackedItemDao.setProjectedQty(vPackedItemDto.projectedQty());
        ePackedItemDao.setOrderedQty(vPackedItemDto.orderedQty());
        ePackedItemDao.setPackedQty(vPackedItemDto.packedQty());
        ePackedItemDao.setIncomingRate(vPackedItemDto.incomingRate());
        ePackedItemDao.setPickedQty(vPackedItemDto.pickedQty());
        ePackedItemDao.setPageBreak(vPackedItemDto.pageBreak());
        ePackedItemDao.setPrevDocumentDocType(vPackedItemDto.prevDocumentDocType());
        ePackedItemDao.setParentDetailDocName(vPackedItemDto.parentDetailDocName());
        ePackedItemDao.setParent(vPackedItemDto.parent());
        ePackedItemDao.setParentField(vPackedItemDto.parentField());
        ePackedItemDao.setParentType(vPackedItemDto.parentType());
    }
}