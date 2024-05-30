package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.DiscountedInvoiceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record DiscountedInvoiceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesInvoice,
        String customer,
        LocalDate postingDate,
        BigDecimal outstandingAmount,
        String debitTo,
        String parent,
        String parentField,
        String parentType
) {
    public static DiscountedInvoiceDto fromEntity(DiscountedInvoiceDao eDiscountedInvoiceDao) {
        return new DiscountedInvoiceDto(
                eDiscountedInvoiceDao.getName(),
                eDiscountedInvoiceDao.getCreation(),
                eDiscountedInvoiceDao.getModified(),
                eDiscountedInvoiceDao.getModifiedBy(),
                eDiscountedInvoiceDao.getOwner(),
                eDiscountedInvoiceDao.getIsDocStatus(),
                eDiscountedInvoiceDao.getIdx(),
                eDiscountedInvoiceDao.getSalesInvoice(),
                eDiscountedInvoiceDao.getCustomer(),
                eDiscountedInvoiceDao.getPostingDate(),
                eDiscountedInvoiceDao.getOutstandingAmount(),
                eDiscountedInvoiceDao.getDebitTo(),
                eDiscountedInvoiceDao.getParent(),
                eDiscountedInvoiceDao.getParentField(),
                eDiscountedInvoiceDao.getParentType());
    }

    public static void fromDTO(DiscountedInvoiceDto vDiscountedInvoiceDto, DiscountedInvoiceDao eDiscountedInvoiceDao) {
        eDiscountedInvoiceDao.setName(vDiscountedInvoiceDto.name());
        eDiscountedInvoiceDao.setCreation(vDiscountedInvoiceDto.creation());
        eDiscountedInvoiceDao.setModified(vDiscountedInvoiceDto.modified());
        eDiscountedInvoiceDao.setModifiedBy(vDiscountedInvoiceDto.modifiedBy());
        eDiscountedInvoiceDao.setOwner(vDiscountedInvoiceDto.owner());
        eDiscountedInvoiceDao.setIsDocStatus(vDiscountedInvoiceDto.isDocStatus());
        eDiscountedInvoiceDao.setIdx(vDiscountedInvoiceDto.idx());
        eDiscountedInvoiceDao.setSalesInvoice(vDiscountedInvoiceDto.salesInvoice());
        eDiscountedInvoiceDao.setCustomer(vDiscountedInvoiceDto.customer());
        eDiscountedInvoiceDao.setPostingDate(vDiscountedInvoiceDto.postingDate());
        eDiscountedInvoiceDao.setOutstandingAmount(vDiscountedInvoiceDto.outstandingAmount());
        eDiscountedInvoiceDao.setDebitTo(vDiscountedInvoiceDto.debitTo());
        eDiscountedInvoiceDao.setParent(vDiscountedInvoiceDto.parent());
        eDiscountedInvoiceDao.setParentField(vDiscountedInvoiceDto.parentField());
        eDiscountedInvoiceDao.setParentType(vDiscountedInvoiceDto.parentType());
    }
}