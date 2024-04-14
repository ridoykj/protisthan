package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesInvoiceAdvanceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SalesInvoiceAdvanceDto(
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
        String remarks,
        String referenceRow,
        BigDecimal advanceAmount,
        BigDecimal allocatedAmount,
        BigDecimal exchangeGainLoss,
        BigDecimal refExchangeRate,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesInvoiceAdvanceDto fromEntity(SalesInvoiceAdvanceDao eSalesInvoiceAdvanceDao) {
        return new SalesInvoiceAdvanceDto(
                eSalesInvoiceAdvanceDao.getName(),
                eSalesInvoiceAdvanceDao.getCreation(),
                eSalesInvoiceAdvanceDao.getModified(),
                eSalesInvoiceAdvanceDao.getModifiedBy(),
                eSalesInvoiceAdvanceDao.getOwner(),
                eSalesInvoiceAdvanceDao.getIsDocStatus(),
                eSalesInvoiceAdvanceDao.getIdx(),
                eSalesInvoiceAdvanceDao.getReferenceType(),
                eSalesInvoiceAdvanceDao.getReferenceName(),
                eSalesInvoiceAdvanceDao.getRemarks(),
                eSalesInvoiceAdvanceDao.getReferenceRow(),
                eSalesInvoiceAdvanceDao.getAdvanceAmount(),
                eSalesInvoiceAdvanceDao.getAllocatedAmount(),
                eSalesInvoiceAdvanceDao.getExchangeGainLoss(),
                eSalesInvoiceAdvanceDao.getRefExchangeRate(),
                eSalesInvoiceAdvanceDao.getParent(),
                eSalesInvoiceAdvanceDao.getParentField(),
                eSalesInvoiceAdvanceDao.getParentType());
    }

    public static void fromDTO(SalesInvoiceAdvanceDto vSalesInvoiceAdvanceDto, SalesInvoiceAdvanceDao eSalesInvoiceAdvanceDao) {
        eSalesInvoiceAdvanceDao.setName(vSalesInvoiceAdvanceDto.name());
        eSalesInvoiceAdvanceDao.setCreation(vSalesInvoiceAdvanceDto.creation());
        eSalesInvoiceAdvanceDao.setModified(vSalesInvoiceAdvanceDto.modified());
        eSalesInvoiceAdvanceDao.setModifiedBy(vSalesInvoiceAdvanceDto.modifiedBy());
        eSalesInvoiceAdvanceDao.setOwner(vSalesInvoiceAdvanceDto.owner());
        eSalesInvoiceAdvanceDao.setIsDocStatus(vSalesInvoiceAdvanceDto.isDocStatus());
        eSalesInvoiceAdvanceDao.setIdx(vSalesInvoiceAdvanceDto.idx());
        eSalesInvoiceAdvanceDao.setReferenceType(vSalesInvoiceAdvanceDto.referenceType());
        eSalesInvoiceAdvanceDao.setReferenceName(vSalesInvoiceAdvanceDto.referenceName());
        eSalesInvoiceAdvanceDao.setRemarks(vSalesInvoiceAdvanceDto.remarks());
        eSalesInvoiceAdvanceDao.setReferenceRow(vSalesInvoiceAdvanceDto.referenceRow());
        eSalesInvoiceAdvanceDao.setAdvanceAmount(vSalesInvoiceAdvanceDto.advanceAmount());
        eSalesInvoiceAdvanceDao.setAllocatedAmount(vSalesInvoiceAdvanceDto.allocatedAmount());
        eSalesInvoiceAdvanceDao.setExchangeGainLoss(vSalesInvoiceAdvanceDto.exchangeGainLoss());
        eSalesInvoiceAdvanceDao.setRefExchangeRate(vSalesInvoiceAdvanceDto.refExchangeRate());
        eSalesInvoiceAdvanceDao.setParent(vSalesInvoiceAdvanceDto.parent());
        eSalesInvoiceAdvanceDao.setParentField(vSalesInvoiceAdvanceDto.parentField());
        eSalesInvoiceAdvanceDao.setParentType(vSalesInvoiceAdvanceDto.parentType());
    }
}