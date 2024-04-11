package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentTermsTemplateDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentTermsTemplateDetailDto(
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
        BigDecimal invoicePortion,
        String modeOfPayment,
        String dueDateBasedOn,
        Integer creditDays,
        Integer creditMonths,
        String discountType,
        BigDecimal discount,
        String discountValidityBasedOn,
        Integer discountValidity,
        String parent,
        String parentField,
        String parentType
) {
    public static PaymentTermsTemplateDetailDto fromEntity(PaymentTermsTemplateDetailDao ePaymentTermsTemplateDetailDao) {
        return new PaymentTermsTemplateDetailDto(
                ePaymentTermsTemplateDetailDao.getName(),
                ePaymentTermsTemplateDetailDao.getCreation(),
                ePaymentTermsTemplateDetailDao.getModified(),
                ePaymentTermsTemplateDetailDao.getModifiedBy(),
                ePaymentTermsTemplateDetailDao.getOwner(),
                ePaymentTermsTemplateDetailDao.getIsDocStatus(),
                ePaymentTermsTemplateDetailDao.getIdx(),
                ePaymentTermsTemplateDetailDao.getPaymentTerm(),
                ePaymentTermsTemplateDetailDao.getDescription(),
                ePaymentTermsTemplateDetailDao.getInvoicePortion(),
                ePaymentTermsTemplateDetailDao.getModeOfPayment(),
                ePaymentTermsTemplateDetailDao.getDueDateBasedOn(),
                ePaymentTermsTemplateDetailDao.getCreditDays(),
                ePaymentTermsTemplateDetailDao.getCreditMonths(),
                ePaymentTermsTemplateDetailDao.getDiscountType(),
                ePaymentTermsTemplateDetailDao.getDiscount(),
                ePaymentTermsTemplateDetailDao.getDiscountValidityBasedOn(),
                ePaymentTermsTemplateDetailDao.getDiscountValidity(),
                ePaymentTermsTemplateDetailDao.getParent(),
                ePaymentTermsTemplateDetailDao.getParentField(),
                ePaymentTermsTemplateDetailDao.getParentType());
    }

    public static void fromDTO(PaymentTermsTemplateDetailDto vPaymentTermsTemplateDetailDto, PaymentTermsTemplateDetailDao ePaymentTermsTemplateDetailDao) {
        ePaymentTermsTemplateDetailDao.setName(vPaymentTermsTemplateDetailDto.name());
        ePaymentTermsTemplateDetailDao.setCreation(vPaymentTermsTemplateDetailDto.creation());
        ePaymentTermsTemplateDetailDao.setModified(vPaymentTermsTemplateDetailDto.modified());
        ePaymentTermsTemplateDetailDao.setModifiedBy(vPaymentTermsTemplateDetailDto.modifiedBy());
        ePaymentTermsTemplateDetailDao.setOwner(vPaymentTermsTemplateDetailDto.owner());
        ePaymentTermsTemplateDetailDao.setIsDocStatus(vPaymentTermsTemplateDetailDto.isDocStatus());
        ePaymentTermsTemplateDetailDao.setIdx(vPaymentTermsTemplateDetailDto.idx());
        ePaymentTermsTemplateDetailDao.setPaymentTerm(vPaymentTermsTemplateDetailDto.paymentTerm());
        ePaymentTermsTemplateDetailDao.setDescription(vPaymentTermsTemplateDetailDto.description());
        ePaymentTermsTemplateDetailDao.setInvoicePortion(vPaymentTermsTemplateDetailDto.invoicePortion());
        ePaymentTermsTemplateDetailDao.setModeOfPayment(vPaymentTermsTemplateDetailDto.modeOfPayment());
        ePaymentTermsTemplateDetailDao.setDueDateBasedOn(vPaymentTermsTemplateDetailDto.dueDateBasedOn());
        ePaymentTermsTemplateDetailDao.setCreditDays(vPaymentTermsTemplateDetailDto.creditDays());
        ePaymentTermsTemplateDetailDao.setCreditMonths(vPaymentTermsTemplateDetailDto.creditMonths());
        ePaymentTermsTemplateDetailDao.setDiscountType(vPaymentTermsTemplateDetailDto.discountType());
        ePaymentTermsTemplateDetailDao.setDiscount(vPaymentTermsTemplateDetailDto.discount());
        ePaymentTermsTemplateDetailDao.setDiscountValidityBasedOn(vPaymentTermsTemplateDetailDto.discountValidityBasedOn());
        ePaymentTermsTemplateDetailDao.setDiscountValidity(vPaymentTermsTemplateDetailDto.discountValidity());
        ePaymentTermsTemplateDetailDao.setParent(vPaymentTermsTemplateDetailDto.parent());
        ePaymentTermsTemplateDetailDao.setParentField(vPaymentTermsTemplateDetailDto.parentField());
        ePaymentTermsTemplateDetailDao.setParentType(vPaymentTermsTemplateDetailDto.parentType());
    }
}