package com.itbd.application.db.dto;

import com.itbd.application.db.dao.UnreconcilePaymentEntriesDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record UnreconcilePaymentEntriesDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String partyType,
        String party,
        String referenceDocType,
        String referenceName,
        BigDecimal allocatedAmount,
        String accountCurrency,
        Boolean unlinked,
        String parent,
        String parentField,
        String parentType
) {
    public static UnreconcilePaymentEntriesDto fromEntity(UnreconcilePaymentEntriesDao eUnreconcilePaymentEntriesDao) {
        return new UnreconcilePaymentEntriesDto(
                eUnreconcilePaymentEntriesDao.getName(),
                eUnreconcilePaymentEntriesDao.getCreation(),
                eUnreconcilePaymentEntriesDao.getModified(),
                eUnreconcilePaymentEntriesDao.getModifiedBy(),
                eUnreconcilePaymentEntriesDao.getOwner(),
                eUnreconcilePaymentEntriesDao.getIsDocStatus(),
                eUnreconcilePaymentEntriesDao.getIdx(),
                eUnreconcilePaymentEntriesDao.getAccount(),
                eUnreconcilePaymentEntriesDao.getPartyType(),
                eUnreconcilePaymentEntriesDao.getParty(),
                eUnreconcilePaymentEntriesDao.getReferenceDocType(),
                eUnreconcilePaymentEntriesDao.getReferenceName(),
                eUnreconcilePaymentEntriesDao.getAllocatedAmount(),
                eUnreconcilePaymentEntriesDao.getAccountCurrency(),
                eUnreconcilePaymentEntriesDao.getUnlinked(),
                eUnreconcilePaymentEntriesDao.getParent(),
                eUnreconcilePaymentEntriesDao.getParentField(),
                eUnreconcilePaymentEntriesDao.getParentType());
    }

    public static void fromDTO(UnreconcilePaymentEntriesDto vUnreconcilePaymentEntriesDto, UnreconcilePaymentEntriesDao eUnreconcilePaymentEntriesDao) {
        eUnreconcilePaymentEntriesDao.setName(vUnreconcilePaymentEntriesDto.name());
        eUnreconcilePaymentEntriesDao.setCreation(vUnreconcilePaymentEntriesDto.creation());
        eUnreconcilePaymentEntriesDao.setModified(vUnreconcilePaymentEntriesDto.modified());
        eUnreconcilePaymentEntriesDao.setModifiedBy(vUnreconcilePaymentEntriesDto.modifiedBy());
        eUnreconcilePaymentEntriesDao.setOwner(vUnreconcilePaymentEntriesDto.owner());
        eUnreconcilePaymentEntriesDao.setIsDocStatus(vUnreconcilePaymentEntriesDto.isDocStatus());
        eUnreconcilePaymentEntriesDao.setIdx(vUnreconcilePaymentEntriesDto.idx());
        eUnreconcilePaymentEntriesDao.setAccount(vUnreconcilePaymentEntriesDto.account());
        eUnreconcilePaymentEntriesDao.setPartyType(vUnreconcilePaymentEntriesDto.partyType());
        eUnreconcilePaymentEntriesDao.setParty(vUnreconcilePaymentEntriesDto.party());
        eUnreconcilePaymentEntriesDao.setReferenceDocType(vUnreconcilePaymentEntriesDto.referenceDocType());
        eUnreconcilePaymentEntriesDao.setReferenceName(vUnreconcilePaymentEntriesDto.referenceName());
        eUnreconcilePaymentEntriesDao.setAllocatedAmount(vUnreconcilePaymentEntriesDto.allocatedAmount());
        eUnreconcilePaymentEntriesDao.setAccountCurrency(vUnreconcilePaymentEntriesDto.accountCurrency());
        eUnreconcilePaymentEntriesDao.setUnlinked(vUnreconcilePaymentEntriesDto.unlinked());
        eUnreconcilePaymentEntriesDao.setParent(vUnreconcilePaymentEntriesDto.parent());
        eUnreconcilePaymentEntriesDao.setParentField(vUnreconcilePaymentEntriesDto.parentField());
        eUnreconcilePaymentEntriesDao.setParentType(vUnreconcilePaymentEntriesDto.parentType());
    }
}