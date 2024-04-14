package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingOrderSuppliedItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SubcontractingOrderSuppliedItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String mainItemCode,
        String rmItemCode,
        String stockUom,
        BigDecimal conversionFactor,
        String reserveWarehouse,
        String bomDetailNo,
        String referenceName,
        BigDecimal rate,
        BigDecimal amount,
        BigDecimal requiredQty,
        BigDecimal suppliedQty,
        BigDecimal consumedQty,
        BigDecimal returnedQty,
        BigDecimal totalSuppliedQty,
        String parent,
        String parentField,
        String parentType
) {
    public static SubcontractingOrderSuppliedItemDto fromEntity(SubcontractingOrderSuppliedItemDao eSubcontractingOrderSuppliedItemDao) {
        return new SubcontractingOrderSuppliedItemDto(
                eSubcontractingOrderSuppliedItemDao.getName(),
                eSubcontractingOrderSuppliedItemDao.getCreation(),
                eSubcontractingOrderSuppliedItemDao.getModified(),
                eSubcontractingOrderSuppliedItemDao.getModifiedBy(),
                eSubcontractingOrderSuppliedItemDao.getOwner(),
                eSubcontractingOrderSuppliedItemDao.getIsDocStatus(),
                eSubcontractingOrderSuppliedItemDao.getIdx(),
                eSubcontractingOrderSuppliedItemDao.getMainItemCode(),
                eSubcontractingOrderSuppliedItemDao.getRmItemCode(),
                eSubcontractingOrderSuppliedItemDao.getStockUom(),
                eSubcontractingOrderSuppliedItemDao.getConversionFactor(),
                eSubcontractingOrderSuppliedItemDao.getReserveWarehouse(),
                eSubcontractingOrderSuppliedItemDao.getBomDetailNo(),
                eSubcontractingOrderSuppliedItemDao.getReferenceName(),
                eSubcontractingOrderSuppliedItemDao.getRate(),
                eSubcontractingOrderSuppliedItemDao.getAmount(),
                eSubcontractingOrderSuppliedItemDao.getRequiredQty(),
                eSubcontractingOrderSuppliedItemDao.getSuppliedQty(),
                eSubcontractingOrderSuppliedItemDao.getConsumedQty(),
                eSubcontractingOrderSuppliedItemDao.getReturnedQty(),
                eSubcontractingOrderSuppliedItemDao.getTotalSuppliedQty(),
                eSubcontractingOrderSuppliedItemDao.getParent(),
                eSubcontractingOrderSuppliedItemDao.getParentField(),
                eSubcontractingOrderSuppliedItemDao.getParentType());
    }

    public static void fromDTO(SubcontractingOrderSuppliedItemDto vSubcontractingOrderSuppliedItemDto, SubcontractingOrderSuppliedItemDao eSubcontractingOrderSuppliedItemDao) {
        eSubcontractingOrderSuppliedItemDao.setName(vSubcontractingOrderSuppliedItemDto.name());
        eSubcontractingOrderSuppliedItemDao.setCreation(vSubcontractingOrderSuppliedItemDto.creation());
        eSubcontractingOrderSuppliedItemDao.setModified(vSubcontractingOrderSuppliedItemDto.modified());
        eSubcontractingOrderSuppliedItemDao.setModifiedBy(vSubcontractingOrderSuppliedItemDto.modifiedBy());
        eSubcontractingOrderSuppliedItemDao.setOwner(vSubcontractingOrderSuppliedItemDto.owner());
        eSubcontractingOrderSuppliedItemDao.setIsDocStatus(vSubcontractingOrderSuppliedItemDto.isDocStatus());
        eSubcontractingOrderSuppliedItemDao.setIdx(vSubcontractingOrderSuppliedItemDto.idx());
        eSubcontractingOrderSuppliedItemDao.setMainItemCode(vSubcontractingOrderSuppliedItemDto.mainItemCode());
        eSubcontractingOrderSuppliedItemDao.setRmItemCode(vSubcontractingOrderSuppliedItemDto.rmItemCode());
        eSubcontractingOrderSuppliedItemDao.setStockUom(vSubcontractingOrderSuppliedItemDto.stockUom());
        eSubcontractingOrderSuppliedItemDao.setConversionFactor(vSubcontractingOrderSuppliedItemDto.conversionFactor());
        eSubcontractingOrderSuppliedItemDao.setReserveWarehouse(vSubcontractingOrderSuppliedItemDto.reserveWarehouse());
        eSubcontractingOrderSuppliedItemDao.setBomDetailNo(vSubcontractingOrderSuppliedItemDto.bomDetailNo());
        eSubcontractingOrderSuppliedItemDao.setReferenceName(vSubcontractingOrderSuppliedItemDto.referenceName());
        eSubcontractingOrderSuppliedItemDao.setRate(vSubcontractingOrderSuppliedItemDto.rate());
        eSubcontractingOrderSuppliedItemDao.setAmount(vSubcontractingOrderSuppliedItemDto.amount());
        eSubcontractingOrderSuppliedItemDao.setRequiredQty(vSubcontractingOrderSuppliedItemDto.requiredQty());
        eSubcontractingOrderSuppliedItemDao.setSuppliedQty(vSubcontractingOrderSuppliedItemDto.suppliedQty());
        eSubcontractingOrderSuppliedItemDao.setConsumedQty(vSubcontractingOrderSuppliedItemDto.consumedQty());
        eSubcontractingOrderSuppliedItemDao.setReturnedQty(vSubcontractingOrderSuppliedItemDto.returnedQty());
        eSubcontractingOrderSuppliedItemDao.setTotalSuppliedQty(vSubcontractingOrderSuppliedItemDto.totalSuppliedQty());
        eSubcontractingOrderSuppliedItemDao.setParent(vSubcontractingOrderSuppliedItemDto.parent());
        eSubcontractingOrderSuppliedItemDao.setParentField(vSubcontractingOrderSuppliedItemDto.parentField());
        eSubcontractingOrderSuppliedItemDao.setParentType(vSubcontractingOrderSuppliedItemDto.parentType());
    }
}