package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BatchDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BatchDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean disabled,
        Boolean useBatchwiseValuation,
        String batchId,
        String item,
        String itemName,
        String image,
        String parentBatch,
        LocalDate manufacturingDate,
        BigDecimal batchQty,
        String stockUom,
        LocalDate expiryDate,
        String supplier,
        String referenceDocType,
        String referenceName,
        String description,
        BigDecimal qtyToProduce,
        BigDecimal producedQty,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BatchDto fromEntity(BatchDao eBatchDao) {
        return new BatchDto(
                eBatchDao.getName(),
                eBatchDao.getCreation(),
                eBatchDao.getModified(),
                eBatchDao.getModifiedBy(),
                eBatchDao.getOwner(),
                eBatchDao.getIsDocStatus(),
                eBatchDao.getIdx(),
                eBatchDao.getDisabled(),
                eBatchDao.getUseBatchwiseValuation(),
                eBatchDao.getBatchId(),
                eBatchDao.getItem(),
                eBatchDao.getItemName(),
                eBatchDao.getImage(),
                eBatchDao.getParentBatch(),
                eBatchDao.getManufacturingDate(),
                eBatchDao.getBatchQty(),
                eBatchDao.getStockUom(),
                eBatchDao.getExpiryDate(),
                eBatchDao.getSupplier(),
                eBatchDao.getReferenceDocType(),
                eBatchDao.getReferenceName(),
                eBatchDao.getDescription(),
                eBatchDao.getQtyToProduce(),
                eBatchDao.getProducedQty(),
                eBatchDao.getUserTags(),
                eBatchDao.getComments(),
                eBatchDao.getAssign(),
                eBatchDao.getLikedBy());
    }

    public static void fromDTO(BatchDto vBatchDto, BatchDao eBatchDao) {
        eBatchDao.setName(vBatchDto.name());
        eBatchDao.setCreation(vBatchDto.creation());
        eBatchDao.setModified(vBatchDto.modified());
        eBatchDao.setModifiedBy(vBatchDto.modifiedBy());
        eBatchDao.setOwner(vBatchDto.owner());
        eBatchDao.setIsDocStatus(vBatchDto.isDocStatus());
        eBatchDao.setIdx(vBatchDto.idx());
        eBatchDao.setDisabled(vBatchDto.disabled());
        eBatchDao.setUseBatchwiseValuation(vBatchDto.useBatchwiseValuation());
        eBatchDao.setBatchId(vBatchDto.batchId());
        eBatchDao.setItem(vBatchDto.item());
        eBatchDao.setItemName(vBatchDto.itemName());
        eBatchDao.setImage(vBatchDto.image());
        eBatchDao.setParentBatch(vBatchDto.parentBatch());
        eBatchDao.setManufacturingDate(vBatchDto.manufacturingDate());
        eBatchDao.setBatchQty(vBatchDto.batchQty());
        eBatchDao.setStockUom(vBatchDto.stockUom());
        eBatchDao.setExpiryDate(vBatchDto.expiryDate());
        eBatchDao.setSupplier(vBatchDto.supplier());
        eBatchDao.setReferenceDocType(vBatchDto.referenceDocType());
        eBatchDao.setReferenceName(vBatchDto.referenceName());
        eBatchDao.setDescription(vBatchDto.description());
        eBatchDao.setQtyToProduce(vBatchDto.qtyToProduce());
        eBatchDao.setProducedQty(vBatchDto.producedQty());
        eBatchDao.setUserTags(vBatchDto.userTags());
        eBatchDao.setComments(vBatchDto.comments());
        eBatchDao.setAssign(vBatchDto.assign());
        eBatchDao.setLikedBy(vBatchDto.likedBy());
    }
}