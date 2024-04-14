package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SerialAndBatchEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SerialAndBatchEntryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String serialNo,
        String batchNo,
        BigDecimal qty,
        String warehouse,
        BigDecimal deliveredQty,
        BigDecimal incomingRate,
        BigDecimal outgoingRate,
        BigDecimal stockValueDifference,
        Boolean isOutward,
        String stockQueue,
        String parent,
        String parentField,
        String parentType
) {
    public static SerialAndBatchEntryDto fromEntity(SerialAndBatchEntryDao eSerialAndBatchEntryDao) {
        return new SerialAndBatchEntryDto(
                eSerialAndBatchEntryDao.getName(),
                eSerialAndBatchEntryDao.getCreation(),
                eSerialAndBatchEntryDao.getModified(),
                eSerialAndBatchEntryDao.getModifiedBy(),
                eSerialAndBatchEntryDao.getOwner(),
                eSerialAndBatchEntryDao.getIsDocStatus(),
                eSerialAndBatchEntryDao.getIdx(),
                eSerialAndBatchEntryDao.getSerialNo(),
                eSerialAndBatchEntryDao.getBatchNo(),
                eSerialAndBatchEntryDao.getQty(),
                eSerialAndBatchEntryDao.getWarehouse(),
                eSerialAndBatchEntryDao.getDeliveredQty(),
                eSerialAndBatchEntryDao.getIncomingRate(),
                eSerialAndBatchEntryDao.getOutgoingRate(),
                eSerialAndBatchEntryDao.getStockValueDifference(),
                eSerialAndBatchEntryDao.getIsOutward(),
                eSerialAndBatchEntryDao.getStockQueue(),
                eSerialAndBatchEntryDao.getParent(),
                eSerialAndBatchEntryDao.getParentField(),
                eSerialAndBatchEntryDao.getParentType());
    }

    public static void fromDTO(SerialAndBatchEntryDto vSerialAndBatchEntryDto, SerialAndBatchEntryDao eSerialAndBatchEntryDao) {
        eSerialAndBatchEntryDao.setName(vSerialAndBatchEntryDto.name());
        eSerialAndBatchEntryDao.setCreation(vSerialAndBatchEntryDto.creation());
        eSerialAndBatchEntryDao.setModified(vSerialAndBatchEntryDto.modified());
        eSerialAndBatchEntryDao.setModifiedBy(vSerialAndBatchEntryDto.modifiedBy());
        eSerialAndBatchEntryDao.setOwner(vSerialAndBatchEntryDto.owner());
        eSerialAndBatchEntryDao.setIsDocStatus(vSerialAndBatchEntryDto.isDocStatus());
        eSerialAndBatchEntryDao.setIdx(vSerialAndBatchEntryDto.idx());
        eSerialAndBatchEntryDao.setSerialNo(vSerialAndBatchEntryDto.serialNo());
        eSerialAndBatchEntryDao.setBatchNo(vSerialAndBatchEntryDto.batchNo());
        eSerialAndBatchEntryDao.setQty(vSerialAndBatchEntryDto.qty());
        eSerialAndBatchEntryDao.setWarehouse(vSerialAndBatchEntryDto.warehouse());
        eSerialAndBatchEntryDao.setDeliveredQty(vSerialAndBatchEntryDto.deliveredQty());
        eSerialAndBatchEntryDao.setIncomingRate(vSerialAndBatchEntryDto.incomingRate());
        eSerialAndBatchEntryDao.setOutgoingRate(vSerialAndBatchEntryDto.outgoingRate());
        eSerialAndBatchEntryDao.setStockValueDifference(vSerialAndBatchEntryDto.stockValueDifference());
        eSerialAndBatchEntryDao.setIsOutward(vSerialAndBatchEntryDto.isOutward());
        eSerialAndBatchEntryDao.setStockQueue(vSerialAndBatchEntryDto.stockQueue());
        eSerialAndBatchEntryDao.setParent(vSerialAndBatchEntryDto.parent());
        eSerialAndBatchEntryDao.setParentField(vSerialAndBatchEntryDto.parentField());
        eSerialAndBatchEntryDao.setParentType(vSerialAndBatchEntryDto.parentType());
    }
}