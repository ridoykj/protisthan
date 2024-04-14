package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentEntryDeductionDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentEntryDeductionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String costCenter,
        BigDecimal amount,
        String description,
        String parent,
        String parentField,
        String parentType
) {
    public static PaymentEntryDeductionDto fromEntity(PaymentEntryDeductionDao ePaymentEntryDeductionDao) {
        return new PaymentEntryDeductionDto(
                ePaymentEntryDeductionDao.getName(),
                ePaymentEntryDeductionDao.getCreation(),
                ePaymentEntryDeductionDao.getModified(),
                ePaymentEntryDeductionDao.getModifiedBy(),
                ePaymentEntryDeductionDao.getOwner(),
                ePaymentEntryDeductionDao.getIsDocStatus(),
                ePaymentEntryDeductionDao.getIdx(),
                ePaymentEntryDeductionDao.getAccount(),
                ePaymentEntryDeductionDao.getCostCenter(),
                ePaymentEntryDeductionDao.getAmount(),
                ePaymentEntryDeductionDao.getDescription(),
                ePaymentEntryDeductionDao.getParent(),
                ePaymentEntryDeductionDao.getParentField(),
                ePaymentEntryDeductionDao.getParentType());
    }

    public static void fromDTO(PaymentEntryDeductionDto vPaymentEntryDeductionDto, PaymentEntryDeductionDao ePaymentEntryDeductionDao) {
        ePaymentEntryDeductionDao.setName(vPaymentEntryDeductionDto.name());
        ePaymentEntryDeductionDao.setCreation(vPaymentEntryDeductionDto.creation());
        ePaymentEntryDeductionDao.setModified(vPaymentEntryDeductionDto.modified());
        ePaymentEntryDeductionDao.setModifiedBy(vPaymentEntryDeductionDto.modifiedBy());
        ePaymentEntryDeductionDao.setOwner(vPaymentEntryDeductionDto.owner());
        ePaymentEntryDeductionDao.setIsDocStatus(vPaymentEntryDeductionDto.isDocStatus());
        ePaymentEntryDeductionDao.setIdx(vPaymentEntryDeductionDto.idx());
        ePaymentEntryDeductionDao.setAccount(vPaymentEntryDeductionDto.account());
        ePaymentEntryDeductionDao.setCostCenter(vPaymentEntryDeductionDto.costCenter());
        ePaymentEntryDeductionDao.setAmount(vPaymentEntryDeductionDto.amount());
        ePaymentEntryDeductionDao.setDescription(vPaymentEntryDeductionDto.description());
        ePaymentEntryDeductionDao.setParent(vPaymentEntryDeductionDto.parent());
        ePaymentEntryDeductionDao.setParentField(vPaymentEntryDeductionDto.parentField());
        ePaymentEntryDeductionDao.setParentType(vPaymentEntryDeductionDto.parentType());
    }
}