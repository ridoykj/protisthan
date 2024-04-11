package com.itbd.application.db.dto;

import com.itbd.application.db.dao.RequestForQuotationSupplierDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RequestForQuotationSupplierDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String supplier,
        String contact,
        String quoteStatus,
        String supplierName,
        String emailId,
        Boolean sendEmail,
        Boolean emailSent,
        String parent,
        String parentField,
        String parentType
) {
    public static RequestForQuotationSupplierDto fromEntity(RequestForQuotationSupplierDao eRequestForQuotationSupplierDao) {
        return new RequestForQuotationSupplierDto(
                eRequestForQuotationSupplierDao.getName(),
                eRequestForQuotationSupplierDao.getCreation(),
                eRequestForQuotationSupplierDao.getModified(),
                eRequestForQuotationSupplierDao.getModifiedBy(),
                eRequestForQuotationSupplierDao.getOwner(),
                eRequestForQuotationSupplierDao.getIsDocStatus(),
                eRequestForQuotationSupplierDao.getIdx(),
                eRequestForQuotationSupplierDao.getSupplier(),
                eRequestForQuotationSupplierDao.getContact(),
                eRequestForQuotationSupplierDao.getQuoteStatus(),
                eRequestForQuotationSupplierDao.getSupplierName(),
                eRequestForQuotationSupplierDao.getEmailId(),
                eRequestForQuotationSupplierDao.getSendEmail(),
                eRequestForQuotationSupplierDao.getEmailSent(),
                eRequestForQuotationSupplierDao.getParent(),
                eRequestForQuotationSupplierDao.getParentField(),
                eRequestForQuotationSupplierDao.getParentType());
    }

    public static void fromDTO(RequestForQuotationSupplierDto vRequestForQuotationSupplierDto, RequestForQuotationSupplierDao eRequestForQuotationSupplierDao) {
        eRequestForQuotationSupplierDao.setName(vRequestForQuotationSupplierDto.name());
        eRequestForQuotationSupplierDao.setCreation(vRequestForQuotationSupplierDto.creation());
        eRequestForQuotationSupplierDao.setModified(vRequestForQuotationSupplierDto.modified());
        eRequestForQuotationSupplierDao.setModifiedBy(vRequestForQuotationSupplierDto.modifiedBy());
        eRequestForQuotationSupplierDao.setOwner(vRequestForQuotationSupplierDto.owner());
        eRequestForQuotationSupplierDao.setIsDocStatus(vRequestForQuotationSupplierDto.isDocStatus());
        eRequestForQuotationSupplierDao.setIdx(vRequestForQuotationSupplierDto.idx());
        eRequestForQuotationSupplierDao.setSupplier(vRequestForQuotationSupplierDto.supplier());
        eRequestForQuotationSupplierDao.setContact(vRequestForQuotationSupplierDto.contact());
        eRequestForQuotationSupplierDao.setQuoteStatus(vRequestForQuotationSupplierDto.quoteStatus());
        eRequestForQuotationSupplierDao.setSupplierName(vRequestForQuotationSupplierDto.supplierName());
        eRequestForQuotationSupplierDao.setEmailId(vRequestForQuotationSupplierDto.emailId());
        eRequestForQuotationSupplierDao.setSendEmail(vRequestForQuotationSupplierDto.sendEmail());
        eRequestForQuotationSupplierDao.setEmailSent(vRequestForQuotationSupplierDto.emailSent());
        eRequestForQuotationSupplierDao.setParent(vRequestForQuotationSupplierDto.parent());
        eRequestForQuotationSupplierDao.setParentField(vRequestForQuotationSupplierDto.parentField());
        eRequestForQuotationSupplierDao.setParentType(vRequestForQuotationSupplierDto.parentType());
    }
}