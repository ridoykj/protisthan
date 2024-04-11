package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentEntryReferenceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PaymentEntryReferenceDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceDocType,
        String referenceName,
        LocalDate dueDate,
        String billNo,
        String paymentTerm,
        BigDecimal totalAmount,
        BigDecimal outstandingAmount,
        BigDecimal allocatedAmount,
        BigDecimal exchangeRate,
        BigDecimal exchangeGainLoss,
        String account,
        String parent,
        String parentField,
        String parentType
) {
    public static PaymentEntryReferenceDto fromEntity(PaymentEntryReferenceDao ePaymentEntryReferenceDao) {
        return new PaymentEntryReferenceDto(
                ePaymentEntryReferenceDao.getName(),
                ePaymentEntryReferenceDao.getCreation(),
                ePaymentEntryReferenceDao.getModified(),
                ePaymentEntryReferenceDao.getModifiedBy(),
                ePaymentEntryReferenceDao.getOwner(),
                ePaymentEntryReferenceDao.getIsDocStatus(),
                ePaymentEntryReferenceDao.getIdx(),
                ePaymentEntryReferenceDao.getReferenceDocType(),
                ePaymentEntryReferenceDao.getReferenceName(),
                ePaymentEntryReferenceDao.getDueDate(),
                ePaymentEntryReferenceDao.getBillNo(),
                ePaymentEntryReferenceDao.getPaymentTerm(),
                ePaymentEntryReferenceDao.getTotalAmount(),
                ePaymentEntryReferenceDao.getOutstandingAmount(),
                ePaymentEntryReferenceDao.getAllocatedAmount(),
                ePaymentEntryReferenceDao.getExchangeRate(),
                ePaymentEntryReferenceDao.getExchangeGainLoss(),
                ePaymentEntryReferenceDao.getAccount(),
                ePaymentEntryReferenceDao.getParent(),
                ePaymentEntryReferenceDao.getParentField(),
                ePaymentEntryReferenceDao.getParentType());
    }

    public static void fromDTO(PaymentEntryReferenceDto vPaymentEntryReferenceDto, PaymentEntryReferenceDao ePaymentEntryReferenceDao) {
        ePaymentEntryReferenceDao.setName(vPaymentEntryReferenceDto.name());
        ePaymentEntryReferenceDao.setCreation(vPaymentEntryReferenceDto.creation());
        ePaymentEntryReferenceDao.setModified(vPaymentEntryReferenceDto.modified());
        ePaymentEntryReferenceDao.setModifiedBy(vPaymentEntryReferenceDto.modifiedBy());
        ePaymentEntryReferenceDao.setOwner(vPaymentEntryReferenceDto.owner());
        ePaymentEntryReferenceDao.setIsDocStatus(vPaymentEntryReferenceDto.isDocStatus());
        ePaymentEntryReferenceDao.setIdx(vPaymentEntryReferenceDto.idx());
        ePaymentEntryReferenceDao.setReferenceDocType(vPaymentEntryReferenceDto.referenceDocType());
        ePaymentEntryReferenceDao.setReferenceName(vPaymentEntryReferenceDto.referenceName());
        ePaymentEntryReferenceDao.setDueDate(vPaymentEntryReferenceDto.dueDate());
        ePaymentEntryReferenceDao.setBillNo(vPaymentEntryReferenceDto.billNo());
        ePaymentEntryReferenceDao.setPaymentTerm(vPaymentEntryReferenceDto.paymentTerm());
        ePaymentEntryReferenceDao.setTotalAmount(vPaymentEntryReferenceDto.totalAmount());
        ePaymentEntryReferenceDao.setOutstandingAmount(vPaymentEntryReferenceDto.outstandingAmount());
        ePaymentEntryReferenceDao.setAllocatedAmount(vPaymentEntryReferenceDto.allocatedAmount());
        ePaymentEntryReferenceDao.setExchangeRate(vPaymentEntryReferenceDto.exchangeRate());
        ePaymentEntryReferenceDao.setExchangeGainLoss(vPaymentEntryReferenceDto.exchangeGainLoss());
        ePaymentEntryReferenceDao.setAccount(vPaymentEntryReferenceDto.account());
        ePaymentEntryReferenceDao.setParent(vPaymentEntryReferenceDto.parent());
        ePaymentEntryReferenceDao.setParentField(vPaymentEntryReferenceDto.parentField());
        ePaymentEntryReferenceDao.setParentType(vPaymentEntryReferenceDto.parentType());
    }
}