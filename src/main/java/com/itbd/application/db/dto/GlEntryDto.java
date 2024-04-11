package com.itbd.application.db.dto;

import com.itbd.application.db.dao.GlEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record GlEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate postingDate,
        LocalDate transactionDate,
        String account,
        String partyType,
        String party,
        String costCenter,
        BigDecimal debit,
        BigDecimal credit,
        String accountCurrency,
        BigDecimal debitInAccountCurrency,
        BigDecimal creditInAccountCurrency,
        String against,
        String againstVoucherType,
        String againstVoucher,
        String voucherType,
        String voucherSubtype,
        String voucherNo,
        String voucherDetailNo,
        String project,
        String remarks,
        String isOpening,
        String isAdvance,
        String fiscalYear,
        String company,
        String financeBook,
        Boolean toRename,
        LocalDate dueDate,
        Boolean isCancelled,
        String transactionCurrency,
        BigDecimal debitInTransactionCurrency,
        BigDecimal creditInTransactionCurrency,
        BigDecimal transactionExchangeRate,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static GlEntryDto fromEntity(GlEntryDao eGlEntryDao) {
        return new GlEntryDto(
                eGlEntryDao.getName(),
                eGlEntryDao.getCreation(),
                eGlEntryDao.getModified(),
                eGlEntryDao.getModifiedBy(),
                eGlEntryDao.getOwner(),
                eGlEntryDao.getIsDocStatus(),
                eGlEntryDao.getIdx(),
                eGlEntryDao.getPostingDate(),
                eGlEntryDao.getTransactionDate(),
                eGlEntryDao.getAccount(),
                eGlEntryDao.getPartyType(),
                eGlEntryDao.getParty(),
                eGlEntryDao.getCostCenter(),
                eGlEntryDao.getDebit(),
                eGlEntryDao.getCredit(),
                eGlEntryDao.getAccountCurrency(),
                eGlEntryDao.getDebitInAccountCurrency(),
                eGlEntryDao.getCreditInAccountCurrency(),
                eGlEntryDao.getAgainst(),
                eGlEntryDao.getAgainstVoucherType(),
                eGlEntryDao.getAgainstVoucher(),
                eGlEntryDao.getVoucherType(),
                eGlEntryDao.getVoucherSubtype(),
                eGlEntryDao.getVoucherNo(),
                eGlEntryDao.getVoucherDetailNo(),
                eGlEntryDao.getProject(),
                eGlEntryDao.getRemarks(),
                eGlEntryDao.getIsOpening(),
                eGlEntryDao.getIsAdvance(),
                eGlEntryDao.getFiscalYear(),
                eGlEntryDao.getCompany(),
                eGlEntryDao.getFinanceBook(),
                eGlEntryDao.getToRename(),
                eGlEntryDao.getDueDate(),
                eGlEntryDao.getIsCancelled(),
                eGlEntryDao.getTransactionCurrency(),
                eGlEntryDao.getDebitInTransactionCurrency(),
                eGlEntryDao.getCreditInTransactionCurrency(),
                eGlEntryDao.getTransactionExchangeRate(),
                eGlEntryDao.getUserTags(),
                eGlEntryDao.getComments(),
                eGlEntryDao.getAssign(),
                eGlEntryDao.getLikedBy());
    }

    public static void fromDTO(GlEntryDto vGlEntryDto, GlEntryDao eGlEntryDao) {
        eGlEntryDao.setName(vGlEntryDto.name());
        eGlEntryDao.setCreation(vGlEntryDto.creation());
        eGlEntryDao.setModified(vGlEntryDto.modified());
        eGlEntryDao.setModifiedBy(vGlEntryDto.modifiedBy());
        eGlEntryDao.setOwner(vGlEntryDto.owner());
        eGlEntryDao.setIsDocStatus(vGlEntryDto.isDocStatus());
        eGlEntryDao.setIdx(vGlEntryDto.idx());
        eGlEntryDao.setPostingDate(vGlEntryDto.postingDate());
        eGlEntryDao.setTransactionDate(vGlEntryDto.transactionDate());
        eGlEntryDao.setAccount(vGlEntryDto.account());
        eGlEntryDao.setPartyType(vGlEntryDto.partyType());
        eGlEntryDao.setParty(vGlEntryDto.party());
        eGlEntryDao.setCostCenter(vGlEntryDto.costCenter());
        eGlEntryDao.setDebit(vGlEntryDto.debit());
        eGlEntryDao.setCredit(vGlEntryDto.credit());
        eGlEntryDao.setAccountCurrency(vGlEntryDto.accountCurrency());
        eGlEntryDao.setDebitInAccountCurrency(vGlEntryDto.debitInAccountCurrency());
        eGlEntryDao.setCreditInAccountCurrency(vGlEntryDto.creditInAccountCurrency());
        eGlEntryDao.setAgainst(vGlEntryDto.against());
        eGlEntryDao.setAgainstVoucherType(vGlEntryDto.againstVoucherType());
        eGlEntryDao.setAgainstVoucher(vGlEntryDto.againstVoucher());
        eGlEntryDao.setVoucherType(vGlEntryDto.voucherType());
        eGlEntryDao.setVoucherSubtype(vGlEntryDto.voucherSubtype());
        eGlEntryDao.setVoucherNo(vGlEntryDto.voucherNo());
        eGlEntryDao.setVoucherDetailNo(vGlEntryDto.voucherDetailNo());
        eGlEntryDao.setProject(vGlEntryDto.project());
        eGlEntryDao.setRemarks(vGlEntryDto.remarks());
        eGlEntryDao.setIsOpening(vGlEntryDto.isOpening());
        eGlEntryDao.setIsAdvance(vGlEntryDto.isAdvance());
        eGlEntryDao.setFiscalYear(vGlEntryDto.fiscalYear());
        eGlEntryDao.setCompany(vGlEntryDto.company());
        eGlEntryDao.setFinanceBook(vGlEntryDto.financeBook());
        eGlEntryDao.setToRename(vGlEntryDto.toRename());
        eGlEntryDao.setDueDate(vGlEntryDto.dueDate());
        eGlEntryDao.setIsCancelled(vGlEntryDto.isCancelled());
        eGlEntryDao.setTransactionCurrency(vGlEntryDto.transactionCurrency());
        eGlEntryDao.setDebitInTransactionCurrency(vGlEntryDto.debitInTransactionCurrency());
        eGlEntryDao.setCreditInTransactionCurrency(vGlEntryDto.creditInTransactionCurrency());
        eGlEntryDao.setTransactionExchangeRate(vGlEntryDto.transactionExchangeRate());
        eGlEntryDao.setUserTags(vGlEntryDto.userTags());
        eGlEntryDao.setComments(vGlEntryDto.comments());
        eGlEntryDao.setAssign(vGlEntryDto.assign());
        eGlEntryDao.setLikedBy(vGlEntryDto.likedBy());
    }
}