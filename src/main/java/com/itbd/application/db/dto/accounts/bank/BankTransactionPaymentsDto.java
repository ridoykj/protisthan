package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankTransactionPaymentsDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BankTransactionPaymentsDto(
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
        BigDecimal allocatedAmount,
        LocalDate clearanceDate,
        String parent,
        String parentField,
        String parentType
) {
    public static BankTransactionPaymentsDto fromEntity(BankTransactionPaymentsDao eBankTransactionPaymentsDao) {
        return new BankTransactionPaymentsDto(
                eBankTransactionPaymentsDao.getName(),
                eBankTransactionPaymentsDao.getCreation(),
                eBankTransactionPaymentsDao.getModified(),
                eBankTransactionPaymentsDao.getModifiedBy(),
                eBankTransactionPaymentsDao.getOwner(),
                eBankTransactionPaymentsDao.getIsDocStatus(),
                eBankTransactionPaymentsDao.getIdx(),
                eBankTransactionPaymentsDao.getPaymentDocument(),
                eBankTransactionPaymentsDao.getPaymentEntry(),
                eBankTransactionPaymentsDao.getAllocatedAmount(),
                eBankTransactionPaymentsDao.getClearanceDate(),
                eBankTransactionPaymentsDao.getParent(),
                eBankTransactionPaymentsDao.getParentField(),
                eBankTransactionPaymentsDao.getParentType());
    }

    public static void fromDTO(BankTransactionPaymentsDto vBankTransactionPaymentsDto, BankTransactionPaymentsDao eBankTransactionPaymentsDao) {
        eBankTransactionPaymentsDao.setName(vBankTransactionPaymentsDto.name());
        eBankTransactionPaymentsDao.setCreation(vBankTransactionPaymentsDto.creation());
        eBankTransactionPaymentsDao.setModified(vBankTransactionPaymentsDto.modified());
        eBankTransactionPaymentsDao.setModifiedBy(vBankTransactionPaymentsDto.modifiedBy());
        eBankTransactionPaymentsDao.setOwner(vBankTransactionPaymentsDto.owner());
        eBankTransactionPaymentsDao.setIsDocStatus(vBankTransactionPaymentsDto.isDocStatus());
        eBankTransactionPaymentsDao.setIdx(vBankTransactionPaymentsDto.idx());
        eBankTransactionPaymentsDao.setPaymentDocument(vBankTransactionPaymentsDto.paymentDocument());
        eBankTransactionPaymentsDao.setPaymentEntry(vBankTransactionPaymentsDto.paymentEntry());
        eBankTransactionPaymentsDao.setAllocatedAmount(vBankTransactionPaymentsDto.allocatedAmount());
        eBankTransactionPaymentsDao.setClearanceDate(vBankTransactionPaymentsDto.clearanceDate());
        eBankTransactionPaymentsDao.setParent(vBankTransactionPaymentsDto.parent());
        eBankTransactionPaymentsDao.setParentField(vBankTransactionPaymentsDto.parentField());
        eBankTransactionPaymentsDao.setParentType(vBankTransactionPaymentsDto.parentType());
    }
}