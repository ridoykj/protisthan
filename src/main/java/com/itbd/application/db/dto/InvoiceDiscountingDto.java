package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.InvoiceDiscountingDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record InvoiceDiscountingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate postingDate,
        LocalDate loanStartDate,
        Integer loanPeriod,
        LocalDate loanEndDate,
        String status,
        String company,
        BigDecimal totalAmount,
        BigDecimal bankCharges,
        String shortTermLoan,
        String bankAccount,
        String bankChargesAccount,
        String accountsReceivableCredit,
        String accountsReceivableDiscounted,
        String accountsReceivableUnpaid,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static InvoiceDiscountingDto fromEntity(InvoiceDiscountingDao eInvoiceDiscountingDao) {
        return new InvoiceDiscountingDto(
                eInvoiceDiscountingDao.getName(),
                eInvoiceDiscountingDao.getCreation(),
                eInvoiceDiscountingDao.getModified(),
                eInvoiceDiscountingDao.getModifiedBy(),
                eInvoiceDiscountingDao.getOwner(),
                eInvoiceDiscountingDao.getIsDocStatus(),
                eInvoiceDiscountingDao.getIdx(),
                eInvoiceDiscountingDao.getPostingDate(),
                eInvoiceDiscountingDao.getLoanStartDate(),
                eInvoiceDiscountingDao.getLoanPeriod(),
                eInvoiceDiscountingDao.getLoanEndDate(),
                eInvoiceDiscountingDao.getStatus(),
                eInvoiceDiscountingDao.getCompany(),
                eInvoiceDiscountingDao.getTotalAmount(),
                eInvoiceDiscountingDao.getBankCharges(),
                eInvoiceDiscountingDao.getShortTermLoan(),
                eInvoiceDiscountingDao.getBankAccount(),
                eInvoiceDiscountingDao.getBankChargesAccount(),
                eInvoiceDiscountingDao.getAccountsReceivableCredit(),
                eInvoiceDiscountingDao.getAccountsReceivableDiscounted(),
                eInvoiceDiscountingDao.getAccountsReceivableUnpaid(),
                eInvoiceDiscountingDao.getAmendedFrom(),
                eInvoiceDiscountingDao.getUserTags(),
                eInvoiceDiscountingDao.getComments(),
                eInvoiceDiscountingDao.getAssign(),
                eInvoiceDiscountingDao.getLikedBy());
    }

    public static void fromDTO(InvoiceDiscountingDto vInvoiceDiscountingDto, InvoiceDiscountingDao eInvoiceDiscountingDao) {
        eInvoiceDiscountingDao.setName(vInvoiceDiscountingDto.name());
        eInvoiceDiscountingDao.setCreation(vInvoiceDiscountingDto.creation());
        eInvoiceDiscountingDao.setModified(vInvoiceDiscountingDto.modified());
        eInvoiceDiscountingDao.setModifiedBy(vInvoiceDiscountingDto.modifiedBy());
        eInvoiceDiscountingDao.setOwner(vInvoiceDiscountingDto.owner());
        eInvoiceDiscountingDao.setIsDocStatus(vInvoiceDiscountingDto.isDocStatus());
        eInvoiceDiscountingDao.setIdx(vInvoiceDiscountingDto.idx());
        eInvoiceDiscountingDao.setPostingDate(vInvoiceDiscountingDto.postingDate());
        eInvoiceDiscountingDao.setLoanStartDate(vInvoiceDiscountingDto.loanStartDate());
        eInvoiceDiscountingDao.setLoanPeriod(vInvoiceDiscountingDto.loanPeriod());
        eInvoiceDiscountingDao.setLoanEndDate(vInvoiceDiscountingDto.loanEndDate());
        eInvoiceDiscountingDao.setStatus(vInvoiceDiscountingDto.status());
        eInvoiceDiscountingDao.setCompany(vInvoiceDiscountingDto.company());
        eInvoiceDiscountingDao.setTotalAmount(vInvoiceDiscountingDto.totalAmount());
        eInvoiceDiscountingDao.setBankCharges(vInvoiceDiscountingDto.bankCharges());
        eInvoiceDiscountingDao.setShortTermLoan(vInvoiceDiscountingDto.shortTermLoan());
        eInvoiceDiscountingDao.setBankAccount(vInvoiceDiscountingDto.bankAccount());
        eInvoiceDiscountingDao.setBankChargesAccount(vInvoiceDiscountingDto.bankChargesAccount());
        eInvoiceDiscountingDao.setAccountsReceivableCredit(vInvoiceDiscountingDto.accountsReceivableCredit());
        eInvoiceDiscountingDao.setAccountsReceivableDiscounted(vInvoiceDiscountingDto.accountsReceivableDiscounted());
        eInvoiceDiscountingDao.setAccountsReceivableUnpaid(vInvoiceDiscountingDto.accountsReceivableUnpaid());
        eInvoiceDiscountingDao.setAmendedFrom(vInvoiceDiscountingDto.amendedFrom());
        eInvoiceDiscountingDao.setUserTags(vInvoiceDiscountingDto.userTags());
        eInvoiceDiscountingDao.setComments(vInvoiceDiscountingDto.comments());
        eInvoiceDiscountingDao.setAssign(vInvoiceDiscountingDto.assign());
        eInvoiceDiscountingDao.setLikedBy(vInvoiceDiscountingDto.likedBy());
    }
}