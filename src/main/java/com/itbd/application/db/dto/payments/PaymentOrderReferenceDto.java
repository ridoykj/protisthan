package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentOrderReferenceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentOrderReferenceDto(
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
        BigDecimal amount,
        String supplier,
        String paymentRequest,
        String modeOfPayment,
        String bankAccount,
        String account,
        String paymentReference,
        String parent,
        String parentField,
        String parentType
) {
    public static PaymentOrderReferenceDto fromEntity(PaymentOrderReferenceDao ePaymentOrderReferenceDao) {
        return new PaymentOrderReferenceDto(
                ePaymentOrderReferenceDao.getName(),
                ePaymentOrderReferenceDao.getCreation(),
                ePaymentOrderReferenceDao.getModified(),
                ePaymentOrderReferenceDao.getModifiedBy(),
                ePaymentOrderReferenceDao.getOwner(),
                ePaymentOrderReferenceDao.getIsDocStatus(),
                ePaymentOrderReferenceDao.getIdx(),
                ePaymentOrderReferenceDao.getReferenceDocType(),
                ePaymentOrderReferenceDao.getReferenceName(),
                ePaymentOrderReferenceDao.getAmount(),
                ePaymentOrderReferenceDao.getSupplier(),
                ePaymentOrderReferenceDao.getPaymentRequest(),
                ePaymentOrderReferenceDao.getModeOfPayment(),
                ePaymentOrderReferenceDao.getBankAccount(),
                ePaymentOrderReferenceDao.getAccount(),
                ePaymentOrderReferenceDao.getPaymentReference(),
                ePaymentOrderReferenceDao.getParent(),
                ePaymentOrderReferenceDao.getParentField(),
                ePaymentOrderReferenceDao.getParentType());
    }

    public static void fromDTO(PaymentOrderReferenceDto vPaymentOrderReferenceDto, PaymentOrderReferenceDao ePaymentOrderReferenceDao) {
        ePaymentOrderReferenceDao.setName(vPaymentOrderReferenceDto.name());
        ePaymentOrderReferenceDao.setCreation(vPaymentOrderReferenceDto.creation());
        ePaymentOrderReferenceDao.setModified(vPaymentOrderReferenceDto.modified());
        ePaymentOrderReferenceDao.setModifiedBy(vPaymentOrderReferenceDto.modifiedBy());
        ePaymentOrderReferenceDao.setOwner(vPaymentOrderReferenceDto.owner());
        ePaymentOrderReferenceDao.setIsDocStatus(vPaymentOrderReferenceDto.isDocStatus());
        ePaymentOrderReferenceDao.setIdx(vPaymentOrderReferenceDto.idx());
        ePaymentOrderReferenceDao.setReferenceDocType(vPaymentOrderReferenceDto.referenceDocType());
        ePaymentOrderReferenceDao.setReferenceName(vPaymentOrderReferenceDto.referenceName());
        ePaymentOrderReferenceDao.setAmount(vPaymentOrderReferenceDto.amount());
        ePaymentOrderReferenceDao.setSupplier(vPaymentOrderReferenceDto.supplier());
        ePaymentOrderReferenceDao.setPaymentRequest(vPaymentOrderReferenceDto.paymentRequest());
        ePaymentOrderReferenceDao.setModeOfPayment(vPaymentOrderReferenceDto.modeOfPayment());
        ePaymentOrderReferenceDao.setBankAccount(vPaymentOrderReferenceDto.bankAccount());
        ePaymentOrderReferenceDao.setAccount(vPaymentOrderReferenceDto.account());
        ePaymentOrderReferenceDao.setPaymentReference(vPaymentOrderReferenceDto.paymentReference());
        ePaymentOrderReferenceDao.setParent(vPaymentOrderReferenceDto.parent());
        ePaymentOrderReferenceDao.setParentField(vPaymentOrderReferenceDto.parentField());
        ePaymentOrderReferenceDao.setParentType(vPaymentOrderReferenceDto.parentType());
    }
}