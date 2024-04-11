package com.itbd.application.db.dto.journals;

import com.itbd.application.db.dao.journals.JournalEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record JournalEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isSystemGenerated,
        String title,
        String voucherType,
        String namingSeries,
        String financeBook,
        String processDeferredAccounting,
        String reversalOf,
        String taxWithholdingCategory,
        String fromTemplate,
        String company,
        LocalDate postingDate,
        Boolean applyTds,
        String chequeNo,
        LocalDate chequeDate,
        String userRemark,
        BigDecimal totalDebit,
        BigDecimal totalCredit,
        BigDecimal difference,
        Boolean multiCurrency,
        String totalAmountCurrency,
        BigDecimal totalAmount,
        String totalAmountInWords,
        LocalDate clearanceDate,
        String remark,
        String paidLoan,
        String interCompanyJournalEntryReference,
        String billNo,
        LocalDate billDate,
        LocalDate dueDate,
        String writeOffBasedOn,
        BigDecimal writeOffAmount,
        String payToRecdFrom,
        String letterHead,
        String selectPrintHeading,
        String modeOfPayment,
        String paymentOrder,
        String isOpening,
        String stockEntry,
        String autoRepeat,
        String amendedFrom,
        Boolean repostRequired,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static JournalEntryDto fromEntity(JournalEntryDao eJournalEntryDao) {
        return new JournalEntryDto(
                eJournalEntryDao.getName(),
                eJournalEntryDao.getCreation(),
                eJournalEntryDao.getModified(),
                eJournalEntryDao.getModifiedBy(),
                eJournalEntryDao.getOwner(),
                eJournalEntryDao.getIsDocStatus(),
                eJournalEntryDao.getIdx(),
                eJournalEntryDao.getIsSystemGenerated(),
                eJournalEntryDao.getTitle(),
                eJournalEntryDao.getVoucherType(),
                eJournalEntryDao.getNamingSeries(),
                eJournalEntryDao.getFinanceBook(),
                eJournalEntryDao.getProcessDeferredAccounting(),
                eJournalEntryDao.getReversalOf(),
                eJournalEntryDao.getTaxWithholdingCategory(),
                eJournalEntryDao.getFromTemplate(),
                eJournalEntryDao.getCompany(),
                eJournalEntryDao.getPostingDate(),
                eJournalEntryDao.getApplyTds(),
                eJournalEntryDao.getChequeNo(),
                eJournalEntryDao.getChequeDate(),
                eJournalEntryDao.getUserRemark(),
                eJournalEntryDao.getTotalDebit(),
                eJournalEntryDao.getTotalCredit(),
                eJournalEntryDao.getDifference(),
                eJournalEntryDao.getMultiCurrency(),
                eJournalEntryDao.getTotalAmountCurrency(),
                eJournalEntryDao.getTotalAmount(),
                eJournalEntryDao.getTotalAmountInWords(),
                eJournalEntryDao.getClearanceDate(),
                eJournalEntryDao.getRemark(),
                eJournalEntryDao.getPaidLoan(),
                eJournalEntryDao.getInterCompanyJournalEntryReference(),
                eJournalEntryDao.getBillNo(),
                eJournalEntryDao.getBillDate(),
                eJournalEntryDao.getDueDate(),
                eJournalEntryDao.getWriteOffBasedOn(),
                eJournalEntryDao.getWriteOffAmount(),
                eJournalEntryDao.getPayToRecdFrom(),
                eJournalEntryDao.getLetterHead(),
                eJournalEntryDao.getSelectPrintHeading(),
                eJournalEntryDao.getModeOfPayment(),
                eJournalEntryDao.getPaymentOrder(),
                eJournalEntryDao.getIsOpening(),
                eJournalEntryDao.getStockEntry(),
                eJournalEntryDao.getAutoRepeat(),
                eJournalEntryDao.getAmendedFrom(),
                eJournalEntryDao.getRepostRequired(),
                eJournalEntryDao.getUserTags(),
                eJournalEntryDao.getComments(),
                eJournalEntryDao.getAssign(),
                eJournalEntryDao.getLikedBy());
    }

    public static void fromDTO(JournalEntryDto vJournalEntryDto, JournalEntryDao eJournalEntryDao) {
        eJournalEntryDao.setName(vJournalEntryDto.name());
        eJournalEntryDao.setCreation(vJournalEntryDto.creation());
        eJournalEntryDao.setModified(vJournalEntryDto.modified());
        eJournalEntryDao.setModifiedBy(vJournalEntryDto.modifiedBy());
        eJournalEntryDao.setOwner(vJournalEntryDto.owner());
        eJournalEntryDao.setIsDocStatus(vJournalEntryDto.isDocStatus());
        eJournalEntryDao.setIdx(vJournalEntryDto.idx());
        eJournalEntryDao.setIsSystemGenerated(vJournalEntryDto.isSystemGenerated());
        eJournalEntryDao.setTitle(vJournalEntryDto.title());
        eJournalEntryDao.setVoucherType(vJournalEntryDto.voucherType());
        eJournalEntryDao.setNamingSeries(vJournalEntryDto.namingSeries());
        eJournalEntryDao.setFinanceBook(vJournalEntryDto.financeBook());
        eJournalEntryDao.setProcessDeferredAccounting(vJournalEntryDto.processDeferredAccounting());
        eJournalEntryDao.setReversalOf(vJournalEntryDto.reversalOf());
        eJournalEntryDao.setTaxWithholdingCategory(vJournalEntryDto.taxWithholdingCategory());
        eJournalEntryDao.setFromTemplate(vJournalEntryDto.fromTemplate());
        eJournalEntryDao.setCompany(vJournalEntryDto.company());
        eJournalEntryDao.setPostingDate(vJournalEntryDto.postingDate());
        eJournalEntryDao.setApplyTds(vJournalEntryDto.applyTds());
        eJournalEntryDao.setChequeNo(vJournalEntryDto.chequeNo());
        eJournalEntryDao.setChequeDate(vJournalEntryDto.chequeDate());
        eJournalEntryDao.setUserRemark(vJournalEntryDto.userRemark());
        eJournalEntryDao.setTotalDebit(vJournalEntryDto.totalDebit());
        eJournalEntryDao.setTotalCredit(vJournalEntryDto.totalCredit());
        eJournalEntryDao.setDifference(vJournalEntryDto.difference());
        eJournalEntryDao.setMultiCurrency(vJournalEntryDto.multiCurrency());
        eJournalEntryDao.setTotalAmountCurrency(vJournalEntryDto.totalAmountCurrency());
        eJournalEntryDao.setTotalAmount(vJournalEntryDto.totalAmount());
        eJournalEntryDao.setTotalAmountInWords(vJournalEntryDto.totalAmountInWords());
        eJournalEntryDao.setClearanceDate(vJournalEntryDto.clearanceDate());
        eJournalEntryDao.setRemark(vJournalEntryDto.remark());
        eJournalEntryDao.setPaidLoan(vJournalEntryDto.paidLoan());
        eJournalEntryDao.setInterCompanyJournalEntryReference(vJournalEntryDto.interCompanyJournalEntryReference());
        eJournalEntryDao.setBillNo(vJournalEntryDto.billNo());
        eJournalEntryDao.setBillDate(vJournalEntryDto.billDate());
        eJournalEntryDao.setDueDate(vJournalEntryDto.dueDate());
        eJournalEntryDao.setWriteOffBasedOn(vJournalEntryDto.writeOffBasedOn());
        eJournalEntryDao.setWriteOffAmount(vJournalEntryDto.writeOffAmount());
        eJournalEntryDao.setPayToRecdFrom(vJournalEntryDto.payToRecdFrom());
        eJournalEntryDao.setLetterHead(vJournalEntryDto.letterHead());
        eJournalEntryDao.setSelectPrintHeading(vJournalEntryDto.selectPrintHeading());
        eJournalEntryDao.setModeOfPayment(vJournalEntryDto.modeOfPayment());
        eJournalEntryDao.setPaymentOrder(vJournalEntryDto.paymentOrder());
        eJournalEntryDao.setIsOpening(vJournalEntryDto.isOpening());
        eJournalEntryDao.setStockEntry(vJournalEntryDto.stockEntry());
        eJournalEntryDao.setAutoRepeat(vJournalEntryDto.autoRepeat());
        eJournalEntryDao.setAmendedFrom(vJournalEntryDto.amendedFrom());
        eJournalEntryDao.setRepostRequired(vJournalEntryDto.repostRequired());
        eJournalEntryDao.setUserTags(vJournalEntryDto.userTags());
        eJournalEntryDao.setComments(vJournalEntryDto.comments());
        eJournalEntryDao.setAssign(vJournalEntryDto.assign());
        eJournalEntryDao.setLikedBy(vJournalEntryDto.likedBy());
    }
}