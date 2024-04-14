package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentTermDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentTermDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String paymentTermName,
        BigDecimal invoicePortion,
        String modeOfPayment,
        String dueDateBasedOn,
        Integer creditDays,
        Integer creditMonths,
        String discountType,
        BigDecimal discount,
        String discountValidityBasedOn,
        Integer discountValidity,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentTermDto fromEntity(PaymentTermDao ePaymentTermDao) {
        return new PaymentTermDto(
                ePaymentTermDao.getName(),
                ePaymentTermDao.getCreation(),
                ePaymentTermDao.getModified(),
                ePaymentTermDao.getModifiedBy(),
                ePaymentTermDao.getOwner(),
                ePaymentTermDao.getIsDocStatus(),
                ePaymentTermDao.getIdx(),
                ePaymentTermDao.getPaymentTermName(),
                ePaymentTermDao.getInvoicePortion(),
                ePaymentTermDao.getModeOfPayment(),
                ePaymentTermDao.getDueDateBasedOn(),
                ePaymentTermDao.getCreditDays(),
                ePaymentTermDao.getCreditMonths(),
                ePaymentTermDao.getDiscountType(),
                ePaymentTermDao.getDiscount(),
                ePaymentTermDao.getDiscountValidityBasedOn(),
                ePaymentTermDao.getDiscountValidity(),
                ePaymentTermDao.getDescription(),
                ePaymentTermDao.getUserTags(),
                ePaymentTermDao.getComments(),
                ePaymentTermDao.getAssign(),
                ePaymentTermDao.getLikedBy());
    }

    public static void fromDTO(PaymentTermDto vPaymentTermDto, PaymentTermDao ePaymentTermDao) {
        ePaymentTermDao.setName(vPaymentTermDto.name());
        ePaymentTermDao.setCreation(vPaymentTermDto.creation());
        ePaymentTermDao.setModified(vPaymentTermDto.modified());
        ePaymentTermDao.setModifiedBy(vPaymentTermDto.modifiedBy());
        ePaymentTermDao.setOwner(vPaymentTermDto.owner());
        ePaymentTermDao.setIsDocStatus(vPaymentTermDto.isDocStatus());
        ePaymentTermDao.setIdx(vPaymentTermDto.idx());
        ePaymentTermDao.setPaymentTermName(vPaymentTermDto.paymentTermName());
        ePaymentTermDao.setInvoicePortion(vPaymentTermDto.invoicePortion());
        ePaymentTermDao.setModeOfPayment(vPaymentTermDto.modeOfPayment());
        ePaymentTermDao.setDueDateBasedOn(vPaymentTermDto.dueDateBasedOn());
        ePaymentTermDao.setCreditDays(vPaymentTermDto.creditDays());
        ePaymentTermDao.setCreditMonths(vPaymentTermDto.creditMonths());
        ePaymentTermDao.setDiscountType(vPaymentTermDto.discountType());
        ePaymentTermDao.setDiscount(vPaymentTermDto.discount());
        ePaymentTermDao.setDiscountValidityBasedOn(vPaymentTermDto.discountValidityBasedOn());
        ePaymentTermDao.setDiscountValidity(vPaymentTermDto.discountValidity());
        ePaymentTermDao.setDescription(vPaymentTermDto.description());
        ePaymentTermDao.setUserTags(vPaymentTermDto.userTags());
        ePaymentTermDao.setComments(vPaymentTermDto.comments());
        ePaymentTermDao.setAssign(vPaymentTermDto.assign());
        ePaymentTermDao.setLikedBy(vPaymentTermDto.likedBy());
    }
}