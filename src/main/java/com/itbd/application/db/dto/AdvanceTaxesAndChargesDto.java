package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AdvanceTaxesAndChargesDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AdvanceTaxesAndChargesDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String addDeductTax,
        String chargeType,
        String rowId,
        String accountHead,
        String description,
        Boolean includedInPaidAmount,
        String costCenter,
        BigDecimal rate,
        String currency,
        BigDecimal taxAmount,
        BigDecimal total,
        BigDecimal allocatedAmount,
        BigDecimal baseTaxAmount,
        BigDecimal baseTotal,
        String parent,
        String parentField,
        String parentType
) {
    public static AdvanceTaxesAndChargesDto fromEntity(AdvanceTaxesAndChargesDao eAdvanceTaxesAndChargesDao) {
        return new AdvanceTaxesAndChargesDto(
                eAdvanceTaxesAndChargesDao.getName(),
                eAdvanceTaxesAndChargesDao.getCreation(),
                eAdvanceTaxesAndChargesDao.getModified(),
                eAdvanceTaxesAndChargesDao.getModifiedBy(),
                eAdvanceTaxesAndChargesDao.getOwner(),
                eAdvanceTaxesAndChargesDao.getIsDocStatus(),
                eAdvanceTaxesAndChargesDao.getIdx(),
                eAdvanceTaxesAndChargesDao.getAddDeductTax(),
                eAdvanceTaxesAndChargesDao.getChargeType(),
                eAdvanceTaxesAndChargesDao.getRowId(),
                eAdvanceTaxesAndChargesDao.getAccountHead(),
                eAdvanceTaxesAndChargesDao.getDescription(),
                eAdvanceTaxesAndChargesDao.getIncludedInPaidAmount(),
                eAdvanceTaxesAndChargesDao.getCostCenter(),
                eAdvanceTaxesAndChargesDao.getRate(),
                eAdvanceTaxesAndChargesDao.getCurrency(),
                eAdvanceTaxesAndChargesDao.getTaxAmount(),
                eAdvanceTaxesAndChargesDao.getTotal(),
                eAdvanceTaxesAndChargesDao.getAllocatedAmount(),
                eAdvanceTaxesAndChargesDao.getBaseTaxAmount(),
                eAdvanceTaxesAndChargesDao.getBaseTotal(),
                eAdvanceTaxesAndChargesDao.getParent(),
                eAdvanceTaxesAndChargesDao.getParentField(),
                eAdvanceTaxesAndChargesDao.getParentType());
    }

    public static void fromDTO(AdvanceTaxesAndChargesDto vAdvanceTaxesAndChargesDto, AdvanceTaxesAndChargesDao eAdvanceTaxesAndChargesDao) {
        eAdvanceTaxesAndChargesDao.setName(vAdvanceTaxesAndChargesDto.name());
        eAdvanceTaxesAndChargesDao.setCreation(vAdvanceTaxesAndChargesDto.creation());
        eAdvanceTaxesAndChargesDao.setModified(vAdvanceTaxesAndChargesDto.modified());
        eAdvanceTaxesAndChargesDao.setModifiedBy(vAdvanceTaxesAndChargesDto.modifiedBy());
        eAdvanceTaxesAndChargesDao.setOwner(vAdvanceTaxesAndChargesDto.owner());
        eAdvanceTaxesAndChargesDao.setIsDocStatus(vAdvanceTaxesAndChargesDto.isDocStatus());
        eAdvanceTaxesAndChargesDao.setIdx(vAdvanceTaxesAndChargesDto.idx());
        eAdvanceTaxesAndChargesDao.setAddDeductTax(vAdvanceTaxesAndChargesDto.addDeductTax());
        eAdvanceTaxesAndChargesDao.setChargeType(vAdvanceTaxesAndChargesDto.chargeType());
        eAdvanceTaxesAndChargesDao.setRowId(vAdvanceTaxesAndChargesDto.rowId());
        eAdvanceTaxesAndChargesDao.setAccountHead(vAdvanceTaxesAndChargesDto.accountHead());
        eAdvanceTaxesAndChargesDao.setDescription(vAdvanceTaxesAndChargesDto.description());
        eAdvanceTaxesAndChargesDao.setIncludedInPaidAmount(vAdvanceTaxesAndChargesDto.includedInPaidAmount());
        eAdvanceTaxesAndChargesDao.setCostCenter(vAdvanceTaxesAndChargesDto.costCenter());
        eAdvanceTaxesAndChargesDao.setRate(vAdvanceTaxesAndChargesDto.rate());
        eAdvanceTaxesAndChargesDao.setCurrency(vAdvanceTaxesAndChargesDto.currency());
        eAdvanceTaxesAndChargesDao.setTaxAmount(vAdvanceTaxesAndChargesDto.taxAmount());
        eAdvanceTaxesAndChargesDao.setTotal(vAdvanceTaxesAndChargesDto.total());
        eAdvanceTaxesAndChargesDao.setAllocatedAmount(vAdvanceTaxesAndChargesDto.allocatedAmount());
        eAdvanceTaxesAndChargesDao.setBaseTaxAmount(vAdvanceTaxesAndChargesDto.baseTaxAmount());
        eAdvanceTaxesAndChargesDao.setBaseTotal(vAdvanceTaxesAndChargesDto.baseTotal());
        eAdvanceTaxesAndChargesDao.setParent(vAdvanceTaxesAndChargesDto.parent());
        eAdvanceTaxesAndChargesDao.setParentField(vAdvanceTaxesAndChargesDto.parentField());
        eAdvanceTaxesAndChargesDao.setParentType(vAdvanceTaxesAndChargesDto.parentType());
    }
}