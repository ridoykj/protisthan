package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentLedgerEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PaymentLedgerEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate postingDate,
        String company,
        String accountType,
        String account,
        String partyType,
        String party,
        LocalDate dueDate,
        String voucherDetailNo,
        String costCenter,
        String financeBook,
        String voucherType,
        String voucherNo,
        String againstVoucherType,
        String againstVoucherNo,
        BigDecimal amount,
        String accountCurrency,
        BigDecimal amountInAccountCurrency,
        Boolean deLinked,
        String remarks,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentLedgerEntryDto fromEntity(PaymentLedgerEntryDao ePaymentLedgerEntryDao) {
        return new PaymentLedgerEntryDto(
                ePaymentLedgerEntryDao.getName(),
                ePaymentLedgerEntryDao.getCreation(),
                ePaymentLedgerEntryDao.getModified(),
                ePaymentLedgerEntryDao.getModifiedBy(),
                ePaymentLedgerEntryDao.getOwner(),
                ePaymentLedgerEntryDao.getIsDocStatus(),
                ePaymentLedgerEntryDao.getIdx(),
                ePaymentLedgerEntryDao.getPostingDate(),
                ePaymentLedgerEntryDao.getCompany(),
                ePaymentLedgerEntryDao.getAccountType(),
                ePaymentLedgerEntryDao.getAccount(),
                ePaymentLedgerEntryDao.getPartyType(),
                ePaymentLedgerEntryDao.getParty(),
                ePaymentLedgerEntryDao.getDueDate(),
                ePaymentLedgerEntryDao.getVoucherDetailNo(),
                ePaymentLedgerEntryDao.getCostCenter(),
                ePaymentLedgerEntryDao.getFinanceBook(),
                ePaymentLedgerEntryDao.getVoucherType(),
                ePaymentLedgerEntryDao.getVoucherNo(),
                ePaymentLedgerEntryDao.getAgainstVoucherType(),
                ePaymentLedgerEntryDao.getAgainstVoucherNo(),
                ePaymentLedgerEntryDao.getAmount(),
                ePaymentLedgerEntryDao.getAccountCurrency(),
                ePaymentLedgerEntryDao.getAmountInAccountCurrency(),
                ePaymentLedgerEntryDao.getDeLinked(),
                ePaymentLedgerEntryDao.getRemarks(),
                ePaymentLedgerEntryDao.getUserTags(),
                ePaymentLedgerEntryDao.getComments(),
                ePaymentLedgerEntryDao.getAssign(),
                ePaymentLedgerEntryDao.getLikedBy());
    }

    public static void fromDTO(PaymentLedgerEntryDto vPaymentLedgerEntryDto, PaymentLedgerEntryDao ePaymentLedgerEntryDao) {
        ePaymentLedgerEntryDao.setName(vPaymentLedgerEntryDto.name());
        ePaymentLedgerEntryDao.setCreation(vPaymentLedgerEntryDto.creation());
        ePaymentLedgerEntryDao.setModified(vPaymentLedgerEntryDto.modified());
        ePaymentLedgerEntryDao.setModifiedBy(vPaymentLedgerEntryDto.modifiedBy());
        ePaymentLedgerEntryDao.setOwner(vPaymentLedgerEntryDto.owner());
        ePaymentLedgerEntryDao.setIsDocStatus(vPaymentLedgerEntryDto.isDocStatus());
        ePaymentLedgerEntryDao.setIdx(vPaymentLedgerEntryDto.idx());
        ePaymentLedgerEntryDao.setPostingDate(vPaymentLedgerEntryDto.postingDate());
        ePaymentLedgerEntryDao.setCompany(vPaymentLedgerEntryDto.company());
        ePaymentLedgerEntryDao.setAccountType(vPaymentLedgerEntryDto.accountType());
        ePaymentLedgerEntryDao.setAccount(vPaymentLedgerEntryDto.account());
        ePaymentLedgerEntryDao.setPartyType(vPaymentLedgerEntryDto.partyType());
        ePaymentLedgerEntryDao.setParty(vPaymentLedgerEntryDto.party());
        ePaymentLedgerEntryDao.setDueDate(vPaymentLedgerEntryDto.dueDate());
        ePaymentLedgerEntryDao.setVoucherDetailNo(vPaymentLedgerEntryDto.voucherDetailNo());
        ePaymentLedgerEntryDao.setCostCenter(vPaymentLedgerEntryDto.costCenter());
        ePaymentLedgerEntryDao.setFinanceBook(vPaymentLedgerEntryDto.financeBook());
        ePaymentLedgerEntryDao.setVoucherType(vPaymentLedgerEntryDto.voucherType());
        ePaymentLedgerEntryDao.setVoucherNo(vPaymentLedgerEntryDto.voucherNo());
        ePaymentLedgerEntryDao.setAgainstVoucherType(vPaymentLedgerEntryDto.againstVoucherType());
        ePaymentLedgerEntryDao.setAgainstVoucherNo(vPaymentLedgerEntryDto.againstVoucherNo());
        ePaymentLedgerEntryDao.setAmount(vPaymentLedgerEntryDto.amount());
        ePaymentLedgerEntryDao.setAccountCurrency(vPaymentLedgerEntryDto.accountCurrency());
        ePaymentLedgerEntryDao.setAmountInAccountCurrency(vPaymentLedgerEntryDto.amountInAccountCurrency());
        ePaymentLedgerEntryDao.setDeLinked(vPaymentLedgerEntryDto.deLinked());
        ePaymentLedgerEntryDao.setRemarks(vPaymentLedgerEntryDto.remarks());
        ePaymentLedgerEntryDao.setUserTags(vPaymentLedgerEntryDto.userTags());
        ePaymentLedgerEntryDao.setComments(vPaymentLedgerEntryDto.comments());
        ePaymentLedgerEntryDao.setAssign(vPaymentLedgerEntryDto.assign());
        ePaymentLedgerEntryDao.setLikedBy(vPaymentLedgerEntryDto.likedBy());
    }
}