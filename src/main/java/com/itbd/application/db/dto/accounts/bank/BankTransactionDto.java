package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankTransactionDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BankTransactionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        LocalDate date,
        String status,
        String bankAccount,
        String company,
        String amendedFrom,
        BigDecimal deposit,
        BigDecimal withdrawal,
        String currency,
        String description,
        String referenceNumber,
        String transactionId,
        String transactionType,
        BigDecimal allocatedAmount,
        BigDecimal unallocatedAmount,
        String partyType,
        String party,
        String bankPartyName,
        String bankPartyAccountNumber,
        String bankPartyIban,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankTransactionDto fromEntity(BankTransactionDao eBankTransactionDao) {
        return new BankTransactionDto(
                eBankTransactionDao.getName(),
                eBankTransactionDao.getCreation(),
                eBankTransactionDao.getModified(),
                eBankTransactionDao.getModifiedBy(),
                eBankTransactionDao.getOwner(),
                eBankTransactionDao.getIsDocStatus(),
                eBankTransactionDao.getIdx(),
                eBankTransactionDao.getNamingSeries(),
                eBankTransactionDao.getDate(),
                eBankTransactionDao.getStatus(),
                eBankTransactionDao.getBankAccount(),
                eBankTransactionDao.getCompany(),
                eBankTransactionDao.getAmendedFrom(),
                eBankTransactionDao.getDeposit(),
                eBankTransactionDao.getWithdrawal(),
                eBankTransactionDao.getCurrency(),
                eBankTransactionDao.getDescription(),
                eBankTransactionDao.getReferenceNumber(),
                eBankTransactionDao.getTransactionId(),
                eBankTransactionDao.getTransactionType(),
                eBankTransactionDao.getAllocatedAmount(),
                eBankTransactionDao.getUnallocatedAmount(),
                eBankTransactionDao.getPartyType(),
                eBankTransactionDao.getParty(),
                eBankTransactionDao.getBankPartyName(),
                eBankTransactionDao.getBankPartyAccountNumber(),
                eBankTransactionDao.getBankPartyIban(),
                eBankTransactionDao.getUserTags(),
                eBankTransactionDao.getComments(),
                eBankTransactionDao.getAssign(),
                eBankTransactionDao.getLikedBy());
    }

    public static void fromDTO(BankTransactionDto vBankTransactionDto, BankTransactionDao eBankTransactionDao) {
        eBankTransactionDao.setName(vBankTransactionDto.name());
        eBankTransactionDao.setCreation(vBankTransactionDto.creation());
        eBankTransactionDao.setModified(vBankTransactionDto.modified());
        eBankTransactionDao.setModifiedBy(vBankTransactionDto.modifiedBy());
        eBankTransactionDao.setOwner(vBankTransactionDto.owner());
        eBankTransactionDao.setIsDocStatus(vBankTransactionDto.isDocStatus());
        eBankTransactionDao.setIdx(vBankTransactionDto.idx());
        eBankTransactionDao.setNamingSeries(vBankTransactionDto.namingSeries());
        eBankTransactionDao.setDate(vBankTransactionDto.date());
        eBankTransactionDao.setStatus(vBankTransactionDto.status());
        eBankTransactionDao.setBankAccount(vBankTransactionDto.bankAccount());
        eBankTransactionDao.setCompany(vBankTransactionDto.company());
        eBankTransactionDao.setAmendedFrom(vBankTransactionDto.amendedFrom());
        eBankTransactionDao.setDeposit(vBankTransactionDto.deposit());
        eBankTransactionDao.setWithdrawal(vBankTransactionDto.withdrawal());
        eBankTransactionDao.setCurrency(vBankTransactionDto.currency());
        eBankTransactionDao.setDescription(vBankTransactionDto.description());
        eBankTransactionDao.setReferenceNumber(vBankTransactionDto.referenceNumber());
        eBankTransactionDao.setTransactionId(vBankTransactionDto.transactionId());
        eBankTransactionDao.setTransactionType(vBankTransactionDto.transactionType());
        eBankTransactionDao.setAllocatedAmount(vBankTransactionDto.allocatedAmount());
        eBankTransactionDao.setUnallocatedAmount(vBankTransactionDto.unallocatedAmount());
        eBankTransactionDao.setPartyType(vBankTransactionDto.partyType());
        eBankTransactionDao.setParty(vBankTransactionDto.party());
        eBankTransactionDao.setBankPartyName(vBankTransactionDto.bankPartyName());
        eBankTransactionDao.setBankPartyAccountNumber(vBankTransactionDto.bankPartyAccountNumber());
        eBankTransactionDao.setBankPartyIban(vBankTransactionDto.bankPartyIban());
        eBankTransactionDao.setUserTags(vBankTransactionDto.userTags());
        eBankTransactionDao.setComments(vBankTransactionDto.comments());
        eBankTransactionDao.setAssign(vBankTransactionDto.assign());
        eBankTransactionDao.setLikedBy(vBankTransactionDto.likedBy());
    }
}