package com.itbd.application.db.dto.journals;

import com.itbd.application.db.dao.accounts.journal.JournalEntryAccountDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record JournalEntryAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String accountType,
        String bankAccount,
        String partyType,
        String party,
        String costCenter,
        String project,
        String accountCurrency,
        BigDecimal exchangeRate,
        BigDecimal debitInAccountCurrency,
        BigDecimal debit,
        BigDecimal creditInAccountCurrency,
        BigDecimal credit,
        String referenceType,
        String referenceName,
        LocalDate referenceDueDate,
        String referenceDetailNo,
        String isAdvance,
        String userRemark,
        String againstAccount,
        String parent,
        String parentField,
        String parentType
) {
    public static JournalEntryAccountDto fromEntity(JournalEntryAccountDao eJournalEntryAccountDao) {
        return new JournalEntryAccountDto(
                eJournalEntryAccountDao.getName(),
                eJournalEntryAccountDao.getCreation(),
                eJournalEntryAccountDao.getModified(),
                eJournalEntryAccountDao.getModifiedBy(),
                eJournalEntryAccountDao.getOwner(),
                eJournalEntryAccountDao.getIsDocStatus(),
                eJournalEntryAccountDao.getIdx(),
                eJournalEntryAccountDao.getAccount(),
                eJournalEntryAccountDao.getAccountType(),
                eJournalEntryAccountDao.getBankAccount(),
                eJournalEntryAccountDao.getPartyType(),
                eJournalEntryAccountDao.getParty(),
                eJournalEntryAccountDao.getCostCenter(),
                eJournalEntryAccountDao.getProject(),
                eJournalEntryAccountDao.getAccountCurrency(),
                eJournalEntryAccountDao.getExchangeRate(),
                eJournalEntryAccountDao.getDebitInAccountCurrency(),
                eJournalEntryAccountDao.getDebit(),
                eJournalEntryAccountDao.getCreditInAccountCurrency(),
                eJournalEntryAccountDao.getCredit(),
                eJournalEntryAccountDao.getReferenceType(),
                eJournalEntryAccountDao.getReferenceName(),
                eJournalEntryAccountDao.getReferenceDueDate(),
                eJournalEntryAccountDao.getReferenceDetailNo(),
                eJournalEntryAccountDao.getIsAdvance(),
                eJournalEntryAccountDao.getUserRemark(),
                eJournalEntryAccountDao.getAgainstAccount(),
                eJournalEntryAccountDao.getParent(),
                eJournalEntryAccountDao.getParentField(),
                eJournalEntryAccountDao.getParentType());
    }

    public static void fromDTO(JournalEntryAccountDto vJournalEntryAccountDto, JournalEntryAccountDao eJournalEntryAccountDao) {
        eJournalEntryAccountDao.setName(vJournalEntryAccountDto.name());
        eJournalEntryAccountDao.setCreation(vJournalEntryAccountDto.creation());
        eJournalEntryAccountDao.setModified(vJournalEntryAccountDto.modified());
        eJournalEntryAccountDao.setModifiedBy(vJournalEntryAccountDto.modifiedBy());
        eJournalEntryAccountDao.setOwner(vJournalEntryAccountDto.owner());
        eJournalEntryAccountDao.setIsDocStatus(vJournalEntryAccountDto.isDocStatus());
        eJournalEntryAccountDao.setIdx(vJournalEntryAccountDto.idx());
        eJournalEntryAccountDao.setAccount(vJournalEntryAccountDto.account());
        eJournalEntryAccountDao.setAccountType(vJournalEntryAccountDto.accountType());
        eJournalEntryAccountDao.setBankAccount(vJournalEntryAccountDto.bankAccount());
        eJournalEntryAccountDao.setPartyType(vJournalEntryAccountDto.partyType());
        eJournalEntryAccountDao.setParty(vJournalEntryAccountDto.party());
        eJournalEntryAccountDao.setCostCenter(vJournalEntryAccountDto.costCenter());
        eJournalEntryAccountDao.setProject(vJournalEntryAccountDto.project());
        eJournalEntryAccountDao.setAccountCurrency(vJournalEntryAccountDto.accountCurrency());
        eJournalEntryAccountDao.setExchangeRate(vJournalEntryAccountDto.exchangeRate());
        eJournalEntryAccountDao.setDebitInAccountCurrency(vJournalEntryAccountDto.debitInAccountCurrency());
        eJournalEntryAccountDao.setDebit(vJournalEntryAccountDto.debit());
        eJournalEntryAccountDao.setCreditInAccountCurrency(vJournalEntryAccountDto.creditInAccountCurrency());
        eJournalEntryAccountDao.setCredit(vJournalEntryAccountDto.credit());
        eJournalEntryAccountDao.setReferenceType(vJournalEntryAccountDto.referenceType());
        eJournalEntryAccountDao.setReferenceName(vJournalEntryAccountDto.referenceName());
        eJournalEntryAccountDao.setReferenceDueDate(vJournalEntryAccountDto.referenceDueDate());
        eJournalEntryAccountDao.setReferenceDetailNo(vJournalEntryAccountDto.referenceDetailNo());
        eJournalEntryAccountDao.setIsAdvance(vJournalEntryAccountDto.isAdvance());
        eJournalEntryAccountDao.setUserRemark(vJournalEntryAccountDto.userRemark());
        eJournalEntryAccountDao.setAgainstAccount(vJournalEntryAccountDto.againstAccount());
        eJournalEntryAccountDao.setParent(vJournalEntryAccountDto.parent());
        eJournalEntryAccountDao.setParentField(vJournalEntryAccountDto.parentField());
        eJournalEntryAccountDao.setParentType(vJournalEntryAccountDto.parentType());
    }
}