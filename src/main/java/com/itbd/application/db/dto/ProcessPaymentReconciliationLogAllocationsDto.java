package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProcessPaymentReconciliationLogAllocationsDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProcessPaymentReconciliationLogAllocationsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceType,
        String referenceName,
        String referenceRow,
        String invoiceType,
        String invoiceNumber,
        BigDecimal allocatedAmount,
        BigDecimal unreconciledAmount,
        BigDecimal amount,
        String isAdvance,
        BigDecimal differenceAmount,
        String differenceAccount,
        BigDecimal exchangeRate,
        String currency,
        Boolean reconciled,
        String parent,
        String parentField,
        String parentType
) {
    public static ProcessPaymentReconciliationLogAllocationsDto fromEntity(ProcessPaymentReconciliationLogAllocationsDao eProcessPaymentReconciliationLogAllocationsDao) {
        return new ProcessPaymentReconciliationLogAllocationsDto(
                eProcessPaymentReconciliationLogAllocationsDao.getName(),
                eProcessPaymentReconciliationLogAllocationsDao.getCreation(),
                eProcessPaymentReconciliationLogAllocationsDao.getModified(),
                eProcessPaymentReconciliationLogAllocationsDao.getModifiedBy(),
                eProcessPaymentReconciliationLogAllocationsDao.getOwner(),
                eProcessPaymentReconciliationLogAllocationsDao.getIsDocStatus(),
                eProcessPaymentReconciliationLogAllocationsDao.getIdx(),
                eProcessPaymentReconciliationLogAllocationsDao.getReferenceType(),
                eProcessPaymentReconciliationLogAllocationsDao.getReferenceName(),
                eProcessPaymentReconciliationLogAllocationsDao.getReferenceRow(),
                eProcessPaymentReconciliationLogAllocationsDao.getInvoiceType(),
                eProcessPaymentReconciliationLogAllocationsDao.getInvoiceNumber(),
                eProcessPaymentReconciliationLogAllocationsDao.getAllocatedAmount(),
                eProcessPaymentReconciliationLogAllocationsDao.getUnreconciledAmount(),
                eProcessPaymentReconciliationLogAllocationsDao.getAmount(),
                eProcessPaymentReconciliationLogAllocationsDao.getIsAdvance(),
                eProcessPaymentReconciliationLogAllocationsDao.getDifferenceAmount(),
                eProcessPaymentReconciliationLogAllocationsDao.getDifferenceAccount(),
                eProcessPaymentReconciliationLogAllocationsDao.getExchangeRate(),
                eProcessPaymentReconciliationLogAllocationsDao.getCurrency(),
                eProcessPaymentReconciliationLogAllocationsDao.getReconciled(),
                eProcessPaymentReconciliationLogAllocationsDao.getParent(),
                eProcessPaymentReconciliationLogAllocationsDao.getParentField(),
                eProcessPaymentReconciliationLogAllocationsDao.getParentType());
    }

    public static void fromDTO(ProcessPaymentReconciliationLogAllocationsDto vProcessPaymentReconciliationLogAllocationsDto, ProcessPaymentReconciliationLogAllocationsDao eProcessPaymentReconciliationLogAllocationsDao) {
        eProcessPaymentReconciliationLogAllocationsDao.setName(vProcessPaymentReconciliationLogAllocationsDto.name());
        eProcessPaymentReconciliationLogAllocationsDao.setCreation(vProcessPaymentReconciliationLogAllocationsDto.creation());
        eProcessPaymentReconciliationLogAllocationsDao.setModified(vProcessPaymentReconciliationLogAllocationsDto.modified());
        eProcessPaymentReconciliationLogAllocationsDao.setModifiedBy(vProcessPaymentReconciliationLogAllocationsDto.modifiedBy());
        eProcessPaymentReconciliationLogAllocationsDao.setOwner(vProcessPaymentReconciliationLogAllocationsDto.owner());
        eProcessPaymentReconciliationLogAllocationsDao.setIsDocStatus(vProcessPaymentReconciliationLogAllocationsDto.isDocStatus());
        eProcessPaymentReconciliationLogAllocationsDao.setIdx(vProcessPaymentReconciliationLogAllocationsDto.idx());
        eProcessPaymentReconciliationLogAllocationsDao.setReferenceType(vProcessPaymentReconciliationLogAllocationsDto.referenceType());
        eProcessPaymentReconciliationLogAllocationsDao.setReferenceName(vProcessPaymentReconciliationLogAllocationsDto.referenceName());
        eProcessPaymentReconciliationLogAllocationsDao.setReferenceRow(vProcessPaymentReconciliationLogAllocationsDto.referenceRow());
        eProcessPaymentReconciliationLogAllocationsDao.setInvoiceType(vProcessPaymentReconciliationLogAllocationsDto.invoiceType());
        eProcessPaymentReconciliationLogAllocationsDao.setInvoiceNumber(vProcessPaymentReconciliationLogAllocationsDto.invoiceNumber());
        eProcessPaymentReconciliationLogAllocationsDao.setAllocatedAmount(vProcessPaymentReconciliationLogAllocationsDto.allocatedAmount());
        eProcessPaymentReconciliationLogAllocationsDao.setUnreconciledAmount(vProcessPaymentReconciliationLogAllocationsDto.unreconciledAmount());
        eProcessPaymentReconciliationLogAllocationsDao.setAmount(vProcessPaymentReconciliationLogAllocationsDto.amount());
        eProcessPaymentReconciliationLogAllocationsDao.setIsAdvance(vProcessPaymentReconciliationLogAllocationsDto.isAdvance());
        eProcessPaymentReconciliationLogAllocationsDao.setDifferenceAmount(vProcessPaymentReconciliationLogAllocationsDto.differenceAmount());
        eProcessPaymentReconciliationLogAllocationsDao.setDifferenceAccount(vProcessPaymentReconciliationLogAllocationsDto.differenceAccount());
        eProcessPaymentReconciliationLogAllocationsDao.setExchangeRate(vProcessPaymentReconciliationLogAllocationsDto.exchangeRate());
        eProcessPaymentReconciliationLogAllocationsDao.setCurrency(vProcessPaymentReconciliationLogAllocationsDto.currency());
        eProcessPaymentReconciliationLogAllocationsDao.setReconciled(vProcessPaymentReconciliationLogAllocationsDto.reconciled());
        eProcessPaymentReconciliationLogAllocationsDao.setParent(vProcessPaymentReconciliationLogAllocationsDto.parent());
        eProcessPaymentReconciliationLogAllocationsDao.setParentField(vProcessPaymentReconciliationLogAllocationsDto.parentField());
        eProcessPaymentReconciliationLogAllocationsDao.setParentType(vProcessPaymentReconciliationLogAllocationsDto.parentType());
    }
}