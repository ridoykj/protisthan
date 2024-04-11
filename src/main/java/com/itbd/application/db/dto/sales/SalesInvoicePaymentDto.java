package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesInvoicePaymentDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SalesInvoicePaymentDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean defaults,
        String modeOfPayment,
        BigDecimal amount,
        String referenceNo,
        String account,
        String type,
        BigDecimal baseAmount,
        LocalDate clearanceDate,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesInvoicePaymentDto fromEntity(SalesInvoicePaymentDao eSalesInvoicePaymentDao) {
        return new SalesInvoicePaymentDto(
                eSalesInvoicePaymentDao.getName(),
                eSalesInvoicePaymentDao.getCreation(),
                eSalesInvoicePaymentDao.getModified(),
                eSalesInvoicePaymentDao.getModifiedBy(),
                eSalesInvoicePaymentDao.getOwner(),
                eSalesInvoicePaymentDao.getIsDocStatus(),
                eSalesInvoicePaymentDao.getIdx(),
                eSalesInvoicePaymentDao.getDefaults(),
                eSalesInvoicePaymentDao.getModeOfPayment(),
                eSalesInvoicePaymentDao.getAmount(),
                eSalesInvoicePaymentDao.getReferenceNo(),
                eSalesInvoicePaymentDao.getAccount(),
                eSalesInvoicePaymentDao.getType(),
                eSalesInvoicePaymentDao.getBaseAmount(),
                eSalesInvoicePaymentDao.getClearanceDate(),
                eSalesInvoicePaymentDao.getParent(),
                eSalesInvoicePaymentDao.getParentField(),
                eSalesInvoicePaymentDao.getParentType());
    }

    public static void fromDTO(SalesInvoicePaymentDto vSalesInvoicePaymentDto, SalesInvoicePaymentDao eSalesInvoicePaymentDao) {
        eSalesInvoicePaymentDao.setName(vSalesInvoicePaymentDto.name());
        eSalesInvoicePaymentDao.setCreation(vSalesInvoicePaymentDto.creation());
        eSalesInvoicePaymentDao.setModified(vSalesInvoicePaymentDto.modified());
        eSalesInvoicePaymentDao.setModifiedBy(vSalesInvoicePaymentDto.modifiedBy());
        eSalesInvoicePaymentDao.setOwner(vSalesInvoicePaymentDto.owner());
        eSalesInvoicePaymentDao.setIsDocStatus(vSalesInvoicePaymentDto.isDocStatus());
        eSalesInvoicePaymentDao.setIdx(vSalesInvoicePaymentDto.idx());
        eSalesInvoicePaymentDao.setDefaults(vSalesInvoicePaymentDto.defaults());
        eSalesInvoicePaymentDao.setModeOfPayment(vSalesInvoicePaymentDto.modeOfPayment());
        eSalesInvoicePaymentDao.setAmount(vSalesInvoicePaymentDto.amount());
        eSalesInvoicePaymentDao.setReferenceNo(vSalesInvoicePaymentDto.referenceNo());
        eSalesInvoicePaymentDao.setAccount(vSalesInvoicePaymentDto.account());
        eSalesInvoicePaymentDao.setType(vSalesInvoicePaymentDto.type());
        eSalesInvoicePaymentDao.setBaseAmount(vSalesInvoicePaymentDto.baseAmount());
        eSalesInvoicePaymentDao.setClearanceDate(vSalesInvoicePaymentDto.clearanceDate());
        eSalesInvoicePaymentDao.setParent(vSalesInvoicePaymentDto.parent());
        eSalesInvoicePaymentDao.setParentField(vSalesInvoicePaymentDto.parentField());
        eSalesInvoicePaymentDao.setParentType(vSalesInvoicePaymentDto.parentType());
    }
}