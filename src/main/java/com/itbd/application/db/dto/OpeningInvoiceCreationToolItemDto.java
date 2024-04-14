package com.itbd.application.db.dto;

import com.itbd.application.db.dao.OpeningInvoiceCreationToolItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record OpeningInvoiceCreationToolItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String invoiceNumber,
        String partyType,
        String party,
        String temporaryOpeningAccount,
        LocalDate postingDate,
        LocalDate dueDate,
        String itemName,
        BigDecimal outstandingAmount,
        String qty,
        String costCenter,
        String parent,
        String parentField,
        String parentType
) {
    public static OpeningInvoiceCreationToolItemDto fromEntity(OpeningInvoiceCreationToolItemDao eOpeningInvoiceCreationToolItemDao) {
        return new OpeningInvoiceCreationToolItemDto(
                eOpeningInvoiceCreationToolItemDao.getName(),
                eOpeningInvoiceCreationToolItemDao.getCreation(),
                eOpeningInvoiceCreationToolItemDao.getModified(),
                eOpeningInvoiceCreationToolItemDao.getModifiedBy(),
                eOpeningInvoiceCreationToolItemDao.getOwner(),
                eOpeningInvoiceCreationToolItemDao.getIsDocStatus(),
                eOpeningInvoiceCreationToolItemDao.getIdx(),
                eOpeningInvoiceCreationToolItemDao.getInvoiceNumber(),
                eOpeningInvoiceCreationToolItemDao.getPartyType(),
                eOpeningInvoiceCreationToolItemDao.getParty(),
                eOpeningInvoiceCreationToolItemDao.getTemporaryOpeningAccount(),
                eOpeningInvoiceCreationToolItemDao.getPostingDate(),
                eOpeningInvoiceCreationToolItemDao.getDueDate(),
                eOpeningInvoiceCreationToolItemDao.getItemName(),
                eOpeningInvoiceCreationToolItemDao.getOutstandingAmount(),
                eOpeningInvoiceCreationToolItemDao.getQty(),
                eOpeningInvoiceCreationToolItemDao.getCostCenter(),
                eOpeningInvoiceCreationToolItemDao.getParent(),
                eOpeningInvoiceCreationToolItemDao.getParentField(),
                eOpeningInvoiceCreationToolItemDao.getParentType());
    }

    public static void fromDTO(OpeningInvoiceCreationToolItemDto vOpeningInvoiceCreationToolItemDto, OpeningInvoiceCreationToolItemDao eOpeningInvoiceCreationToolItemDao) {
        eOpeningInvoiceCreationToolItemDao.setName(vOpeningInvoiceCreationToolItemDto.name());
        eOpeningInvoiceCreationToolItemDao.setCreation(vOpeningInvoiceCreationToolItemDto.creation());
        eOpeningInvoiceCreationToolItemDao.setModified(vOpeningInvoiceCreationToolItemDto.modified());
        eOpeningInvoiceCreationToolItemDao.setModifiedBy(vOpeningInvoiceCreationToolItemDto.modifiedBy());
        eOpeningInvoiceCreationToolItemDao.setOwner(vOpeningInvoiceCreationToolItemDto.owner());
        eOpeningInvoiceCreationToolItemDao.setIsDocStatus(vOpeningInvoiceCreationToolItemDto.isDocStatus());
        eOpeningInvoiceCreationToolItemDao.setIdx(vOpeningInvoiceCreationToolItemDto.idx());
        eOpeningInvoiceCreationToolItemDao.setInvoiceNumber(vOpeningInvoiceCreationToolItemDto.invoiceNumber());
        eOpeningInvoiceCreationToolItemDao.setPartyType(vOpeningInvoiceCreationToolItemDto.partyType());
        eOpeningInvoiceCreationToolItemDao.setParty(vOpeningInvoiceCreationToolItemDto.party());
        eOpeningInvoiceCreationToolItemDao.setTemporaryOpeningAccount(vOpeningInvoiceCreationToolItemDto.temporaryOpeningAccount());
        eOpeningInvoiceCreationToolItemDao.setPostingDate(vOpeningInvoiceCreationToolItemDto.postingDate());
        eOpeningInvoiceCreationToolItemDao.setDueDate(vOpeningInvoiceCreationToolItemDto.dueDate());
        eOpeningInvoiceCreationToolItemDao.setItemName(vOpeningInvoiceCreationToolItemDto.itemName());
        eOpeningInvoiceCreationToolItemDao.setOutstandingAmount(vOpeningInvoiceCreationToolItemDto.outstandingAmount());
        eOpeningInvoiceCreationToolItemDao.setQty(vOpeningInvoiceCreationToolItemDto.qty());
        eOpeningInvoiceCreationToolItemDao.setCostCenter(vOpeningInvoiceCreationToolItemDto.costCenter());
        eOpeningInvoiceCreationToolItemDao.setParent(vOpeningInvoiceCreationToolItemDto.parent());
        eOpeningInvoiceCreationToolItemDao.setParentField(vOpeningInvoiceCreationToolItemDto.parentField());
        eOpeningInvoiceCreationToolItemDao.setParentType(vOpeningInvoiceCreationToolItemDto.parentType());
    }
}