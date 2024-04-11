package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProcessPaymentReconciliationDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProcessPaymentReconciliationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String partyType,
        String party,
        String receivablePayableAccount,
        LocalDate fromInvoiceDate,
        LocalDate toInvoiceDate,
        LocalDate fromPaymentDate,
        LocalDate toPaymentDate,
        String costCenter,
        String bankCashAccount,
        String status,
        String errorLog,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProcessPaymentReconciliationDto fromEntity(ProcessPaymentReconciliationDao eProcessPaymentReconciliationDao) {
        return new ProcessPaymentReconciliationDto(
                eProcessPaymentReconciliationDao.getName(),
                eProcessPaymentReconciliationDao.getCreation(),
                eProcessPaymentReconciliationDao.getModified(),
                eProcessPaymentReconciliationDao.getModifiedBy(),
                eProcessPaymentReconciliationDao.getOwner(),
                eProcessPaymentReconciliationDao.getIsDocStatus(),
                eProcessPaymentReconciliationDao.getIdx(),
                eProcessPaymentReconciliationDao.getCompany(),
                eProcessPaymentReconciliationDao.getPartyType(),
                eProcessPaymentReconciliationDao.getParty(),
                eProcessPaymentReconciliationDao.getReceivablePayableAccount(),
                eProcessPaymentReconciliationDao.getFromInvoiceDate(),
                eProcessPaymentReconciliationDao.getToInvoiceDate(),
                eProcessPaymentReconciliationDao.getFromPaymentDate(),
                eProcessPaymentReconciliationDao.getToPaymentDate(),
                eProcessPaymentReconciliationDao.getCostCenter(),
                eProcessPaymentReconciliationDao.getBankCashAccount(),
                eProcessPaymentReconciliationDao.getStatus(),
                eProcessPaymentReconciliationDao.getErrorLog(),
                eProcessPaymentReconciliationDao.getAmendedFrom(),
                eProcessPaymentReconciliationDao.getUserTags(),
                eProcessPaymentReconciliationDao.getComments(),
                eProcessPaymentReconciliationDao.getAssign(),
                eProcessPaymentReconciliationDao.getLikedBy());
    }

    public static void fromDTO(ProcessPaymentReconciliationDto vProcessPaymentReconciliationDto, ProcessPaymentReconciliationDao eProcessPaymentReconciliationDao) {
        eProcessPaymentReconciliationDao.setName(vProcessPaymentReconciliationDto.name());
        eProcessPaymentReconciliationDao.setCreation(vProcessPaymentReconciliationDto.creation());
        eProcessPaymentReconciliationDao.setModified(vProcessPaymentReconciliationDto.modified());
        eProcessPaymentReconciliationDao.setModifiedBy(vProcessPaymentReconciliationDto.modifiedBy());
        eProcessPaymentReconciliationDao.setOwner(vProcessPaymentReconciliationDto.owner());
        eProcessPaymentReconciliationDao.setIsDocStatus(vProcessPaymentReconciliationDto.isDocStatus());
        eProcessPaymentReconciliationDao.setIdx(vProcessPaymentReconciliationDto.idx());
        eProcessPaymentReconciliationDao.setCompany(vProcessPaymentReconciliationDto.company());
        eProcessPaymentReconciliationDao.setPartyType(vProcessPaymentReconciliationDto.partyType());
        eProcessPaymentReconciliationDao.setParty(vProcessPaymentReconciliationDto.party());
        eProcessPaymentReconciliationDao.setReceivablePayableAccount(vProcessPaymentReconciliationDto.receivablePayableAccount());
        eProcessPaymentReconciliationDao.setFromInvoiceDate(vProcessPaymentReconciliationDto.fromInvoiceDate());
        eProcessPaymentReconciliationDao.setToInvoiceDate(vProcessPaymentReconciliationDto.toInvoiceDate());
        eProcessPaymentReconciliationDao.setFromPaymentDate(vProcessPaymentReconciliationDto.fromPaymentDate());
        eProcessPaymentReconciliationDao.setToPaymentDate(vProcessPaymentReconciliationDto.toPaymentDate());
        eProcessPaymentReconciliationDao.setCostCenter(vProcessPaymentReconciliationDto.costCenter());
        eProcessPaymentReconciliationDao.setBankCashAccount(vProcessPaymentReconciliationDto.bankCashAccount());
        eProcessPaymentReconciliationDao.setStatus(vProcessPaymentReconciliationDto.status());
        eProcessPaymentReconciliationDao.setErrorLog(vProcessPaymentReconciliationDto.errorLog());
        eProcessPaymentReconciliationDao.setAmendedFrom(vProcessPaymentReconciliationDto.amendedFrom());
        eProcessPaymentReconciliationDao.setUserTags(vProcessPaymentReconciliationDto.userTags());
        eProcessPaymentReconciliationDao.setComments(vProcessPaymentReconciliationDto.comments());
        eProcessPaymentReconciliationDao.setAssign(vProcessPaymentReconciliationDto.assign());
        eProcessPaymentReconciliationDao.setLikedBy(vProcessPaymentReconciliationDto.likedBy());
    }
}