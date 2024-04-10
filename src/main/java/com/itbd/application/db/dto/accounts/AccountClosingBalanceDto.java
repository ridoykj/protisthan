package com.itbd.application.db.dto.accounts;

import com.itbd.application.db.dao.accounts.AccountClosingBalanceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record AccountClosingBalanceDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate closingDate,
        String account,
        String costCenter,
        BigDecimal debit,
        BigDecimal credit,
        String accountCurrency,
        BigDecimal debitInAccountCurrency,
        BigDecimal creditInAccountCurrency,
        String project,
        String company,
        String financeBook,
        String periodClosingVoucher,
        Boolean isPeriodClosingVoucherEntry,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AccountClosingBalanceDto fromEntity(AccountClosingBalanceDao eAccountClosingBalanceDao) {
        return new AccountClosingBalanceDto(
                eAccountClosingBalanceDao.getName(),
                eAccountClosingBalanceDao.getCreation(),
                eAccountClosingBalanceDao.getModified(),
                eAccountClosingBalanceDao.getModifiedBy(),
                eAccountClosingBalanceDao.getOwner(),
                eAccountClosingBalanceDao.getIsDocStatus(),
                eAccountClosingBalanceDao.getIdx(),
                eAccountClosingBalanceDao.getClosingDate(),
                eAccountClosingBalanceDao.getAccount(),
                eAccountClosingBalanceDao.getCostCenter(),
                eAccountClosingBalanceDao.getDebit(),
                eAccountClosingBalanceDao.getCredit(),
                eAccountClosingBalanceDao.getAccountCurrency(),
                eAccountClosingBalanceDao.getDebitInAccountCurrency(),
                eAccountClosingBalanceDao.getCreditInAccountCurrency(),
                eAccountClosingBalanceDao.getProject(),
                eAccountClosingBalanceDao.getCompany(),
                eAccountClosingBalanceDao.getFinanceBook(),
                eAccountClosingBalanceDao.getPeriodClosingVoucher(),
                eAccountClosingBalanceDao.getIsPeriodClosingVoucherEntry(),
                eAccountClosingBalanceDao.getUserTags(),
                eAccountClosingBalanceDao.getComments(),
                eAccountClosingBalanceDao.getAssign(),
                eAccountClosingBalanceDao.getLikedBy());
    }

    public static void fromDTO(AccountClosingBalanceDto vAccountClosingBalanceDto, AccountClosingBalanceDao eAccountClosingBalanceDao) {
        eAccountClosingBalanceDao.setName(vAccountClosingBalanceDto.name());
        eAccountClosingBalanceDao.setCreation(vAccountClosingBalanceDto.creation());
        eAccountClosingBalanceDao.setModified(vAccountClosingBalanceDto.modified());
        eAccountClosingBalanceDao.setModifiedBy(vAccountClosingBalanceDto.modifiedBy());
        eAccountClosingBalanceDao.setOwner(vAccountClosingBalanceDto.owner());
        eAccountClosingBalanceDao.setIsDocStatus(vAccountClosingBalanceDto.isDocStatus());
        eAccountClosingBalanceDao.setIdx(vAccountClosingBalanceDto.idx());
        eAccountClosingBalanceDao.setClosingDate(vAccountClosingBalanceDto.closingDate());
        eAccountClosingBalanceDao.setAccount(vAccountClosingBalanceDto.account());
        eAccountClosingBalanceDao.setCostCenter(vAccountClosingBalanceDto.costCenter());
        eAccountClosingBalanceDao.setDebit(vAccountClosingBalanceDto.debit());
        eAccountClosingBalanceDao.setCredit(vAccountClosingBalanceDto.credit());
        eAccountClosingBalanceDao.setAccountCurrency(vAccountClosingBalanceDto.accountCurrency());
        eAccountClosingBalanceDao.setDebitInAccountCurrency(vAccountClosingBalanceDto.debitInAccountCurrency());
        eAccountClosingBalanceDao.setCreditInAccountCurrency(vAccountClosingBalanceDto.creditInAccountCurrency());
        eAccountClosingBalanceDao.setProject(vAccountClosingBalanceDto.project());
        eAccountClosingBalanceDao.setCompany(vAccountClosingBalanceDto.company());
        eAccountClosingBalanceDao.setFinanceBook(vAccountClosingBalanceDto.financeBook());
        eAccountClosingBalanceDao.setPeriodClosingVoucher(vAccountClosingBalanceDto.periodClosingVoucher());
        eAccountClosingBalanceDao.setIsPeriodClosingVoucherEntry(vAccountClosingBalanceDto.isPeriodClosingVoucherEntry());
        eAccountClosingBalanceDao.setUserTags(vAccountClosingBalanceDto.userTags());
        eAccountClosingBalanceDao.setComments(vAccountClosingBalanceDto.comments());
        eAccountClosingBalanceDao.setAssign(vAccountClosingBalanceDto.assign());
        eAccountClosingBalanceDao.setLikedBy(vAccountClosingBalanceDto.likedBy());
    }
}