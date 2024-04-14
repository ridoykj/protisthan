package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankClearanceDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record BankClearanceDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String paymentDocument,
        String paymentEntry,
        String againstAccount,
        String amount,
        LocalDate postingDate,
        String chequeNumber,
        LocalDate chequeDate,
        LocalDate clearanceDate,
        String parent,
        String parentField,
        String parentType
) {
    public static BankClearanceDetailDto fromEntity(BankClearanceDetailDao eBankClearanceDetailDao) {
        return new BankClearanceDetailDto(
                eBankClearanceDetailDao.getName(),
                eBankClearanceDetailDao.getCreation(),
                eBankClearanceDetailDao.getModified(),
                eBankClearanceDetailDao.getModifiedBy(),
                eBankClearanceDetailDao.getOwner(),
                eBankClearanceDetailDao.getIsDocStatus(),
                eBankClearanceDetailDao.getIdx(),
                eBankClearanceDetailDao.getPaymentDocument(),
                eBankClearanceDetailDao.getPaymentEntry(),
                eBankClearanceDetailDao.getAgainstAccount(),
                eBankClearanceDetailDao.getAmount(),
                eBankClearanceDetailDao.getPostingDate(),
                eBankClearanceDetailDao.getChequeNumber(),
                eBankClearanceDetailDao.getChequeDate(),
                eBankClearanceDetailDao.getClearanceDate(),
                eBankClearanceDetailDao.getParent(),
                eBankClearanceDetailDao.getParentField(),
                eBankClearanceDetailDao.getParentType());
    }

    public static void fromDTO(BankClearanceDetailDto vBankClearanceDetailDto, BankClearanceDetailDao eBankClearanceDetailDao) {
        eBankClearanceDetailDao.setName(vBankClearanceDetailDto.name());
        eBankClearanceDetailDao.setCreation(vBankClearanceDetailDto.creation());
        eBankClearanceDetailDao.setModified(vBankClearanceDetailDto.modified());
        eBankClearanceDetailDao.setModifiedBy(vBankClearanceDetailDto.modifiedBy());
        eBankClearanceDetailDao.setOwner(vBankClearanceDetailDto.owner());
        eBankClearanceDetailDao.setIsDocStatus(vBankClearanceDetailDto.isDocStatus());
        eBankClearanceDetailDao.setIdx(vBankClearanceDetailDto.idx());
        eBankClearanceDetailDao.setPaymentDocument(vBankClearanceDetailDto.paymentDocument());
        eBankClearanceDetailDao.setPaymentEntry(vBankClearanceDetailDto.paymentEntry());
        eBankClearanceDetailDao.setAgainstAccount(vBankClearanceDetailDto.againstAccount());
        eBankClearanceDetailDao.setAmount(vBankClearanceDetailDto.amount());
        eBankClearanceDetailDao.setPostingDate(vBankClearanceDetailDto.postingDate());
        eBankClearanceDetailDao.setChequeNumber(vBankClearanceDetailDto.chequeNumber());
        eBankClearanceDetailDao.setChequeDate(vBankClearanceDetailDto.chequeDate());
        eBankClearanceDetailDao.setClearanceDate(vBankClearanceDetailDto.clearanceDate());
        eBankClearanceDetailDao.setParent(vBankClearanceDetailDto.parent());
        eBankClearanceDetailDao.setParentField(vBankClearanceDetailDto.parentField());
        eBankClearanceDetailDao.setParentType(vBankClearanceDetailDto.parentType());
    }
}