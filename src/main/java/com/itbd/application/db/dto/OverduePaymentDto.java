package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.OverduePaymentDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record OverduePaymentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesInvoice,
        String paymentSchedule,
        Integer dunningLevel,
        String paymentTerm,
        String description,
        LocalDate dueDate,
        String overdueDays,
        String modeOfPayment,
        BigDecimal invoicePortion,
        BigDecimal paymentAmount,
        BigDecimal outstanding,
        BigDecimal paidAmount,
        BigDecimal discountedAmount,
        BigDecimal interest,
        String parent,
        String parentField,
        String parentType
) {
    public static OverduePaymentDto fromEntity(OverduePaymentDao eOverduePaymentDao) {
        return new OverduePaymentDto(
                eOverduePaymentDao.getName(),
                eOverduePaymentDao.getCreation(),
                eOverduePaymentDao.getModified(),
                eOverduePaymentDao.getModifiedBy(),
                eOverduePaymentDao.getOwner(),
                eOverduePaymentDao.getIsDocStatus(),
                eOverduePaymentDao.getIdx(),
                eOverduePaymentDao.getSalesInvoice(),
                eOverduePaymentDao.getPaymentSchedule(),
                eOverduePaymentDao.getDunningLevel(),
                eOverduePaymentDao.getPaymentTerm(),
                eOverduePaymentDao.getDescription(),
                eOverduePaymentDao.getDueDate(),
                eOverduePaymentDao.getOverdueDays(),
                eOverduePaymentDao.getModeOfPayment(),
                eOverduePaymentDao.getInvoicePortion(),
                eOverduePaymentDao.getPaymentAmount(),
                eOverduePaymentDao.getOutstanding(),
                eOverduePaymentDao.getPaidAmount(),
                eOverduePaymentDao.getDiscountedAmount(),
                eOverduePaymentDao.getInterest(),
                eOverduePaymentDao.getParent(),
                eOverduePaymentDao.getParentField(),
                eOverduePaymentDao.getParentType());
    }

    public static void fromDTO(OverduePaymentDto vOverduePaymentDto, OverduePaymentDao eOverduePaymentDao) {
        eOverduePaymentDao.setName(vOverduePaymentDto.name());
        eOverduePaymentDao.setCreation(vOverduePaymentDto.creation());
        eOverduePaymentDao.setModified(vOverduePaymentDto.modified());
        eOverduePaymentDao.setModifiedBy(vOverduePaymentDto.modifiedBy());
        eOverduePaymentDao.setOwner(vOverduePaymentDto.owner());
        eOverduePaymentDao.setIsDocStatus(vOverduePaymentDto.isDocStatus());
        eOverduePaymentDao.setIdx(vOverduePaymentDto.idx());
        eOverduePaymentDao.setSalesInvoice(vOverduePaymentDto.salesInvoice());
        eOverduePaymentDao.setPaymentSchedule(vOverduePaymentDto.paymentSchedule());
        eOverduePaymentDao.setDunningLevel(vOverduePaymentDto.dunningLevel());
        eOverduePaymentDao.setPaymentTerm(vOverduePaymentDto.paymentTerm());
        eOverduePaymentDao.setDescription(vOverduePaymentDto.description());
        eOverduePaymentDao.setDueDate(vOverduePaymentDto.dueDate());
        eOverduePaymentDao.setOverdueDays(vOverduePaymentDto.overdueDays());
        eOverduePaymentDao.setModeOfPayment(vOverduePaymentDto.modeOfPayment());
        eOverduePaymentDao.setInvoicePortion(vOverduePaymentDto.invoicePortion());
        eOverduePaymentDao.setPaymentAmount(vOverduePaymentDto.paymentAmount());
        eOverduePaymentDao.setOutstanding(vOverduePaymentDto.outstanding());
        eOverduePaymentDao.setPaidAmount(vOverduePaymentDto.paidAmount());
        eOverduePaymentDao.setDiscountedAmount(vOverduePaymentDto.discountedAmount());
        eOverduePaymentDao.setInterest(vOverduePaymentDto.interest());
        eOverduePaymentDao.setParent(vOverduePaymentDto.parent());
        eOverduePaymentDao.setParentField(vOverduePaymentDto.parentField());
        eOverduePaymentDao.setParentType(vOverduePaymentDto.parentType());
    }
}