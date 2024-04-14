package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentScheduleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PaymentScheduleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String paymentTerm,
        String description,
        LocalDate dueDate,
        String modeOfPayment,
        BigDecimal invoicePortion,
        String discountType,
        LocalDate discountDate,
        BigDecimal discount,
        BigDecimal paymentAmount,
        BigDecimal outstanding,
        BigDecimal paidAmount,
        BigDecimal discountedAmount,
        BigDecimal basePaymentAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static PaymentScheduleDto fromEntity(PaymentScheduleDao ePaymentScheduleDao) {
        return new PaymentScheduleDto(
                ePaymentScheduleDao.getName(),
                ePaymentScheduleDao.getCreation(),
                ePaymentScheduleDao.getModified(),
                ePaymentScheduleDao.getModifiedBy(),
                ePaymentScheduleDao.getOwner(),
                ePaymentScheduleDao.getIsDocStatus(),
                ePaymentScheduleDao.getIdx(),
                ePaymentScheduleDao.getPaymentTerm(),
                ePaymentScheduleDao.getDescription(),
                ePaymentScheduleDao.getDueDate(),
                ePaymentScheduleDao.getModeOfPayment(),
                ePaymentScheduleDao.getInvoicePortion(),
                ePaymentScheduleDao.getDiscountType(),
                ePaymentScheduleDao.getDiscountDate(),
                ePaymentScheduleDao.getDiscount(),
                ePaymentScheduleDao.getPaymentAmount(),
                ePaymentScheduleDao.getOutstanding(),
                ePaymentScheduleDao.getPaidAmount(),
                ePaymentScheduleDao.getDiscountedAmount(),
                ePaymentScheduleDao.getBasePaymentAmount(),
                ePaymentScheduleDao.getParent(),
                ePaymentScheduleDao.getParentField(),
                ePaymentScheduleDao.getParentType());
    }

    public static void fromDTO(PaymentScheduleDto vPaymentScheduleDto, PaymentScheduleDao ePaymentScheduleDao) {
        ePaymentScheduleDao.setName(vPaymentScheduleDto.name());
        ePaymentScheduleDao.setCreation(vPaymentScheduleDto.creation());
        ePaymentScheduleDao.setModified(vPaymentScheduleDto.modified());
        ePaymentScheduleDao.setModifiedBy(vPaymentScheduleDto.modifiedBy());
        ePaymentScheduleDao.setOwner(vPaymentScheduleDto.owner());
        ePaymentScheduleDao.setIsDocStatus(vPaymentScheduleDto.isDocStatus());
        ePaymentScheduleDao.setIdx(vPaymentScheduleDto.idx());
        ePaymentScheduleDao.setPaymentTerm(vPaymentScheduleDto.paymentTerm());
        ePaymentScheduleDao.setDescription(vPaymentScheduleDto.description());
        ePaymentScheduleDao.setDueDate(vPaymentScheduleDto.dueDate());
        ePaymentScheduleDao.setModeOfPayment(vPaymentScheduleDto.modeOfPayment());
        ePaymentScheduleDao.setInvoicePortion(vPaymentScheduleDto.invoicePortion());
        ePaymentScheduleDao.setDiscountType(vPaymentScheduleDto.discountType());
        ePaymentScheduleDao.setDiscountDate(vPaymentScheduleDto.discountDate());
        ePaymentScheduleDao.setDiscount(vPaymentScheduleDto.discount());
        ePaymentScheduleDao.setPaymentAmount(vPaymentScheduleDto.paymentAmount());
        ePaymentScheduleDao.setOutstanding(vPaymentScheduleDto.outstanding());
        ePaymentScheduleDao.setPaidAmount(vPaymentScheduleDto.paidAmount());
        ePaymentScheduleDao.setDiscountedAmount(vPaymentScheduleDto.discountedAmount());
        ePaymentScheduleDao.setBasePaymentAmount(vPaymentScheduleDto.basePaymentAmount());
        ePaymentScheduleDao.setParent(vPaymentScheduleDto.parent());
        ePaymentScheduleDao.setParentField(vPaymentScheduleDto.parentField());
        ePaymentScheduleDao.setParentType(vPaymentScheduleDto.parentType());
    }
}