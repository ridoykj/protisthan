package com.itbd.application.db.dto.subscription;

import com.itbd.application.db.dao.subscription.SubscriptionInvoiceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SubscriptionInvoiceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String invoice,
        String parent,
        String parentField,
        String parentType
) {
    public static SubscriptionInvoiceDto fromEntity(SubscriptionInvoiceDao eSubscriptionInvoiceDao) {
        return new SubscriptionInvoiceDto(
                eSubscriptionInvoiceDao.getName(),
                eSubscriptionInvoiceDao.getCreation(),
                eSubscriptionInvoiceDao.getModified(),
                eSubscriptionInvoiceDao.getModifiedBy(),
                eSubscriptionInvoiceDao.getOwner(),
                eSubscriptionInvoiceDao.getIsDocStatus(),
                eSubscriptionInvoiceDao.getIdx(),
                eSubscriptionInvoiceDao.getDocumentType(),
                eSubscriptionInvoiceDao.getInvoice(),
                eSubscriptionInvoiceDao.getParent(),
                eSubscriptionInvoiceDao.getParentField(),
                eSubscriptionInvoiceDao.getParentType());
    }

    public static void fromDTO(SubscriptionInvoiceDto vSubscriptionInvoiceDto, SubscriptionInvoiceDao eSubscriptionInvoiceDao) {
        eSubscriptionInvoiceDao.setName(vSubscriptionInvoiceDto.name());
        eSubscriptionInvoiceDao.setCreation(vSubscriptionInvoiceDto.creation());
        eSubscriptionInvoiceDao.setModified(vSubscriptionInvoiceDto.modified());
        eSubscriptionInvoiceDao.setModifiedBy(vSubscriptionInvoiceDto.modifiedBy());
        eSubscriptionInvoiceDao.setOwner(vSubscriptionInvoiceDto.owner());
        eSubscriptionInvoiceDao.setIsDocStatus(vSubscriptionInvoiceDto.isDocStatus());
        eSubscriptionInvoiceDao.setIdx(vSubscriptionInvoiceDto.idx());
        eSubscriptionInvoiceDao.setDocumentType(vSubscriptionInvoiceDto.documentType());
        eSubscriptionInvoiceDao.setInvoice(vSubscriptionInvoiceDto.invoice());
        eSubscriptionInvoiceDao.setParent(vSubscriptionInvoiceDto.parent());
        eSubscriptionInvoiceDao.setParentField(vSubscriptionInvoiceDto.parentField());
        eSubscriptionInvoiceDao.setParentType(vSubscriptionInvoiceDto.parentType());
    }
}